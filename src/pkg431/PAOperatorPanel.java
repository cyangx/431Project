package pkg431;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cha
 */
public class PAOperatorPanel extends javax.swing.JPanel {

    private final static int ID_SIZE = 9;

    /**
     * Creates new form ProviderPanel
     */
    public PAOperatorPanel() {
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

        AddMemberButton = new javax.swing.JButton();
        UpdateMemberButton = new javax.swing.JButton();
        UpdateServiceButton = new javax.swing.JButton();
        UpdateProviderButton = new javax.swing.JButton();
        AddProviderButton = new javax.swing.JButton();
        OperatorMenuLabel = new javax.swing.JLabel();
        AddServiceButton = new javax.swing.JButton();

        AddMemberButton.setText("Add Member");
        AddMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMemberButtonActionPerformed(evt);
            }
        });

        UpdateMemberButton.setText("Update Member");
        UpdateMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateMemberButtonActionPerformed(evt);
            }
        });

        UpdateServiceButton.setText("Update Service");
        UpdateServiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateServiceButtonActionPerformed(evt);
            }
        });

        UpdateProviderButton.setText("Update Provider");
        UpdateProviderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateProviderButtonActionPerformed(evt);
            }
        });

        AddProviderButton.setText("Add Provider");
        AddProviderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProviderButtonActionPerformed(evt);
            }
        });

        OperatorMenuLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        OperatorMenuLabel.setText("Operator Menu");

        AddServiceButton.setText("Add Service");
        AddServiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddServiceButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(OperatorMenuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddServiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AddProviderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UpdateMemberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UpdateProviderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(UpdateServiceButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AddMemberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(OperatorMenuLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddMemberButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UpdateMemberButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddProviderButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UpdateProviderButton)
                .addGap(9, 9, 9)
                .addComponent(AddServiceButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UpdateServiceButton)
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMemberButtonActionPerformed
        String[] options = new String[]{"Back"};
        JPanel memberPanel = new MemberMaintainanceJPanel(false, 0);
        JOptionPane.showOptionDialog(null, memberPanel,
                "Member Maintainance", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                options, options[0]);
    }//GEN-LAST:event_AddMemberButtonActionPerformed

    private void AddProviderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProviderButtonActionPerformed
        String[] options = new String[]{"Back"};
        JPanel providerPanel = new ProviderMaintainanceJPanel(false, 0);
        JOptionPane.showOptionDialog(null, providerPanel,
                "Provider Maintainance", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                options, options[0]);
    }//GEN-LAST:event_AddProviderButtonActionPerformed

    private void UpdateMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateMemberButtonActionPerformed
        // TODO add your handling code here:
        String id = this.messagePrompt("Member ID");
        if (id != null) {
            try {
                int realID = Integer.parseInt(id);
                if (MemberList.instance().validate(realID)) {
                    String[] options = new String[]{"Back"};
                    JPanel memberPanel = new MemberMaintainanceJPanel(true, realID);
                    JOptionPane.showOptionDialog(null, memberPanel,
                            "Member Maintainance", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                            options, options[0]);
                } else {
                    JOptionPane.showMessageDialog(null, "ID does not exist");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid ID");
            }
        }
    }//GEN-LAST:event_UpdateMemberButtonActionPerformed

    private void UpdateProviderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateProviderButtonActionPerformed
        String id = this.messagePrompt("Provider ID");
        if (id != null) {
            try {
                int realID = Integer.parseInt(id);
                if (ProviderList.instance().validate(realID)) {
                    String[] options = new String[]{"Back"};
                    JPanel providerPanel = new ProviderMaintainanceJPanel(true, realID);
                    JOptionPane.showOptionDialog(null, providerPanel,
                            "Provider Maintainance", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                            options, options[0]);
                } else {
                    JOptionPane.showMessageDialog(null, "ID does not exist");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid ID");
            }
        }
    }//GEN-LAST:event_UpdateProviderButtonActionPerformed

    private void AddServiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddServiceButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddServiceButtonActionPerformed

    private void UpdateServiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateServiceButtonActionPerformed
        
    }//GEN-LAST:event_UpdateServiceButtonActionPerformed

    private String messagePrompt(String prompt) {
        String result = null;
        JPanel panel = new JPanel();
        JLabel label = new JLabel(prompt);
        JTextField input = new JTextField(ID_SIZE);
        panel.add(label);
        panel.add(input);
        String[] options = new String[]{"OK", "Cancel"};
        int option = JOptionPane.showOptionDialog(null, panel, prompt,
                JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[1]);
        if (option == 0) // pressing OK button
        {
            result = input.getText();
        }
        return result;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddMemberButton;
    private javax.swing.JButton AddProviderButton;
    private javax.swing.JButton AddServiceButton;
    private javax.swing.JLabel OperatorMenuLabel;
    private javax.swing.JButton UpdateMemberButton;
    private javax.swing.JButton UpdateProviderButton;
    private javax.swing.JButton UpdateServiceButton;
    // End of variables declaration//GEN-END:variables
}
