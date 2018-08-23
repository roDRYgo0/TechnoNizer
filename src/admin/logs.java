package admin;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javaClass.classAdmin;
import javaClass.classUsuario;

/** @author rodri */

public class logs extends javax.swing.JPanel {
    
    public logs() {
        initComponents();
        loadPanel();
    }

    void loadPanel(){
        int x = 0;
        int y = 8;
        for(int i = 0; i<jpEditUserAdmin.logs.size(); i++){
            admin.log lo = new admin.log(i);

            lo.setSize(467, 28);
            lo.setLocation(x,y);
            lo.removeAll();
            this.add(lo,BorderLayout.CENTER);
            this.revalidate();
            this.repaint();
            y+=34;
        } 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(488, 144));
        setMinimumSize(new java.awt.Dimension(488, 144));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
