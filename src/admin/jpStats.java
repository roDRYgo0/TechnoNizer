package admin;

import jFrame.FrmParametrosUser;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaClass.classUsuario;
import javaClass.connection;
import javaClass.controller;
import javaClass.standardization;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import properties.propiedades;

/**@author rodri */

public class jpStats extends javax.swing.JPanel {

    void verificaridioma()
    {
     Properties pr=new propiedades(controller.idioma);
     lbljpStats1.setText(pr.getProperty("lbljpStats1"));
     lbljpStats2.setText(pr.getProperty("lbljpStats2"));
     lbljpStats3.setText(pr.getProperty("lbljpStats3"));
     lbljpStats4.setText(pr.getProperty("lbljpStats4"));
     lbljpStats5.setText(pr.getProperty("lbljpStats5"));
     lbljpStats6.setText(pr.getProperty("lbljpStats6"));
     lblDes.setText(pr.getProperty("lblDes"));
     lblAVer.setText(pr.getProperty("lblAVer"));
     lblVer.setText(pr.getProperty("lblVer"));
     lblAdm.setText(pr.getProperty("lblAdm"));
    }
    
    boolean action;
    
    public jpStats() {
        initComponents();
        action = true;
        switch(classUsuario.getCondition()){
            case 0:
                lblDes.setEnabled(false);
                break;
            case 1:
                lblAVer.setEnabled(false);
                break;
            case 2:
                lblVer.setEnabled(false);
                break;
            case 3:
                lblAdm.setEnabled(false);
                break;
        }
        verificaridioma();
        loadImage();
    }
    
    void loadImage(){
        lblDes.setIcon(new controller().changeImage("/imagenes/cancel.png", 45, 45));
        lblAVer.setIcon(new controller().changeImage("/imagenes/verified.png", 45, 45));
        lblVer.setIcon(new controller().changeImage("/imagenes/ok.png", 45, 45));
        lblAdm.setIcon(new controller().changeImage("/imagenes/services.png", 45, 45));
    }
    
    public void enable(){
        lblDes.setEnabled(true);
        lblAVer.setEnabled(true);
        lblVer.setEnabled(true);
        lblAdm.setEnabled(true);
    }
    
