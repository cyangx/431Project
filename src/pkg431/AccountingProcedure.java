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
public class AccountingProcedure {

    // Date format for file names

    private static final SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyy");
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
                AccountingProcedure.instance().generateAccountingProcedureReports();
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
    public void generateMemberReports() {
        Calendar myCal = (Calendar) Calendar.getInstance().clone();
        myCal.add(Calendar.DATE, -7);
        Date myDate = myCal.getTime();
        Iterator<Member> it = MemberList.instance().getMembers();

        while (it.hasNext()) {
            Member myMember = it.next();
            String generatedMemberReport = Reporting.generateMemberReport(myMember.getID(), myDate);
            PrintWriter out;
            try {
                out = new PrintWriter("Member" + myMember.getID() + "_" + sdf.format(myDate) + ".txt");
                out.print(generatedMemberReport);
                out.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AccountingProcedure.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    /**
     * Generates a provider report for all providers in the list
     */
    public void generateProviderReports() {
        Calendar myCal = (Calendar) Calendar.getInstance().clone();
        myCal.add(Calendar.DATE, -7);
        Date myDate = myCal.getTime();
        Iterator<Provider> it = ProviderList.instance().getProviderIDs();

        while (it.hasNext()) {
            Provider myProvider = it.next();
            String generatedProviderReport = Reporting.generateProviderReport(myProvider.getId(), myDate);
            PrintWriter out;
            try {
                out = new PrintWriter("Provider" + myProvider.getId() + "_" + sdf.format(myDate) + ".txt");
                out.print(generatedProviderReport);
                out.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AccountingProcedure.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * Generates an accounts payable Report
     */
    public void generateAccountingProcedureReports() {
        Calendar myCal = (Calendar) Calendar.getInstance().clone();
        Date myDate = myCal.getTime();
        String report = Reporting.generateAccountsPayableReport(myDate);
        PrintWriter out;
        try {
            out = new PrintWriter("AccountPayable" + "_" + sdf.format(myDate) + ".txt");
            out.print(report);
            out.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccountingProcedure.class.getName()).log(Level.SEVERE, null, ex);
        }

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
                AccountingProcedure.instance().generateAccountingProcedureReports();
            }
        };
        generateReportTimer.cancel();
        generateReportTimer = new Timer();
        generateReportTimer.scheduleAtFixedRate(reportTask, dt, week);
    }
    
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
    

}
