package JPanel;

import com.barcodelib.barcode.*;
import com.warrenstrange.googleauth.GoogleAuthenticator;
import com.warrenstrange.googleauth.GoogleAuthenticatorKey;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javaClass.standardization;

public class jpAuthenticator extends javax.swing.JPanel {

    String keygen;
    
    int udm = 0, resol = 72, rot = 0;
    float mi=0.000f, md = 0.000f, ms = 0.00f, min = 0.000f, tam = 5.000f;
    
    public jpAuthenticator() {
        initComponents();
        keygen = "";
        
    }
    
    void load(){
        String path = System.getProperty("user.home") + "/qrcodeDemo.gif"; ;
        File ruta = new File(path);
        try{
            byte[] icono = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(icono);
            System.out.println(icono);
            image.setIcon(standardization.getImgIcon(icono));
        }catch(IOException ex){
            System.out.println("hello");
        }
    }
    
    public void generarQR(){
        try{
            QRCode c = new QRCode();
            String s = "otpauth://totp/Technonizer:dev.rodrig@gmail.com?secret="+keygen+"&issuer=Technonizer&algorithm=SHA1&digits=6&period=30";
            System.out.println(s);
            
            c.setData("otpauth://totp/Technonizer:dev.rodrig@gmail.com?secret="+keygen+"&issuer=TechnoNizer&algorithm=SHA1&digits=6&period=30");
            c.setDataMode(QRCode.MODE_BYTE);
            c.setUOM(udm);
            c.setLeftMargin(mi);
            c.setRightMargin(md);
            c.setTopMargin(ms);
            c.setBottomMargin(min);
            c.setResolution(resol);
            c.setRotate(rot);
            c.setModuleSize(tam);
            
            String archivo = System.getProperty("user.home") + "/qrcodeDemo.gif"; 
            c.renderBarcode(archivo); 
            load();
            
        }catch(Exception ex){
        
    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        llave = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(llave)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 195, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(llave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GoogleAuthenticator gAuth = new GoogleAuthenticator();
        final GoogleAuthenticatorKey key = gAuth.createCredentials();
        keygen = key.getKey();      
        generarQR();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.out.println(secret(keygen));
        GoogleAuthenticator gAuth = new GoogleAuthenticator();
        int code = gAuth.getTotpPassword(keygen);
        System.out.println(code);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.out.println(secret(keygen));
        GoogleAuthenticator gAuth = new GoogleAuthenticator();
        int code = gAuth.getTotpPassword(keygen);
        if(code== Integer.parseInt(llave.getText()))
            System.out.println("execelente prro");
        else
            System.out.println("malo");
    }//GEN-LAST:event_jButton3ActionPerformed

    int secret(String secretKey){
        GoogleAuthenticator gAuth = new GoogleAuthenticator();
        int code = gAuth.getTotpPassword(secretKey);
        return code;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JTextField llave;
    // End of variables declaration//GEN-END:variables
}
