package event;

import java.awt.BorderLayout;
import javaClass.classEvent;
import javaClass.controller;
import javax.swing.JFrame;

/** @author rodri */

public class allPrice extends javax.swing.JPanel {
    JFrame event;
    
    public allPrice(JFrame event) {
        initComponents();
        this.event=event;
        load();
    }
    
    void load(){
        int numPrice = classEvent.prices.size();
        int x = 11;
        int y = 11;
        if(numPrice != 0){
            for(int i = 0; i < numPrice; i++){
                controller.pric = new price(i);

                controller.pric.setSize(306, 45);
                controller.pric.setLocation(x,y);
                controller.pric.removeAll();
                this.add(controller.pric,BorderLayout.CENTER);
                this.revalidate();
                this.repaint();
                y+=56;
            }
        }
        controller.addP = new addPrice(event);

        controller.addP.setSize(306, 45);
        controller.addP.setLocation(x,y);
        controller.addP.removeAll();
        this.add(controller.addP,BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(283, 235));
        setMinimumSize(new java.awt.Dimension(283, 235));
        setPreferredSize(new java.awt.Dimension(283, 235));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 235, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
