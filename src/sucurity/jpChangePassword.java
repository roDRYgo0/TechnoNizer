package sucurity;

import java.awt.Color;
import java.awt.Image;
import java.util.Arrays;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.standardization;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class jpChangePassword extends javax.swing.JPanel {

    boolean sw, continueM, continueN, continueP;
    char echoChar;
    
    boolean sww;
    char echoCharOld;
    
    public jpChangePassword() {
        initComponents();
        loadImagenes();
    }

    void loadImagenes(){
        lblPasswordOld.setIcon(new controller().changeImage("/imagenes/password.png", 35, 35));
        iconPass.setIcon(new controller().changeImage("/imagenes/password.png", 35, 35));
        iconPass2.setIcon(new controller().changeImage("/imagenes/password.png", 35, 35));
        loadEyeOld();
        loadEye();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPasswordOld = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        lblPasswordOld = new javax.swing.JLabel();
        lblEyeOld = new javax.swing.JLabel();
        spPasswordOld = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        checkPassOld = new javax.swing.JLabel();
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

        setBackground(new java.awt.Color(245, 245, 245));
        setMaximumSize(new java.awt.Dimension(445, 465));
        setMinimumSize(new java.awt.Dimension(445, 465));
        setPreferredSize(new java.awt.Dimension(445, 465));

        txtPasswordOld.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtPasswordOld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordOldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordOldFocusLost(evt);
            }
        });
        txtPasswordOld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordOldKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Ingrese la contraseña para continuar");

        lblPasswordOld.setMaximumSize(new java.awt.Dimension(35, 35));
        lblPasswordOld.setMinimumSize(new java.awt.Dimension(35, 35));
        lblPasswordOld.setPreferredSize(new java.awt.Dimension(35, 35));

        lblEyeOld.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eye.png"))); // NOI18N
        lblEyeOld.setMaximumSize(new java.awt.Dimension(20, 20));
        lblEyeOld.setMinimumSize(new java.awt.Dimension(20, 20));
        lblEyeOld.setPreferredSize(new java.awt.Dimension(20, 20));
        lblEyeOld.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEyeOldMouseClicked(evt);
            }
        });

        spPasswordOld.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Antigua contraseña");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Nueva contraseña");

        checkPassOld.setMaximumSize(new java.awt.Dimension(25, 25));
        checkPassOld.setMinimumSize(new java.awt.Dimension(25, 25));
        checkPassOld.setPreferredSize(new java.awt.Dimension(25, 25));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
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
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPasswordOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(spPasswordOld, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtPasswordOld, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(lblEyeOld, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkPassOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPasswordOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(checkPassOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPasswordOld, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblEyeOld, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, 0)
                            .addComponent(spPasswordOld, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(iconPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(spPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(0, 0, 0)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(iconEyeConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(iconPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(checkPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(spPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconEye, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordOldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordOldFocusGained
        spPasswordOld.setBackground(Color.red);
    }//GEN-LAST:event_txtPasswordOldFocusGained

    private void txtPasswordOldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordOldFocusLost
        spPasswordOld.setBackground(Color.gray);
        String pass = standardization.sha1(standardization.md5(Arrays.toString(txtPasswordOld.getPassword())));
        if(pass.equals(classUsuario.getPassword()))
            checkPassOld.setIcon(standardization.checkImage(1));
        else
            checkPassOld.setIcon(standardization.checkImage(0));
    }//GEN-LAST:event_txtPasswordOldFocusLost

    private void txtPasswordOldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordOldKeyPressed

    }//GEN-LAST:event_txtPasswordOldKeyPressed

    private void lblEyeOldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEyeOldMouseClicked
        if (!sww) {
            txtPasswordOld.setEchoChar((char)0);
            sww = !sww;
            changeEyeOld(sww);
        } else {
            txtPasswordOld.setEchoChar(echoCharOld);
            sww = !sww;
            changeEyeOld(sww);
        }
    }//GEN-LAST:event_lblEyeOldMouseClicked

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        spPasswordOld.setBackground(Color.red);
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        spPasswordOld.setBackground(Color.white);
        if(!standardization.validatePassword(standardization.convertPassword(txtPassword.getPassword())) && txtPassword.getPassword().length!=0){
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

    
    public void loadEyeOld()
    {
        echoCharOld = txtPasswordOld.getEchoChar();
        ImageIcon original = new ImageIcon(getClass().getResource("/imagenes/eye.png"));
        Icon icono = new ImageIcon(original.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
        lblEyeOld.setIcon(icono);
    }
    
    public void changeEyeOld(boolean e){
        if(e)
        {
            ImageIcon original = new ImageIcon(getClass().getResource("/imagenes/eye_.png"));
            Icon icono = new ImageIcon(original.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
            lblEyeOld.setIcon(icono);
        }
        else
        {
            ImageIcon original = new ImageIcon(getClass().getResource("/imagenes/eye.png"));
            Icon icono = new ImageIcon(original.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
            lblEyeOld.setIcon(icono);
        }
    }

    public void loadEye()
    {
        echoChar = txtPasswordOld.getEchoChar();
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel checkPass;
    private javax.swing.JLabel checkPassOld;
    private javax.swing.JLabel iconEye;
    private javax.swing.JLabel iconEyeConfirm;
    private javax.swing.JLabel iconPass;
    private javax.swing.JLabel iconPass2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblEyeOld;
    private javax.swing.JLabel lblPasswordOld;
    private javax.swing.JSeparator spPassword;
    private javax.swing.JSeparator spPasswordConfirm;
    private javax.swing.JSeparator spPasswordOld;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPasswordConfirm;
    private javax.swing.JPasswordField txtPasswordOld;
    // End of variables declaration//GEN-END:variables
}
