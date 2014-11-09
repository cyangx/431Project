import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/*
 *
 * @author Nabin
 */
public class ServiceList implements Serializable {
    private static final long serialVersionUID = 1L;
    private List services = new LinkedList();
    private static ServiceList serviceList;

    private ServiceList() {
        
    }

    public static ServiceList instance() {
        if (serviceList == null) {
            return (serviceList = new serviceList());
        } else {
            return serviceList;
        }
    }

    public boolean addService(Service service) {
        services.add(service);
        return true;
    }

    public Iterator getServiceIDs() {
        return Services.iterator();
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

    // returns the product if found
    public Service getService(int ID) {
        for (Iterator iterator = services.iterator(); iterator.hasNext();) {
            Service service = (Service) iterator.next();
            //if (ID.equals(service.getId())) {
            if(ID == service.getId()){
                return service;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return services.toString();
    }   
    
    // delete method, update provider(), Validate (ID)
}
