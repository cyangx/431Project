package pkg431;

/**
 * Provides some credentials
 *
 * @author Garrett
 */
public class Security {

    Security() {

    }

    public boolean validateProvider(String Pwd) {
        return ("PROVIDER".equals(Pwd));
    }

    public boolean validateAdmin(String Pwd) {
        return ("ADMIN".equals(Pwd));
    }

}
