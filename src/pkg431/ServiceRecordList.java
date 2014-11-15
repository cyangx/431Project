package pkg431;

import java.util.*;
import java.io.*;

/**
 *
 * @author Garrett
 */
public class ServiceRecordList implements Serializable {

    private static final long serialVersionUID = 1L;
    private static ServiceRecordList instance;
    private List<ServiceRecord> serviceRecords = new LinkedList<>();

    private ServiceRecordList() {
    }

    /**
     *
     * @return Instance of the ServiceRecordList singleton
     */
    public static ServiceRecordList getInstance() {
        if (instance == null) {
            instance = new ServiceRecordList();
        }
        return instance;
    }

    /**
     * Gets an iterator for the list
     *
     * @return Iterator for list
     */
    public Iterator<ServiceRecord> getServiceRecords() {
        return this.serviceRecords.iterator();
    }

    /**
     * Captures a service performed by a provider
     *
     * @param provider
     * @param member
     * @param service
     */
    public void CaptureService(Provider provider, Member member, Service service, Date date) {
        this.serviceRecords.add(new ServiceRecord(provider, member, service, date));
    }

    /**
     * Removes a service Record from the list
     *
     * @param sr
     */
    public void RemoveServiceRecord(ServiceRecord sr) {
        this.serviceRecords.remove(sr);
    }
    
    private void writeObject(java.io.ObjectOutputStream output) {
        try {
            output.defaultWriteObject();
            output.writeObject(instance);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
    private void readObject(java.io.ObjectInputStream input) {
        try {
            if (instance != null) {
                return;
            } else {
                input.defaultReadObject();
                if (instance == null) {
                    instance = (ServiceRecordList) input.readObject();
                } else {
                    input.readObject();
                }
            }
        } catch (IOException ioe) {
            System.out.println("in ServiceRecordList readObject \n" + ioe);
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }
    }

}
