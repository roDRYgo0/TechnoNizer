/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPanel;

import javaClass.classUsuario;
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
                     Countrest.setText("Eventos Ilimitados");
                     EventAvaibles.setText("Eventos Ilimitados");
             }
             else{  
                 
             }
             NumberAdmnis.setText(Integer.toString(nAdmin));
             NumberModeradors.setText(Integer.toString(nModer));
             Guest.setText(Integer.toString(nGuest));
           
         
             
        
        
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
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
        EventAvaibles = new javax.swing.JTextField();
        spLastName3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(980, 601));
        setMinimumSize(new java.awt.Dimension(980, 601));

        jPanel3.setBackground(new java.awt.Color(0, 102, 255));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel3MouseReleased(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mis eventos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 255));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel4MouseReleased(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Eventos Compartidos");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addContainerGap(20, Short.MAX_VALUE))
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

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

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
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Moderadores");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
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
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(spName1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumberModeradors, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spLastName2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumberAdmnis, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spLastName1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(spName2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Guest, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(3, 3, 3)
                .addComponent(NumberAdmnis, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(spLastName1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NumberModeradors, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(spName1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Guest, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(spName2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(353, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spName, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(EventsCount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                .addComponent(spLastName3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(EventAvaibles, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(spLastName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Countrest, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(109, 109, 109))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EventsCount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(spName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Countrest, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(spLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EventAvaibles, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spLastName3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
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

    private void jPanel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseReleased
        technonizer.TechnoNizer.home.showYourEvents(false);
    }//GEN-LAST:event_jPanel3MouseReleased

    private void jPanel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseReleased
     int n = methodsSQL.getExecuteInt("SELECT count(*) FROM staff WHERE nickname = ? ",classUsuario.getNickname());
    if(n>0)
    {
      EventsCount.setText(Integer.toString(n));
    }
    else
    {
              EventsCount.setText("0");
    }
  
    }//GEN-LAST:event_jPanel4MouseReleased

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Countrest;
    private javax.swing.JTextField EventAvaibles;
    private javax.swing.JTextField EventsCount;
    private javax.swing.JTextField Guest;
    private javax.swing.JTextField NumberAdmnis;
    private javax.swing.JTextField NumberModeradors;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
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
