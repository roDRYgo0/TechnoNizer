package admin;

import JPanel.contact.*;
import java.awt.BorderLayout;
import javaClass.classContact;
import javaClass.controller;

public class allGender extends javax.swing.JPanel {

    public allGender() {
        initComponents();
        loadPanel();
    }
    
    void loadPanel(){
        int x = 10;
        int y = 6;
        for(int i = 0; i<controller.genders.size(); i++){
            itemGender item = new itemGender(i);

            item.setSize(321,55);
            item.setLocation(x,y);
            item.removeAll();
            this.add(item,BorderLayout.CENTER);
            this.revalidate();
            this.repaint();
            y+=61;
        }
        addGender add = new addGender();

        add.setSize(321,55);
        add.setLocation(x,y);
        this.add(add,BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(341, 999999990));
        setMinimumSize(new java.awt.Dimension(341, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 341, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
