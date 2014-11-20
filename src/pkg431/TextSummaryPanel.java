/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg431;

/**
 * Generic panel for displaying text (read only)
 * @author Garrett
 */
public class TextSummaryPanel extends javax.swing.JPanel {

    /**
     * Creates new form ServiceDirectoryPanel
     */
    public TextSummaryPanel(String Subject, String Body) {
        initComponents();
        this.SubjectLabel.setText(Subject);
        this.BodyText.setText(Body);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SubjectLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BodyText = new javax.swing.JTextPane();

        SubjectLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SubjectLabel.setText("Text");

        BodyText.setBackground(new java.awt.Color(0, 0, 0));
        BodyText.setForeground(new java.awt.Color(255, 255, 255));
        BodyText.setEnabled(false);
        jScrollPane1.setViewportView(BodyText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SubjectLabel)
                        .addGap(0, 334, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(SubjectLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane BodyText;
    private javax.swing.JLabel SubjectLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
