package eventOwner;

import java.awt.Color;
import java.util.Properties;
import javaClass.classEvent;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.standardization;
import properties.propiedades;

/** @author rodri */

public class showPrice extends javax.swing.JPanel {

    void verificaridioma()
    {
    Properties pr= new propiedades(controller.idioma);
    ShowPricelbl1.setText(pr.getProperty("ShowPricelbl1"));
    ShowPricelbl2.setText(pr.getProperty("ShowPricelbl2"));
    ShowPricelbl3.setText(pr.getProperty("ShowPricelbl3"));
    ShowPricelbl4.setText(pr.getProperty("ShowPricelbl4"));
    ShowPricelbl5.setText(pr.getProperty("ShowPricelbl5"));
    btnNext.setText(pr.getProperty("btnNextShop"));
    }
    
    int idPrice;
    int idEvent;
    
    public showPrice(int idPrice, int idEvent) {
        initComponents();
        verificaridioma();
        this.idPrice = idPrice;
        this.idEvent = idEvent;
        txtNamePrice.setText(classEvent.eventosShow.get(idEvent).getPrices().get(idPrice).getName());
        txtPrice.setText(classEvent.eventosShow.get(idEvent).getPrices().get(idPrice).getPrice()+"");
        if(classEvent.eventosShow.get(idEvent).getPrices().get(idPrice).getCount() == -1){
            txtCount.setText("Ilimitados");
            txtUse.setText("Ilimitados");
            txtAvailable.setText("Ilimitados");
        }
        else{
            txtCount.setText(classEvent.eventosShow.get(idEvent).getPrices().get(idPrice).getCount()+"");
            txtUse.setText(use()+"");
            txtAvailable.setText(available()+"");
        }
        
        if(classEvent.position == 3)
            btnNext.setVisible(true);
        else
            btnNext.setVisible(false);
        
    }

    int use(){
        int use = 0;
        use = classEvent.selectGuestTickets(classEvent.eventosShow.get(idEvent).getPrices().get(idPrice).getId());
        return use;
    }
    
    int available(){
        int available = 0;
        available = classEvent.eventosShow.get(idEvent).getPrices().get(idPrice).getCount() - classEvent.selectGuestTickets(classEvent.eventosShow.get(idEvent).getPrices().get(idPrice).getId());
        return available;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ShowPricelbl1 = new javax.swing.JLabel();
        txtNamePrice = new javax.swing.JTextField();
        spNamePrice = new javax.swing.JSeparator();
        ShowPricelbl2 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        spPrice = new javax.swing.JSeparator();
        btnNext = new javax.swing.JButton();
        ShowPricelbl3 = new javax.swing.JLabel();
        txtCount = new javax.swing.JTextField();
        spCount = new javax.swing.JSeparator();
        ShowPricelbl4 = new javax.swing.JLabel();
        txtAvailable = new javax.swing.JTextField();
        spCount1 = new javax.swing.JSeparator();
        ShowPricelbl5 = new javax.swing.JLabel();
        txtUse = new javax.swing.JTextField();
        spCount2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(485, 45));
        setMinimumSize(new java.awt.Dimension(485, 45));
        setPreferredSize(new java.awt.Dimension(485, 45));

        ShowPricelbl1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ShowPricelbl1.setForeground(new java.awt.Color(102, 102, 102));
        ShowPricelbl1.setText("Nombre");

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

        ShowPricelbl2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ShowPricelbl2.setForeground(new java.awt.Color(102, 102, 102));
        ShowPricelbl2.setText("Precio");

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

        btnNext.setBackground(new java.awt.Color(0, 153, 0));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Comprar");
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

        ShowPricelbl3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ShowPricelbl3.setForeground(new java.awt.Color(102, 102, 102));
        ShowPricelbl3.setText("Cantidad");

        txtCount.setText("Ilimitados");
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

        ShowPricelbl4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ShowPricelbl4.setForeground(new java.awt.Color(102, 102, 102));
        ShowPricelbl4.setText("Disponibles");

        txtAvailable.setForeground(new java.awt.Color(0, 153, 0));
        txtAvailable.setText("ilimitados");
        txtAvailable.setAutoscrolls(false);
        txtAvailable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtAvailable.setFocusable(false);
        txtAvailable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAvailableFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAvailableFocusLost(evt);
            }
        });
        txtAvailable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAvailableKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAvailableKeyTyped(evt);
            }
        });

        spCount1.setForeground(new java.awt.Color(204, 204, 204));

        ShowPricelbl5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ShowPricelbl5.setForeground(new java.awt.Color(102, 102, 102));
        ShowPricelbl5.setText("En uso");

        txtUse.setForeground(new java.awt.Color(204, 0, 0));
        txtUse.setText("Ilimitados");
        txtUse.setAutoscrolls(false);
        txtUse.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtUse.setFocusable(false);
        txtUse.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUseFocusLost(evt);
            }
        });
        txtUse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUseKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUseKeyTyped(evt);
            }
        });

        spCount2.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ShowPricelbl1)
                    .addComponent(txtNamePrice, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(spNamePrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ShowPricelbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPrice)
                    .addComponent(spPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ShowPricelbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spCount)
                    .addComponent(txtCount, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ShowPricelbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spCount1)
                    .addComponent(txtAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ShowPricelbl5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spCount2)
                    .addComponent(txtUse, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ShowPricelbl2)
                        .addGap(0, 0, 0)
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(spPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ShowPricelbl3)
                        .addGap(0, 0, 0)
                        .addComponent(txtCount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(spCount, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(ShowPricelbl1)
                    .addGap(0, 0, 0)
                    .addComponent(txtNamePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(spNamePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addComponent(ShowPricelbl4)
                .addGap(0, 0, 0)
                .addComponent(txtAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(spCount1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(ShowPricelbl5)
                .addGap(0, 0, 0)
                .addComponent(txtUse, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(spCount2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        standardization.show(new buyTicket(idPrice, idEvent));

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

    private void txtAvailableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAvailableFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvailableFocusGained

    private void txtAvailableFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAvailableFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvailableFocusLost

    private void txtAvailableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAvailableKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvailableKeyPressed

    private void txtAvailableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAvailableKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvailableKeyTyped

    private void txtUseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUseFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUseFocusGained

    private void txtUseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUseFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUseFocusLost

    private void txtUseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUseKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUseKeyPressed

    private void txtUseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUseKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUseKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ShowPricelbl1;
    private javax.swing.JLabel ShowPricelbl2;
    private javax.swing.JLabel ShowPricelbl3;
    private javax.swing.JLabel ShowPricelbl4;
    private javax.swing.JLabel ShowPricelbl5;
    private javax.swing.JButton btnNext;
    private javax.swing.JSeparator spCount;
    private javax.swing.JSeparator spCount1;
    private javax.swing.JSeparator spCount2;
    private javax.swing.JSeparator spNamePrice;
    private javax.swing.JSeparator spPrice;
    private javax.swing.JTextField txtAvailable;
    private javax.swing.JTextField txtCount;
    private javax.swing.JTextField txtNamePrice;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtUse;
    // End of variables declaration//GEN-END:variables
}
