package JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Properties;
import javaClass.classSecurityQuestions;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.methodsSQL;
import javaClass.standardization;
import javaClass.usersBinnacle;
import properties.propiedades;

/** @author rodri */

public class jpQuestions extends javax.swing.JPanel {

    int numQues;
    
    void verificaridioma()
    {
       Properties pr= new propiedades(controller.idioma);
       lbl1Questions.setText(pr.getProperty("lbl1Questions"));
       lbl2Questions.setText(pr.getProperty("lbl2Questions"));
       lbl3Questions.setText(pr.getProperty("lbl3Questions"));
       lbl4Questions.setText(pr.getProperty("lbl4Questions"));
       lbl5Questions.setText(pr.getProperty("lbl5Questions"));
       btnNext.setText(pr.getProperty("btnNextQuestions"));
        
    }
    
    public jpQuestions(int i) {
        initComponents();
        this.numQues = i;
        iconSecQuestions.setIcon(new controller().changeImage("/imagenes/questions.png", 45, 45));
        lblQuestion.setText(classSecurityQuestions.getQuestions()[numQues]);
        verificaridioma();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl5Questions = new javax.swing.JLabel();
        txtAnswer = new javax.swing.JTextField();
        spAnswer = new javax.swing.JSeparator();
        btnNext = new javax.swing.JButton();
        progress = new rojerusan.componentes.RSProgressMaterial();
        lbl1Questions = new javax.swing.JLabel();
        lbl2Questions = new javax.swing.JLabel();
        lbl3Questions = new javax.swing.JLabel();
        iconSecQuestions = new javax.swing.JLabel();
        lbl4Questions = new javax.swing.JLabel();
        lblQuestion = new javax.swing.JTextField();
        spQuestion1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(420, 603));
        setMinimumSize(new java.awt.Dimension(420, 603));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(420, 603));

        lbl5Questions.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl5Questions.setText("Respuesta");

        txtAnswer.setAutoscrolls(false);
        txtAnswer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtAnswer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAnswerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAnswerFocusLost(evt);
            }
        });
        txtAnswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAnswerKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnswerKeyTyped(evt);
            }
        });

        spAnswer.setForeground(new java.awt.Color(204, 204, 204));

        btnNext.setBackground(new java.awt.Color(0, 153, 255));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Siguiente");
        btnNext.setBorderPainted(false);
        btnNext.setFocusable(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        progress.setForeground(new java.awt.Color(255, 255, 255));
        progress.setAnchoProgress(6);
        progress.setPreferredSize(new java.awt.Dimension(34, 34));

        lbl1Questions.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl1Questions.setText("Contesta las preguntas");

        lbl2Questions.setText("Para poder recuperar tu contraseña");

        lbl3Questions.setText("primero necesitamos verificar tu identidad.");

        iconSecQuestions.setMaximumSize(new java.awt.Dimension(45, 45));
        iconSecQuestions.setMinimumSize(new java.awt.Dimension(45, 45));
        iconSecQuestions.setPreferredSize(new java.awt.Dimension(45, 45));

        lbl4Questions.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl4Questions.setForeground(new java.awt.Color(33, 150, 243));
        lbl4Questions.setText("Pregunta");

        lblQuestion.setAutoscrolls(false);
        lblQuestion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lblQuestion.setFocusable(false);

        spQuestion1.setForeground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl1Questions)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(iconSecQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl3Questions)
                                    .addComponent(lbl2Questions, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl5Questions)
                            .addComponent(lblQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                            .addComponent(spQuestion1)
                            .addComponent(lbl4Questions, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnswer)
                            .addComponent(spAnswer))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lbl1Questions)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconSecQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl2Questions)
                        .addGap(1, 1, 1)
                        .addComponent(lbl3Questions)))
                .addGap(79, 79, 79)
                .addComponent(lbl4Questions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(spQuestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lbl5Questions)
                .addGap(18, 18, 18)
                .addComponent(txtAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(spAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnswerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAnswerFocusGained
        spAnswer.setBackground(Color.red);
    }//GEN-LAST:event_txtAnswerFocusGained

    private void txtAnswerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAnswerFocusLost
        spAnswer.setBackground(Color.white);
    }//GEN-LAST:event_txtAnswerFocusLost

    private void txtAnswerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnswerKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
            btnNextActionPerformed(null);
    }//GEN-LAST:event_txtAnswerKeyPressed

    private void txtAnswerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnswerKeyTyped
        //        char c = evt.getKeyChar();
        //        if(c == ' ')
        //        evt.consume();
    }//GEN-LAST:event_txtAnswerKeyTyped

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if(standardization.campoVacio(txtAnswer.getText()))
            standardization.showMessage("warning", "Llene todos los campos por favor");
        else{
            if(numQues==2){
                if(txtAnswer.getText().trim().equals(classSecurityQuestions.getAswers()[numQues]))
                    classSecurityQuestions.answ++;
                if(classSecurityQuestions.answ == 3){
                    controller.jpNP = new jpNewPassword();
        
                    controller.jpNP.setSize(420,603);
                    controller.jpNP.setLocation(0,0);

                    controller.rootPane.removeAll();
                    controller.rootPane.add(controller.jpNP,BorderLayout.CENTER);
                    controller.rootPane.revalidate();
                    controller.rootPane.repaint();
                    classSecurityQuestions.answ = 0;
                }else{
                    controller.jpRP = new jpRecoverPasswordMail();
        
                    controller.jpRP.setSize(420,603);
                    controller.jpRP.setLocation(0,0);
                    controller.rootPane.removeAll();
                    controller.rootPane.add(controller.jpRP,BorderLayout.CENTER);
                    controller.rootPane.revalidate();
                    controller.rootPane.repaint();
                    new Thread(()->{
                        usersBinnacle.binnacle(17);
                    }).start();
                    standardization.showMessage("cancel", "No todas las respuestas coinciden");
                    classSecurityQuestions.answ = 0;
                }
            }else{
                if(txtAnswer.getText().trim().equals(classSecurityQuestions.getAswers()[numQues]))
                    classSecurityQuestions.answ++;
                loadConfQuestion(numQues+1);
            }
        }
    }//GEN-LAST:event_btnNextActionPerformed

    public void loadConfQuestion(int i){
        jpQuestions question = new jpQuestions(i);
        question.setSize(420, 603);
        question.setLocation(0,0);

        controller.rootPane.removeAll();
        controller.rootPane.add(question,BorderLayout.CENTER);
        controller.rootPane.revalidate();
        controller.rootPane.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel iconSecQuestions;
    private javax.swing.JLabel lbl1Questions;
    private javax.swing.JLabel lbl2Questions;
    private javax.swing.JLabel lbl3Questions;
    private javax.swing.JLabel lbl4Questions;
    private javax.swing.JLabel lbl5Questions;
    private javax.swing.JTextField lblQuestion;
    private rojerusan.componentes.RSProgressMaterial progress;
    private javax.swing.JSeparator spAnswer;
    private javax.swing.JSeparator spQuestion1;
    private javax.swing.JTextField txtAnswer;
    // End of variables declaration//GEN-END:variables
}
