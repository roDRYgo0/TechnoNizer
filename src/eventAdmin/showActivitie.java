package eventAdmin;

import java.awt.Color;
import javaClass.controller;

public class showActivitie extends javax.swing.JPanel {

    int visibility;
    
    public showActivitie() {
        initComponents();
        visibility = 0;
        switchVisibility();
        load();
    }
    
    void load(){
        iconDate.setIcon(new controller().changeImage("/imagenes/date.png", 30, 30));
        iconPlace.setIcon(new controller().changeImage("/imagenes/place.png", 30, 30));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        lblSwitch = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblStatus = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        iconDate = new javax.swing.JLabel();
        iconPlace = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(945, 130));
        setMinimumSize(new java.awt.Dimension(945, 130));
        setPreferredSize(new java.awt.Dimension(945, 130));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Sala de conferencias 2");

        lblSwitch.setMaximumSize(new java.awt.Dimension(30, 30));
        lblSwitch.setMinimumSize(new java.awt.Dimension(30, 30));
        lblSwitch.setPreferredSize(new java.awt.Dimension(30, 30));
        lblSwitch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSwitchMouseReleased(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        texto.setRows(2);
        texto.setText("123456789123456789123456789123456789123456789142316545\n123456789123456789123456789123456789123456789142316545\n123456789123456789123456789123456789123456789142316545\n");
        texto.setAutoscrolls(false);
        texto.setMaximumSize(new java.awt.Dimension(508, 2147483647));
        texto.setMinimumSize(new java.awt.Dimension(436, 60));
        texto.setPreferredSize(new java.awt.Dimension(436, 60));
        texto.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(texto);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Acto de ignauración");

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));

        lblStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStatus.setText("Activo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("nickname");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Sábado, 16 de agosto del 2018");

        iconDate.setBackground(new java.awt.Color(255, 255, 255));
        iconDate.setMaximumSize(new java.awt.Dimension(30, 30));
        iconDate.setMinimumSize(new java.awt.Dimension(30, 30));
        iconDate.setPreferredSize(new java.awt.Dimension(30, 30));

        iconPlace.setBackground(new java.awt.Color(255, 255, 255));
        iconPlace.setMaximumSize(new java.awt.Dimension(30, 30));
        iconPlace.setMinimumSize(new java.awt.Dimension(30, 30));
        iconPlace.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblSwitch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblSwitchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSwitchMouseReleased
        if(visibility == 0){
            visibility = 1;
            switchVisibility();
        }else{
            visibility = 0;
            switchVisibility();
        }
    }//GEN-LAST:event_lblSwitchMouseReleased

    void switchVisibility(){
        switch(visibility){
            case 0:
                lblStatus.setText("Inactivo");
                lblStatus.setForeground(new Color(255,61,0));
                lblSwitch.setIcon(new controller().changeImage("/imagenes/toggleOff.png", 30, 30));
                break;
            case 1:
                lblStatus.setText("Activo");
                lblStatus.setForeground(new Color(139, 195, 74));
                lblSwitch.setIcon(new controller().changeImage("/imagenes/toggleOn.png", 30, 30));
                break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconDate;
    private javax.swing.JLabel iconPlace;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblSwitch;
    private javax.swing.JTextArea texto;
    // End of variables declaration//GEN-END:variables
}
