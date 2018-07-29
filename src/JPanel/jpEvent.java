package JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javaClass.classUsuario;
import javaClass.controller;

public class jpEvent extends javax.swing.JPanel {

    int position[][] = new int[50][50];
    int paneles;
    
    public jpEvent() {
        paneles = 3;
        insertarPaneles(classUsuario.getMyNumberEventUse());
        initComponents();
    }
    
    void insertarPaneles(int paneles){
        int x=50;
        int y=131;
        int row = 1;
        int count = 0;
        int linea = 0;
        while(count<paneles){
            if(linea>3){
                x=50;
                y+=155;
                row ++;
                linea=0;
                if(row==4)
                    this.setPreferredSize(new Dimension(this.getSize().width, this.getSize().height+140) );
                
            }
            controller.jpEv = new event();

            controller.jpEv.setSize(190,120);
            controller.jpEv.setLocation(x,y);
            controller.jpEv.removeAll();
            this.add(controller.jpEv,BorderLayout.CENTER);
            this.revalidate();
            this.repaint();
            x+=225;
            count++;
            linea++;
        }
        if(linea>3){
            x=50;
            y+=155;
            row++;
            linea=0;
            if(row==4)
                this.setPreferredSize(new Dimension(this.getSize().width, this.getSize().height+140) );
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

        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(99999, 99999));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(980, 601));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Eventos");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2)))
                .addContainerGap(310, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(505, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
