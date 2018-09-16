package eventAdmin;

public class pnActivities extends javax.swing.JPanel {

    int idEvent;
    byte[] image, imageCover;
    
    public pnActivities(int idEvent) {
        initComponents();
        this.idEvent = idEvent;  
        scrollContainer.getVerticalScrollBar().setUnitIncrement(16);
        load();
    }

    void load(){
        pnContainer.add(new showActivitie());
        
        pnContainer.revalidate();
        pnContainer.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollContainer = new javax.swing.JScrollPane();
        pnContainer = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        scrollContainer.setBorder(null);
        scrollContainer.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollContainer.setToolTipText("");

        pnContainer.setBackground(new java.awt.Color(153, 204, 255));
        javaClass.ModifiedFlowLayout modifiedFlowLayout1 = new javaClass.ModifiedFlowLayout();
        modifiedFlowLayout1.setAlignment(java.awt.FlowLayout.LEFT);
        modifiedFlowLayout1.setHgap(10);
        modifiedFlowLayout1.setAlignOnBaseline(true);
        pnContainer.setLayout(modifiedFlowLayout1);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setMaximumSize(new java.awt.Dimension(945, 90));
        jPanel8.setMinimumSize(new java.awt.Dimension(945, 90));
        jPanel8.setPreferredSize(new java.awt.Dimension(945, 90));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel8MouseReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Actividades");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)))
                .addContainerGap(537, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pnContainer.add(jPanel8);

        scrollContainer.setViewportView(pnContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrollContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseReleased
        technonizer.TechnoNizer.home.showEvent();
    }//GEN-LAST:event_jPanel8MouseReleased

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel pnContainer;
    private javax.swing.JScrollPane scrollContainer;
    // End of variables declaration//GEN-END:variables
}
