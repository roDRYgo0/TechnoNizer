package JPanel.CheckIn;

import jFrame.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Arrays;
import java.util.Properties;
import javaClass.*;
import properties.propiedades;

public class jpCreateUser extends javax.swing.JPanel {
    
    boolean sw, continueM, continueN, continueP;
    char echoChar;
    
    void verificaridioma()
    {
    Properties pr = new propiedades (controller.idioma);
    TituloCreateData.setText(pr.getProperty("Titulo"));
    SubtituloCreateData.setText(pr.getProperty("Subtitulo"));
    St1.setText(pr.getProperty("SubEmail"));
    st2.setText(pr.getProperty("st2"));
    st3.setText(pr.getProperty("st3"));
    st4.setText(pr.getProperty("st4"));
    st5.setText(pr.getProperty("st5"));
    Bback.setText(pr.getProperty("Bback"));
    btnNext.setText(pr.getProperty("btnNext"));
            
    
    }
    
    public jpCreateUser() {
        initComponents();
        
        continueM = false;
        continueN = false;
        
        loadIcons();
        verificaridioma();
    }
    
    void loadIcons(){
        loadEye();
        iconUsername.setIcon(new controller().changeImage("/imagenes/username.png", 35, 35));
        iconEmail.setIcon(new controller().changeImage("/imagenes/email.png", 35, 35));
        iconPass.setIcon(new controller().changeImage("/imagenes/password.png", 35, 35));
        iconPass2.setIcon(new controller().changeImage("/imagenes/password.png", 35, 35));
        lblAyuda.setIcon(new controller().changeImage("/imagenes/Ayuda.png", 25, 25));
    }

