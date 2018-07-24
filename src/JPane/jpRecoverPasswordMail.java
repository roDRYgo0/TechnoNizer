package JPane;

import jFrame.*;
import java.awt.BorderLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaClass.*;
import technonizer.TechnoNizer;

public class jpRecoverPasswordMail extends javax.swing.JPanel {

    public jpRecoverPasswordMail() {
        initComponents();        
        load();
    }
    
    void load(){
        ResultSet rs = methodsSQL.getExecute("SELECT mail FROM users WHERE nickname = ?", classUsuario.getNickname());
        try {
            while(rs.next())
                classUsuario.setMail(rs.getString(1));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        lblMail.setText(classUsuario.getMail());
        System.out.println(classUsuario.getMail());
        lblResetPassword.setIcon(new controller().changeImage("/imagenes/resetPassword.png", 40, 40));
        lblThinking.setIcon(new controller().changeImage("/imagenes/thinking.png", 96, 96));
        lblImageMail.setIcon(new controller().changeImage("/imagenes/email.png", 35, 35));
    }

    //<editor-fold defaultstate="collapsed" desc="compiled code">
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spTop = new javax.swing.JSeparator();
        jbNext = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblResetPassword = new javax.swing.JLabel();
        lblTN = new javax.swing.JLabel();
        lblThinking = new javax.swing.JLabel();
        lblImageMail = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(420, 603));
        setMinimumSize(new java.awt.Dimension(420, 603));
        setPreferredSize(new java.awt.Dimension(420, 603));

        spTop.setForeground(new java.awt.Color(153, 153, 153));

        jbNext.setBackground(new java.awt.Color(0, 153, 255));
        jbNext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbNext.setForeground(new java.awt.Color(255, 255, 255));
        jbNext.setText("Enviar");
        jbNext.setBorderPainted(false);
        jbNext.setFocusable(false);
        jbNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNextActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnBack.setText("Atras");
        btnBack.setBorderPainted(false);
        btnBack.setFocusable(false);
        btnBack.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Obtener codigo de verificación.");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel5.setText("Te enviaremos un correo electrónico con el código a ");

        lblMail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMail.setText("Not Found");
        lblMail.setMaximumSize(new java.awt.Dimension(302, 32));
        lblMail.setMinimumSize(new java.awt.Dimension(302, 32));
        lblMail.setPreferredSize(new java.awt.Dimension(302, 32));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Recuperación de contraseña");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setText("Podemos ayudarte a recuperar tu contraseña.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setText("Pero primero verifica tu identidad.");

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
                                .addComponent(jbNext, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                .addComponent(lblMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblResetPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel3))))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3))
                    .addComponent(lblResetPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImageMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents
    //</editor-fold>
    
    private void jbNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNextActionPerformed
        
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
            standardization.showMessage("error", "Error al establecer una conexion de red.",TechnoNizer.log);
        
    }//GEN-LAST:event_jbNextActionPerformed

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

    //<editor-fold defaultstate="collapsed" desc="compiled code">
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbNext;
    private javax.swing.JLabel lblImageMail;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblResetPassword;
    private javax.swing.JLabel lblTN;
    private javax.swing.JLabel lblThinking;
    private javax.swing.JSeparator spTop;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
