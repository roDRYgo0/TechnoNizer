package admin;

import java.awt.Color;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.standardization;

/**@author rodri */

public class jpStats extends javax.swing.JPanel {

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

        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDateTime = new javax.swing.JTextField();
        spDateTime = new javax.swing.JSeparator();
        txtDateTime1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        spDateTime1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txtDateTime2 = new javax.swing.JTextField();
        spDateTime2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblDes = new javax.swing.JLabel();
        lblAVer = new javax.swing.JLabel();
        lblVer = new javax.swing.JLabel();
        lblAdm = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(445, 465));
        setMinimumSize(new java.awt.Dimension(445, 465));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Estadísticas");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Fecha y hora de registro");

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

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Número de inicios de sesión");

        spDateTime1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Número de eventos");

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

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(33, 150, 243));
        jLabel10.setText("Generar reporte");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(33, 150, 243));
        jLabel11.setText("Condición");

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
                                .addComponent(jLabel2)
                                .addComponent(jLabel7)
                                .addComponent(txtDateTime)
                                .addComponent(spDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtDateTime1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(spDateTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(spDateTime2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDateTime2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDes, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAVer, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVer, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(spDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDateTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(spDateTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDateTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(spDateTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAVer;
    private javax.swing.JLabel lblAdm;
    private javax.swing.JLabel lblDes;
    private javax.swing.JLabel lblVer;
    private javax.swing.JSeparator spDateTime;
    private javax.swing.JSeparator spDateTime1;
    private javax.swing.JSeparator spDateTime2;
    private javax.swing.JTextField txtDateTime;
    private javax.swing.JTextField txtDateTime1;
    private javax.swing.JTextField txtDateTime2;
    // End of variables declaration//GEN-END:variables
}