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
 */
public class FactoryTest {

    public FactoryTest() {
    }
    /**
     * Setup Member, Provider, and Service
     */
    Factory factory;
    Member member1;
    Member member2;
    Provider provider1;
    Provider provider2;
    Service service1;
    Service service2;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("save");
        boolean expResult = true;
        boolean result = Factory.save();
        assertEquals(expResult, result);
        
        System.out.println("load");
            Factory f = Factory.load();
            assertNull(f);
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
     * Test of getInstance method, of class Factory.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        factory = Factory.getInstance();
        assertNotNull(factory);
    }

    /**
     * Test of MakeMember method, of class Factory.
     */
    @Test
    public void testMakeMember() {
        System.out.println("MakeMember");

        String Name1 = "Name1";
        String Address1 = "Addr";
        String City1 = "City";
        String State1 = "ST";
        String ZipCode1 = "11111";

        String Name2 = "Name2";
        String Address2 = "Addr2";
        String City2 = "City2";
        String State2 = "MN";
        String ZipCode2 = "22222";

        member1 = Factory.getInstance().MakeMember(Name1, Address1, City1, State1, ZipCode1);
        member2 = Factory.getInstance().MakeMember(Name2, Address2, City2, State2, ZipCode2);

        int member1_ID = 1;
        int member2_ID = 2;
        assertNotNull(member1);
        assertNotNull(member2);

        assertEquals(member1_ID, member1.getID());
        assertEquals(Name1, member1.getName());
        assertEquals(Address1, member1.getAddress());
        assertEquals(City1, member1.getCity());
        assertEquals(State1, member1.getState());
        assertEquals(ZipCode1, member1.getZipcode());

        assertEquals(member2_ID, member2.getID());
        assertEquals(Name2, member2.getName());
        assertEquals(Address2, member2.getAddress());
        assertEquals(City2, member2.getCity());
        assertEquals(State2, member2.getState());
        assertEquals(ZipCode2, member2.getZipcode());

    }

    /**
     * Test of MakeProvider method, of class Factory.
     */
    @Test
    public void testMakeProvider() {
        System.out.println("MakeProvider");

        String Name1 = "Name1";
        String Address1 = "Addr";
        String City1 = "City";
        String State1 = "ST";
        String ZipCode1 = "11111";
        String BankName1 = "US BANK";
        String BankNumber1 = "45678";

        String Name2 = "Name2";
        String Address2 = "Addr2";
        String City2 = "City2";
        String State2 = "MN";
        String ZipCode2 = "22222";
        String BankName2 = "US BANK";
        String BankNumber2 = "12345";

        provider1 = Factory.getInstance().MakeProvider(Name1, Address1, City1, State1, ZipCode1, BankName1, BankNumber1);
        provider2 = Factory.getInstance().MakeProvider(Name2, Address2, City2, State2, ZipCode2, BankName2, BankNumber2);

        int provider1_ID = 1;
        int provider2_ID = 2;
        assertNotNull(provider1);
        assertNotNull(provider2);

        assertEquals(provider1_ID, provider1.getId());
        assertEquals(Name1, provider1.getProviderName());
        assertEquals(Address1, provider1.getAddress());
        assertEquals(City1, provider1.getCity());
        assertEquals(State1, provider1.getState());
        assertEquals(ZipCode1, provider1.getZipcode());
        assertEquals(BankName1, provider1.getBankAccountName());
        assertEquals(BankNumber1, provider1.getBankAccountNum());

        assertEquals(provider2_ID, provider2.getId());
        assertEquals(Name2, provider2.getProviderName());
        assertEquals(Address2, provider2.getAddress());
        assertEquals(City2, provider2.getCity());
        assertEquals(State2, provider2.getState());
        assertEquals(ZipCode2, provider2.getZipcode());
        assertEquals(BankName2, provider2.getBankAccountName());
        assertEquals(BankNumber2, provider2.getBankAccountNum());

    }

    /**
     * Test of MakeService method, of class Factory.
     */
    @Test
    public void testMakeService() {
        System.out.println("MakeService");
        int service1_ID = 1;
        int service2_ID = 2;

        String Name1 = "Service 1";
        double Fee1 = 50.00;
        String Name2 = "Service 2";
        double Fee2 = 70.00;

        service1 = Factory.getInstance().MakeService(Name1, Fee1);
        service2 = Factory.getInstance().MakeService(Name2, Fee2);
        assertNotNull(service1);
        assertNotNull(service2);

        assertEquals(service1_ID, service1.getID());
        assertEquals(Name1, service1.getServiceName());
        assertEquals(Fee1, service1.getServiceCost(), 0);

        assertEquals(service2_ID, service2.getID());
        assertEquals(Name2, service2.getServiceName());
        assertEquals(Fee2, service2.getServiceCost(), 0);

    }

//    /**
//     * Test of save method, of class Factory.
//     */
//    @Test
//    public void testSave() {
//        System.out.println("save");
//        boolean expResult = true;
//        boolean result = Factory.save();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of load method, of class Factory.
//     */
//    @Test
//    public void testLoad() {
//            System.out.println("load");
//            Factory result = Factory.load();
//            assertNotNull(result);
//
//    }

}
