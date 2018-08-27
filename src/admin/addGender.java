package admin;

import java.awt.Color;
import javaClass.classAdmin;
import javaClass.classContact;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.gender;
import javaClass.standardization;

public class addGender extends javax.swing.JPanel {

    boolean action;
    int contactType = 0;
    String [] contacts;
    int numContact;
    
    public addGender() {
        initComponents();
        this.action = false;
    }
    
    public addGender(boolean action){
        initComponents();
        this.action = action;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd = new javax.swing.JButton();
        txtGender = new javax.swing.JTextField();
        spMail = new javax.swing.JSeparator();
        lblContact = new javax.swing.JLabel();

        setBackground(new java.awt.Color(200, 255, 105));
        setMaximumSize(new java.awt.Dimension(321, 55));
        setMinimumSize(new java.awt.Dimension(321, 55));
        setPreferredSize(new java.awt.Dimension(321, 55));

        btnAdd.setBackground(new java.awt.Color(33, 150, 243));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Agregar");
        btnAdd.setBorder(null);
        btnAdd.setBorderPainted(false);
        btnAdd.setFocusPainted(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtGender.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGender.setAutoscrolls(false);
        txtGender.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
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

        lblContact.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblContact.setText("Género");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblContact, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spMail)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(spMail, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblContact, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
            new Thread(()->{
                if(standardization.campoVacio(txtGender.getText())){
                    standardization.showMessage("warning", "Campos vacios");
                }else if(validate(txtGender.getText())){
                    standardization.showMessage("cancel", "Este género ya existe");
                }else{
                    new Thread(()->{
                        if(classAdmin.insertGender(txtGender.getText())){
                            standardization.showMessage("ok", "Se ingreso correctamente");
                            technonizer.TechnoNizer.admin.settings();
                        }else{
                            standardization.showMessage("cancel", "No se pudo ingresar");
                            technonizer.TechnoNizer.admin.settings();
                        }
                    }).start();
                }
            }).start();
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtGenderFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGenderFocusGained
        spMail.setBackground(Color.red);
    }//GEN-LAST:event_txtGenderFocusGained

    private void txtGenderFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGenderFocusLost
        spMail.setBackground(Color.white);
    }//GEN-LAST:event_txtGenderFocusLost

    private void txtGenderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGenderKeyPressed

    }//GEN-LAST:event_txtGenderKeyPressed

    private void txtGenderKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGenderKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){}
        else
            evt.consume();
    }//GEN-LAST:event_txtGenderKeyTyped
    
    public boolean validate(String campo){
        boolean status = false;
        for(gender g : controller.genders){
            if(g.getGender().equals(campo)){
                status = true;
                break;
            }
        }
        return status;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel lblContact;
    private javax.swing.JSeparator spMail;
    private javax.swing.JTextField txtGender;
    // End of variables declaration//GEN-END:variables
}
