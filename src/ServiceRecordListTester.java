import java.util.*;
import java.io.*;
import java.util.Date;

/**
 *
 * @author Garrett
 */
public class ServiceRecordListTester {

    public static void main(String args[]) {
        ServiceRecord myServiceRecord;
        Provider myProvider = new Provider("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301");
        Member myMember = new Member("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301");
        Service myService = new Service("Test Name", 1, 500.59);
        Date myDate = new Date();

        System.out.println("** TESTING SERVICERECORDLIST CODE**");

        ServiceRecordList myServiceRecordList = ServiceRecordList.getInstance();

        /**
         * Testing capture and iterator
         */
        System.out.println("**Testing add and iterator**");
        myServiceRecordList.CaptureService(myProvider, myMember, myService, myDate);
        myServiceRecordList.CaptureService(myProvider, myMember, myService, myDate);

        Iterator<ServiceRecord> it = myServiceRecordList.getServiceRecords();
        List<ServiceRecord> srl = new LinkedList<>();
        while (it.hasNext()) {
            srl.add(it.next());
        }
        if (srl.size() == 2) {
            System.out.println("ITERATOR PASSED");
            if (srl.get(0).getProvider().getProviderName() == srl.get(1).getProvider().getProviderName()
                    && srl.get(0).getProvider().getAddress() == srl.get(1).getProvider().getAddress()
                    && srl.get(0).getProvider().getCity() == srl.get(1).getProvider().getCity()
                    && srl.get(0).getProvider().getId() == srl.get(1).getProvider().getId()
                    && srl.get(0).getProvider().getState() == srl.get(1).getProvider().getState()
                    && srl.get(0).getProvider().getZipcode() == srl.get(1).getProvider().getZipcode()
                    && srl.get(0).getMember().getName() == srl.get(1).getMember().getName()
                    && srl.get(0).getMember().getAddress() == srl.get(1).getMember().getAddress()
                    && srl.get(0).getMember().getCity() == srl.get(1).getMember().getCity()
                    && srl.get(0).getMember().getID() == srl.get(1).getMember().getID()
                    && srl.get(0).getMember().getState() == srl.get(1).getMember().getState()
                    && srl.get(0).getMember().getZipcode() == srl.get(1).getMember().getZipcode()
                    && srl.get(0).getService().getID() == srl.get(1).getService().getID()
                    && srl.get(0).getService().getServiceCost() == srl.get(1).getService().getServiceCost()
                    && srl.get(0).getService().getServiceName() == srl.get(1).getService().getServiceName()
                    && srl.get(0).getServiceDate() == srl.get(1).getServiceDate()) {
                System.out.println("ADD PASSED");
            } else {
                System.out.println("ADD FAILED");
            }
        } else {
            System.out.println("ITERATOR FAILED");
        }

        /**
         * Test remove
         */
        System.out.println("**Testing Remove**");
        myServiceRecordList.RemoveServiceRecord(srl.get(0));
        it = myServiceRecordList.getServiceRecords();
        srl.clear();
        while (it.hasNext()) {
            srl.add(it.next());
        }
        if(srl.size() == 1)
        {
            System.out.println("REMOVE PASSED");
        }
        else
        {
            System.out.println("REMOVED FAILED");
        }
    }
}
