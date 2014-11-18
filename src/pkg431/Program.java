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
        MemberList.load();
        Factory.load();
        // TODO code application logic here
        JFrame f = new JFrame("Pizza Anonymous");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new TerminalSelection());
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    
}
