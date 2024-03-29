/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg431;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * GUI for submitting a claim to Pizza Anonymous
 * @author Garrett
 */
public class SubmitClaimPanel extends javax.swing.JPanel {

    int _pID;

    /**
     * Creates new form SubmitClaimPanel
     */
    public SubmitClaimPanel(int mID, int pID) {
        initComponents();
        _memberID.setText(Integer.toString(mID));
        _pID = pID;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _memberID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        _serviceID = new javax.swing.JTextField();
        ServiceDirectoryButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        _comments = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        SubmitButton = new javax.swing.JButton();
        _Date = new javax.swing.JSpinner();

        _memberID.setEnabled(false);

        jLabel1.setText("Member ID:");

        jLabel2.setText("Date of Service:");

        jLabel3.setText("Service ID:");

        ServiceDirectoryButton.setText("Service Directory");
        ServiceDirectoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServiceDirectoryButtonActionPerformed(evt);
            }
        });

        _comments.setColumns(20);
        _comments.setRows(5);
        _comments.setWrapStyleWord(true);
        jScrollPane1.setViewportView(_comments);

        jLabel4.setText("Comments:");

        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        _Date.setModel(new javax.swing.SpinnerDateModel());
        _Date.setEditor(new javax.swing.JSpinner.DateEditor(_Date, "MM-dd-yyy"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(_serviceID, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(_memberID))
                                .addGap(18, 18, 18)
                                .addComponent(ServiceDirectoryButton)
                                .addGap(22, 22, 22)))
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SubmitButton)
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_memberID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(_serviceID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ServiceDirectoryButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SubmitButton)
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ServiceDirectoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServiceDirectoryButtonActionPerformed
        String[] options = new String[]{"Back"};
        JPanel pd = new TextSummaryPanel("Service Directory", ServiceList.instance().getServiceDirectoryText());
        JOptionPane.showOptionDialog(null, pd,
                "Service Directory", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                options, options[0]);
    }//GEN-LAST:event_ServiceDirectoryButtonActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        Member myMember = null;
        Provider myProvider = null;
        Service myService = null;
        Date myDate = null;
        try {
            if (MemberList.instance().validate(Integer.parseInt(_memberID.getText()))) {
                myMember = MemberList.instance().getMember(Integer.parseInt(_memberID.getText()));
            } else {
                JOptionPane.showMessageDialog(null, "Member ID does not exist.");
                return;
            }

            if (ServiceList.instance().validate(Integer.parseInt(this._serviceID.getText()))) {
                myService = ServiceList.instance().getService(Integer.parseInt(this._serviceID.getText()));
            } else {
                JOptionPane.showMessageDialog(null, "Service ID does not exist.");
                return;
            }

            if (ProviderList.instance().validate(_pID)) {
                myProvider = ProviderList.instance().getProvider(_pID);
            } else {
                JOptionPane.showMessageDialog(null, "Provider ID does not exist.");
                return;
            }
            
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid ID.");
                return;
        }
        try
        {
            myDate = (Date)this._Date.getValue();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error with date.");
            return;
        }
        ServiceRecordList.getInstance().CaptureService(myProvider, myMember, myService, myDate, this._comments.getText());
        JOptionPane.showMessageDialog(null, "Added.");
        ResetView();
    }//GEN-LAST:event_SubmitButtonActionPerformed

    void ResetView() {
        _comments.setText(null);
        _serviceID.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ServiceDirectoryButton;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JSpinner _Date;
    private javax.swing.JTextArea _comments;
    private javax.swing.JTextField _memberID;
    private javax.swing.JTextField _serviceID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
