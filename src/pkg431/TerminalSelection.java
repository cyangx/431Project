/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg431;

import java.util.Arrays;
import javax.swing.*;

/**
 * Terminal for selecting which terminal to use
 * @author Garrett
 */
public class TerminalSelection extends javax.swing.JPanel {

    /**
     * Creates new form TerminalSelection
     */
    public TerminalSelection() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProviderButton = new javax.swing.JButton();
        PizzaAnonymousManagerButton = new javax.swing.JButton();
        SelectionLabel = new javax.swing.JLabel();
        PizzaAnonymousOperatorButton = new javax.swing.JButton();

        ProviderButton.setText("Provider Terminal");
        ProviderButton.setMaximumSize(new java.awt.Dimension(159, 23));
        ProviderButton.setMinimumSize(new java.awt.Dimension(159, 23));
        ProviderButton.setPreferredSize(new java.awt.Dimension(159, 23));
        ProviderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProviderButtonActionPerformed(evt);
            }
        });

        PizzaAnonymousManagerButton.setText("Pizza Anonymous Manager Terminal");
        PizzaAnonymousManagerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PizzaAnonymousManagerButtonActionPerformed(evt);
            }
        });

        SelectionLabel.setText("Select a terminal to use:");

        PizzaAnonymousOperatorButton.setText("Pizza Anonymous Operator Terminal");
        PizzaAnonymousOperatorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PizzaAnonymousOperatorButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PizzaAnonymousManagerButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PizzaAnonymousOperatorButton)
                        .addGap(46, 46, 46))))
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProviderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(SelectionLabel)
                        .addGap(15, 15, 15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(SelectionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ProviderButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PizzaAnonymousManagerButton)
                .addGap(18, 18, 18)
                .addComponent(PizzaAnonymousOperatorButton)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ProviderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProviderButtonActionPerformed
        String input = JOptionPane.showInputDialog(this, "Enter Provider ID:");
        if (input == null || (input != null && ("".equals(input)))) {
            // they hit cancel
        } else {
            try {
                if (ProviderList.instance().validate(Integer.parseInt(input))) {
                    String[] options = new String[]{"Back"};
                    JPanel operatorMenu = new ProviderPanel(Integer.parseInt(input));
                    JOptionPane.showOptionDialog(null, operatorMenu,
                            "Pizza Anonymous Provider Menu", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                            options, options[0]);
                } else {
                    JOptionPane.showMessageDialog(null, "Provider does not exist");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid ID");
            }
        }
    }//GEN-LAST:event_ProviderButtonActionPerformed

    private void PizzaAnonymousManagerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PizzaAnonymousManagerButtonActionPerformed
        String pass = this.getPassword("Enter Admin password:");
        if (pass != null) {
            if (Security.validateAdmin(pass)) {
                String[] options = new String[]{"Back"};
                JPanel managerMenu = new PAManagerPanel();
                JOptionPane.showOptionDialog(null, managerMenu,
                        "Pizza Anonymous Manager Menu", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                        options, options[0]);
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Password");
            }
        }
    }//GEN-LAST:event_PizzaAnonymousManagerButtonActionPerformed

    private void PizzaAnonymousOperatorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PizzaAnonymousOperatorButtonActionPerformed
        String pass = this.getPassword("Enter Admin password:");
        if (pass != null) {
            if (Security.validateAdmin(pass)) {

                String[] options = new String[]{"Back"};
                JPanel operatorMenu = new PAOperatorPanel();
                JOptionPane.showOptionDialog(null, operatorMenu,
                        "Pizza Anonymous Operator Menu", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                        options, options[0]);
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Password");
            }
        }
    }//GEN-LAST:event_PizzaAnonymousOperatorButtonActionPerformed

    private String getPassword(String prompt) {
        String result = null;
        JPanel panel = new JPanel();
        JLabel label = new JLabel(prompt);
        JPasswordField pass = new JPasswordField(10);
        panel.add(label);
        panel.add(pass);
        String[] options = new String[]{"OK", "Cancel"};
        int option = JOptionPane.showOptionDialog(null, panel, prompt,
                JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[1]);
        if (option == 0) // pressing OK button
        {
            char[] password = pass.getPassword();
            result = new String(password);
        }

        return result;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PizzaAnonymousManagerButton;
    private javax.swing.JButton PizzaAnonymousOperatorButton;
    private javax.swing.JButton ProviderButton;
    private javax.swing.JLabel SelectionLabel;
    // End of variables declaration//GEN-END:variables
}
