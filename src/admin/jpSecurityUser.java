package admin;

import java.awt.BorderLayout;
import java.awt.Color;
import javaClass.classUsuario;
import javaClass.controller;


/** @author rodri */

public class jpSecurityUser extends javax.swing.JPanel {

    public jpSecurityUser() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jpBackSecQuestions = new javax.swing.JPanel();
        jpFrontSecQuestions = new javax.swing.JPanel();
        iconSecQuestions = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jpBackPass = new javax.swing.JPanel();
        jpFrontPass = new javax.swing.JPanel();
        iconPass = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jpShow = new javax.swing.JPanel();
        jpBackAuthen = new javax.swing.JPanel();
        jpFrontAuthen = new javax.swing.JPanel();
        iconAuthen = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jpBackSecQuestions1 = new javax.swing.JPanel();
        jpFrontSecQuestions1 = new javax.swing.JPanel();
        iconSecQuestions1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(980, 601));
        setMinimumSize(new java.awt.Dimension(980, 601));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Seguridad y estadísticas");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel1MouseReleased(evt);
            }
        });

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

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Preguntas de seguridad");

        javax.swing.GroupLayout jpFrontSecQuestionsLayout = new javax.swing.GroupLayout(jpFrontSecQuestions);
        jpFrontSecQuestions.setLayout(jpFrontSecQuestionsLayout);
        jpFrontSecQuestionsLayout.setHorizontalGroup(
            jpFrontSecQuestionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFrontSecQuestionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconSecQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addGap(172, 172, 172))
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
                        .addComponent(jLabel5)
                        .addGap(24, 24, 24))))
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

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Cambiar contraseña");

        javax.swing.GroupLayout jpFrontPassLayout = new javax.swing.GroupLayout(jpFrontPass);
        jpFrontPass.setLayout(jpFrontPassLayout);
        jpFrontPassLayout.setHorizontalGroup(
            jpFrontPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFrontPassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
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
                        .addComponent(jLabel3)
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

        jpShow.setBackground(new java.awt.Color(245, 245, 245));

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

        javax.swing.GroupLayout jpFrontAuthenLayout = new javax.swing.GroupLayout(jpFrontAuthen);
        jpFrontAuthen.setLayout(jpFrontAuthenLayout);
        jpFrontAuthenLayout.setHorizontalGroup(
            jpFrontAuthenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFrontAuthenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconAuthen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jpBackSecQuestions1.setBackground(new java.awt.Color(255, 255, 255));

        jpFrontSecQuestions1.setBackground(new java.awt.Color(245, 245, 245));
        jpFrontSecQuestions1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jpFrontSecQuestions1MouseReleased(evt);
            }
        });

        iconSecQuestions1.setMaximumSize(new java.awt.Dimension(45, 45));
        iconSecQuestions1.setMinimumSize(new java.awt.Dimension(45, 45));
        iconSecQuestions1.setPreferredSize(new java.awt.Dimension(45, 45));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Estadísticas");

        javax.swing.GroupLayout jpFrontSecQuestions1Layout = new javax.swing.GroupLayout(jpFrontSecQuestions1);
        jpFrontSecQuestions1.setLayout(jpFrontSecQuestions1Layout);
        jpFrontSecQuestions1Layout.setHorizontalGroup(
            jpFrontSecQuestions1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFrontSecQuestions1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconSecQuestions1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addGap(172, 172, 172))
        );
        jpFrontSecQuestions1Layout.setVerticalGroup(
            jpFrontSecQuestions1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFrontSecQuestions1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpFrontSecQuestions1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFrontSecQuestions1Layout.createSequentialGroup()
                        .addComponent(iconSecQuestions1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFrontSecQuestions1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(24, 24, 24))))
        );

        javax.swing.GroupLayout jpBackSecQuestions1Layout = new javax.swing.GroupLayout(jpBackSecQuestions1);
        jpBackSecQuestions1.setLayout(jpBackSecQuestions1Layout);
        jpBackSecQuestions1Layout.setHorizontalGroup(
            jpBackSecQuestions1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBackSecQuestions1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jpFrontSecQuestions1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpBackSecQuestions1Layout.setVerticalGroup(
            jpBackSecQuestions1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBackSecQuestions1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpFrontSecQuestions1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(jLabel1))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(310, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpBackPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpBackAuthen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpBackSecQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpBackSecQuestions1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpBackSecQuestions1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpBackPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpBackAuthen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpBackSecQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseReleased
        resetColor();
        jpBackAuthen.setBackground(Color.red);
        jpBackSecQuestions.setBackground(Color.red);
    }//GEN-LAST:event_jLabel1MouseReleased

    private void jpFrontSecQuestionsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpFrontSecQuestionsMouseReleased
        resetColor();
        
        jpBackSecQuestions.setBackground(new Color(33,150,243));
        controller.questions = new String[3];
        controller.answers = new String[3];
        questions();


    }//GEN-LAST:event_jpFrontSecQuestionsMouseReleased

    private void jpFrontPassMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpFrontPassMouseReleased
        resetColor();
        jpBackPass.setBackground(new Color(33,150,243));
        changePassword();
    }//GEN-LAST:event_jpFrontPassMouseReleased

    private void jpFrontAuthenMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpFrontAuthenMouseReleased

        resetColor();
        jpBackAuthen.setBackground(new Color(33,150,243));
        if(classUsuario.getKeygen().equals("null"))
            newAuthenticator();
        else
            authenticator();

    }//GEN-LAST:event_jpFrontAuthenMouseReleased

    private void jpFrontSecQuestions1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpFrontSecQuestions1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jpFrontSecQuestions1MouseReleased

    void resetColor(){
        jpBackPass.setBackground(Color.white);
        jpBackAuthen.setBackground(Color.white);
        jpBackSecQuestions.setBackground(Color.white);
    }
    
    public void changePassword(){
        jpChangePasswordAdmin jpChPass = new jpChangePasswordAdmin();
                
        jpChPass.setSize(445, 465);
        jpChPass.setLocation(0,0);
        
        jpShow.removeAll();
        jpShow.add(jpChPass, BorderLayout.CENTER);
        jpShow.revalidate();
        jpShow.repaint();
    }
    
    public void changeColorAuthen(){
        resetColor();
        jpBackAuthen.setBackground(new Color(33,150,243));
    }
    
    public void authenticator(){
        jpAuthenticatorAdmin jpAuthe = new jpAuthenticatorAdmin();
        
        jpAuthe.setSize(445, 465);
        jpAuthe.setLocation(0,0);
        
        jpShow.removeAll();
        jpShow.add(jpAuthe,BorderLayout.CENTER);
        jpShow.revalidate();
        jpShow.repaint();
    }
    
    public void newAuthenticator(){
        jpConfAuthenticatorAdmin jpAu = new jpConfAuthenticatorAdmin();
        
        jpAu.setSize(445, 465);
        jpAu.setLocation(0,0);
        
        jpShow.removeAll();
        jpShow.add(jpAu,BorderLayout.CENTER);
        jpShow.revalidate();
        jpShow.repaint();
    }

    public void questions(){
        controller.jpSeQuAdm = new jpSecurityQuestionsAdmin();
        
        controller.jpSeQuAdm.setSize(445, 465);
        controller.jpSeQuAdm.setLocation(0,0);
        
        jpShow.removeAll();
        jpShow.add(controller.jpSeQuAdm, BorderLayout.CENTER);
        jpShow.revalidate();
        jpShow.repaint();
    }
    
    public void endAuthenticator(String keygen){
        jpCheckAuthenticatorAdmin jpCa = new jpCheckAuthenticatorAdmin(keygen);
        
        jpCa.setSize(445, 465);
        jpCa.setLocation(0,0);
        
        jpShow.removeAll();
        jpShow.add(jpCa,BorderLayout.CENTER);
        jpShow.revalidate();
        jpShow.repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconAuthen;
    private javax.swing.JLabel iconPass;
    private javax.swing.JLabel iconSecQuestions;
    private javax.swing.JLabel iconSecQuestions1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpBackAuthen;
    private javax.swing.JPanel jpBackPass;
    private javax.swing.JPanel jpBackSecQuestions;
    private javax.swing.JPanel jpBackSecQuestions1;
    private javax.swing.JPanel jpFrontAuthen;
    private javax.swing.JPanel jpFrontPass;
    private javax.swing.JPanel jpFrontSecQuestions;
    private javax.swing.JPanel jpFrontSecQuestions1;
    private javax.swing.JPanel jpShow;
    // End of variables declaration//GEN-END:variables
}
