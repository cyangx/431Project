/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
/**
 *
 * @author Garrett
 */
public class ServiceTester {

    private final static int NAME_LENGTH = 20;
    private final static double MAX_FEE = 999.99;
    
    public static void main(String args[]) {
        Service myService;
        
        System.out.println("** TESTING SERVICE CODE**");
        System.out.println('\n');
        
        
        /**
         * This tests for more than the maximum characters
         */
        System.out.println("**Testing big inputs**");
        try {
            myService = new Service("This name is too long for the constructor", 1, 100000.01);
            System.out.println(myService.getServiceName() + " " + myService.getServiceName().length());
            System.out.println(myService.getID());
            System.out.println(myService.getServiceCost());
            if (NAME_LENGTH == myService.getServiceName().length()
                    && MAX_FEE == myService.getServiceCost()) {
                System.out.println("PASSED");
            } else {
                throw new Exception("Field length mismatch");
            }
            System.out.println('\n');
        } catch (Exception e) {
            System.out.println("FAILED");
            System.out.println(e.getMessage());
            System.out.println('\n');
        }

        /**
         * This tests for null inputs
         */
        System.out.println("**Testing Null inputs**");
        try {
            myService = new Service(null, 0, 0);
            System.out.println("PASSED");
            System.out.println('\n');
        } catch (Exception e) {
            System.out.println("FAILED");
            System.out.println(e.getMessage());
            System.out.println('\n');
        } 
            
        /**
         *  This tests boundary inputs
         */
        System.out.println("**Testing boundary inputs**");
        try {
            myService = new Service("This is twenty chars", 2, 999.99);
            System.out.println(myService.getServiceName() + " " + myService.getServiceName().length());
            System.out.println(myService.getID());
            System.out.println(myService.getServiceCost());
            if (NAME_LENGTH == myService.getServiceName().length()
                    && MAX_FEE == myService.getServiceCost()) {
                System.out.println("PASSED");
            } else {
                throw new Exception("Field length mismatch");
            }
            System.out.println('\n');
        } catch (Exception e) {
            System.out.println("FAILED");
            System.out.println(e.getMessage());
            System.out.println('\n');
        }
    
            
        /**
         *  This tests valid inputs
         */
        System.out.println("**Testing valid inputs**");
        try {
            myService = new Service("Test Name", 1, 500.59);
            System.out.println(myService.getServiceName() + " " + myService.getServiceName().length());
            System.out.println(myService.getID());
            System.out.println(myService.getServiceCost());
            if (NAME_LENGTH >= myService.getServiceName().length()
                    && MAX_FEE >= myService.getServiceCost()) {
                System.out.println("PASSED");
            } else {
                throw new Exception("Field length mismatch");
            }
            System.out.println('\n');
        } catch (Exception e) {
            System.out.println("FAILED");
            System.out.println(e.getMessage());
            System.out.println('\n');
        }
            
            
         /**
          *  This tests empty string inputs
          */
        System.out.println("**Testing empty inputs**");
        try {
            myService = new Service("", 5, 0);
            System.out.println(myService.getServiceName() + " " + myService.getServiceName().length());
            System.out.println(myService.getID());
            System.out.println(myService.getServiceCost());
            if (NAME_LENGTH >= myService.getServiceName().length()
                    && MAX_FEE >= myService.getServiceCost()) {
                System.out.println("PASSED");
            } else {
                throw new Exception("Field length mismatch");
            }
            System.out.println('\n');
        } catch (Exception e) {
            System.out.println("FAILED");
            System.out.println(e.getMessage());
            System.out.println('\n');
        }   
    }

}
