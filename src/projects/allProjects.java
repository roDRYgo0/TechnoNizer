 package projects;

import java.awt.BorderLayout;

/** @author rodri*/

public class allProjects extends javax.swing.JPanel {

    public allProjects(int paneles, boolean search) {
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
            showProject showP = new showProject(count, search);

            showP.setSize(190,120);
            showP.setLocation(x,y);
            showP.removeAll();
            this.add(showP,BorderLayout.CENTER);
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
        addProject addP = new addProject();

        addP.setSize(190,120);
        addP.setLocation(x,y);
        this.add(addP,BorderLayout.CENTER);
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
