package eventAdmin;

public class Text extends javax.swing.JPanel {

    public Text(String texto) {
        initComponents();
        txtText.setText(texto);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtText = new javax.swing.JLabel();

        setBackground(new java.awt.Color(225, 225, 225));
        setMaximumSize(new java.awt.Dimension(945, 60));
        setMinimumSize(new java.awt.Dimension(945, 60));
        setPreferredSize(new java.awt.Dimension(945, 60));

        txtText.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtText)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel txtText;
    // End of variables declaration//GEN-END:variables
}
