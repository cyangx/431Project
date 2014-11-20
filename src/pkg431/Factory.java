package pkg431;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Factory for Member, Provider, and Service Creation
 * @author Garrett
 * @since 11/7/14
 */
public class Factory implements Serializable {

    // TODO: Possibly change ID's to strings, ensuring leading zeros are added to fill full size
    private static final long serialVersionUID = 1L;
    private static final String FILE_PATH = "./SaveFiles/Factory";
    private int _memberID; // ID for member creation
    private int _providerID; // ID for provider creation
    private int _serviceID; // ID for service creation
    private static Factory _factory;

    private Factory() {
        _memberID = 1; // ID for member creation
        _providerID = 1; // ID for provider creation
        _serviceID = 1; // ID for service creation
    }

    public static Factory getInstance() {
        if (_factory == null) {
            _factory = new Factory();
        }
        return _factory;
    }

    /**
     * This method is used to Create members The method is synchronized to
     * eliminate the possibility of creating members with the same ID
     *
     * @param Name, the name of the member
     * @param Address, the street address of the member
     * @param City, the city of the member
     * @param State, the 2 digit state code of the member
     * @param ZipCode, the Zip code of the member
     * @return The new member
     */
    public synchronized Member MakeMember(String Name, String Address, String City, String State, String ZipCode) {
        Member result = new Member(Name, _memberID, Address, City, State, ZipCode);
        _memberID++;
        Factory.save();
        return result;
    }

    /**
     * This method is used to Create Providers The method is synchronized to
     * eliminate the possibility of creating providers with the same ID
     *
     * @param Name, the name of the provider
     * @param Address, the street address of the provider
     * @param City, the city of the provider
     * @param State, the two digit state code of the provider
     * @param ZipCode, the zip code of the provider
     * @return The new Provider
     */
    public synchronized Provider MakeProvider(String Name, String Address, String City, String State, String ZipCode, String bankName, String accNumber) {
        Provider result = new Provider(Name, _providerID, Address, City, State, ZipCode, bankName, accNumber);
        _providerID++;
        Factory.save();
        return result;
    }

    /**
     * This method is used to Create Services The method is synchronized to
     * eliminate the possibility of creating services with the same ID
     *
     * @param Name, the name of the service
     * @param Fee, the fee of the service
     * @return the new Service
     */
    public synchronized Service MakeService(String Name, double Fee) {
        Service result = new Service(Name, _serviceID, Fee);
        _serviceID++;
        Factory.save();
        return result;
    }

    private void writeObject(java.io.ObjectOutputStream output) {
        try {
            output.defaultWriteObject();
            output.writeObject(_factory);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    private void readObject(java.io.ObjectInputStream input) {
        try {
            if (_factory != null) {
                return;
            } else {
                input.defaultReadObject();
                if (_factory == null) {
                    _factory = (Factory) input.readObject();
                } else {
                    input.readObject();
                }
            }
        } catch (IOException ioe) {
            System.out.println("in Factory readObject \n" + ioe);
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }
    }

    /**
     * Save the systemData object structure to a file, for later deserialization
     *
     * @return True if the serialization completed successfully
     */
    public static boolean save() {
        try {
            // First off, create the stream used for writing bytes
            FileOutputStream file = new FileOutputStream(FILE_PATH);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Then write the instance out to the file
            out.writeObject(_factory);
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
    public static Factory load() {
        File f = new File(FILE_PATH);
        if (f.exists() && !f.isDirectory()) { /* do something */

            try {

                // Create a reference to the file to read in
                FileInputStream file = new FileInputStream(FILE_PATH);
                ObjectInputStream in = new ObjectInputStream(file);

                // DO IT!!!!
                in.readObject();
                in.close();

                // And return the instance to the memberList
                return _factory;
            } catch (Exception ex) {
                ex.printStackTrace();
                return null;
            }
        }
        return null;
    }
}
