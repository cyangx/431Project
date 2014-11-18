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
        MemberList expResult = null;
        MemberList result = MemberList.instance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMember method, of class MemberList.
     */
    @Test
    public void testAddMember() {
        System.out.println("addMember");
        Member member = null;
        MemberList instance = null;
        boolean expResult = false;
        boolean result = instance.addMember(member);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMember method, of class MemberList.
     */
    @Test
    public void testGetMember() {
        System.out.println("getMember");
        int ID = 0;
        MemberList instance = null;
        Member expResult = null;
        Member result = instance.getMember(ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMembers method, of class MemberList.
     */
    @Test
    public void testGetMembers() {
        System.out.println("getMembers");
        MemberList instance = null;
        Iterator<Member> expResult = null;
        Iterator<Member> result = instance.getMembers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validate method, of class MemberList.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        int ID = 0;
        MemberList instance = null;
        boolean expResult = false;
        boolean result = instance.validate(ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class MemberList.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int ID = 0;
        MemberList instance = null;
        instance.delete(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateMember method, of class MemberList.
     */
    @Test
    public void testUpdateMember() {
        System.out.println("updateMember");
        int ID = 0;
        String Name = "";
        String Address = "";
        String City = "";
        String State = "";
        String ZipCode = "";
        MemberList instance = null;
        instance.updateMember(ID, Name, Address, City, State, ZipCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class MemberList.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        boolean expResult = false;
        boolean result = MemberList.save();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of load method, of class MemberList.
     */
    @Test
    public void testLoad() {
        System.out.println("load");
        MemberList expResult = null;
        MemberList result = MemberList.load();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
