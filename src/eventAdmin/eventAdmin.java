package eventAdmin;

import java.awt.Dimension;
import java.util.Objects;
import javaClass.classEvent;
import javaClass.controller;
import javaClass.event;
import javaClass.standardization;

public class eventAdmin extends javax.swing.JPanel {

    int idEvent;
    
    public eventAdmin(int idEvent, boolean load) {
        initComponents();
        this.idEvent = idEvent;
        scrollContainer.getVerticalScrollBar().setUnitIncrement(16);
        load(classEvent.eventosShow.get(idEvent), load);
        
        
    }
    
    public void load(event event, boolean load){
        if(load){
            classEvent.activities.clear();
            classEvent.selectActivity(event.getId());
            classEvent.tasks.clear();
            classEvent.selectTasks(event.getId());
            classEvent.selectProblems(event.getId());
        }
        
        lblLost.setIcon(new controller().changeImage("/imagenes/decrease.png", 22, 22));
        lblLost.setText("$"+lost());
        lblIncome.setIcon(new controller().changeImage("/imagenes/increase.png", 22, 22));
        lblIncome.setText("$"+income());
        
        lblGain.setText("$"+(income()-lost()));
        
        lblEventName.setText(event.getEventName());     
        lblNickname.setText(event.getNicknameCreator());
        if(event.getProfilePicture() != null)
            lblEventName.setIcon(new controller().changeSizeImage(standardization.getImgIcon(event.getProfilePicture()), 90, 90));
        
        if(event.getCoverPicture()!= null)
            iconCover.setIcon(standardization.getImgIcon(event.getCoverPicture()));
        
        lblDays.setText(standardization.getDateToString(event.getStartDateTime(), standardization.getDate(event.getStartDateTime()), false));
        
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
        
        if(event.getVisibility() == 1){
            lblVisibility.setText("Visible");
            lblVisibility.setIcon(new controller().changeImage("/imagenes/visibility.png", 17, 17));
        }else{
            lblVisibility.setText("Invisible");
            lblVisibility.setIcon(new controller().changeImage("/imagenes/eyeClose.png", 17, 17));
        }

        loadMenu();
        loadPrice(event);
        loadStaff(event);
        loadActivity();
        loadTask();
        loadPlace();
        loadFooter();
    }
    
    double lost(){
        double lost = 0.0;
        for(int i = 0; i < classEvent.tasks.size(); i++){
            if(classEvent.tasks.get(i).getCondition()==1){
                lost+=classEvent.tasks.get(i).getPrice();
            }
        }
        return lost;
    }
    
    double income(){
        double income = 0.0;
        for(int i = 0; i < classEvent.eventosShow.get(idEvent).getGuests().size(); i++){
            
            for(int e = 0; e < classEvent.eventosShow.get(idEvent).getPrices().size(); e++){
                if(Objects.equals(classEvent.eventosShow.get(idEvent).getPrices().get(e).getId(), classEvent.eventosShow.get(idEvent).getGuests().get(i).getIdTickets())){
                    income+=classEvent.eventosShow.get(idEvent).getPrices().get(e).getPrice();
                }
                
            }
            
        }
        return income;
    }
    
    void loadMenu(){
        pnContainer.add(new menu(idEvent));
        pnContainer.revalidate();
        pnContainer.repaint();
    }
    
    void loadActivity(){
        pnContainer.add(new activitys(idEvent));
        pnContainer.revalidate();
        pnContainer.repaint();
    }
    
    void loadTask(){
        pnContainer.add(new task(idEvent));
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
        staffMenu pS = new staffMenu(idEvent);
        int size = 0;
        if(event.getStaffs() != null)
            size = (event.getStaffs().size() <= 1) ? 1 : (event.getStaffs().size() -1) * 50;

        pS.setPreferredSize(new Dimension(405,226));
        pnContainer.add(pS);

        pnContainer.revalidate();
        pnContainer.repaint();
    }
    
    void loadFooter(){       
        pnContainer.add(new footer());

        pnContainer.revalidate();
        pnContainer.repaint();
    }
    
    void loadPlace(){       
        pnContainer.add(new placeMenu(idEvent));

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
        lblVisibility = new javax.swing.JLabel();
        lblLost = new javax.swing.JLabel();
        Gastos = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lblIncome = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        Gastos1 = new javax.swing.JLabel();
        Gastos2 = new javax.swing.JLabel();
        lblGain = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
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

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Visibilidad");
        jLabel7.setMaximumSize(new java.awt.Dimension(51, 20));
        jLabel7.setMinimumSize(new java.awt.Dimension(51, 20));
        jLabel7.setPreferredSize(new java.awt.Dimension(51, 20));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));

        lblVisibility.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblVisibility.setText("Visible");

        lblLost.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lblLost.setForeground(new java.awt.Color(255, 0, 0));
        lblLost.setText("$213");

        Gastos.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Gastos.setForeground(new java.awt.Color(153, 153, 153));
        Gastos.setText("Perdida");
        Gastos.setMaximumSize(new java.awt.Dimension(51, 20));
        Gastos.setMinimumSize(new java.awt.Dimension(51, 20));
        Gastos.setPreferredSize(new java.awt.Dimension(51, 20));

        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));

        lblIncome.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lblIncome.setForeground(new java.awt.Color(51, 204, 0));
        lblIncome.setText("$0.0");
        lblIncome.setMaximumSize(new java.awt.Dimension(36, 22));
        lblIncome.setMinimumSize(new java.awt.Dimension(36, 22));
        lblIncome.setPreferredSize(new java.awt.Dimension(36, 22));

        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));

        Gastos1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Gastos1.setForeground(new java.awt.Color(153, 153, 153));
        Gastos1.setText("Ingresos");
        Gastos1.setMaximumSize(new java.awt.Dimension(51, 20));
        Gastos1.setMinimumSize(new java.awt.Dimension(51, 20));
        Gastos1.setPreferredSize(new java.awt.Dimension(51, 20));

        Gastos2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Gastos2.setForeground(new java.awt.Color(153, 153, 153));
        Gastos2.setText("Ganancia");
        Gastos2.setMaximumSize(new java.awt.Dimension(51, 20));
        Gastos2.setMinimumSize(new java.awt.Dimension(51, 20));
        Gastos2.setPreferredSize(new java.awt.Dimension(51, 20));

        lblGain.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lblGain.setText("$0.0");
        lblGain.setMaximumSize(new java.awt.Dimension(36, 22));
        lblGain.setMinimumSize(new java.awt.Dimension(36, 22));
        lblGain.setPreferredSize(new java.awt.Dimension(36, 22));

        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));

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
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblVisibility, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblLost, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(Gastos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(Gastos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblGain, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(Gastos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Gastos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(lblIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(lblVisibility)
                        .addGap(18, 18, 18)
                        .addComponent(Gastos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(lblLost, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Gastos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lblGain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
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
    private javax.swing.JLabel Gastos;
    private javax.swing.JLabel Gastos1;
    private javax.swing.JLabel Gastos2;
    private javax.swing.JLabel iconCover;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblDays;
    private javax.swing.JLabel lblEventName;
    private javax.swing.JLabel lblGain;
    private javax.swing.JLabel lblIncome;
    private javax.swing.JLabel lblLost;
    private javax.swing.JLabel lblNickname;
    private javax.swing.JLabel lblVisibility;
    private javax.swing.JPanel pnContainer;
    private javax.swing.JScrollPane scrollContainer;
    // End of variables declaration//GEN-END:variables
}
