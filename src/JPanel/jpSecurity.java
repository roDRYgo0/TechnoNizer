package JPanel;

import sucurity.jpAuthenticator;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Properties;
import javaClass.classSecurityQuestions;
import javaClass.classUsuario;
import javaClass.controller;
import properties.propiedades;
import sucurity.jpChangePassword;
import sucurity.jpSecurityQuestions;

public class jpSecurity extends javax.swing.JPanel {

    boolean perm;
    
    void verificaridioma()
    {
  Properties pr = new propiedades (controller.idioma);
lblSecurity.setText(pr.getProperty("lblSecurity"));
SecondlblSecurity.setText(pr.getProperty("SecondlblSecurity"));
SecurityQuestionslbl.setText(pr.getProperty("SecurityQuestionslbl"));
lblStatusAuthen.setText(pr.getProperty("lblStatusAuthen"));
lblStatusQuestions.setText(pr.getProperty("lblStatusQuestions"));
    }
    
    public jpSecurity() {
        initComponents();
        loadImage();
        jpShow.setPreferredSize(new Dimension(445, 465));
        checkAccount();
        perm=true;
        
        load();
        verificaridioma();
    }
    
    void load(){
        
        if(classUsuario.getKeygen().equals("null")){
            lblStatusAuthen.setText("No configurado");
            lblStatusAuthen.setForeground(Color.red);
        }else{
            lblStatusAuthen.setText("Configurado");
            lblStatusAuthen.setForeground(Color.green);
        }
        if(classSecurityQuestions.getQuestions()[0]==null){
            lblStatusQuestions.setText("No configuradas");
            lblStatusQuestions.setForeground(Color.red);
        }else{
            lblStatusQuestions.setText("Configuradas");
            lblStatusQuestions.setForeground(Color.green);
        }
        if(classUsuario.getCondition()==1){
            jpBackAuthen.setBackground(Color.red);
            jpBackSecQuestions.setBackground(Color.red);
            perm=false;
        }
    }
    
    void loadImage(){
        iconPass.setIcon(new controller().changeImage("/imagenes/password.png", 45, 45));
        iconAuthen.setIcon(new controller().changeImage("/imagenes/authenticator.png", 45, 45));
        iconSecQuestions.setIcon(new controller().changeImage("/imagenes/questions.png", 45, 45));
    }
    
    void resetColor(){
        jpBackPass.setBackground(Color.white);
        jpBackAuthen.setBackground(Color.white);
        jpBackSecQuestions.setBackground(Color.white);
    }
    
    public void endAuthenticator(String keygen){
        controller.jpCa = new jpCheckAuthenticator(keygen);
        
        controller.jpCa.setSize(445, 465);
        controller.jpCa.setLocation(0,0);
        
        jpShow.removeAll();
        jpShow.add(controller.jpCa,BorderLayout.CENTER);
        jpShow.revalidate();
        jpShow.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSecurity = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jpBackPass = new javax.swing.JPanel();
        jpFrontPass = new javax.swing.JPanel();
        iconPass = new javax.swing.JLabel();
        SecondlblSecurity = new javax.swing.JLabel();
        jpBackAuthen = new javax.swing.JPanel();
        jpFrontAuthen = new javax.swing.JPanel();
        iconAuthen = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblStatusAuthen = new javax.swing.JLabel();
        jpBackSecQuestions = new javax.swing.JPanel();
        jpFrontSecQuestions = new javax.swing.JPanel();
        iconSecQuestions = new javax.swing.JLabel();
        SecurityQuestionslbl = new javax.swing.JLabel();
        lblStatusQuestions = new javax.swing.JLabel();
        jpShow = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(980, 601));
        setMinimumSize(new java.awt.Dimension(980, 601));
        setPreferredSize(new java.awt.Dimension(980, 601));

