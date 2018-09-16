package eventAdmin;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javaClass.classEvent;
import javaClass.controller;
import javaClass.event;
import javaClass.standardization;

public class eventAdmin extends javax.swing.JPanel {

    int idEvent;
    
    public eventAdmin(int idEvent) {
        initComponents();
        this.idEvent = idEvent;
        scrollContainer.getVerticalScrollBar().setUnitIncrement(16);
        
        load(classEvent.eventosShow.get(idEvent));
        
        
    }
    
    void load(event event){
        lblEventName.setText(event.getEventName());     
        lblNickname.setText(event.getNicknameCreator());
        if(event.getProfilePicture() != null)
            lblEventName.setIcon(new controller().changeSizeImage(standardization.getImgIcon(event.getProfilePicture()), 90, 90));
        
        if(event.getCoverPicture()!= null)
            iconCover.setIcon(standardization.getImgIcon(event.getCoverPicture()));
        
        lblDays.setText(standardization.getDateToString(event.getStartDateTime(), standardization.getDate(event.getStartDateTime())));
        
        switch(event.getInvitation()){
            case 1:
                lblInvitation.setText("Público");
                lblInvitation.setIcon(new controller().changeImage("/imagenes/public.png", 17, 17));
                break;
            case 2:
                lblInvitation.setText("Solicitud");
                lblInvitation.setIcon(new controller().changeImage("/imagenes/invite.png", 17, 17));
                break;
            case 3:
                lblInvitation.setText("Por invitación");
                lblInvitation.setIcon(new controller().changeImage("/imagenes/private.png", 17, 17));
                break;
        }
        
        if(event.getVisibility() == 1){
            lblVisibility.setText("Visible");
            lblVisibility.setIcon(new controller().changeImage("/imagenes/visibility.png", 17, 17));
        }else{
            lblVisibility.setText("Invisible");
            lblVisibility.setIcon(new controller().changeImage("/imagenes/eyeClose.png", 17, 17));
        }
        
        if(event.getQuantityTicket() == -1){
            lblCount.setText("Ilimitados");
            lblCount.setIcon(new controller().changeImage("/imagenes/infinity.png", 17, 17));
        }else{
            lblCount.setText(event.getQuantityTicket()+"");
            lblCount.setIcon(new controller().changeImage("/imagenes/hashtag.png", 17, 17));
        }
        
        loadMenu();
        loadPrice(event);
        loadStaff(event);
        loadPlace();
        loadFooter();
    }
    
    void loadMenu(){
        pnContainer.add(new pnMenu(idEvent));
        pnContainer.revalidate();
        pnContainer.repaint();
    }
    
    void loadPrice(event event){
        pnPrice pP = new pnPrice(event, idEvent);
        int size = (event.getPrices().size() <= 3) ? 1 : (event.getPrices().size() -3) * 50;

        pP.setPreferredSize(new Dimension(530,226+size));
        pnContainer.add(pP);

        pnContainer.revalidate();
        pnContainer.repaint();
    }
    
    void loadStaff(event event){     
        pnStaffs pS = new pnStaffs(idEvent);
        int size = 0;
        if(event.getStaffs() != null)
            size = (event.getStaffs().size() <= 1) ? 1 : (event.getStaffs().size() -1) * 50;

        pS.setPreferredSize(new Dimension(405,226));
        pnContainer.add(pS);

        pnContainer.revalidate();
        pnContainer.repaint();
    }
    
    void loadFooter(){       
        pnContainer.add(new pnFooter());

        pnContainer.revalidate();
        pnContainer.repaint();
    }
    
    void loadPlace(){       
        pnContainer.add(new pnPlace(idEvent));

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
        jLabel8 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lblVisibility = new javax.swing.JLabel();
        lblInvitation = new javax.swing.JLabel();
        lblCount = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        iconCover = new javax.swing.JLabel();

        scrollContainer.setBorder(null);

        pnContainer.setBackground(new java.awt.Color(170, 218, 255));
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

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Visibilidad");
        jLabel7.setMaximumSize(new java.awt.Dimension(51, 20));
        jLabel7.setMinimumSize(new java.awt.Dimension(51, 20));
        jLabel7.setPreferredSize(new java.awt.Dimension(51, 20));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Tipo de asistencia");
        jLabel8.setMaximumSize(new java.awt.Dimension(89, 20));
        jLabel8.setMinimumSize(new java.awt.Dimension(89, 20));
        jLabel8.setPreferredSize(new java.awt.Dimension(89, 20));

        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));

        lblVisibility.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblVisibility.setText("Visible");

        lblInvitation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblInvitation.setText("Por invitación");

        lblCount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCount.setText("Por invitación");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Número de entradas disponibles");
        jLabel9.setMaximumSize(new java.awt.Dimension(89, 20));
        jLabel9.setMinimumSize(new java.awt.Dimension(89, 20));
        jLabel9.setPreferredSize(new java.awt.Dimension(89, 20));

        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblInvitation, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(lblVisibility, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblCount, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lblVisibility)
                .addGap(15, 15, 15)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lblInvitation)
                .addGap(15, 15, 15)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lblCount)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnContainer.add(jPanel6);

        iconCover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconCover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/escritorio.jpg"))); // NOI18N
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
        technonizer.TechnoNizer.home.showYourEvents();
    }//GEN-LAST:event_jPanel8MouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconCover;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblCount;
    private javax.swing.JLabel lblDays;
    private javax.swing.JLabel lblEventName;
    private javax.swing.JLabel lblInvitation;
    private javax.swing.JLabel lblNickname;
    private javax.swing.JLabel lblVisibility;
    private javax.swing.JPanel pnContainer;
    private javax.swing.JScrollPane scrollContainer;
    // End of variables declaration//GEN-END:variables
}
