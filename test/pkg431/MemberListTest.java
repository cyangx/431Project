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
    /**
     * Setup member list and members
     */
    MemberList memberList;
    Member myMember1, myMember2, myMember3,
            myMember4, myMember5;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        memberList = MemberList.instance();
        myMember1 = new Member("This name is too long for the constructor", 1,
                "This address is too long for the constructor",
                "This is a really big city name", "AAZ", "5637778");
        myMember2 = new Member(null, 2, null, null, null, null);
        myMember3 = new Member("This is twenty five chars", 3,
                "This is twenty five chars", "Thisisfourteen", "AZ", "56377");
        myMember4 = new Member("Test Name", 4, "Test Address",
                "St. Cloud", "MN", "56301");
        myMember5 = new Member("", 5, "", "", "", "");
        memberList.addMember(myMember1);
        memberList.addMember(myMember2);
        memberList.addMember(myMember3);
        memberList.addMember(myMember4);
        memberList.addMember(myMember5);

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
        assertNotNull(memberList);
    }

    /**
     * Test of addMember method, of class MemberList.
     */
    @Test
    public void testAddMember() {
        System.out.println("addMember");
        boolean expResult = true;
        Member myMember6 = new Member("Test Name", 6, "Test Address",
                "St. Cloud", "MN", "56301");
        boolean result = memberList.addMember(myMember6);
        assertEquals(expResult, result);
    }

    /**
     * Test of getMember method, of class MemberList.
     */
    @Test
    public void testGetMember() {
        System.out.println("getMember");
        // Get the member with ID 6
        int ID = 3;
        Member result = memberList.getMember(ID);
        assertNotNull(result);
        assertEquals(ID, result.getID());

    }

    /**
     * Test of getMembers method, of class MemberList.
     */
    @Test
    public void testGetMembers() {
        System.out.println("getMembers");
        Iterator<Member> result = memberList.getMembers();
        assertNotNull(result);
    }

    /**
     * Test of validate method, of class MemberList.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        int ID = 5;
        boolean expResult = true;
        boolean result = memberList.validate(ID);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class MemberList.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        // Add a member
        int ID = 10;
        Member member = new Member("Test Name", ID, "Test Address", "St. Cloud", "MN", "56301");
        boolean expResult = true;
        boolean result = memberList.addMember(member);
        assertEquals(expResult, result);
        // delete the added member
        Member expResult2 = null;
        memberList.delete(ID);
        Member result2 = memberList.getMember(ID);
        assertEquals(expResult2, result2);
    }

    /**
     * Test of updateMember method, of class MemberList.
     */
    @Test
    public void testUpdateMember() {
        System.out.println("updateMember");
        int ID = 2;
        String Name = "Bob";
        String Address = "123 Fake St";
        String City = "St Cloud";
        String State = "MN";
        String ZipCode = "56304";
        memberList.updateMember(ID, Name, Address, City, State, ZipCode);
        Member result = memberList.getMember(ID);
        assertNotNull(result);
        assertEquals(Name, result.getName());
        assertEquals(Address, result.getAddress());
        assertEquals(City, result.getCity());
        assertEquals(State, result.getState());
        assertEquals(ZipCode, result.getZipcode());
    }

    /**
     * Test of save method, of class MemberList.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        boolean expResult = true;
        boolean result = MemberList.save();
        assertEquals(expResult, result);
    }

    /**
     * Test of load method, of class MemberList.
     */
    @Test
    public void testLoad() {
        System.out.println("load");
        MemberList result = MemberList.load();
        assertNotNull(result);
    }

}
