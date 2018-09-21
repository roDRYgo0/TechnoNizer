package eventOwner;

import java.util.Properties;
import javaClass.classEvent;
import javaClass.controller;
import properties.propiedades;

public class announcementMenu extends javax.swing.JPanel {

    void verificaridioma()
    {
    Properties pr=new propiedades(controller.idioma);
    lblAnnouncementMenu1.setText(pr.getProperty("lblAnnouncementMenu1"));
    }
    
    int idEvent;
    
    public announcementMenu(int idEvent) {
        initComponents();
        this.idEvent = idEvent;
        verificaridioma();
        load();
    }
    
    void load(){
        
        for(int i = 0; i < classEvent.announcements.size(); i++){
            if(classEvent.announcements.get(i).getCondition() == 1){
                this.add(new showAnnouncementMenu(i, idEvent));
            }
        }
        
        this.revalidate();
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAnnouncementMenu1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(945, 100));
        setMinimumSize(new java.awt.Dimension(945, 100));
        setPreferredSize(new java.awt.Dimension(945, 100));
        javaClass.ModifiedFlowLayout modifiedFlowLayout1 = new javaClass.ModifiedFlowLayout();
        modifiedFlowLayout1.setAlignment(java.awt.FlowLayout.LEFT);
        setLayout(modifiedFlowLayout1);

        jPanel1.setMaximumSize(new java.awt.Dimension(955, 62));
        jPanel1.setMinimumSize(new java.awt.Dimension(955, 62));
        jPanel1.setPreferredSize(new java.awt.Dimension(955, 62));

        lblAnnouncementMenu1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAnnouncementMenu1.setForeground(new java.awt.Color(255, 0, 0));
        lblAnnouncementMenu1.setText("Anuncios");
        lblAnnouncementMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblAnnouncementMenu1MouseReleased(evt);
            }
        });

        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAnnouncementMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAnnouncementMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void lblAnnouncementMenu1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnnouncementMenu1MouseReleased
        technonizer.TechnoNizer.home.pnEvent();
    }//GEN-LAST:event_lblAnnouncementMenu1MouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblAnnouncementMenu1;
    // End of variables declaration//GEN-END:variables
}
