package JPane;

import jFrame.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import javaClass.*;
import static javaClass.standardization.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import technonizer.TechnoNizer;

public class jpPassword extends javax.swing.JPanel {
    
    boolean sw;
    
    char echoChar;
    
    
    public jpPassword() {
        initComponents();
       
    }
    
    public jpPassword(boolean b){
       initComponents();
        
        loadData(); 
    }
    
    //<editor-fold defaultstate="collapsed" desc="compiled code">
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImage = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        lblEye = new javax.swing.JLabel();
        spPassword = new javax.swing.JSeparator();
        jbNext = new javax.swing.JButton();
        btnRecoverPassword = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(420, 603));
        setMinimumSize(new java.awt.Dimension(420, 603));
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
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Ingrese la contraseña para continuar");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton1.setText("Atras");
        jButton1.setBorderPainted(false);
        jButton1.setFocusable(false);
        jButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        jbNext.setBackground(new java.awt.Color(0, 153, 255));
        jbNext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbNext.setForeground(new java.awt.Color(255, 255, 255));
        jbNext.setText("Siguiente");
        jbNext.setBorderPainted(false);
        jbNext.setFocusable(false);
        jbNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNextActionPerformed(evt);
            }
        });

        btnRecoverPassword.setBackground(new java.awt.Color(255, 255, 255));
        btnRecoverPassword.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnRecoverPassword.setForeground(new java.awt.Color(0, 153, 255));
        btnRecoverPassword.setText("¿Olvidaste la contraseña?");
        btnRecoverPassword.setBorderPainted(false);
        btnRecoverPassword.setFocusable(false);
        btnRecoverPassword.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnRecoverPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecoverPasswordActionPerformed(evt);
            }
        });

        lblPassword.setMaximumSize(new java.awt.Dimension(35, 35));
        lblPassword.setMinimumSize(new java.awt.Dimension(35, 35));
        lblPassword.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(btnRecoverPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(spPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(lblEye, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(92, 92, 92))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbNext, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEye, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(spPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(btnRecoverPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents
    //</editor-fold>
    
    
       
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        controller.rootPane.removeAll();
        controller.rootPane.add(controller.jpA,BorderLayout.CENTER);
        controller.rootPane.revalidate();
        controller.rootPane.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void jbNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNextActionPerformed
        if(logIn.internet)
        {
            String pass = standardization.sha1(standardization.md5(Arrays.toString(txtPassword.getPassword())));
            System.out.println(pass);
            String passdb="";
            ResultSet rs = methodsSQL.getExecute("SELECT password FROM users WHERE nickname = ?",classUsuario.getNickname() );
            
            try {
                while(rs.next())
                    passdb= rs.getString(1);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println(passdb);
            if(pass.equals(passdb)){
                System.out.println("adelante");
                invokeHome();
            }else
                System.out.println("fuera");
 
        }
        else
            standardization.showMessage("error", "Error al establecer una conexion de red.",TechnoNizer.log);
    }//GEN-LAST:event_jbNextActionPerformed

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
        }
        else
            standardization.showMessage("error", "Error al establecer una conexion de red.", TechnoNizer.log);
    }//GEN-LAST:event_btnRecoverPasswordActionPerformed
    
    void loadData(){
        loadEye();
        lblPassword.setIcon(new controller().changeImage("/imagenes/password.png", 35, 35));
        lblImage.setIcon(new controller().changeImage("/imagenes/user.png", 150, 150));
        lblImage.setText("");
        
        ResultSet rs = methodsSQL.getExecute("select ui.firstName, ui.lastName from usersInformation ui where ui.nickname = ?", classUsuario.getNickname());
        
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
    private javax.swing.JButton btnRecoverPassword;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbNext;
    private javax.swing.JLabel lblEye;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JSeparator spPassword;
    private javax.swing.JLabel txtName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
