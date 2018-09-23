package eventOwner;

import java.awt.Color;
import javaClass.classEvent;


public class showAnnouncementMenu extends javax.swing.JPanel {

    int idProblem, idEvent;
    
    public showAnnouncementMenu(int idAnnounced, int idEvent) {
        initComponents();
        this.idProblem = idAnnounced;
        this.idEvent = idEvent;
        lblAnnouncement.setText(classEvent.evento.getAnnouncements().get(idAnnounced).getAnnouncement());
        lblNickname.setText(classEvent.evento.getAnnouncements().get(idAnnounced).getNickname());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAnnouncement = new javax.swing.JTextArea();
        lblNickname = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(925, 42));
        setMinimumSize(new java.awt.Dimension(925, 42));
        setPreferredSize(new java.awt.Dimension(925, 42));

        lblAnnouncement.setColumns(20);
        lblAnnouncement.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblAnnouncement.setRows(5);
        lblAnnouncement.setText("Las reservaciones de la casa son aqui en ");
        lblAnnouncement.setFocusable(false);

        lblNickname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNickname.setForeground(new java.awt.Color(153, 153, 153));
        lblNickname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNickname.setText("nickname");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAnnouncement, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNickname, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(lblAnnouncement, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea lblAnnouncement;
    private javax.swing.JLabel lblNickname;
    // End of variables declaration//GEN-END:variables
}
