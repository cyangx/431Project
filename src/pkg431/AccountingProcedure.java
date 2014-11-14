package pkg431;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
    private static AccountingProcedure accountingProcedure;
    private Timer generateReportTimer;
    
    
    private AccountingProcedure(){
       
    }
    
    public static AccountingProcedure instance() {
        if (accountingProcedure == null) {
            return (accountingProcedure = new AccountingProcedure());
        } else {
            return accountingProcedure;
        }
    }
    
    public void generateMemberReports()
    {
        Date myDate = new Date();
        Iterator<Member> it = MemberList.instance().getMembers();
        while(it.hasNext())
        {
            Member myMember = it.next();
            String generatedMemberReport = Reporting.generateMemberReport(myMember.getID(), null); 
            PrintWriter out;
            try {
                out = new PrintWriter("Member" + myMember.getID() + myDate + ".txt");
                out.print(Reporting.generateMemberReport(1, myDate));
                out.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AccountingProcedure.class.getName()).log(Level.SEVERE, null, ex);
            }          
            
        }
    }
    
    public void generateProviderReports()
    {
        
    }
    
    public void generateAccountingProcedureReports()
    {
        
    }
    
    public void setReportTime()
    {
        
    }
    
    private void scheduledTasks()
    {
        
    }
    
    
}
