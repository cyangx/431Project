/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg431;

import javax.swing.JOptionPane;

/**
 *
 * @author Garrett
 */
public class ProviderMaintainanceJPanel extends javax.swing.JPanel {

    private int _ID;
    private boolean _update = false;

    /**
     * Creates new form Provider Panel
     */
    public ProviderMaintainanceJPanel(boolean update, int ID) {
        initComponents();
        _update = update;
        _ID = ID;
        this.SetView();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _state = new javax.swing.JTextField();
        _zipCode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        _name = new javax.swing.JTextField();
        _address = new javax.swing.JTextField();
        _city = new javax.swing.JTextField();
        DeleteButton = new javax.swing.JButton();
        _bankName = new javax.swing.JTextField();
        _bankNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        _state.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _stateActionPerformed(evt);
            }
        });

        _zipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _zipCodeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Provider:");

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        jLabel2.setText("Name");

        jLabel3.setText("Street Address");

        jLabel4.setText("City");

        jLabel5.setText("State");

        jLabel6.setText("Zip Code");

        _name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _nameActionPerformed(evt);
            }
        });

        _address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _addressActionPerformed(evt);
            }
        });

        _city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cityActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        _bankName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _bankNameActionPerformed(evt);
            }
        });

        _bankNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _bankNumberActionPerformed(evt);
            }
        });

        jLabel7.setText("Bank Name");

        jLabel8.setText("Bank Number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(_state, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(_zipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(_city, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(_address, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(_name, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(_bankName, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(_bankNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Add))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DeleteButton)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(255, 255, 255))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(DeleteButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(_state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(_zipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_bankName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_bankNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(Add)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void _stateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__stateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__stateActionPerformed

    private void _zipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__zipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__zipCodeActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        if (_update) {
            ProviderList.instance().update(_ID,
                    this._name.getText(), this._address.getText(),
                    this._city.getText(), this._state.getText(),
                    this._zipCode.getText());
            ProviderList.instance().updateBankAccount(_ID,
                    this._bankName.getText(), this._bankNumber.getText());
            JOptionPane.showMessageDialog(null, "Updated.");
        } else {
            // Create a provider
            Provider newProvider = Factory.getInstance().MakeProvider(
                    _name.getText(), _address.getText(), _city.getText(),
                    _state.getText(), _zipCode.getText(),
                    this._bankName.getText(), this._bankNumber.getText());
            // Add provider to the ProviderList
            if (ProviderList.instance().addProvider(newProvider)) {
                JOptionPane.showMessageDialog(null, "Added.");
                ResetView();
            }
        }
    }//GEN-LAST:event_AddActionPerformed

    private void _nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__nameActionPerformed

    private void _addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__addressActionPerformed

    private void _cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__cityActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete member?", "Delete?", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            MemberList.instance().delete(_ID);
            ResetView();
        }

    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void _bankNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__bankNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__bankNameActionPerformed

    private void _bankNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__bankNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__bankNumberActionPerformed
    private void ResetView() {
        _ID = 0;
        _update = false;
        _name.setText(null);
        _address.setText(null);
        _city.setText(null);
        _state.setText(null);
        _zipCode.setText(null);
        this._bankName.setText(null);
        this._bankNumber.setText(null);
        SetView();
    }

    private void SetView() {
        if (_update) {
            this.Add.setText("Update");
            Provider myProvider = ProviderList.instance().getProvider(_ID);
            if (null != myProvider) {
                this._address.setText(myProvider.getAddress());
                this._city.setText(myProvider.getCity());
                this._name.setText(myProvider.getProviderName());
                this._state.setText(myProvider.getState());
                this._zipCode.setText(myProvider.getZipcode());
                this._bankName.setText(myProvider.getBankAccountName());
                this._bankNumber.setText(myProvider.getBankAccountNum());
            }
        } else {
            this.Add.setText("Add");
        }
        this.DeleteButton.setVisible(_update);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField _address;
    private javax.swing.JTextField _bankName;
    private javax.swing.JTextField _bankNumber;
    private javax.swing.JTextField _city;
    private javax.swing.JTextField _name;
    private javax.swing.JTextField _state;
    private javax.swing.JTextField _zipCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
