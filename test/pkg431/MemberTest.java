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

    /**
     * Set up members
     */
    Member myMember1, myMember2, myMember3,
            myMember4, myMember5;

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
        myMember1 = new Member("This name is too long for the constructor", 1, "This address is too long for the constructor", "This is a really big city name", "AAZ", "5637778");
        myMember2 = new Member(null, 2, null, null, null, null);
        myMember3 = new Member("This is twenty five chars", 3, "This is twenty five chars", "Thisisfourteen", "AZ", "56377");
        myMember4 = new Member("Test Name", 4, "Test Address", "St. Cloud", "MN", "56301");
        myMember5 = new Member("", 5, "", "", "", "");

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
        myMember1.update(Name, Address, City, State, ZipCode);
        assertNotNull(myMember1);
        assertEquals(Name, myMember1.getName());
        assertEquals(Address, myMember1.getAddress());
        assertEquals(City, myMember1.getCity());
        assertEquals(State, myMember1.getState());
        assertEquals(ZipCode, myMember1.getZipcode());

    }

    /**
     * Test of getName method, of class Member.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Test Name";
        String result = myMember4.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getID method, of class Member.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        int expResult = 5;
        int result = myMember5.getID();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAddress method, of class Member.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        String expResult = "Test Address";
        String result = myMember4.getAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCity method, of class Member.
     */
    @Test
    public void testGetCity() {
        System.out.println("getCity");
        String expResult = "St. Cloud";
        String result = myMember4.getCity();
        assertEquals(expResult, result);
    }

    /**
     * Test of getState method, of class Member.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        String expResult = "MN";
        String result = myMember4.getState();
        assertEquals(expResult, result);
    }

    /**
     * Test of getZipcode method, of class Member.
     */
    @Test
    public void testGetZipcode() {
        System.out.println("getZipcode");
        String expResult = "56301";
        String result = myMember4.getZipcode();
        assertEquals(expResult, result);
    }

    /**
     * Test of isSuspend method, of class Member.
     */
    @Test
    public void testIsSuspend() {
        // Member is not suspended
        System.out.println("isSuspend");
        boolean expResult = false;
        boolean result = myMember4.isSuspend();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSuspendStatus method, of class Member.
     */
    @Test
    public void testSetSuspendStatus() {
        System.out.println("setSuspendStatus");
        boolean _suspendStatus = true;
        myMember4.setSuspendStatus(_suspendStatus);
        boolean result = myMember4.isSuspend();
        assertEquals(_suspendStatus, result);

    }

}
