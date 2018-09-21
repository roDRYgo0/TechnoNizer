package eventOwner;

import javaClass.controller;

public class level extends javax.swing.JPanel {


    public level(int danger) {
        initComponents();
        load(danger);
    }
    
    void load(int danger){
        switch(danger){
            case 1:
                lblDanger.setText("Leve");
                lblDanger.setIcon(new controller().changeImage("/imagenes/question.png", 35, 35));
                break;
            case 2:
                lblDanger.setText("Grave");
                lblDanger.setIcon(new controller().changeImage("/imagenes/warning.png", 35, 35));
                break;
            case 3:
                lblDanger.setText("Muy grave");
                lblDanger.setIcon(new controller().changeImage("/imagenes/alert.png", 35, 35));
                break;
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDanger = new javax.swing.JLabel();

        setBackground(new java.awt.Color(235, 235, 235));
        setMaximumSize(new java.awt.Dimension(945, 35));
        setMinimumSize(new java.awt.Dimension(945, 35));
        setPreferredSize(new java.awt.Dimension(945, 35));

        lblDanger.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblDanger.setText("Muy grave");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDanger, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(329, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDanger, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblDanger;
    // End of variables declaration//GEN-END:variables
}
