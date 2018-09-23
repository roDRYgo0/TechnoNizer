package admin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Properties;
import javaClass.classAdmin;
import javaClass.classUsuario;
import javaClass.controller;
import properties.propiedades;


/** @author rodri */

public class jpSecurityUser extends javax.swing.JPanel {

    void verificaridioma()
    {
        Properties pr= new propiedades(controller.idioma);
        lbljpSecurityUser1.setText(pr.getProperty("lbljpSecurityUser1"));
        lbljpSecurityUser2.setText(pr.getProperty("lbljpSecurityUser2"));
        lbljpSecurityUser3.setText(pr.getProperty("lbljpSecurityUser3"));
        lbljpSecurityUser4.setText(pr.getProperty("lbljpSecurityUser4"));
        lbljpSecurityUser5.setText(pr.getProperty("lbljpSecurityUser5"));
    }
    
    public jpSecurityUser() {
        initComponents();
        verificaridioma();
        jpStats();
        jpBackStats.setBackground(new Color(33,150,243));
        loadImage();
        loadLogs();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbljpSecurityUser1 = new javax.swing.JLabel();
        jpBackSecQuestions = new javax.swing.JPanel();
        jpFrontSecQuestions = new javax.swing.JPanel();
        iconSecQuestions = new javax.swing.JLabel();
        lbljpSecurityUser5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jpBackPass = new javax.swing.JPanel();
        jpFrontPass = new javax.swing.JPanel();
        iconPass = new javax.swing.JLabel();
        lbljpSecurityUser3 = new javax.swing.JLabel();
        jpShow = new javax.swing.JPanel();
        jpBackAuthen = new javax.swing.JPanel();
        jpFrontAuthen = new javax.swing.JPanel();
        iconAuthen = new javax.swing.JLabel();
        lbljpSecurityUser4 = new javax.swing.JLabel();
        jpBackStats = new javax.swing.JPanel();
        jpFrontStats = new javax.swing.JPanel();
        iconStats = new javax.swing.JLabel();
        lbljpSecurityUser2 = new javax.swing.JLabel();
        scrollLogs = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(980, 601));
        setMinimumSize(new java.awt.Dimension(980, 601));

        lbljpSecurityUser1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbljpSecurityUser1.setForeground(new java.awt.Color(255, 0, 0));
        lbljpSecurityUser1.setText("Seguridad y estadísticas");
        lbljpSecurityUser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbljpSecurityUser1MouseReleased(evt);
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

        lbljpSecurityUser5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbljpSecurityUser5.setText("Preguntas de seguridad");

