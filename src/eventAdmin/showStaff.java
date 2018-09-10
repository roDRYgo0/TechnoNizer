package eventAdmin;

import java.awt.Color;
import java.awt.MenuItem;
import java.awt.PopupMenu;

public class showStaff extends javax.swing.JPanel {

    public showStaff() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtnickname = new javax.swing.JTextField();
        spNickname = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(370, 45));
        setMinimumSize(new java.awt.Dimension(370, 45));
        setPreferredSize(new java.awt.Dimension(370, 45));

        txtnickname.setAutoscrolls(false);
        txtnickname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtnickname.setFocusable(false);
        txtnickname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnicknameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnicknameFocusLost(evt);
            }
        });
        txtnickname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnicknameKeyTyped(evt);
            }
        });

        spNickname.setForeground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Nombre de usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtnickname)
                    .addComponent(spNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(253, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(txtnickname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(spNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtnicknameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnicknameFocusGained
        spNickname.setBackground(Color.red);
    }//GEN-LAST:event_txtnicknameFocusGained

    private void txtnicknameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnicknameFocusLost
        spNickname.setBackground(Color.white);
    }//GEN-LAST:event_txtnicknameFocusLost

    private void txtnicknameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnicknameKeyTyped
        char c = evt.getKeyChar();
        if(c == ' ')
        evt.consume();
    }//GEN-LAST:event_txtnicknameKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator spNickname;
    private javax.swing.JTextField txtnickname;
    // End of variables declaration//GEN-END:variables
}
