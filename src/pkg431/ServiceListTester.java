package pkg431;

/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
/**
 *
 * @author Garrett
 */
public class ServiceListTester {
        public static void main(String args[]) {

        System.out.println("** TESTING SERVICELIST CODE**");          
        
        ServiceList myServiceList = ServiceList.instance();
        

        /**
         *  TODO: Testing add and getService
         */
        try{
            System.out.println("Adding and getting Service...");
            //myServiceList.addService(myService);
            
            myServiceList.addService(new Service("This name is too long for the constructor", 1, 200));
            myServiceList.addService(new Service(null, 2, 0));
            myServiceList.addService(new Service("This is twenty five chars", 3, 1000000));
            myServiceList.addService(new Service("Test Name", 4, 0.00003));
            myServiceList.addService(new Service("", 5, 1));
            
            if(null != myServiceList.getService(1)                    
                    && null != myServiceList.getService(2)
                    && null != myServiceList.getService(3)
                    && null != myServiceList.getService(4)
                    && null != myServiceList.getService(5)){
                System.out.println("PASSED ADDING AND GETTING PROVIDER");
            } else {
                throw new Exception("Failed to add or lookup");
            }
        }
        catch(Exception e){
            System.out.println("ADD/GET SERVICE FAILED\n");
            System.out.println(e.getMessage());
            System.out.println('\n');
        }

        /**
         *  TODO: Test Validate
         */
        
        System.out.println("**Testing validate**");
        try {
            if (myServiceList.validate(1)
                    && myServiceList.validate(2)
                    && myServiceList.validate(3)
                    && myServiceList.validate(4)
                    && myServiceList.validate(5)) {
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
         *  TODO: Testing update
         */
        
        try{
            System.out.println("**Testing update**");
            System.out.println("Information before update: ");
            Service  service1 , service2, service3, service4, service5;
            service1 = myServiceList.getService(1);
            service2 = myServiceList.getService(2);
            service3 = myServiceList.getService(3);
            service4 = myServiceList.getService(4);
            service5 = myProviderList.getService(5);
            
            System.out.println("Service Name: " + service1.getServiceName() + " Service ID: " + service1.getID() + " Service Cost: " + service1.getServiceCost());
            System.out.println("Service Name: " + service2.getServiceName() + " Service ID: " + service2.getID() + " Service Cost: " + service2.getServiceCost());
            System.out.println("Service Name: " + service3.getServiceName() + " Service ID: " + service3.getID() + " Service Cost: " + service3.getServiceCost());
            System.out.println("Service Name: " + service4.getServiceName() + " Service ID: " + service4.getID() + " Service Cost: " + service4.getServiceCost());
            System.out.println("Service Name: " + service5.getServiceName() + " Service ID: " + service5.getID() + " Service Cost: " + service5.getServiceCost());
            
            System.out.println("Information after update: ");
            
            //ID, Name, Address, City, State, Zip
            myServiceList.update("Service 1", 500);
            myServiceList.update(2, "Service 2", 0);
            myServiceList.update(3, "Service 3", 0.084);
            myServiceList.update(4, "Service 4", 10000000);
            myServiceList.update(5, "Service 5", 1);
           
            
            System.out.println("Service Name: " + service1.getServiceName() + " Service ID: " + service1.getID() + " Service Cost: " + service1.getServiceCost());
            System.out.println("Service Name: " + service2.getServiceName() + " Service ID: " + service2.getID() + " Service Cost: " + service2.getServiceCost());
            System.out.println("Service Name: " + service3.getServiceName() + " Service ID: " + service3.getID() + " Service Cost: " + service3.getServiceCost());
            System.out.println("Service Name: " + service4.getServiceName() + " Service ID: " + service4.getID() + " Service Cost: " + service4.getServiceCost());
            System.out.println("Service Name: " + service5.getServiceName() + " Service ID: " + service5.getID() + " Service Cost: " + service5.getServiceCost());
            
            System.out.println("PASSED");
            
        }
        catch (Exception e) {
            System.out.println("FAILED UPDATING");
            System.out.println(e.getMessage());
            System.out.println('\n');
        }
 
        /**
         *  TODO : Test delete
         */
        try{
            System.out.println("**Testing Delete**");
            myServiceList.delete(1);
            myServiceList.delete(2);
            myServiceList.delete(3);
            myServiceList.delete(4);
            myServiceList.delete(5);
                if(null == myServiceList.getService(1)                    
                    && null == myServiceList.getService(2)
                    && null == myServiceList.getService(3)
                    && null == myServiceList.getService(4)
                    && null == myServiceList.getService(5)){
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
