package sucurity;

import java.awt.BorderLayout;
import java.util.Properties;
import javaClass.classSecurityQuestions;
import javaClass.controller;
import properties.propiedades;

public class jpSecurityQuestions extends javax.swing.JPanel {

    void verificaridioma()
    {
  Properties pr = new propiedades (controller.idioma);
    lblQuestionBankTitle.setText(pr.getProperty("lblQuestionBankTitle"));
    }
    
    public jpSecurityQuestions() {
        initComponents();
        verificaridioma();
        load();
    }

    void load(){
        if(classSecurityQuestions.getQuestions()[0]==null)
            loadConfQuestion(1);
        else
            loadQuestions();
    }
    
    public void loadConfQuestion(int i){
        questionsConf question = new questionsConf(i);
        question.setSize(425, 379);
        question.setLocation(0,0);

        rootPaneSecurity.removeAll();
        rootPaneSecurity.add(question,BorderLayout.CENTER);
        rootPaneSecurity.revalidate();
        rootPaneSecurity.repaint();
    }
    
    public void loadQuestions(){
        jpQuestions question = new jpQuestions();
        question.setSize(425, 379);
        question.setLocation(0,0);

        rootPaneSecurity.removeAll();
        rootPaneSecurity.add(question,BorderLayout.CENTER);
        rootPaneSecurity.revalidate();
        rootPaneSecurity.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblQuestionBankTitle = new javax.swing.JLabel();
        rootPaneSecurity = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(445, 465));
        setMinimumSize(new java.awt.Dimension(445, 465));

        lblQuestionBankTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblQuestionBankTitle.setText("Banco de preguntas");
        lblQuestionBankTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout rootPaneSecurityLayout = new javax.swing.GroupLayout(rootPaneSecurity);
        rootPaneSecurity.setLayout(rootPaneSecurityLayout);
        rootPaneSecurityLayout.setHorizontalGroup(
            rootPaneSecurityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        rootPaneSecurityLayout.setVerticalGroup(
            rootPaneSecurityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(lblQuestionBankTitle)
                .addContainerGap(144, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rootPaneSecurity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblQuestionBankTitle)
                .addGap(18, 18, 18)
                .addComponent(rootPaneSecurity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblQuestionBankTitle;
    private javax.swing.JPanel rootPaneSecurity;
    // End of variables declaration//GEN-END:variables
}
