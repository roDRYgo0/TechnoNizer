package JPanel.contact;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javaClass.standardization;

public class addContact extends javax.swing.JPanel {

    boolean action;
    int contactType = 0;
    
    public addContact() {
        initComponents();
        this.action = false;
    }
    
    public addContact(boolean action){
        initComponents();
        this.action = action;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblContact = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtContact = new javax.swing.JTextField();
        spMail = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(204, 255, 0));
        setMaximumSize(new java.awt.Dimension(450, 55));
        setMinimumSize(new java.awt.Dimension(450, 55));
        setPreferredSize(new java.awt.Dimension(450, 55));

        lblContact.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblContact.setText("Contacto");

        jButton1.setBackground(new java.awt.Color(33, 150, 243));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Agregar");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);

        txtContact.setAutoscrolls(false);
        txtContact.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtContact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContactFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContactFocusLost(evt);
            }
        });
        txtContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContactKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactKeyTyped(evt);
            }
        });

        spMail.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblContact, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spMail)
                    .addComponent(txtContact, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtContact, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addComponent(spMail, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblContact, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtContactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContactFocusGained
        spMail.setBackground(Color.red);
    }//GEN-LAST:event_txtContactFocusGained

    private void txtContactFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContactFocusLost
        spMail.setBackground(Color.white);
    }//GEN-LAST:event_txtContactFocusLost

    private void txtContactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyPressed
//        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
//        btnNextActionPerformed(null);
    }//GEN-LAST:event_txtContactKeyPressed

    private void txtContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyTyped
        char c = evt.getKeyChar();
        if(c == ' '){
            lblContact.setText("Contacto");
            evt.consume();
            contactType = 0;
        }
        if(standardization.validateEmail(txtContact.getText())){
            lblContact.setText("Email");
            contactType = 2;
        }
        else if(standardization.validateNumber(txtContact.getText()) && txtContact.getText().length()>6){
            lblContact.setText("Teléfono");
            contactType = 1;
        }
        else{
            lblContact.setText("Contacto");
            contactType = 0;
        }
    }//GEN-LAST:event_txtContactKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblContact;
    private javax.swing.JSeparator spMail;
    private javax.swing.JTextField txtContact;
    // End of variables declaration//GEN-END:variables
}
