package JPanel;

import JPanel.CheckIn.jpCreateUser;
import jFrame.logIn;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javaClass.*;
import javax.swing.Timer;
import properties.propiedades;

public class jpAccess extends javax.swing.JPanel {

     void verificaridioma()
    {
    Properties pr = new propiedades (controller.idioma);
    AccederLabel.setText(pr.getProperty("AccesLabel"));
    NameLabelAcces.setText(pr.getProperty("NameLabel"));
    Accesoptionlabel.setText(pr.getProperty("OptionLabel"));
    Questionlabel.setText(pr.getProperty("Questionlabel"));
    btnCreateAccount.setText(pr.getProperty("btnCreateAccount"));
    btnNext.setText(pr.getProperty("btnNext"));
    }
    
    Timer timer;
    
    public jpAccess() {
        initComponents();
        load();
        verificaridioma();
        
    }

    void load(){
        enable();
        classUsuario.restartUser();
        iconUsername.setIcon(new controller().changeImage("/imagenes/customer.png", 35, 35));
        lblTitle.setIcon(new controller().changeImage("/imagenes/technonizer.png", 285, 50));
    }
    
    //<editor-fold defaultstate="collapsed" desc="compiled code">
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AccederLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        spMail = new javax.swing.JSeparator();
        txtUsername = new javax.swing.JTextField();
        Accesoptionlabel = new javax.swing.JLabel();
        NameLabelAcces = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Questionlabel = new javax.swing.JLabel();
        btnCreateAccount = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        iconUsername = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        checkMail = new javax.swing.JLabel();
        progress = new rojerusan.componentes.RSProgressMaterial();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(420, 603));
        setMinimumSize(new java.awt.Dimension(420, 603));
        setPreferredSize(new java.awt.Dimension(420, 603));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        AccederLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AccederLabel.setText("Acceder");

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));

        spMail.setForeground(new java.awt.Color(204, 204, 204));

        txtUsername.setAutoscrolls(false);
        txtUsername.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsernameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsernameKeyTyped(evt);
            }
        });

        Accesoptionlabel.setText("O inicia sesión con");

        NameLabelAcces.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        NameLabelAcces.setForeground(new java.awt.Color(102, 102, 102));
        NameLabelAcces.setText("Ingrese su nombre de usuario");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/facebook.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/google.png"))); // NOI18N

        Questionlabel.setText("¿Todavía no eres miembro?");

        btnCreateAccount.setBackground(new java.awt.Color(255, 255, 255));
        btnCreateAccount.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnCreateAccount.setText("Crear cuenta");
        btnCreateAccount.setBorderPainted(false);
        btnCreateAccount.setFocusable(false);
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
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

        iconUsername.setMaximumSize(new java.awt.Dimension(35, 35));
        iconUsername.setMinimumSize(new java.awt.Dimension(35, 35));
        iconUsername.setPreferredSize(new java.awt.Dimension(35, 35));

        checkMail.setMaximumSize(new java.awt.Dimension(25, 25));
        checkMail.setMinimumSize(new java.awt.Dimension(25, 25));
        checkMail.setPreferredSize(new java.awt.Dimension(25, 25));

        progress.setForeground(new java.awt.Color(255, 255, 255));
        progress.setAnchoProgress(6);
        progress.setPreferredSize(new java.awt.Dimension(34, 34));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Questionlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCreateAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel6))
                            .addComponent(Accesoptionlabel)
                            .addComponent(NameLabelAcces)
                            .addComponent(AccederLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(iconUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spMail)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 34, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(AccederLabel)
                .addGap(50, 50, 50)
                .addComponent(NameLabelAcces)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(spMail, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iconUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(Accesoptionlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Questionlabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    //</editor-fold>
    
    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        spMail.setBackground(Color.red);
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        spMail.setBackground(Color.white);
    }//GEN-LAST:event_txtUsernameFocusLost

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if(logIn.internet && !standardization.campoVacio(txtUsername.getText()))
        {
            String username = txtUsername.getText().trim().toLowerCase();
            new Thread(()->{
                disable();
                if(methodsSQL.exists("SELECT mail FROM users WHERE nickname = ?", username)){
                    checkMail.setIcon(standardization.checkImage(1));
                    new Thread(()->{
                            
                        classUsuario.setNickname(username);
                        new Thread(()->{
                            classSecurityQuestions.select();
                            System.out.println("Preguntas de seguridad cargadas");
                            System.out.println("Tu primera pregunta es "+classSecurityQuestions.getQuestions()[0]);
                        }).start();
                        classUsuario.setCondition(methodsSQL.getExecuteInt("SELECT condition FROM users WHERE nickname = ?", classUsuario.getNickname()));
                        
                        if(!classUsuario.selectKeygen())
                            standardization.showMessage("cancel", "Error keygen");   
                        else
                            System.out.println("listo");
                        
                        controller.jpP = new jpPassword();

                        controller.jpP.setSize(420,603);
                        controller.jpP.setLocation(0,0);
                        controller.rootPane.removeAll();
                        controller.rootPane.add(controller.jpP,BorderLayout.CENTER);
                        controller.rootPane.revalidate();
                        controller.rootPane.repaint();
                    }).start();

                }else{
                    standardization.showMessage("warning", "El usuario no existe.");
                    enable();
                }
                    
            }).start();
            
        }
        else if(standardization.campoVacio(txtUsername.getText()))
            standardization.showMessage("warning", "Ingrese su correo por favor.");
        else
            standardization.showMessage("error", "Error al establecer una conexion de red.");
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        if(logIn.internet)
        {
            createAccount();
//            standardization.showLoad(TechnoNizer.log);
        }
        else
            standardization.showMessage("error", "Error al establecer una conexion de red.");
    }//GEN-LAST:event_btnCreateAccountActionPerformed

    private void txtUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyTyped
        char c = evt.getKeyChar();
        if(txtUsername.getText().length()<41){
            if(Character.isLetter(c) || Character.isDigit(c)){}
            else{
                if(c != '.')
                    evt.consume();
            }
        }else
            evt.consume();
    }//GEN-LAST:event_txtUsernameKeyTyped

    private void txtUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
            btnNextActionPerformed(null);
    }//GEN-LAST:event_txtUsernameKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        classUsuario.setNickname("ElianFran");

        ResultSet rs = methodsSQL.getExecute("SELECT password FROM users WHERE nickname = ?",classUsuario.getNickname() );

        try {
            while(rs.next())
                classUsuario.setPassword(rs.getString(1));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        jpChoose choose = new jpChoose();

        choose.setSize(420,603);
        choose.setLocation(0,0);

        controller.rootPane.removeAll();
        controller.rootPane.add(choose,BorderLayout.CENTER);
        controller.rootPane.revalidate();
        controller.rootPane.repaint();

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
            
    }//GEN-LAST:event_formKeyReleased


    public void disable(){
        progress.setForeground(new Color(33,150,243));
        checkMail.setIcon(standardization.checkImage(2));
        txtUsername.setFocusable(false);
        btnCreateAccount.setEnabled(false);
        btnNext.setEnabled(false);
    }
    
    public void enable(){
        progress.setForeground(new Color(255,255,255));
        checkMail.setIcon(null);
        txtUsername.setFocusable(true);
        txtUsername.setText("");
        btnCreateAccount.setEnabled(true);
        btnNext.setEnabled(true);
    }
    
    public void createAccount() {
        
        controller.jpCU = new jpCreateUser();
        
                controller.jpCU.setSize(420,603);
                controller.jpCU.setLocation(0,0);
                controller.rootPane.removeAll();
                controller.rootPane.add(controller.jpCU,BorderLayout.CENTER);
                controller.rootPane.revalidate();
                controller.rootPane.repaint();                
                controller.actionCompleted=false;
//                standardization.hideLoad(TechnoNizer.log);
        
//        Thread load = new loadCreateAccount();
//        load.start();
//        
//        ActionListener listener = (ActionEvent evt) -> {           
//            if (controller.actionCompleted==true) {
//                
//                
//                timer.stop();
//            }
//        };

//        timer = new Timer(1000, listener);
//        timer.start();  
    }
    
    //<editor-fold defaultstate="collapsed" desc="compiled code">
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccederLabel;
    private javax.swing.JLabel Accesoptionlabel;
    private javax.swing.JLabel NameLabelAcces;
    private javax.swing.JLabel Questionlabel;
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel checkMail;
    private javax.swing.JLabel iconUsername;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblTitle;
    private rojerusan.componentes.RSProgressMaterial progress;
    private javax.swing.JSeparator spMail;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    //</editor-fold>
}
