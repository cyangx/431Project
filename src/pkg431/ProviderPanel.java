package pkg431;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cha
 */
public class ProviderPanel extends javax.swing.JPanel {

    private int pID;

    /**
     * Creates new form ProviderSystemPanel
     */
    public ProviderPanel(int ID) {
        initComponents();
        pID = ID;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ValidateMemberButton = new javax.swing.JButton();
        SubmitClaimButton = new javax.swing.JButton();
        ProviderDirectoryButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        UpdateButton = new javax.swing.JButton();

        ValidateMemberButton.setText("Validate Member");
        ValidateMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidateMemberButtonActionPerformed(evt);
            }
        });

        SubmitClaimButton.setText("Submit Claim");
        SubmitClaimButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitClaimButtonActionPerformed(evt);
            }
        });

        ProviderDirectoryButton.setText("Provider Directory");
        ProviderDirectoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProviderDirectoryButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Provider System");

        UpdateButton.setText("Update Bank Information");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SubmitClaimButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ValidateMemberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProviderDirectoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(ValidateMemberButton)
                .addGap(18, 18, 18)
                .addComponent(SubmitClaimButton)
                .addGap(18, 18, 18)
                .addComponent(ProviderDirectoryButton)
                .addGap(18, 18, 18)
                .addComponent(UpdateButton)
                .addContainerGap(72, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ValidateMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValidateMemberButtonActionPerformed
        String input = JOptionPane.showInputDialog(this, "Enter Member ID:");
        try {
            if (MemberList.instance().validate(Integer.parseInt(input))) {
                Member myMember = MemberList.instance().getMember(Integer.parseInt(input));
                if (myMember.isSuspend()) {
                    JOptionPane.showMessageDialog(null, "Member Suspended.");
                } else {
                    JOptionPane.showMessageDialog(null, "Member is valid.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Member Does not exist.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid ID.");
        }
    }//GEN-LAST:event_ValidateMemberButtonActionPerformed

    private void SubmitClaimButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitClaimButtonActionPerformed
        // TODO Submit a claim

        String input = JOptionPane.showInputDialog(this, "Enter Member ID:");
        try {
            if (MemberList.instance().validate(Integer.parseInt(input))) {
                Member myMember = MemberList.instance().getMember(Integer.parseInt(input));
                if (myMember.isSuspend()) {
                    JOptionPane.showMessageDialog(null, "Member Suspended");
                } else {
                    // TODO Happy path
                    String[] options = new String[]{"Back"};
                    JPanel claimPanel = new SubmitClaimPanel(myMember.getID(), pID);
                    JOptionPane.showOptionDialog(null, claimPanel,
                            "Submit a Claim", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                            options, options[0]);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Service ID");
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_SubmitClaimButtonActionPerformed

    private void ProviderDirectoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProviderDirectoryButtonActionPerformed
        String[] options = new String[]{"Back"};
        JPanel pd = new TextSummaryPanel("Service Directory", ServiceList.instance().getServiceDirectoryText());
        JOptionPane.showOptionDialog(null, pd,
                "Service Directory", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                options, options[0]);
    }//GEN-LAST:event_ProviderDirectoryButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO generate a provider report
    }//GEN-LAST:event_UpdateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ProviderDirectoryButton;
    private javax.swing.JButton SubmitClaimButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JButton ValidateMemberButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
