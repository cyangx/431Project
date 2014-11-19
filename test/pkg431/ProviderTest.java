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
public class ProviderTest {

    public ProviderTest() {
    }
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

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getProviderName method, of class Provider.
     */
    @Test
    public void testGetProviderName() {
        System.out.println("getProviderName");
        String expResult = "Test Name";
        String result = myProvider4.getProviderName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class Provider.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        int expResult = 4;
        int result = myProvider4.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAddress method, of class Provider.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        String expResult = "Test Address";
        String result = myProvider4.getAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCity method, of class Provider.
     */
    @Test
    public void testGetCity() {
        System.out.println("getCity");
        String expResult = "St. Cloud";
        String result = myProvider4.getCity();
        assertEquals(expResult, result);
    }

    /**
     * Test of getState method, of class Provider.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        String expResult = "MN";
        String result = myProvider4.getState();
        assertEquals(expResult, result);
    }

    /**
     * Test of getZipcode method, of class Provider.
     */
    @Test
    public void testGetZipcode() {
        System.out.println("getZipcode");
        String expResult = "56301";
        String result = myProvider4.getZipcode();
        assertEquals(expResult, result);
    }

    /**
     * Test of updateBankAccount method, of class Provider.
     */
    @Test
    public void testUpdateBankAccount() {
        System.out.println("updateBankAccount");
        String bankName = "Bank 2";
        String accountNum = "9876";
        myProvider4.updateBankAccount(bankName, accountNum);
        String result1 = myProvider4.getBankAccountName();
        String result2 = myProvider4.getBankAccountNum();

        assertEquals(bankName, result1);
        assertEquals(accountNum, result2);

    }

    /**
     * Test of getBankAccountName method, of class Provider.
     */
    @Test
    public void testGetBankAccountName() {
        System.out.println("getBankAccountName");
        String expResult = "This is twenty five chars";
        String result = myProvider3.getBankAccountName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBankAccountNum method, of class Provider.
     */
    @Test
    public void testGetBankAccountNum() {
        System.out.println("getBankAccountNum");
        String expResult = "12345";
        String result = myProvider3.getBankAccountNum();
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class Provider.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        String name = "Pizza Clinic";
        String address = "1234 Awesome Ave";
        String city = "St. Cloud";
        String state = "MN";
        String zipCode = "56301";
        myProvider5.update(name, address, city, state, zipCode);
        assertNotNull(myProvider5);
        assertEquals(name, myProvider5.getProviderName());
        assertEquals(address, myProvider5.getAddress());
        assertEquals(city, myProvider5.getCity());
        assertEquals(state, myProvider5.getState());
        assertEquals(zipCode, myProvider5.getZipcode());

    }

}
