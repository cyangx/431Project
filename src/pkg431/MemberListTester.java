package pkg431;

import java.util.Date;

/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
/**
 *
 * @author Garrett
 */
public class MemberListTester {

    public static void main(String args[]) {

        System.out.println("** TESTING MEMBERLIST CODE**");

        MemberList myMemberList = MemberList.instance();
        /**
         * Testing add and getMember
         */
        System.out.println("**Testing add and getMember**");
        try {
            myMemberList.addMember(new Member("This name is too long for the constructor", 1, "This address is too long for the constructor", "This is a really big city name", "AAZ", "5637778"));
            myMemberList.addMember(new Member(null, 2, null, null, null, null));
            myMemberList.addMember(new Member("This is twenty five chars", 3, "This is twenty five chars", "Thisisfourteen", "AZ", "56377"));
            myMemberList.addMember(new Member("Test Name", 4, "Test Address", "St. Cloud", "MN", "56301"));
            myMemberList.addMember(new Member("", 5, "", "", "", ""));

            if (null != myMemberList.getMember(1)
                    && null != myMemberList.getMember(2)
                    && null != myMemberList.getMember(3)
                    && null != myMemberList.getMember(4)
                    && null != myMemberList.getMember(5)) {
                System.out.println("PASSED");
            } else {
                throw new Exception("Failed to add or lookup");
            }
        } catch (Exception e) {
            System.out.println("FAILED");
            System.out.println(e.getMessage());
            System.out.println('\n');
        }

        /**
         * Test Validate
         */
        System.out.println("**Testing validate**");
        try {
            if (myMemberList.validate(1)
                    && myMemberList.validate(2)
                    && myMemberList.validate(3)
                    && myMemberList.validate(4)
                    && myMemberList.validate(5)) {
                System.out.println("PASSED");
            } else {
                throw new Exception("Failed to add or lookup");
            }
        } catch (Exception e) {
            System.out.println("FAILED");
            System.out.println(e.getMessage());
            System.out.println('\n');
        }

        /**
         * Test Update
         */
        System.out.println("**Testing Update inputs**");
        try {
            System.out.println("**Updating member 1**");
            Member myMember = myMemberList.getMember(1);
            System.out.println("**Current information**");
            System.out.println(myMember.getName());
            System.out.println(myMember.getID());
            System.out.println(myMember.getAddress());
            System.out.println(myMember.getCity());
            System.out.println(myMember.getState());
            System.out.println(myMember.getZipcode());

            System.out.println("**Updated Information**");
            myMember.update("Bob", "123 Fake St", "St Cloud", "Mn", "56304");
            System.out.println(myMember.getName());
            System.out.println(myMember.getID());
            System.out.println(myMember.getAddress());
            System.out.println(myMember.getCity());
            System.out.println(myMember.getState());
            System.out.println(myMember.getZipcode());

            if ("Bob".equals(myMember.getName())
                    && "123 Fake St".equals(myMember.getAddress())
                    && "St Cloud".equals(myMember.getCity())
                    && "Mn".equals(myMember.getState())
                    && "56304".equals(myMember.getZipcode())) {
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
         * Test Delete
         */
        System.out.println("**Testing Deleting a member**");
        try {
            System.out.println("**Deleting member 1**");
            myMemberList.delete(1);
            if (myMemberList.getMember(1) == null) {
                System.out.println("PASSED");
            } else {
                throw new Exception("Delete failed");
            }
            System.out.println('\n');
        } catch (Exception e) {
            System.out.println("FAILED");
            System.out.println(e.getMessage());
            System.out.println('\n');
        }
    }

}
