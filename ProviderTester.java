/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
/**
 *
 * @author Garrett
 */
public class ProviderTester {
    private final static int NAME_LENGTH = 25;
    private final static int ADDRESS_LENGTH = 25;
    private final static int CITY_LENGTH = 14;
    private final static int STATE_LENGTH = 2;
    private final static int ZIP_LENGTH = 5;
    
    public static void main(String args[]) {
        Provider myProvider;
        
        System.out.println("** TESTING PROVIDER CODE**");
        System.out.println('\n');
        
        /**
         * This tests for more than the maximum characters
         */
        System.out.println("**Testing big inputs**");
        try {
            myProvider = new Provider("This name is too long for the constructor", 1, "This address is too long for the constructor", "This is a really big city name", "AAZ", "5637778");
            System.out.println(myProvider.getProviderName() + " " + myProvider.getProviderName().length());
            System.out.println(myProvider.getId());
            System.out.println(myProvider.getAddress() + " " + myProvider.getAddress().length());
            System.out.println(myProvider.getCity() + " " + myProvider.getCity().length());
            System.out.println(myProvider.getState() + " " + myProvider.getState().length());
            System.out.println(myProvider.getZipcode() + " " + myProvider.getZipcode().length());
            if (NAME_LENGTH == myProvider.getProviderName().length()
                    && ADDRESS_LENGTH == myProvider.getAddress().length()
                    && CITY_LENGTH == myProvider.getCity().length()
                    && STATE_LENGTH == myProvider.getState().length()
                    && ZIP_LENGTH == myProvider.getZipcode().length()) {
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
            myProvider = new Provider(null, 0, null, null, null, null);
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
            myProvider = new Provider("This is twenty five chars", 1, "This is twenty five chars", "Thisisfourteen", "AZ", "56377");
            System.out.println(myProvider.getProviderName()+ " " + myProvider.getProviderName().length());
            System.out.println(myProvider.getId());
            System.out.println(myProvider.getAddress() + " " + myProvider.getAddress().length());
            System.out.println(myProvider.getCity() + " " + myProvider.getCity().length());
            System.out.println(myProvider.getState() + " " + myProvider.getState().length());
            System.out.println(myProvider.getZipcode() + " " + myProvider.getZipcode().length());
            if (NAME_LENGTH == myProvider.getProviderName().length()
                    && ADDRESS_LENGTH == myProvider.getAddress().length()
                    && CITY_LENGTH == myProvider.getCity().length()
                    && STATE_LENGTH == myProvider.getState().length()
                    && ZIP_LENGTH == myProvider.getZipcode().length()) {
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
            myProvider = new Provider("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301");
            System.out.println(myProvider.getProviderName()+ " " + myProvider.getProviderName().length());
            System.out.println(myProvider.getId());
            System.out.println(myProvider.getAddress() + " " + myProvider.getAddress().length());
            System.out.println(myProvider.getCity() + " " + myProvider.getCity().length());
            System.out.println(myProvider.getState() + " " + myProvider.getState().length());
            System.out.println(myProvider.getZipcode() + " " + myProvider.getZipcode().length());
            if (NAME_LENGTH >= myProvider.getProviderName().length()
                    && ADDRESS_LENGTH >= myProvider.getAddress().length()
                    && CITY_LENGTH >= myProvider.getCity().length()
                    && STATE_LENGTH >= myProvider.getState().length()
                    && ZIP_LENGTH >= myProvider.getZipcode().length()) {
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
            myProvider = new Provider("", 5, "", "", "", "");
            System.out.println(myProvider.getProviderName()+ " " + myProvider.getProviderName().length());
            System.out.println(myProvider.getId());
            System.out.println(myProvider.getAddress() + " " + myProvider.getAddress().length());
            System.out.println(myProvider.getCity() + " " + myProvider.getCity().length());
            System.out.println(myProvider.getState() + " " + myProvider.getState().length());
            System.out.println(myProvider.getZipcode() + " " + myProvider.getZipcode().length());
            if (NAME_LENGTH >= myProvider.getProviderName().length()
                    && ADDRESS_LENGTH >= myProvider.getAddress().length()
                    && CITY_LENGTH >= myProvider.getCity().length()
                    && STATE_LENGTH >= myProvider.getState().length()
                    && ZIP_LENGTH >= myProvider.getZipcode().length()) {
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
