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
                /**
         * Set up test data
         */
        Provider myProvider = new Provider("Test Name", 450, "Test Address", "St. Cloud", "MN", "56301", "bank", "123");
        ProviderList.instance().addProvider(myProvider);
        Member myMember = new Member("Test Name", 450, "Test Address", "St. Cloud", "MN", "56301");
        MemberList.instance().addMember(myMember);
        Service myService = new Service("Test Name", 450, 500.59);
        ServiceList.instance().addService(myService);
        Date myDate = new Date();
        ServiceRecordList instance = ServiceRecordList.getInstance();
        instance.CaptureService(myProvider, myMember, myService, myDate, "test");
        instance.CaptureService(myProvider, myMember, myService, myDate, "test");
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
        AccountingProcedure result = AccountingProcedure.instance();
        assertNotNull(result);
    }

    /**
     * Test of generateMemberReports method, of class AccountingProcedure.
     */
    @Test
    public void testGenerateMemberReports() {
        System.out.println("generateMemberReports");
        AccountingProcedure instance = AccountingProcedure.instance();
        String result = instance.generateMemberReports();
        assertTrue(result.length() > 0);
    }

    /**
     * Test of generateProviderReports method, of class AccountingProcedure.
     */
    @Test
    public void testGenerateProviderReports() {
        System.out.println("generateProviderReports");
        AccountingProcedure instance = AccountingProcedure.instance();
        String result = instance.generateProviderReports();
        assertTrue(result.length() > 0);
    }

    /**
     * Test of generateAccountsPayableReports method, of class AccountingProcedure.
     */
    @Test
    public void testGenerateAccountsPayableReports() {
        System.out.println("generateAccountsPayableReports");
        AccountingProcedure instance = AccountingProcedure.instance();
        String result = instance.generateAccountsPayableReports();
        assertTrue(result.length() > 0);
    }

    /**
     * Test of setReportTime method, of class AccountingProcedure.
     */
    @Test
    public void testSetandSetReportTime() {
        System.out.println("setReportTime");
        Date dt = new Date();
        AccountingProcedure instance = AccountingProcedure.instance();
        instance.setReportTime(dt);
        assertTrue(dt.equals(instance.getReportTime()));
        
    }
    
}
