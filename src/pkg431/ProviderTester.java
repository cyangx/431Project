package pkg431;
/**
 *
 * @author Brandon Theisen
 */
/*
ProviderTester.java
Description: Tests the funtionality of the Provider class. Makes sure
             that all of the information is properly saved and retrieved
             within the defined constraints, and that methods perform
             the actions sufficiently without fail.
*/
public class ProviderTester {
    private final static int NAME_LENGTH = 25;
    private final static int ADDRESS_LENGTH = 25;
    private final static int CITY_LENGTH = 14;
    private final static int STATE_LENGTH = 2;
    private final static int ZIP_LENGTH = 5;
    private final static int BANK_LENGTH = 25;
    private final static int ACC_NUM_LENGTH = 5;

    public static void main(String args[]) {
        Provider myProvider;

        System.out.println("** TESTING PROVIDER CODE**");
        System.out.println('\n');

        /**
         * This tests for more than the maximum characters
         * Since each string being stored is larger than the maximum amount
         * then each string should be truncated to that value
         */
        System.out.println("**Testing big inputs**");
        try {
            myProvider = new Provider("This name is too long for the constructor", 1, "This address is too long for the constructor", "This is a really big city name", "AAZ", "5637778", "This is a long bank of characters", "123456789");
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
                    && ZIP_LENGTH == myProvider.getZipcode().length()
                    && BANK_LENGTH == myProvider.getBankAccountName().length()
                    && ACC_NUM_LENGTH == myProvider.getBankAccountNum().length()) {
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
         * Null inputs are empty inputs
         */
        System.out.println("**Testing Null inputs**");
        try {
            myProvider = new Provider(null, 0, null, null, null, null,null,null);
            System.out.println("PASSED");
            System.out.println('\n');
        } catch (Exception e) {
            System.out.println("FAILED");
            System.out.println(e.getMessage());
            System.out.println('\n');
        }

        /**
         * This tests boundary inputs
         * This tests the maximum length of each input, making sure
         * each input can indeed only hold up to the maximum amount, not more or less
         */
        System.out.println("**Testing boundary inputs**");
        try {
            myProvider = new Provider("This is twenty five chars", 1, "This is twenty five chars", "Thisisfourteen", "AZ", "56377","This is twenty five chars","12345");
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
                    && ZIP_LENGTH == myProvider.getZipcode().length()
                    && BANK_LENGTH == myProvider.getBankAccountName().length()
                    && ACC_NUM_LENGTH == myProvider.getBankAccountNum().length()) {
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
         * This tests valid inputs for the provider
         * Input is within string length
         * All of the input should be displayed due to fitting within constraints
         */
        System.out.println("**Testing valid inputs**");
        try {
            myProvider = new Provider("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301","Bank 1","12345");
            System.out.println(myProvider.getProviderName() + " " + myProvider.getProviderName().length());
            System.out.println(myProvider.getId());
            System.out.println(myProvider.getAddress() + " " + myProvider.getAddress().length());
            System.out.println(myProvider.getCity() + " " + myProvider.getCity().length());
            System.out.println(myProvider.getState() + " " + myProvider.getState().length());
            System.out.println(myProvider.getZipcode() + " " + myProvider.getZipcode().length());
            if (NAME_LENGTH >= myProvider.getProviderName().length()
                    && ADDRESS_LENGTH >= myProvider.getAddress().length()
                    && CITY_LENGTH >= myProvider.getCity().length()
                    && STATE_LENGTH >= myProvider.getState().length()
                    && ZIP_LENGTH >= myProvider.getZipcode().length()
                    && BANK_LENGTH >= myProvider.getBankAccountName().length()
                    && ACC_NUM_LENGTH >= myProvider.getBankAccountNum().length()) {
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
         * This tests empty string inputs being input into provider
         * Empty sets of information are allowed
         */
        System.out.println("**Testing empty inputs**");
        try {
            myProvider = new Provider("", 5, "", "", "", "","","");
            System.out.println(myProvider.getProviderName() + " " + myProvider.getProviderName().length());
            System.out.println(myProvider.getId());
            System.out.println(myProvider.getAddress() + " " + myProvider.getAddress().length());
            System.out.println(myProvider.getCity() + " " + myProvider.getCity().length());
            System.out.println(myProvider.getState() + " " + myProvider.getState().length());
            System.out.println(myProvider.getZipcode() + " " + myProvider.getZipcode().length());
            if (NAME_LENGTH >= myProvider.getProviderName().length()
                    && ADDRESS_LENGTH >= myProvider.getAddress().length()
                    && CITY_LENGTH >= myProvider.getCity().length()
                    && STATE_LENGTH >= myProvider.getState().length()
                    && ZIP_LENGTH >= myProvider.getZipcode().length()
                    && BANK_LENGTH >= myProvider.getBankAccountName().length()
                    && ACC_NUM_LENGTH >= myProvider.getBankAccountNum().length()) {
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
         * This tests updating the provider
         * which updates only the name, address, city, state and zipcode
         * Update is based on an empty provider. But should be the same if
         * the provider already had information entered
         */
        System.out.println("**Testing Update inputs**");
        try {
            myProvider = new Provider("", 5, "", "", "", "","","");
            myProvider.update("This is new and should be truncated", "So is this and it will also be truncated", "this too is too big", "Yup this should be truncated", "New Zipcode");
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
                throw new Exception("Update failed");
            }
            System.out.println('\n');
        } catch (Exception e) {
            System.out.println("FAILED");
            System.out.println(e.getMessage());
            System.out.println('\n');
        }
        
        /**
         *  Test Update bank account information
         *  Uses information of a provider that's already created
         *  Then updates only the bank account info.
         *  Test is successful if the original bank name or account number is different
         *  than the original. This pass or fail is determined by output.
         */
        try{
            System.out.println("Testing Update Bank Account Information.");
            myProvider = new Provider("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301","Bank 1","12345");
            myProvider.updateBankAccount("Test Bank Name", "54321");
            System.out.println("Bank Account: " + myProvider.getBankAccountName() + "\nAccount Number: " + myProvider.getBankAccountNum());
        }
        catch (Exception e){
            System.out.println("UPDATE BANK ACCOUNT FAILED");
            System.out.println(e.getMessage());
            System.out.println('\n');
        }
    }
}
