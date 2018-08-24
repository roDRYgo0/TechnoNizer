package admin;

import java.awt.Color;
import javaClass.classAdmin;
import javaClass.classContact;
import javaClass.controller;
import javaClass.standardization;

public class itemGender extends javax.swing.JPanel {
    
    int id;
    
    public itemGender(int id) {
        initComponents();
        this.id = id;
        load();
    }
    
    public void load(){
        try{
            txtGender.setText(controller.genders.get(id).getGender());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblContact = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        spMail = new javax.swing.JSeparator();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(254, 254, 254));
        setMaximumSize(new java.awt.Dimension(321, 55));
        setMinimumSize(new java.awt.Dimension(321, 55));
        setPreferredSize(new java.awt.Dimension(321, 55));

        lblContact.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblContact.setText("Género");

        txtGender.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGender.setAutoscrolls(false);
        txtGender.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtGender.setFocusable(false);
        txtGender.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtGenderFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtGenderFocusLost(evt);
            }
        });
        txtGender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtGenderKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGenderKeyTyped(evt);
            }
        });

        spMail.setForeground(new java.awt.Color(204, 204, 204));

        btnDelete.setBackground(java.awt.Color.red);
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Eliminar");
        btnDelete.setBorder(null);
        btnDelete.setBorderPainted(false);
        btnDelete.setFocusPainted(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblContact, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(spMail))
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(spMail, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblContact, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtGenderFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGenderFocusGained
        spMail.setBackground(Color.red);
    }//GEN-LAST:event_txtGenderFocusGained

    private void txtGenderFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGenderFocusLost
        spMail.setBackground(Color.white);
    }//GEN-LAST:event_txtGenderFocusLost

    private void txtGenderKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGenderKeyTyped
        evt.consume();
    }//GEN-LAST:event_txtGenderKeyTyped

    private void txtGenderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGenderKeyPressed

    }//GEN-LAST:event_txtGenderKeyPressed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        new Thread(()->{
           if(classAdmin.deleteGender(controller.genders.get(id).getId())){
                standardization.showMessage("ok", "Se elimino correctamente");
                technonizer.TechnoNizer.admin.settings();
            }
            else
                standardization.showMessage("cancel", "No se puede eliminar"); 
        }).start();
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel lblContact;
    private javax.swing.JSeparator spMail;
    private javax.swing.JTextField txtGender;
    // End of variables declaration//GEN-END:variables
}
