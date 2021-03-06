package JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Properties;
import javaClass.classAdmin;
import javaClass.classContact;
import javaClass.classUsuario;
import javaClass.controller;
import static javaClass.standardization.invokeAdmin;
import static javaClass.standardization.invokeHome;
import properties.propiedades;

public class jpChoose extends javax.swing.JPanel {
    
    void verificaridioma()
    {
    Properties pr = new propiedades (controller.idioma);
    AccesLbl.setText(pr.getProperty("AccesLbl"));
    UserChoose.setText(pr.getProperty("UserChoose"));
    ChoosePAdmin.setText(pr.getProperty("ChoosePAdmin"));
    btnNext.setText(pr.getProperty("btnNextChoose"));
    btnNext1.setText(pr.getProperty("btnNext1Choose"));

    
    }
    
    public jpChoose() {
        initComponents();
        verificaridioma();
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTN = new javax.swing.JLabel();
        spTop = new javax.swing.JSeparator();
        AccesLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnNext1 = new javax.swing.JButton();
        progress = new rojerusan.componentes.RSProgressMaterial();
        UserChoose = new javax.swing.JLabel();
        ChoosePAdmin = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(420, 603));
        setMinimumSize(new java.awt.Dimension(420, 603));

        lblTN.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTN.setText("TechnoNizer");
        lblTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblTNMouseReleased(evt);
            }
        });

        spTop.setForeground(new java.awt.Color(153, 153, 153));

        AccesLbl.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        AccesLbl.setForeground(new java.awt.Color(33, 150, 243));
        AccesLbl.setText("Como quieres acceder");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/username.png"))); // NOI18N

        btnNext.setBackground(new java.awt.Color(0, 153, 255));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Continuar");
        btnNext.setBorderPainted(false);
        btnNext.setFocusable(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/statistics.png"))); // NOI18N

        btnNext1.setBackground(new java.awt.Color(0, 153, 255));
        btnNext1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext1.setForeground(new java.awt.Color(255, 255, 255));
        btnNext1.setText("Continuar");
        btnNext1.setBorderPainted(false);
        btnNext1.setFocusable(false);
        btnNext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext1ActionPerformed(evt);
            }
        });

        progress.setForeground(new java.awt.Color(255, 255, 255));
        progress.setAnchoProgress(6);
        progress.setPreferredSize(new java.awt.Dimension(34, 34));

        UserChoose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UserChoose.setForeground(new java.awt.Color(33, 150, 243));
        UserChoose.setText("Usuario");

        ChoosePAdmin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ChoosePAdmin.setForeground(new java.awt.Color(33, 150, 243));
        ChoosePAdmin.setText("Panel administrativo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(spTop, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AccesLbl)
                    .addComponent(lblTN)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ChoosePAdmin)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(UserChoose)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(spTop, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lblTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(AccesLbl)
                .addGap(41, 41, 41)
                .addComponent(UserChoose)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addComponent(ChoosePAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        progress.setForeground(new Color(33,150,243));
        new Thread(()->{
            classUsuario.select();
            classContact.select();
            invokeHome(true, technonizer.TechnoNizer.log);
        }).start();
        btnNext.setEnabled(false);
        btnNext1.setEnabled(false);

    }//GEN-LAST:event_btnNextActionPerformed

    private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ActionPerformed
        progress.setForeground(new Color(33,150,243));
        new Thread(()->{
            classAdmin.select();
            classAdmin.selectLog();
            invokeAdmin();
        }).start();
        btnNext.setEnabled(false);
        btnNext1.setEnabled(false);
    }//GEN-LAST:event_btnNext1ActionPerformed

    private void lblTNMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTNMouseReleased
        controller.rootPane.removeAll();
        controller.rootPane.add(controller.jpA,BorderLayout.CENTER);
        controller.rootPane.revalidate();
        controller.rootPane.repaint();
        controller.jpA.enable();
    }//GEN-LAST:event_lblTNMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccesLbl;
    private javax.swing.JLabel ChoosePAdmin;
    private javax.swing.JLabel UserChoose;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNext1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblTN;
    private rojerusan.componentes.RSProgressMaterial progress;
    private javax.swing.JSeparator spTop;
    // End of variables declaration//GEN-END:variables
}
