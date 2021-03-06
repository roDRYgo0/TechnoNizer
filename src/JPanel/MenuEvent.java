package JPanel;

import java.awt.Color;
import java.util.Properties;
import javaClass.controller;
import properties.propiedades;


/**
 *
 * @author Alexg
 */

public class MenuEvent extends javax.swing.JPanel {
    
    void verificaridioma()
    {
     Properties pr = new propiedades (controller.idioma);
     Evenlbl.setText(pr.getProperty("Evenlbl"));
     lbleventsall.setText(pr.getProperty("lbleventsall"));
     adminlblevents1.setText(pr.getProperty("adminlblevents1"));
     adminlblevents2.setText(pr.getProperty("adminlblevents2"));
     lblmyevents.setText(pr.getProperty("lblmyevents"));
    }
    
    public MenuEvent() {
        initComponents();
        
//        imagen.setIcon(new controller().changeImage("/imagenes/user.png", 30, 30));
//        iconEmail.setIcon(new controller().changeImage("/imagenes/email.png", 30, 30));
        verificaridioma();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Evenlbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        lbleventsall = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        adminlblevents1 = new javax.swing.JLabel();
        adminlblevents2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblmyevents = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(980, 601));
        setMinimumSize(new java.awt.Dimension(980, 601));

        Evenlbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Evenlbl.setForeground(new java.awt.Color(255, 0, 0));
        Evenlbl.setText("Eventos");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(33, 150, 243));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        lbleventsall.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbleventsall.setForeground(new java.awt.Color(255, 255, 255));
        lbleventsall.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbleventsall.setText("Todos los eventos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbleventsall, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lbleventsall)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(33, 150, 243));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel2MouseReleased(evt);
            }
        });

        adminlblevents1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adminlblevents1.setForeground(new java.awt.Color(255, 255, 255));
        adminlblevents1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminlblevents1.setText("Administar");

        adminlblevents2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adminlblevents2.setForeground(new java.awt.Color(255, 255, 255));
        adminlblevents2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminlblevents2.setText("eventos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminlblevents1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(adminlblevents2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(adminlblevents1)
                .addGap(0, 0, 0)
                .addComponent(adminlblevents2)
                .addGap(61, 61, 61))
        );

        jPanel3.setBackground(new java.awt.Color(33, 150, 243));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel3MouseReleased(evt);
            }
        });

        lblmyevents.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblmyevents.setForeground(new java.awt.Color(255, 255, 255));
        lblmyevents.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmyevents.setText("Mis eventos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblmyevents, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblmyevents)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(Evenlbl))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(Evenlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(196, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseReleased
        technonizer.TechnoNizer.home.showYourEvents(false);
    }//GEN-LAST:event_jPanel2MouseReleased

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        technonizer.TechnoNizer.home.showAllEvents(false);
    }//GEN-LAST:event_jPanel1MouseReleased

    private void jPanel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseReleased
        technonizer.TechnoNizer.home.showGuestEvents(false);
    }//GEN-LAST:event_jPanel3MouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Evenlbl;
    private javax.swing.JLabel adminlblevents1;
    private javax.swing.JLabel adminlblevents2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbleventsall;
    private javax.swing.JLabel lblmyevents;
    // End of variables declaration//GEN-END:variables
}