    void condition(int n){
        
        if(action){
            new Thread(()->{
                boolean status = false;
                switch(n){
                    case 0:
                        enable();
                        lblDes.setEnabled(false);
                        classUsuario.setCondition(0);
                        status = classUsuario.updateCondition(true);
                        break;
                    case 1:
                        enable();
                        lblAVer.setEnabled(false);
                        classUsuario.setCondition(1);
                        status = classUsuario.updateCondition(true);
                        break;
                    case 2:
                        enable();
                        lblVer.setEnabled(false);
                        classUsuario.setCondition(2);
                        status = classUsuario.updateCondition(true);
                        break;
                    case 3:
                        enable();
                        lblAdm.setEnabled(false);
                        classUsuario.setCondition(3);
                        status = classUsuario.updateCondition(true);
                        break;
                }
                if(status){
                    standardization.showMessage("ok", "Se actualizo correctamente");
                }else{
                    standardization.showMessage("cancel", "No se logro actualizar");
                }
                action = true;
            }).start();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbljpStats1 = new javax.swing.JLabel();
        lbljpStats2 = new javax.swing.JLabel();
        txtDateTime = new javax.swing.JTextField();
        spDateTime = new javax.swing.JSeparator();
        txtDateTime1 = new javax.swing.JTextField();
        lbljpStats3 = new javax.swing.JLabel();
        spDateTime1 = new javax.swing.JSeparator();
        lbljpStats4 = new javax.swing.JLabel();
        txtDateTime2 = new javax.swing.JTextField();
        spDateTime2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        lbljpStats5 = new javax.swing.JLabel();
        lbljpStats6 = new javax.swing.JLabel();
        lblDes = new javax.swing.JLabel();
        lblAVer = new javax.swing.JLabel();
        lblVer = new javax.swing.JLabel();
        lblAdm = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(445, 465));
        setMinimumSize(new java.awt.Dimension(445, 465));

        lbljpStats1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbljpStats1.setText("Estadísticas");

        lbljpStats2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbljpStats2.setForeground(new java.awt.Color(102, 102, 102));
        lbljpStats2.setText("Fecha y hora de registro");

        txtDateTime.setAutoscrolls(false);
        txtDateTime.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtDateTime.setFocusable(false);
        txtDateTime.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDateTimeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDateTimeFocusLost(evt);
            }
        });
        txtDateTime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDateTimeKeyTyped(evt);
            }
        });

        spDateTime.setForeground(new java.awt.Color(204, 204, 204));

        txtDateTime1.setAutoscrolls(false);
        txtDateTime1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtDateTime1.setFocusable(false);
        txtDateTime1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDateTime1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDateTime1FocusLost(evt);
            }
        });
        txtDateTime1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDateTime1KeyTyped(evt);
            }
        });

        lbljpStats3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbljpStats3.setForeground(new java.awt.Color(102, 102, 102));
        lbljpStats3.setText("Número de inicios de sesión");

        spDateTime1.setForeground(new java.awt.Color(204, 204, 204));

        lbljpStats4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbljpStats4.setForeground(new java.awt.Color(102, 102, 102));
        lbljpStats4.setText("Número de eventos");

        txtDateTime2.setAutoscrolls(false);
        txtDateTime2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtDateTime2.setFocusable(false);
        txtDateTime2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDateTime2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDateTime2FocusLost(evt);
            }
        });
        txtDateTime2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDateTime2KeyTyped(evt);
            }
        });

        spDateTime2.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/report.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel1MouseReleased(evt);
            }
        });

        lbljpStats5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbljpStats5.setForeground(new java.awt.Color(33, 150, 243));
        lbljpStats5.setText("Generar reporte");

        lbljpStats6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbljpStats6.setForeground(new java.awt.Color(33, 150, 243));
        lbljpStats6.setText("Condición");

        lblDes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDes.setText("Deshabilitado");
        lblDes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblDesMouseReleased(evt);
            }
        });

        lblAVer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAVer.setText("A verificar");
        lblAVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblAVerMouseReleased(evt);
            }
        });

        lblVer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblVer.setText("Verificado");
        lblVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblVerMouseReleased(evt);
            }
        });

        lblAdm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAdm.setText("Administrador");
        lblAdm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblAdmMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbljpStats1)
                                .addComponent(txtDateTime)
                                .addComponent(spDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbljpStats2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtDateTime1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbljpStats3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(spDateTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(spDateTime2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDateTime2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbljpStats4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbljpStats5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDes, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbljpStats6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAVer, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVer, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbljpStats1)
                .addGap(28, 28, 28)
                .addComponent(lbljpStats2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(spDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbljpStats3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDateTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(spDateTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbljpStats4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDateTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(spDateTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbljpStats5)
                    .addComponent(lbljpStats6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAVer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDateTimeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDateTimeFocusGained
        spDateTime.setBackground(Color.red);
    }//GEN-LAST:event_txtDateTimeFocusGained

    private void txtDateTimeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDateTimeFocusLost
        spDateTime.setBackground(Color.white);
    }//GEN-LAST:event_txtDateTimeFocusLost

    private void txtDateTimeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateTimeKeyTyped
        char c = evt.getKeyChar();
        if(txtDateTime.getText().contains(" ") && c==' ')
        evt.consume();
    }//GEN-LAST:event_txtDateTimeKeyTyped

    //<editor-fold defaultstate="collapsed" desc="comment">
    

    private void txtDateTime1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDateTime1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateTime1FocusGained

    private void txtDateTime1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDateTime1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateTime1FocusLost

    private void txtDateTime1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateTime1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateTime1KeyTyped

    private void txtDateTime2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDateTime2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateTime2FocusGained

    private void txtDateTime2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDateTime2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateTime2FocusLost

    private void txtDateTime2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateTime2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateTime2KeyTyped
//</editor-fold>
    
    private void lblDesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDesMouseReleased
        if(classUsuario.getCondition() != 0){
            condition(0);
            action = false;
        }
    }//GEN-LAST:event_lblDesMouseReleased

    private void lblAVerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAVerMouseReleased
        if(classUsuario.getCondition() != 1){
            condition(1);
            action = false;
        }
    }//GEN-LAST:event_lblAVerMouseReleased

    private void lblVerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVerMouseReleased
        if(classUsuario.getCondition() != 2){
            condition(2);
            action = false;
        }
    }//GEN-LAST:event_lblVerMouseReleased

    private void lblAdmMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdmMouseReleased
        if(classUsuario.getCondition() != 3){
            condition(3);
            action = false;
        }
    }//GEN-LAST:event_lblAdmMouseReleased

    private void jLabel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseReleased
         String path="";
        try{
            
            Map parametros = new HashMap();
             parametros.put("Usuario",String.format(classUsuario.getNickname()));
            InputStream xD = FrmParametrosUser.class.getResourceAsStream("/Reports/UserInfo.jasper");
            JasperReport jr=(JasperReport)JRLoader.loadObject(xD);
            Connection cn= new connection().getConnection();
            JasperPrint print =JasperFillManager.fillReport(jr,parametros,cn);
            JasperViewer view = new JasperViewer(print,false);
            view.setTitle("Reporte Usuario");
            view.setVisible(true);
            
        }catch(Exception e){
            Logger.getLogger(JPanel.jpHome.class.getName()).log(Level.SEVERE, null, e);
        }  
    }//GEN-LAST:event_jLabel1MouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAVer;
    private javax.swing.JLabel lblAdm;
    private javax.swing.JLabel lblDes;
    private javax.swing.JLabel lblVer;
    private javax.swing.JLabel lbljpStats1;
    private javax.swing.JLabel lbljpStats2;
    private javax.swing.JLabel lbljpStats3;
    private javax.swing.JLabel lbljpStats4;
    private javax.swing.JLabel lbljpStats5;
    private javax.swing.JLabel lbljpStats6;
    private javax.swing.JSeparator spDateTime;
    private javax.swing.JSeparator spDateTime1;
    private javax.swing.JSeparator spDateTime2;
    private javax.swing.JTextField txtDateTime;
    private javax.swing.JTextField txtDateTime1;
    private javax.swing.JTextField txtDateTime2;
    // End of variables declaration//GEN-END:variables
}
