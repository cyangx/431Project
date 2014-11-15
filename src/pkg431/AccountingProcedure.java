package pkg431;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Timer;
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
    private Timer generateReportTimer;

    private AccountingProcedure() {

    }

    public static AccountingProcedure instance() {
        if (accountingProcedure == null) {
            return (accountingProcedure = new AccountingProcedure());
        } else {
            return accountingProcedure;
        }
    }

    public void generateMemberReports() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -7);
        Date myDate = cal.getTime();
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
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -7);
        Date myDate = cal.getTime();
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
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -7);
        Date myDate = cal.getTime();
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

    public void setReportTime() {

    }

    private void scheduledTasks() {

    }

}
