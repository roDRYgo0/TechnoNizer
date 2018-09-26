package addEvent;

import java.awt.Color;
import java.util.Properties;
import javaClass.classEvent;
import javaClass.controller;
import properties.propiedades;

/** @author rodri */

public class price extends javax.swing.JPanel {

    void verificaridioma()
    {
    Properties pr=new propiedades(controller.idioma);
    NameTicket.setText(pr.getProperty("NameTicket"));
    priceTicket.setText(pr.getProperty("priceTicket"));
    Count.setText(pr.getProperty("CountTickets"));
    btnNext.setText(pr.getProperty("btnNextTicketsDelete"));
    }
    
    int id;
    
    public price(int id) {
        initComponents();
        verificaridioma();
        this.id = id;
        txtNamePrice.setText(classEvent.prices.get(id).getName());
        txtPrice.setText(classEvent.prices.get(id).getPrice()+"");
        if(classEvent.prices.get(id).getCount() == -1)
            txtCount.setText("Ilimitados");
        else
            txtCount.setText(classEvent.prices.get(id).getCount()+"");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NameTicket = new javax.swing.JLabel();
        txtNamePrice = new javax.swing.JTextField();
        spNamePrice = new javax.swing.JSeparator();
        priceTicket = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        spPrice = new javax.swing.JSeparator();
        btnNext = new javax.swing.JButton();
        Count = new javax.swing.JLabel();
        txtCount = new javax.swing.JTextField();
        spCount = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(365, 45));
        setMinimumSize(new java.awt.Dimension(365, 45));
        setPreferredSize(new java.awt.Dimension(365, 45));

        NameTicket.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        NameTicket.setForeground(new java.awt.Color(102, 102, 102));
        NameTicket.setText("Nombre");

        txtNamePrice.setAutoscrolls(false);
        txtNamePrice.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtNamePrice.setFocusable(false);
        txtNamePrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNamePriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNamePriceFocusLost(evt);
            }
        });
        txtNamePrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNamePriceKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNamePriceKeyTyped(evt);
            }
        });

        spNamePrice.setForeground(new java.awt.Color(204, 204, 204));

        priceTicket.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        priceTicket.setForeground(new java.awt.Color(102, 102, 102));
        priceTicket.setText("Precio");

        txtPrice.setAutoscrolls(false);
        txtPrice.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtPrice.setFocusable(false);
        txtPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPriceFocusLost(evt);
            }
        });
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPriceKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriceKeyTyped(evt);
            }
        });

        spPrice.setForeground(new java.awt.Color(204, 204, 204));

        btnNext.setBackground(new java.awt.Color(255, 0, 0));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Eliminar");
        btnNext.setBorderPainted(false);
        btnNext.setFocusable(false);
        btnNext.setMaximumSize(new java.awt.Dimension(79, 28));
        btnNext.setMinimumSize(new java.awt.Dimension(79, 28));
        btnNext.setPreferredSize(new java.awt.Dimension(79, 28));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        Count.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Count.setForeground(new java.awt.Color(102, 102, 102));
        Count.setText("Cantidad");

        txtCount.setAutoscrolls(false);
        txtCount.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtCount.setFocusable(false);
        txtCount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCountFocusLost(evt);
            }
        });
        txtCount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCountKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCountKeyTyped(evt);
            }
        });

        spCount.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NameTicket)
                        .addGap(0, 102, Short.MAX_VALUE))
                    .addComponent(spNamePrice)
                    .addComponent(txtNamePrice, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(priceTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPrice)
                    .addComponent(spPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Count, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(spCount)
                    .addComponent(txtCount))
                .addGap(17, 17, 17)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameTicket)
                    .addComponent(priceTicket, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtNamePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(spNamePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(spPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Count)
                        .addGap(0, 0, 0)
                        .addComponent(txtCount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(spCount, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamePriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNamePriceFocusGained
        spNamePrice.setBackground(Color.red);
    }//GEN-LAST:event_txtNamePriceFocusGained

    private void txtNamePriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNamePriceFocusLost
        spNamePrice.setBackground(Color.white);
    }//GEN-LAST:event_txtNamePriceFocusLost

    private void txtNamePriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamePriceKeyPressed

    }//GEN-LAST:event_txtNamePriceKeyPressed

    private void txtNamePriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamePriceKeyTyped
        char c = evt.getKeyChar();
        if(c == ' ')
        evt.consume();
    }//GEN-LAST:event_txtNamePriceKeyTyped

    private void txtPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPriceFocusGained
        spPrice.setBackground(Color.red);
    }//GEN-LAST:event_txtPriceFocusGained

    private void txtPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPriceFocusLost
        spPrice.setBackground(Color.white);
    }//GEN-LAST:event_txtPriceFocusLost

    private void txtPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceKeyPressed

    private void txtPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceKeyTyped

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        controller.addEvents.setTickects(controller.addEvents.getAfterTickets(classEvent.prices.get(id).getCount()));
        classEvent.prices.remove(id);
        controller.addEvents.load();
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtCountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCountFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountFocusGained

    private void txtCountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCountFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountFocusLost

    private void txtCountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCountKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountKeyPressed

    private void txtCountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCountKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Count;
    private javax.swing.JLabel NameTicket;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel priceTicket;
    private javax.swing.JSeparator spCount;
    private javax.swing.JSeparator spNamePrice;
    private javax.swing.JSeparator spPrice;
    private javax.swing.JTextField txtCount;
    private javax.swing.JTextField txtNamePrice;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
