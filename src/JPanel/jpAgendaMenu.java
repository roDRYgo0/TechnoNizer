package JPanel;

import java.awt.Color;
import java.util.Properties;
import javaClass.Project;
import javaClass.classPersonalE;
import javaClass.classProjects;
import static javaClass.classProjects.projects;
import javaClass.classReminder;
import static javaClass.classReminder.reminders;
import javaClass.controller;
import javaClass.reminder;
import properties.propiedades;

public class jpAgendaMenu extends javax.swing.JPanel {

    void verificaridioma()
    {
    Properties pr= new propiedades(controller.idioma);
    lblmenuAgenda.setText(pr.getProperty("lblmenuAgenda"));
    lblRecorderAgendaMenu.setText(pr.getProperty("lblRecorderAgendaMenu"));
    NumberRemCr.setText(pr.getProperty("NumberRemCr"));
    lblPersonalEvents.setText(pr.getProperty("lblPersonalEvents"));


    
    }
    
    public jpAgendaMenu() {
        initComponents();
       
        load(); 
        verificaridioma();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lblRecorderAgendaMenu = new javax.swing.JLabel();
        lblTypeMember = new javax.swing.JLabel();
        lblImageEvent = new javax.swing.JLabel();
        lblPP = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblPersonalEvents = new javax.swing.JLabel();
        lblTypeMember1 = new javax.swing.JLabel();
        NumberRemCr = new javax.swing.JLabel();
        txtCreated = new javax.swing.JTextField();
        spName = new javax.swing.JSeparator();
        iconCreated = new javax.swing.JLabel();
        lblmenuAgenda = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtCreated1 = new javax.swing.JTextField();
        spName1 = new javax.swing.JSeparator();
        NumberRemCr1 = new javax.swing.JLabel();
        iconCreated1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(170, 218, 255));
        setMaximumSize(new java.awt.Dimension(980, 601));
        setMinimumSize(new java.awt.Dimension(980, 601));
        setPreferredSize(new java.awt.Dimension(980, 601));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel3MouseReleased(evt);
            }
        });

        lblRecorderAgendaMenu.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblRecorderAgendaMenu.setForeground(new java.awt.Color(33, 150, 243));
        lblRecorderAgendaMenu.setText("Recordatorios");

        lblTypeMember.setMaximumSize(new java.awt.Dimension(40, 40));
        lblTypeMember.setMinimumSize(new java.awt.Dimension(40, 40));
        lblTypeMember.setPreferredSize(new java.awt.Dimension(40, 40));

        lblImageEvent.setMaximumSize(new java.awt.Dimension(40, 40));
        lblImageEvent.setMinimumSize(new java.awt.Dimension(40, 40));
        lblImageEvent.setPreferredSize(new java.awt.Dimension(40, 40));

        lblPP.setMaximumSize(new java.awt.Dimension(40, 40));
        lblPP.setMinimumSize(new java.awt.Dimension(40, 40));
        lblPP.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblImageEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPP, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblRecorderAgendaMenu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTypeMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblTypeMember, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(lblImageEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblRecorderAgendaMenu)
                        .addGap(18, 18, 18)
                        .addComponent(lblPP, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        jPanel4.setForeground(new java.awt.Color(153, 153, 153));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel4MouseReleased(evt);
            }
        });

        lblPersonalEvents.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblPersonalEvents.setForeground(new java.awt.Color(33, 150, 243));
        lblPersonalEvents.setText("Eventos Personales");

        lblTypeMember1.setMaximumSize(new java.awt.Dimension(40, 40));
        lblTypeMember1.setMinimumSize(new java.awt.Dimension(40, 40));
        lblTypeMember1.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblPersonalEvents)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTypeMember1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(lblTypeMember1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblPersonalEvents)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NumberRemCr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NumberRemCr.setForeground(new java.awt.Color(102, 102, 102));
        NumberRemCr.setText("Número de recordatorios creados:");

        txtCreated.setAutoscrolls(false);
        txtCreated.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtCreated.setFocusable(false);
        txtCreated.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCreatedFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCreatedFocusLost(evt);
            }
        });
        txtCreated.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreatedActionPerformed(evt);
            }
        });
        txtCreated.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCreatedKeyTyped(evt);
            }
        });

        spName.setForeground(new java.awt.Color(204, 204, 204));

        iconCreated.setMaximumSize(new java.awt.Dimension(35, 35));
        iconCreated.setMinimumSize(new java.awt.Dimension(35, 35));
        iconCreated.setPreferredSize(new java.awt.Dimension(35, 35));

        lblmenuAgenda.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblmenuAgenda.setForeground(new java.awt.Color(255, 0, 0));
        lblmenuAgenda.setText("Agenda");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        txtCreated1.setAutoscrolls(false);
        txtCreated1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtCreated1.setFocusable(false);
        txtCreated1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCreated1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCreated1FocusLost(evt);
            }
        });
        txtCreated1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreated1ActionPerformed(evt);
            }
        });
        txtCreated1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCreated1KeyTyped(evt);
            }
        });

        spName1.setForeground(new java.awt.Color(204, 204, 204));

        NumberRemCr1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NumberRemCr1.setForeground(new java.awt.Color(102, 102, 102));
        NumberRemCr1.setText("Número de eventos creados:");

        iconCreated1.setMaximumSize(new java.awt.Dimension(35, 35));
        iconCreated1.setMinimumSize(new java.awt.Dimension(35, 35));
        iconCreated1.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(NumberRemCr))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(iconCreated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spName)
                                    .addComponent(txtCreated, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblmenuAgenda)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(iconCreated1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCreated1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(spName1))
                        .addGap(194, 194, 194))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(NumberRemCr1)
                        .addGap(148, 148, 148))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblmenuAgenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NumberRemCr)
                            .addComponent(NumberRemCr1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(iconCreated, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCreated, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spName, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconCreated1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCreated1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spName1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(240, 240, 240))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCreatedFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCreatedFocusGained
        spName.setBackground(Color.red);
    }//GEN-LAST:event_txtCreatedFocusGained

    private void txtCreatedFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCreatedFocusLost
        spName.setBackground(Color.white);
    }//GEN-LAST:event_txtCreatedFocusLost

    private void txtCreatedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreatedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreatedActionPerformed

    private void txtCreatedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreatedKeyTyped
        char c = evt.getKeyChar();
        if(txtCreated.getText().contains(" ") && c==' ')
        evt.consume();
    }//GEN-LAST:event_txtCreatedKeyTyped

    private void jPanel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseReleased
        technonizer.TechnoNizer.home.showYourReminder(false);
    }//GEN-LAST:event_jPanel3MouseReleased

    private void txtCreated1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCreated1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreated1FocusGained

    private void txtCreated1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCreated1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreated1FocusLost

    private void txtCreated1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreated1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreated1ActionPerformed

    private void txtCreated1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreated1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreated1KeyTyped

    private void jPanel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseReleased
        technonizer.TechnoNizer.home.showYourPersonal(false);
    }//GEN-LAST:event_jPanel4MouseReleased

     void load(){
    
        txtCreated.setText(classReminder.reminders.size()+"");
        txtCreated1.setText(classPersonalE.eventos.size()+"");
        
        int ActiveE = 0;
        for(reminder pr : classReminder.reminders){
            if(pr.getCondition()==1)
                ActiveE ++;
        }
        
        
        iconCreated.setIcon(new controller().changeImage("/imagenes/hashtag.png", 35, 35));
        iconCreated1.setIcon(new controller().changeImage("/imagenes/hashtag.png", 35, 35));
        lblPP.setIcon(new controller().changeImage("/imagenes/Reminder12.png", 60, 60));
        }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NumberRemCr;
    private javax.swing.JLabel NumberRemCr1;
    private javax.swing.JLabel iconCreated;
    private javax.swing.JLabel iconCreated1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblImageEvent;
    private javax.swing.JLabel lblPP;
    private javax.swing.JLabel lblPersonalEvents;
    private javax.swing.JLabel lblRecorderAgendaMenu;
    private javax.swing.JLabel lblTypeMember;
    private javax.swing.JLabel lblTypeMember1;
    private javax.swing.JLabel lblmenuAgenda;
    private javax.swing.JSeparator spName;
    private javax.swing.JSeparator spName1;
    private javax.swing.JTextField txtCreated;
    private javax.swing.JTextField txtCreated1;
    // End of variables declaration//GEN-END:variables
}
