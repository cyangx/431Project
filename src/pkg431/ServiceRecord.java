package pkg431;

import java.util.*;
import java.io.*;

/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
/**
 *
 * @author Garrett
 */
public class ServiceRecord {
    private Provider _provider;
    private Member _member;
    private Service _service;
    private Date _billDate;
    private Date _serviceDate;
    
    public ServiceRecord(Provider provider, Member member, Service service, Date serviceDate)
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

}
