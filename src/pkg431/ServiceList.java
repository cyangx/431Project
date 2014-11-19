package pkg431;

import java.beans.XMLEncoder;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 *
 * @author Nabin
 */
public class ServiceList implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final String FILE_PATH = "./SaveFiles/ServiceList";
    private List<Service> _services = new LinkedList<>();
    private static ServiceList serviceList;

    private ServiceList() {
    }

    public static ServiceList instance() {
        if (serviceList == null) {
            return (serviceList = new ServiceList());
        } else {
            return serviceList;
        }
    }

    public boolean addService(Service service) {
        _services.add(service);
        ServiceList.save();
        return true;
    }

    private void writeObject(java.io.ObjectOutputStream output) {
        try {
            output.defaultWriteObject();
            output.writeObject(serviceList);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    private void readObject(java.io.ObjectInputStream input) {
        try {
            if (serviceList != null) {
                return;
            } else {
                input.defaultReadObject();
                if (serviceList == null) {
                    serviceList = (ServiceList) input.readObject();
                } else {
                    input.readObject();
                }
            }
        } catch (IOException ioe) {
            System.out.println("in ServiceList readObject \n" + ioe);
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }
    }

    // returns the service if found
    public Service getService(int ID) {
        for (Iterator iterator = _services.iterator(); iterator.hasNext();) {
            Service service = (Service) iterator.next();
            if (ID == service.getID()) {
                return service;
            }
        }
        return null;
    }

    public Iterator<Service> getServiceDirectory() {
        return this._services.iterator();
    }
    
    public String getServiceDirectoryText()
    {
        String result = new String();
        Iterator<Service> it = this.getServiceDirectory();
        while(it.hasNext())
        {
            Service myService = it.next();
            result += myService.getID() + " " + myService.getServiceName() +
                    " " + myService.getServiceCost() + System.lineSeparator();
        }
        return result;
    }

    public boolean validate(int ID) {
        for (Service service : _services) {
            if (ID == service.getID()) {
                return true;
            }
        }
        return false;
    }

    public void delete(int ID) {
        this._services.remove(this.getService(ID));
        ServiceList.save();
    }

    public void update(int ID, String Name, double fee) {
        Service myService = this.getService(ID);
        if (myService != null) {
            myService.update(Name, fee);
        }
        ServiceList.save();
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
            out.writeObject(serviceList);
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
    public static ServiceList load() {
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
                return serviceList;
            } catch (Exception ex) {
                ex.printStackTrace();
                return null;
            }
        }
        return null;
    }

}
