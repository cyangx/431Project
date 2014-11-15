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
     * Tests whether the data can be loaded correctly For use after the save
     * test
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SystemData.load();

        /**
         * Provider Test
         */
        Provider myProvider = ProviderList.instance().getProvider(1);
        Provider myProvider2 = ProviderList.instance().getProvider(2);
        if (null != myProvider && null != myProvider2
                && null != myProvider.getProviderName()
                && null != myProvider.getAddress()
                && null != myProvider.getCity()
                && null != myProvider.getState()
                && null != myProvider.getZipcode()
                && null != myProvider.getBankAccountName()
                && null != myProvider.getBankAccountNum()
                && null != myProvider2.getProviderName()
                && null != myProvider2.getAddress()
                && null != myProvider2.getCity()
                && null != myProvider2.getState()
                && null != myProvider2.getZipcode()
                && null != myProvider2.getBankAccountName()
                && null != myProvider2.getBankAccountNum()) {
            System.out.println("PROVIDER PASSED");
        } else {
            System.out.println("PROVIDER FAILED");
        }

        /**
         * Member Test
         */
        Member myMember = MemberList.instance().getMember(1);
        Member myMember2 = MemberList.instance().getMember(2);
        if (null != myMember && null != myMember2
                && null != myMember.getName()
                && null != myMember.getAddress()
                && null != myMember.getCity()
                && null != myMember.getState()
                && null != myMember.getZipcode()
                && null != myMember2.getName()
                && null != myMember2.getAddress()
                && null != myMember2.getCity()
                && null != myMember2.getState()
                && null != myMember2.getZipcode()) {
            System.out.println("MEMBER PASSED");
        } else {
            System.out.println("MEMBER FAILED");
        }

        /**
         * Service Test
         */
        Service myService = ServiceList.instance().getService(1);
        Service myService2 = ServiceList.instance().getService(2);
        if (null != myService && null != myService2
                && 0 != myService.getServiceCost()
                && null != myService.getServiceName()
                && 0 != myService2.getServiceCost()
                && null != myService2.getServiceName()) {
            System.out.println("SERVICE PASSED");
        } else {
            System.out.println("SERVICE FAILED");
        }

        /**
         * Service Record Test
         */
        if (ServiceRecordList.getInstance().getServiceRecords().hasNext()) {
            System.out.println("SERVICE_RECORD PASSED");
        } else {
            System.out.println("SERVICE_RECORD FAILED");
        }
    }

}
