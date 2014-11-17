package pkg431;

import java.util.Date;

/**
 *
 * @author Garrett
 */
public class ServiceRecordTester {

    public static void main(String args[]) {
        ServiceRecord myServiceRecord;
        Provider myProvider = new Provider("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301", "bank", "123");
        Member myMember = new Member("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301");
        Service myService = new Service("Test Name", 1, 500.59);
        Date myDate = new Date();

        System.out.println("** TESTING SERVICERECORD CODE**");
        System.out.println('\n');

        /**
         * This tests for more than the maximum characters
         */
        System.out.println("**Testing constructor inputs**");
        try {
            myServiceRecord = new ServiceRecord(
                    myProvider,
                    myMember,
                    myService,
                    myDate,
                    "Comments");
            /**
             * Service Tests
             */
            System.out.println(myServiceRecord.getService().getServiceName() + " " + myServiceRecord.getService().getServiceName().length());
            System.out.println(myServiceRecord.getService().getID());
            System.out.println(myServiceRecord.getService().getServiceCost());
            System.out.println(myServiceRecord.getBillDate());
            if ((myService.getServiceName() == null ? myServiceRecord.getService().getServiceName() == null : myService.getServiceName().equals(myServiceRecord.getService().getServiceName()))
                    && myService.getServiceCost() == myServiceRecord.getService().getServiceCost()
                    && myDate == myServiceRecord.getServiceDate()) {
                System.out.println("SERVICE PASSED");
            } else {
                throw new Exception("Service Failed");
            }
            System.out.println('\n');
        } catch (Exception e) {
            System.out.println("FAILED");
            System.out.println(e.getMessage());
            System.out.println('\n');
        }
        try {
            myServiceRecord = new ServiceRecord(
                    myProvider,
                    myMember,
                    myService,
                    myDate,
                    "Comments");
            /**
             * Provider Tests
             */
            System.out.println(myServiceRecord.getProvider().getProviderName() + " " + myServiceRecord.getProvider().getProviderName().length());
            System.out.println(myServiceRecord.getProvider().getId());
            System.out.println(myServiceRecord.getProvider().getAddress() + " " + myServiceRecord.getProvider().getAddress().length());
            System.out.println(myServiceRecord.getProvider().getCity() + " " + myServiceRecord.getProvider().getCity().length());
            System.out.println(myServiceRecord.getProvider().getState() + " " + myServiceRecord.getProvider().getState().length());
            System.out.println(myServiceRecord.getProvider().getZipcode() + " " + myServiceRecord.getProvider().getZipcode().length());
            System.out.println(myServiceRecord.getBillDate());
            if ((myProvider.getProviderName() == null ? myServiceRecord.getProvider().getProviderName() == null : myProvider.getProviderName().equals(myServiceRecord.getProvider().getProviderName()))
                    && (myProvider.getAddress() == null ? myServiceRecord.getProvider().getAddress() == null : myProvider.getAddress().equals(myServiceRecord.getProvider().getAddress()))
                    && (myProvider.getCity() == null ? myServiceRecord.getProvider().getCity() == null : myProvider.getCity().equals(myServiceRecord.getProvider().getCity()))
                    && (myProvider.getState() == null ? myServiceRecord.getProvider().getState() == null : myProvider.getState().equals(myServiceRecord.getProvider().getState()))
                    && (myProvider.getZipcode() == null ? myServiceRecord.getProvider().getZipcode() == null : myProvider.getZipcode().equals(myServiceRecord.getProvider().getZipcode()))
                    && myDate == myServiceRecord.getServiceDate()) {
                System.out.println("PROVIDER PASSED");
            } else {
                throw new Exception("Provider Failed");
            }
            System.out.println('\n');
        } catch (Exception e) {
            System.out.println("FAILED");
            System.out.println(e.getMessage());
            System.out.println('\n');
        }

        try {
            myServiceRecord = new ServiceRecord(
                    myProvider,
                    myMember,
                    myService,
                    myDate,
                    "Comments");
            /**
             * Member Tests
             */
            System.out.println(myServiceRecord.getMember().getName() + " " + myServiceRecord.getMember().getName().length());
            System.out.println(myServiceRecord.getMember().getID());
            System.out.println(myServiceRecord.getMember().getAddress() + " " + myServiceRecord.getMember().getAddress().length());
            System.out.println(myServiceRecord.getMember().getCity() + " " + myServiceRecord.getMember().getCity().length());
            System.out.println(myServiceRecord.getMember().getState() + " " + myServiceRecord.getMember().getState().length());
            System.out.println(myServiceRecord.getMember().getZipcode() + " " + myServiceRecord.getMember().getZipcode().length());
            System.out.println(myServiceRecord.getBillDate());
            if ((myMember.getName() == null ? myServiceRecord.getMember().getName() == null : myMember.getName().equals(myServiceRecord.getMember().getName()))
                    && (myMember.getAddress() == null ? myServiceRecord.getMember().getAddress() == null : myMember.getAddress().equals(myServiceRecord.getMember().getAddress()))
                    && (myMember.getCity() == null ? myServiceRecord.getMember().getCity() == null : myMember.getCity().equals(myServiceRecord.getMember().getCity()))
                    && (myMember.getState() == null ? myServiceRecord.getMember().getState() == null : myMember.getState().equals(myServiceRecord.getMember().getState()))
                    && (myMember.getZipcode() == null ? myServiceRecord.getMember().getZipcode() == null : myMember.getZipcode().equals(myServiceRecord.getMember().getZipcode()))
                    && myDate == myServiceRecord.getServiceDate()) {
                System.out.println("MEMBER PASSED");
            } else {
                throw new Exception("Member Failed");
            }
            System.out.println('\n');
        } catch (Exception e) {
            System.out.println("FAILED");
            System.out.println(e.getMessage());
            System.out.println('\n');
        }

        /**
         * Set Date Test
         */
        try {
            myServiceRecord = new ServiceRecord(
                    myProvider,
                    myMember,
                    myService,
                    myDate,
                    "Comments");
            myServiceRecord.setBillDate(myDate);
            if (myServiceRecord.getBillDate() == myDate) {
                System.out.println("DATE CHANGE PASSED");
            } else {
                throw new Exception("Date Change Failed");
            }
            System.out.println('\n');
        } catch (Exception e) {
            System.out.println("FAILED");
            System.out.println(e.getMessage());
            System.out.println('\n');
        }

    }

}
