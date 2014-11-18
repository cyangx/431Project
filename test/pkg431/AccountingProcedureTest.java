/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg431;

import java.util.Date;
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
public class AccountingProcedureTest {
    
    public AccountingProcedureTest() {
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
     * Test of instance method, of class AccountingProcedure.
     */
    @Test
    public void testInstance() {
        System.out.println("instance");
        AccountingProcedure expResult = null;
        AccountingProcedure result = AccountingProcedure.instance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateMemberReports method, of class AccountingProcedure.
     */
    @Test
    public void testGenerateMemberReports() {
        System.out.println("generateMemberReports");
        AccountingProcedure instance = null;
        String expResult = "";
        String result = instance.generateMemberReports();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateProviderReports method, of class AccountingProcedure.
     */
    @Test
    public void testGenerateProviderReports() {
        System.out.println("generateProviderReports");
        AccountingProcedure instance = null;
        String expResult = "";
        String result = instance.generateProviderReports();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateAccountsPayableReports method, of class AccountingProcedure.
     */
    @Test
    public void testGenerateAccountsPayableReports() {
        System.out.println("generateAccountsPayableReports");
        AccountingProcedure instance = null;
        String expResult = "";
        String result = instance.generateAccountsPayableReports();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReportTime method, of class AccountingProcedure.
     */
    @Test
    public void testSetReportTime() {
        System.out.println("setReportTime");
        Date dt = null;
        AccountingProcedure instance = null;
        instance.setReportTime(dt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReportTime method, of class AccountingProcedure.
     */
    @Test
    public void testGetReportTime() {
        System.out.println("getReportTime");
        AccountingProcedure instance = null;
        Date expResult = null;
        Date result = instance.getReportTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readAcmeFile method, of class AccountingProcedure.
     */
    @Test
    public void testReadAcmeFile() {
        System.out.println("readAcmeFile");
        AccountingProcedure instance = null;
        instance.readAcmeFile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
