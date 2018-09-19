/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPanel;

import admin.*;
import jFrame.addReminderGral;
import jFrame.addReminderGral1;
import java.awt.Color;
import javaClass.classAdmin;
import javaClass.classReminder;
import javaClass.classUsuario;
import javaClass.controller;
import static javaClass.controller.gralReminder1;
import javaClass.standardization;
import javax.swing.JOptionPane;
/**
 *
 * @author kali
 */
public class remmindersGridds extends javax.swing.JPanel {

    
    
    int reminder;
    boolean search;
    public remmindersGridds(int n, boolean search) {
        initComponents();
         initComponents();
        reminder = n;
        lblId.setVisible(false);
        this.search = search;
        load(n, search);
        jTextArea1.setBorder(null);

        
    }
void load(int n, boolean search){
        if(search){
                 //carga la informacion hacia los labels y asigna colores//
                
                lbldelete.setIcon(new controller().changeImage("/imagenes/trash.png", 60, 60));
                lblIm.setIcon(new controller().changeImage("/imagenes/icons8_Reminder_96px_1.png", 40, 32));
            lblNickname.setText(classUsuario.getNickname());
            lblDate.setText(classReminder.remindersSearch.get(n).getDate());
            switch(classReminder.remindersSearch.get(n).getCondition()){
                 case 0:
                    this.setBackground(new Color(33, 150,255));
                    break;
                case 1:
                    this.setBackground(new Color(51, 181, 255));
                    break;
                case 2:
                    this.setBackground(new Color(255, 255, 255));
                    break;
                case 3:
                    this.setBackground(new Color(255, 244, 193));
                    break;
            }
            

        }else{
            
                lbldelete.setIcon(new controller().changeImage("/imagenes/trash.png", 60, 60));
                 lblIm.setIcon(new controller().changeImage("/imagenes/icons8_Reminder_96px_1.png", 40, 32));
                lblId.setText(classReminder.reminders.get(n).getId().toString());
                jTextArea1.setText(classReminder.reminders.get(n).getReminder());
            lblNickname.setText(classUsuario.getNickname());
            lblDate.setText(classReminder.reminders.get(n).getDate());
            
            switch(classReminder.reminders.get(n).getCondition()){
                case 0:
                    this.setBackground(new Color(198, 198, 198));
                    break;
                case 1:
                    this.setBackground(new Color(51, 181, 255));
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
        lblId = new javax.swing.JLabel();
        iconMail = new javax.swing.JLabel();
        iconMem = new javax.swing.JLabel();
        iconDuration = new javax.swing.JLabel();
        lblIm = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lbldelete = new javax.swing.JLabel();
        lblLastName2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextPane();

        setMaximumSize(new java.awt.Dimension(380, 180));
        setMinimumSize(new java.awt.Dimension(380, 180));
        setPreferredSize(new java.awt.Dimension(380, 180));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        lblNickname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNickname.setText("Not found");

        lblId.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblId.setText("Not Found");

        iconMail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        iconMem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        iconDuration.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        lblIm.setBackground(new java.awt.Color(255, 255, 255));
        lblIm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIm.setForeground(new java.awt.Color(204, 255, 255));
        lblIm.setText(".");

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDate.setForeground(new java.awt.Color(51, 0, 153));
        lblDate.setText("Not found");

        lbldelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbldelete.setText(".");
        lbldelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbldeleteMouseReleased(evt);
            }
        });

        lblLastName2.setBackground(new java.awt.Color(255, 255, 255));
        lblLastName2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLastName2.setForeground(new java.awt.Color(51, 0, 153));
        lblLastName2.setText("Recordatorio");

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setBackground(new java.awt.Color(51, 181, 255));
        jTextArea1.setBorder(null);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 0, 253));
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setCaretColor(new java.awt.Color(51, 181, 255));
        jTextArea1.setFocusCycleRoot(false);
        jTextArea1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextArea1.setSelectedTextColor(new java.awt.Color(51, 181, 255));
        jTextArea1.setSelectionColor(new java.awt.Color(51, 181, 255));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblLastName2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconMail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconMem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbldelete, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLastName2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addGap(36, 36, 36)
                .addComponent(lblId)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconMail)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iconMem)
                        .addGap(34, 34, 34)
                        .addComponent(iconDuration))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbldelete, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNickname)
                .addGap(112, 112, 112))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        controller.gralReminder1 = new addReminderGral1();
        standardization.show(controller.gralReminder1);
        controller.rootFrame = controller.gralReminder1;
    }//GEN-LAST:event_formMouseReleased

    private void lbldeleteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbldeleteMouseReleased
        classReminder.setId(Integer.parseInt(lblId.getText()));
        int eliminar = JOptionPane.showConfirmDialog(this, "Esta seguro que desea e1iminar?",
            "Atencion" , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ;
        if(eliminar == 0) {
            if (classReminder.deleteReminder()) {{
                classReminder.deleteReminder();
                controller.jpAA.load();
                classReminder.select();
                controller.rootFrame = technonizer.TechnoNizer.home;
                technonizer.TechnoNizer.home.pnAgenda();
                JOptionPane.showMessageDialog(this, "Datos eliminados");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Error al eliminar");
        }
        }
    }//GEN-LAST:event_lbldeleteMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconDuration;
    private javax.swing.JLabel iconMail;
    private javax.swing.JLabel iconMem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextArea1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIm;
    private javax.swing.JLabel lblLastName2;
    private javax.swing.JLabel lblNickname;
    private javax.swing.JLabel lbldelete;
    // End of variables declaration//GEN-END:variables
}
