package JPanel;

import java.awt.Color;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.standardization;
import static javaClass.standardization.invokeHome;

public class checkAccount extends javax.swing.JPanel {

    int step = 0;
    
    public checkAccount() {
        initComponents();
        load();
    }

    void load(){
        lblMail.setText(classUsuario.getMail());
        
        lblInsertCode.setVisible(false);
        txtCode.setVisible(false);
        spCode.setVisible(false);
        
        lblResetPassword.setIcon(new controller().changeImage("/imagenes/resetPassword.png", 40, 40));
        lblThinking.setIcon(new controller().changeImage("/imagenes/thinking.png", 96, 96));
        lblImageMail.setIcon(new controller().changeImage("/imagenes/email.png", 35, 35));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        lblResetPassword = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblTN = new javax.swing.JLabel();
        lblThinking = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        lblImageMail = new javax.swing.JLabel();
        checkMail = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        lblInsertCode = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        spCode = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(445, 465));
        setMinimumSize(new java.awt.Dimension(445, 465));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel8.setText("Parar usar los servicios de TechnoNizer");

        lblResetPassword.setMaximumSize(new java.awt.Dimension(40, 40));
        lblResetPassword.setMinimumSize(new java.awt.Dimension(40, 40));
        lblResetPassword.setPreferredSize(new java.awt.Dimension(40, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Obtener codigo de verificación.");

        lblTN.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTN.setText("TechnoNizer");
        lblTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTNMouseClicked(evt);
            }
        });

        lblThinking.setMaximumSize(new java.awt.Dimension(96, 96));
        lblThinking.setMinimumSize(new java.awt.Dimension(96, 96));
        lblThinking.setPreferredSize(new java.awt.Dimension(96, 96));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel11.setText("Te enviaremos un correo electrónico con el código a ");

        lblMail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMail.setText("Not Found");
        lblMail.setMaximumSize(new java.awt.Dimension(302, 32));
        lblMail.setMinimumSize(new java.awt.Dimension(302, 32));
        lblMail.setPreferredSize(new java.awt.Dimension(302, 32));

        lblImageMail.setMaximumSize(new java.awt.Dimension(35, 35));
        lblImageMail.setMinimumSize(new java.awt.Dimension(35, 35));
        lblImageMail.setPreferredSize(new java.awt.Dimension(35, 35));

        checkMail.setMaximumSize(new java.awt.Dimension(25, 25));
        checkMail.setMinimumSize(new java.awt.Dimension(25, 25));
        checkMail.setPreferredSize(new java.awt.Dimension(25, 25));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Verifica tu cuenta");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setText("primero debes verificar tu cuenta");

        btnNext.setBackground(new java.awt.Color(0, 153, 255));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Enviar");
        btnNext.setBorderPainted(false);
        btnNext.setFocusable(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        lblInsertCode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblInsertCode.setText("Ingresa el código de verificación.");

        txtCode.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCode.setToolTipText("");
        txtCode.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodeFocusLost(evt);
            }
        });

        spCode.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(spCode, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTN)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblThinking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblResetPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImageMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(checkMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblInsertCode)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTN)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblThinking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel9))
                            .addComponent(lblResetPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblImageMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblInsertCode)
                .addGap(18, 18, 18)
                .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(spCode, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTNMouseClicked

    }//GEN-LAST:event_lblTNMouseClicked

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        switch(step){
            case 0:
                classUsuario.setCode(standardization.generatedCode());
                standardization.enviarConGMail(classUsuario.getMail(), "Verificación tu cuenta TechnoNizer",
                    "Este es su codigo de verificación, valido para la cuenta "+classUsuario.getNickname()+" : "+classUsuario.getCode());
                lblInsertCode.setVisible(true);
                txtCode.setVisible(true);
                spCode.setVisible(true);
                step++;
                break;
            case 1:
                if(txtCode.getText().equals(classUsuario.getCode())){
                    classUsuario.setCondition(2);
                    if(classUsuario.updateCondition()){
                        technonizer.TechnoNizer.home.setVisible(false);
                        invokeHome(true);
                        standardization.showMessage("ok", "Se verifico correctamente");
                    }
                    else
                        standardization.showMessage("error", "No se puede verificar en este momento");
                }else
                    standardization.showMessage("error", "El código no coincide");
                break;
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtCodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodeFocusGained
        spCode.setBackground(Color.red);
    }//GEN-LAST:event_txtCodeFocusGained

    private void txtCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodeFocusLost
        spCode.setBackground(Color.white);
    }//GEN-LAST:event_txtCodeFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel checkMail;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblImageMail;
    private javax.swing.JLabel lblInsertCode;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblResetPassword;
    private javax.swing.JLabel lblTN;
    private javax.swing.JLabel lblThinking;
    private javax.swing.JSeparator spCode;
    private javax.swing.JTextField txtCode;
    // End of variables declaration//GEN-END:variables
}
