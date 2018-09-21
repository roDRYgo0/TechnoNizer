package JPanel;

import eventAdmin.*;
import java.awt.Color;
import java.awt.Font;
import javaClass.classEvent;
import javaClass.classPersonalE;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.event;
import javaClass.eventp;
import javaClass.staff;
import javaClass.standardization;


public class showEventP extends javax.swing.JPanel {

    int count;
    int eventp;
    
    public showEventP(int e) {
        initComponents();
        count = 0;
        eventp = e;
        load(e);
    }

    void load(int e){
        loadEvent(classPersonalE.eventosShow.get(e));
        if(lblEventName.getText().length() >= 22){
            lblEventName.setToolTipText(lblEventName.getText());
            lblEventName.setText(lblEventName.getText().substring(0, 22)+"...");       
        }
    }
    
    void loadEvent(eventp ev){
        lblEventName.setText(ev.getTitle());
        
        if(ev.getColor() != null){
            String[] color = ev.getColor().split(" ");
            pnColor.setBackground(new Color(Integer.parseInt(color[0]), Integer.parseInt(color[1]), Integer.parseInt(color[2])));
        }
        else
            pnColor.setBackground(new Color(35, 150, 243));
            lblVis.setIcon(new controller().changeImage("/imagenes/eyeCLose.png", 25, 25));
        
        lblNickname.setText(ev.getNickname());
        
        if(ev.getNickname().equals(classUsuario.getNickname()))
            lblPos.setIcon(new controller().changeImage("/imagenes/owner.png", 25, 25));
       
        
        if(standardization.currentDate().compareTo(standardization.getDate(ev.getDstart())) == 0){
            lblDays.setText("Hoy");
            lblDays.setForeground(Color.red);
            Font f= new Font("Arial", Font.BOLD, 11);
            lblDays.setFont(f);
        }                            
        else{
            if(standardization.numberDays(standardization.currentDate(), standardization.getDate(ev.getDstart())) < 0)
                lblDays.setText("Hace "+(-1*standardization.numberDays(standardization.currentDate(), standardization.getDate(ev.getDstart())))+" días");
            else
                lblDays.setText(standardization.numberDays(standardization.currentDate(), standardization.getDate(ev.getDstart()))+" días");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNickname = new javax.swing.JLabel();
        lblNumGuest = new javax.swing.JLabel();
        lblDays = new javax.swing.JLabel();
        pnColor = new javax.swing.JPanel();
        lblEventName = new javax.swing.JLabel();
        lblPos = new javax.swing.JLabel();
        lblVis = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setMaximumSize(new java.awt.Dimension(190, 120));
        setMinimumSize(new java.awt.Dimension(190, 120));
        setPreferredSize(new java.awt.Dimension(190, 120));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        lblNickname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNickname.setText("nickName");
        lblNickname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblNicknameMouseReleased(evt);
            }
        });

        lblNumGuest.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNumGuest.setForeground(new java.awt.Color(51, 51, 255));
        lblNumGuest.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNumGuest.setText("Not found");
        lblNumGuest.setToolTipText("Entradas");
        lblNumGuest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblNumGuestMouseReleased(evt);
            }
        });

        lblDays.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblDays.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDays.setText("3 dias");
        lblDays.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblDaysMouseReleased(evt);
            }
        });

        pnColor.setBackground(new java.awt.Color(33, 150, 243));
        pnColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnColorMouseReleased(evt);
            }
        });

        lblEventName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblEventName.setForeground(new java.awt.Color(255, 255, 255));
        lblEventName.setText("Not Found");
        lblEventName.setToolTipText("");
        lblEventName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblEventNameMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnColorLayout = new javax.swing.GroupLayout(pnColor);
        pnColor.setLayout(pnColorLayout);
        pnColorLayout.setHorizontalGroup(
            pnColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnColorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEventName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnColorLayout.setVerticalGroup(
            pnColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEventName, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        lblPos.setMaximumSize(new java.awt.Dimension(25, 25));
        lblPos.setMinimumSize(new java.awt.Dimension(25, 25));
        lblPos.setPreferredSize(new java.awt.Dimension(25, 25));

        lblVis.setMaximumSize(new java.awt.Dimension(25, 25));
        lblVis.setMinimumSize(new java.awt.Dimension(25, 25));
        lblVis.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNickname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblNumGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblDays, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(lblVis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblNumGuest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDays, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVis, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
       // showEventP();
    }//GEN-LAST:event_formMouseReleased

    private void lblEventNameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEventNameMouseReleased
        //showEvent();
    }//GEN-LAST:event_lblEventNameMouseReleased

    private void lblNicknameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNicknameMouseReleased
        //showEvent();
    }//GEN-LAST:event_lblNicknameMouseReleased

    private void lblDaysMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDaysMouseReleased
        //showEvent();
    }//GEN-LAST:event_lblDaysMouseReleased

    private void pnColorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnColorMouseReleased
        //showEvent();
    }//GEN-LAST:event_pnColorMouseReleased

    private void lblNumGuestMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNumGuestMouseReleased
        //showEvent();
        
    }//GEN-LAST:event_lblNumGuestMouseReleased

    //void showEvent(){
      //  new Thread(()->{
        //    technonizer.TechnoNizer.home.showLoad();
          //  technonizer.TechnoNizer.home.showEvent(evento, true);
        //}).start();

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDays;
    private javax.swing.JLabel lblEventName;
    private javax.swing.JLabel lblNickname;
    private javax.swing.JLabel lblNumGuest;
    private javax.swing.JLabel lblPos;
    private javax.swing.JLabel lblVis;
    private javax.swing.JPanel pnColor;
    // End of variables declaration//GEN-END:variables
}
