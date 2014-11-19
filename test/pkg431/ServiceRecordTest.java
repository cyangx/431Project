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
public class ServiceRecordTest {
    
    public ServiceRecordTest() {
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
     * Test of getProvider method, of class ServiceRecord.
     */
    @Test
    public void testGetProvider() {
        /**
         * Set up Test Data
         */
        Provider myProvider = new Provider("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301", "bank", "123");
        Member myMember = new Member("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301");
        Service myService = new Service("Test Name", 1, 500.59);
        Date myDate = new Date();
        
        System.out.println("getProvider");
        ServiceRecord instance = new ServiceRecord(
                    myProvider,
                    myMember,
                    myService,
                    myDate,
                    "Comments");
        Provider expResult = myProvider;
        Provider result = instance.getProvider();
        assertTrue((expResult.getProviderName() == null ? false : expResult.getProviderName().equals(result.getProviderName()))
                    && (expResult.getAddress() == null ? false : expResult.getAddress().equals(result.getAddress()))
                    && (expResult.getCity() == null ? false : expResult.getCity().equals(result.getCity()))
                    && (expResult.getState() == null ? false : expResult.getState().equals(result.getState()))
                    && (expResult.getZipcode() == null ? false : expResult.getZipcode().equals(result.getZipcode())));
    }

    /**
     * Test of getMember method, of class ServiceRecord.
     */
    @Test
    public void testGetMember() {
        /**
         * Set up Test Data
         */
        Provider myProvider = new Provider("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301", "bank", "123");
        Member myMember = new Member("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301");
        Service myService = new Service("Test Name", 1, 500.59);
        Date myDate = new Date();
        
        System.out.println("getMember");
        ServiceRecord instance = new ServiceRecord(
                    myProvider,
                    myMember,
                    myService,
                    myDate,
                    "Comments");
        Member expResult = myMember;
        Member result = instance.getMember();
        assertTrue((expResult.getName() == null ? false : expResult.getName().equals(instance.getMember().getName()))
                    && (expResult.getAddress() == null ? false : expResult.getAddress().equals(instance.getMember().getAddress()))
                    && (expResult.getCity() == null ? false : expResult.getCity().equals(instance.getMember().getCity()))
                    && (expResult.getState() == null ? false : expResult.getState().equals(instance.getMember().getState()))
                    && (expResult.getZipcode() == null ? false : expResult.getZipcode().equals(instance.getMember().getZipcode())));
    }

    /**
     * Test of getService method, of class ServiceRecord.
     */
    @Test
    public void testGetService() {
        /**
         * Set up Test Data
         */
        Provider myProvider = new Provider("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301", "bank", "123");
        Member myMember = new Member("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301");
        Service myService = new Service("Test Name", 1, 500.59);
        Date myDate = new Date();
        
        System.out.println("getService");
        ServiceRecord instance = new ServiceRecord(
                    myProvider,
                    myMember,
                    myService,
                    myDate,
                    "Comments");
        Service expResult = myService;
        Service result = instance.getService();
        assertTrue((expResult.getServiceName() == null ? false : expResult.getServiceName().equals(result.getServiceName()))
                    && expResult.getServiceCost() == result.getServiceCost());
    }

    /**
     * Test of getBillDate method, of class ServiceRecord.
     */
    @Test
    public void testGetBillDate() {
        /**
         * Set up Test Data
         */
        Provider myProvider = new Provider("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301", "bank", "123");
        Member myMember = new Member("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301");
        Service myService = new Service("Test Name", 1, 500.59);
        Date myDate = new Date();
        
        System.out.println("getBillDate");
        ServiceRecord instance = new ServiceRecord(
                    myProvider,
                    myMember,
                    myService,
                    myDate,
                    "Comments");
        Date expResult = null;
        Date result = instance.getBillDate();
        assertFalse(result.equals(expResult));
    }

    /**
     * Test of setBillDate method, of class ServiceRecord.
     */
    @Test
    public void testSetBillDate() {
        /**
         * Set up Test Data
         */
        Provider myProvider = new Provider("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301", "bank", "123");
        Member myMember = new Member("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301");
        Service myService = new Service("Test Name", 1, 500.59);
        Date myDate = new Date();
        
        System.out.println("setBillDate");
        Date _billDate = new Date();
        ServiceRecord instance = new ServiceRecord(
                    myProvider,
                    myMember,
                    myService,
                    myDate,
                    "Comments");
        instance.setBillDate(_billDate);
        assertTrue(instance.getBillDate() == _billDate);
    }

    /**
     * Test of getServiceDate method, of class ServiceRecord.
     */
    @Test
    public void testGetServiceDate() {
        /**
         * Set up Test Data
         */
        Provider myProvider = new Provider("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301", "bank", "123");
        Member myMember = new Member("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301");
        Service myService = new Service("Test Name", 1, 500.59);
        Date myDate = new Date();
        
        System.out.println("getServiceDate");
        ServiceRecord instance = new ServiceRecord(
                    myProvider,
                    myMember,
                    myService,
                    myDate,
                    "Comments");
        
        Date expResult = myDate;
        Date result = instance.getServiceDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of getComments method, of class ServiceRecord.
     */
    @Test
    public void testGetComments() {
        /**
         * Set up Test Data
         */
        Provider myProvider = new Provider("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301", "bank", "123");
        Member myMember = new Member("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301");
        Service myService = new Service("Test Name", 1, 500.59);
        Date myDate = new Date();
        String comments = "Comments";
        System.out.println("getComments");
        ServiceRecord instance = new ServiceRecord(
                    myProvider,
                    myMember,
                    myService,
                    myDate,
                    comments);
        String expResult = comments;
        String result = instance.getComments();
        assertEquals(expResult, result);
    }
    
     /**
     * Test of comment truncation
     */
    @Test
    public void testCommentsTruncation() {
        /**
         * Set up Test Data
         */
        Provider myProvider = new Provider("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301", "bank", "123");
        Member myMember = new Member("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301");
        Service myService = new Service("Test Name", 1, 500.59);
        Date myDate = new Date();
        String comments = "12345678901234567890123456789012345678901234567890123"
                + "456789012345678901234567890123456789012345678"
                + "9012345678901234567890";
        System.out.println("Comment Trunction");
        ServiceRecord instance = new ServiceRecord(
                    myProvider,
                    myMember,
                    myService,
                    myDate,
                    comments);
        int expResult = 100;
        String result = instance.getComments();
        assertEquals(expResult, result.length());
    }
    
}
