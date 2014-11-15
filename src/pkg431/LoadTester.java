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
public class LoadTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SystemData.load();
        Provider myProvider = ProviderList.instance().getProvider(1);
        if( null != myProvider)
        {
            System.out.println("Yay");
        }
    }
    
}
