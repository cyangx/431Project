/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg431;

/**
 *
 * @author Garrett
 */
public class SaveTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SystemData.instance();
        
        ProviderList.instance().addProvider(new Provider("name", 
                1, "address", "city", "MN", "56377", "US", "123456"));
        
        SystemData.save();       
        
    }
    
}
