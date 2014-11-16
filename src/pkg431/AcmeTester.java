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
public class AcmeTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MemberList.instance().addMember(new Member("Name", 1, "Address", "City", "St", "56377"));
        MemberList.instance().addMember(new Member("Name", 2, "Address", "City", "St", "56377"));
        AccountingProcedure.instance().readAcmeFile();
        MemberList test = MemberList.instance();
        if (MemberList.instance().getMember(1) != null
                && MemberList.instance().getMember(2) != null
                && MemberList.instance().getMember(1).isSuspend()
                && !MemberList.instance().getMember(2).isSuspend()) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
    }

}
