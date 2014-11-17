package pkg431;

import javax.swing.JFrame;

/**
 *
 * @author Garrett
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame("Test");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new ProviderSystemPanel());
        f.pack();
        f.setVisible(true);
    }
    
}
