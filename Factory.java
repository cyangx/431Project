/**
 *
 * @author Garrett
 * @since 11/7/14
 */
public class Factory {
    
    // TODO: Possibly change ID's to strings, ensuring leading zeros are added to fill full size
    private static int _memberID = 0; // ID for member creation
    private static int _providerID = 0; // ID for provider creation
    private static int _serviceID = 0; // ID for service creation
    
    /**
    * This class is used to create Members
    */
    public static class MemberFactory{
        /**
         * This method is used to Create members
         * The method is synchronized to eliminate the possibility 
         *      of creating members with the same ID
         * @param Name, the name of the member
         * @param Address, the street address of the member
         * @param City, the city of the member
         * @param State, the 2 digit state code of the member
         * @param ZipCode, the Zip code of the member
         * @return The new member
         */
        public synchronized static Member MakeMember(String Name, String Address, String City, String State, String ZipCode)
        {
            Member result = new Member(Name, _memberID, Address, City, State, ZipCode);
            _memberID++; 
            return result;
        }
    }
    
    /**
     *  This class is used to create providers
     */
    public static class ProviderFactory{
        /**
         * This method is used to Create Providers
         * The method is synchronized to eliminate the possibility 
         *      of creating providers with the same ID
         * @param Name, the name of the provider
         * @param Address, the street address of the provider
         * @param City, the city of the provider
         * @param State, the two digit state code of the provider
         * @param ZipCode, the zip code of the provider
         * @return The new Provider
         */    
        public synchronized static Provider MakeProvider(String Name, String Address, String City, String State, String ZipCode)
        {
            Provider result = new Provider(Name, _providerID, Address, City, State, ZipCode);
            _providerID++; 
            return result;
        }
    }
    /**
     * This class is for creating new services
     */
    public static class ServiceFactory{
        /**
         * This method is used to Create Services
         * The method is synchronized to eliminate the possibility 
         *      of creating services with the same ID
         * @param Name, the name of the service
         * @param Fee, the fee of the service
         * @return the new Service
         */
        public synchronized static Service MakeService(String Name, double Fee)
        {
            Service result = new Service(Name, _serviceID, Fee);
            _serviceID++; 
            return result;
        }
    }
}
