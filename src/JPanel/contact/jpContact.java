package JPanel.contact;

import java.awt.BorderLayout;
import javaClass.classContact;
import javaClass.controller;

public class jpContact extends javax.swing.JPanel {

    public jpContact() {
        initComponents();
        loadPanel();
    }
    
    void loadPanel(){
        int x = 16;
        int y = 3;
        for(int i = 0; i<20; i++){
            controller.cont = new addContact();

            controller.cont.setSize(450,55);
            controller.cont.setLocation(x,y);
            controller.cont.removeAll();
            this.add(controller.cont,BorderLayout.CENTER);
            this.revalidate();
            this.repaint();
            y+=71;
        }
        System.out.println(classContact.getNumContact());
        controller.cont = new addContact();

        controller.cont.setSize(450,55);
        controller.cont.setLocation(x,y);
        controller.cont.removeAll();
        this.add(controller.cont,BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(492, 352));
        setMinimumSize(new java.awt.Dimension(492, 352));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 352, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
