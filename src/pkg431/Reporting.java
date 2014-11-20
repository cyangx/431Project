package pkg431;

import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Reporting class for running reports on Members, Providers, and Accounts
 * Payable
 * @author Garrett
 */
public class Reporting {

    private final static String serviceDateFormat = "MM-dd-yyy";
    private final static String billDateFormat = "MM-dd-yyy hh:mm:ss";
    private final static String EFT_PATH = "./EFT/";

    /**
     * Generates a provider report for the provider with the specified ID number
     *
     * @param ID ID of the provider to print a report for
     * @param since The Date from which to create a report
     * @return The report string
     */
    public static String generateProviderReport(int ID, Date since) {
        // creates date formats
        SimpleDateFormat dt = new SimpleDateFormat(serviceDateFormat);
        SimpleDateFormat dt2 = new SimpleDateFormat(billDateFormat);

        // gets the service records
        ServiceRecordList srl = ServiceRecordList.getInstance();
        Iterator<ServiceRecord> it = srl.getServiceRecords();
        // gets the provider
        Provider myProvider = ProviderList.instance().getProvider(ID);

        String output = new String();
        double totalFee = 0;
        int totalConsultations = 0;

        /**
         * Creates the provider header
         */
        output += "+===================+" + System.lineSeparator();
        output += "   Provider Report   " + System.lineSeparator();
        output += "+===================+" + System.lineSeparator();

        if (myProvider != null) {
            /**
             * Prints the provider information
             */
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

            /**
             * Creates the service header
             */
            output += "\t" + "+====================+" + System.lineSeparator();
            output += "\t" + "  Services Performed" + System.lineSeparator();
            output += "\t" + "+====================+" + System.lineSeparator();

            while (it.hasNext()) {
                // while we still have services
                ServiceRecord sr = it.next();
                if (sr.getProvider().getId() == ID) {
                    /**
                     * if the provider associated with this service is the right
                     * provider and was after the given date
                     */
                    if (since == null || sr.getServiceDate().after(since)) {

                        /**
                         * Print the service record information
                         */
                        output += "\t" + "Service Date: "
                                + dt.format(sr.getServiceDate())
                                + System.lineSeparator();
                        output += "\t" + "Bill Date: "
                                + dt2.format(sr.getBillDate())
                                + System.lineSeparator();

                        /**
                         * Print the member information
                         */
                        output += "\t" + "Name: "
                                + sr.getMember().getName() + System.lineSeparator();
                        output += "\t" + "ID: "
                                + sr.getMember().getID() + System.lineSeparator();

                        /**
                         * Print the service information
                         */
                        output += "\t" + "Service ID: "
                                + sr.getService().getID() + System.lineSeparator();
                        output += "\t" + "Cost: "
                                + sr.getService().getServiceCost()
                                + System.lineSeparator();
                        output += "\t" + "----------------------"
                                + System.lineSeparator();

                        /**
                         * add the service fee to the total and increment the
                         * number of consultations
                         */
                        totalFee += sr.getService().getServiceCost();
                        totalConsultations++;

                    }
                }
            }
            /**
             * Print the total consultations and fees
             */
            output += "Total Consultations: " + totalConsultations
                    + System.lineSeparator();
            output += "Total Fees: " + totalFee + System.lineSeparator();

        }
        // return the output
        return output;
    }

    /**
     * Generates a member report for the member with the specified ID number
     *
     * @param ID ID of the member to create report for
     * @param since The date from which to create the report
     * @return
     */
    public static String generateMemberReport(int ID, Date since) {
        // creates date formats
        SimpleDateFormat dt = new SimpleDateFormat(serviceDateFormat);
        SimpleDateFormat dt2 = new SimpleDateFormat(billDateFormat);
        // gets the service records
        ServiceRecordList srl = ServiceRecordList.getInstance();
        Iterator<ServiceRecord> it = srl.getServiceRecords();
        // gets the member
        Member myMember = MemberList.instance().getMember(ID);

        String output = new String();
        // Prints the member header
        output += "+===================+" + System.lineSeparator();
        output += "   Member Report   " + System.lineSeparator();
        output += "+===================+" + System.lineSeparator();

        if (myMember != null) {
            // prints the member information
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

            // prints the service header
            output += "\t" + "+====================+" + System.lineSeparator();
            output += "\t" + "  Services Received" + System.lineSeparator();
            output += "\t" + "+====================+" + System.lineSeparator();

            while (it.hasNext()) {
                ServiceRecord sr = it.next();
                if (sr.getMember().getID() == ID) {
                    // if the member has the right ID and the service is after
                    // the date
                    if (since == null || sr.getServiceDate().after(since)) {
                        // print the service and provider info
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
     * Generates an accounts payable report for all providers since the given
     * date
     * @param since The date from whcih to print the report
     * @return The report string
     */
    public static String generateAccountsPayableReport(Date since) {
        // creates date formats
        SimpleDateFormat dt = new SimpleDateFormat(serviceDateFormat);
        SimpleDateFormat dt2 = new SimpleDateFormat(billDateFormat);
        // gets the service records
        ServiceRecordList srl = ServiceRecordList.getInstance();
        // Gets all of the providers
        Iterator<Provider> pit = ProviderList.instance().getProviderIDs();

        String output = new String();
        double subTotalFee = 0;
        double totalFee = 0;
        int subTotalConsultations = 0;
        int totalConsultations = 0;

        // prints the accounts payable header
        output += "+===================+" + System.lineSeparator();
        output += "   Accounts Payable   " + System.lineSeparator();
        output += "+===================+" + System.lineSeparator();

        while (pit.hasNext()) {
            Provider provider = pit.next();
            // gets a provider and prints the name
            output += provider.getProviderName() + System.lineSeparator();
            Iterator<ServiceRecord> it = srl.getServiceRecords();
            while (it.hasNext()) {
                ServiceRecord sr = it.next();
                // if the ID's match
                if (provider.getId() == sr.getProvider().getId()) {
                    //if the date is right
                    if (since == null || sr.getServiceDate().after(since)) {
                        // subtotal up the fee and consultations for this provider
                        subTotalFee += sr.getService().getServiceCost();
                        subTotalConsultations++;
                    }
                }
            }
           
            printEFT(provider.getProviderName(), provider.getId(), provider.getBankAccountName(), provider.getBankAccountNum(), subTotalFee);
            
            //  prints the sub total for this provider
            output += "SubTotal Consultations: " + subTotalConsultations
                    + System.lineSeparator();
            output += "SubTotal Fees: " + subTotalFee + System.lineSeparator();
            output += "-------------------------" + System.lineSeparator();
            
            // adds the subotal to the total and resets the subtotals
            totalFee += subTotalFee;
            subTotalFee = 0;
            totalConsultations += subTotalConsultations;
            subTotalConsultations = 0;
        }
        // prints the totals
        output += "Total Consultations: " + totalConsultations
                + System.lineSeparator();
        output += "Total Fees: " + totalFee + System.lineSeparator();
        return output;
    }
    
    private static void printEFT(String name, int number, String bank, String bankNum, double Amount)
    {
        PrintWriter out;
        try {
            File file = new File(EFT_PATH + name + "_" + number + ".txt");
            file.getParentFile().mkdirs();
            out = new PrintWriter(file);
            out.print(name + ", " + number + ", " + bank + ", " + bankNum + ", " + Amount);
            out.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccountingProcedure.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
