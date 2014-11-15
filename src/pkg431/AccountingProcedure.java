package pkg431;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Garrett
 */
public class AccountingProcedure {

    private static final long serialVersionUID = 1L;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyy");
    private static AccountingProcedure accountingProcedure;
    private Timer generateReportTimer = new Timer();
    private TimerTask task;

    private AccountingProcedure() {
        this.task = new java.util.TimerTask() {
            @Override
            public void run() {
                AccountingProcedure.instance().generateMemberReports();
                AccountingProcedure.instance().generateProviderReports();
                AccountingProcedure.instance().generateAccountingProcedureReports();
            }
        };
        Calendar today = Calendar.getInstance();
        int dayOfWeek = today.get(Calendar.DAY_OF_WEEK);
        int daysUntilNextFriday = Calendar.FRIDAY - dayOfWeek;
        if (daysUntilNextFriday < 0) {
            daysUntilNextFriday = daysUntilNextFriday + 7;
        }

        Calendar nextFriday = (Calendar) today.clone();
        nextFriday.add(Calendar.DAY_OF_WEEK, daysUntilNextFriday);
        if (nextFriday.get(Calendar.WEEK_OF_YEAR) % 2 == 0) {
            nextFriday.add(Calendar.DAY_OF_WEEK, 7);
        }

        long week = 604800000;
        generateReportTimer.scheduleAtFixedRate(task, nextFriday.getTime(), week);
    }

    public static AccountingProcedure instance() {
        if (accountingProcedure == null) {
            return (accountingProcedure = new AccountingProcedure());
        } else {
            return accountingProcedure;
        }
    }

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
    // TODO test this, possibly remove it
    public void setReportTime(Date dt) {
        long week = 604800000;
        task = new java.util.TimerTask() {
            @Override
            public void run() {
                AccountingProcedure.instance().generateMemberReports();
                AccountingProcedure.instance().generateProviderReports();
                AccountingProcedure.instance().generateAccountingProcedureReports();
            }
        };
        generateReportTimer.scheduleAtFixedRate(task, dt, week);
    }

}
