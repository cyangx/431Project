/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg431;

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
public class ServiceListTest {
    
    public ServiceListTest() {
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
     * Test of instance method, of class ServiceList.
     */
    @Test
    public void testInstance() {
        System.out.println("instance");
        ServiceList expResult = null;
        ServiceList result = ServiceList.instance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addService method, of class ServiceList.
     */
    @Test
    public void testAddService() {
        System.out.println("addService");
        Service service = null;
        ServiceList instance = null;
        boolean expResult = false;
        boolean result = instance.addService(service);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getService method, of class ServiceList.
     */
    @Test
    public void testGetService() {
        System.out.println("getService");
        int ID = 0;
        ServiceList instance = null;
        Service expResult = null;
        Service result = instance.getService(ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServiceDirectory method, of class ServiceList.
     */
    @Test
    public void testGetServiceDirectory() {
        System.out.println("getServiceDirectory");
        ServiceList instance = null;
        Iterator<Service> expResult = null;
        Iterator<Service> result = instance.getServiceDirectory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServiceDirectoryText method, of class ServiceList.
     */
    @Test
    public void testGetServiceDirectoryText() {
        System.out.println("getServiceDirectoryText");
        ServiceList instance = null;
        String expResult = "";
        String result = instance.getServiceDirectoryText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validate method, of class ServiceList.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        int ID = 0;
        ServiceList instance = null;
        boolean expResult = false;
        boolean result = instance.validate(ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ServiceList.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int ID = 0;
        ServiceList instance = null;
        instance.delete(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class ServiceList.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int ID = 0;
        String Name = "";
        double fee = 0.0;
        ServiceList instance = null;
        instance.update(ID, Name, fee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class ServiceList.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        boolean expResult = false;
        boolean result = ServiceList.save();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of load method, of class ServiceList.
     */
    @Test
    public void testLoad() {
        System.out.println("load");
        ServiceList expResult = null;
        ServiceList result = ServiceList.load();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
