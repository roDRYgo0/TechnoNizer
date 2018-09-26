package eventOwner;

import java.awt.Color;
import java.util.Properties;
import javaClass.classEvent;
import javaClass.controller;
import javaClass.standardization;
import properties.propiedades;

public class showAnnouncement extends javax.swing.JPanel {

    void verificaridioma()
    {
    Properties pr= new propiedades(controller.idioma);
    lblShowAnnouncement1.setText(pr.getProperty("lblShowAnnouncement1"));
    lblShowAnnouncement2.setText(pr.getProperty("lblShowAnnouncement2"));
    btnNext.setText(pr.getProperty("btnNextShoAnnoun"));
    }
    
    int visibility;
    int idAnnoun, idEvent;
    
    public showAnnouncement(int idAnnoun, int idEvent) {
        initComponents();
        this.idAnnoun = idAnnoun;
        this.idEvent = idEvent;
        txtDescription.setText(classEvent.evento.getAnnouncements().get(idAnnoun).getAnnouncement());
        visibility = classEvent.evento.getAnnouncements().get(idAnnoun).getCondition();
        if(classEvent.position == 3)
            panel.setVisible(false);
        switchVisibility();
        verificaridioma();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblShowAnnouncement1 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextArea();
        panel = new javax.swing.JPanel();
        btnNext = new javax.swing.JButton();
        lblSwitch = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblShowAnnouncement2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(311, 32767));
        setMinimumSize(new java.awt.Dimension(311, 0));
        setPreferredSize(new java.awt.Dimension(311, 163));

        lblShowAnnouncement1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblShowAnnouncement1.setForeground(new java.awt.Color(102, 102, 102));
        lblShowAnnouncement1.setText("Anuncio");

        txtDescription.setRows(2);
        txtDescription.setAutoscrolls(false);
        txtDescription.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtDescription.setFocusable(false);
        txtDescription.setMaximumSize(new java.awt.Dimension(508, 2147483647));
        txtDescription.setMinimumSize(new java.awt.Dimension(436, 60));
        txtDescription.setPreferredSize(new java.awt.Dimension(436, 60));
        txtDescription.setVerifyInputWhenFocusTarget(false);
        txtDescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescriptionKeyReleased(evt);
            }
        });

        panel.setBackground(new java.awt.Color(255, 255, 255));

        btnNext.setBackground(new java.awt.Color(255, 0, 0));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Borrar");
        btnNext.setBorderPainted(false);
        btnNext.setFocusable(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        lblSwitch.setMaximumSize(new java.awt.Dimension(30, 30));
        lblSwitch.setMinimumSize(new java.awt.Dimension(30, 30));
        lblSwitch.setPreferredSize(new java.awt.Dimension(30, 30));
        lblSwitch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSwitchMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSwitchMouseReleased(evt);
            }
        });

        lblStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStatus.setText("Activo");

        lblShowAnnouncement2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblShowAnnouncement2.setForeground(new java.awt.Color(102, 102, 102));
        lblShowAnnouncement2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblShowAnnouncement2.setText("Visibilidad");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblShowAnnouncement2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(lblShowAnnouncement2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSwitch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblShowAnnouncement1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtDescription, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblShowAnnouncement1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescriptionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescriptionKeyReleased

    }//GEN-LAST:event_txtDescriptionKeyReleased

    private void lblSwitchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSwitchMouseReleased
        if(visibility == 0){
            visibility = 1;
            switchVisibility();
        }else{
            visibility = 0;
            switchVisibility();
        }
        if(classEvent.updateAnnouncement(visibility, classEvent.evento.getAnnouncements().get(idAnnoun).getId()))
            standardization.showMessage("ok","Anuncio actualizado");
        else
            standardization.showMessage("cancel","Anuncio no actualizado");
    }//GEN-LAST:event_lblSwitchMouseReleased

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if(!txtDescription.getText().trim().isEmpty()){
            if(classEvent.deleteAnnouncement(classEvent.evento.getAnnouncements().get(idAnnoun).getId())){
                classEvent.selectActivity(classEvent.eventosShow.get(idEvent).getId());
                technonizer.TechnoNizer.home.showEventAnnoucementsOwner(idEvent);
                controller.rootFrame = technonizer.TechnoNizer.home;
                standardization.showMessage("ok","Anuncio borrado");
            }else
                standardization.showMessage("cancel","Anuncio no borrado");
        }

    }//GEN-LAST:event_btnNextActionPerformed

    private void lblSwitchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSwitchMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblSwitchMousePressed

void switchVisibility(){
        switch(visibility){
            case 0:
                lblStatus.setText("Invisible");
                lblStatus.setForeground(new Color(255,61,0));
                lblSwitch.setIcon(new controller().changeImage("/imagenes/toggleOff.png", 30, 30));
                break;
            case 1:
                lblStatus.setText("Visible");
                lblStatus.setForeground(new Color(139, 195, 74));
                lblSwitch.setIcon(new controller().changeImage("/imagenes/toggleOn.png", 30, 30));
                break;
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel lblShowAnnouncement1;
    private javax.swing.JLabel lblShowAnnouncement2;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblSwitch;
    private javax.swing.JPanel panel;
    private javax.swing.JTextArea txtDescription;
    // End of variables declaration//GEN-END:variables
}
