package eventOwner;

import java.awt.Color;
import java.util.Properties;
import javaClass.classEvent;
import javaClass.controller;
import javaClass.standardization;
import properties.propiedades;

public class showTask extends javax.swing.JPanel {

    Properties pr= new propiedades(controller.idioma);
    
    void verificaridioma()
    {
        btnNext1.setText(pr.getProperty("btnNext1DeleteTask"));
    }
    
    int status;
    int idTask;
    int idEvent;
    
    public showTask(int idTask, int idEvent) {
        initComponents();
        lblTask.setLineWrap(true);
        this.idTask = idTask;
        this.idEvent = idEvent;
        iconPrice.setIcon(new controller().changeImage("/imagenes/dollar.png", 30, 30));
        load(idTask);
        if(classEvent.position == 2)
            btnNext1.setVisible(false);
        verificaridioma();
    }
    
    void load(int id){
        lblTask.setText(classEvent.evento.getTasks().get(id).getTask());
        lblNickname.setText(classEvent.evento.getTasks().get(id).getNickname());
        if(classEvent.evento.getTasks().get(id).getPrice() == 0.0)
            iconPrice.setIcon(null);        
        else
            iconPrice.setText("$"+classEvent.evento.getTasks().get(id).getPrice());
        status = classEvent.evento.getTasks().get(id).getCondition();
        switchStatus();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTask = new javax.swing.JTextArea();
        lblStatus = new javax.swing.JLabel();
        lblSwitchS = new javax.swing.JLabel();
        btnNext1 = new javax.swing.JButton();
        lblNickname = new javax.swing.JLabel();
        iconPrice = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(945, 60));
        setMinimumSize(new java.awt.Dimension(945, 60));
        setPreferredSize(new java.awt.Dimension(945, 60));

        lblTask.setColumns(20);
        lblTask.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblTask.setRows(5);
        lblTask.setText("Las reservaciones de la casa son aqui en ");
        lblTask.setFocusable(false);

        lblStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStatus.setText("Activo");

        lblSwitchS.setMaximumSize(new java.awt.Dimension(30, 30));
        lblSwitchS.setMinimumSize(new java.awt.Dimension(30, 30));
        lblSwitchS.setPreferredSize(new java.awt.Dimension(30, 30));
        lblSwitchS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSwitchSMouseReleased(evt);
            }
        });

        btnNext1.setBackground(new java.awt.Color(255, 0, 0));
        btnNext1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext1.setForeground(new java.awt.Color(255, 255, 255));
        btnNext1.setText("Eliminar");
        btnNext1.setBorderPainted(false);
        btnNext1.setFocusable(false);
        btnNext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext1ActionPerformed(evt);
            }
        });

        lblNickname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNickname.setForeground(new java.awt.Color(153, 153, 153));
        lblNickname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNickname.setText("nickname");

        iconPrice.setMaximumSize(new java.awt.Dimension(30, 30));
        iconPrice.setMinimumSize(new java.awt.Dimension(30, 30));
        iconPrice.setPreferredSize(new java.awt.Dimension(30, 30));
        iconPrice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                iconPriceMouseReleased(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTask, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(iconPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSwitchS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNext1, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTask, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(iconPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNext1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 1, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblSwitchS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNickname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblSwitchSMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSwitchSMouseReleased
        if(status == 0){
            status = 1;
            switchStatus();
        }else{
            status = 0;
            switchStatus();
        }
        if(classEvent.updateTask(classEvent.evento.getTasks().get(idTask).getId(), status)){
            new Thread(()->{
                    technonizer.TechnoNizer.home.showLoad();
                    technonizer.TechnoNizer.home.showEventTaskOwner(idEvent);
                    standardization.showMessage("ok", "Exito al actualizar");
                }).start();
        }else
            standardization.showMessage("cancel", "No se logro actualizar");
    }//GEN-LAST:event_lblSwitchSMouseReleased

    private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ActionPerformed
        if(classEvent.deleteTask(classEvent.evento.getTasks().get(idTask).getId())){
            new Thread(()->{
                    technonizer.TechnoNizer.home.showLoad();
                    technonizer.TechnoNizer.home.showEventTaskOwner(idEvent);
                    standardization.showMessage("ok", "Exito al eliminar");
                }).start();
        }else
            standardization.showMessage("cancel", "No se logro eliminar");
    }//GEN-LAST:event_btnNext1ActionPerformed

    private void iconPriceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconPriceMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_iconPriceMouseReleased

    void switchStatus(){
        switch(status){
            case 0:
                lblStatus.setText(pr.getProperty("IncompleteTask"));
                lblStatus.setForeground(new Color(255,61,0));
                lblSwitchS.setIcon(new controller().changeImage("/imagenes/toggleOff.png", 30, 30));
                break;
            case 1:
                lblStatus.setText(pr.getProperty("Completetask"));
                lblStatus.setForeground(new Color(139, 195, 74));
                lblSwitchS.setIcon(new controller().changeImage("/imagenes/toggleOn.png", 30, 30));
                break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext1;
    private javax.swing.JLabel iconPrice;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNickname;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblSwitchS;
    private javax.swing.JTextArea lblTask;
    // End of variables declaration//GEN-END:variables
}
