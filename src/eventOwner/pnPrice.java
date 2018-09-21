package eventOwner;

import java.awt.BorderLayout;
import javaClass.controller;
import javaClass.event;

/**
 *
 * @author rodri
 */
public class pnPrice extends javax.swing.JPanel {

    /** Creates new form pnPrice
     * @param event
     * @param idEvent */
    
    public pnPrice(event event, int idEvent) {
        initComponents();
        load(event, idEvent);
    }

    void load(event event, int idEvent){
        
        for(int i = 0; i <event.getPrices().size(); i++){
            showPrice sp = new showPrice(i, idEvent);
            sp.setSize(485, 45);

            this.add(sp, BorderLayout.CENTER);
            this.revalidate();
            this.repaint();
        }
//        this.setPreferredSize(new Dimension(this.getPreferredSize().width, this.getPreferredSize().height+10));
////        scrollPrice.setSize(new Dimension(scrollPrice.getPreferredSize().width, pnPrice.getPreferredSize().height+10));
        this.revalidate();
        this.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(530, 999999));
        setMinimumSize(new java.awt.Dimension(530, 1));
        setPreferredSize(new java.awt.Dimension(530, 226));
        javaClass.ModifiedFlowLayout modifiedFlowLayout1 = new javaClass.ModifiedFlowLayout();
        modifiedFlowLayout1.setAlignment(java.awt.FlowLayout.LEFT);
        modifiedFlowLayout1.setHgap(15);
        setLayout(modifiedFlowLayout1);

        jPanel4.setMaximumSize(new java.awt.Dimension(495, 62));
        jPanel4.setMinimumSize(new java.awt.Dimension(495, 62));
        jPanel4.setPreferredSize(new java.awt.Dimension(535, 65));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Precios");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(298, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        add(jPanel4);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        technonizer.TechnoNizer.home.pnEvent();
    }//GEN-LAST:event_jLabel2MouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
