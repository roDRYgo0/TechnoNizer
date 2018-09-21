package sucurity;

import java.awt.Color;
import java.awt.Image;
import java.util.Properties;
import javaClass.classSecurityQuestions;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.standardization;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import properties.propiedades;

public class jpQuestions extends javax.swing.JPanel {

    boolean sw;
    char echoChar;
    
    void verificaridioma()
    {
        Properties pr=new propiedades(controller.idioma);
        lbl1jpQuestions.setText(pr.getProperty("lbl1jpQuestions"));
        Q1.setText(pr.getProperty("Q1"));
        Q2.setText(pr.getProperty("Q2"));
        Q3.setText(pr.getProperty("Q3"));
        lblPasswordQuestions.setText(pr.getProperty("lblPasswordQuestions"));
        btnDelete.setText(pr.getProperty("btnDeleteConfirmQuestion"));
        btnChange.setText(pr.getProperty("btnChangeConfirmQuestion"));
    }
    
    public jpQuestions() {
        initComponents();
        verificaridioma();
        load();
    }
    void load(){
        txtQuestion1.setText(classSecurityQuestions.getQuestions()[0]);
        txtQuestion2.setText(classSecurityQuestions.getQuestions()[1]);
        txtQuestion3.setText(classSecurityQuestions.getQuestions()[2]);
        loadImagenes();
    }
    
    void loadImagenes(){
        lblPassword.setIcon(new controller().changeImage("/imagenes/password.png", 35, 35));
        loadEye();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl1jpQuestions = new javax.swing.JLabel();
        Q1 = new javax.swing.JLabel();
        txtQuestion1 = new javax.swing.JTextField();
        spQuestion1 = new javax.swing.JSeparator();
        Q2 = new javax.swing.JLabel();
        txtQuestion2 = new javax.swing.JTextField();
        spQuestion2 = new javax.swing.JSeparator();
        Q3 = new javax.swing.JLabel();
        txtQuestion3 = new javax.swing.JTextField();
        spQuestion3 = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();
        lblPasswordQuestions = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblEye = new javax.swing.JLabel();
        spPassword = new javax.swing.JSeparator();
        btnDelete = new javax.swing.JButton();
        btnChange = new javax.swing.JButton();
        progress = new rojerusan.componentes.RSProgressMaterial();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(425, 379));
        setMinimumSize(new java.awt.Dimension(425, 379));

        lbl1jpQuestions.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl1jpQuestions.setText("Tus preguntas de seguridad son las siguientes");

        Q1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Q1.setForeground(new java.awt.Color(33, 150, 243));
        Q1.setText("Pregunta 1");

        txtQuestion1.setAutoscrolls(false);
        txtQuestion1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtQuestion1.setFocusable(false);

        spQuestion1.setForeground(new java.awt.Color(204, 204, 204));

        Q2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Q2.setForeground(new java.awt.Color(33, 150, 243));
        Q2.setText("Pregunta 2");

        txtQuestion2.setAutoscrolls(false);
        txtQuestion2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtQuestion2.setFocusable(false);

        spQuestion2.setForeground(new java.awt.Color(204, 204, 204));

        Q3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Q3.setForeground(new java.awt.Color(33, 150, 243));
        Q3.setText("Pregunta 3");

        txtQuestion3.setAutoscrolls(false);
        txtQuestion3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtQuestion3.setFocusable(false);

        spQuestion3.setForeground(new java.awt.Color(204, 204, 204));

        txtPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        lblPasswordQuestions.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblPasswordQuestions.setForeground(new java.awt.Color(102, 102, 102));
        lblPasswordQuestions.setText("Ingrese la contraseña para continuar");

        lblPassword.setMaximumSize(new java.awt.Dimension(35, 35));
        lblPassword.setMinimumSize(new java.awt.Dimension(35, 35));
        lblPassword.setPreferredSize(new java.awt.Dimension(35, 35));

        lblEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eye.png"))); // NOI18N
        lblEye.setMaximumSize(new java.awt.Dimension(20, 20));
        lblEye.setMinimumSize(new java.awt.Dimension(20, 20));
        lblEye.setPreferredSize(new java.awt.Dimension(20, 20));
        lblEye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEyeMouseClicked(evt);
            }
        });

        spPassword.setForeground(new java.awt.Color(204, 204, 204));

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Eliminar");
        btnDelete.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDelete.setBorderPainted(false);
        btnDelete.setFocusPainted(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnChange.setBackground(new java.awt.Color(33, 150, 243));
        btnChange.setForeground(new java.awt.Color(255, 255, 255));
        btnChange.setText("Cambiar");
        btnChange.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnChange.setBorderPainted(false);
        btnChange.setFocusPainted(false);
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        progress.setForeground(new java.awt.Color(255, 255, 255));
        progress.setAnchoProgress(6);
        progress.setPreferredSize(new java.awt.Dimension(34, 34));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPasswordQuestions)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Q1)
                                .addComponent(txtQuestion1)
                                .addComponent(spQuestion1)
                                .addComponent(Q2)
                                .addComponent(txtQuestion2)
                                .addComponent(spQuestion2)
                                .addComponent(Q3)
                                .addComponent(txtQuestion3)
                                .addComponent(spQuestion3, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(spPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(lblEye, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl1jpQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl1jpQuestions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Q1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(spQuestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Q2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuestion2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(spQuestion2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Q3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuestion3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(spQuestion3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPasswordQuestions)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEye, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addComponent(spPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        spPassword.setBackground(Color.red);
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        spPassword.setBackground(Color.gray);
    }//GEN-LAST:event_txtPasswordFocusLost

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed

    }//GEN-LAST:event_txtPasswordKeyPressed

    private void lblEyeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEyeMouseClicked
        if (!sw) {
            txtPassword.setEchoChar((char)0);
            sw = !sw;
            changeEye(sw);
        } else {
            txtPassword.setEchoChar(echoChar);
            sw = !sw;
            changeEye(sw);
        }
    }//GEN-LAST:event_lblEyeMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String pass = standardization.sha1(standardization.md5(standardization.convertPassword(txtPassword.getPassword())));
        if(pass.equals(classUsuario.getPassword())){
            progress.setForeground(new Color(33, 150, 243));
            disable();
            new Thread(()->{
                if(classSecurityQuestions.delete()){
                    technonizer.TechnoNizer.home.pnSecurity();
                    controller.jpSe.questions();
                    controller.jpSeQue.loadConfQuestion(1);
                    standardization.showMessage("ok", "Exito al eliminar");
                }
                else
                    standardization.showMessage("cancel", "No se logro eliminar");
                progress.setForeground(new Color(33, 150, 243));
                enable();
            }).start();
        }else
            standardization.showMessage("error", "La contraseña no coinsiden.");

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        String pass = standardization.sha1(standardization.md5(standardization.convertPassword(txtPassword.getPassword())));
        disable();
        if(pass.equals(classUsuario.getPassword())){
            controller.jpSeQue.loadConfQuestion(1);
            classSecurityQuestions.change = true;
        }else{
            standardization.showMessage("error", "La contraseña no coinsiden.");
        }
        enable();
    }//GEN-LAST:event_btnChangeActionPerformed

    public void disable(){
        btnDelete.setEnabled(false);
        btnChange.setEnabled(false);
        txtPassword.setEnabled(false);
    }
    
    public void enable(){
        btnDelete.setEnabled(true);
        btnChange.setEnabled(true);
        txtPassword.setEnabled(true);

    }
    
    //<editor-fold defaultstate="collapsed" desc="compiled code eye">
        
    void loadEye()
    {
        echoChar = txtPassword.getEchoChar();
        ImageIcon original = new ImageIcon(getClass().getResource("/imagenes/eye.png"));
        Icon icono = new ImageIcon(original.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
        lblEye.setIcon(icono);
    }
    
    void changeEye(boolean e){
        if(e)
        {
            ImageIcon original = new ImageIcon(getClass().getResource("/imagenes/eye_.png"));
            Icon icono = new ImageIcon(original.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
            lblEye.setIcon(icono);
        }
        else
        {
            ImageIcon original = new ImageIcon(getClass().getResource("/imagenes/eye.png"));
            Icon icono = new ImageIcon(original.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
            lblEye.setIcon(icono);
        }
    }
    //</editor-fold>
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Q1;
    private javax.swing.JLabel Q2;
    private javax.swing.JLabel Q3;
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel lbl1jpQuestions;
    private javax.swing.JLabel lblEye;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPasswordQuestions;
    private rojerusan.componentes.RSProgressMaterial progress;
    private javax.swing.JSeparator spPassword;
    private javax.swing.JSeparator spQuestion1;
    private javax.swing.JSeparator spQuestion2;
    private javax.swing.JSeparator spQuestion3;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtQuestion1;
    private javax.swing.JTextField txtQuestion2;
    private javax.swing.JTextField txtQuestion3;
    // End of variables declaration//GEN-END:variables
}
