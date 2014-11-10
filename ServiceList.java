import java.util.*;
import java.io.*;

/*
 *
 * @author Nabin
 */
public class ServiceList implements Serializable {
    private static final long serialVersionUID = 1L;
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
    
     public boolean validate(int ID){
        for (Service service : _services) {
            if(ID == service.getID()){
                return true;
            }
        }
        return false;
    }
     
    public void delete(int ID)
    {
        this._services.remove(this.getService(ID));
    }
    
    public void update(int ID, String Name, double fee)
    {
        Service myService = this.getService(ID);
        if(myService != null)
        {
            myService.update(Name, fee);
        }
    }

}
