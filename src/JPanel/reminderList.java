package JPanel;

import admin.*;
import java.awt.Color;
import javaClass.classAdmin;
import javaClass.classReminder;

public class reminderList extends javax.swing.JPanel {

    int reminder;
    boolean search;
    
    public reminderList(int n, boolean search) {
        initComponents();
        reminder = n;
        this.search = search;
        load(n, search);
    }
    
    void load(int n, boolean search){
        if(search){
            String[] firstName = classReminder.remindersSearch.get(n).getFirstName().split(" ");
            String[] lastName = classReminder.remindersSearch.get(n).getLastName().split(" ");
            lblName.setText(firstName[0]+" "+lastName[0]);
            lblNickname.setText(classReminder.remindersSearch.get(n).getNickname());
            lblReminder.setText(classReminder.remindersSearch.get(n).getReminder());
            
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
           String[] firstName = classReminder.reminders.get(n).getFirstName().split(" ");
            String[] lastName = classReminder.reminders.get(n).getLastName().split(" ");
            lblName.setText(firstName[0]+" "+lastName[0]);
            lblNickname.setText(classReminder.reminders.get(n).getNickname());
            lblReminder.setText(classReminder.reminders.get(n).getReminder());
            
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

        lblNickname = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblReminder = new javax.swing.JLabel();

        setBackground(new java.awt.Color(244, 244, 244));
        setMaximumSize(new java.awt.Dimension(270, 51));
        setMinimumSize(new java.awt.Dimension(270, 51));
        setPreferredSize(new java.awt.Dimension(270, 51));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        lblNickname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNickname.setText("Not found");

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblName.setText("Not found");

        lblReminder.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblReminder.setText("Not found");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblReminder, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNickname)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblReminder)
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
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNickname;
    private javax.swing.JLabel lblReminder;
    // End of variables declaration//GEN-END:variables
}
