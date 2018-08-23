package admin;

import java.awt.Color;
import javaClass.classSecurityQuestions;
import javaClass.controller;
import javaClass.standardization;

public class jpQuestionsAdmin extends javax.swing.JPanel {

    boolean sw;
    char echoChar;
    
    public jpQuestionsAdmin() {
        initComponents();
        load();
    }
    
    void load(){
        txtQuestion1.setText(classSecurityQuestions.getQuestions()[0]);
        txtQuestion2.setText(classSecurityQuestions.getQuestions()[1]);
        txtQuestion3.setText(classSecurityQuestions.getQuestions()[2]);
        txtAnswer1.setText(classSecurityQuestions.getAswers()[0]);
        txtAnswer2.setText(classSecurityQuestions.getAswers()[1]);
        txtAnswer3.setText(classSecurityQuestions.getAswers()[2]);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtQuestion1 = new javax.swing.JTextField();
        spQuestion1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtQuestion2 = new javax.swing.JTextField();
        spQuestion2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtQuestion3 = new javax.swing.JTextField();
        spQuestion3 = new javax.swing.JSeparator();
        btnDelete = new javax.swing.JButton();
        btnChange = new javax.swing.JButton();
        progress = new rojerusan.componentes.RSProgressMaterial();
        txtAnswer1 = new javax.swing.JTextField();
        spAnswer1 = new javax.swing.JSeparator();
        txtAnswer2 = new javax.swing.JTextField();
        sptAnswer2 = new javax.swing.JSeparator();
        txtAnswer3 = new javax.swing.JTextField();
        spAnswer3 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(425, 379));
        setMinimumSize(new java.awt.Dimension(425, 379));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(33, 150, 243));
        jLabel2.setText("Pregunta 1");

        txtQuestion1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        txtQuestion1.setAutoscrolls(false);
        txtQuestion1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtQuestion1.setFocusable(false);

        spQuestion1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(33, 150, 243));
        jLabel3.setText("Pregunta 2");

        txtQuestion2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        txtQuestion2.setAutoscrolls(false);
        txtQuestion2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtQuestion2.setFocusable(false);

        spQuestion2.setForeground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(33, 150, 243));
        jLabel4.setText("Pregunta 3");

        txtQuestion3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        txtQuestion3.setAutoscrolls(false);
        txtQuestion3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtQuestion3.setFocusable(false);

        spQuestion3.setForeground(new java.awt.Color(204, 204, 204));

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Eliminar");
        btnDelete.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDelete.setBorderPainted(false);
        btnDelete.setFocusPainted(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnChange.setBackground(new java.awt.Color(33, 150, 243));
        btnChange.setForeground(new java.awt.Color(255, 255, 255));
        btnChange.setText("Cambiar");
        btnChange.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnChange.setBorderPainted(false);
        btnChange.setFocusPainted(false);
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        progress.setForeground(new java.awt.Color(255, 255, 255));
        progress.setAnchoProgress(6);
        progress.setPreferredSize(new java.awt.Dimension(34, 34));

        txtAnswer1.setAutoscrolls(false);
        txtAnswer1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtAnswer1.setFocusable(false);

        spAnswer1.setForeground(new java.awt.Color(204, 204, 204));

        txtAnswer2.setAutoscrolls(false);
        txtAnswer2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtAnswer2.setFocusable(false);

        sptAnswer2.setForeground(new java.awt.Color(204, 204, 204));

        txtAnswer3.setAutoscrolls(false);
        txtAnswer3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtAnswer3.setFocusable(false);

        spAnswer3.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(txtQuestion3)
                            .addComponent(spQuestion3, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnswer3)
                            .addComponent(spAnswer3, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(txtQuestion1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                            .addComponent(spQuestion1)
                            .addComponent(jLabel3)
                            .addComponent(txtQuestion2)
                            .addComponent(spQuestion2)
                            .addComponent(txtAnswer1)
                            .addComponent(spAnswer1)
                            .addComponent(txtAnswer2)
                            .addComponent(sptAnswer2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 157, Short.MAX_VALUE)
                        .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(spQuestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAnswer1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(spAnswer1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuestion2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(spQuestion2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAnswer2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sptAnswer2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuestion3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(spQuestion3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAnswer3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(spAnswer3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
            progress.setForeground(new Color(33, 150, 243));
            disable();
            new Thread(()->{
                if(classSecurityQuestions.delete(true)){
                    technonizer.TechnoNizer.admin.jpSeUs();
                    controller.jpSeUs.questions();
                    controller.jpSeQuAdm.loadConfQuestion(1);
                    standardization.showMessage("ok", "Exito al eliminar");
                }
                else
                    standardization.showMessage("cancel", "No se logro eliminar");
                progress.setForeground(new Color(33, 150, 243));
                enable();
            }).start();


    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        disable();
        controller.jpSeQuAdm.loadConfQuestion(1);
        classSecurityQuestions.change = true;
        enable();
    }//GEN-LAST:event_btnChangeActionPerformed

    public void disable(){
        btnDelete.setEnabled(false);
        btnChange.setEnabled(false);
    }
    
    public void enable(){
        btnDelete.setEnabled(true);
        btnChange.setEnabled(true);
    }
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private rojerusan.componentes.RSProgressMaterial progress;
    private javax.swing.JSeparator spAnswer1;
    private javax.swing.JSeparator spAnswer3;
    private javax.swing.JSeparator spQuestion1;
    private javax.swing.JSeparator spQuestion2;
    private javax.swing.JSeparator spQuestion3;
    private javax.swing.JSeparator sptAnswer2;
    private javax.swing.JTextField txtAnswer1;
    private javax.swing.JTextField txtAnswer2;
    private javax.swing.JTextField txtAnswer3;
    private javax.swing.JTextField txtQuestion1;
    private javax.swing.JTextField txtQuestion2;
    private javax.swing.JTextField txtQuestion3;
    // End of variables declaration//GEN-END:variables
}
