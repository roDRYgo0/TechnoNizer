package allEvent;

import java.awt.BorderLayout;
import javaClass.classEvent;

/** @author rodri*/

public class allEvents extends javax.swing.JPanel {

    public allEvents(int paneles, boolean search) {
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
            if(classEvent.eventos.get(count).getVisibility() == 1){
                showEvent jpEv = new showEvent(count, search);

                jpEv.setSize(190,120);
                jpEv.setLocation(x,y);
                jpEv.removeAll();
                this.add(jpEv,BorderLayout.CENTER);
                this.revalidate();
                this.repaint();
                x+=235;
                linea++;
            }
        }
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
