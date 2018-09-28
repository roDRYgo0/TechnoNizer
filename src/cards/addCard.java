package cards;

import java.util.Properties;
import javaClass.controller;
import javaClass.standardization;
import properties.propiedades;

/** @author rodri*/

public class addCard extends javax.swing.JPanel {
    
    void verificaridioma()
    {
    Properties pr = new propiedades(controller.idioma);
    lbladdProject.setText(pr.getProperty("AddCard"));
    }
    
    public addCard() {
        initComponents();
        verificaridioma();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbladdProject = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(230, 230, 230));
        setPreferredSize(new java.awt.Dimension(190, 120));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        lbladdProject.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        lbladdProject.setText("Agregar nueva tarjeta");

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        jLabel2.setText("+");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel2)
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbladdProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(lbladdProject)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        controller.addCr = new jFrame.addCard();
        standardization.show(controller.addCr);
        controller.rootFrame = controller.addCr;
    }//GEN-LAST:event_formMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbladdProject;
    // End of variables declaration//GEN-END:variables
}
