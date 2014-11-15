package pkg431;

import java.util.Calendar;
import java.util.Date;

/**
 *
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
        
        ProviderList pl = ProviderList.instance();
        pl.addProvider(myProvider);
        pl.addProvider(myProvider2);
        MemberList ml = MemberList.instance();
        ml.addMember(myMember);
        ml.addMember(myMember2);
        ServiceList.instance().addService(myService);
        ServiceList.instance().addService(myService2);
        
        ServiceRecordList.getInstance().CaptureService(myProvider, myMember, myService, eightDaysAgo);
        ServiceRecordList.getInstance().CaptureService(myProvider, myMember2, myService2, Now);
        ServiceRecordList.getInstance().CaptureService(myProvider2, myMember2, myService, Now);
        ServiceRecordList.getInstance().CaptureService(myProvider, myMember, myService, Now);
        
        /**
         * Test generate member reports
         */
        AccountingProcedure.instance().generateMemberReports();
        
    }
}
