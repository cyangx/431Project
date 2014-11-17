package pkg431;

/**
 *
 * @author Cha 
 * 
 * Provider interface for command line testing
 */
import java.util.*;
import java.text.*;
import java.io.*;

public class ProviderInterface {

    private static ProviderInterface userInterface;
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static final int EXIT = 0;
    private static final int ADD_MEMBER = 1;
    private static final int VALIDATE_MEMBER = 2;
    private static final int ADD_SERVICE = 3;
    private static final int REMOVE_SERVICE = 4;
    private static final int UPDATE_SERVICE = 5;
    private static final int SAVE = 10;
    private static final int RETRIEVE = 11;
    private static final int HELP = 15;

    private ProviderInterface() {
        // load the system data
        SystemData.load();
    }

    public static ProviderInterface instance() {
        if (userInterface == null) {
            return userInterface = new ProviderInterface();
        } else {
            return userInterface;
        }
    }

    public String getToken(String prompt) {
        do {
            try {
                System.out.println(prompt);
                String line = reader.readLine();
                StringTokenizer tokenizer = new StringTokenizer(line, "\n\r\f");
                if (tokenizer.hasMoreTokens()) {
                    return tokenizer.nextToken();
                }
            } catch (IOException ioe) {
                System.exit(0);
            }
        } while (true);
    }

    private boolean yesOrNo(String prompt) {
        String more = getToken(prompt + " (Y|y)[es] or anything else for no");
        if (more.charAt(0) != 'y' && more.charAt(0) != 'Y') {
            return false;
        }
        return true;
    }

    public int getNumber(String prompt) {
        do {
            try {
                String item = getToken(prompt);
                Integer num = Integer.valueOf(item);
                return num.intValue();
            } catch (NumberFormatException nfe) {
                System.out.println("Please input a number ");
            }
        } while (true);
    }

    public Calendar getDate(String prompt) {
        do {
            try {
                Calendar date = new GregorianCalendar();
                String item = getToken(prompt);
                DateFormat df = SimpleDateFormat.getDateInstance(DateFormat.SHORT);
                date.setTime(df.parse(item));
                return date;
            } catch (Exception fe) {
                System.out.println("Please input a date as mm/dd/yy");
            }
        } while (true);
    }

    public int getCommand() {
        do {
            try {
                int value = Integer.parseInt(getToken("Enter command:" + HELP + " for help"));
                if (value >= EXIT && value <= HELP) {
                    return value;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Enter a number");
            }
        } while (true);
    }

    public void help() {
        System.out.println("Enter a number between 0 and 12 as explained below:");
        System.out.println(EXIT + " to Exit\n");
        System.out.println(ADD_MEMBER + " to add a member");
        System.out.println(VALIDATE_MEMBER + " to validate a member");
        System.out.println(SAVE + " to  save data");
        System.out.println(RETRIEVE + " to  retrieve");
        System.out.println(HELP + " for help");
    }

    public void addMember() {
        String _name = getToken("Enter member name");
        String _address = getToken("Enter address");
        String _city = getToken("Enter city");
        String _state = getToken("Enter state");
        String _zipCode = getToken("Enter zip code");

        Member newMember = Factory.getInstance().MakeMember(_name,
                _address, _city, _state, _zipCode);

        if (newMember == null) {
            System.out.println("Could not add member");
        } else {
            System.out.println("Member added");
        }

    }

    public void validateMember() {
    }

    public void addService() {
    }

    public void removeService() {
    }

    public void updateService() {
    }

    private void save() {
        // save system data
        SystemData.save();
    }

    private void retrieve() {
        // get system data
        SystemData.load();
    }

    public void process() {
        int command;
        help();
        while ((command = getCommand()) != EXIT) {
            switch (command) {
                case ADD_MEMBER:
                    addMember();
                    break;
                case VALIDATE_MEMBER:
                    validateMember();
                    break;
                case ADD_SERVICE:
                    addService();
                    break;
                case REMOVE_SERVICE:
                    removeService();
                    break;
                case UPDATE_SERVICE:
                    updateService();
                    break;
                case SAVE:
                    save();
                    break;
                case RETRIEVE:
                    retrieve();
                    break;
                case HELP:
                    help();
                    break;
            }
        }
    }

    public static void main(String[] s) {
        ProviderInterface.instance().process();
    }
}
