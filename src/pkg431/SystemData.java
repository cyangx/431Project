package pkg431;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * SystemData for quick saving and loading
 *
 * @author Garrett
 */
public class SystemData implements Serializable {

    private static final String FILE_PATH = "./SaveFiles/SystemData";
    //private ServiceList serviceList;
    //private ProviderList providerList;
    private ServiceRecordList serviceRecordList;
    //private MemberList memberList;
    //private Factory factory;

    private static SystemData systemData;

    public static SystemData instance() {
        if (systemData == null) {
            systemData = new SystemData();
        }
        return systemData;
    }

    private SystemData() {
        //serviceList = ServiceList.instance();
        //providerList = ProviderList.instance();
        serviceRecordList = ServiceRecordList.getInstance();
        //memberList = MemberList.instance();
        //factory = Factory.getInstance();
    }

    private void init() {
        //serviceList = ServiceList.instance();
        //providerList = ProviderList.instance();
        serviceRecordList = ServiceRecordList.getInstance();
        //memberList = MemberList.instance();
        //factory = Factory.getInstance();
    }

    /**
     * Save the systemData object structure to a file, for later deserialization
     *
     * @return True if the serialization completed successfully
     */
    public static boolean save() {
        try {
            // First off, create the stream used for writing bytes
            System.out.println("Saving...");
            FileOutputStream file = new FileOutputStream(FILE_PATH);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Then write the instance out to the file
            out.writeObject(systemData);
            out.close();

            // Can return true if this has happened
            return true;
        } catch (IOException ex) {
            ex.printStackTrace();

            // An exception occuring means something was not successful
            return false;
        }
    }

    /**
     * Load (deserialize) the saved systemData and related objects from the
     * saved data file
     *
     * @return The instance that was created from loading, null if errored
     */
    public static SystemData load() {
        File f = new File(FILE_PATH);
        if (f.exists() && !f.isDirectory()) {
            try {
                System.out.println("Loading...");
                // Create a reference to the file to read in
                FileInputStream file = new FileInputStream(FILE_PATH);
                ObjectInputStream in = new ObjectInputStream(file);

                // DO IT!!!!
                in.readObject();
                in.close();

                // And return the instance to the system data 
                return systemData;
            } catch (Exception ex) {
                ex.printStackTrace();
                return null;
            }
        }
        return null;
    }

}
