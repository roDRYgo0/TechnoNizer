package JPanel;

import jFrame.AddEventInfo;
import java.util.Properties;
import javaClass.controller;
import javaClass.standardization;
import properties.propiedades;

/** @author rodri*/

public class addEvent extends javax.swing.JPanel {

    void verificaridioma()
    {
    Properties pr = new propiedades (controller.idioma);
    addEventLbl.setText(pr.getProperty("addEventLbl"));
    }
    
    public addEvent(){
        initComponents();
        verificaridioma();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addEventLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(230, 230, 230));
        setPreferredSize(new java.awt.Dimension(190, 120));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        addEventLbl.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        addEventLbl.setText("Agregar nuevo evento");

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        jLabel2.setText("+");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addEventLbl)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(addEventLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        controller.gralEvent = new AddEventInfo();
        standardization.show(controller.gralEvent);
        controller.rootFrame = controller.gralEvent;
    }//GEN-LAST:event_formMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addEventLbl;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
