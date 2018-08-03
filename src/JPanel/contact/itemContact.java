package JPanel.contact;

import java.awt.Color;
import javaClass.classContact;
import javaClass.controller;
import javaClass.standardization;

public class itemContact extends javax.swing.JPanel {
    
    int id;
    
    public itemContact(int id) {
        initComponents();
        this.id = id;
        load();
    }
    
    public void load(){
        try{
            txtContact.setText(controller.contac[id].getContact());
            if(controller.contac[id].getIdContactType() == 1)
                lblContact.setText("Telefono");
            else
                lblContact.setText("Email");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblContact = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        spMail = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(254, 254, 254));
        setMaximumSize(new java.awt.Dimension(450, 55));
        setMinimumSize(new java.awt.Dimension(450, 55));
        setPreferredSize(new java.awt.Dimension(450, 55));

        lblContact.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblContact.setText("Contacto");

        txtContact.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtContact.setAutoscrolls(false);
        txtContact.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtContact.setFocusable(false);
        txtContact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContactFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContactFocusLost(evt);
            }
        });
        txtContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContactKeyPressed(evt);
            }
        });

        spMail.setForeground(new java.awt.Color(204, 204, 204));

        jButton2.setBackground(java.awt.Color.red);
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Eliminar");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblContact, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spMail, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(txtContact))
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContact, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(spMail, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblContact, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtContactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContactFocusGained
        spMail.setBackground(Color.red);
    }//GEN-LAST:event_txtContactFocusGained

    private void txtContactFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContactFocusLost
        spMail.setBackground(Color.white);
    }//GEN-LAST:event_txtContactFocusLost

    private void txtContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyTyped
        evt.consume();
    }//GEN-LAST:event_txtContactKeyTyped

    private void txtContactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyPressed

    }//GEN-LAST:event_txtContactKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(controller.jpU.changeAction){
            classContact.setId(controller.contac[id].getId());
            controller.jpU.changeAction = false;
            controller.jpU.checkContact(2);
            new Thread(()->{
               if(classContact.delete()){
                    standardization.showMessage("ok", "Se elimino correctamente");
                    controller.jpU.loadPanel(true);
                }
                else
                    standardization.showMessage("cancel", "No se logro eliminar"); 
            }).start();
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lblContact;
    private javax.swing.JSeparator spMail;
    private javax.swing.JTextField txtContact;
    // End of variables declaration//GEN-END:variables
}
