package admin;

/**@author rodri */

public class log extends javax.swing.JPanel {

    public log(int l) {
        initComponents();
        lblLog.setText(jpEditUserAdmin.logs.get(l).getLog());
        lblLog.setToolTipText(jpEditUserAdmin.logs.get(l).getLog());
        lblDateTime.setText(jpEditUserAdmin.logs.get(l).getDateTime());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDateTime = new javax.swing.JLabel();
        lblLog = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(467, 28));
        setMinimumSize(new java.awt.Dimension(467, 28));
        setPreferredSize(new java.awt.Dimension(467, 28));

        lblDateTime.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDateTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDateTime.setText("2018-08-22 05:42:39.660");

        lblLog.setText("dev.rodrig agregó preguntas de seguridad a dev.rodrig en modo administrativo ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLog, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblLog)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblDateTime))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblDateTime;
    private javax.swing.JLabel lblLog;
    // End of variables declaration//GEN-END:variables
}
