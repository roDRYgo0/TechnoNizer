package JPanel;

import jFrame.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaClass.*;
import static javaClass.standardization.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class jpPassword extends javax.swing.JPanel {
    
    boolean sw;
    ResultSet rs;
    char echoChar;
    
    public jpPassword(){
        initComponents();
        txtPassword.requestFocus();
        loadData(); 
    }
    
    //<editor-fold defaultstate="collapsed" desc="compiled code">
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSProgressCircleUIAnimated11 = new rojerusan.complementos.RSProgressCircleUIAnimated1();
        lblImage = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        lblEye = new javax.swing.JLabel();
        spPassword = new javax.swing.JSeparator();
        btnNext = new javax.swing.JButton();
        btnRecoverPassword = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        progress = new rojerusan.componentes.RSProgressMaterial();
        checkPass = new javax.swing.JLabel();
        checkImage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(420, 603));
        setMinimumSize(new java.awt.Dimension(420, 603));
        setNextFocusableComponent(txtPassword);
        setPreferredSize(new java.awt.Dimension(420, 603));

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setText("Not Found");
        lblImage.setMaximumSize(new java.awt.Dimension(150, 150));
        lblImage.setMinimumSize(new java.awt.Dimension(150, 150));
        lblImage.setPreferredSize(new java.awt.Dimension(150, 150));

        txtName.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName.setText("Not Found");
        txtName.setMaximumSize(new java.awt.Dimension(350, 30));
        txtName.setMinimumSize(new java.awt.Dimension(350, 30));
        txtName.setPreferredSize(new java.awt.Dimension(350, 30));

        txtPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtPassword.setNextFocusableComponent(txtPassword);
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

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Ingrese la contraseña para continuar");

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

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));

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

        btnRecoverPassword.setBackground(new java.awt.Color(255, 255, 255));
        btnRecoverPassword.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnRecoverPassword.setForeground(new java.awt.Color(0, 153, 255));
        btnRecoverPassword.setText("¿Olvidaste la contraseña?");
        btnRecoverPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRecoverPassword.setBorderPainted(false);
        btnRecoverPassword.setFocusable(false);
        btnRecoverPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecoverPasswordActionPerformed(evt);
            }
        });

        lblPassword.setMaximumSize(new java.awt.Dimension(35, 35));
        lblPassword.setMinimumSize(new java.awt.Dimension(35, 35));
        lblPassword.setPreferredSize(new java.awt.Dimension(35, 35));

        progress.setForeground(new java.awt.Color(255, 255, 255));
        progress.setAnchoProgress(6);
        progress.setPreferredSize(new java.awt.Dimension(34, 34));

        checkPass.setMaximumSize(new java.awt.Dimension(25, 25));
        checkPass.setMinimumSize(new java.awt.Dimension(25, 25));
        checkPass.setPreferredSize(new java.awt.Dimension(25, 25));

        checkImage.setMaximumSize(new java.awt.Dimension(25, 25));
        checkImage.setMinimumSize(new java.awt.Dimension(25, 25));
        checkImage.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(checkImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(spPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(lblEye, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2)
                                    .addComponent(btnRecoverPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEye, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addComponent(spPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)))
                .addGap(21, 21, 21)
                .addComponent(btnRecoverPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents
    //</editor-fold>
   
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        controller.rootPane.removeAll();
        controller.rootPane.add(controller.jpA,BorderLayout.CENTER);
        controller.rootPane.revalidate();
        controller.rootPane.repaint();
        controller.jpA.enable();
    }//GEN-LAST:event_btnBackActionPerformed

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

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
       spPassword.setBackground(Color.red);
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        spPassword.setBackground(Color.gray);
    }//GEN-LAST:event_txtPasswordFocusLost

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if(logIn.internet)
        {
            String pass = standardization.sha1(standardization.md5(standardization.convertPassword(txtPassword.getPassword())));
            System.out.println(pass);
            new Thread(()->{
                disable();
                rs = methodsSQL.getExecute("SELECT password FROM users WHERE nickname = ?",classUsuario.getNickname() );
                try {
                    while(rs.next())
                        classUsuario.setPassword(rs.getString(1));
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
                System.out.println(classUsuario.getPassword());
                if(pass.equals(classUsuario.getPassword())){
                    
                    checkPass.setIcon(standardization.checkImage(1));
                    new Thread(()->{
                        if(classUsuario.getCheckKeygen()==1){
                            controller.jpCheck = new jpAuthenticator();

                            controller.jpCheck.setSize(420,603);
                            controller.jpCheck.setLocation(0,0);
                            controller.rootPane.removeAll();
                            controller.rootPane.add(controller.jpCheck,BorderLayout.CENTER);
                            controller.rootPane.revalidate();
                            controller.rootPane.repaint();
                            
                        }else{
                            if(classUsuario.getCondition() == 0){
                                jpBanned ban = new jpBanned();

                                ban.setSize(420,603);
                                ban.setLocation(0,0);
                                controller.rootPane.removeAll();
                                controller.rootPane.add(ban,BorderLayout.CENTER);
                                controller.rootPane.revalidate();
                                controller.rootPane.repaint();
                            }else if(classUsuario.getCondition()==3){
                                jpChoose choose = new jpChoose();

                                choose.setSize(420,603);
                                choose.setLocation(0,0);

                                controller.rootPane.removeAll();
                                controller.rootPane.add(choose,BorderLayout.CENTER);
                                controller.rootPane.revalidate();
                                controller.rootPane.repaint();
                            }else{
                                classUsuario.select();
                                classContact.select();
                                invokeHome(true);
                            }                                
                        }
                    }).start();
                    
                }else{
                    standardization.showMessage("error", "La contraseña no coinsiden.");
                    new Thread(()->{
                        usersBinnacle.binnacle(15);
                    }).start();
                    enable();
                }
            }).start();
 
        }
        else
            standardization.showMessage("error", "Error al establecer una conexion de red.");
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnRecoverPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecoverPasswordActionPerformed
        if(logIn.internet)
        {           
            controller.jpRP = new jpRecoverPasswordMail();
        
            controller.jpRP.setSize(420,603);
            controller.jpRP.setLocation(0,0);
            controller.rootPane.removeAll();
            controller.rootPane.add(controller.jpRP,BorderLayout.CENTER);
            controller.rootPane.revalidate();
            controller.rootPane.repaint();
            new Thread(()->{
                usersBinnacle.binnacle(16);
            }).start();
        }
        else
            standardization.showMessage("error", "Error al establecer una conexion de red.");
    }//GEN-LAST:event_btnRecoverPasswordActionPerformed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
            btnNextActionPerformed(null);
    }//GEN-LAST:event_txtPasswordKeyPressed
    
    public void disable(){
        checkPass.setIcon(standardization.checkImage(2));
        progress.setForeground(new Color(33,150,243));
        txtPassword.setFocusable(false);
        btnRecoverPassword.setEnabled(false);
        btnBack.setEnabled(false);
        btnNext.setEnabled(false);
    }
    
    public void enable(){
        progress.setForeground(new Color(255,255,255));
        checkPass.setIcon(null);
        txtPassword.setFocusable(true);
        btnRecoverPassword.setEnabled(true);
        btnBack.setEnabled(true);
        btnNext.setEnabled(true);
    }
    
    void loadData(){
        loadEye();
        lblPassword.setIcon(new controller().changeImage("/imagenes/password.png", 35, 35));
        lblImage.setIcon(new controller().changeImage("/imagenes/user.png", 150, 150));
        lblImage.setText("");
        
        rs = methodsSQL.getExecute("select ui.firstName, ui.lastName from users u, usersInformation ui where u.nickname = ui.nickname and ui.nickname = ?", classUsuario.getNickname());
        
        try {
            while(rs.next()){
                classUsuario.setFirstName(rs.getString(1));
                classUsuario.setLastName(rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        String[] name = classUsuario.getFirstName().split(" ");
        String[] lastName = classUsuario.getLastName().split(" ");
        txtName.setText(name[0]+" "+lastName[0]);
        checkImage.setIcon(standardization.checkImage(2));
        new Thread(()->{
            rs = methodsSQL.getExecute("select imagen from users where nickname = ?", classUsuario.getNickname());
            try {
                while(rs.next())
                    classUsuario.setImage(rs.getBytes(1));
            } catch (SQLException ex) {
                Logger.getLogger(jpPassword.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(classUsuario.getImage()!=null)
                lblImage.setIcon(new controller().changeSizeImage(standardization.getImgIcon(classUsuario.getImage()), 150, 150));
            checkImage.setIcon(null);
        }).start();        
    }
    
    //<editor-fold defaultstate="collapsed" desc="compiled code eye">
        
    public void loadEye()
    {
        echoChar = txtPassword.getEchoChar();
        ImageIcon original = new ImageIcon(getClass().getResource("/imagenes/eye.png"));
        Icon icono = new ImageIcon(original.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
        lblEye.setIcon(icono);
    }
    
    public void changeEye(boolean e){
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
    
    //<editor-fold defaultstate="collapsed" desc="compiled code">
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnRecoverPassword;
    private javax.swing.JLabel checkImage;
    private javax.swing.JLabel checkPass;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblEye;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblPassword;
    private rojerusan.componentes.RSProgressMaterial progress;
    private rojerusan.complementos.RSProgressCircleUIAnimated1 rSProgressCircleUIAnimated11;
    private javax.swing.JSeparator spPassword;
    private javax.swing.JLabel txtName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
