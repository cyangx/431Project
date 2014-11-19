/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg431;

import java.io.File;
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
public class ServiceListTest {

    public ServiceListTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        File f = new File(ServiceList.FILE_PATH);
        if(f.exists() && !f.isDirectory())
        {
            f.delete();
        }
        ServiceList instance = ServiceList.instance();
        instance.addService(new Service("This name is too long for the constructor", 1, 200));
        instance.addService(new Service(null, 2, 0));
        instance.addService(new Service("This is twenty five chars", 3, 1000000));
        instance.addService(new Service("Test Name", 4, 0.00003));
        instance.addService(new Service("", 5, 1));
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
     * Test of instance method, of class ServiceList.
     */
    @Test
    public void testInstance() {
        System.out.println("instance");
        ServiceList expResult = null;
        ServiceList result = ServiceList.instance();
        assertFalse(result.equals(expResult));
    }

    /**
     * Test of addService method, of class ServiceList.
     */
    @Test
    public void testAddService() {
        System.out.println("addService");
        ServiceList instance = ServiceList.instance();

        assertTrue(null != instance.getService(1)
                && null != instance.getService(2)
                && null != instance.getService(3)
                && null != instance.getService(4)
                && null != instance.getService(5));
    }

    /**
     * Test of getService method, of class ServiceList.
     */
    @Test
    public void testGetService() {
        System.out.println("getService");
        ServiceList instance = ServiceList.instance();
        assertTrue(null != instance.getService(1)
                && null != instance.getService(2)
                && null != instance.getService(3)
                && null != instance.getService(4)
                && null != instance.getService(5));
    }

    /**
     * Test of getServiceDirectory method, of class ServiceList.
     */
    @Test
    public void testGetServiceDirectory() {
        System.out.println("getServiceDirectory");
        ServiceList instance = ServiceList.instance();
        int expResult = 5;
        int result = 0;
        Iterator<Service> it = instance.getServiceDirectory();
        while (it.hasNext()) {
            it.next();
            result++;
        }
        assertEquals(expResult, result);
    }

    /**
     * Test of getServiceDirectoryText method, of class ServiceList.
     */
    @Test
    public void testGetServiceDirectoryText() {
        System.out.println("getServiceDirectoryText");
        ServiceList instance = ServiceList.instance();
        int expResult = 5;
        String result = instance.getServiceDirectoryText();
        assertTrue(result.split(System.lineSeparator()).length == expResult);
    }

    /**
     * Test of validate method, of class ServiceList.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        ServiceList instance = ServiceList.instance();
        assertTrue(instance.validate(1));
    }

    /**
     * Test of update method, of class ServiceList.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        ServiceList instance = ServiceList.instance();
        instance.update(1, "Service 1", 500);
        assertTrue(instance.getService(1).getServiceName().equals("Service 1")
                && instance.getService(1).getServiceCost() == 500);
    }

    /**
     * Test of delete method, of class ServiceList.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int ID = 5;
        ServiceList instance = ServiceList.instance();
        instance.delete(ID);
        assertFalse(instance.validate(ID));
    }

    /**
     * Test of save method, of class ServiceList.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        boolean expResult = false;
        ServiceList.save();
        File f = new File(ServiceList.FILE_PATH);
        assertTrue(f.exists() && !f.isDirectory());
    }

    /**
     * Test of load method, of class ServiceList.
     */
    @Test
    public void testLoad() {
        System.out.println("load");
        ServiceList result = ServiceList.load();
        ServiceList expResult = ServiceList.instance();
        assertEquals(expResult, result);
    }

}
