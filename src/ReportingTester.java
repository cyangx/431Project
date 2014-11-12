import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

/**
 *
 * @author Garrett
 */
public class ReportingTester {

    public static void main(String args[]) {
        ServiceRecord myServiceRecord;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Provider myProvider = new Provider("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301");
        Member myMember = new Member("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301");
        Member myMember2 = new Member("Test Name2", 2, "Test Address2", "St. Croix", "WI", "66345");
        Service myService = new Service("Test Name", 1, 500.59);
        Service myService2 = new Service("Test Name2", 2, 50.01);

        Date myDate = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(myDate);
        c.add(Calendar.DATE, 1);
        Date myDate2 = c.getTime();

        ProviderList pl = ProviderList.instance();
        pl.addProvider(myProvider);

        myServiceRecord = new ServiceRecord(
                myProvider,
                myMember,
                myService,
                myDate);

        ServiceRecordList myServiceRecordList = ServiceRecordList.getInstance();

        myServiceRecordList.CaptureService(myProvider, myMember, myService, myDate);
        myServiceRecordList.CaptureService(myProvider, myMember2, myService2, myDate2);
        myServiceRecordList.CaptureService(myProvider, myMember, myService, myDate);

        /**
         * Test with a date where a report should be generated with services
         */
        try {
            Date date1 = sdf.parse("2009-12-31");
            Reporting.generateProviderReport(1, date1);
            System.out.println("SHOULD HAVE THREE SERVICES");
            System.out.println();
        } catch (Exception e) {
            System.out.println("FAILED");
        }

        /**
         * Test with a date where a report should be absent of services
         */
        try {

            Date date1 = sdf.parse("2999-12-31");
            Reporting.generateProviderReport(1, date1);
            System.out.println("SHOULD HAVE NO SERVICES");
            System.out.println();
        } catch (Exception e) {
            System.out.println("FAILED");
        }

        /**
         * Test with a date where a report should be generated with some services
         */
        try {
            Reporting.generateProviderReport(1, myDate);
            System.out.println("SHOULD HAVE ONE SERVICE");
            System.out.println();
        } catch (Exception e) {
            System.out.println("FAILED");
        }
        
        /**
        * Test with a date where a report should be generated with all services
        * because our date is null
        */
        try {
            Reporting.generateProviderReport(1, null);
            System.out.println("SHOULD HAVE THREE SERVICES");
            System.out.println();
        } catch (Exception e) {
            System.out.println("FAILED");
        }

    }
}
