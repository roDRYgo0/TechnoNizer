package JPanel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javaClass.authenticator;
import javaClass.controller;
import static javaClass.controller.jpSe;
import javaClass.standardization;
import properties.propiedades;

public class jpConfAuthenticator extends javax.swing.JPanel {

    String keygen;
    
    void verificaridioma()
    {
    Properties pr = new propiedades (controller.idioma);
    lblConfigAuthenticator.setText(pr.getProperty("lblConfigAuthenticator"));
    indication1Authenticator.setText(pr.getProperty("indication1Authenticator"));
    indicator2Authenticator.setText(pr.getProperty("indicator2Authenticator"));
    option1Authenticator.setText(pr.getProperty("option1Authenticator"));
    indication3Authenticator.setText(pr.getProperty("indication3Authenticator"));
    Option2Authenticator.setText(pr.getProperty("Option2Authenticator"));
    btnNext.setText(pr.getProperty("btnNextAuthenticator"));
    }
    
    int udm = 0, resol = 72, rot = 0;
    float mi=0.000f, md = 0.000f, ms = 0.00f, min = 0.000f, tam = 5.000f;

    public jpConfAuthenticator() {
        initComponents();
        loadImage();
        loadQR();
        verificaridioma();
    }
    
    void loadImage(){
        lblAuthenticator.setIcon(new controller().changeImage("/imagenes/authenticator.png", 80, 80));
    }
    
    void loadQR(){
        keygen = authenticator.createCredentials();
        authenticator.generateQR(keygen);
        String path = System.getProperty("user.home") + "/otpauth.png";
        File ruta = new File(path);
        try{
            byte[] icono = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(icono);
            lblQR.setIcon(new controller().changeSizeImage(standardization.getImgIcon(icono), 140, 140));
        }catch(IOException ex){
            standardization.showMessage("error", "No se encontro la imagen");
        }
    }

    //<editor-fold defaultstate="collapsed" desc="compiled code">
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblQR = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblAuthenticator = new javax.swing.JLabel();
        lblConfigAuthenticator = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        indication1Authenticator = new javax.swing.JLabel();
        indicator2Authenticator = new javax.swing.JLabel();
        option1Authenticator = new javax.swing.JLabel();
        indication3Authenticator = new javax.swing.JLabel();
        Option2Authenticator = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();

        setBackground(new java.awt.Color(245, 245, 245));
        setMaximumSize(new java.awt.Dimension(445, 465));
        setMinimumSize(new java.awt.Dimension(445, 465));
        setPreferredSize(new java.awt.Dimension(445, 465));

        jPanel1.setBackground(new java.awt.Color(33, 150, 243));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(lblAuthenticator, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAuthenticator, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblConfigAuthenticator.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblConfigAuthenticator.setText("Configura el Authenticador");

        indication1Authenticator.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        indication1Authenticator.setText("• Descarga la app del Authenticador en tu celular");

        indicator2Authenticator.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        indicator2Authenticator.setText("• En la app, selecciona");

        option1Authenticator.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        option1Authenticator.setText("Configurar cuenta");

        indication3Authenticator.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        indication3Authenticator.setText("• Selecciona ");

        Option2Authenticator.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Option2Authenticator.setText("Escanear código QR");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(indication1Authenticator)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(indicator2Authenticator)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(option1Authenticator))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(indication3Authenticator)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Option2Authenticator))))
                                .addComponent(lblConfigAuthenticator))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(305, 305, 305)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(134, 134, 134)
                                    .addComponent(lblQR, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 130, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblQR, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblConfigAuthenticator)
                .addGap(11, 11, 11)
                .addComponent(indication1Authenticator)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicator2Authenticator)
                    .addComponent(option1Authenticator))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indication3Authenticator)
                    .addComponent(Option2Authenticator))
                .addGap(32, 32, 32)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2))
        );
    }// </editor-fold>//GEN-END:initComponents
    //</editor-fold>
    
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        jpSe.endAuthenticator(keygen);
    }//GEN-LAST:event_btnNextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Option2Authenticator;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel indication1Authenticator;
    private javax.swing.JLabel indication3Authenticator;
    private javax.swing.JLabel indicator2Authenticator;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAuthenticator;
    private javax.swing.JLabel lblConfigAuthenticator;
    private javax.swing.JLabel lblQR;
    private javax.swing.JLabel option1Authenticator;
    // End of variables declaration//GEN-END:variables
}
