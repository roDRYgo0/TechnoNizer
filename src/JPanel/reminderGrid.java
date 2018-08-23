package JPanel;

import admin.*;
import java.awt.Color;
import javaClass.classAdmin;
import javaClass.classReminder;
import javaClass.controller;
import javaClass.standardization;

/** @author rodri*/

public class reminderGrid extends javax.swing.JPanel {

    int reminder;
    boolean search;
    
    public reminderGrid(int n, boolean search) {
        initComponents();
        reminder = n;
        this.search = search;
        load(n, search);
    }
    
    void load(int n, boolean search){
        if(search){
            if(classReminder.remindersSearch.get(n).getImage() != null)
            lblImage.setIcon(standardization.getImgIcon(classReminder.remindersSearch.get(n).getImage(), 60, 60));
            else
                lblImage.setIcon(new controller().changeImage("/imagenes/user.png", 60, 60));
            lblFirstName.setText(classReminder.remindersSearch.get(n).getFirstName());
            lblLastName.setText(classReminder.remindersSearch.get(n).getLastName());
            lblNickname.setText(classReminder.remindersSearch.get(n).getNickname());
            lblReminder.setText(classReminder.remindersSearch.get(n).getReminder());
            lblDate.setText(classReminder.remindersSearch.get(n).getDate());
            
            switch(classReminder.remindersSearch.get(n).getCondition()){
                 case 0:
                    this.setBackground(new Color(198, 198, 198));
                    break;
                case 1:
                    this.setBackground(new Color(255, 199, 199));
                    break;
                case 2:
                    this.setBackground(new Color(255, 255, 255));
                    break;
                case 3:
                    this.setBackground(new Color(255, 244, 193));
                    break;
            }
            

        }else{
            if(classReminder.reminders.get(n).getImage() != null)
            lblImage.setIcon(standardization.getImgIcon(classReminder.reminders.get(n).getImage(), 60, 60));
            else
                lblImage.setIcon(new controller().changeImage("/imagenes/user.png", 60, 60));
            lblFirstName.setText(classReminder.reminders.get(n).getFirstName());
            lblLastName.setText(classReminder.reminders.get(n).getLastName());
            lblNickname.setText(classReminder.reminders.get(n).getNickname());
            lblReminder.setText(classReminder.reminders.get(n).getReminder());
            lblDate.setText(classReminder.reminders.get(n).getDate());
            
            switch(classReminder.reminders.get(n).getCondition()){
                case 0:
                    this.setBackground(new Color(198, 198, 198));
                    break;
                case 1:
                    this.setBackground(new Color(255, 199, 199));
                    break;
                case 2:
                    this.setBackground(new Color(255, 255, 255));
                    break;
                case 3:
                    this.setBackground(new Color(255, 244, 193));
                    break;
            }
            

        }
        
    }
    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDate = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        lblNickname = new javax.swing.JLabel();
        lblReminder = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        iconMail = new javax.swing.JLabel();
        iconMem = new javax.swing.JLabel();
        iconDuration = new javax.swing.JLabel();

        setBackground(new java.awt.Color(253, 199, 199));
        setMaximumSize(new java.awt.Dimension(465, 140));
        setMinimumSize(new java.awt.Dimension(465, 140));
        setPreferredSize(new java.awt.Dimension(465, 140));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDate.setText("Not found");

        lblImage.setMaximumSize(new java.awt.Dimension(60, 60));
        lblImage.setMinimumSize(new java.awt.Dimension(60, 60));
        lblImage.setPreferredSize(new java.awt.Dimension(60, 60));

        lblNickname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNickname.setText("Not found");

        lblReminder.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblReminder.setText("Not found");

        lblFirstName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFirstName.setText("Not found");

        lblLastName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLastName.setText("Not found");

        iconMail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        iconMail.setMaximumSize(new java.awt.Dimension(25, 25));
        iconMail.setMinimumSize(new java.awt.Dimension(25, 25));
        iconMail.setPreferredSize(new java.awt.Dimension(25, 25));

        iconMem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        iconMem.setMaximumSize(new java.awt.Dimension(25, 25));
        iconMem.setMinimumSize(new java.awt.Dimension(25, 25));
        iconMem.setPreferredSize(new java.awt.Dimension(25, 25));

        iconDuration.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        iconDuration.setMaximumSize(new java.awt.Dimension(25, 25));
        iconDuration.setMinimumSize(new java.awt.Dimension(25, 25));
        iconDuration.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(iconMail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(iconDuration, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(iconMem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblNickname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblReminder, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblReminder, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iconMem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iconDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iconMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        technonizer.TechnoNizer.admin.loading();
        new Thread(()->{
            technonizer.TechnoNizer.admin.showUser(reminder, search);
        }).start();
    }//GEN-LAST:event_formMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconDuration;
    private javax.swing.JLabel iconMail;
    private javax.swing.JLabel iconMem;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblNickname;
    private javax.swing.JLabel lblReminder;
    // End of variables declaration//GEN-END:variables
}
