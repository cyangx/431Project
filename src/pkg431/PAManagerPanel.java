package pkg431;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;

/**
 * GUI for the Pizza Anonymous manager
 * @author Garrett
 * @author Cha
 */
public class PAManagerPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProviderSystemPanel
     */
    public PAManagerPanel() {
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

        ProviderReportButton = new javax.swing.JButton();
        AccountsPayableReportButton = new javax.swing.JButton();
        MemberReportButton = new javax.swing.JButton();
        SetAccountingPrecedureTimeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        ProviderReportButton.setText("Provider Report");
        ProviderReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProviderReportButtonActionPerformed(evt);
            }
        });

        AccountsPayableReportButton.setText("Accounts Payable Report");
        AccountsPayableReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountsPayableReportButtonActionPerformed(evt);
            }
        });

        MemberReportButton.setText("Member Report");
        MemberReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemberReportButtonActionPerformed(evt);
            }
        });

        SetAccountingPrecedureTimeButton.setText("Set Account Procedure Time");
        SetAccountingPrecedureTimeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetAccountingPrecedureTimeButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Report");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ProviderReportButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AccountsPayableReportButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(MemberReportButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(SetAccountingPrecedureTimeButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProviderReportButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AccountsPayableReportButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MemberReportButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SetAccountingPrecedureTimeButton)
                .addContainerGap(137, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ProviderReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProviderReportButtonActionPerformed
        String[] options = new String[]{"Back"};
        JPanel pd = new TextSummaryPanel("Provider Report", AccountingProcedure.instance().generateProviderReports());
        JOptionPane.showOptionDialog(null, pd,
                "Service Directory", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                options, options[0]);
    }//GEN-LAST:event_ProviderReportButtonActionPerformed

    private void AccountsPayableReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountsPayableReportButtonActionPerformed
        String[] options = new String[]{"Back"};
        JPanel pd = new TextSummaryPanel("Account Payable Report", AccountingProcedure.instance().generateAccountsPayableReports());
        JOptionPane.showOptionDialog(null, pd,
                "Service Directory", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                options, options[0]);
    }//GEN-LAST:event_AccountsPayableReportButtonActionPerformed

    private void MemberReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemberReportButtonActionPerformed
        String[] options = new String[]{"Back"};
        JPanel pd = new TextSummaryPanel("Member Report", AccountingProcedure.instance().generateMemberReports());
        JOptionPane.showOptionDialog(null, pd,
                "Service Directory", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                options, options[0]);
    }//GEN-LAST:event_MemberReportButtonActionPerformed

    private void SetAccountingPrecedureTimeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetAccountingPrecedureTimeButtonActionPerformed
        Date myDate = this.getDatePrompt("Next Date to run Account Procedure?");
        if(myDate != null)
        {
            AccountingProcedure.instance().setReportTime(myDate);
            SimpleDateFormat f = new SimpleDateFormat("MM-dd-yyy hh:mm:ss");
            JOptionPane.showMessageDialog(null, "Set " + f.format(AccountingProcedure.instance().getReportTime()));
        }

    }//GEN-LAST:event_SetAccountingPrecedureTimeButtonActionPerformed

    private Date getDatePrompt(String prompt) {
        Date result = null;
        JPanel panel = new JPanel();
        JLabel label = new JLabel(prompt);
        JSpinner _Date = new JSpinner();
        _Date.setModel(new javax.swing.SpinnerDateModel());
        _Date.setEditor(new javax.swing.JSpinner.DateEditor(_Date, "MM-dd-yyy hh:mm:ss"));
        _Date.setValue(AccountingProcedure.instance().getReportTime());
        panel.add(label);
        panel.add(_Date);
        String[] options = new String[]{"OK", "Cancel"};
        int option = JOptionPane.showOptionDialog(null, panel, prompt,
                JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[1]);
        if (option == 0) // pressing OK button
        {
            try {
                result = (Date) _Date.getValue();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error with date.");
            }
        }

        return result;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AccountsPayableReportButton;
    private javax.swing.JButton MemberReportButton;
    private javax.swing.JButton ProviderReportButton;
    private javax.swing.JButton SetAccountingPrecedureTimeButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
