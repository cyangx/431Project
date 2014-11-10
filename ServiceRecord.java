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
    
    public ServiceRecord(Provider provider, Member member, Service service)
    {
        _provider = provider;
        _member = member;
        _service = service;
        _billDate = new Date();      
    }

    /**
     * @return the _provider
     */
    public Provider getProvider() {
        return _provider;
    }

    /**
     * @param _provider the _provider to set
     */
    public void setProvider(Provider _provider) {
        this._provider = _provider;
    }

    /**
     * @return the _member
     */
    public Member getMember() {
        return _member;
    }

    /**
     * @param _member the _member to set
     */
    public void setMember(Member _member) {
        this._member = _member;
    }

    /**
     * @return the _service
     */
    public Service getService() {
        return _service;
    }

    /**
     * @param _service the _service to set
     */
    public void setService(Service _service) {
        this._service = _service;
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
     * @param _serviceDate the _serviceDate to set
     */
    public void setServiceDate(Date _serviceDate) {
        this._serviceDate = _serviceDate;
    }
}
