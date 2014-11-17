package pkg431;

import java.util.*;
import java.io.*;

/**
 * Service Record Class
 * Records a service being provided by a provider
 * for a member
 * @author Garrett 
 */
public class ServiceRecord implements Serializable {

    private static final long serialVersionUID = 1L;
    private Provider _provider;
    private Member _member;
    private Service _service;
    private Date _billDate;
    private Date _serviceDate;
    private String _comments;
    
    /**
     * The ServiceRecord constructor, creates copies of the inputs
     * @param provider Provider to record
     * @param member Member to record
     * @param service Service to record
     * @param serviceDate
     * @param comments
     */
    public ServiceRecord(Provider provider, Member member, Service service, Date serviceDate, String comments)
    {
        // TODO: Add a copy method to these classes
        _provider = new Provider(provider.getProviderName(),
                provider.getId(), 
                provider.getAddress(), 
                provider.getCity(),
                provider.getState(),
                provider.getZipcode(),
                provider.getBankAccountName(),
                provider.getBankAccountNum());
        _member = new Member(member.getName(), 
                member.getID(), 
                member.getAddress(), 
                member.getCity(), 
                member.getState(), 
                member.getZipcode());
        _service = new Service(service.getServiceName(), 
                service.getID(), 
                service.getServiceCost());
        _billDate = new Date();    
        _serviceDate = serviceDate;
        _comments = comments;
    }

    /**
     * @return the _provider
     */
    public Provider getProvider() {
        return _provider;
    }

    /**
     * @return the _member
     */
    public Member getMember() {
        return _member;
    }

    /**
     * @return the _service
     */
    public Service getService() {
        return _service;
    }

    /**
     * @return the _billDate
     */
    public Date getBillDate() {
        return _billDate;
    }

    /**
     * @param _billDate the _billDate to set
     */
    public void setBillDate(Date _billDate) {
        this._billDate = _billDate;
    }

    /**
     * @return the _serviceDate
     */
    public Date getServiceDate() {
        return _serviceDate;
    }
    
    /**
     * @return the comments
     */
    public String getComments(){
        return _comments;
    }

}
