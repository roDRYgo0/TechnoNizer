package admin;

import java.awt.BorderLayout;
import javaClass.controller;

/**@author rodri */

public class allUsers extends javax.swing.JPanel {


    public allUsers(int paneles, boolean search, int view) {
        initComponents();
        
        if(view == 0)
            loadGrid(paneles, search);
        else
            loadList(paneles, search);
    }
    
    public void loadGrid(int paneles, boolean search){
        if(search){
            int x=10;
            int y=12;
            int row = 1;
            int linea = 0;
            for(int count = 0; count<paneles; count++){
                if(linea>1){
                    x=10;
                    y+=168;
                    linea=0;   
                }
                controller.userGrid = new userGrid(count, search);

                controller.userGrid.setSize(465, 140);
                controller.userGrid.setLocation(x,y);
                controller.userGrid.removeAll();
                this.add(controller.userGrid,BorderLayout.CENTER);
                this.revalidate();
                this.repaint();
                x+=473;
                linea++;
            }
        }else{
            int x=10;
            int y=12;
            int row = 1;
            int linea = 0;
            for(int count = 0; count<paneles; count++){
                if(linea>1){
                    x=10;
                    y+=168;
                    linea=0;   
                }
                controller.userGrid = new userGrid(count, search);

                controller.userGrid.setSize(465, 140);
                controller.userGrid.setLocation(x,y);
                controller.userGrid.removeAll();
                this.add(controller.userGrid,BorderLayout.CENTER);
                this.revalidate();
                this.repaint();
                x+=473;
                linea++;
            }
        }
    }
    
    public void loadList(int paneles, boolean search){
        if(search){
            int x= 60;
            int y=13;
            int linea = 0;
            for(int count = 0; count<paneles; count++){
                if(linea>2){
                    x=60;
                    y+=67;
                    linea=0;   
                }
                controller.userList = new userList(count, search);

                controller.userList.setSize(270, 51);
                controller.userList.setLocation(x,y);
                controller.userList.removeAll();
                this.add(controller.userList,BorderLayout.CENTER);
                this.revalidate();
                this.repaint();
                x+=288;
                linea++;
            }
        }else{
            int x=60;
            int y=13;
            int linea = 0;
            for(int count = 0; count<paneles; count++){
                if(linea>2){
                    x=60;
                    y+=67;
                    linea=0;   
                }
                controller.userList = new userList(count, search);

                controller.userList.setSize(270, 51);
                controller.userList.setLocation(x,y);
                controller.userList.removeAll();
                this.add(controller.userList,BorderLayout.CENTER);
                this.revalidate();
                this.repaint();
                x+=288;
                linea++;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(960, 348));
        setMinimumSize(new java.awt.Dimension(960, 348));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
