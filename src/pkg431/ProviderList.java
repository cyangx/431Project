package pkg431;

/**
 * @author Brandon Theisen
 */
/*
 ProviderList.java
 Description: Manages the provider list
 ProviderList accesses the functionality of Provider.java
 and passes data to it for instantiation or updating.
 The list has the ability to add, remove and update providers.
 Also contains methods for serializing and deserializing the information
 Information is stored/retrieved via a linked list.
 */

import java.util.*;
import java.io.*;

public class ProviderList implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final String FILE_PATH = "./SaveFiles/ProviderList";
    private List<Provider> providers = new LinkedList<>();
    private static ProviderList providerList;

    private ProviderList() {

    }

    //Singleton instantiation
    //If the list doesn't already exist, create it
    //If it does, return the list and do not instantiate another.
    public static ProviderList instance() {
        if (providerList == null) {
            return (providerList = new ProviderList());
        } else {
            return providerList;
        }
    }

    //Adds a provider to the current list.
    public boolean addProvider(Provider provider) {
        providers.add(provider);
        ProviderList.save();
        return true;
    }

    //Returns a list of provider ID's.
    public Iterator<Provider> getProviderIDs() {
        return providers.iterator();
    }

    //Writes the information to a file using the ObjectOutputStream
    private void writeObject(java.io.ObjectOutputStream output) {
        try {
            output.defaultWriteObject();
            output.writeObject(providerList);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    //Deserializes the information from the file using ObjectInputStream.
    private void readObject(java.io.ObjectInputStream input) {
        try {
            if (providerList != null) {
                return;
            } else {
                input.defaultReadObject();
                if (providerList == null) {
                    providerList = (ProviderList) input.readObject();
                } else {
                    input.readObject();
                }
            }
        } catch (IOException ioe) {
            System.out.println("in ProviderList readObject \n" + ioe);
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }
    }

    // returns the provider if found
    public Provider getProvider(int ID) {
        for (Iterator iterator = providers.iterator(); iterator.hasNext();) {
            Provider provider = (Provider) iterator.next();
            if (ID == provider.getId()) {
                return provider;
            }
        }
        return null;
    }

    //Returns a boolean value of whether or not the provider ID exists
    public boolean validate(int ID) {
        for (Provider provider : providers) {
            if (ID == provider.getId()) {
                return true;
            }
        }
        return false;
    }

    //Removes the provider from the list by ID
    public void delete(int ID) {
        this.providers.remove(this.getProvider(ID));
        ProviderList.save();
    }

    //Locates the provider by ID
    //And is used to update the name, address, city, state and zip
    public void update(int ID, String name, String address, String city, String state, String zipCode) {
        Provider myProvider = this.getProvider(ID);
        if (null != myProvider) {
            myProvider.update(name, address, city, state, zipCode);
        }
        ProviderList.save();
    }

    //Locates the provider by id
    //And is used to update the bank name and account number
    public void updateBankAccount(int ID, String bankName, String accNum) {
        Provider myProvider = this.getProvider(ID);
        if (null != myProvider) {
            myProvider.updateBankAccount(bankName, accNum);
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
            out.writeObject(providerList);
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
    public static ProviderList load() {
        File f = new File(FILE_PATH);
        if (f.exists() && !f.isDirectory()) {
            try {

                // Create a reference to the file to read in
                FileInputStream file = new FileInputStream(FILE_PATH);
                ObjectInputStream in = new ObjectInputStream(file);

                // DO IT!!!!
                in.readObject();
                in.close();

                // And return the instance to the memberList
                return providerList;
            } catch (Exception ex) {
                ex.printStackTrace();
                return null;
            }
        }
        return null;
    }
}
