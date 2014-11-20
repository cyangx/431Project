/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg431;

import java.io.File;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Garrett
 */
public class ServiceRecordListTest {
    
    public ServiceRecordListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        File f = new File(ServiceRecordList.FILE_PATH);
        if(f.exists() && !f.isDirectory())
        {
            f.delete();
        }
        /**
         * Set up test data
         */
        Provider myProvider = new Provider("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301", "bank", "123");
        Member myMember = new Member("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301");
        Service myService = new Service("Test Name", 1, 500.59);
        Date myDate = new Date();
        ServiceRecordList instance = ServiceRecordList.getInstance();
        instance.CaptureService(myProvider, myMember, myService, myDate, "test");
        instance.CaptureService(myProvider, myMember, myService, myDate, "test");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getInstance method, of class ServiceRecordList.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        ServiceRecordList expResult = null;
        ServiceRecordList result = ServiceRecordList.getInstance();
        assertFalse(result.equals(expResult));
    }

    /**
     * Test of getServiceRecords method, of class ServiceRecordList.
     */
    @Test
    public void testGetServiceRecords() {
        
        System.out.println("getServiceRecords");
        
        Iterator<ServiceRecord> it = ServiceRecordList.getInstance().getServiceRecords();
        int result = 0;
        while(it.hasNext())
        {
            it.next();
            result++;
        }
        assertTrue(result > 0);
    }

    /**
     * Test of CaptureService method, of class ServiceRecordList.
     */
    @Test
    public void testCaptureService() {
        
        System.out.println("CaptureService");
        Provider myProvider = new Provider("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301", "bank", "123");
        Member myMember = new Member("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301");
        Service myService = new Service("Test Name", 1, 500.59);
        Date myDate = new Date();
        ServiceRecordList instance = ServiceRecordList.getInstance();
        int expResult = 0;
        Iterator<ServiceRecord> it1 = ServiceRecordList.getInstance().getServiceRecords();
        while (it1.hasNext()) {
            it1.next();
            expResult++;
        }
        expResult++;
        instance.CaptureService(myProvider, myMember, myService, myDate, "test");
        
        
        Iterator<ServiceRecord> it = ServiceRecordList.getInstance().getServiceRecords();
        
        List<ServiceRecord> srl = new LinkedList<>();
        
        while (it.hasNext()) {
            srl.add(it.next());
        }
        
        assertTrue(srl.size() == expResult);
    }

    /**
     * Test of RemoveServiceRecord method, of class ServiceRecordList.
     */
    @Test
    public void testRemoveServiceRecord() {
        System.out.println("RemoveServiceRecord");
        ServiceRecordList instance = ServiceRecordList.getInstance();
        Iterator<ServiceRecord> it = ServiceRecordList.getInstance().getServiceRecords();
        List<ServiceRecord> srl = new LinkedList<>();
        int count = 0;
        while (it.hasNext()) {
            srl.add(it.next());
            count++;
        }
        
        instance.RemoveServiceRecord(srl.get(0));
        int result = 0;
        int expRes = count - 1 ;
        Iterator<ServiceRecord> it2 = ServiceRecordList.getInstance().getServiceRecords();
        while (it2.hasNext()) {
            it2.next();
            result++;
        }
        assertTrue(result == expRes);
    }

    /**
     * Test of save method, of class ServiceRecordList.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        boolean expResult = false;
        ServiceRecordList.save();
        File f = new File(ServiceRecordList.FILE_PATH);
        assertTrue(f.exists() && !f.isDirectory());
    }

    /**
     * Test of load method, of class ServiceRecordList.
     */
    @Test
    public void testLoad() {
        System.out.println("load");
        
        ServiceRecordList result = ServiceRecordList.load();
        ServiceRecordList expResult = ServiceRecordList.getInstance();
        assertEquals(expResult, result);
    }
    
}
