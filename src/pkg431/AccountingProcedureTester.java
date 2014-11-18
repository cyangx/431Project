package pkg431;

import java.util.Calendar;
import java.util.Date;

/**
 * Tests the Accounting Procedure Class
 * @author Garrett
 */
public class AccountingProcedureTester {
    public static void main(String args[]) {
        
        
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -8);
        Date eightDaysAgo = cal.getTime();
        Date Now = new Date();
        
        Provider myProvider = new Provider("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301", "Bank", "123");
        Provider myProvider2 = new Provider("Test Name2", 2, "Test Address2", "St. Croix", "WI", "56377", "Bank", "123");
        Member myMember = new Member("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301");
        Member myMember2 = new Member("Test Name2", 2, "Test Address2", "St. Croix", "WI", "66345");
        Service myService = new Service("Test Name", 1, 500.59);
        Service myService2 = new Service("Test Name2", 2, 50.01);
        
        /**
         * Add Providers
         */
        ProviderList pl = ProviderList.instance();
        pl.addProvider(myProvider);
        pl.addProvider(myProvider2);
        
        /**
         * Add Members
         */
        MemberList ml = MemberList.instance();
        ml.addMember(myMember);
        ml.addMember(myMember2);
        
        /**
         *  Add services
         */
        ServiceList.instance().addService(myService);
        ServiceList.instance().addService(myService2);
        
        ServiceRecordList.getInstance().CaptureService(myProvider, myMember, myService, eightDaysAgo, "Comments");
        ServiceRecordList.getInstance().CaptureService(myProvider, myMember2, myService2, Now, "Comments");
        ServiceRecordList.getInstance().CaptureService(myProvider2, myMember2, myService, Now, "Comments");
        ServiceRecordList.getInstance().CaptureService(myProvider, myMember, myService, Now, "Comments");
               
        /**
         * Test generate member reports
         */
        AccountingProcedure.instance().generateMemberReports();
        
        /**
         * Test generate provider reports
         */
        AccountingProcedure.instance().generateProviderReports();
        
        /**
         * Test generate accounts payable
         */
        AccountingProcedure.instance().generateAccountsPayableReports();
        
        /**
         * Test the reseting of the scheduled time
         * It will be set to one minute from now
         */
        long ONE_MINUTE_IN_MILLIS=60000;//millisecs
        Date date = new Date();
        long t=date.getTime();
        Date AddedTime=new Date(t + (ONE_MINUTE_IN_MILLIS));
        Date waitUntil = new Date(t + (2* ONE_MINUTE_IN_MILLIS));
        AccountingProcedure.instance().setReportTime(AddedTime);
        int i = 0;
        while(new Date().before(waitUntil))
        {
            // let's wait for a while            
        }
        System.out.println("DONE");
    }
}
