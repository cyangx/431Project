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
 */
public class ProviderListTest {

    public ProviderListTest() {
    }
    ProviderList providerList;
    Provider myProvider1, myProvider2, myProvider3,
            myProvider4, myProvider5;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        providerList = ProviderList.instance();
        myProvider1 = new Provider("This name is too long for the constructor",
                1, "This address is too long for the constructor",
                "This is a really big city name", "AAZ", "5637778",
                "This is a long bank of characters", "123456789");
        myProvider2 = new Provider(null, 2, null, null, null, null, null, null);
        myProvider3 = new Provider("This is twenty five chars", 3,
                "This is twenty five chars", "Thisisfourteen", "AZ", "56377",
                "This is twenty five chars", "12345");
        myProvider4 = new Provider("Test Name", 4, "Test Address", "St. Cloud",
                "MN", "56301", "Bank 1", "12345");
        myProvider5 = new Provider("", 5, "", "", "", "", "", "");
        providerList.addProvider(myProvider1);
        providerList.addProvider(myProvider2);
        providerList.addProvider(myProvider3);
        providerList.addProvider(myProvider4);
        providerList.addProvider(myProvider5);

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of instance method, of class ProviderList.
     */
    @Test
    public void testInstance() {
        System.out.println("instance");
        assertNotNull(providerList);
    }

    /**
     * Test of addProvider method, of class ProviderList.
     */
    @Test
    public void testAddProvider() {
        System.out.println("addProvider");
        Provider myProvider6 = new Provider("Provider Six", 6, "", "", "", "", "", "");

        boolean expResult = true;
        boolean result = providerList.addProvider(myProvider6);
        assertEquals(expResult, result);
    }

    /**
     * Test of getProviderIDs method, of class ProviderList.
     */
    @Test
    public void testGetProviderIDs() {
        System.out.println("getProviderIDs");
        Iterator<Provider> result = providerList.getProviderIDs();
        assertNotNull(result);
    }

    /**
     * Test of getProvider method, of class ProviderList.
     */
    @Test
    public void testGetProvider() {
        System.out.println("getProvider");
        int ID = 2;
        Provider result = providerList.getProvider(ID);
        assertNotNull(result);
        assertEquals(ID, result.getId());
    }

    /**
     * Test of validate method, of class ProviderList.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        int ID = 3;
        boolean expResult = true;
        boolean result = providerList.validate(ID);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class ProviderList.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        // Add a provider
        int ID = 10;
        Provider myProvider10 = new Provider("", 10, "", "", "", "", "", "");
        boolean expResult = true;
        boolean result = providerList.addProvider(myProvider10);
        assertEquals(expResult, result);
        // Delete the added provider
        Provider expResult2 = null;
        providerList.delete(ID);
        Provider provider = providerList.getProvider(ID);
        assertEquals(expResult2, provider);

    }

    /**
     * Test of update method, of class ProviderList.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int ID = 1;
        String name = "Pizza Clinic";
        String address = "1234 Awesome Ave";
        String city = "St. Cloud";
        String state = "MN";
        String zipCode = "56301";
        providerList.update(ID, name, address, city, state, zipCode);
        Provider result = providerList.getProvider(ID);
        assertNotNull(result);
        assertEquals(name, result.getProviderName());
        assertEquals(address, result.getAddress());
        assertEquals(city, result.getCity());
        assertEquals(state, result.getState());
        assertEquals(zipCode, result.getZipcode());

    }

    /**
     * Test of updateBankAccount method, of class ProviderList.
     */
    @Test
    public void testUpdateBankAccount() {
        System.out.println("updateBankAccount");
        int ID = 3;
        String bankName = "Bank 2";
        String accountNum = "9876";
        providerList.updateBankAccount(ID, bankName, accountNum);
        Provider result = providerList.getProvider(ID);
        assertEquals(bankName, result.getBankAccountName());
        assertEquals(accountNum, result.getBankAccountNum());

    }

    /**
     * Test of save method, of class ProviderList.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        boolean expResult = true;
        boolean result = ProviderList.save();
        assertEquals(expResult, result);
    }

    /**
     * Test of load method, of class ProviderList.
     */
    @Test
    public void testLoad() {
        System.out.println("load");
        ProviderList result = ProviderList.load();
        assertNotNull(result);
    }

}
