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
public class FactoryTest {
    
    public FactoryTest() {
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
     * Test of getInstance method, of class Factory.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        Factory expResult = null;
        Factory result = Factory.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MakeMember method, of class Factory.
     */
    @Test
    public void testMakeMember() {
        System.out.println("MakeMember");
        String Name = "";
        String Address = "";
        String City = "";
        String State = "";
        String ZipCode = "";
        Factory instance = null;
        Member expResult = null;
        Member result = instance.MakeMember(Name, Address, City, State, ZipCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MakeProvider method, of class Factory.
     */
    @Test
    public void testMakeProvider() {
        System.out.println("MakeProvider");
        String Name = "";
        String Address = "";
        String City = "";
        String State = "";
        String ZipCode = "";
        String bankName = "";
        String accNumber = "";
        Factory instance = null;
        Provider expResult = null;
        Provider result = instance.MakeProvider(Name, Address, City, State, ZipCode, bankName, accNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MakeService method, of class Factory.
     */
    @Test
    public void testMakeService() {
        System.out.println("MakeService");
        String Name = "";
        double Fee = 0.0;
        Factory instance = null;
        Service expResult = null;
        Service result = instance.MakeService(Name, Fee);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class Factory.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        boolean expResult = false;
        boolean result = Factory.save();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of load method, of class Factory.
     */
    @Test
    public void testLoad() {
        System.out.println("load");
        Factory expResult = null;
        Factory result = Factory.load();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
