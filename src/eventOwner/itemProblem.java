package eventOwner;

import java.util.Properties;
import javaClass.controller;
import properties.propiedades;

public class itemProblem extends javax.swing.JPanel {

    void verificaridioma()
    {
      Properties pr=new propiedades(controller.idioma);
     lblSettings.setText(pr.getProperty("lblSettingsProblems"));
      
    }
    
    int idEvent;
    
    public itemProblem(int idEvent) {
        initComponents();
        this.idEvent = idEvent;
        lblSettings.setIcon(new controller().changeImage("/imagenes/problems.png", 43, 43));
        verificaridioma();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSettings = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(145, 65));
        setMinimumSize(new java.awt.Dimension(145, 65));
        setPreferredSize(new java.awt.Dimension(145, 65));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        lblSettings.setText("Problemas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSettings, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSettings, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        technonizer.TechnoNizer.home.showEventProblemsOwner(idEvent);
    }//GEN-LAST:event_formMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblSettings;
    // End of variables declaration//GEN-END:variables
}
