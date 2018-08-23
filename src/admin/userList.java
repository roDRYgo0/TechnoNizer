package admin;

import java.awt.Color;
import javaClass.classAdmin;

public class userList extends javax.swing.JPanel {

    int user;
    boolean search;
    
    public userList(int n, boolean search) {
        initComponents();
        user = n;
        this.search = search;
        load(n, search);
    }
    
    void load(int n, boolean search){
        if(search){
            String[] firstName = classAdmin.usersSearch.get(n).getFirstName().split(" ");
            String[] lastName = classAdmin.usersSearch.get(n).getLastName().split(" ");
            lblName.setText(firstName[0]+" "+lastName[0]);
            lblNickname.setText(classAdmin.usersSearch.get(n).getNickname());
            lblMail.setText(classAdmin.usersSearch.get(n).getMail());
            
            switch(classAdmin.usersSearch.get(n).getCondition()){
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
           String[] firstName = classAdmin.users.get(n).getFirstName().split(" ");
            String[] lastName = classAdmin.users.get(n).getLastName().split(" ");
            lblName.setText(firstName[0]+" "+lastName[0]);
            lblNickname.setText(classAdmin.users.get(n).getNickname());
            lblMail.setText(classAdmin.users.get(n).getMail());
            
            switch(classAdmin.users.get(n).getCondition()){
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
        lblMail = new javax.swing.JLabel();

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

        lblMail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMail.setText("Not found");

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
                .addComponent(lblMail, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(lblMail)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        technonizer.TechnoNizer.admin.loading();
        new Thread(()->{
            technonizer.TechnoNizer.admin.showUser(user, search);
        }).start();
    }//GEN-LAST:event_formMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNickname;
    // End of variables declaration//GEN-END:variables
}
