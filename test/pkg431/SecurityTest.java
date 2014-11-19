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
 */
public class SecurityTest {
    
    public SecurityTest() {
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
     * Test of validateProvider method, of class Security.
     */
    @Test
    public void testValidateProvider() {
        System.out.println("validateProvider");
        String Pwd = "";
        boolean expResult = false;
        boolean result = Security.validateProvider(Pwd);
        assertEquals(expResult, result);

        assertEquals(true, Security.validateProvider("PROVIDER"));
    }

    /**
     * Test of validateAdmin method, of class Security.
     */
    @Test
    public void testValidateAdmin() {
        System.out.println("validateAdmin");
        String Pwd = "";
        boolean expResult = false;
        boolean result = Security.validateAdmin(Pwd);
        assertEquals(expResult, result);
        assertEquals(true, Security.validateAdmin("ADMIN"));
    }
    
}
