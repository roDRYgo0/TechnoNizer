package eventAdmin;

import javaClass.classEvent;
import javaClass.controller;
import javaClass.standardization;

public class Activity extends javax.swing.JPanel {

    public Activity(int activity) {
        initComponents();
        lblActivity.setText(classEvent.activities.get(activity).getActivity());
        lblClock.setText(standardization.getTime(classEvent.activities.get(activity).getTime()));
        lblPlace.setText(classEvent.activities.get(activity).getPlace());
        lblClock.setIcon(new controller().changeImage("/imagenes/clock.png", 23, 23));
        lblPlace.setIcon(new controller().changeImage("/imagenes/place.png", 23, 23));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        lblClock = new javax.swing.JLabel();
        lblPlace = new javax.swing.JLabel();
        lblActivity = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(448, 67));
        setMinimumSize(new java.awt.Dimension(448, 67));
        setPreferredSize(new java.awt.Dimension(448, 67));

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));

        lblClock.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lblClock.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblClock.setText("8:00 AM");

        lblPlace.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lblPlace.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPlace.setText("Sala de conferencias 2");

        lblActivity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblActivity.setText("Acto de ignauración");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addComponent(lblActivity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblClock, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblActivity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPlace)
                        .addContainerGap())
                    .addComponent(lblClock, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblActivity;
    private javax.swing.JLabel lblClock;
    private javax.swing.JLabel lblPlace;
    // End of variables declaration//GEN-END:variables
}
