/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg431;

import java.text.SimpleDateFormat;
import java.util.Calendar;
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
        // sets up the test data
        ServiceRecord myServiceRecord;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Provider myProvider = new Provider("Test Name", 66, "Test Address", "St. Cloud", "MN", "56301", "Bank", "123");
        Provider myProvider2 = new Provider("Test Name2", 77, "Test Address2", "St. Croix", "WI", "56377", "Bank", "123");
        Provider myProvider3 = new Provider("Test Name3", 88, "Test Address3", "St. Paul", "MN", "56345", "Bank", "123456");
        Member myMember = new Member("Test Name", 99, "Test Address", "St. Cloud", "MN", "56301");
        Member myMember2 = new Member("Test Name2", 100, "Test Address2", "St. Croix", "WI", "66345");
        Service myService = new Service("Test Name", 101, 500.59);
        Service myService2 = new Service("Test Name2", 102, 50.01);
        
        Date myDate = new Date();
        Calendar myCal = (Calendar) Calendar.getInstance().clone();
        myCal.setTime(myDate);
        myCal.add(Calendar.DATE, 1);
        Date myDate2 = myCal.getTime();
        
        ProviderList pl = ProviderList.instance();
        pl.addProvider(myProvider);
        pl.addProvider(myProvider2);
        MemberList ml = MemberList.instance();
        ml.addMember(myMember);
        ml.addMember(myMember2);
        
        ServiceRecordList myServiceRecordList = ServiceRecordList.getInstance();
        
        myServiceRecordList.CaptureService(myProvider, myMember, myService, myDate, "Comments");
        myServiceRecordList.CaptureService(myProvider, myMember2, myService2, myDate2, "Comments");
        myServiceRecordList.CaptureService(myProvider2, myMember2, myService, myDate2, "Comments");
        myServiceRecordList.CaptureService(myProvider, myMember, myService, myDate2, "Comments");
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
        int ID = 66;
        Date since = null;
        String result = Reporting.generateProviderReport(ID, since);
        assertTrue(result.contains("Total Consultations: 3")
                && result.contains("Total Fees: 1051.19"));
    }

    /**
     * Test of generateMemberReport method, of class Reporting.
     */
    @Test
    public void testGenerateMemberReport() {
        System.out.println("generateMemberReport");
        int ID = 99;
        Date since = null;
        String expResult = "";
        String result = Reporting.generateMemberReport(ID, since);
        assertTrue(result.length() > 0);
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
        assertTrue(result.contains("Test Name\n"
                + "SubTotal Consultations: 3\n"
                + "SubTotal Fees: 1051.19"));
    }
    
}
