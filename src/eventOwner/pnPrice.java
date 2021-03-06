package eventOwner;

import java.awt.BorderLayout;
import java.util.Properties;
import javaClass.controller;
import javaClass.event;
import javaClass.standardization;
import properties.propiedades;

/**
 *
 * @author rodri
 */
public class pnPrice extends javax.swing.JPanel {

    /** Creates new form pnPrice
     * @param event
     * @param idEvent */
    
    void verificaridioma()
    {
        Properties pr=new propiedades(controller.idioma);
        PricelblpnPrice.setText(pr.getProperty("PricelblpnPrice"));
        btnNext.setText(pr.getProperty("Guest"));
    }
    
    int idEvent;
    
    public pnPrice(event event, int idEvent) {
        initComponents();
        this.idEvent = idEvent;
        load(event, idEvent);
        verificaridioma();
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
        PricelblpnPrice = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnNext = new javax.swing.JButton();

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

        PricelblpnPrice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PricelblpnPrice.setForeground(new java.awt.Color(255, 0, 0));
        PricelblpnPrice.setText("Precios");
        PricelblpnPrice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PricelblpnPriceMouseReleased(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        btnNext.setBackground(new java.awt.Color(33, 150, 243));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Invitados");
        btnNext.setBorderPainted(false);
        btnNext.setFocusable(false);
        btnNext.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnNext.setMaximumSize(new java.awt.Dimension(79, 28));
        btnNext.setMinimumSize(new java.awt.Dimension(79, 28));
        btnNext.setPreferredSize(new java.awt.Dimension(79, 28));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PricelblpnPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(172, 172, 172)
                .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(PricelblpnPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        add(jPanel4);
    }// </editor-fold>//GEN-END:initComponents

    private void PricelblpnPriceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PricelblpnPriceMouseReleased
        technonizer.TechnoNizer.home.pnEvent();
    }//GEN-LAST:event_PricelblpnPriceMouseReleased

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        standardization.show(new listGuest(idEvent));
    }//GEN-LAST:event_btnNextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PricelblpnPrice;
    private javax.swing.JButton btnNext;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