    //<editor-fold defaultstate="collapsed" desc="compiled code">
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TituloCreateData = new javax.swing.JLabel();
        Bback = new javax.swing.JButton();
        St1 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        spMail = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();
        spPassword = new javax.swing.JSeparator();
        lblEye = new javax.swing.JLabel();
        st4 = new javax.swing.JLabel();
        spPasswordConfirm = new javax.swing.JSeparator();
        txtPasswordConfirm = new javax.swing.JPasswordField();
        lblEyeConfirm = new javax.swing.JLabel();
        st5 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        st2 = new javax.swing.JLabel();
        checkUsername = new javax.swing.JLabel();
        iconUsername = new javax.swing.JLabel();
        txtNickName = new javax.swing.JTextField();
        spNickName = new javax.swing.JSeparator();
        iconEmail = new javax.swing.JLabel();
        st3 = new javax.swing.JLabel();
        checkEmail = new javax.swing.JLabel();
        iconPass = new javax.swing.JLabel();
        iconPass2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        SubtituloCreateData = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        checkPass = new javax.swing.JLabel();
        lblAyuda = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(420, 603));
        setMinimumSize(new java.awt.Dimension(420, 603));
        setPreferredSize(new java.awt.Dimension(420, 603));
        setRequestFocusEnabled(false);

        TituloCreateData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TituloCreateData.setText("Crea tu cuenta en TechnoNizer");

        Bback.setBackground(new java.awt.Color(255, 255, 255));
        Bback.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Bback.setText("Atras");
        Bback.setBorderPainted(false);
        Bback.setFocusable(false);
        Bback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbackActionPerformed(evt);
            }
        });

        St1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        St1.setForeground(new java.awt.Color(102, 102, 102));
        St1.setText("Crea tu nombre de usuario");

        txtMail.setAutoscrolls(false);
        txtMail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtMail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMailFocusLost(evt);
            }
        });
        txtMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailActionPerformed(evt);
            }
        });
        txtMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMailKeyTyped(evt);
            }
        });

        spMail.setForeground(new java.awt.Color(204, 204, 204));

        txtPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });

        spPassword.setForeground(new java.awt.Color(204, 204, 204));

        lblEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eye.png"))); // NOI18N
        lblEye.setMaximumSize(new java.awt.Dimension(20, 20));
        lblEye.setMinimumSize(new java.awt.Dimension(20, 20));
        lblEye.setPreferredSize(new java.awt.Dimension(20, 20));
        lblEye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEyeMouseClicked(evt);
            }
        });

        st4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        st4.setForeground(new java.awt.Color(102, 102, 102));
        st4.setText("Ingrese la contraseña");

        spPasswordConfirm.setForeground(new java.awt.Color(204, 204, 204));

        txtPasswordConfirm.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtPasswordConfirm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordConfirmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordConfirmFocusLost(evt);
            }
        });

        lblEyeConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eye.png"))); // NOI18N
        lblEyeConfirm.setMaximumSize(new java.awt.Dimension(20, 20));
        lblEyeConfirm.setMinimumSize(new java.awt.Dimension(20, 20));
        lblEyeConfirm.setPreferredSize(new java.awt.Dimension(20, 20));
        lblEyeConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEyeConfirmMouseClicked(evt);
            }
        });

        st5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        st5.setForeground(new java.awt.Color(102, 102, 102));
        st5.setText("Confirme la contraseña");

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

        st2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        st2.setText("Necesitamos validar tu identidad");

        checkUsername.setMaximumSize(new java.awt.Dimension(25, 25));
        checkUsername.setMinimumSize(new java.awt.Dimension(25, 25));
        checkUsername.setPreferredSize(new java.awt.Dimension(25, 25));

        iconUsername.setMaximumSize(new java.awt.Dimension(35, 35));
        iconUsername.setMinimumSize(new java.awt.Dimension(35, 35));
        iconUsername.setPreferredSize(new java.awt.Dimension(35, 35));

        txtNickName.setAutoscrolls(false);
        txtNickName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtNickName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNickNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNickNameFocusLost(evt);
            }
        });
        txtNickName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNickNameActionPerformed(evt);
            }
        });
        txtNickName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNickNameKeyTyped(evt);
            }
        });

        spNickName.setForeground(new java.awt.Color(204, 204, 204));

        iconEmail.setMaximumSize(new java.awt.Dimension(35, 35));
        iconEmail.setMinimumSize(new java.awt.Dimension(35, 35));
        iconEmail.setPreferredSize(new java.awt.Dimension(35, 35));

        st3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        st3.setForeground(new java.awt.Color(102, 102, 102));
        st3.setText("Ingresa tu correo");

        checkEmail.setMaximumSize(new java.awt.Dimension(25, 25));
        checkEmail.setMinimumSize(new java.awt.Dimension(25, 25));
        checkEmail.setPreferredSize(new java.awt.Dimension(25, 25));

        iconPass.setMaximumSize(new java.awt.Dimension(35, 35));
        iconPass.setMinimumSize(new java.awt.Dimension(35, 35));
        iconPass.setPreferredSize(new java.awt.Dimension(35, 35));

        iconPass2.setMaximumSize(new java.awt.Dimension(35, 35));
        iconPass2.setMinimumSize(new java.awt.Dimension(35, 35));
        iconPass2.setPreferredSize(new java.awt.Dimension(35, 35));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setEnabled(false);

        SubtituloCreateData.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        SubtituloCreateData.setText("Recuerda que tu usuario debe ser unico");

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator2.setEnabled(false);

        checkPass.setMaximumSize(new java.awt.Dimension(25, 25));
        checkPass.setMinimumSize(new java.awt.Dimension(25, 25));
        checkPass.setPreferredSize(new java.awt.Dimension(25, 25));

        lblAyuda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAyuda.setMaximumSize(new java.awt.Dimension(25, 25));
        lblAyuda.setMinimumSize(new java.awt.Dimension(25, 25));
        lblAyuda.setPreferredSize(new java.awt.Dimension(25, 25));
        lblAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblAyudaMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(iconPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(st5)
                                    .addComponent(spPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(lblEyeConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(iconPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(st4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(spPassword)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(lblEye, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(SubtituloCreateData))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(st3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(iconEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spMail)
                                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st2)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TituloCreateData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                .addComponent(lblAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(St1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(iconUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNickName)
                                    .addComponent(spNickName, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Bback, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(189, 189, 189)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(TituloCreateData)))
                .addGap(28, 28, 28)
                .addComponent(SubtituloCreateData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(St1)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNickName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(spNickName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(st2)
                .addGap(18, 18, 18)
                .addComponent(st3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(spMail, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iconEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(iconPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(spPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(st5)
                                        .addGap(0, 0, 0)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblEyeConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(iconPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(checkPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(spPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(st4)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEye, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(170, 170, 170)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bback, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents
    //</editor-fold>
    
    private void BbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbackActionPerformed
        controller.rootPane.removeAll();
        controller.rootPane.add(controller.jpA,BorderLayout.CENTER);
        controller.rootPane.revalidate();
        controller.rootPane.repaint();
    }//GEN-LAST:event_BbackActionPerformed

    private void txtMailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMailFocusGained
        spMail.setBackground(Color.red);
    }//GEN-LAST:event_txtMailFocusGained

    private void txtMailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMailFocusLost
        spMail.setBackground(Color.white);
        if(!standardization.campoVacio(txtMail.getText()))
        {
            checkEmail.setIcon(new controller().changeImage("/imagenes/load.png", 20, 20));
            if(standardization.validateEmail(txtMail.getText())){
                new Thread(()->{
                    if(methodsSQL.exists("SELECT * FROM users WHERE mail = ? ", txtMail.getText()))
                {
                    checkEmail.setIcon(new controller().changeImage("/imagenes/cancel.png", 20, 20));
                    continueM = false;
                }
                else{
                    checkEmail.setIcon(new controller().changeImage("/imagenes/ok.png", 20, 20));
                    continueM = true;
                } 
                }).start();
            }else{
                checkEmail.setIcon(new controller().changeImage("/imagenes/cancel.png", 20, 20));
                continueM = false;
            }
        }else
            checkEmail.setIcon(null);
    }//GEN-LAST:event_txtMailFocusLost

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        spPassword.setBackground(Color.red);
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        spPassword.setBackground(Color.white);
        if(!standardization.validatePassword(standardization.convertPassword(txtPassword.getPassword()))){
            standardization.showMessage("warning", "La contraseña no cumple las espectativas");
            checkPass.setIcon(new controller().changeImage("/imagenes/cancel.png", 20, 20));
            continueP = false;
            
        }
        else{
            checkPass.setIcon(new controller().changeImage("/imagenes/ok.png", 20, 20));
            continueP = true;
        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void lblEyeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEyeMouseClicked
        if (!sw) {
            txtPassword.setEchoChar((char)0);
            txtPasswordConfirm.setEchoChar((char)0);
            sw = !sw;
            changeEye(sw);
        } else {
            txtPassword.setEchoChar(echoChar);
            txtPasswordConfirm.setEchoChar(echoChar);
            sw = !sw;
            changeEye(sw);
        }
    }//GEN-LAST:event_lblEyeMouseClicked

    private void txtPasswordConfirmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordConfirmFocusGained
        spPasswordConfirm.setBackground(Color.red);
    }//GEN-LAST:event_txtPasswordConfirmFocusGained

    private void txtPasswordConfirmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordConfirmFocusLost
        spPasswordConfirm.setBackground(Color.white);
    }//GEN-LAST:event_txtPasswordConfirmFocusLost

    private void lblEyeConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEyeConfirmMouseClicked
        if (!sw) {
            txtPassword.setEchoChar((char)0);
            txtPasswordConfirm.setEchoChar((char)0);
            sw = !sw;
            changeEye(sw);
        } else {
            txtPassword.setEchoChar(echoChar);
            txtPasswordConfirm.setEchoChar(echoChar);
            sw = !sw;
            changeEye(sw);
        }
    }//GEN-LAST:event_lblEyeConfirmMouseClicked

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if(logIn.internet)
        {
            if(Arrays.equals(txtPasswordConfirm.getPassword(), txtPassword.getPassword()) && continueM && continueN &&
                    !standardization.campoVacio(txtMail.getText()) && !standardization.campoVacio(txtNickName.getText())
                    && continueP) {
                controller.jpCD = new jpCreateData();

                classUsuario.setNickname(txtNickName.getText().replace(" ", ""));
                classUsuario.setMail(txtMail.getText().replace(" ", ""));
                
                classUsuario.setPassword(standardization.sha1(standardization.md5(standardization.convertPassword(txtPassword.getPassword()))));
                
                controller.jpCD.setSize(420,603);
                controller.jpCD.setLocation(0,0);
                controller.rootPane.removeAll();
                controller.rootPane.add(controller.jpCD,BorderLayout.CENTER);
                controller.rootPane.revalidate();
                controller.rootPane.repaint();
            } 
            else if(!continueM || !continueN)
                standardization.showMessage("warning", "Llene todos los campos.");
            else
                standardization.showMessage("warning", "Las contraseñas no coinciden.");
        }
        else
            standardization.showMessage("error", "Error al establecer una conexion de red.");
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtNickNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNickNameFocusGained
        spNickName.setBackground(Color.red);
    }//GEN-LAST:event_txtNickNameFocusGained

    private void txtNickNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNickNameFocusLost
        spNickName.setBackground(Color.white);
        if(!standardization.campoVacio(txtNickName.getText())){
            checkUsername.setIcon(new controller().changeImage("/imagenes/load.png", 20, 20));
            new Thread(()->{
                if(methodsSQL.exists("SELECT * FROM users WHERE nickname = ? ", txtNickName.getText()) || txtNickName.getText().length()<6)
                {
                    checkUsername.setIcon(new controller().changeImage("/imagenes/cancel.png", 20, 20));
                    continueN = false;
                }
                else{
                    checkUsername.setIcon(new controller().changeImage("/imagenes/ok.png", 20, 20));
                    continueN = true;
                } 
            }).start();
        }else
            checkUsername.setIcon(null);
    }//GEN-LAST:event_txtNickNameFocusLost

    private void txtNickNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNickNameKeyTyped
        char c = evt.getKeyChar();
        if(txtNickName.getText().length()<20){
            if(Character.isLetter(c) || Character.isDigit(c)){}
            else{
                if(c != '.')
                    evt.consume();
            }
            
        }else
            evt.consume();
    }//GEN-LAST:event_txtNickNameKeyTyped

    private void txtMailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMailKeyTyped
        char c = evt.getKeyChar();
        if(c == ' ')
            evt.consume();
    }//GEN-LAST:event_txtMailKeyTyped

    private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailActionPerformed

    private void txtNickNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNickNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNickNameActionPerformed

    private void lblAyudaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAyudaMouseReleased
        controller.AyudaLogin = new Ayuda("Espectativas de la contraseña "
                + "\nMínimo de 8 caracteres"
                + "\nTener una mayúscula"
                + "\nMínimo un número");
        standardization.show(controller.AyudaLogin);

    }//GEN-LAST:event_lblAyudaMouseReleased
    
    public boolean camposVacios(){
        if(standardization.campoVacio(txtNickName.getText()) || standardization.campoVacio(txtMail.getText()) )
            return true;
        else
            return false;

    }
    
    //<editor-fold defaultstate="collapsed" desc="compiled code eye">
        
    public void loadEye()
    {
        echoChar = txtPassword.getEchoChar();
        lblEye.setIcon(new controller().changeImage("/imagenes/eye.png", 20, 20));
        lblEyeConfirm.setIcon(new controller().changeImage("/imagenes/eye.png", 20, 20));
    }
    
    public void changeEye(boolean e){
        if(e)
        {
            lblEye.setIcon(new controller().changeImage("/imagenes/eye_.png", 20, 20));
            lblEyeConfirm.setIcon(new controller().changeImage("/imagenes/eye_.png", 20, 20));
        }
        else
        {
            lblEye.setIcon(new controller().changeImage("/imagenes/eye.png", 20, 20));
            lblEyeConfirm.setIcon(new controller().changeImage("/imagenes/eye.png", 20, 20));
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="compiled code">
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bback;
    private javax.swing.JLabel St1;
    private javax.swing.JLabel SubtituloCreateData;
    private javax.swing.JLabel TituloCreateData;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel checkEmail;
    private javax.swing.JLabel checkPass;
    private javax.swing.JLabel checkUsername;
    private javax.swing.JLabel iconEmail;
    private javax.swing.JLabel iconPass;
    private javax.swing.JLabel iconPass2;
    private javax.swing.JLabel iconUsername;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAyuda;
    private javax.swing.JLabel lblEye;
    private javax.swing.JLabel lblEyeConfirm;
    private javax.swing.JSeparator spMail;
    private javax.swing.JSeparator spNickName;
    private javax.swing.JSeparator spPassword;
    private javax.swing.JSeparator spPasswordConfirm;
    private javax.swing.JLabel st2;
    private javax.swing.JLabel st3;
    private javax.swing.JLabel st4;
    private javax.swing.JLabel st5;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNickName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPasswordConfirm;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
