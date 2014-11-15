package pkg431;

/**
 *
 * @author Garrett
 */
public class FactoryTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Test the member
         */
        Member member1 = Factory.MemberFactory.MakeMember("Name", "Addr", "City", "St", "11111");
        Member member2 = Factory.MemberFactory.MakeMember("Name", "Addr", "City", "St", "11111");
        if (member1.getID() == 0 && member2.getID() == 1
                && (member1.getName() == null ? false : member1.getName().equals(member2.getName()))
                && (member1.getAddress() == null ? false : member1.getAddress().equals(member2.getAddress()))
                && (member1.getCity() == null ? false : member1.getCity().equals(member2.getCity()))
                && (member1.getState() == null ? false : member1.getState().equals(member2.getState()))
                && (member1.getZipcode() == null ? false : member1.getZipcode().equals(member2.getZipcode()))) {
            System.out.println("PASSED MEMBER");
        } else {
            System.out.println("FAILED MEMBER");
        }

        /**
         * Test provider
         */
        Provider provider1 = Factory.ProviderFactory.MakeProvider("Name", "Addr", "City", "St", "11111", "US BANK", "123456");
        Provider provider2 = Factory.ProviderFactory.MakeProvider("Name", "Addr", "City", "St", "11111", "US BANK", "123456");
        if (provider1.getId() == 0 && provider2.getId() == 1
                && (provider1.getProviderName() == null ? false : provider1.getProviderName().equals(provider2.getProviderName()))
                && (provider1.getAddress() == null ? false : provider1.getAddress().equals(provider2.getAddress()))
                && (provider1.getCity() == null ? false : provider1.getCity().equals(provider2.getCity()))
                && (provider1.getState() == null ? false : provider1.getState().equals(provider2.getState()))
                && (provider1.getZipcode() == null ? false : provider1.getZipcode().equals(provider2.getZipcode()))
                && (provider1.getBankAccountName() == null ? false : provider1.getBankAccountName().equals(provider2.getBankAccountName()))
                && (provider1.getBankAccountNum() == null ? false : provider1.getBankAccountNum().equals(provider2.getBankAccountNum()))) {
            System.out.println("PASSED PROVIDER");
        } else {
            System.out.println("FAILED PROVIDER");
        }

        /**
         * Test services
         */
        Service service1 = Factory.ServiceFactory.MakeService("Service", 50.00);
        Service service2 = Factory.ServiceFactory.MakeService("Service", 50.00);
        if (service1.getID() == 0 && service2.getID() == 1
                && (service1.getServiceName() == null ? false : service1.getServiceName().equals(service2.getServiceName()))
                && service1.getServiceCost() == service2.getServiceCost()) {
            System.out.println("PASSED SERVICE");
        } else {
            System.out.println("FAILED SERVICE");
        }

    }
}
