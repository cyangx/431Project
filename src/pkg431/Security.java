package pkg431;

/**
 *
 * @author Garrett
 */
public class Security {
    
    public boolean validateProvider(String Pwd)
    {
        return(Pwd == "PROVIDER");
    }
    
    public boolean validateAdmin(String Pwd)
    {
        return(Pwd == "ADMIN");
    }
    
}
