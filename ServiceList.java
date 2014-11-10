import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


/*
 *
 * @author Nabin
 */
public class ServiceList implements Serializable {
    private static final long serialVersionUID = 1L;
    private List _services = new LinkedList();
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
        return true;
    }

    public Iterator getServices() {
        return _services.iterator();
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
            System.out.println("in Catalog readObject \n" + ioe);
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }
    }

    // returns the service if found
    public Service getService(int ID) {
        for (Iterator iterator = _services.iterator(); iterator.hasNext();) {
            Service service = (Service) iterator.next();
            if(ID == service.getID()){
                return service;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return _services.toString();
    }   
    
    // delete method, update provider(), Validate (ID)
}