        javax.swing.GroupLayout jpFrontSecQuestionsLayout = new javax.swing.GroupLayout(jpFrontSecQuestions);
        jpFrontSecQuestions.setLayout(jpFrontSecQuestionsLayout);
        jpFrontSecQuestionsLayout.setHorizontalGroup(
            jpFrontSecQuestionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFrontSecQuestionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconSecQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbljpSecurityUser5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
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
                        .addComponent(lbljpSecurityUser5)
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

        lbljpSecurityUser3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbljpSecurityUser3.setText("Cambiar contraseña");

        javax.swing.GroupLayout jpFrontPassLayout = new javax.swing.GroupLayout(jpFrontPass);
        jpFrontPass.setLayout(jpFrontPassLayout);
        jpFrontPassLayout.setHorizontalGroup(
            jpFrontPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFrontPassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbljpSecurityUser3)
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
                        .addComponent(lbljpSecurityUser3)
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

        lbljpSecurityUser4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbljpSecurityUser4.setText("Authenticator");

        javax.swing.GroupLayout jpFrontAuthenLayout = new javax.swing.GroupLayout(jpFrontAuthen);
        jpFrontAuthen.setLayout(jpFrontAuthenLayout);
        jpFrontAuthenLayout.setHorizontalGroup(
            jpFrontAuthenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFrontAuthenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconAuthen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbljpSecurityUser4)
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
                        .addComponent(lbljpSecurityUser4)
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

        jpBackStats.setBackground(new java.awt.Color(255, 255, 255));

        jpFrontStats.setBackground(new java.awt.Color(245, 245, 245));
        jpFrontStats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jpFrontStatsMouseReleased(evt);
            }
        });

        iconStats.setMaximumSize(new java.awt.Dimension(45, 45));
        iconStats.setMinimumSize(new java.awt.Dimension(45, 45));
        iconStats.setPreferredSize(new java.awt.Dimension(45, 45));

        lbljpSecurityUser2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbljpSecurityUser2.setText("Estadísticas");

        javax.swing.GroupLayout jpFrontStatsLayout = new javax.swing.GroupLayout(jpFrontStats);
        jpFrontStats.setLayout(jpFrontStatsLayout);
        jpFrontStatsLayout.setHorizontalGroup(
            jpFrontStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFrontStatsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconStats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbljpSecurityUser2, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addGap(172, 172, 172))
        );
        jpFrontStatsLayout.setVerticalGroup(
            jpFrontStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFrontStatsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpFrontStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFrontStatsLayout.createSequentialGroup()
                        .addComponent(iconStats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFrontStatsLayout.createSequentialGroup()
                        .addComponent(lbljpSecurityUser2)
                        .addGap(24, 24, 24))))
        );

        javax.swing.GroupLayout jpBackStatsLayout = new javax.swing.GroupLayout(jpBackStats);
        jpBackStats.setLayout(jpBackStatsLayout);
        jpBackStatsLayout.setHorizontalGroup(
            jpBackStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBackStatsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jpFrontStats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpBackStatsLayout.setVerticalGroup(
            jpBackStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBackStatsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpFrontStats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        scrollLogs.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(33, 150, 243));
        jLabel2.setText("Logs");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lbljpSecurityUser1))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jpBackPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jpBackAuthen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jpBackSecQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jpBackStats, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollLogs, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lbljpSecurityUser1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpBackStats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpBackPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpBackAuthen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpBackSecQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollLogs, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbljpSecurityUser1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbljpSecurityUser1MouseReleased
        resetColor();
        jpBackAuthen.setBackground(Color.red);
        jpBackSecQuestions.setBackground(Color.red);
    }//GEN-LAST:event_lbljpSecurityUser1MouseReleased

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

    private void jpFrontStatsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpFrontStatsMouseReleased
        jpStats();
    }//GEN-LAST:event_jpFrontStatsMouseReleased

    void loadLogs(){
        admin.logs l = new admin.logs();
        l.setLocation(0,0);

        l.setPreferredSize(new Dimension(488, 144+(34*classAdmin.getSpaceLog())));
        System.out.println(classAdmin.logs.size());
        scrollLogs.setViewportView(l);
        scrollLogs.revalidate();
        scrollLogs.repaint();
    }
    
    void resetColor(){
        jpBackStats.setBackground(Color.white);
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
    
    public void jpStats(){
        jpStats jpSt = new jpStats();
                
        jpSt.setSize(445, 465);
        jpSt.setLocation(0,0);
        
        jpShow.removeAll();
        jpShow.add(jpSt, BorderLayout.CENTER);
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
    
    void loadImage(){
        iconPass.setIcon(new controller().changeImage("/imagenes/password.png", 45, 45));
        iconStats.setIcon(new controller().changeImage("/imagenes/statistics.png", 45, 45));
        iconAuthen.setIcon(new controller().changeImage("/imagenes/authenticator.png", 45, 45));
        iconSecQuestions.setIcon(new controller().changeImage("/imagenes/questions.png", 45, 45));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconAuthen;
    private javax.swing.JLabel iconPass;
    private javax.swing.JLabel iconSecQuestions;
    private javax.swing.JLabel iconStats;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpBackAuthen;
    private javax.swing.JPanel jpBackPass;
    private javax.swing.JPanel jpBackSecQuestions;
    private javax.swing.JPanel jpBackStats;
    private javax.swing.JPanel jpFrontAuthen;
    private javax.swing.JPanel jpFrontPass;
    private javax.swing.JPanel jpFrontSecQuestions;
    private javax.swing.JPanel jpFrontStats;
    private javax.swing.JPanel jpShow;
    private javax.swing.JLabel lbljpSecurityUser1;
    private javax.swing.JLabel lbljpSecurityUser2;
    private javax.swing.JLabel lbljpSecurityUser3;
    private javax.swing.JLabel lbljpSecurityUser4;
    private javax.swing.JLabel lbljpSecurityUser5;
    private javax.swing.JScrollPane scrollLogs;
    // End of variables declaration//GEN-END:variables
}
