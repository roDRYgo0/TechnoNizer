package JPanel;

import jFrame.home;
import java.util.Properties;
import javaClass.classUsuario;
import javaClass.controller;
import properties.propiedades;


public class jpHome extends javax.swing.JPanel {

    home hom;
    Properties pr = new propiedades (controller.idioma);
    
    void verificaridioma()
    {
    pr = new propiedades (controller.idioma);
    StartJpHome.setText(pr.getProperty("StartJpHome"));
    ProfilejpHome.setText(pr.getProperty("ProfilejpHome"));
    NameUserjpHome.setText(pr.getProperty("NameUserjpHome"));
    Namesjphome.setText(pr.getProperty("Namesjphome"));
    LastNamesjpHome.setText(pr.getProperty("LastNamesjpHome"));
    EmailjpHome.setText(pr.getProperty("EmailjpHome"));
    BirthDayjpHome.setText(pr.getProperty("BirthDayjpHome"));
    GenerjpHome.setText(pr.getProperty("GenerjpHome"));
    btnEdit.setText(pr.getProperty("btnEditjpHome"));
   MembershiptitlejpHome.setText(pr.getProperty("MembershiptitlejpHome"));
   TypeMembershipjpHome.setText(pr.getProperty("TypeMembershipjpHome"));
   DurationjpHome.setText(pr.getProperty("DurationjpHome"));
   AvaibleeventsjpHome.setText(pr.getProperty("AvaibleeventsjpHome"));

    }
    
    public jpHome(boolean load, home hom) {
        initComponents();
        load(load);
        this.hom = hom;
        verificaridioma();
    }
    
