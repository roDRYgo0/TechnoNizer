package admin;

import java.awt.Color;
import java.util.Arrays;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.standardization;

public class jpChangePasswordAdmin extends javax.swing.JPanel {

    boolean sw, continueA, continueP;
    char echoChar;
    
    boolean sww;
    char echoCharOld;
    
    public jpChangePasswordAdmin() {
        initComponents();
        continueA =false;
        continueP =false;
        loadImagenes();
    }

    void loadImagenes(){
        echoChar = txtPassword.getEchoChar();
        iconPass.setIcon(new controller().changeImage("/imagenes/password.png", 35, 35));
        iconPass2.setIcon(new controller().changeImage("/imagenes/password.png", 35, 35));
        loadEye();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        iconPass = new javax.swing.JLabel();
        iconPass2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        checkPass = new javax.swing.JLabel();
        spPassword = new javax.swing.JSeparator();
        iconEye = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        spPasswordConfirm = new javax.swing.JSeparator();
        txtPasswordConfirm = new javax.swing.JPasswordField();
        iconEyeConfirm = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(445, 465));
        setMinimumSize(new java.awt.Dimension(445, 465));
        setPreferredSize(new java.awt.Dimension(445, 465));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Nueva contraseña");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Confirme la contraseña");

        iconPass.setMaximumSize(new java.awt.Dimension(35, 35));
        iconPass.setMinimumSize(new java.awt.Dimension(35, 35));
        iconPass.setPreferredSize(new java.awt.Dimension(35, 35));

        iconPass2.setMaximumSize(new java.awt.Dimension(35, 35));
        iconPass2.setMinimumSize(new java.awt.Dimension(35, 35));
        iconPass2.setPreferredSize(new java.awt.Dimension(35, 35));

        txtPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });

        checkPass.setMaximumSize(new java.awt.Dimension(25, 25));
        checkPass.setMinimumSize(new java.awt.Dimension(25, 25));
        checkPass.setPreferredSize(new java.awt.Dimension(25, 25));

        spPassword.setForeground(new java.awt.Color(204, 204, 204));

        iconEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eye.png"))); // NOI18N
        iconEye.setMaximumSize(new java.awt.Dimension(20, 20));
        iconEye.setMinimumSize(new java.awt.Dimension(20, 20));
        iconEye.setPreferredSize(new java.awt.Dimension(20, 20));
        iconEye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconEyeMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Ingrese la contraseña");

        spPasswordConfirm.setForeground(new java.awt.Color(204, 204, 204));

        txtPasswordConfirm.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtPasswordConfirm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordConfirmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordConfirmFocusLost(evt);
            }
        });

        iconEyeConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eye.png"))); // NOI18N
        iconEyeConfirm.setMaximumSize(new java.awt.Dimension(20, 20));
        iconEyeConfirm.setMinimumSize(new java.awt.Dimension(20, 20));
        iconEyeConfirm.setPreferredSize(new java.awt.Dimension(20, 20));
        iconEyeConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconEyeConfirmMouseClicked(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(0, 153, 255));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Siguiente");
        btnNext.setBorderPainted(false);
        btnNext.setFocusable(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(313, Short.MAX_VALUE)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iconPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(spPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(iconEyeConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iconPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(spPassword)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(iconEye, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(iconPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(94, 94, 94))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(checkPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconEye, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(spPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconEyeConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(iconPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(spPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        spPassword.setBackground(Color.red);
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        spPassword.setBackground(Color.white);
        if(!standardization.validatePassword(standardization.convertPassword(txtPassword.getPassword())) && standardization.convertPassword(txtPassword.getPassword()).length()!=0){
            standardization.showMessage("warning", "La contraseña no cumple las espectativas");
            checkPass.setIcon(new controller().changeImage("/imagenes/cancel.png", 20, 20));
            continueP = false;
        }
        else if(txtPassword.getPassword().length>0){
            checkPass.setIcon(new controller().changeImage("/imagenes/ok.png", 20, 20));
            continueP = true;
        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void iconEyeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconEyeMouseClicked
        if (!sw) {
            txtPassword.setEchoChar((char)0);
            txtPasswordConfirm.setEchoChar((char)0);
            sw = !sw;
            changeEye(sw);
        } else {
            txtPassword.setEchoChar(echoChar);
            txtPasswordConfirm.setEchoChar(echoChar);
            sw = !sw;
            changeEye(sw);
        }
    }//GEN-LAST:event_iconEyeMouseClicked

    private void txtPasswordConfirmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordConfirmFocusGained
        spPasswordConfirm.setBackground(Color.red);
    }//GEN-LAST:event_txtPasswordConfirmFocusGained

    private void txtPasswordConfirmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordConfirmFocusLost
        spPasswordConfirm.setBackground(Color.white);
    }//GEN-LAST:event_txtPasswordConfirmFocusLost

    private void iconEyeConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconEyeConfirmMouseClicked
        if (!sw) {
            txtPassword.setEchoChar((char)0);
            txtPasswordConfirm.setEchoChar((char)0);
            sw = !sw;
            changeEye(sw);
        } else {
            txtPassword.setEchoChar(echoChar);
            txtPasswordConfirm.setEchoChar(echoChar);
            sw = !sw;
            changeEye(sw);
        }
    }//GEN-LAST:event_iconEyeConfirmMouseClicked

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if(continueP){      
            disable();
            new Thread(()->{
            if(Arrays.equals(txtPasswordConfirm.getPassword(), txtPassword.getPassword())){
                classUsuario.setPassword(standardization.sha1(standardization.md5(standardization.convertPassword(txtPassword.getPassword()))));
                if(classUsuario.changePassword(true) && continueP){
                    standardization.showMessage("ok", "Contraseña actualizada.");
                }
                else
                    standardization.showMessage("error", "No se pudo cambiar la contraseña.");
            }else
                standardization.showMessage("warning", "Las contraseñas no coinciden.");
            enable();
            }).start();
        }else
            standardization.showMessage("warning", "Ingrese una contraseña valida por favor");
    }//GEN-LAST:event_btnNextActionPerformed

    public void loadEye()
    {
        iconEye.setIcon(new controller().changeImage("/imagenes/eye.png", 20, 20));
        iconEyeConfirm.setIcon(new controller().changeImage("/imagenes/eye.png", 20, 20));
    }
    
    public void changeEye(boolean e){
        if(e)
        {
            iconEye.setIcon(new controller().changeImage("/imagenes/eye_.png", 20, 20));
            iconEyeConfirm.setIcon(new controller().changeImage("/imagenes/eye_.png", 20, 20));
        }
        else
        {
            iconEye.setIcon(new controller().changeImage("/imagenes/eye.png", 20, 20));
            iconEyeConfirm.setIcon(new controller().changeImage("/imagenes/eye.png", 20, 20));
        }
    }

    public void disable(){
        txtPassword.setEnabled(false);
        txtPasswordConfirm.setEnabled(false);
    }
    
    public void enable(){
        txtPassword.setEnabled(true);
        txtPasswordConfirm.setEnabled(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel checkPass;
    private javax.swing.JLabel iconEye;
    private javax.swing.JLabel iconEyeConfirm;
    private javax.swing.JLabel iconPass;
    private javax.swing.JLabel iconPass2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator spPassword;
    private javax.swing.JSeparator spPasswordConfirm;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPasswordConfirm;
    // End of variables declaration//GEN-END:variables
}
