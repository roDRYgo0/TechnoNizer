package eventOwner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javaClass.activity;
import javaClass.classEvent;
import javaClass.controller;
import javaClass.event;
import javaClass.standardization;

public class pnActivity extends javax.swing.JPanel {

    int idEvent;
    byte[] image, imageCover;
    int days;
    
    public pnActivity(int idEvent) {
        initComponents();
        this.idEvent = idEvent;  
        scrollContainer.getVerticalScrollBar().setUnitIncrement(16);
        
        load(classEvent.eventosShow.get(idEvent));
        check();
    }

    void check(){
        switch(classEvent.position){
            case 1:
                break;
            case 2:
                btnNext1.setVisible(false);
                break;
        }
    }
    
    void load(event event){            
        
        
        Collections.sort(classEvent.activities, new Comparator<activity>(){
            @Override
            public int compare(activity o1, activity o2) {
                return ( (o1.getDateTime().compareTo(o2.getDateTime()) > 0)? 1: (o1.getDateTime().compareTo(o2.getDateTime()) < 0) ? -1 : 0 );
            }
        });

        for(int i = 0; i < classEvent.activities.size(); i++){
            if(i == 0){
                days = getDays(classEvent.activities.get(i));
                asignar(i);
                pnContainer.add(new showActivity(i, idEvent));
            }else{
                if(days == getDays(classEvent.activities.get(i))){
                    pnContainer.add(new showActivity(i, idEvent));
                }else{
                    days = getDays(classEvent.activities.get(i));
                    asignar(i);
                    pnContainer.add(new showActivity(i, idEvent));
                }
            }
        }
        
        pnContainer.revalidate();
        pnContainer.repaint();
    }
    
    void asignar(int i){
        switch(days){
            case -2:
                pnContainer.add(new Text("Antier"));
                break;
            case -1:
                pnContainer.add(new Text("Ayer"));
                break;
            case 0:
                pnContainer.add(new Text("Hoy"));
                break;
            case 1:
                pnContainer.add(new Text("Mañana"));
                break;
            case 2:
                pnContainer.add(new Text("Pasado mañana"));
                break;
            default:
                pnContainer.add(new Text(standardization.getDateToString(classEvent.activities.get(i).getDate(),  standardization.getDate(classEvent.activities.get(i).getDate()), false)));
                break;
        }
    }
    
    int getDays(activity ac){
            return standardization.numberDays(standardization.currentDate(), standardization.getDate(ac.getDate()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollContainer = new javax.swing.JScrollPane();
        pnContainer = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnNext1 = new javax.swing.JButton();

        scrollContainer.setBorder(null);
        scrollContainer.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollContainer.setToolTipText("");

        pnContainer.setBackground(new java.awt.Color(204, 204, 204));
        javaClass.ModifiedFlowLayout modifiedFlowLayout1 = new javaClass.ModifiedFlowLayout();
        modifiedFlowLayout1.setAlignment(java.awt.FlowLayout.LEFT);
        modifiedFlowLayout1.setHgap(10);
        modifiedFlowLayout1.setAlignOnBaseline(true);
        pnContainer.setLayout(modifiedFlowLayout1);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setMaximumSize(new java.awt.Dimension(945, 90));
        jPanel8.setMinimumSize(new java.awt.Dimension(945, 90));
        jPanel8.setPreferredSize(new java.awt.Dimension(945, 90));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel8MouseReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Actividades");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        btnNext1.setBackground(new java.awt.Color(0, 153, 255));
        btnNext1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext1.setForeground(new java.awt.Color(255, 255, 255));
        btnNext1.setText("Agregar");
        btnNext1.setBorderPainted(false);
        btnNext1.setFocusable(false);
        btnNext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 409, Short.MAX_VALUE)
                .addComponent(btnNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pnContainer.add(jPanel8);

        scrollContainer.setViewportView(pnContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrollContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseReleased
        new Thread(()->{
            technonizer.TechnoNizer.home.showLoad();
            technonizer.TechnoNizer.home.showEventOwner(idEvent, false);
        }).start();
    }//GEN-LAST:event_jPanel8MouseReleased

    private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ActionPerformed
        AddActivitie activitie = new AddActivitie(idEvent);
        standardization.show(activitie);
        controller.rootFrame = activitie;
    }//GEN-LAST:event_btnNext1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel pnContainer;
    private javax.swing.JScrollPane scrollContainer;
    // End of variables declaration//GEN-END:variables
}
