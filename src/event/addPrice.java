package event;

import java.awt.Color;
import java.util.Properties;
import javaClass.classEvent;
import javaClass.classPrice;
import javaClass.controller;
import javaClass.standardization;
import javax.swing.JFrame;
import properties.propiedades;

/** @author rodri */

public class addPrice extends javax.swing.JPanel {
    JFrame event; 
    
    void verificaridioma()
    {
    Properties pr=new propiedades(controller.idioma);
    NameTicket.setText(pr.getProperty("NameTicket"));
    priceTicket.setText(pr.getProperty("priceTicket"));
    CountTickets.setText(pr.getProperty("CountTickets"));
    btnNext.setText(pr.getProperty("btnNextTickets"));
    }
    
    public addPrice(JFrame event) {
        initComponents();
        verificaridioma();
        this.event=event;
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNext = new javax.swing.JButton();
        txtCount = new javax.swing.JTextField();
        spCount = new javax.swing.JSeparator();
        NameTicket = new javax.swing.JLabel();
        txtNamePrice = new javax.swing.JTextField();
        spNamePrice = new javax.swing.JSeparator();
        priceTicket = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        spPrice = new javax.swing.JSeparator();
        CountTickets = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(306, 45));
        setMinimumSize(new java.awt.Dimension(306, 45));
        setPreferredSize(new java.awt.Dimension(306, 45));

        btnNext.setBackground(new java.awt.Color(0, 153, 255));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Agregar");
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

        txtCount.setAutoscrolls(false);
        txtCount.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
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

        NameTicket.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        NameTicket.setForeground(new java.awt.Color(102, 102, 102));
        NameTicket.setText("Nombre");

        txtNamePrice.setAutoscrolls(false);
        txtNamePrice.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
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

        CountTickets.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        CountTickets.setForeground(new java.awt.Color(102, 102, 102));
        CountTickets.setText("Cantidad");

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
                    .addComponent(txtNamePrice)
                    .addComponent(spNamePrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(priceTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spPrice)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCount)
                    .addComponent(spCount)
                    .addComponent(CountTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameTicket)
                            .addComponent(priceTicket))
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
                                .addComponent(CountTickets)
                                .addGap(0, 0, 0)
                                .addComponent(txtCount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, 0)
                        .addComponent(spCount, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
       try{
            if(txtNamePrice.getText().trim().isEmpty() || txtPrice.getText().isEmpty() || txtCount.getText().isEmpty())
            {
             standardization.showMessage("warning","Hay campos vacios!",controller.addEvents);
            }else if(Double.parseDouble(txtPrice.getText()) > 9999)
                standardization.showMessage("warning","Precio invalido",controller.addEvents);
            else{
                if(controller.addEvents.getGuest().equals("Ilimitados")){
                    if(Integer.parseInt(txtCount.getText())>9999){
                        classPrice cp = new classPrice();
                        cp.setName(txtNamePrice.getText().trim());
                        cp.setPrice(Double.parseDouble(txtPrice.getText()));
                        cp.setCount(-1);
                        classEvent.prices.add(cp);
                        controller.addEvents.load();
                    }else{
                        classPrice cp = new classPrice();
                        cp.setName(txtNamePrice.getText().trim());
                        cp.setPrice(Double.parseDouble(txtPrice.getText()));
                        cp.setCount(Integer.parseInt(txtCount.getText()));
                        classEvent.prices.add(cp);
                        controller.addEvents.load();
                    }
                }else if( (Integer.parseInt(controller.addEvents.getGuest())-Integer.parseInt(txtCount.getText())) < 0 ){
                    standardization.showMessage("warning","Cantidad invalido",controller.addEvents);
                }else{
                    classPrice cp = new classPrice();
                    cp.setName(txtNamePrice.getText().trim());
                    cp.setPrice(Double.parseDouble(txtPrice.getText()));
                    cp.setCount(Integer.parseInt(txtCount.getText()));
                    controller.addEvents.setTickects(Integer.parseInt(controller.addEvents.getGuest())-Integer.parseInt(txtCount.getText()));
                    classEvent.prices.add(cp);
                    controller.addEvents.load();
                }
            }
       }catch(NumberFormatException e){
           standardization.showMessage("warning","Precio invalido!",controller.addEvents);
       }
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtCountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCountFocusGained
        spCount.setBackground(Color.red);
    }//GEN-LAST:event_txtCountFocusGained

    private void txtCountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCountFocusLost
        spCount.setBackground(Color.white);
    }//GEN-LAST:event_txtCountFocusLost

    private void txtCountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCountKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountKeyPressed

    private void txtCountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCountKeyTyped
        char c = evt.getKeyChar();
        if(txtCount.getText().length() >= 5)
            evt.consume();
        else if(c < '0' || c >'9')
            evt.consume();
    }//GEN-LAST:event_txtCountKeyTyped

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
        char c = evt.getKeyChar();
        if(c < '0' || c >'9'){
            if(c == '.'){}
            else
                evt.consume();
        }
    }//GEN-LAST:event_txtPriceKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CountTickets;
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
