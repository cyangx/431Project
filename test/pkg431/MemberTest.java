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
 * @author Cha
 *
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
        String Name = "Bob";
        String Address = "123 Fake St";
        String City = "St Cloud";
        String State = "MN";
        String ZipCode = "56304";

        Member instance = new Member("", 1, "", "", "", "");
        instance.update(Name, Address, City, State, ZipCode);

        assertNotNull(instance);
        assertEquals(Name, instance.getName());
        assertEquals(Address, instance.getAddress());
        assertEquals(City, instance.getCity());
        assertEquals(State, instance.getState());
        assertEquals(ZipCode, instance.getZipcode());

    }

    /**
     * Test of getName method, of class Member.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Member instance = new Member("Test Name", 6, "Test Address", "St. Cloud", "MN", "56301");
        String expResult = "Test Name";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getID method, of class Member.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Member instance = new Member("Test Name", 6, "Test Address", "St. Cloud", "MN", "56301");
        int expResult = 6;
        int result = instance.getID();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAddress method, of class Member.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Member instance = new Member("Test Name", 6, "Test Address", "St. Cloud", "MN", "56301");
        String expResult = "Test Address";
        String result = instance.getAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCity method, of class Member.
     */
    @Test
    public void testGetCity() {
        System.out.println("getCity");
        Member instance = new Member("Test Name", 6, "Test Address", "St. Cloud", "MN", "56301");
        String expResult = "St. Cloud";
        String result = instance.getCity();
        assertEquals(expResult, result);
    }

    /**
     * Test of getState method, of class Member.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        Member instance = new Member("Test Name", 6, "Test Address", "St. Cloud", "MN", "56301");
        String expResult = "MN";
        String result = instance.getState();
        assertEquals(expResult, result);
    }

    /**
     * Test of getZipcode method, of class Member.
     */
    @Test
    public void testGetZipcode() {
        System.out.println("getZipcode");
        Member instance = new Member("Test Name", 6, "Test Address", "St. Cloud", "MN", "56301");
        String expResult = "56301";
        String result = instance.getZipcode();
        assertEquals(expResult, result);
    }

    /**
     * Test of isSuspend method, of class Member.
     */
    @Test
    public void testIsSuspend() {
        // Member is not suspended
        System.out.println("isSuspend");
        Member instance = new Member("Test Name", 6, "Test Address", "St. Cloud", "MN", "56301");
        boolean expResult = false;
        boolean result = instance.isSuspend();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSuspendStatus method, of class Member.
     */
    @Test
    public void testSetSuspendStatus() {
        System.out.println("setSuspendStatus");
        boolean _suspendStatus = true;
        Member instance = new Member("Test Name", 6, "Test Address", "St. Cloud", "MN", "56301");
        instance.setSuspendStatus(_suspendStatus);
        boolean result = instance.isSuspend();
        assertEquals(_suspendStatus, result);

    }

}
