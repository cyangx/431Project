
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
/**
 *
 * @author Garrett
 */
public class ServiceRecordList {
    private static ServiceRecordList instance;
    private List<ServiceRecord> serviceRecords;
    
    private ServiceRecordList()
    {
        serviceRecords = new ArrayList<ServiceRecord>();
    }
    /**
     * 
     * @return Instance of the ServiceRecordList singleton
     */
    public ServiceRecordList getInstance()
    {
        if(instance == null)
        {
            instance = new ServiceRecordList();
        }
        return instance;
    }
    /**
     * Gets an iterator for the list
     * @return Iterator for list
     */
    public Iterator<ServiceRecord> getServiceRecords()
    {
        return this.serviceRecords.iterator();
    }
    /**
     * Captures a service performed by a provider
     * @param provider
     * @param member
     * @param service 
     */
    public void CaptureService(Provider provider, Member member, Service service)
    {
        this.serviceRecords.add(new ServiceRecord(provider, member, service));
    }
    
}
