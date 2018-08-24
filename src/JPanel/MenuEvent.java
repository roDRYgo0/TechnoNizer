/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPanel;

import javaClass.classUsuario;
import javaClass.controller;
import javaClass.methodsSQL;

/**
 *
 * @author Alexg
 */
public class MenuEvent extends javax.swing.JPanel {

    /**
     * Creates new form MenuEvent
     */
    public MenuEvent() {
        initComponents();
             
             int nAdmin = methodsSQL.getExecuteInt("SELECT memberships.numberAdmins FROM memberships, users WHERE users.nickname = ? AND memberships.id=users.idMemberships",classUsuario.getNickname());
             int nEvents=methodsSQL.getExecuteInt("SELECT memberships.numberEvents FROM memberships, users WHERE users.nickname=? AND memberships.id=users.idMemberships", classUsuario.getNickname());
             int nEventAvaible=methodsSQL.getExecuteInt("SELECT memberships.numberEvents FROM memberships, users WHERE users.nickname=? AND memberships.id=users.idMemberships", classUsuario.getNickname());
             int nModer=methodsSQL.getExecuteInt("SELECT memberships.numberModerators FROM memberships, users WHERE users.nickname=? AND memberships.id=users.idMemberships", classUsuario.getNickname());
             int nGuest=methodsSQL.getExecuteInt("SELECT memberships.numberGuests FROM memberships, users WHERE users.nickname=? AND memberships.id=users.idMemberships", classUsuario.getNickname());
            
             if(nEvents<0&&nEventAvaible<0)
             {
                     EventsCount.setText("Eventos Ilimitados");
                     Countrest.setText("Eventos Ilimitados");
                     EventAvaibles.setText("Eventos Ilimitados");
             }
             else{  
                  int n = methodsSQL.getExecuteInt("SELECT count(*) FROM staff WHERE nickname = ? ",classUsuario.getNickname());
    if(n>0)
    {
      EventsCount.setText(Integer.toString(n));
    }
    else
    {
              EventsCount.setText("0");
    }
    }
          
             NumberAdmnis.setText(Integer.toString(nAdmin));
             NumberModeradors.setText(Integer.toString(nModer));
             Guest.setText(Integer.toString(nGuest));
             Number.setIcon(new controller().changeImage("/imagenes/membership.png", 30, 30));
             EventsE.setIcon(new controller().changeImage("/imagenes/membership.png", 30, 30));
             EventDis.setIcon(new controller().changeImage("/imagenes/membership.png", 30, 30));
             Admins.setIcon(new controller().changeImage("/imagenes/hashtag.png", 30, 30));
           Mods.setIcon(new controller().changeImage("/imagenes/hashtag.png", 30, 30));
           Invites.setIcon(new controller().changeImage("/imagenes/hashtag.png", 30, 30));
         
             
        
        
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Events = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Shares = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        spName = new javax.swing.JSeparator();
        Countrest = new javax.swing.JTextField();
        spLastName = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        EventsCount = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        spName1 = new javax.swing.JSeparator();
        NumberAdmnis = new javax.swing.JTextField();
        spLastName1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        NumberModeradors = new javax.swing.JTextField();
        spName2 = new javax.swing.JSeparator();
        spLastName2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        Guest = new javax.swing.JTextField();
        Admins = new javax.swing.JLabel();
        Mods = new javax.swing.JLabel();
        Invites = new javax.swing.JLabel();
        EventAvaibles = new javax.swing.JTextField();
        spLastName3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        Number = new javax.swing.JLabel();
        EventsE = new javax.swing.JLabel();
        EventDis = new javax.swing.JLabel();
        Participate = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(980, 601));
        setMinimumSize(new java.awt.Dimension(980, 601));

