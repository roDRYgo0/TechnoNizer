package eventOwner;

public class Text extends javax.swing.JPanel {

    public Text(String texto) {
        initComponents();
        txtText.setText(texto);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtText = new javax.swing.JLabel();

        setBackground(new java.awt.Color(235, 235, 235));
        setMaximumSize(new java.awt.Dimension(945, 30));
        setMinimumSize(new java.awt.Dimension(945, 30));
        setPreferredSize(new java.awt.Dimension(945, 30));

        txtText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtText.setForeground(new java.awt.Color(153, 153, 153));
        txtText.setText("Not found");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtText, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtText, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel txtText;
    // End of variables declaration//GEN-END:variables
}
