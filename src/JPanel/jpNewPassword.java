package JPanel;

import jFrame.logIn;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Arrays;
import java.util.Properties;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.standardization;
import properties.propiedades;

public class jpNewPassword extends javax.swing.JPanel {

    boolean sw, continueP;
    char echoChar;
    
    void verificaridioma()
    {
    Properties pr= new propiedades(controller.idioma);
    lblNewPass.setText(pr.getProperty("lblNewPass"));
    lbl2NewPass.setText(pr.getProperty("lbl2NewPass"));
    lbl3NewPass.setText(pr.getProperty("lbl3NewPass"));
    btnBack.setText(pr.getProperty("btnBackNePass"));
    btnNext.setText(pr.getProperty("btnNextNePass"));
    
    }
    
    public jpNewPassword() {
        initComponents();
        verificaridioma();
        loadIcon();
    }

    //<editor-fold defaultstate="collapsed" desc="compilde code">
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTN = new javax.swing.JLabel();
        spTop = new javax.swing.JSeparator();
        lblNewPass = new javax.swing.JLabel();
        lbl2NewPass = new javax.swing.JLabel();
        spPasswordConfirm = new javax.swing.JSeparator();
        txtPasswordConfirm = new javax.swing.JPasswordField();
        lblEyeConfirm = new javax.swing.JLabel();
        lbl3NewPass = new javax.swing.JLabel();
        iconPass = new javax.swing.JLabel();
        iconPass2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        spPassword = new javax.swing.JSeparator();
        lblEye = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        checkPass = new javax.swing.JLabel();
        progress = new rojerusan.componentes.RSProgressMaterial();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(420, 603));
        setMinimumSize(new java.awt.Dimension(420, 603));

        lblTN.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTN.setText("TechnoNizer");
        lblTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTNMouseClicked(evt);
            }
        });

        spTop.setForeground(new java.awt.Color(153, 153, 153));

        lblNewPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNewPass.setText("Ingresa tu nueva contraseña");

        lbl2NewPass.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lbl2NewPass.setForeground(new java.awt.Color(102, 102, 102));
        lbl2NewPass.setText("Ingrese la contraseña");

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

        lblEyeConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eye.png"))); // NOI18N
        lblEyeConfirm.setMaximumSize(new java.awt.Dimension(20, 20));
        lblEyeConfirm.setMinimumSize(new java.awt.Dimension(20, 20));
        lblEyeConfirm.setPreferredSize(new java.awt.Dimension(20, 20));
        lblEyeConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEyeConfirmMouseClicked(evt);
            }
        });

        lbl3NewPass.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lbl3NewPass.setForeground(new java.awt.Color(102, 102, 102));
        lbl3NewPass.setText("Confirme la contraseña");

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

        spPassword.setForeground(new java.awt.Color(204, 204, 204));

        lblEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eye.png"))); // NOI18N
        lblEye.setMaximumSize(new java.awt.Dimension(20, 20));
        lblEye.setMinimumSize(new java.awt.Dimension(20, 20));
        lblEye.setPreferredSize(new java.awt.Dimension(20, 20));
        lblEye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEyeMouseClicked(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(0, 153, 255));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Continuar");
        btnNext.setBorderPainted(false);
        btnNext.setFocusable(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnBack.setText("Atras");
        btnBack.setBorderPainted(false);
        btnBack.setFocusable(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        checkPass.setMaximumSize(new java.awt.Dimension(25, 25));
        checkPass.setMinimumSize(new java.awt.Dimension(25, 25));
        checkPass.setPreferredSize(new java.awt.Dimension(25, 25));

        progress.setForeground(new java.awt.Color(255, 255, 255));
        progress.setAnchoProgress(6);
        progress.setPreferredSize(new java.awt.Dimension(34, 34));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spTop)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(iconPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl3NewPass)
                                    .addComponent(spPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(lblEyeConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(iconPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl2NewPass)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(spPassword)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(lblEye, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lblNewPass)
                            .addComponent(lblTN))
                        .addGap(0, 42, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(spTop, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblTN)
                        .addGap(51, 51, 51)
                        .addComponent(lblNewPass)
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl2NewPass)
                                        .addGap(0, 0, 0)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblEye, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(iconPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addComponent(spPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(checkPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl3NewPass)
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEyeConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(iconPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(spPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents
        //</editor-fold>    

    private void lblTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTNMouseClicked
        controller.jpA = new jpAccess();

        controller.jpA.setSize(420,603);
        controller.jpA.setLocation(0,0);

        controller.rootPane.removeAll();
        controller.rootPane.add(controller.jpA,BorderLayout.CENTER);
        controller.rootPane.revalidate();
        controller.rootPane.repaint();
    }//GEN-LAST:event_lblTNMouseClicked

    private void txtPasswordConfirmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordConfirmFocusGained
        spPasswordConfirm.setBackground(Color.red);
    }//GEN-LAST:event_txtPasswordConfirmFocusGained

    private void txtPasswordConfirmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordConfirmFocusLost
        spPasswordConfirm.setBackground(Color.white);
    }//GEN-LAST:event_txtPasswordConfirmFocusLost

    private void lblEyeConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEyeConfirmMouseClicked
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
    }//GEN-LAST:event_lblEyeConfirmMouseClicked

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        spPassword.setBackground(Color.red);
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        spPassword.setBackground(Color.white);
        if(!standardization.validatePassword(standardization.convertPassword(txtPassword.getPassword()))){
            standardization.showMessage("warning", "La contraseña no cumple las espectativas");
            checkPass.setIcon(new controller().changeImage("/imagenes/cancel.png", 20, 20));
            continueP = false;
        }
        else{
            checkPass.setIcon(new controller().changeImage("/imagenes/ok.png", 20, 20));
            continueP = true;
        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void lblEyeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEyeMouseClicked
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
    }//GEN-LAST:event_lblEyeMouseClicked

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if( logIn.internet)
        {
            if(Arrays.equals(txtPasswordConfirm.getPassword(), txtPassword.getPassword())){
                classUsuario.setPassword(standardization.sha1(standardization.md5(standardization.convertPassword(txtPassword.getPassword()))));
                disable();
                new Thread(()->{
                    if(classUsuario.changePassword(false) && continueP){
                    standardization.showMessage("ok", "Contraseña actualizada.");
                    
                    controller.jpA = new jpAccess();
                    controller.jpA.setSize(420,603);
                    controller.jpA.setLocation(0,0);

                    controller.rootPane.removeAll();
                    controller.rootPane.add(controller.jpA,BorderLayout.CENTER);
                    controller.rootPane.revalidate();
                    controller.rootPane.repaint();
                }
                else
                    standardization.showMessage("error", "No se pudo cambiar la contraseña.");
                enable();
                }).start();
                
            } else
                standardization.showMessage("warning", "Las contraseñas no coinciden.");
        }
        else
            standardization.showMessage("error", "Error al establecer una conexion de red.");
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        controller.rootPane.removeAll();
        controller.rootPane.add(controller.jpP,BorderLayout.CENTER);
        controller.rootPane.revalidate();
        controller.rootPane.repaint();
    }//GEN-LAST:event_btnBackActionPerformed

    public void disable(){
        progress.setForeground(new Color(33, 150, 243));
        txtPassword.setEnabled(false);
        txtPasswordConfirm.setEnabled(false);
        btnNext.setEnabled(false);
    }
    
    public void enable(){
        progress.setForeground(new Color(255, 255, 255));
        txtPassword.setEnabled(true);
        txtPasswordConfirm.setEnabled(true);
        btnNext.setEnabled(true);
    }
    
    public void loadIcon()
    {
        echoChar = txtPassword.getEchoChar();
        lblEye.setIcon(new controller().changeImage("/imagenes/eye.png", 20, 20));
        lblEyeConfirm.setIcon(new controller().changeImage("/imagenes/eye.png", 20, 20));
        iconPass.setIcon(new controller().changeImage("/imagenes/password.png", 35, 35));
        iconPass2.setIcon(new controller().changeImage("/imagenes/password.png", 35, 35));
    }
    
    public void changeEye(boolean e){
        if(e)
        {
            lblEye.setIcon(new controller().changeImage("/imagenes/eye_.png", 20, 20));
            lblEyeConfirm.setIcon(new controller().changeImage("/imagenes/eye_.png", 20, 20));
        }
        else
        {
            lblEye.setIcon(new controller().changeImage("/imagenes/eye.png", 20, 20));
            lblEyeConfirm.setIcon(new controller().changeImage("/imagenes/eye.png", 20, 20));
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel checkPass;
    private javax.swing.JLabel iconPass;
    private javax.swing.JLabel iconPass2;
    private javax.swing.JLabel lbl2NewPass;
    private javax.swing.JLabel lbl3NewPass;
    private javax.swing.JLabel lblEye;
    private javax.swing.JLabel lblEyeConfirm;
    private javax.swing.JLabel lblNewPass;
    private javax.swing.JLabel lblTN;
    private rojerusan.componentes.RSProgressMaterial progress;
    private javax.swing.JSeparator spPassword;
    private javax.swing.JSeparator spPasswordConfirm;
    private javax.swing.JSeparator spTop;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPasswordConfirm;
    // End of variables declaration//GEN-END:variables
}
