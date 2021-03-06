package JPanel;

import jFrame.Ayuda;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Properties;
import javaClass.authenticator;
import javaClass.classContact;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.standardization;
import static javaClass.standardization.invokeHome;
import properties.propiedades;

public class jpAuthenticator extends javax.swing.JPanel {

    void verificaridioma()
    {
    Properties pr=new propiedades(controller.idioma);
    lblVerifytwofeet.setText(pr.getProperty("lblVerifytwofeet"));
    AuthIndication1.setText(pr.getProperty("AuthIndication1"));
    AuthIndication2.setText(pr.getProperty("AuthIndication2"));
    btnNext.setText(pr.getProperty("btnNextAuthen"));
    }
    
    public jpAuthenticator() {
        initComponents();
        lblGoogle.setIcon(new controller().changeImage("/imagenes/authenticator.png", 40, 40));
        verificaridioma();
        lblAyuda.setIcon(new controller().changeImage("/imagenes/Ayuda.png", 25, 25));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblVerifytwofeet = new javax.swing.JLabel();
        AuthIndication1 = new javax.swing.JLabel();
        AuthIndication2 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        spCode = new javax.swing.JSeparator();
        checkCode = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        lblGoogle = new javax.swing.JLabel();
        progress = new rojerusan.componentes.RSProgressMaterial();
        jLabel5 = new javax.swing.JLabel();
        lblTN = new javax.swing.JLabel();
        lblAyuda = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(420, 603));
        setMinimumSize(new java.awt.Dimension(420, 603));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/confAuthenticaor.png"))); // NOI18N

        lblVerifytwofeet.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        lblVerifytwofeet.setText("Verificación de dos pasos");

        AuthIndication1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        AuthIndication1.setText("Ingrese el codigo de verificación ");

        AuthIndication2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        AuthIndication2.setText("generado por su aplicación móvil.");

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

        checkCode.setMaximumSize(new java.awt.Dimension(25, 25));
        checkCode.setMinimumSize(new java.awt.Dimension(25, 25));
        checkCode.setPreferredSize(new java.awt.Dimension(25, 25));

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

        lblGoogle.setMaximumSize(new java.awt.Dimension(40, 40));
        lblGoogle.setMinimumSize(new java.awt.Dimension(40, 40));
        lblGoogle.setPreferredSize(new java.awt.Dimension(40, 40));

        progress.setForeground(new java.awt.Color(255, 255, 255));
        progress.setAnchoProgress(6);
        progress.setPreferredSize(new java.awt.Dimension(34, 34));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Ingresa tu codigo");

        lblTN.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTN.setText("TechnoNizer");
        lblTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblTNMouseReleased(evt);
            }
        });

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
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spCode)
                                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblVerifytwofeet)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblGoogle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AuthIndication1)
                                    .addComponent(AuthIndication2)))
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblTN)))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lblTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(lblVerifytwofeet)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AuthIndication1)
                        .addGap(0, 0, 0)
                        .addComponent(AuthIndication2))
                    .addComponent(lblGoogle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(spCode, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(progress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodeFocusGained
        spCode.setBackground(Color.red);
        txtCode.setText("");
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
            if(myCode == authenticator.returnCode(classUsuario.getKeygen())){
                checkCode.setIcon(standardization.checkImage(1));
                if(classUsuario.getCondition()==3){
                    jpChoose choose = new jpChoose();

                    choose.setSize(420,603);
                    choose.setLocation(0,0);

                    controller.rootPane.removeAll();
                    controller.rootPane.add(choose,BorderLayout.CENTER);
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
                        invokeHome(true, technonizer.TechnoNizer.log);
                    }      
                } 
            }
            else{
                standardization.showMessage("cancel", "Los codigo no coinciden");
                enable();
            }
        }).start();
    }//GEN-LAST:event_btnNextActionPerformed

    private void lblTNMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTNMouseReleased
        controller.rootPane.removeAll();
        controller.rootPane.add(controller.jpA,BorderLayout.CENTER);
        controller.rootPane.revalidate();
        controller.rootPane.repaint();
        controller.jpA.enable();
    }//GEN-LAST:event_lblTNMouseReleased

    private void lblAyudaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAyudaMouseReleased
        controller.AyudaLogin = new Ayuda("Si por alguna razón no tienes el código del Authenticator, puedes reestablecer la contraseña para poder acceder al sistema");
        standardization.show(controller.AyudaLogin);
    }//GEN-LAST:event_lblAyudaMouseReleased

    public void enable(){
        progress.setForeground(new Color(255,255,255));
        txtCode.setEnabled(true);
        checkCode.setIcon(null);
    }
    
    public void disable(){
        txtCode.setEnabled(false);
        progress.setForeground(new Color(33,150,243));
        checkCode.setIcon(standardization.checkImage(2));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AuthIndication1;
    private javax.swing.JLabel AuthIndication2;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel checkCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblAyuda;
    private javax.swing.JLabel lblGoogle;
    private javax.swing.JLabel lblTN;
    private javax.swing.JLabel lblVerifytwofeet;
    private rojerusan.componentes.RSProgressMaterial progress;
    private javax.swing.JSeparator spCode;
    private javax.swing.JTextField txtCode;
    // End of variables declaration//GEN-END:variables
}
