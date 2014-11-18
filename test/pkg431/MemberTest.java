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
public class MemberTest {
    
    public MemberTest() {
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
     * Test of update method, of class Member.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        String Name = "";
        String Address = "";
        String City = "";
        String State = "";
        String ZipCode = "";
        Member instance = null;
        instance.update(Name, Address, City, State, ZipCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Member.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Member instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class Member.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Member instance = null;
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class Member.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Member instance = null;
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCity method, of class Member.
     */
    @Test
    public void testGetCity() {
        System.out.println("getCity");
        Member instance = null;
        String expResult = "";
        String result = instance.getCity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getState method, of class Member.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        Member instance = null;
        String expResult = "";
        String result = instance.getState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZipcode method, of class Member.
     */
    @Test
    public void testGetZipcode() {
        System.out.println("getZipcode");
        Member instance = null;
        String expResult = "";
        String result = instance.getZipcode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSuspend method, of class Member.
     */
    @Test
    public void testIsSuspend() {
        System.out.println("isSuspend");
        Member instance = null;
        boolean expResult = false;
        boolean result = instance.isSuspend();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSuspendStatus method, of class Member.
     */
    @Test
    public void testSetSuspendStatus() {
        System.out.println("setSuspendStatus");
        boolean _suspendStatus = false;
        Member instance = null;
        instance.setSuspendStatus(_suspendStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
