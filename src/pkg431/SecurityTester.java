package pkg431;

/**
 *
 * @author Garrett
 */
public class SecurityTester {
    public static void main(String args[]) {
        Security test = new Security();
        
        // Testing ADMIN
        if(test.validateAdmin("ADMIN") && !test.validateAdmin("Admin"))
        {
            System.out.println("PASSED ADMIN");
        }
        else
        {
            System.out.println("FAILED ADMIN");
        }
        // Testing PROVIDER
        if(test.validateProvider("PROVIDER") && !test.validateProvider("Provider"))
        {
            System.out.println("PASSED PROVIDER");
        }
        else
        {
            System.out.println("FAILED PROVIDER");
        }
    }
}
