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
public class Reporting {

    private final static String serviceDateFormat = "MM-dd-yyy";
    private final static String billDateFormat = "MM-dd-yyy hh:mm:ss";

    /**
     * TODO: Add bool output for success
     *
     * @param ID
     */
    public static String generateProviderReport(int ID, Date since) {
        SimpleDateFormat dt = new SimpleDateFormat(serviceDateFormat);
        SimpleDateFormat dt2 = new SimpleDateFormat(billDateFormat);

        ServiceRecordList srl = ServiceRecordList.getInstance();
        Iterator<ServiceRecord> it = srl.getServiceRecords();

        Provider myProvider = ProviderList.instance().getProvider(ID);

        String output = new String();
        double totalFee = 0;
        int totalConsultations = 0;

        output += "+===================+" + System.lineSeparator();
        output += "   Provider Report   " + System.lineSeparator();
        output += "+===================+" + System.lineSeparator();

        if (myProvider != null) {

            output += "Name: " + myProvider.getProviderName()
                    + System.lineSeparator();
            output += "ID: " + myProvider.getId()
                    + System.lineSeparator();
            output += "Address: " + myProvider.getAddress()
                    + System.lineSeparator();
            output += "City: " + myProvider.getCity()
                    + System.lineSeparator();
            output += "State: " + myProvider.getState()
                    + System.lineSeparator();
            output += "Zip Code: " + myProvider.getZipcode()
                    + System.lineSeparator();

            output += "\t" + "+====================+" + System.lineSeparator();
            output += "\t" + "  Services Performed" + System.lineSeparator();
            output += "\t" + "+====================+" + System.lineSeparator();

            while (it.hasNext()) {
                ServiceRecord sr = it.next();
                if (sr.getProvider().getId() == ID) {
                    if (since == null || sr.getServiceDate().after(since)) {
                        output += "\t" + "Service Date: "
                                + dt.format(sr.getServiceDate())
                                + System.lineSeparator();
                        output += "\t" + "Bill Date: "
                                + dt2.format(sr.getBillDate())
                                + System.lineSeparator();
                        output += "\t" + "Name: "
                                + sr.getMember().getName() + System.lineSeparator();
                        output += "\t" + "ID: "
                                + sr.getMember().getID() + System.lineSeparator();
                        output += "\t" + "Service ID: "
                                + sr.getService().getID() + System.lineSeparator();
                        output += "\t" + "Cost: "
                                + sr.getService().getServiceCost()
                                + System.lineSeparator();
                        output += "\t" + "----------------------"
                                + System.lineSeparator();
                        totalFee += sr.getService().getServiceCost();
                        totalConsultations++;

                    }
                }
            }

            output += "Total Consultations: " + totalConsultations
                    + System.lineSeparator();
            output += "Total Fees: " + totalFee + System.lineSeparator();

        }
        return output;
    }

    /**
     *
     * @param ID
     */
    public static String generateMemberReport(int ID, Date since) {
        SimpleDateFormat dt = new SimpleDateFormat(serviceDateFormat);
        SimpleDateFormat dt2 = new SimpleDateFormat(billDateFormat);

        ServiceRecordList srl = ServiceRecordList.getInstance();
        Iterator<ServiceRecord> it = srl.getServiceRecords();

        Member myMember = MemberList.instance().getMember(ID);

        String output = new String();

        output += "+===================+" + System.lineSeparator();
        output += "   Member Report   " + System.lineSeparator();
        output += "+===================+" + System.lineSeparator();

        if (myMember != null) {

            output += "Name: " + myMember.getName()
                    + System.lineSeparator();
            output += "ID: " + myMember.getID()
                    + System.lineSeparator();
            output += "Address: " + myMember.getAddress()
                    + System.lineSeparator();
            output += "City: " + myMember.getCity()
                    + System.lineSeparator();
            output += "State: " + myMember.getState()
                    + System.lineSeparator();
            output += "Zip Code: " + myMember.getZipcode()
                    + System.lineSeparator();

            output += "\t" + "+====================+" + System.lineSeparator();
            output += "\t" + "  Services Received" + System.lineSeparator();
            output += "\t" + "+====================+" + System.lineSeparator();

            while (it.hasNext()) {
                ServiceRecord sr = it.next();
                if (sr.getMember().getID() == ID) {
                    if (since == null || sr.getServiceDate().after(since)) {
                        output += "\t" + "Service Date: "
                                + dt.format(sr.getServiceDate())
                                + System.lineSeparator();
                            output += "\t" + "Name: "
                                + sr.getProvider().getProviderName()
                                + System.lineSeparator();
                        output += "\t" + "Service: "
                                + sr.getService().getServiceName()
                                + System.lineSeparator();
                        output += "\t" + "----------------------"
                                + System.lineSeparator();
                    }
                }
            }

        }
        return output;
    }

    /**
     *
     * @param ID
     */
    public static String generateAccountsPayableReport(Date since) {
        SimpleDateFormat dt = new SimpleDateFormat(serviceDateFormat);
        SimpleDateFormat dt2 = new SimpleDateFormat(billDateFormat);

        ServiceRecordList srl = ServiceRecordList.getInstance();
        
        Iterator<Provider> pit = ProviderList.instance().getProviderIDs();

        String output = new String();
        double subTotalFee = 0;
        double totalFee = 0;
        int subTotalConsultations = 0;
        int totalConsultations = 0;

        output += "+===================+" + System.lineSeparator();
        output += "   Accounts Payable   " + System.lineSeparator();
        output += "+===================+" + System.lineSeparator();

        while (pit.hasNext()) {
            Provider provider = pit.next();
            output += provider.getProviderName() + System.lineSeparator();
            Iterator<ServiceRecord> it = srl.getServiceRecords();
            while (it.hasNext()) {
                ServiceRecord sr = it.next();
                if (provider.getId() == sr.getProvider().getId()) {
                    if (since == null || sr.getServiceDate().after(since)) {
                        subTotalFee += sr.getService().getServiceCost();
                        subTotalConsultations++;
                    }
                }
            }
            output += "SubTotal Consultations: " + subTotalConsultations
                    + System.lineSeparator();
            output += "SubTotal Fees: " + subTotalFee + System.lineSeparator();
            output += "-------------------------" + System.lineSeparator();
            totalFee += subTotalFee;
            subTotalFee = 0;
            totalConsultations += subTotalConsultations;
            subTotalConsultations = 0;
        }
        output += "Total Consultations: " + totalConsultations
                + System.lineSeparator();
        output += "Total Fees: " + totalFee + System.lineSeparator();
        return output;
    }
}
