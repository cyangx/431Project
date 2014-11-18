/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg431;

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
public class ServiceTest {
    
    public ServiceTest() {
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
     * Test of getServiceName method, of class Service.
     */
    @Test
    public void testGetServiceName() {
        System.out.println("getServiceName");
        Service instance = null;
        String expResult = "";
        String result = instance.getServiceName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServiceCost method, of class Service.
     */
    @Test
    public void testGetServiceCost() {
        System.out.println("getServiceCost");
        Service instance = null;
        double expResult = 0.0;
        double result = instance.getServiceCost();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class Service.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Service instance = null;
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Service.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        String _name = "";
        double _fee = 0.0;
        Service instance = null;
        instance.update(_name, _fee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
