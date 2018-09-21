package eventOwner;

import JPanel.*;
import eventOwner.*;
import java.awt.Dimension;
import java.util.Objects;
import javaClass.classEvent;
import javaClass.classPersonalE;
import javaClass.controller;
import javaClass.event;
import javaClass.eventp;
import javaClass.standardization;

public class eventAdminP extends javax.swing.JPanel {

    int idEvent;
    
    public eventAdminP(int idEvent, boolean load) {
        initComponents();
        this.idEvent = idEvent;
        scrollContainer.getVerticalScrollBar().setUnitIncrement(16);
        load(classPersonalE.eventosShow.get(idEvent), load);
        loadPlace();
        
    }
    
    public void load(eventp event, boolean load){
        if(load){
            
        }
        
        
        lblEventName.setText(event.getTitle());     
        lblNickname.setText(event.getNickname());
        lblNo.setText(event.getNote());
        
        lblDays.setText(standardization.getDateToString(event.getDstart(), standardization.getDate(event.getDstart()), false));
    }
        
//        switch(event.getInvitation()){
//            case 1:
//                lblInvitation.setText("Público");
//                lblInvitation.setIcon(new controller().changeImage("/imagenes/public.png", 17, 17));
//                break;
//            case 2:
//                lblInvitation.setText("Solicitud");
//                lblInvitation.setIcon(new controller().changeImage("/imagenes/invite.png", 17, 17));
//                break;
//            case 3:
//                lblInvitation.setText("Por invitación");
//                lblInvitation.setIcon(new controller().changeImage("/imagenes/private.png", 17, 17));
//                break;
//        }
        
       
    
    
    void loadFooter(){       
        pnContainer.add(new footer());

        pnContainer.revalidate();
        pnContainer.repaint();
    }
    
    void loadPlace(){       
        pnContainer.add(new placeMenuE(idEvent));

        pnContainer.revalidate();
        pnContainer.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollContainer = new javax.swing.JScrollPane();
        pnContainer = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lblEventName = new javax.swing.JLabel();
        lblNickname = new javax.swing.JLabel();
        lblDays = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblNo = new javax.swing.JTextPane();
        iconCover = new javax.swing.JLabel();

        scrollContainer.setBorder(null);

        pnContainer.setBackground(new java.awt.Color(204, 204, 204));
        javaClass.ModifiedFlowLayout modifiedFlowLayout1 = new javaClass.ModifiedFlowLayout();
        modifiedFlowLayout1.setAlignment(java.awt.FlowLayout.LEFT);
        modifiedFlowLayout1.setHgap(10);
        pnContainer.setLayout(modifiedFlowLayout1);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setMaximumSize(new java.awt.Dimension(945, 131));
        jPanel8.setMinimumSize(new java.awt.Dimension(945, 131));
        jPanel8.setPreferredSize(new java.awt.Dimension(945, 118));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel8MouseReleased(evt);
            }
        });

        lblEventName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblEventName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/profile.png"))); // NOI18N
        lblEventName.setText("not found");

        lblNickname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNickname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNickname.setText("not found");

        lblDays.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDays.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDays.setText("not found");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEventName, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNickname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDays, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(lblEventName, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDays, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pnContainer.add(jPanel8);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMaximumSize(new java.awt.Dimension(304, 189));
        jPanel6.setMinimumSize(new java.awt.Dimension(304, 189));
        jPanel6.setPreferredSize(new java.awt.Dimension(304, 189));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Nota");
        jLabel7.setMaximumSize(new java.awt.Dimension(51, 20));
        jLabel7.setMinimumSize(new java.awt.Dimension(51, 20));
        jLabel7.setPreferredSize(new java.awt.Dimension(51, 20));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));

        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        lblNo.setBorder(null);
        lblNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNo.setAutoscrolls(false);
        lblNo.setFocusable(false);
        jScrollPane1.setViewportView(lblNo);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pnContainer.add(jPanel6);

        iconCover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconCover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/evento.jpg"))); // NOI18N
        iconCover.setMaximumSize(new java.awt.Dimension(631, 189));
        iconCover.setMinimumSize(new java.awt.Dimension(631, 189));
        iconCover.setPreferredSize(new java.awt.Dimension(631, 189));
        pnContainer.add(iconCover);

        scrollContainer.setViewportView(pnContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrollContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseReleased
       technonizer.TechnoNizer.home.showYourEventsP(false);
                    controller.rootFrame = technonizer.TechnoNizer.home;
    }//GEN-LAST:event_jPanel8MouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconCover;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblDays;
    private javax.swing.JLabel lblEventName;
    private javax.swing.JLabel lblNickname;
    private javax.swing.JTextPane lblNo;
    private javax.swing.JPanel pnContainer;
    private javax.swing.JScrollPane scrollContainer;
    // End of variables declaration//GEN-END:variables
}
