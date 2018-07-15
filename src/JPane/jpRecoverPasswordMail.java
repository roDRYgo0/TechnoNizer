package JPane;

import jFrame.*;
import static jFrame.logIn.*;
import java.awt.BorderLayout;
import javaClass.*;
import javax.swing.JPanel;

public class jpRecoverPasswordMail extends javax.swing.JPanel {

    private JPanel rootPane;
    public static jpRecoverPasswordMailCode jpRC;

    public void setRootPane(JPanel rootPane) {
        this.rootPane = rootPane;
    }
    
    public jpRecoverPasswordMail(JPanel rootPane) {
        initComponents();
        this.rootPane = rootPane;
        
        
    }

    //<editor-fold defaultstate="collapsed" desc="compiled code">
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spTop = new javax.swing.JSeparator();
        jbNext = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblTN = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(420, 603));
        setMinimumSize(new java.awt.Dimension(420, 603));
        setPreferredSize(new java.awt.Dimension(420, 603));

        spTop.setForeground(new java.awt.Color(153, 153, 153));

        jbNext.setBackground(new java.awt.Color(0, 153, 255));
        jbNext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbNext.setForeground(new java.awt.Color(255, 255, 255));
        jbNext.setText("Enviar");
        jbNext.setBorderPainted(false);
        jbNext.setFocusable(false);
        jbNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNextActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnBack.setText("Atras");
        btnBack.setBorderPainted(false);
        btnBack.setFocusable(false);
        btnBack.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblTN.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTN.setText("TechnoNizer");
        lblTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTNMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Recuperación de contraseña");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setText("Podemos ayudarte a recuperar tu contraseña.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setText("Pero primero verifica tu identidad.");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Obtener codigo de verificación.");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel5.setText("Te enviaremos un correo electrónico con el código a ");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel6.setText("Not Found");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(lblTN)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(85, 85, 85))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblTN)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(0, 0, 0)
                .addComponent(jLabel6)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spTop, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbNext, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(spTop, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents
    //</editor-fold>
    
    private void jbNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNextActionPerformed
        
        if(logIn.internet)
        {
           jpRC = new jpRecoverPasswordMailCode(rootPane);
        
            jpRC.setSize(420,603);
            jpRC.setLocation(0,0);
            rootPane.removeAll();
            rootPane.add(jpRC,BorderLayout.CENTER);
            rootPane.revalidate();
            rootPane.repaint(); 
        }
        else
            standardization.showMessage("error", "Error al establecer una conexion de red.");
        
    }//GEN-LAST:event_jbNextActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        rootPane.removeAll();
        rootPane.add(jpAccess.jpP,BorderLayout.CENTER);
        rootPane.revalidate();
        rootPane.repaint();
    }//GEN-LAST:event_btnBackActionPerformed

    private void lblTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTNMouseClicked
        jpA = new jpAccess(rootPane);
        
        jpA.setSize(420,603);
        jpA.setLocation(0,0);
        
        rootPane.removeAll();
        rootPane.add(jpA,BorderLayout.CENTER);
        rootPane.revalidate();
        rootPane.repaint();
    }//GEN-LAST:event_lblTNMouseClicked

    //<editor-fold defaultstate="collapsed" desc="compiled code">
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbNext;
    private javax.swing.JLabel lblTN;
    private javax.swing.JSeparator spTop;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