    void load(boolean load){
        if(load){
            lblNickname.setText(classUsuario.getNickname());
            lblName.setText(classUsuario.getFirstName());
            lblLastName.setText(classUsuario.getLastName());
            lblMail.setText(classUsuario.getMail());
            lblBirthday.setText(classUsuario.getBirthdate());
            lblGender.setText(classUsuario.getMyGender());
            lblNameMember.setText(classUsuario.getMyMembership());
            lblDuration.setText(classUsuario.getDurationMem()+"");
            lblNumEvents.setText(classUsuario.getMyNumEvent()+"");

            
            switch(lblNameMember.getText()){
                case "Free":
                    lblTypeMember.setIcon(new controller().changeImage("/imagenes/free.png", 40, 40));
                    break;
                case "Vip":
                    lblTypeMember.setIcon(new controller().changeImage("/imagenes/vip.png", 40, 40));
                    break;
                case "Premium":
                    lblTypeMember.setIcon(new controller().changeImage("/imagenes/premium.png", 40, 40));
                    break;
            }
            
            switch(lblNumEvents.getText()){
                case "-1":
                    lblNumEvents.setText(pr.getProperty("Unlimitedevents"));
                    lblImageEvent.setIcon(new controller().changeImage("/imagenes/infinity.png", 40, 40));
                    break;
                default:
                    lblImageEvent.setIcon(new controller().changeImage("/imagenes/hashtag.png", 40, 40));
                    break;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StartJpHome = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        ProfilejpHome = new javax.swing.JLabel();
        NameUserjpHome = new javax.swing.JLabel();
        lblNickname = new javax.swing.JLabel();
        Namesjphome = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        LastNamesjpHome = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        EmailjpHome = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        lblBirthday = new javax.swing.JLabel();
        BirthDayjpHome = new javax.swing.JLabel();
        GenerjpHome = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        MembershiptitlejpHome = new javax.swing.JLabel();
        TypeMembershipjpHome = new javax.swing.JLabel();
        lblNameMember = new javax.swing.JLabel();
        lblTypeMember = new javax.swing.JLabel();
        lblDuration = new javax.swing.JLabel();
        DurationjpHome = new javax.swing.JLabel();
        AvaibleeventsjpHome = new javax.swing.JLabel();
        lblNumEvents = new javax.swing.JLabel();
        lblImageEvent = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(124100, 124100));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(980, 601));

        StartJpHome.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        StartJpHome.setForeground(new java.awt.Color(255, 0, 0));
        StartJpHome.setText("Inicio");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));

        ProfilejpHome.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ProfilejpHome.setForeground(new java.awt.Color(33, 150, 243));
        ProfilejpHome.setText("Perfil");

        NameUserjpHome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NameUserjpHome.setForeground(new java.awt.Color(102, 102, 102));
        NameUserjpHome.setText("Nombre de usuario");

        lblNickname.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNickname.setText("Not found");

        Namesjphome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Namesjphome.setForeground(new java.awt.Color(102, 102, 102));
        Namesjphome.setText("Nombres");

        lblName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblName.setText("Not found");

        LastNamesjpHome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LastNamesjpHome.setForeground(new java.awt.Color(102, 102, 102));
        LastNamesjpHome.setText("Apellidos");

        lblLastName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblLastName.setText("Not found");

        EmailjpHome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EmailjpHome.setForeground(new java.awt.Color(102, 102, 102));
        EmailjpHome.setText("Email");

        lblMail.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblMail.setText("Not found");

        lblBirthday.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblBirthday.setText("Not found");

        BirthDayjpHome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BirthDayjpHome.setForeground(new java.awt.Color(102, 102, 102));
        BirthDayjpHome.setText("Fecha de nacimiento");

        GenerjpHome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        GenerjpHome.setForeground(new java.awt.Color(102, 102, 102));
        GenerjpHome.setText("Género");

        lblGender.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblGender.setText("Not found");

        btnEdit.setBackground(new java.awt.Color(33, 150, 243));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Editar perfil");
        btnEdit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEdit.setFocusPainted(false);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NameUserjpHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ProfilejpHome)
                            .addComponent(lblNickname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Namesjphome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LastNamesjpHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EmailjpHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBirthday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BirthDayjpHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GenerjpHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProfilejpHome)
                .addGap(18, 18, 18)
                .addComponent(NameUserjpHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNickname)
                .addGap(18, 18, 18)
                .addComponent(Namesjphome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblName)
                .addGap(18, 18, 18)
                .addComponent(LastNamesjpHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLastName)
                .addGap(18, 18, 18)
                .addComponent(EmailjpHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMail)
                .addGap(18, 18, 18)
                .addComponent(BirthDayjpHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBirthday)
                .addGap(18, 18, 18)
                .addComponent(GenerjpHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGender)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));

        MembershiptitlejpHome.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        MembershiptitlejpHome.setForeground(new java.awt.Color(33, 150, 243));
        MembershiptitlejpHome.setText("Membresias");

        TypeMembershipjpHome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TypeMembershipjpHome.setForeground(new java.awt.Color(102, 102, 102));
        TypeMembershipjpHome.setText("Tipo de membresia");

        lblNameMember.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNameMember.setText("Not found");

        lblTypeMember.setMaximumSize(new java.awt.Dimension(40, 40));
        lblTypeMember.setMinimumSize(new java.awt.Dimension(40, 40));
        lblTypeMember.setPreferredSize(new java.awt.Dimension(40, 40));

        lblDuration.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblDuration.setText("Not found");

        DurationjpHome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DurationjpHome.setForeground(new java.awt.Color(102, 102, 102));
        DurationjpHome.setText("Duracion");

        AvaibleeventsjpHome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AvaibleeventsjpHome.setForeground(new java.awt.Color(102, 102, 102));
        AvaibleeventsjpHome.setText("Número de eventos disponibles");

        lblNumEvents.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNumEvents.setText("Not found");

        lblImageEvent.setMaximumSize(new java.awt.Dimension(40, 40));
        lblImageEvent.setMinimumSize(new java.awt.Dimension(40, 40));
        lblImageEvent.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblTypeMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNameMember, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TypeMembershipjpHome, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MembershiptitlejpHome)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DurationjpHome, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblImageEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNumEvents))
                            .addComponent(AvaibleeventsjpHome, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MembershiptitlejpHome)
                .addGap(18, 18, 18)
                .addComponent(TypeMembershipjpHome)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTypeMember, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblNameMember)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(DurationjpHome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDuration))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(AvaibleeventsjpHome)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImageEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNumEvents)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(StartJpHome))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(StartJpHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        hom.showEditUser();
    }//GEN-LAST:event_btnEditActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvaibleeventsjpHome;
    private javax.swing.JLabel BirthDayjpHome;
    private javax.swing.JLabel DurationjpHome;
    private javax.swing.JLabel EmailjpHome;
    private javax.swing.JLabel GenerjpHome;
    private javax.swing.JLabel LastNamesjpHome;
    private javax.swing.JLabel MembershiptitlejpHome;
    private javax.swing.JLabel NameUserjpHome;
    private javax.swing.JLabel Namesjphome;
    private javax.swing.JLabel ProfilejpHome;
    private javax.swing.JLabel StartJpHome;
    private javax.swing.JLabel TypeMembershipjpHome;
    private javax.swing.JButton btnEdit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBirthday;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblImageEvent;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNameMember;
    private javax.swing.JLabel lblNickname;
    private javax.swing.JLabel lblNumEvents;
    private javax.swing.JLabel lblTypeMember;
    // End of variables declaration//GEN-END:variables
}
