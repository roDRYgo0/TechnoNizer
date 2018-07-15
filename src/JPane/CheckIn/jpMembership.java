package JPane.CheckIn;

import jFrame.*;
import javaClass.*;
import javax.swing.JPanel;

public class jpMembership extends javax.swing.JPanel {

    private JPanel rootPane;
    
    public jpMembership(JPanel rootPane) {
        initComponents();
        
        this.rootPane = rootPane;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cmbMembership = new javax.swing.JComboBox<>();
        btnNext = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(420, 603));
        setMinimumSize(new java.awt.Dimension(420, 603));
        setPreferredSize(new java.awt.Dimension(420, 603));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Selecciona tu membresia");

        jPanel1.setBackground(new java.awt.Color(226, 226, 226));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102), 4));
        jPanel1.setMaximumSize(new java.awt.Dimension(335, 95));
        jPanel1.setMinimumSize(new java.awt.Dimension(335, 95));
        jPanel1.setPreferredSize(new java.awt.Dimension(335, 95));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Gratis");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel3.setText("Tendrás únicamente las opciones limitadas");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel4.setText("en el apartado de eventos.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4))
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(25, 25, 25))
        );

        jPanel2.setBackground(new java.awt.Color(226, 226, 226));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 102), 4));
        jPanel2.setMaximumSize(new java.awt.Dimension(335, 95));
        jPanel2.setMinimumSize(new java.awt.Dimension(335, 95));
        jPanel2.setPreferredSize(new java.awt.Dimension(335, 95));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("VIP");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel6.setText("Aquí podrás tener más libertad ");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel7.setText("para crear tus eventos.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(75, 75, 75)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)))
                .addGap(34, 34, 34))
        );

        jPanel5.setBackground(new java.awt.Color(226, 226, 226));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 4));
        jPanel5.setMaximumSize(new java.awt.Dimension(335, 95));
        jPanel5.setMinimumSize(new java.awt.Dimension(335, 95));
        jPanel5.setPreferredSize(new java.awt.Dimension(335, 95));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setText("Premium");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel15.setText("Tienes recursos ilimitados para ");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel16.setText("lo que quieras hacer.");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel16)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        cmbMembership.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "gratis", "vip", "premium" }));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbMembership, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)))))
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(cmbMembership, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if(logIn.internet)
        {
            classUsuario.setIdMemberships(methodsSQL.getExecuteInt("SELECT id FROM memberships WHERE name = ? ", cmbMembership.getSelectedItem().toString()));

            
        }
        else if(camposVacios())
            standardization.showMessage("warning", "Se encontraron campos vacios.");
        else
            standardization.showMessage("error", "Error al establecer una conexion de red.");
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
//        jpCU.setSize(420,603);
//        jpCU.setLocation(0,0);
//        rootPane.removeAll();
//        rootPane.add(jpCU,BorderLayout.CENTER);
//        rootPane.revalidate();
//        rootPane.repaint();
    }//GEN-LAST:event_btnBackActionPerformed

    
    public boolean camposVacios(){
        if(cmbMembership.getSelectedIndex()==-1)
            return true;
        else
            return false;
    }
           

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNext;
    private javax.swing.JComboBox<String> cmbMembership;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
