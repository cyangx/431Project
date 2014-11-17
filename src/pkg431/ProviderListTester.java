package pkg431;
/**
 *
 * @author Brandon Theisen
 */
/*
ProviderListTester.java
Description: Tests the funtionality of the ProviderList class. 
             Makes sure that the list can properly add, remove, serialize,
             deserialize, update and validate providers.
             Updates pass based on output.
*/
public class ProviderListTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("** TESTING PROVIDERLIST CODE**");          
        
        ProviderList myProviderList = ProviderList.instance();
        //Provider myProvider = new Provider("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301");
        

        /**
         *  Testing add and getProvider
         * Add and get passes if provider is successfully added to the list
         * and getProvider can retrieve the newly added provider
         * Fails if the provider in the list is null
         */
        try{
            System.out.println("Adding and getting provider...");
            //myProviderList.addProvider(myProvider);
            
            myProviderList.addProvider(new Provider("This name is too long for the constructor", 1, "This address is too long for the constructor", "This is a really big city name", "AAZ", "5637778","This is a long bank of characters","123456789"));
            myProviderList.addProvider(new Provider(null, 2, null, null, null, null, null, null));
            myProviderList.addProvider(new Provider("This is twenty five chars", 3, "This is twenty five chars", "Thisisfourteen", "AZ", "56377", "This is twenty five chars","12345"));
            myProviderList.addProvider(new Provider("Test Name", 4, "Test Address", "St. Cloud", "MN", "56301","Bank No 1","45678"));
            myProviderList.addProvider(new Provider("", 5, "", "", "", "","",""));
            
            if(null != myProviderList.getProvider(1)                    
                    && null != myProviderList.getProvider(2)
                    && null != myProviderList.getProvider(3)
                    && null != myProviderList.getProvider(4)
                    && null != myProviderList.getProvider(5)){
                System.out.println("PASSED ADDING AND GETTING PROVIDER");
            } else {
                throw new Exception("Failed to add or lookup");
            }
        }
        catch(Exception e){
            System.out.println("ADD/GET PROVIDER FAILED\n");
            System.out.println(e.getMessage());
            System.out.println('\n');
        }

        /**
         *  Test Validate
         * Tests whether or not the provider is in the list
         * if it is in the list, the test passes
         * If the provider isn't in the list, then the validate fails.
         */
        
        System.out.println("**Testing validate**");
        try {
            if (myProviderList.validate(1)
                    && myProviderList.validate(2)
                    && myProviderList.validate(3)
                    && myProviderList.validate(4)
                    && myProviderList.validate(5)) {
                System.out.println("PASSED");
            } else {
                throw new Exception("Failed to add or lookup");
            }
        } catch (Exception e) {
            System.out.println("FAILED VALIDATING");
            System.out.println(e.getMessage());
            System.out.println('\n');
        }

        /**
         *  Testing update
         *  Update is passed if the information appears different
         *  than the previous information added. Can only be verified
         *  by viewing the output.
         */
        
        try{
            System.out.println("**Testing update**");
            System.out.println("Information before update: ");
            Provider provider1, provider2, provider3, provider4, provider5;
            provider1 = myProviderList.getProvider(1);
            provider2 = myProviderList.getProvider(2);
            provider3 = myProviderList.getProvider(3);
            provider4 = myProviderList.getProvider(4);
            provider5 = myProviderList.getProvider(5);
            
            System.out.println("Provider Name: " + provider1.getProviderName() + " Provider Address: " + provider1.getAddress() + " Provider City: " + provider1.getCity() + " Provider State: " + provider1.getState() + " Provider Zip: " + provider1.getZipcode() + " Provider Bank Name: " + provider1.getBankAccountName() + " Provider Account Number: " + provider1.getBankAccountNum());
            System.out.println("Provider Name: " + provider2.getProviderName() + " Provider Address: " + provider2.getAddress() + " Provider City: " + provider2.getCity() + " Provider State: " + provider2.getState() + " Provider Zip: " + provider2.getZipcode() + " Provider Bank Name: " + provider2.getBankAccountName() + " Provider Account Number: " + provider2.getBankAccountNum());
            System.out.println("Provider Name: " + provider3.getProviderName() + " Provider Address: " + provider3.getAddress() + " Provider City: " + provider3.getCity() + " Provider State: " + provider3.getState() + " Provider Zip: " + provider3.getZipcode() + " Provider Bank Name: " + provider3.getBankAccountName() + " Provider Account Number: " + provider3.getBankAccountNum());
            System.out.println("Provider Name: " + provider4.getProviderName() + " Provider Address: " + provider4.getAddress() + " Provider City: " + provider4.getCity() + " Provider State: " + provider4.getState() + " Provider Zip: " + provider4.getZipcode() + " Provider Bank Name: " + provider4.getBankAccountName() + " Provider Account Number: " + provider4.getBankAccountNum());
            System.out.println("Provider Name: " + provider5.getProviderName() + " Provider Address: " + provider5.getAddress() + " Provider City: " + provider5.getCity() + " Provider State: " + provider5.getState() + " Provider Zip: " + provider5.getZipcode() + " Provider Bank Name: " + provider5.getBankAccountName() + " Provider Account Number: " + provider5.getBankAccountNum());
            
            
            System.out.println("Information after update: ");
            
            //ID, Name, Address, City, State, Zip
            myProviderList.update(1, "Provider 1", "Address 1", "City 1", "MN", "48682");
            myProviderList.update(2, "Provider 2", "Address 2", "City 2", "IA", "56722");
            myProviderList.update(3, "Provider 3", "Address 3", "City 3", "MO", "98256");
            myProviderList.update(4, "Provider 4", "Address 4", "City 4", "IL", "44882");
            myProviderList.update(5, "Provider 5", "Address 5", "City 5", "OR", "11558");
            
            
            
            //ID, bank name, account number
            myProviderList.updateBankAccount(1, "New Bank 1", "12357");
            myProviderList.updateBankAccount(2, "New Bank 2", "34522");
            myProviderList.updateBankAccount(3, "New Bank 3", "93921");
            myProviderList.updateBankAccount(4, "New Bank 4", "63201");
            myProviderList.updateBankAccount(5, "New Bank 5", "95942");
            
            System.out.println("Provider Name: " + provider1.getProviderName() + " Provider Address: " + provider1.getAddress() + " Provider City: " + provider1.getCity() + " Provider State: " + provider1.getState() + " Provider Zip: " + provider1.getZipcode() + " Provider Bank Name: " + provider1.getBankAccountName() + " Provider Account Number: " + provider1.getBankAccountNum());
            System.out.println("Provider Name: " + provider2.getProviderName() + " Provider Address: " + provider2.getAddress() + " Provider City: " + provider2.getCity() + " Provider State: " + provider2.getState() + " Provider Zip: " + provider2.getZipcode() + " Provider Bank Name: " + provider2.getBankAccountName() + " Provider Account Number: " + provider2.getBankAccountNum());
            System.out.println("Provider Name: " + provider3.getProviderName() + " Provider Address: " + provider3.getAddress() + " Provider City: " + provider3.getCity() + " Provider State: " + provider3.getState() + " Provider Zip: " + provider3.getZipcode() + " Provider Bank Name: " + provider3.getBankAccountName() + " Provider Account Number: " + provider3.getBankAccountNum());
            System.out.println("Provider Name: " + provider4.getProviderName() + " Provider Address: " + provider4.getAddress() + " Provider City: " + provider4.getCity() + " Provider State: " + provider4.getState() + " Provider Zip: " + provider4.getZipcode() + " Provider Bank Name: " + provider4.getBankAccountName() + " Provider Account Number: " + provider4.getBankAccountNum());
            System.out.println("Provider Name: " + provider5.getProviderName() + " Provider Address: " + provider5.getAddress() + " Provider City: " + provider5.getCity() + " Provider State: " + provider5.getState() + " Provider Zip: " + provider5.getZipcode() + " Provider Bank Name: " + provider5.getBankAccountName() + " Provider Account Number: " + provider5.getBankAccountNum());
            
            System.out.println("PASSED");
            
        }
        catch (Exception e) {
            System.out.println("FAILED UPDATING");
            System.out.println(e.getMessage());
            System.out.println('\n');
        }
 
        /**
         *  Test delete
         *  Test is successful if the provider in the list is null
         *  Test fails if the provider is still in the list
         */
        try{
            System.out.println("**Testing Delete**");
            myProviderList.delete(1);
            myProviderList.delete(2);
            myProviderList.delete(3);
            myProviderList.delete(4);
            myProviderList.delete(5);
                if(null == myProviderList.getProvider(1)                    
                    && null == myProviderList.getProvider(2)
                    && null == myProviderList.getProvider(3)
                    && null == myProviderList.getProvider(4)
                    && null == myProviderList.getProvider(5)){
                System.out.println("PASSED DELETING PROVIDERS");
            } else {
                throw new Exception("Failed to delete");
            }
        }
        catch(Exception e){
            System.out.println("FAILED DELETING");
            System.out.println(e.getMessage());
            System.out.println('\n');            
        }
    }
    
}
