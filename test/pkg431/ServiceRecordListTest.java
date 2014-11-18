/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg431;

import java.util.Date;
import java.util.Iterator;
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
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServiceRecords method, of class ServiceRecordList.
     */
    @Test
    public void testGetServiceRecords() {
        System.out.println("getServiceRecords");
        ServiceRecordList instance = null;
        Iterator<ServiceRecord> expResult = null;
        Iterator<ServiceRecord> result = instance.getServiceRecords();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CaptureService method, of class ServiceRecordList.
     */
    @Test
    public void testCaptureService() {
        System.out.println("CaptureService");
        Provider provider = null;
        Member member = null;
        Service service = null;
        Date date = null;
        String comments = "";
        ServiceRecordList instance = null;
        instance.CaptureService(provider, member, service, date, comments);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RemoveServiceRecord method, of class ServiceRecordList.
     */
    @Test
    public void testRemoveServiceRecord() {
        System.out.println("RemoveServiceRecord");
        ServiceRecord sr = null;
        ServiceRecordList instance = null;
        instance.RemoveServiceRecord(sr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class ServiceRecordList.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        boolean expResult = false;
        boolean result = ServiceRecordList.save();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of load method, of class ServiceRecordList.
     */
    @Test
    public void testLoad() {
        System.out.println("load");
        ServiceRecordList expResult = null;
        ServiceRecordList result = ServiceRecordList.load();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
