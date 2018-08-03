package sucurity;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javaClass.classSecurityQuestions;
import javaClass.controller;
import javaClass.standardization;

public class questionsConf extends javax.swing.JPanel {

    int numQues, pos;
    
    boolean va;
    
    public questionsConf(int i) {
        initComponents();
        va = false;
        this.numQues = i;
        lblQuestion.setText(lblQuestion.getText()+" "+i);
        load();
    }
    
    void load(){
        for(int i = 0; i < classSecurityQuestions.allNumQuestion; i++){
            for(int e = 0; e < 3; e++){
                if(classSecurityQuestions.getAllQuestions()[i].equals(classSecurityQuestions.getQuestions()[e]))
                    va = true;
            }
            if(!va){
                cmbQuestion.addItem(classSecurityQuestions.getAllQuestions()[i]);
                va=false;
            }else
                va=false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblQuestion = new javax.swing.JLabel();
        cmbQuestion = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtAnswer = new javax.swing.JTextField();
        spAnswer = new javax.swing.JSeparator();
        btnNext = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(425, 379));
        setMinimumSize(new java.awt.Dimension(425, 379));
        setPreferredSize(new java.awt.Dimension(425, 379));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Conigura tus preguntas de seguridad");

        jLabel2.setText("Selecciona tus preguntas de seguridad, ");

        jLabel3.setText("estas nos ayudaran a validar tu identidad.");

        lblQuestion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblQuestion.setText("Pregunta");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Respuesta");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(cmbQuestion, 0, 378, Short.MAX_VALUE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtAnswer)
                                    .addComponent(spAnswer)
                                    .addComponent(lblQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(jLabel3)
                .addGap(52, 52, 52)
                .addComponent(lblQuestion)
                .addGap(18, 18, 18)
                .addComponent(cmbQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(spAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
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
        char c = evt.getKeyChar();
        if(c == ' ')
        evt.consume();
    }//GEN-LAST:event_txtAnswerKeyTyped

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if(cmbQuestion.getSelectedIndex()==-1 || standardization.campoVacio(txtAnswer.getText()))
            standardization.showMessage("warning", "Llene todos los campos por favor");
        else{
            System.out.println(pos+"    d    "+ (numQues-1));
            classSecurityQuestions.setQuestions(cmbQuestion.getSelectedItem().toString(),numQues-1);
            controller.jpSeQue.loadConfQuestion(numQues+1);
        }
    }//GEN-LAST:event_btnNextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JComboBox<String> cmbQuestion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JSeparator spAnswer;
    private javax.swing.JTextField txtAnswer;
    // End of variables declaration//GEN-END:variables
}
