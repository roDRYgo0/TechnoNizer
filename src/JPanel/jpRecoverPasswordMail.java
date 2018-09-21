package JPanel;

import jFrame.*;
import java.awt.BorderLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaClass.*;
import properties.propiedades;

public class jpRecoverPasswordMail extends javax.swing.JPanel {

    void verificaridioma()
    {
    Properties pr= new propiedades(controller.idioma);
    lbl1title.setText(pr.getProperty("lbl1title"));
    lbl2RecoverPass.setText(pr.getProperty("lbl2RecoverPass"));
    lbl3RecoverPass.setText(pr.getProperty("lbl3RecoverPass"));
    lbl4RecoverPass.setText(pr.getProperty("lbl4RecoverPass"));
    lbl5RecorverPass.setText(pr.getProperty("lbl5RecorverPass"));
    btnRecoverPassword.setText(pr.getProperty("btnRecoverPasswordMethod"));
    btnBack.setText(pr.getProperty("btnBackPass"));
    btnNext.setText(pr.getProperty("btnNextPass"));
    }
    
    public jpRecoverPasswordMail() {
        initComponents(); 
        verificaridioma();
        load();
    }
    
    void load(){
        checkMail.setIcon(standardization.checkImage(2));
        new Thread(()->{
            ResultSet rs = methodsSQL.getExecute("SELECT mail FROM users WHERE nickname = ?",classUsuario.getNickname());
            try {
                while(rs.next())
                    classUsuario.setMail(rs.getString(1));
                lblMail.setText(classUsuario.getMail());
                checkMail.setIcon(null);
                btnNext.setEnabled(true);
            } catch (SQLException ex) {
                Logger.getLogger(jpAccess.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).start();
        if(classSecurityQuestions.getQuestions()[0]==null){
            btnRecoverPassword.setVisible(false);
        }
        lblResetPassword.setIcon(new controller().changeImage("/imagenes/resetPassword.png", 40, 40));
        lblThinking.setIcon(new controller().changeImage("/imagenes/thinking.png", 96, 96));
        lblImageMail.setIcon(new controller().changeImage("/imagenes/email.png", 35, 35));
    }

    //<editor-fold defaultstate="collapsed" desc="compiled code">
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spTop = new javax.swing.JSeparator();
        btnNext = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lbl4RecoverPass = new javax.swing.JLabel();
        lbl5RecorverPass = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        lbl1title = new javax.swing.JLabel();
        lbl2RecoverPass = new javax.swing.JLabel();
        lbl3RecoverPass = new javax.swing.JLabel();
        lblResetPassword = new javax.swing.JLabel();
        lblTN = new javax.swing.JLabel();
        lblThinking = new javax.swing.JLabel();
        lblImageMail = new javax.swing.JLabel();
        checkMail = new javax.swing.JLabel();
        btnRecoverPassword = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(420, 603));
        setMinimumSize(new java.awt.Dimension(420, 603));
        setPreferredSize(new java.awt.Dimension(420, 603));

        spTop.setForeground(new java.awt.Color(153, 153, 153));

        btnNext.setBackground(new java.awt.Color(0, 153, 255));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Enviar");
        btnNext.setBorderPainted(false);
        btnNext.setEnabled(false);
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

        lbl4RecoverPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl4RecoverPass.setText("Obtener codigo de verificación.");

        lbl5RecorverPass.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lbl5RecorverPass.setText("Te enviaremos un correo electrónico con el código a ");

        lblMail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMail.setText("Not Found");
        lblMail.setMaximumSize(new java.awt.Dimension(302, 32));
        lblMail.setMinimumSize(new java.awt.Dimension(302, 32));
        lblMail.setPreferredSize(new java.awt.Dimension(302, 32));

        lbl1title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl1title.setText("Recuperación de contraseña");

        lbl2RecoverPass.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lbl2RecoverPass.setText("Podemos ayudarte a recuperar tu contraseña.");

        lbl3RecoverPass.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lbl3RecoverPass.setText("Pero primero verifica tu identidad.");

        lblResetPassword.setMaximumSize(new java.awt.Dimension(40, 40));
        lblResetPassword.setMinimumSize(new java.awt.Dimension(40, 40));
        lblResetPassword.setPreferredSize(new java.awt.Dimension(40, 40));

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

        lblImageMail.setMaximumSize(new java.awt.Dimension(35, 35));
        lblImageMail.setMinimumSize(new java.awt.Dimension(35, 35));
        lblImageMail.setPreferredSize(new java.awt.Dimension(35, 35));

        checkMail.setMaximumSize(new java.awt.Dimension(25, 25));
        checkMail.setMinimumSize(new java.awt.Dimension(25, 25));
        checkMail.setPreferredSize(new java.awt.Dimension(25, 25));

        btnRecoverPassword.setBackground(new java.awt.Color(255, 255, 255));
        btnRecoverPassword.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnRecoverPassword.setForeground(new java.awt.Color(0, 153, 255));
        btnRecoverPassword.setText("Otro metodo");
        btnRecoverPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRecoverPassword.setBorderPainted(false);
        btnRecoverPassword.setFocusable(false);
        btnRecoverPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecoverPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spTop, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTN)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblThinking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblImageMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(lblMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(checkMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl1title)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblResetPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl2RecoverPass)
                                    .addComponent(lbl3RecoverPass)))
                            .addComponent(lbl4RecoverPass)
                            .addComponent(lbl5RecorverPass, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 22, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRecoverPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(spTop, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lblTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblThinking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl1title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lbl2RecoverPass)
                        .addGap(5, 5, 5)
                        .addComponent(lbl3RecoverPass))
                    .addComponent(lblResetPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(lbl4RecoverPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl5RecorverPass)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblImageMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(btnRecoverPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents
    //</editor-fold>
    
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        
        if(logIn.internet)
        {
            classUsuario.setCode(standardization.generatedCode());
            standardization.enviarConGMail(classUsuario.getMail(), "Recuperación de contraseña",
                    "Su código de verificaión es : "+classUsuario.getCode());
            
            controller.jpRC = new jpRecoverPasswordMailCode();
        
            controller.jpRC.setSize(420,603);
            controller.jpRC.setLocation(0,0);
            controller.rootPane.removeAll();
            controller.rootPane.add(controller.jpRC,BorderLayout.CENTER);
            controller.rootPane.revalidate();
            controller.rootPane.repaint(); 
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

    private void lblTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTNMouseClicked
        controller.jpA = new jpAccess();
        
        controller.jpA.setSize(420,603);
        controller.jpA.setLocation(0,0);
        
        controller.rootPane.removeAll();
        controller.rootPane.add(controller.jpA,BorderLayout.CENTER);
        controller.rootPane.revalidate();
        controller.rootPane.repaint();
    }//GEN-LAST:event_lblTNMouseClicked

    private void btnRecoverPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecoverPasswordActionPerformed
        if(logIn.internet)
        {
            jpQuestions question = new jpQuestions(0);
            question.setSize(420, 603);
            question.setLocation(0,0);

            controller.rootPane.removeAll();
            controller.rootPane.add(question,BorderLayout.CENTER);
            controller.rootPane.revalidate();
            controller.rootPane.repaint();
        }
        else
        standardization.showMessage("error", "Error al establecer una conexion de red.");
    }//GEN-LAST:event_btnRecoverPasswordActionPerformed

    //<editor-fold defaultstate="collapsed" desc="compiled code">
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnRecoverPassword;
    private javax.swing.JLabel checkMail;
    private javax.swing.JLabel lbl1title;
    private javax.swing.JLabel lbl2RecoverPass;
    private javax.swing.JLabel lbl3RecoverPass;
    private javax.swing.JLabel lbl4RecoverPass;
    private javax.swing.JLabel lbl5RecorverPass;
    private javax.swing.JLabel lblImageMail;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblResetPassword;
    private javax.swing.JLabel lblTN;
    private javax.swing.JLabel lblThinking;
    private javax.swing.JSeparator spTop;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
