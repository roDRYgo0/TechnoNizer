package JPanel;

import java.awt.Color;
import javaClass.Project;
import javaClass.classProjects;
import static javaClass.classProjects.projects;
import javaClass.controller;

public class jpProjectsMenu extends javax.swing.JPanel {

    public jpProjectsMenu() {
        initComponents();
        load();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblTypeMember = new javax.swing.JLabel();
        lblImageEvent = new javax.swing.JLabel();
        lblPP = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lblTypeMember1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCreated = new javax.swing.JTextField();
        spName = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtActive = new javax.swing.JTextField();
        spName1 = new javax.swing.JSeparator();
        iconCreated = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblActive = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtInactive = new javax.swing.JTextField();
        spName2 = new javax.swing.JSeparator();
        lblInactive = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
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

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(33, 150, 243));
        jLabel11.setText("Tus proyectos personales");

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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lblImageEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPP, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTypeMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
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
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(lblPP, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        jPanel4.setForeground(new java.awt.Color(153, 153, 153));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(33, 150, 243));
        jLabel12.setText("Tus proyectos Grupales");

        lblTypeMember1.setMaximumSize(new java.awt.Dimension(40, 40));
        lblTypeMember1.setMinimumSize(new java.awt.Dimension(40, 40));
        lblTypeMember1.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTypeMember1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(lblTypeMember1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(56, 56, 56))))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Número de proyectos creados:");

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

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Número de proyectos activos:");

        txtActive.setEditable(false);
        txtActive.setBackground(new java.awt.Color(255, 255, 255));
        txtActive.setAutoscrolls(false);
        txtActive.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtActive.setFocusable(false);
        txtActive.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtActiveFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtActiveFocusLost(evt);
            }
        });
        txtActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActiveActionPerformed(evt);
            }
        });
        txtActive.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtActiveKeyTyped(evt);
            }
        });

        spName1.setForeground(new java.awt.Color(204, 204, 204));

        iconCreated.setMaximumSize(new java.awt.Dimension(35, 35));
        iconCreated.setMinimumSize(new java.awt.Dimension(35, 35));
        iconCreated.setPreferredSize(new java.awt.Dimension(35, 35));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Proyectos");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        lblActive.setMaximumSize(new java.awt.Dimension(40, 40));
        lblActive.setMinimumSize(new java.awt.Dimension(40, 40));
        lblActive.setPreferredSize(new java.awt.Dimension(40, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Número de proyectos inactivos:");

        txtInactive.setEditable(false);
        txtInactive.setBackground(new java.awt.Color(255, 255, 255));
        txtInactive.setAutoscrolls(false);
        txtInactive.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtInactive.setFocusable(false);
        txtInactive.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtInactiveFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtInactiveFocusLost(evt);
            }
        });
        txtInactive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInactiveActionPerformed(evt);
            }
        });
        txtInactive.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInactiveKeyTyped(evt);
            }
        });

        spName2.setForeground(new java.awt.Color(204, 204, 204));

        lblInactive.setMaximumSize(new java.awt.Dimension(40, 40));
        lblInactive.setMinimumSize(new java.awt.Dimension(40, 40));
        lblInactive.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(572, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))))
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblInactive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtInactive, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spName2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblActive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtActive, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(spName1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(525, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iconCreated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCreated, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spName, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconCreated, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCreated, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spName, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblActive, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtActive, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spName1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtInactive, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spName2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblInactive, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
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

    private void txtActiveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtActiveFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActiveFocusGained

    private void txtActiveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtActiveFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActiveFocusLost

    private void txtActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActiveActionPerformed

    private void txtActiveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtActiveKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActiveKeyTyped

    private void txtInactiveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtInactiveFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInactiveFocusGained

    private void txtInactiveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtInactiveFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInactiveFocusLost

    private void txtInactiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInactiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInactiveActionPerformed

    private void txtInactiveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInactiveKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInactiveKeyTyped

    private void jPanel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseReleased
        technonizer.TechnoNizer.home.showYourProjects(false);
    }//GEN-LAST:event_jPanel3MouseReleased

     void load(){
    
        txtCreated.setText(classProjects.projects.size()+"");
        
        int ActiveE = 0;
        for(Project pr : classProjects.projects){
            if(pr.getCondition()==1)
                ActiveE ++;
        }
        
        txtActive.setText(ActiveE+"");
        
        
        txtInactive.setText(projects.size() - ActiveE + "");
        
        iconCreated.setIcon(new controller().changeImage("/imagenes/hashtag.png", 35, 35));
        lblActive.setIcon(new controller().changeImage("/imagenes/ok.png",35,35));
        lblInactive.setIcon(new controller().changeImage("/imagenes/cancel.png", 35, 35));
        lblPP.setIcon(new controller().changeImage("/imagenes/description.png", 50, 50));
        }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconCreated;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblActive;
    private javax.swing.JLabel lblImageEvent;
    private javax.swing.JLabel lblInactive;
    private javax.swing.JLabel lblPP;
    private javax.swing.JLabel lblTypeMember;
    private javax.swing.JLabel lblTypeMember1;
    private javax.swing.JSeparator spName;
    private javax.swing.JSeparator spName1;
    private javax.swing.JSeparator spName2;
    private javax.swing.JTextField txtActive;
    private javax.swing.JTextField txtCreated;
    private javax.swing.JTextField txtInactive;
    // End of variables declaration//GEN-END:variables
}
