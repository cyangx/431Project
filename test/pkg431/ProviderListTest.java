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
public class ProviderListTest {
    
    public ProviderListTest() {
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
     * Test of instance method, of class ProviderList.
     */
    @Test
    public void testInstance() {
        System.out.println("instance");
        ProviderList expResult = null;
        ProviderList result = ProviderList.instance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProvider method, of class ProviderList.
     */
    @Test
    public void testAddProvider() {
        System.out.println("addProvider");
        Provider provider = null;
        ProviderList instance = null;
        boolean expResult = false;
        boolean result = instance.addProvider(provider);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProviderIDs method, of class ProviderList.
     */
    @Test
    public void testGetProviderIDs() {
        System.out.println("getProviderIDs");
        ProviderList instance = null;
        Iterator<Provider> expResult = null;
        Iterator<Provider> result = instance.getProviderIDs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProvider method, of class ProviderList.
     */
    @Test
    public void testGetProvider() {
        System.out.println("getProvider");
        int ID = 0;
        ProviderList instance = null;
        Provider expResult = null;
        Provider result = instance.getProvider(ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validate method, of class ProviderList.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        int ID = 0;
        ProviderList instance = null;
        boolean expResult = false;
        boolean result = instance.validate(ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ProviderList.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int ID = 0;
        ProviderList instance = null;
        instance.delete(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class ProviderList.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int ID = 0;
        String name = "";
        String address = "";
        String city = "";
        String state = "";
        String zipCode = "";
        ProviderList instance = null;
        instance.update(ID, name, address, city, state, zipCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateBankAccount method, of class ProviderList.
     */
    @Test
    public void testUpdateBankAccount() {
        System.out.println("updateBankAccount");
        int ID = 0;
        String bankName = "";
        String accNum = "";
        ProviderList instance = null;
        instance.updateBankAccount(ID, bankName, accNum);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class ProviderList.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        boolean expResult = false;
        boolean result = ProviderList.save();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of load method, of class ProviderList.
     */
    @Test
    public void testLoad() {
        System.out.println("load");
        ProviderList expResult = null;
        ProviderList result = ProviderList.load();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
