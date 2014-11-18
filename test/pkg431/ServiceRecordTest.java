/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg431;

import java.util.Date;
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
public class ServiceRecordTest {
    
    public ServiceRecordTest() {
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
     * Test of getProvider method, of class ServiceRecord.
     */
    @Test
    public void testGetProvider() {
        System.out.println("getProvider");
        ServiceRecord instance = null;
        Provider expResult = null;
        Provider result = instance.getProvider();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMember method, of class ServiceRecord.
     */
    @Test
    public void testGetMember() {
        System.out.println("getMember");
        ServiceRecord instance = null;
        Member expResult = null;
        Member result = instance.getMember();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getService method, of class ServiceRecord.
     */
    @Test
    public void testGetService() {
        System.out.println("getService");
        ServiceRecord instance = null;
        Service expResult = null;
        Service result = instance.getService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBillDate method, of class ServiceRecord.
     */
    @Test
    public void testGetBillDate() {
        System.out.println("getBillDate");
        ServiceRecord instance = null;
        Date expResult = null;
        Date result = instance.getBillDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBillDate method, of class ServiceRecord.
     */
    @Test
    public void testSetBillDate() {
        System.out.println("setBillDate");
        Date _billDate = null;
        ServiceRecord instance = null;
        instance.setBillDate(_billDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServiceDate method, of class ServiceRecord.
     */
    @Test
    public void testGetServiceDate() {
        System.out.println("getServiceDate");
        ServiceRecord instance = null;
        Date expResult = null;
        Date result = instance.getServiceDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComments method, of class ServiceRecord.
     */
    @Test
    public void testGetComments() {
        System.out.println("getComments");
        ServiceRecord instance = null;
        String expResult = "";
        String result = instance.getComments();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
