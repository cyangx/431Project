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
 * @author Cha
 *
 */
public class MemberListTest {

    public MemberListTest() {
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
     * Test of instance method, of class MemberList.
     */
    @Test
    public void testInstance() {
        System.out.println("instance");
        MemberList result = MemberList.instance();
        assertNotNull(result);
    }

    /**
     * Test of addMember method, of class MemberList.
     */
    @Test
    public void testAddMember() {
        System.out.println("addMember");
        Member member = new Member("Test Name", 6, "Test Address", "St. Cloud", "MN", "56301");
        MemberList instance = MemberList.instance();
        boolean expResult = true;
        boolean result = instance.addMember(member);
        assertEquals(expResult, result);
    }

    /**
     * Test of getMember method, of class MemberList.
     */
    @Test
    public void testGetMember() {
        System.out.println("getMember");
        int ID = 6;
        MemberList instance = MemberList.instance();
        Member member = new Member("Test Name", 6, "Test Address", "St. Cloud", "MN", "56301");
        instance.addMember(member);
        Member result = instance.getMember(ID);
        // Get the member with ID 6
        assertEquals(ID, result.getID());
    }

    /**
     * Test of getMembers method, of class MemberList.
     */
    @Test
    public void testGetMembers() {
        System.out.println("getMembers");
//        MemberList instance = null;
//        Iterator<Member> expResult = null;
//        Iterator<Member> result = instance.getMembers();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of validate method, of class MemberList.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        int ID = 6;
        MemberList instance = MemberList.instance();
        Member member = new Member("Test Name", 6, "Test Address", "St. Cloud", "MN", "56301");
        instance.addMember(member);
        boolean expResult = true;
        boolean result = instance.validate(ID);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class MemberList.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int ID = 3;
        MemberList instance = MemberList.instance();
        Member member = new Member("Test Name", ID, "Test Address", "St. Cloud", "MN", "56301");
        instance.addMember(member);
        Member expResult = null;
        instance.delete(ID);
        Member result = instance.getMember(ID);
        assertEquals(expResult, result);
    }

    /**
     * Test of updateMember method, of class MemberList.
     */
    @Test
    public void testUpdateMember() {
        System.out.println("updateMember");
        Member member = new Member("", 1, "", "", "", "");

        int ID = 1;
        String Name = "Bob";
        String Address = "123 Fake St";
        String City = "St Cloud";
        String State = "MN";
        String ZipCode = "56304";
        MemberList instance = MemberList.instance();
        instance.addMember(member);
        instance.updateMember(ID, Name, Address, City, State, ZipCode);

        assertEquals(Name, member.getName());
        assertEquals(Address, member.getAddress());
        assertEquals(City, member.getCity());
        assertEquals(State, member.getState());
        assertEquals(ZipCode, member.getZipcode());

    }

    /**
     * Test of save method, of class MemberList.
     */
    @Test
    public void testSave() {
        System.out.println("save");
//        boolean expResult = false;
//        boolean result = MemberList.save();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of load method, of class MemberList.
     */
    @Test
    public void testLoad() {
        System.out.println("load");
//        MemberList expResult = null;
//        MemberList result = MemberList.load();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}
