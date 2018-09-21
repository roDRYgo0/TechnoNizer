package eventOwner;

import java.util.Collections;
import java.util.Comparator;
import java.util.Properties;
import javaClass.activity;
import javaClass.classEvent;
import javaClass.controller;
import javaClass.standardization;
import properties.propiedades;

public class activitys extends javax.swing.JPanel {

    void verificaridioma()
    {
     Properties pr=new propiedades(controller.idioma);
     Activityslbl1.setText(pr.getProperty("Activityslbl1"));
     txtText.setText(pr.getProperty("txtText"));
    }
    
    int days;
    boolean d;
    String date;
    int count;
    int idEvent;
    public activitys(int idEvent) {
        initComponents();
        this.idEvent = idEvent;
        d = true;
        count = 0;
        verificaridioma();
        load();
    }
    
    void load(){            

        Collections.sort(classEvent.activities, new Comparator<activity>(){
            @Override
            public int compare(activity o1, activity o2) {
                return ( (o1.getDateTime().compareTo(o2.getDateTime()) > 0)? 1: (o1.getDateTime().compareTo(o2.getDateTime()) < 0) ? -1 : 0 );
            }
        });

        for(int i = 0; i < classEvent.activities.size(); i++){
            if(!d && days == getDays(classEvent.activities.get(i))){
                if(classEvent.activities.get(i).getCondition() == 1){
                    this.add(new showActivityMenu(i));
                    count++;
                }
            }
            if(getDays(classEvent.activities.get(i)) >= 0 && d){
                days = getDays(classEvent.activities.get(i));
                if(classEvent.activities.get(i).getCondition() == 1){
                    this.add(new showActivityMenu(i));
                    count++;
                }
                d = false;
                asignar(i);
            }
            
        }
        if(count == 4)
            this.add(new more(idEvent, 1));
        this.revalidate();
        this.repaint();
    }
    
    int getDays(activity ac){
            return standardization.numberDays(standardization.currentDate(), standardization.getDate(ac.getDate()));
    }

    void asignar(int i){
        switch(days){
            case 0:
                txtText.setText("Hoy");
                break;
            case 1:
                txtText.setText("Mañana");
                break;
            case 2:
                txtText.setText("Pasado mañana");
                break;
            default:
                txtText.setText(standardization.getDateToString(classEvent.activities.get(i).getDate(),  standardization.getDate(classEvent.activities.get(i).getDate()), false));
                break;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Activityslbl1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        txtText = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(468, 483));
        setMinimumSize(new java.awt.Dimension(468, 483));
        setPreferredSize(new java.awt.Dimension(468, 483));
        setLayout(new javaClass.ModifiedFlowLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(448, 59));
        jPanel1.setMinimumSize(new java.awt.Dimension(448, 59));
        jPanel1.setPreferredSize(new java.awt.Dimension(448, 59));

        Activityslbl1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Activityslbl1.setForeground(new java.awt.Color(255, 0, 0));
        Activityslbl1.setText("Actividades");
        Activityslbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Activityslbl1MouseReleased(evt);
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
                    .addComponent(Activityslbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Activityslbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1);

        jPanel5.setMaximumSize(new java.awt.Dimension(448, 32));
        jPanel5.setMinimumSize(new java.awt.Dimension(448, 32));
        jPanel5.setPreferredSize(new java.awt.Dimension(448, 32));

        txtText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtText.setForeground(new java.awt.Color(153, 153, 153));
        txtText.setText("Sin actividades");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtText, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtText, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel5);
    }// </editor-fold>//GEN-END:initComponents

    private void Activityslbl1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Activityslbl1MouseReleased
        technonizer.TechnoNizer.home.pnEvent();
    }//GEN-LAST:event_Activityslbl1MouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Activityslbl1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel txtText;
    // End of variables declaration//GEN-END:variables
}
