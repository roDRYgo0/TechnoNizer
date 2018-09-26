package JPanel;


import jFrame.AddEventInfoP;
import java.awt.Color;
import java.awt.Font;
import java.util.Properties;
import javaClass.classEvent;
import javaClass.classPersonalE;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.event;
import javaClass.eventp;
import javaClass.staff;
import javaClass.standardization;
import javax.swing.JOptionPane;
import properties.propiedades;


public class showEventP extends javax.swing.JPanel {

    Properties pr= new propiedades(controller.idioma);
    int count;
    int eventp;
    int position;
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
            lblVis.setIcon(new controller().changeImage("/imagenes/Trash.png", 25, 25));
            lblVis1.setIcon(new controller().changeImage("/imagenes/eye.png", 25, 25));
        
        lblNickname.setText(ev.getNickname());
        lblNumGuest.setText(ev.getDend());
        lblDays.setText(ev.getDstart());
         lblId.setText(ev.getId().toString());
        
        if(ev.getNickname().equals(classUsuario.getNickname()))
            lblPos.setIcon(new controller().changeImage("/imagenes/owner.png", 25, 25));
       
        
        if(standardization.currentDate().compareTo(standardization.getDate(ev.getDstart())) == 0){
            lblDays.setText(pr.getProperty("TodayEvent"));
            lblDays.setForeground(Color.red);
            Font f= new Font("Arial", Font.BOLD, 11);
            lblDays.setFont(f);
        }                            
        else{
            if(standardization.numberDays(standardization.currentDate(), standardization.getDate(ev.getDstart())) < 0)
                lblDays.setText(pr.getProperty("HaceEvent")+" "+(-1*standardization.numberDays(standardization.currentDate(), standardization.getDate(ev.getDstart())))+" "+pr.getProperty("DaysEventCreate"));
            else
                lblDays.setText(standardization.numberDays(standardization.currentDate(), standardization.getDate(ev.getDstart()))+" "+pr.getProperty("DaysEventCreate"));
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
        lblId = new javax.swing.JLabel();
        lblVis1 = new javax.swing.JLabel();

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

        lblNickname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNickname.setText("nickName");
        lblNickname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblNicknameMouseReleased(evt);
            }
        });

        lblNumGuest.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNumGuest.setForeground(new java.awt.Color(51, 51, 255));
        lblNumGuest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnColorLayout.createSequentialGroup()
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
        lblPos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblPosMouseReleased(evt);
            }
        });

        lblVis.setMaximumSize(new java.awt.Dimension(25, 25));
        lblVis.setMinimumSize(new java.awt.Dimension(25, 25));
        lblVis.setPreferredSize(new java.awt.Dimension(25, 25));
        lblVis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblVisMouseReleased(evt);
            }
        });

        lblId.setForeground(new java.awt.Color(240, 240, 240));

        lblVis1.setMaximumSize(new java.awt.Dimension(25, 25));
        lblVis1.setMinimumSize(new java.awt.Dimension(25, 25));
        lblVis1.setPreferredSize(new java.awt.Dimension(25, 25));
        lblVis1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblVis1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblDays, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVis1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblVis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNumGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(lblNumGuest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDays, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVis1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVis, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
       
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

    private void lblVisMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVisMouseReleased
         classPersonalE.setId(Integer.parseInt(lblId.getText()));
        int eliminar = JOptionPane.showConfirmDialog(this, "Esta seguro que desea eliminar?",
            "Atencion" , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ;
        if(eliminar == 0) {
            if (classPersonalE.deletePersonal()) {{
                classPersonalE.deletePersonal();
                classPersonalE.restart();
           classPersonalE.select();               
                    technonizer.TechnoNizer.home.showYourEventsP(false);
                    controller.rootFrame = technonizer.TechnoNizer.home;
                standardization.showMessage("Ok", "Recordatorio Eliminado", technonizer.TechnoNizer.home);
            }
        }else{
            standardization.showMessage("cancel", "Error eliminando", technonizer.TechnoNizer.home);

                   
        }
        }
    }//GEN-LAST:event_lblVisMouseReleased

    private void lblNumGuestMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNumGuestMouseReleased
        //showEvent();

    }//GEN-LAST:event_lblNumGuestMouseReleased

    private void lblVis1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVis1MouseReleased
        showEvent();
    }//GEN-LAST:event_lblVis1MouseReleased

    private void lblPosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPosMouseReleased
        controller.addEventPer = new AddEventInfoP();
        standardization.show(controller.addEventPer);
        controller.rootFrame = controller.addEventPer;
    }//GEN-LAST:event_lblPosMouseReleased

    void showEvent(){
        new Thread(()->{
            technonizer.TechnoNizer.home.showLoad();

                switch(position){
                case 1:
                    
                    break;
                default:
                    
                    technonizer.TechnoNizer.home.showEventPP(eventp, true);
                    break;
                }
        }).start();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDays;
    private javax.swing.JLabel lblEventName;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNickname;
    private javax.swing.JLabel lblNumGuest;
    private javax.swing.JLabel lblPos;
    private javax.swing.JLabel lblVis;
    private javax.swing.JLabel lblVis1;
    private javax.swing.JPanel pnColor;
    // End of variables declaration//GEN-END:variables
}
