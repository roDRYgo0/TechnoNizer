package eventAdmin;

import java.awt.Color;
import javaClass.classEvent;
import javaClass.controller;
import javaClass.standardization;

public class taskMenu extends javax.swing.JPanel {

    int status;
    int idTask;
    int idEvent;
    
    public taskMenu(int idTask, int idEvent) {
        initComponents();
        lblTask.setLineWrap(true);
        this.idTask = idTask;
        this.idEvent = idEvent;
        load();
    }
    
    void load(){
        lblTask.setText(classEvent.tasks.get(idTask).getTask());
        status = classEvent.tasks.get(idTask).getCondition();
        switchStatus();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTask = new javax.swing.JTextArea();
        lblStatus = new javax.swing.JLabel();
        lblSwitchS = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(448, 32));
        setMinimumSize(new java.awt.Dimension(448, 32));
        setPreferredSize(new java.awt.Dimension(448, 32));

        lblTask.setColumns(20);
        lblTask.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTask, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSwitchS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblSwitchS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblStatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTask, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1, Short.MAX_VALUE))
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
        if(classEvent.updateTask(classEvent.tasks.get(idTask).getId(), status)){
            new Thread(()->{
                technonizer.TechnoNizer.home.showLoad();
                technonizer.TechnoNizer.home.showEvent(idEvent, true);
                standardization.showMessage("ok", "Exito al actualizar");
            }).start();
        }else
        standardization.showMessage("cancel", "No se logro actualizar");
    }//GEN-LAST:event_lblSwitchSMouseReleased

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
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblSwitchS;
    private javax.swing.JTextArea lblTask;
    // End of variables declaration//GEN-END:variables
}
