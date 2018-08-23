package admin;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javaClass.authenticator;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.standardization;

public class jpCheckAuthenticatorAdmin extends javax.swing.JPanel {

    String keygen;
    
    public jpCheckAuthenticatorAdmin(String keygen) {
        initComponents();
        this.keygen = keygen;
        loadImage();
        enable();
        txtCode.requestFocus();
    }

    void loadImage(){
        lblAuthenticator.setIcon(new controller().changeImage("/imagenes/authenticator.png", 80, 80));
    }
    
    //<editor-fold defaultstate="collapsed" desc="compiled code">
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAuthenticator = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        spCode = new javax.swing.JSeparator();
        btnNext = new javax.swing.JButton();
        checkMail = new javax.swing.JLabel();
        checkCode = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));
        setPreferredSize(new java.awt.Dimension(445, 465));

        jPanel1.setBackground(new java.awt.Color(33, 150, 243));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(lblAuthenticator, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAuthenticator, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/confAuthenticaor.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Verificación de dos pasos");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Ingrese el codigo de verificación generado por su aplicación móvil");

        txtCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCode.setAutoscrolls(false);
        txtCode.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodeFocusLost(evt);
            }
        });
        txtCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodeKeyTyped(evt);
            }
        });

        spCode.setForeground(new java.awt.Color(204, 204, 204));

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

        checkMail.setMaximumSize(new java.awt.Dimension(25, 25));
        checkMail.setMinimumSize(new java.awt.Dimension(25, 25));
        checkMail.setPreferredSize(new java.awt.Dimension(25, 25));

        checkCode.setMaximumSize(new java.awt.Dimension(25, 25));
        checkCode.setMinimumSize(new java.awt.Dimension(25, 25));
        checkCode.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spCode)
                                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 48, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(210, 210, 210)
                    .addComponent(checkMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(210, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(spCode, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(220, 220, 220)
                    .addComponent(checkMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(220, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodeFocusGained
        spCode.setBackground(Color.red);
    }//GEN-LAST:event_txtCodeFocusGained

    private void txtCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodeFocusLost
        spCode.setBackground(Color.white);
    }//GEN-LAST:event_txtCodeFocusLost

    private void txtCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodeKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
        btnNextActionPerformed(null);
    }//GEN-LAST:event_txtCodeKeyPressed

    private void txtCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodeKeyTyped
        char c = evt.getKeyChar();
        if(c == ' ' || c < '0' || c > '9' || txtCode.getText().length() > 5)
            evt.consume();
    }//GEN-LAST:event_txtCodeKeyTyped
    
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        disable();
        new Thread(()->{
            int myCode = Integer.parseInt(txtCode.getText());
            if(myCode == authenticator.returnCode(keygen)){
                classUsuario.setKeygen(keygen);
                if(classUsuario.insertKeygen(true)){
                    standardization.showMessage("ok", "Authenticador configurado");
                    classUsuario.setCheckKeygen(1);
                    technonizer.TechnoNizer.admin.jpSeUs();
                 }else{
                    standardization.showMessage("calcel", "El authenticador no se configurado");
                    enable();
                }
            }
            else{
                standardization.showMessage("cancel", "Los codigo no coinciden");
                enable();
            }
        }).start();
    }//GEN-LAST:event_btnNextActionPerformed
    //</editor-fold>

    public void enable(){
        txtCode.setEnabled(true);
        checkCode.setIcon(null);
    }
    
    public void disable(){
        txtCode.setEnabled(false);
        checkCode.setIcon(standardization.checkImage(2));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel checkCode;
    private javax.swing.JLabel checkMail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAuthenticator;
    private javax.swing.JSeparator spCode;
    private javax.swing.JTextField txtCode;
    // End of variables declaration//GEN-END:variables
}
