package JPanel;

import java.awt.BorderLayout;
import java.util.Properties;
import javaClass.controller;
import properties.propiedades;

/**
 * 
 * @author rodri
 */

public class jpBanned extends javax.swing.JPanel {

    void verificaridioma()
    {
    Properties pr= new propiedades(controller.idioma);
    Banned1.setText(pr.getProperty("Banned1"));
    Banned2.setText(pr.getProperty("Banned2"));
    Banned3.setText(pr.getProperty("Banned3"));
    Banned4.setText(pr.getProperty("Banned4"));
    Banned5.setText(pr.getProperty("Banned5"));
    Banned6.setText(pr.getProperty("Banned6"));
    }
    
    public jpBanned() {
        initComponents();
        verificaridioma();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblTN = new javax.swing.JLabel();
        Banned1 = new javax.swing.JLabel();
        Banned2 = new javax.swing.JLabel();
        Banned3 = new javax.swing.JLabel();
        Banned4 = new javax.swing.JLabel();
        Banned5 = new javax.swing.JLabel();
        Banned6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(420, 603));
        setMinimumSize(new java.awt.Dimension(420, 603));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sad.png"))); // NOI18N

        lblTN.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTN.setText("TechnoNizer");
        lblTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblTNMouseReleased(evt);
            }
        });

        Banned1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Banned1.setForeground(new java.awt.Color(33, 150, 243));
        Banned1.setText("Lo sentimos!!");

        Banned2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Banned2.setText("Has sido");

        Banned3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Banned3.setForeground(new java.awt.Color(255, 0, 0));
        Banned3.setText("baneado");

        Banned4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Banned4.setText(", por favor");

        Banned5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Banned5.setText("ponte en contacto con");

        Banned6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Banned6.setText("soporte técnico");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblTN))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(Banned1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Banned2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Banned3)
                                .addGap(2, 2, 2)
                                .addComponent(Banned4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(Banned5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(Banned6)))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblTN)
                .addGap(120, 120, 120)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Banned1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Banned2)
                    .addComponent(Banned3)
                    .addComponent(Banned4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Banned5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Banned6)
                .addContainerGap(145, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblTNMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTNMouseReleased
        controller.jpA = new jpAccess();

        controller.jpA.setSize(420,603);
        controller.jpA.setLocation(0,0);

        controller.rootPane.removeAll();
        controller.rootPane.add(controller.jpA,BorderLayout.CENTER);
        controller.rootPane.revalidate();
        controller.rootPane.repaint();
    }//GEN-LAST:event_lblTNMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Banned1;
    private javax.swing.JLabel Banned2;
    private javax.swing.JLabel Banned3;
    private javax.swing.JLabel Banned4;
    private javax.swing.JLabel Banned5;
    private javax.swing.JLabel Banned6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblTN;
    // End of variables declaration//GEN-END:variables
}
