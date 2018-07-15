package JPane;

import com.placeholder.PlaceHolder;
import jFrame.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import javaClass.*;
import static javaClass.standardization.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class jpPassword extends javax.swing.JPanel {

    private JPanel rootPane;
    
    boolean sw;
    
    char echoChar;
    
    public void setRootPane(JPanel rootPane) {
        this.rootPane = rootPane;
    }

    
    public jpPassword(JPanel rootPane) {
        initComponents();
        this.rootPane = rootPane;
        
        PlaceHolder hPassword = new PlaceHolder(txtPassword, "Contraseña");
        loadEye();
        loadData();
        
    }
    
    //<editor-fold defaultstate="collapsed" desc="compiled code">
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        lblEye = new javax.swing.JLabel();
        spPassword = new javax.swing.JSeparator();
        jbNext = new javax.swing.JButton();
        btnRecoverPassword = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(420, 603));
        setMinimumSize(new java.awt.Dimension(420, 603));
        setPreferredSize(new java.awt.Dimension(420, 603));

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setText("Not Found");
        lblImage.setMaximumSize(new java.awt.Dimension(150, 150));
        lblImage.setMinimumSize(new java.awt.Dimension(150, 150));
        lblImage.setPreferredSize(new java.awt.Dimension(150, 150));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Not Found");
        jLabel1.setMaximumSize(new java.awt.Dimension(350, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(350, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(350, 30));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbNext, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(135, 135, 135))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(spPassword, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(lblEye, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnRecoverPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEye, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(spPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnRecoverPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents
    //</editor-fold>
    
    
       
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        rootPane.removeAll();
        rootPane.add(logIn.jpA,BorderLayout.CENTER);
        rootPane.revalidate();
        rootPane.repaint();
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
            invokeHome();
        }
        else
            standardization.showMessage("error", "Error al establecer una conexion de red.");
    }//GEN-LAST:event_jbNextActionPerformed

    private void btnRecoverPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecoverPasswordActionPerformed
        if(logIn.internet)
        {
            jpRecoverPasswordMail jpR = new jpRecoverPasswordMail(rootPane);
        
            jpR.setSize(420,603);
            jpR.setLocation(0,0);
            rootPane.removeAll();
            rootPane.add(jpR,BorderLayout.CENTER);
            rootPane.revalidate();
            rootPane.repaint();
        }
        else
            standardization.showMessage("error", "Error al establecer una conexion de red.");
    }//GEN-LAST:event_btnRecoverPasswordActionPerformed
    
        
    public void loadData()
    {
        ImageIcon original = new ImageIcon(getClass().getResource("/imagenes/user.png"));
        Icon icono = new ImageIcon(original.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        lblImage.setText("");
        lblImage.setIcon(icono);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbNext;
    private javax.swing.JLabel lblEye;
    private javax.swing.JLabel lblImage;
    private javax.swing.JSeparator spPassword;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
