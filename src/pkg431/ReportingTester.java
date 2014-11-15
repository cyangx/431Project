package pkg431;

import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Garrett
 */
public class ReportingTester {

    public static void main(String args[]) {
        ServiceRecord myServiceRecord;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Provider myProvider = new Provider("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301", "Bank", "123");
        Provider myProvider2 = new Provider("Test Name2", 2, "Test Address2", "St. Croix", "WI", "56377", "Bank", "123");
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
        pl.addProvider(myProvider2);
        MemberList ml = MemberList.instance();
        ml.addMember(myMember);
        ml.addMember(myMember2);


        ServiceRecordList myServiceRecordList = ServiceRecordList.getInstance();

        myServiceRecordList.CaptureService(myProvider, myMember, myService, myDate);
        myServiceRecordList.CaptureService(myProvider, myMember2, myService2, myDate2);
        myServiceRecordList.CaptureService(myProvider2, myMember2, myService, myDate2);
        myServiceRecordList.CaptureService(myProvider, myMember, myService, myDate2);

        /**
         * Test with a date where a report should be generated with services
         */
        try {
            Date date1 = sdf.parse("2009-12-31");

            PrintWriter out = new PrintWriter("Provider1" + date1 + ".txt");
            out.print(Reporting.generateProviderReport(1, date1)
                    + System.lineSeparator()
                    + "SHOULD HAVE 3 SERVICES");
            out.close();

            out = new PrintWriter("Member1" + date1 + ".txt");
            out.print(Reporting.generateMemberReport(1, date1)
                    + System.lineSeparator()
                    + "SHOULD HAVE 2 SERVICES");
            out.close();

            System.out.println();
        } catch (Exception e) {
            System.out.println("FAILED");
        }

        /**
         * Test with a date where a report should be absent of services
         */
        try {

            Date date1 = sdf.parse("2999-12-31");

            PrintWriter out = new PrintWriter("Provider1" + date1 + ".txt");
            out.print(Reporting.generateProviderReport(1, date1)
                    + System.lineSeparator()
                    + "SHOULD HAVE NO SERVICES");
            out.close();

            out = new PrintWriter("Member1" + date1 + ".txt");
            out.print(Reporting.generateMemberReport(1, date1)
                    + System.lineSeparator()
                    + "SHOULD HAVE NO SERVICES");
            out.close();

            System.out.println();
        } catch (Exception e) {
            System.out.println("FAILED");
        }

        /**
         * Test with a date where a report should be generated with some
         * services
         */
        try {
            PrintWriter out = new PrintWriter("Provider1" + myDate + ".txt");
            out.print(Reporting.generateProviderReport(1, myDate)
                    + System.lineSeparator()
                    + "SHOULD HAVE 2 SERVICES");
            out.close();

            out = new PrintWriter("Member1" + myDate + ".txt");
            out.print(Reporting.generateMemberReport(1, myDate)
                    + System.lineSeparator()
                    + "SHOULD HAVE 1 SERVICE");
            out.close();

            System.out.println();
        } catch (Exception e) {
            System.out.println("FAILED");
        }

        /**
         * Test with a date where a report should be generated with all services
         * because our date is null
         */
        try {
            PrintWriter out = new PrintWriter("Provider1" + "ALL" + ".txt");
            out.print(Reporting.generateProviderReport(1, null)
                    + System.lineSeparator()
                    + "SHOULD HAVE 3 SERVICES");
            out.close();

            out = new PrintWriter("Member1" + "ALL" + ".txt");
            out.print(Reporting.generateMemberReport(1, null)
                    + System.lineSeparator()
                    + "SHOULD HAVE 2 SERVICES");
            out.close();
            System.out.println();
        } catch (Exception e) {
            System.out.println("FAILED");
        }

        /**
         * Tests the accounts payable
         */
        PrintWriter out = null;
        try {
            Date date1 = sdf.parse("2009-12-31");
            out = new PrintWriter("Accounts Payable" + ".txt");
            out.print(Reporting.generateAccountsPayableReport(date1));
        } catch (Exception ex) {
            Logger.getLogger(ReportingTester.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            if(out != null)
                out.close();
        }
        

    }
}
