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
         *  Testing add and getMember
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
         *  Test Validate
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
         *  TODO: Testing update
         */
        System.out.println("**Testing update**");
 
        /**
         *  TODO : Test delete
         */
        System.out.println("**Testing delete**");
    }

}
