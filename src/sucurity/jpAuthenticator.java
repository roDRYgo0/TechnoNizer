package sucurity;

import java.awt.Color;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.standardization;
import static technonizer.TechnoNizer.home;

public class jpAuthenticator extends javax.swing.JPanel {

    public jpAuthenticator() {
        initComponents();
        load();
        loadImage();
    }
    
    void load(){
        enable();
        switch(classUsuario.getCheckKeygen()){
            case 0:
                lblStatus.setText("Deshabilitado");
                lblStatus.setForeground(Color.red);
                btnStatus.setText("Habilitar");
                break;
            case 1:
                lblStatus.setText("Habilitado");
                lblStatus.setForeground(Color.green);
                btnStatus.setText("Deshabilitar");
                break;
        }
    }
    
    void loadImage(){
        lblAuthenticator.setIcon(new controller().changeImage("/imagenes/authenticator.png", 80, 80));
        lblTrash.setIcon(new controller().changeImage("/imagenes/trash.png", 40, 40));
        lblRefresh.setIcon(new controller().changeImage("/imagenes/refresh.png", 40, 40));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAuthenticator = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnStatus = new javax.swing.JButton();
        lblTrash = new javax.swing.JLabel();
        lblRefresh = new javax.swing.JLabel();
        btnChange = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        checkChange = new javax.swing.JLabel();
        checkStatus = new javax.swing.JLabel();
        checkDelete = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));
        setMaximumSize(new java.awt.Dimension(445, 465));
        setMinimumSize(new java.awt.Dimension(445, 465));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("App del Autenticador");

        lblStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(0, 255, 0));
        lblStatus.setText("Habilitado");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Acciones");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        btnStatus.setBackground(new java.awt.Color(33, 150, 243));
        btnStatus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnStatus.setForeground(new java.awt.Color(255, 255, 255));
        btnStatus.setText("Deshabilitar");
        btnStatus.setBorderPainted(false);
        btnStatus.setFocusable(false);
        btnStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusActionPerformed(evt);
            }
        });

        btnChange.setBackground(new java.awt.Color(255, 255, 255));
        btnChange.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnChange.setForeground(new java.awt.Color(33, 150, 243));
        btnChange.setText("Cambiar");
        btnChange.setBorderPainted(false);
        btnChange.setFocusable(false);
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(33, 150, 243));
        btnDelete.setText("Eliminar");
        btnDelete.setBorderPainted(false);
        btnDelete.setFocusable(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        checkChange.setMaximumSize(new java.awt.Dimension(25, 25));
        checkChange.setMinimumSize(new java.awt.Dimension(25, 25));
        checkChange.setPreferredSize(new java.awt.Dimension(25, 25));

        checkStatus.setMaximumSize(new java.awt.Dimension(25, 25));
        checkStatus.setMinimumSize(new java.awt.Dimension(25, 25));
        checkStatus.setPreferredSize(new java.awt.Dimension(25, 25));

        checkDelete.setMaximumSize(new java.awt.Dimension(25, 25));
        checkDelete.setMinimumSize(new java.awt.Dimension(25, 25));
        checkDelete.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTrash, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAuthenticator, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblStatus))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAuthenticator, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblStatus)))
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(checkStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblTrash, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusActionPerformed
        disable();
        checkStatus.setIcon(standardization.checkImage(2));
        new Thread(()->{
            switch(classUsuario.getCheckKeygen()){
                case 0:
                    classUsuario.changeCheckKeygen(1);
                    home.pnSecurity();
                    controller.jpSe.authenticator();
                    break;
                case 1:
                    classUsuario.changeCheckKeygen(0);
                    home.pnSecurity();
                    controller.jpSe.authenticator();
                    break;
            }
        }).start();
    }//GEN-LAST:event_btnStatusActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        controller.jpSe.newAuthenticator();
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       checkDelete.setIcon(standardization.checkImage(2));
       disable();
       new Thread(()->{
           if(classUsuario.deleteKeygen()){
               standardization.showMessage("ok", "Se elimino correctamente");
               home.pnSecurity();
               controller.jpSe.newAuthenticator();
           }else{
               standardization.showMessage("cancle", "No se pudo eliminar");
               enable();
           }
       }).start();
    }//GEN-LAST:event_btnDeleteActionPerformed

    
    public void enable(){
        btnStatus.setEnabled(true);
        btnDelete.setEnabled(true);
        btnChange.setEnabled(true);
        checkStatus.setIcon(null);
        checkDelete.setIcon(null);
        checkChange.setIcon(null);
    }
    
    public void disable(){
        btnStatus.setEnabled(false);
        btnDelete.setEnabled(false);
        btnChange.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnStatus;
    private javax.swing.JLabel checkChange;
    private javax.swing.JLabel checkDelete;
    private javax.swing.JLabel checkStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAuthenticator;
    private javax.swing.JLabel lblRefresh;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTrash;
    // End of variables declaration//GEN-END:variables
}
