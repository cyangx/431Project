package pkg431;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.logging.*;

/**
 *
 * @author Garrett
 */
public class AccountingProcedure implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final String FILE_PATH = "./SaveFiles/AccountingProcedure";
    // Date format for file names
    private static final SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyy");
    private static final String REPORT_FILE_PATH = "./Reports/";
    // Singleton Instance
    private static AccountingProcedure accountingProcedure;
    // Timer for automated reporting events
    private Timer generateReportTimer;
    // reporting task to be done by the timer
    private TimerTask reportTask;
    // Timer for automated member updating
    private Timer updateMemberTimer;
    // Task for member updating
    private TimerTask memberTask;
    // Date that was set for the ReportTimer
    private long dateSet;
    

    /**
     * Private Constructor for the singleton AccountingProcedure
     * Creates a scheduled task to print all reports at midnight on Friday
     */
    private AccountingProcedure() {
        generateReportTimer = new Timer();
        updateMemberTimer = new Timer();
        this.reportTask = new java.util.TimerTask() {
            @Override
            public void run() {
                AccountingProcedure.instance().generateMemberReports();
                AccountingProcedure.instance().generateProviderReports();
                AccountingProcedure.instance().generateAccountsPayableReports();
            }
        };
        
        this.memberTask = new java.util.TimerTask() {
            @Override
            public void run() {
                System.out.println("member task old");
            }
        };

        Calendar scheduledDate = (Calendar) Calendar.getInstance().clone();
        scheduledDate.setTime(nextFriday());
        scheduledDate.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
        scheduledDate.set(Calendar.AM_PM, Calendar.AM);
        scheduledDate.set(Calendar.HOUR, 0);
        scheduledDate.set(Calendar.MINUTE, 0);
        scheduledDate.set(Calendar.SECOND, 0);
        scheduledDate.set(Calendar.MILLISECOND, 0);
        
        Calendar memberDate = (Calendar) Calendar.getInstance().clone();
        memberDate.setTime(new Date());
        memberDate.set(Calendar.HOUR, 22);
        memberDate.set(Calendar.MINUTE, 0);
        memberDate.set(Calendar.SECOND, 0);
        memberDate.set(Calendar.MILLISECOND, 0);
        
        long week = 604800000;
        long day = 86400000;
        generateReportTimer.scheduleAtFixedRate(reportTask, scheduledDate.getTime(), week);
        updateMemberTimer.scheduleAtFixedRate(memberTask, memberDate.getTime(), day);
    }

    /**
     * Calculates the date of next Friday 
     * @return Date for next Friday
     */
    private Date nextFriday() {
        Calendar today = Calendar.getInstance();
        int dayOfWeek = today.get(Calendar.DAY_OF_WEEK);
        int daysUntilNextFriday = Calendar.FRIDAY - dayOfWeek;
        if (daysUntilNextFriday < 0) {
            daysUntilNextFriday = daysUntilNextFriday + 7;
        }
        Calendar nextFriday = (Calendar) today.clone();
        nextFriday.add(Calendar.DAY_OF_WEEK, daysUntilNextFriday);
        
        return nextFriday.getTime();
    }

    /**
     * Gets the instance of the Singleton
     * @return Instance of the Singleton
     */
    public static AccountingProcedure instance() {
        if (accountingProcedure == null) {
            return (accountingProcedure = new AccountingProcedure());
        } else {
            return accountingProcedure;
        }
    }

    /**
     * Generates a member report for all members in the list
     */
    public String generateMemberReports() {
        String result = new String();
        Calendar myCal = (Calendar) Calendar.getInstance().clone();
        myCal.add(Calendar.DATE, -7);
        Date myDate = myCal.getTime();
        Iterator<Member> it = MemberList.instance().getMembers();

        while (it.hasNext()) {
            Member myMember = it.next();
            String generatedMemberReport = Reporting.generateMemberReport(myMember.getID(), myDate);
            result += generatedMemberReport + System.lineSeparator();
            PrintWriter out;
            try {
                out = new PrintWriter(REPORT_FILE_PATH + "Member" + myMember.getID() + "_" + sdf.format(myDate) + ".txt");
                out.print(generatedMemberReport);
                out.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AccountingProcedure.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return result;
    }

    /**
     * Generates a provider report for all providers in the list
     */
    public String generateProviderReports() {
        String result = new String();
        Calendar myCal = (Calendar) Calendar.getInstance().clone();
        myCal.add(Calendar.DATE, -7);
        Date myDate = myCal.getTime();
        Iterator<Provider> it = ProviderList.instance().getProviderIDs();

        while (it.hasNext()) {
            Provider myProvider = it.next();
            String generatedProviderReport = Reporting.generateProviderReport(myProvider.getId(), myDate);
            result += generatedProviderReport + System.lineSeparator();
            PrintWriter out;
            try {
                out = new PrintWriter(REPORT_FILE_PATH + "Provider" + myProvider.getId() + "_" + sdf.format(myDate) + ".txt");
                out.print(generatedProviderReport);
                out.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AccountingProcedure.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result;
    }

    /**
     * Generates an accounts payable Report
     */
    public String generateAccountsPayableReports() {
        String result = new String();
        Calendar myCal = (Calendar) Calendar.getInstance().clone();
        myCal.add(Calendar.DATE, -7);
        Date myDate = myCal.getTime();
        String report = Reporting.generateAccountsPayableReport(myDate);
        result += report + System.lineSeparator();
        PrintWriter out;
        try {
            out = new PrintWriter(REPORT_FILE_PATH + "AccountPayable" + "_" + sdf.format(myDate) + ".txt");
            out.print(report);
            out.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccountingProcedure.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    /**
     * Sets the time when report should be auto-generated (weekly)
     * @param dt Date to generate the reports next
     */
    public void setReportTime(Date dt) {
        long week = 604800000;
        reportTask = new java.util.TimerTask() {
            @Override
            public void run() {
                AccountingProcedure.instance().generateMemberReports();
                AccountingProcedure.instance().generateProviderReports();
                AccountingProcedure.instance().generateAccountsPayableReports();
            }
        };
        generateReportTimer.cancel();
        generateReportTimer = new Timer();
        generateReportTimer.scheduleAtFixedRate(reportTask, dt, week);
        this.dateSet = dt.getTime();
        AccountingProcedure.save();
    }
     public Date getReportTime()
     {
        return new Date(this.dateSet);
     }
    
    /**
     * Reads the files from Acme
     * May not be needed
     */
    public void readAcmeFile()
    {
        try {
            List<String> lines = Files.readAllLines(Paths.get("Acme.txt"), Charset.defaultCharset());
            for(String line : lines)
            {
                String[] parts = line.split(" ");
                if(parts.length >= 2)
                {
                    Member myMember = MemberList.instance().getMember(Integer.parseInt(parts[0]));
                    if(myMember != null)
                    {
                        myMember.setSuspendStatus(("S".equals(parts[1])));
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(AccountingProcedure.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        private void writeObject(java.io.ObjectOutputStream output) {
        try {
            output.defaultWriteObject();
            output.writeObject(accountingProcedure);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    private void readObject(java.io.ObjectInputStream input) {
        try {
            if (accountingProcedure != null) {
                return;
            } else {
                input.defaultReadObject();
                if (accountingProcedure == null) {
                    accountingProcedure = (AccountingProcedure) input.readObject();
                } else {
                    input.readObject();
                }
            }
        } catch (IOException ioe) {
            System.out.println("in Accounting Procedure readObject \n" + ioe);
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }
    }

    /**
     * Save the systemData object structure to a file, for later deserialization
     *
     * @return True if the serialization completed successfully
     */
    public static boolean save() {
        try {
            // First off, create the stream used for writing bytes
            FileOutputStream file = new FileOutputStream(FILE_PATH);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Then write the instance out to the file
            out.writeObject(accountingProcedure);
            out.close();

            // Can return true if this has happened
            return true;
        } catch (IOException ex) {
            ex.printStackTrace();

            // An exception occuring means something was not successful
            return false;
        }
    }

    /**
     * Load (deserialize) the saved systemData and related objects from the
     * saved data file
     *
     * @return The instance that was created from loading, null if errored
     */
    public static AccountingProcedure load() {
        File f = new File(FILE_PATH);
        if (f.exists() && !f.isDirectory()) {
            try {

                // Create a reference to the file to read in
                FileInputStream file = new FileInputStream(FILE_PATH);
                ObjectInputStream in = new ObjectInputStream(file);

                // DO IT!!!!
                in.readObject();
                in.close();
                AccountingProcedure.instance().setReportTime(AccountingProcedure.instance().getReportTime());
                // And return the instance to the memberList
                return accountingProcedure;
            } catch (Exception ex) {
                ex.printStackTrace();
                return null;
            }
        }
        return null;
    }
    

}