        Events.setBackground(new java.awt.Color(0, 102, 255));
        Events.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                EventsMouseReleased(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mis eventos");

        javax.swing.GroupLayout EventsLayout = new javax.swing.GroupLayout(Events);
        Events.setLayout(EventsLayout);
        EventsLayout.setHorizontalGroup(
            EventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventsLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addContainerGap(179, Short.MAX_VALUE))
        );
        EventsLayout.setVerticalGroup(
            EventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventsLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        Shares.setBackground(new java.awt.Color(0, 102, 255));
        Shares.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SharesMouseReleased(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Eventos Compartidos");

        javax.swing.GroupLayout SharesLayout = new javax.swing.GroupLayout(Shares);
        Shares.setLayout(SharesLayout);
        SharesLayout.setHorizontalGroup(
            SharesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SharesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        SharesLayout.setVerticalGroup(
            SharesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SharesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Eventos.");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        spName.setForeground(new java.awt.Color(204, 204, 204));

        Countrest.setAutoscrolls(false);
        Countrest.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Countrest.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CountrestFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CountrestFocusLost(evt);
            }
        });
        Countrest.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CountrestKeyTyped(evt);
            }
        });

        spLastName.setForeground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Numero de eventos");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Eventos restantes");

        EventsCount.setAutoscrolls(false);
        EventsCount.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        EventsCount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EventsCountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EventsCountFocusLost(evt);
            }
        });
        EventsCount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EventsCountKeyTyped(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        spName1.setForeground(new java.awt.Color(204, 204, 204));

        NumberAdmnis.setAutoscrolls(false);
        NumberAdmnis.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        NumberAdmnis.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NumberAdmnisFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NumberAdmnisFocusLost(evt);
            }
        });
        NumberAdmnis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberAdmnisActionPerformed(evt);
            }
        });
        NumberAdmnis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NumberAdmnisKeyTyped(evt);
            }
        });

        spLastName1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Moderadores");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Administradores");

        NumberModeradors.setAutoscrolls(false);
        NumberModeradors.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        NumberModeradors.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NumberModeradorsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NumberModeradorsFocusLost(evt);
            }
        });
        NumberModeradors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberModeradorsActionPerformed(evt);
            }
        });
        NumberModeradors.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NumberModeradorsKeyTyped(evt);
            }
        });

        spName2.setForeground(new java.awt.Color(204, 204, 204));

        spLastName2.setForeground(new java.awt.Color(204, 204, 204));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Numero de Invitados");

        Guest.setAutoscrolls(false);
        Guest.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Guest.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                GuestFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                GuestFocusLost(evt);
            }
        });
        Guest.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                GuestKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Admins)
                            .addComponent(Mods)
                            .addComponent(Invites))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spName1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumberModeradors, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(spLastName1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NumberAdmnis, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Guest, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spName2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(spLastName2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Admins))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NumberAdmnis, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(spLastName1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Mods))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NumberModeradors, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(spName1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Invites))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Guest, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spName2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(spLastName2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EventAvaibles.setAutoscrolls(false);
        EventAvaibles.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        EventAvaibles.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EventAvaiblesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EventAvaiblesFocusLost(evt);
            }
        });
        EventAvaibles.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EventAvaiblesKeyTyped(evt);
            }
        });

        spLastName3.setForeground(new java.awt.Color(204, 204, 204));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Eventos Disponibles");

        Participate.setBackground(new java.awt.Color(0, 102, 255));
        Participate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ParticipateMouseReleased(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Eventos Participantes");

        javax.swing.GroupLayout ParticipateLayout = new javax.swing.GroupLayout(Participate);
        Participate.setLayout(ParticipateLayout);
        ParticipateLayout.setHorizontalGroup(
            ParticipateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParticipateLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        ParticipateLayout.setVerticalGroup(
            ParticipateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParticipateLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(Events, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Shares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Participate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 74, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Number)
                    .addComponent(EventsE)
                    .addComponent(EventDis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spLastName3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spName, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(EventsCount, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EventAvaibles, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spLastName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Countrest, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Events, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Shares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Participate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Number))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EventsCount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(spName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(EventsE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Countrest, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(spLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(EventDis))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EventAvaibles, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spLastName3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EventsCountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EventsCountFocusGained

    }//GEN-LAST:event_EventsCountFocusGained

    private void EventsCountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EventsCountFocusLost
    
    }//GEN-LAST:event_EventsCountFocusLost

    private void EventsCountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EventsCountKeyTyped
        char c = evt.getKeyChar();
        if(EventsCount.getText().contains(" ") && c==' ')
        evt.consume();
    }//GEN-LAST:event_EventsCountKeyTyped

    private void EventsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EventsMouseReleased
        technonizer.TechnoNizer.home.showYourEvents(false);
    }//GEN-LAST:event_EventsMouseReleased

    private void SharesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SharesMouseReleased
    
      technonizer.TechnoNizer.home.showYourEvents(false);
    }//GEN-LAST:event_SharesMouseReleased

    private void NumberAdmnisFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NumberAdmnisFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_NumberAdmnisFocusGained

    private void NumberAdmnisFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NumberAdmnisFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_NumberAdmnisFocusLost

    private void NumberAdmnisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumberAdmnisKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_NumberAdmnisKeyTyped

    private void NumberModeradorsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NumberModeradorsFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_NumberModeradorsFocusGained

    private void NumberModeradorsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NumberModeradorsFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_NumberModeradorsFocusLost

    private void NumberModeradorsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumberModeradorsKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_NumberModeradorsKeyTyped

    private void GuestFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GuestFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_GuestFocusGained

    private void GuestFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GuestFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_GuestFocusLost

    private void GuestKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GuestKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_GuestKeyTyped

    private void NumberModeradorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberModeradorsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumberModeradorsActionPerformed

    private void NumberAdmnisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberAdmnisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumberAdmnisActionPerformed

    private void CountrestKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CountrestKeyTyped
        char c = evt.getKeyChar();
        if(Countrest.getText().contains(" ") && c==' ')
        evt.consume();
    }//GEN-LAST:event_CountrestKeyTyped

    private void CountrestFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CountrestFocusLost

    }//GEN-LAST:event_CountrestFocusLost

    private void CountrestFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CountrestFocusGained

    }//GEN-LAST:event_CountrestFocusGained

    private void EventAvaiblesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EventAvaiblesFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_EventAvaiblesFocusGained

    private void EventAvaiblesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EventAvaiblesFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_EventAvaiblesFocusLost

    private void EventAvaiblesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EventAvaiblesKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_EventAvaiblesKeyTyped

    private void ParticipateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParticipateMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ParticipateMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Admins;
    private javax.swing.JTextField Countrest;
    private javax.swing.JTextField EventAvaibles;
    private javax.swing.JLabel EventDis;
    private javax.swing.JPanel Events;
    private javax.swing.JTextField EventsCount;
    private javax.swing.JLabel EventsE;
    private javax.swing.JTextField Guest;
    private javax.swing.JLabel Invites;
    private javax.swing.JLabel Mods;
    private javax.swing.JLabel Number;
    private javax.swing.JTextField NumberAdmnis;
    private javax.swing.JTextField NumberModeradors;
    private javax.swing.JPanel Participate;
    private javax.swing.JPanel Shares;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator spLastName;
    private javax.swing.JSeparator spLastName1;
    private javax.swing.JSeparator spLastName2;
    private javax.swing.JSeparator spLastName3;
    private javax.swing.JSeparator spName;
    private javax.swing.JSeparator spName1;
    private javax.swing.JSeparator spName2;
    // End of variables declaration//GEN-END:variables
}
