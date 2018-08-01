package JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javaClass.controller;
import sucurity.jpChangePassword;

public class jpSecurity extends javax.swing.JPanel {

    public jpSecurity() {
        initComponents();
        loadImage();
        jpShow.setPreferredSize(new Dimension(445, 465));
    }
    
    void loadImage(){
        iconPass.setIcon(new controller().changeImage("/imagenes/password.png", 45, 45));
        iconAuthen.setIcon(new controller().changeImage("/imagenes/authenticator.png", 45, 45));
        iconSms.setIcon(new controller().changeImage("/imagenes/sms.png", 45, 45));
    }
    
    void resetColor(){
        jpBackPass.setBackground(Color.white);
        jpBackAuthen.setBackground(Color.white);
        jpBackSms.setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jpBackPass = new javax.swing.JPanel();
        jpFrontPass = new javax.swing.JPanel();
        iconPass = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jpBackAuthen = new javax.swing.JPanel();
        jpFrontAuthen = new javax.swing.JPanel();
        iconAuthen = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpBackSms = new javax.swing.JPanel();
        jpFrontSms = new javax.swing.JPanel();
        iconSms = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jpShow = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(980, 601));
        setMinimumSize(new java.awt.Dimension(980, 601));
        setPreferredSize(new java.awt.Dimension(980, 601));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Seguridad");

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("No configrado");

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
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGroup(jpFrontAuthenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
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

        jpBackSms.setBackground(new java.awt.Color(255, 255, 255));

        jpFrontSms.setBackground(new java.awt.Color(245, 245, 245));
        jpFrontSms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jpFrontSmsMouseReleased(evt);
            }
        });

        iconSms.setMaximumSize(new java.awt.Dimension(45, 45));
        iconSms.setMinimumSize(new java.awt.Dimension(45, 45));
        iconSms.setPreferredSize(new java.awt.Dimension(45, 45));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Mensaje de texto");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("No configrado");

        javax.swing.GroupLayout jpFrontSmsLayout = new javax.swing.GroupLayout(jpFrontSms);
        jpFrontSms.setLayout(jpFrontSmsLayout);
        jpFrontSmsLayout.setHorizontalGroup(
            jpFrontSmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFrontSmsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconSms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpFrontSmsLayout.setVerticalGroup(
            jpFrontSmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFrontSmsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpFrontSmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFrontSmsLayout.createSequentialGroup()
                        .addComponent(iconSms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFrontSmsLayout.createSequentialGroup()
                        .addGroup(jpFrontSmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(24, 24, 24))))
        );

        javax.swing.GroupLayout jpBackSmsLayout = new javax.swing.GroupLayout(jpBackSms);
        jpBackSms.setLayout(jpBackSmsLayout);
        jpBackSmsLayout.setHorizontalGroup(
            jpBackSmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBackSmsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jpFrontSms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpBackSmsLayout.setVerticalGroup(
            jpBackSmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBackSmsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpFrontSms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpShow.setBackground(new java.awt.Color(204, 0, 204));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Tu seguridad es muy importante");

        javax.swing.GroupLayout jpShowLayout = new javax.swing.GroupLayout(jpShow);
        jpShow.setLayout(jpShowLayout);
        jpShowLayout.setHorizontalGroup(
            jpShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpShowLayout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(71, 71, 71))
        );
        jpShowLayout.setVerticalGroup(
            jpShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpShowLayout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLabel7)
                .addContainerGap(242, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpBackPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpBackAuthen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpBackSms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jpBackPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jpBackAuthen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jpBackSms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jpShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jpFrontPassMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpFrontPassMouseReleased
        resetColor();
        jpBackPass.setBackground(new Color(33,150,243));
        
        controller.jpCp = new jpChangePassword();
        
        System.out.println(jpShow.getPreferredSize());
        System.out.println(jpShow.getLocation());
        
        controller.jpCp.setSize(445, 465);
        controller.jpCp.setLocation(0,0);
        
        jpShow.removeAll();
        jpShow.add(controller.jpCp,BorderLayout.CENTER);
        jpShow.revalidate();
        jpShow.repaint();

        
    }//GEN-LAST:event_jpFrontPassMouseReleased

    private void jpFrontAuthenMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpFrontAuthenMouseReleased
        resetColor();
        jpBackAuthen.setBackground(new Color(33,150,243));
    }//GEN-LAST:event_jpFrontAuthenMouseReleased

    private void jpFrontSmsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpFrontSmsMouseReleased
        resetColor();
        jpBackSms.setBackground(new Color(33,150,243));
    }//GEN-LAST:event_jpFrontSmsMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconAuthen;
    private javax.swing.JLabel iconPass;
    private javax.swing.JLabel iconSms;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpBackAuthen;
    private javax.swing.JPanel jpBackPass;
    private javax.swing.JPanel jpBackSms;
    private javax.swing.JPanel jpFrontAuthen;
    private javax.swing.JPanel jpFrontPass;
    private javax.swing.JPanel jpFrontSms;
    private javax.swing.JPanel jpShow;
    // End of variables declaration//GEN-END:variables
}
