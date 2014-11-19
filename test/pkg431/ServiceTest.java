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
    
    private final static int NAME_LENGTH = 20;
    private final static double MAX_FEE = 999.99;
    
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
     * Tests the constructor's truncation code
     */
    @Test
    public void testConstructorTruncation()
    {
        System.out.println("Constructor Truncation");
        Service myService = new Service("This name is too long for the constructor", 1, 100000.01);
        assertTrue(NAME_LENGTH == myService.getServiceName().length()
                    && MAX_FEE == myService.getServiceCost());
    }
    /**
     * Test of getServiceName method, of class Service.
     */
    @Test
    public void testGetServiceName() {
        System.out.println("getServiceName");
        Service instance = new Service("Test Name", 1, 500.59);
        String expResult = "Test Name";
        String result = instance.getServiceName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getServiceCost method, of class Service.
     */
    @Test
    public void testGetServiceCost() {
        System.out.println("getServiceCost");
        Service instance = new Service("Test Name", 1, 500.59);
        double expResult = 500.59;
        double result = instance.getServiceCost();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getID method, of class Service.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Service instance = new Service("Test Name", 1, 500.59);
        int expResult = 1;
        int result = instance.getID();
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class Service.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        String _name = "Test";
        double _fee = 15.22;
        Service instance = new Service("Test Name", 1, 500.59);
        instance.update(_name, _fee);
        
        assertEquals(_name, instance.getServiceName());
        assertEquals(_fee, instance.getServiceCost(), 0);
        
    }
    
    /**
     * Test of update method, of class Service.
     */
    @Test
    public void testUpdateTruncate() {
        System.out.println("update Truncate");
        String _name = "This should be truncated after update";
        double _fee = MAX_FEE + 100.0256;
        Service instance = new Service("Test Name", 1, 500.59);
        instance.update(_name, _fee);
        
        assertEquals(NAME_LENGTH, instance.getServiceName().length());
        assertEquals(MAX_FEE, instance.getServiceCost(), 0);
        
    }
    
}
