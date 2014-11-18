/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg431;

import java.io.File;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Garrett
 */
public class SaveTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File("./SaveFiles/SystemData");
        if (f.exists() && !f.isDirectory()) {
            f.delete();
        }
        SystemData.instance();

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -8);
        Date eightDaysAgo = cal.getTime();
        Date Now = new Date();

        Provider myProvider = Factory.getInstance().MakeProvider("Test Name", "Test Address", "St. Cloud", "MN", "56301", "Bank", "123");
        Provider myProvider2 = Factory.getInstance().MakeProvider("Test Name2", "Test Address2", "St. Croix", "WI", "56377", "Bank", "123");
        Member myMember = Factory.getInstance().MakeMember("Test Name", "Test Address", "St. Cloud", "MN", "56301");
        Member myMember2 = Factory.getInstance().MakeMember("Test Name2", "Test Address2", "St. Croix", "WI", "66345");
        Service myService = Factory.getInstance().MakeService("Test Name", 500.59);
        Service myService2 = Factory.getInstance().MakeService("Test Name2", 50.01);

        /**
         * Add Providers
         */
        ProviderList pl = ProviderList.instance();
        pl.addProvider(myProvider);
        pl.addProvider(myProvider2);

        /**
         * Add Members
         */
        MemberList ml = MemberList.instance();
        ml.addMember(myMember);
        ml.addMember(myMember2);

        /**
         * Add services
         */
        ServiceList.instance().addService(myService);
        ServiceList.instance().addService(myService2);

        ServiceRecordList.getInstance().CaptureService(myProvider, myMember, myService, eightDaysAgo, "Comments");
        ServiceRecordList.getInstance().CaptureService(myProvider, myMember2, myService2, Now, "Comments");
        ServiceRecordList.getInstance().CaptureService(myProvider2, myMember2, myService, Now, "More Comments");
        ServiceRecordList.getInstance().CaptureService(myProvider, myMember, myService, Now, "Comments");

        System.exit(0);
    }

}
