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

    private final static String serviceDateFormat = "mm-dd-yyy";
    private final static String billDateFormat = "mm-dd-yyy hh:mm:ss";

    /**
     * TODO: Add bool output for success
     *
     * @param ID
     */
    public static void generateProviderReport(int ID, Date since) {
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

            try {
                PrintWriter out = new PrintWriter("Provider" + myProvider.getId() + new Date() + ".txt");
                out.println(output);
                out.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Reporting.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     *
     * @param ID
     */
    public void generateAccountsPayableReport(int ID, Date since) {

    }

    /**
     *
     * @param ID
     */
    public void generateMemberReport(int ID, Date since) {

    }
}
