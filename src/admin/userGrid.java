package admin;

import java.awt.Color;
import javaClass.classAdmin;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.standardization;

/** @author rodri*/

public class userGrid extends javax.swing.JPanel {

    String[] birthdate;
    String birth;
    int user;
    boolean search;
    
    public userGrid(int n, boolean search) {
        initComponents();
        user = n;
        this.search = search;
        load(n, search);
    }
    
    void load(int n, boolean search){
        if(search){
            if(classAdmin.usersSearch.get(n).getImage() != null)
            lblImage.setIcon(standardization.getImgIcon(classAdmin.usersSearch.get(n).getImage(), 60, 60));
            else
                lblImage.setIcon(new controller().changeImage("/imagenes/user.png", 60, 60));
            lblFirstName.setText(classAdmin.usersSearch.get(n).getFirstName());
            lblLastName.setText(classAdmin.usersSearch.get(n).getLastName());
            lblNickname.setText(classAdmin.usersSearch.get(n).getNickname());
            lblMail.setText(classAdmin.usersSearch.get(n).getMail());

            birth = classAdmin.usersSearch.get(n).getBirthdate();
            birthdate = birth.split("-");

            lblAge.setText(classAdmin.usersSearch.get(n).getAge() + " años");

            lblGender.setText(classAdmin.usersSearch.get(n).getGender());
            lblMem.setText(classAdmin.usersSearch.get(n).getMembership());
            lblDuration.setText(classAdmin.usersSearch.get(n).getDurationMem()+ " días" );
            
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
            
            loadImage(n,search);
        }else{
            if(classAdmin.users.get(n).getImage() != null)
            lblImage.setIcon(standardization.getImgIcon(classAdmin.users.get(n).getImage(), 60, 60));
            else
                lblImage.setIcon(new controller().changeImage("/imagenes/user.png", 60, 60));
            lblFirstName.setText(classAdmin.users.get(n).getFirstName());
            lblLastName.setText(classAdmin.users.get(n).getLastName());
            lblNickname.setText(classAdmin.users.get(n).getNickname());
            lblMail.setText(classAdmin.users.get(n).getMail());

            birth = classAdmin.users.get(n).getBirthdate();
            birthdate = birth.split("-");

            lblAge.setText(classAdmin.users.get(n).getAge() + " años");

            lblGender.setText(classAdmin.users.get(n).getGender());
            lblMem.setText(classAdmin.users.get(n).getMembership());
            lblDuration.setText(classAdmin.users.get(n).getDurationMem()+ " días" );
            
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
            
            loadImage(n, search);
        }
        
    }
    
    void loadImage(int n, boolean search){
        iconAge.setIcon(new controller().changeImage("/imagenes/age.png", 25, 25));
        iconGender.setIcon(new controller().changeImage("/imagenes/gender.png", 25, 25));
        iconDuration.setIcon(new controller().changeImage("/imagenes/hashtag.png", 25, 25));                
        iconMail.setIcon(new controller().changeImage("/imagenes/email.png", 25, 25));                
        
        int s;
        if(search)
           s = classAdmin.usersSearch.get(n).getIdMemberships();
        else
            s = classAdmin.users.get(n).getIdMemberships();
        switch(s){
            case 1:
                iconMem.setIcon(new controller().changeImage("/imagenes/free.png", 25, 25));
                break;
            case 2:
                iconMem.setIcon(new controller().changeImage("/imagenes/vip.png", 25, 25));
                break;
            case 3:
                iconMem.setIcon(new controller().changeImage("/imagenes/premium.png", 25, 25));
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMem = new javax.swing.JLabel();
        lblDuration = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        lblNickname = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        iconMail = new javax.swing.JLabel();
        iconAge = new javax.swing.JLabel();
        iconGender = new javax.swing.JLabel();
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

        lblMem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMem.setText("Not found");

        lblDuration.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDuration.setText("Not found");

        lblImage.setMaximumSize(new java.awt.Dimension(60, 60));
        lblImage.setMinimumSize(new java.awt.Dimension(60, 60));
        lblImage.setPreferredSize(new java.awt.Dimension(60, 60));

        lblNickname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNickname.setText("Not found");

        lblMail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMail.setText("Not found");

        lblFirstName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFirstName.setText("Not found");

        lblLastName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLastName.setText("Not found");

        lblAge.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAge.setText("Not found");

        lblGender.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblGender.setText("Not found");

        iconMail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        iconMail.setMaximumSize(new java.awt.Dimension(25, 25));
        iconMail.setMinimumSize(new java.awt.Dimension(25, 25));
        iconMail.setPreferredSize(new java.awt.Dimension(25, 25));

        iconAge.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        iconAge.setMaximumSize(new java.awt.Dimension(25, 25));
        iconAge.setMinimumSize(new java.awt.Dimension(25, 25));
        iconAge.setPreferredSize(new java.awt.Dimension(25, 25));

        iconGender.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        iconGender.setMaximumSize(new java.awt.Dimension(25, 25));
        iconGender.setMinimumSize(new java.awt.Dimension(25, 25));
        iconGender.setPreferredSize(new java.awt.Dimension(25, 25));

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(iconMail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMail, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iconMem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMem, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconAge, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconGender, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblGender, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(iconAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(iconGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iconMem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMem, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iconDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
    private javax.swing.JLabel iconAge;
    private javax.swing.JLabel iconDuration;
    private javax.swing.JLabel iconGender;
    private javax.swing.JLabel iconMail;
    private javax.swing.JLabel iconMem;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblMem;
    private javax.swing.JLabel lblNickname;
    // End of variables declaration//GEN-END:variables
}
