package JPanel;

import admin.*;
import jFrame.addReminderGral;
import jFrame.addReminderGral1;
import java.awt.Color;
import javaClass.classAdmin;
import javaClass.classReminder;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.standardization;
import javax.swing.JOptionPane;

/** @author rodri*/

public class reminderGrid extends javax.swing.JPanel {

    int reminder;
    boolean search;
    
    public reminderGrid(int n, boolean search) {
        initComponents();
        reminder = n;
        lblId.setVisible(false);
        this.search = search;
        load(n, search);
    }
    
    void load(int n, boolean search){
        if(search){

                lblImage.setIcon(new controller().changeImage("/imagenes/user.png", 60, 60));
            lblNickname.setText(classUsuario.getNickname());
            lblReminder.setText(classReminder.remindersSearch.get(n).getReminder());
            lblDate.setText(classReminder.remindersSearch.get(n).getDate());
            switch(classReminder.remindersSearch.get(n).getCondition()){
                 case 0:
                    this.setBackground(new Color(198, 198, 198));
                    break;
                case 1:
                    this.setBackground(new Color(255, 254, 93));
                    break;
                case 2:
                    this.setBackground(new Color(255, 255, 255));
                    break;
                case 3:
                    this.setBackground(new Color(255, 244, 193));
                    break;
            }
            

        }else{
            
                lblImage.setIcon(new controller().changeImage("/imagenes/user.png", 60, 60));
                lblId.setText(classReminder.reminders.get(n).getId().toString());
            lblNickname.setText(classUsuario.getNickname());
            lblReminder.setText(classReminder.reminders.get(n).getReminder());
            lblDate.setText(classReminder.reminders.get(n).getDate());
            
            switch(classReminder.reminders.get(n).getCondition()){
                case 0:
                    this.setBackground(new Color(198, 198, 198));
                    break;
                case 1:
                    this.setBackground(new Color(255, 254, 93));
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lblDate = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        lblNickname = new javax.swing.JLabel();
        lblReminder = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        iconMail = new javax.swing.JLabel();
        iconMem = new javax.swing.JLabel();
        iconDuration = new javax.swing.JLabel();
        lblLastName1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

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

        lblReminder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblReminder.setText("Not found");

        lblFirstName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFirstName.setText("    Usuario");

        lblId.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblId.setText("Not Found");

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

        lblLastName1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLastName1.setText("Recordatorio");

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setText("Eliminar");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLastName1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconMail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblReminder, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconDuration, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconMem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNickname))
                            .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLastName1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblReminder, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconMem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iconDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iconMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
    }// </editor-fold>                        

    private void formMouseReleased(java.awt.event.MouseEvent evt) {                                   
        controller.gralReminder1 = new addReminderGral1();
        standardization.show(controller.gralReminder1);
        controller.rootFrame = controller.gralReminder1;
    }                                  

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
         
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
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify                     
    private javax.swing.JLabel iconDuration;
    private javax.swing.JLabel iconMail;
    private javax.swing.JLabel iconMem;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLastName1;
    private javax.swing.JLabel lblNickname;
    private javax.swing.JLabel lblReminder;
    // End of variables declaration                   
}
