package JPanel;

import java.awt.Color;
import java.awt.Font;
import javaClass.classEvent;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.event;
import javaClass.standardization;


public class showEvent extends javax.swing.JPanel {

    int count;
    int evento;
    
    public showEvent(int e, boolean search) {
        initComponents();
        count = 0;
        evento = e;
        load(e, search);
    }

    void load(int e, boolean search){
        if(!search){
            for(event ev : classEvent.eventos){
                if(ev.getNicknameCreator().equals(classUsuario.getNickname()) ){
                    if(count == e){
                        loadEvent(ev);
                        lblPos.setIcon(new controller().changeImage("/imagenes/owner.png", 25, 25));
                    }
                    count++;
                }
            }
        }else{
            for(event ev : classEvent.eventosSearch){
                if(ev.getNicknameCreator().equals(classUsuario.getNickname()) ){
                    if(count == e){
                        loadEvent(ev);
                        lblPos.setIcon(new controller().changeImage("/imagenes/owner.png", 25, 25));
                    }
                    count++;
                }
            }
        }
        if(lblEventName.getText().length() >= 22){
            lblEventName.setToolTipText(lblEventName.getText());
            lblEventName.setText(lblEventName.getText().substring(0, 22)+"...");       
        }
    }
    
    void loadEvent(event ev){
        lblEventName.setText(ev.getEventName());
        
        if(ev.getVisibility()==0)
            lblVis.setIcon(new controller().changeImage("/imagenes/visibility.png", 25, 25));
        
        lblNickname.setText(ev.getNicknameCreator());
        if(!ev.getPrices().isEmpty()){
            if(ev.getPrices().get(0).getPrice() == 0){
                lblPrice.setText("Gratis");
                lblPrice.setForeground(new Color(65,152,38));
            }
            else
                lblPrice.setText("$"+ev.getPrices().get(0).getPrice());
        }     
        else
            lblPrice.setText("Vacio");
        if(ev.getQuantityTicket() == -1)
            lblNumGuest.setText("Ilimitadas");
        else
            lblNumGuest.setText(ev.getQuantityTicket()+"");
        if(standardization.currentDate().compareTo(standardization.getDate(ev.getStartDateTime())) == 0){
            lblDays.setText("Hoy");
            lblDays.setForeground(Color.red);
            Font f= new Font("Arial", Font.BOLD, 11);
            lblDays.setFont(f);
        }                            
        else{
            if(standardization.numberDays(standardization.currentDate(), standardization.getDate(ev.getStartDateTime())) < 0)
                lblDays.setText("Hace "+(-1*standardization.numberDays(standardization.currentDate(), standardization.getDate(ev.getStartDateTime())))+" días");
            else
                lblDays.setText(standardization.numberDays(standardization.currentDate(), standardization.getDate(ev.getStartDateTime()))+" días");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblEventName = new javax.swing.JLabel();
        lblNickname = new javax.swing.JLabel();
        lblPos = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblNumGuest = new javax.swing.JLabel();
        lblEventName1 = new javax.swing.JLabel();
        lblDays = new javax.swing.JLabel();
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

        lblEventName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblEventName.setText("Not Found");
        lblEventName.setToolTipText("");
        lblEventName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblEventNameMouseReleased(evt);
            }
        });

        lblNickname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNickname.setText("nickName");

        lblPos.setMaximumSize(new java.awt.Dimension(25, 25));
        lblPos.setMinimumSize(new java.awt.Dimension(25, 25));
        lblPos.setPreferredSize(new java.awt.Dimension(25, 25));

        lblPrice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(255, 153, 0));
        lblPrice.setText("$0.00");

        lblNumGuest.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNumGuest.setForeground(new java.awt.Color(51, 51, 255));
        lblNumGuest.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNumGuest.setText("Not found");
        lblNumGuest.setToolTipText("Entradas");

        lblEventName1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblEventName1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEventName1.setText("Entradas disponibles");
        lblEventName1.setToolTipText("");

        lblDays.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblDays.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDays.setText("3 dias");

        lblVis.setMaximumSize(new java.awt.Dimension(25, 25));
        lblVis.setMinimumSize(new java.awt.Dimension(25, 25));
        lblVis.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblVis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblNickname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEventName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEventName1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(lblNumGuest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblDays, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVis, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(lblEventName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEventName1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumGuest)
                    .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(lblNickname, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(lblDays, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        technonizer.TechnoNizer.home.showEvent(evento);
    }//GEN-LAST:event_formMouseReleased

    private void lblEventNameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEventNameMouseReleased
        technonizer.TechnoNizer.home.showEvent(evento);
    }//GEN-LAST:event_lblEventNameMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDays;
    private javax.swing.JLabel lblEventName;
    private javax.swing.JLabel lblEventName1;
    private javax.swing.JLabel lblNickname;
    private javax.swing.JLabel lblNumGuest;
    private javax.swing.JLabel lblPos;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblVis;
    // End of variables declaration//GEN-END:variables
}
