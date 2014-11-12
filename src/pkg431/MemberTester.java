package pkg431;

/**
 *
 * @author Garrett
 */
public class MemberTester {

    private final static int NAME_LENGTH = 25;
    private final static int ADDRESS_LENGTH = 25;
    private final static int CITY_LENGTH = 14;
    private final static int STATE_LENGTH = 2;
    private final static int ZIP_LENGTH = 5;

    public static void main(String args[]) {

        Member myMember;

        System.out.println("** TESTING MEMBER CODE**");
        System.out.println('\n');

        /**
         * This tests for more than the maximum characters
         */
        System.out.println("**Testing big inputs**");
        try {
            myMember = new Member("This name is too long for the constructor", 1, "This address is too long for the constructor", "This is a really big city name", "AAZ", "5637778");
            System.out.println(myMember.getName() + " " + myMember.getName().length());
            System.out.println(myMember.getID());
            System.out.println(myMember.getAddress() + " " + myMember.getAddress().length());
            System.out.println(myMember.getCity() + " " + myMember.getCity().length());
            System.out.println(myMember.getState() + " " + myMember.getState().length());
            System.out.println(myMember.getZipcode() + " " + myMember.getZipcode().length());
            if (NAME_LENGTH == myMember.getName().length()
                    && ADDRESS_LENGTH == myMember.getAddress().length()
                    && CITY_LENGTH == myMember.getCity().length()
                    && STATE_LENGTH == myMember.getState().length()
                    && ZIP_LENGTH == myMember.getZipcode().length()) {
                System.out.println("PASSED");
            } else {
                throw new Exception("Field length mismatch");
            }
            System.out.println('\n');
        } catch (Exception e) {
            System.out.println("FAILED");
            System.out.println(e.getMessage());
            System.out.println('\n');
        }

        /**
         * This tests for null inputs
         */
        System.out.println("**Testing Null inputs**");
        try {
            myMember = new Member(null, 0, null, null, null, null);
            System.out.println("PASSED");
            System.out.println('\n');
        } catch (Exception e) {
            System.out.println("FAILED");
            System.out.println(e.getMessage());
            System.out.println('\n');
        }

        /**
         * This tests boundary inputs
         */
        System.out.println("**Testing boundary inputs**");
        try {
            myMember = new Member("This is twenty five chars", 1, "This is twenty five chars", "Thisisfourteen", "AZ", "56377");
            System.out.println(myMember.getName() + " " + myMember.getName().length());
            System.out.println(myMember.getID());
            System.out.println(myMember.getAddress() + " " + myMember.getAddress().length());
            System.out.println(myMember.getCity() + " " + myMember.getCity().length());
            System.out.println(myMember.getState() + " " + myMember.getState().length());
            System.out.println(myMember.getZipcode() + " " + myMember.getZipcode().length());
            if (NAME_LENGTH == myMember.getName().length()
                    && ADDRESS_LENGTH == myMember.getAddress().length()
                    && CITY_LENGTH == myMember.getCity().length()
                    && STATE_LENGTH == myMember.getState().length()
                    && ZIP_LENGTH == myMember.getZipcode().length()) {
                System.out.println("PASSED");
            } else {
                throw new Exception("Field length mismatch");
            }
            System.out.println('\n');
        } catch (Exception e) {
            System.out.println("FAILED");
            System.out.println(e.getMessage());
            System.out.println('\n');
        }

        /**
         * This tests valid inputs
         */
        System.out.println("**Testing valid inputs**");
        try {
            myMember = new Member("Test Name", 1, "Test Address", "St. Cloud", "MN", "56301");
            System.out.println(myMember.getName() + " " + myMember.getName().length());
            System.out.println(myMember.getID());
            System.out.println(myMember.getAddress() + " " + myMember.getAddress().length());
            System.out.println(myMember.getCity() + " " + myMember.getCity().length());
            System.out.println(myMember.getState() + " " + myMember.getState().length());
            System.out.println(myMember.getZipcode() + " " + myMember.getZipcode().length());
            if (NAME_LENGTH >= myMember.getName().length()
                    && ADDRESS_LENGTH >= myMember.getAddress().length()
                    && CITY_LENGTH >= myMember.getCity().length()
                    && STATE_LENGTH >= myMember.getState().length()
                    && ZIP_LENGTH >= myMember.getZipcode().length()) {
                System.out.println("PASSED");
            } else {
                throw new Exception("Field length mismatch");
            }
            System.out.println('\n');
        } catch (Exception e) {
            System.out.println("FAILED");
            System.out.println(e.getMessage());
            System.out.println('\n');
        }

        /**
         * This tests empty string inputs
         */
        System.out.println("**Testing empty inputs**");
        try {
            myMember = new Member("", 5, "", "", "", "");
            System.out.println(myMember.getName() + " " + myMember.getName().length());
            System.out.println(myMember.getID());
            System.out.println(myMember.getAddress() + " " + myMember.getAddress().length());
            System.out.println(myMember.getCity() + " " + myMember.getCity().length());
            System.out.println(myMember.getState() + " " + myMember.getState().length());
            System.out.println(myMember.getZipcode() + " " + myMember.getZipcode().length());
            if (NAME_LENGTH >= myMember.getName().length()
                    && ADDRESS_LENGTH >= myMember.getAddress().length()
                    && CITY_LENGTH >= myMember.getCity().length()
                    && STATE_LENGTH >= myMember.getState().length()
                    && ZIP_LENGTH >= myMember.getZipcode().length()) {
                System.out.println("PASSED");
            } else {
                throw new Exception("Field length mismatch");
            }
            System.out.println('\n');
        } catch (Exception e) {
            System.out.println("FAILED");
            System.out.println(e.getMessage());
            System.out.println('\n');
        }

        /**
         * This tests updating
         */
        System.out.println("**Testing Update inputs**");
        try {
            myMember = new Member("", 5, "", "", "", "");
            myMember.update("This is new and should be truncated", "So is this and it will also be truncated", "this too is too big", "Yup", "New Zipcode");
            System.out.println(myMember.getName() + " " + myMember.getName().length());
            System.out.println(myMember.getID());
            System.out.println(myMember.getAddress() + " " + myMember.getAddress().length());
            System.out.println(myMember.getCity() + " " + myMember.getCity().length());
            System.out.println(myMember.getState() + " " + myMember.getState().length());
            System.out.println(myMember.getZipcode() + " " + myMember.getZipcode().length());
            if (NAME_LENGTH == myMember.getName().length()
                    && ADDRESS_LENGTH == myMember.getAddress().length()
                    && CITY_LENGTH == myMember.getCity().length()
                    && STATE_LENGTH == myMember.getState().length()
                    && ZIP_LENGTH == myMember.getZipcode().length()) {
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
         *  TODO: Test supending and unsuspending
         */
    }
}