        lblSecurity.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSecurity.setForeground(new java.awt.Color(255, 0, 0));
        lblSecurity.setText("Seguridad");
        lblSecurity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSecurityMouseReleased(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jpBackPass.setBackground(new java.awt.Color(255, 255, 255));

        jpFrontPass.setBackground(new java.awt.Color(245, 245, 245));
        jpFrontPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jpFrontPassMouseReleased(evt);
            }
        });

        iconPass.setMaximumSize(new java.awt.Dimension(45, 45));
        iconPass.setMinimumSize(new java.awt.Dimension(45, 45));
        iconPass.setPreferredSize(new java.awt.Dimension(45, 45));

        SecondlblSecurity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SecondlblSecurity.setText("Cambiar contraseña");

        javax.swing.GroupLayout jpFrontPassLayout = new javax.swing.GroupLayout(jpFrontPass);
        jpFrontPass.setLayout(jpFrontPassLayout);
        jpFrontPassLayout.setHorizontalGroup(
            jpFrontPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFrontPassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SecondlblSecurity)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        jpFrontPassLayout.setVerticalGroup(
            jpFrontPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFrontPassLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpFrontPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFrontPassLayout.createSequentialGroup()
                        .addComponent(iconPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFrontPassLayout.createSequentialGroup()
                        .addComponent(SecondlblSecurity)
                        .addGap(24, 24, 24))))
        );

        javax.swing.GroupLayout jpBackPassLayout = new javax.swing.GroupLayout(jpBackPass);
        jpBackPass.setLayout(jpBackPassLayout);
        jpBackPassLayout.setHorizontalGroup(
            jpBackPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBackPassLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpFrontPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpBackPassLayout.setVerticalGroup(
            jpBackPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBackPassLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpFrontPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpBackAuthen.setBackground(new java.awt.Color(255, 255, 255));

        jpFrontAuthen.setBackground(new java.awt.Color(245, 245, 245));
        jpFrontAuthen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jpFrontAuthenMouseReleased(evt);
            }
        });

        iconAuthen.setMaximumSize(new java.awt.Dimension(45, 45));
        iconAuthen.setMinimumSize(new java.awt.Dimension(45, 45));
        iconAuthen.setPreferredSize(new java.awt.Dimension(45, 45));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Authenticator");

        lblStatusAuthen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblStatusAuthen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStatusAuthen.setText("No configurado");

        javax.swing.GroupLayout jpFrontAuthenLayout = new javax.swing.GroupLayout(jpFrontAuthen);
        jpFrontAuthen.setLayout(jpFrontAuthenLayout);
        jpFrontAuthenLayout.setHorizontalGroup(
            jpFrontAuthenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFrontAuthenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconAuthen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblStatusAuthen, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpFrontAuthenLayout.setVerticalGroup(
            jpFrontAuthenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFrontAuthenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpFrontAuthenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFrontAuthenLayout.createSequentialGroup()
                        .addComponent(iconAuthen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFrontAuthenLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(24, 24, 24))))
            .addComponent(lblStatusAuthen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpBackAuthenLayout = new javax.swing.GroupLayout(jpBackAuthen);
        jpBackAuthen.setLayout(jpBackAuthenLayout);
        jpBackAuthenLayout.setHorizontalGroup(
            jpBackAuthenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBackAuthenLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jpFrontAuthen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpBackAuthenLayout.setVerticalGroup(
            jpBackAuthenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBackAuthenLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpFrontAuthen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpBackSecQuestions.setBackground(new java.awt.Color(255, 255, 255));

        jpFrontSecQuestions.setBackground(new java.awt.Color(245, 245, 245));
        jpFrontSecQuestions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jpFrontSecQuestionsMouseReleased(evt);
            }
        });

        iconSecQuestions.setMaximumSize(new java.awt.Dimension(45, 45));
        iconSecQuestions.setMinimumSize(new java.awt.Dimension(45, 45));
        iconSecQuestions.setPreferredSize(new java.awt.Dimension(45, 45));

        SecurityQuestionslbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SecurityQuestionslbl.setText("Preguntas de seguridad");

        lblStatusQuestions.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblStatusQuestions.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStatusQuestions.setText("No configuradas");

        javax.swing.GroupLayout jpFrontSecQuestionsLayout = new javax.swing.GroupLayout(jpFrontSecQuestions);
        jpFrontSecQuestions.setLayout(jpFrontSecQuestionsLayout);
        jpFrontSecQuestionsLayout.setHorizontalGroup(
            jpFrontSecQuestionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFrontSecQuestionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconSecQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SecurityQuestionslbl, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addGap(42, 42, 42)
                .addComponent(lblStatusQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpFrontSecQuestionsLayout.setVerticalGroup(
            jpFrontSecQuestionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFrontSecQuestionsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpFrontSecQuestionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFrontSecQuestionsLayout.createSequentialGroup()
                        .addComponent(iconSecQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFrontSecQuestionsLayout.createSequentialGroup()
                        .addComponent(SecurityQuestionslbl)
                        .addGap(24, 24, 24))))
            .addComponent(lblStatusQuestions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpBackSecQuestionsLayout = new javax.swing.GroupLayout(jpBackSecQuestions);
        jpBackSecQuestions.setLayout(jpBackSecQuestionsLayout);
        jpBackSecQuestionsLayout.setHorizontalGroup(
            jpBackSecQuestionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBackSecQuestionsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jpFrontSecQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpBackSecQuestionsLayout.setVerticalGroup(
            jpBackSecQuestionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBackSecQuestionsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpFrontSecQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpShow.setBackground(new java.awt.Color(245, 245, 245));
        jpShow.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        javax.swing.GroupLayout jpShowLayout = new javax.swing.GroupLayout(jpShow);
        jpShow.setLayout(jpShowLayout);
        jpShowLayout.setHorizontalGroup(
            jpShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
        );
        jpShowLayout.setVerticalGroup(
            jpShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lblSecurity))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpBackPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpBackAuthen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpBackSecQuestions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jpShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblSecurity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jpBackPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jpBackAuthen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jpBackSecQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jpFrontPassMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpFrontPassMouseReleased
        if(classUsuario.getCondition()==1){
            
        }else
            resetColor();
        jpBackPass.setBackground(new Color(33,150,243));
        changePassword();
    }//GEN-LAST:event_jpFrontPassMouseReleased

    public void checkAccount(){
        if(classUsuario.getCondition()==1){
            controller.checkAc = new checkAccount();
        
            controller.checkAc.setSize(445, 465);
            controller.checkAc.setLocation(0,0);

            jpShow.removeAll();
            jpShow.add(controller.checkAc,BorderLayout.CENTER);
            jpShow.revalidate();
            jpShow.repaint();
        }else{
            controller.secAcc = new securityAccount();
        
            controller.secAcc.setSize(445, 465);
            controller.secAcc.setLocation(0,0);

            jpShow.removeAll();
            jpShow.add(controller.secAcc,BorderLayout.CENTER);
            jpShow.revalidate();
            jpShow.repaint();
        }
    }
    
    public void changePassword(){
        controller.jpCp = new jpChangePassword();
                
        controller.jpCp.setSize(445, 465);
        controller.jpCp.setLocation(0,0);
        
        jpShow.removeAll();
        jpShow.add(controller.jpCp,BorderLayout.CENTER);
        jpShow.revalidate();
        jpShow.repaint();
        
    }
    
    private void jpFrontAuthenMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpFrontAuthenMouseReleased
        if(perm){
            resetColor();
            changeColorAuthen();
            if(classUsuario.getKeygen().equals("null"))
                newAuthenticator();
            else
                authenticator();
        }else
            Toolkit.getDefaultToolkit().beep();
        
    }//GEN-LAST:event_jpFrontAuthenMouseReleased

    public void changeColorAuthen(){
        jpBackAuthen.setBackground(new Color(33,150,243));
    }
    
    public void newAuthenticator(){
        controller.jpAu = new jpConfAuthenticator();
        
        controller.jpAu.setSize(445, 465);
        controller.jpAu.setLocation(0,0);
        
        jpShow.removeAll();
        jpShow.add(controller.jpAu,BorderLayout.CENTER);
        jpShow.revalidate();
        jpShow.repaint();
    }
    
    public void authenticator(){
        controller.jpAuthe = new jpAuthenticator();
        
        controller.jpAuthe.setSize(445, 465);
        controller.jpAuthe.setLocation(0,0);
        
        jpShow.removeAll();
        jpShow.add(controller.jpAuthe,BorderLayout.CENTER);
        jpShow.revalidate();
        jpShow.repaint();
    }
    
    public void questions(){
        controller.jpSeQue = new jpSecurityQuestions();
        
        controller.jpSeQue.setSize(445, 465);
        controller.jpSeQue.setLocation(0,0);
        
        jpShow.removeAll();
        jpShow.add(controller.jpSeQue,BorderLayout.CENTER);
        jpShow.revalidate();
        jpShow.repaint();
    }
    
    private void jpFrontSecQuestionsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpFrontSecQuestionsMouseReleased
        if(perm){
            resetColor();
            jpBackSecQuestions.setBackground(new Color(33,150,243));
            controller.questions = new String[3];
            controller.answers = new String[3];
            questions();
        }else
            Toolkit.getDefaultToolkit().beep();
        
    }//GEN-LAST:event_jpFrontSecQuestionsMouseReleased

    private void lblSecurityMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSecurityMouseReleased
        checkAccount();
        resetColor();
        jpBackAuthen.setBackground(Color.red);
        jpBackSecQuestions.setBackground(Color.red);
    }//GEN-LAST:event_lblSecurityMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SecondlblSecurity;
    private javax.swing.JLabel SecurityQuestionslbl;
    private javax.swing.JLabel iconAuthen;
    private javax.swing.JLabel iconPass;
    private javax.swing.JLabel iconSecQuestions;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpBackAuthen;
    private javax.swing.JPanel jpBackPass;
    private javax.swing.JPanel jpBackSecQuestions;
    private javax.swing.JPanel jpFrontAuthen;
    private javax.swing.JPanel jpFrontPass;
    private javax.swing.JPanel jpFrontSecQuestions;
    private javax.swing.JPanel jpShow;
    private javax.swing.JLabel lblSecurity;
    private javax.swing.JLabel lblStatusAuthen;
    private javax.swing.JLabel lblStatusQuestions;
    // End of variables declaration//GEN-END:variables
}
