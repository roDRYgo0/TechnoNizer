package eventAdmin;

import java.awt.Color;
import javaClass.classEvent;
import javaClass.controller;

public class task extends javax.swing.JPanel {

    int status;
    
    public task(int idTask, int idEvent) {
        initComponents();
        lblTask.setLineWrap(true);
        iconPrice.setIcon(new controller().changeImage("/imagenes/dollar.png", 30, 30));
        load(idTask);
    }
    
    void load(int id){
        lblTask.setText(classEvent.tasks.get(id).getTask());
        lblNickname.setText(classEvent.tasks.get(id).getNickname());
        if(classEvent.tasks.get(id).getPrice() == 0.0)
            iconPrice.setIcon(null);        
        else
            iconPrice.setText(classEvent.tasks.get(id).getPrice()+"");
        status = classEvent.tasks.get(id).getCondition();
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

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(945, 60));
        setMinimumSize(new java.awt.Dimension(945, 60));
        setPreferredSize(new java.awt.Dimension(945, 60));

        lblTask.setColumns(20);
        lblTask.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblTask.setRows(5);
        lblTask.setText("Las reservaciones de la casa son aqui en ");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTask, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(iconPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSwitchS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTask, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnNext1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSwitchS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(iconPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 9, Short.MAX_VALUE)))
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
    }//GEN-LAST:event_lblSwitchSMouseReleased

    private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ActionPerformed
//        if(classEvent.deleteAct(classEvent.activities.get(idActivity).getId())){
//            classEvent.activities.clear();
//            classEvent.selectActivity(classEvent.eventosShow.get(idEvent).getId());
//            technonizer.TechnoNizer.home.showEventActivities(idEvent);
//            standardization.showMessage("ok", "Eliminado correctamente");
//        }
//        else
//        standardization.showMessage("cancel", "No se logro eliminar");
    }//GEN-LAST:event_btnNext1ActionPerformed

    private void iconPriceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconPriceMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_iconPriceMouseReleased

    void switchStatus(){
        switch(status){
            case 0:
                lblStatus.setText("Sin completar");
                lblStatus.setForeground(new Color(255,61,0));
                lblSwitchS.setIcon(new controller().changeImage("/imagenes/toggleOff.png", 30, 30));
                break;
            case 1:
                lblStatus.setText("Completada");
                lblStatus.setForeground(new Color(139, 195, 74));
                lblSwitchS.setIcon(new controller().changeImage("/imagenes/toggleOn.png", 30, 30));
                break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext1;
    private javax.swing.JLabel iconPrice;
    private javax.swing.JLabel lblNickname;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblSwitchS;
    private javax.swing.JTextArea lblTask;
    // End of variables declaration//GEN-END:variables
}
