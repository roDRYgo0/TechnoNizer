package JPanel;

import java.awt.Color;
import javaClass.classSecurityQuestions;
import javaClass.classUsuario;
import javaClass.controller;

public class securityAccount extends javax.swing.JPanel {

    public securityAccount() {
        initComponents();
        load();
    }
    
    void load(){
        if(classUsuario.getKeygen().equals("null")){
            lblStatusAuthen.setText("No configurado");
            lblStatusAuthen.setForeground(Color.red);
        }else{
            lblStatusAuthen.setText("Configurado");
            lblStatusAuthen.setForeground(Color.green);
        }
        if(classSecurityQuestions.getQuestions()[0]==null){
            lblStatusQuestions.setText("No configurado");
            lblStatusQuestions.setForeground(Color.red);
        }else{
            lblStatusQuestions.setText("Configurado");
            lblStatusQuestions.setForeground(Color.green);
        }
        loadImage();
    }
    
    void loadImage(){
        lblCheckAccount.setIcon(new controller().changeImage("/imagenes/email.png", 40, 40));
        lblAuthenticator.setIcon(new controller().changeImage("/imagenes/authenticator.png", 40, 40));
        lblSecurityQuestions.setIcon(new controller().changeImage("/imagenes/questions.png", 40, 40));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTN = new javax.swing.JLabel();
        lblCheckAccount = new javax.swing.JLabel();
        lblAuthenticator = new javax.swing.JLabel();
        lblSecurityQuestions = new javax.swing.JLabel();
        lblStatusAuthen = new javax.swing.JLabel();
        lblStatusAccount = new javax.swing.JLabel();
        lblStatusQuestions = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(445, 465));
        setMinimumSize(new java.awt.Dimension(445, 465));

        lblTN.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTN.setText("TechnoNizer");
        lblTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTNMouseClicked(evt);
            }
        });

        lblCheckAccount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCheckAccount.setText("Varificación de la cuenta");

        lblAuthenticator.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAuthenticator.setText("Authenticador");

        lblSecurityQuestions.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSecurityQuestions.setText("Preguntas de seguridad");

        lblStatusAuthen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblStatusAuthen.setForeground(new java.awt.Color(255, 0, 0));
        lblStatusAuthen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStatusAuthen.setText("No configurado");

        lblStatusAccount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblStatusAccount.setForeground(new java.awt.Color(0, 255, 0));
        lblStatusAccount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStatusAccount.setText("Verificada");

        lblStatusQuestions.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblStatusQuestions.setForeground(new java.awt.Color(255, 0, 0));
        lblStatusQuestions.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStatusQuestions.setText("No configuradas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCheckAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAuthenticator, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSecurityQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStatusAuthen, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatusAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatusQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(lblTN)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCheckAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatusAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAuthenticator, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatusAuthen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSecurityQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatusQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(149, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTNMouseClicked

    }//GEN-LAST:event_lblTNMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAuthenticator;
    private javax.swing.JLabel lblCheckAccount;
    private javax.swing.JLabel lblSecurityQuestions;
    private javax.swing.JLabel lblStatusAccount;
    private javax.swing.JLabel lblStatusAuthen;
    private javax.swing.JLabel lblStatusQuestions;
    private javax.swing.JLabel lblTN;
    // End of variables declaration//GEN-END:variables
}
