package JPanel;

import java.awt.BorderLayout;
import javaClass.controller;

/** @author rodri*/

public class allReminders extends javax.swing.JPanel {

    public allReminders(int paneles, boolean search) {
        initComponents();
        load(paneles, search);
    }

    public void load(int paneles, boolean search){
        int x=30;
        int y=15;
        int row = 1;
        int linea = 0;
        for(int count = 0; count<paneles; count++){
            if(linea>3){
                x=30;
                y+=155;
                linea=0;   
            }
            controller.jpEv = new JPanel.showEvent(count, search);

            controller.jpEv.setSize(190,120);
            controller.jpEv.setLocation(x,y);
            controller.jpEv.removeAll();
            this.add(controller.jpEv,BorderLayout.CENTER);
            this.revalidate();
            this.repaint();
            x+=235;
            linea++;
        }
        if(linea>3){
            x=30;
            y+=155;
            row++;
            linea=0;
        }
        controller.jpAE = new addEvent();

        controller.jpAE.setSize(190,120);
        controller.jpAE.setLocation(x,y);
        controller.jpAE.removeAll();
        this.add(controller.jpAE,BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(960, 480));
        setMinimumSize(new java.awt.Dimension(960, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
