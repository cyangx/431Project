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
public class ReportingTest {
    
    public ReportingTest() {
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
     * Test of generateProviderReport method, of class Reporting.
     */
    @Test
    public void testGenerateProviderReport() {
        System.out.println("generateProviderReport");
        int ID = 0;
        Date since = null;
        String expResult = "";
        String result = Reporting.generateProviderReport(ID, since);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateMemberReport method, of class Reporting.
     */
    @Test
    public void testGenerateMemberReport() {
        System.out.println("generateMemberReport");
        int ID = 0;
        Date since = null;
        String expResult = "";
        String result = Reporting.generateMemberReport(ID, since);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateAccountsPayableReport method, of class Reporting.
     */
    @Test
    public void testGenerateAccountsPayableReport() {
        System.out.println("generateAccountsPayableReport");
        Date since = null;
        String expResult = "";
        String result = Reporting.generateAccountsPayableReport(since);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
