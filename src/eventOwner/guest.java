package eventOwner;

import java.awt.Color;

public class guest extends javax.swing.JPanel {

    public guest(String nickname, int count, String ticket) {
        initComponents();
        txtNickname.setText(nickname);
        txtCount.setText(count+"");
        txtTicket.setText(ticket);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spNamePrice = new javax.swing.JSeparator();
        ShowPricelbl2 = new javax.swing.JLabel();
        txtTicket = new javax.swing.JTextField();
        spPrice = new javax.swing.JSeparator();
        ShowPricelbl3 = new javax.swing.JLabel();
        txtCount = new javax.swing.JTextField();
        spCount = new javax.swing.JSeparator();
        ShowPricelbl1 = new javax.swing.JLabel();
        txtNickname = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        spNamePrice.setForeground(new java.awt.Color(204, 204, 204));

        ShowPricelbl2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ShowPricelbl2.setForeground(new java.awt.Color(102, 102, 102));
        ShowPricelbl2.setText("Ticket");

        txtTicket.setAutoscrolls(false);
        txtTicket.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtTicket.setFocusable(false);
        txtTicket.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTicketFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTicketFocusLost(evt);
            }
        });
        txtTicket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTicketKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTicketKeyTyped(evt);
            }
        });

        spPrice.setForeground(new java.awt.Color(204, 204, 204));

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

        ShowPricelbl1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ShowPricelbl1.setForeground(new java.awt.Color(102, 102, 102));
        ShowPricelbl1.setText("Usuario");

        txtNickname.setAutoscrolls(false);
        txtNickname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtNickname.setFocusable(false);
        txtNickname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNicknameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNicknameFocusLost(evt);
            }
        });
        txtNickname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNicknameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNicknameKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ShowPricelbl1)
                    .addComponent(txtNickname)
                    .addComponent(spNamePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ShowPricelbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spCount)
                    .addComponent(txtCount, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ShowPricelbl2, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(txtTicket, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spPrice))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(ShowPricelbl2)
                    .addGap(0, 0, 0)
                    .addComponent(txtTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(spPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(ShowPricelbl3)
                    .addGap(0, 0, 0)
                    .addComponent(txtCount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(spCount, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(ShowPricelbl1)
                .addGap(0, 0, 0)
                .addComponent(txtNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(spNamePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTicketFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTicketFocusGained
        spPrice.setBackground(Color.red);
    }//GEN-LAST:event_txtTicketFocusGained

    private void txtTicketFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTicketFocusLost
        spPrice.setBackground(Color.white);
    }//GEN-LAST:event_txtTicketFocusLost

    private void txtTicketKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTicketKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTicketKeyPressed

    private void txtTicketKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTicketKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTicketKeyTyped

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

    private void txtNicknameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNicknameFocusGained
        spNamePrice.setBackground(Color.red);
    }//GEN-LAST:event_txtNicknameFocusGained

    private void txtNicknameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNicknameFocusLost
        spNamePrice.setBackground(Color.white);
    }//GEN-LAST:event_txtNicknameFocusLost

    private void txtNicknameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNicknameKeyPressed

    }//GEN-LAST:event_txtNicknameKeyPressed

    private void txtNicknameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNicknameKeyTyped
        char c = evt.getKeyChar();
        if(c == ' ')
        evt.consume();
    }//GEN-LAST:event_txtNicknameKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ShowPricelbl1;
    private javax.swing.JLabel ShowPricelbl2;
    private javax.swing.JLabel ShowPricelbl3;
    private javax.swing.JSeparator spCount;
    private javax.swing.JSeparator spNamePrice;
    private javax.swing.JSeparator spPrice;
    private javax.swing.JTextField txtCount;
    private javax.swing.JTextField txtNickname;
    private javax.swing.JTextField txtTicket;
    // End of variables declaration//GEN-END:variables
}
