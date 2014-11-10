import java.util.*;
import java.io.*;

/**
 *
 * @author Brandon
 */
public class ProviderList implements Serializable {
    private static final long serialVersionUID = 1L;
    private List providers = new LinkedList();
    private static ProviderList providerList;

    private ProviderList() {
        
    }

    public static ProviderList instance() {
        if (providerList == null) {
            return (providerList = new ProviderList());
        } else {
            return providerList;
        }
    }

    public boolean addProvider(Provider provider) {
        providers.add(provider);
        return true;
    }

    public Iterator getProviderIDs() {
        return providers.iterator();
    }

    private void writeObject(java.io.ObjectOutputStream output) {
        try {
            output.defaultWriteObject();
            output.writeObject(providerList);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

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
            System.out.println("in Catalog readObject \n" + ioe);
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }
    }

    // returns the provider if found
    public Provider getProvider(int ID) {
        for (Iterator iterator = providers.iterator(); iterator.hasNext();) {
            Provider provider = (Provider) iterator.next();
            if(ID == provider.getId()){
                return provider;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return providers.toString();
    }   
    
    public boolean validate(int ID){
        for (Iterator iterator = providers.iterator(); iterator.hasNext();) {
            Provider provider = (Provider) iterator.next();
            if(ID == provider.getId()){
                return true;
            }
        }
        return false;
    }
    
    public void delete(int ID)
    {
        this.providers.remove(this.getProvider(ID));
    }
}