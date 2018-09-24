package cards;

import java.awt.Color;
import javaClass.Card;
import javaClass.classCards;

public class showCard extends javax.swing.JPanel {

    int idcard;
    
    public showCard(int idcard, boolean search) {
        initComponents();
        this.idcard = idcard;
        load(idcard, search);
    }

    void load(int e, boolean search){
        
        Card card;
        if (!search)
            card = classCards.cards.get(e);
        else
            card = classCards.cardsSearch.get(e);
        
        lblTitle.setText(card.title);
        lblCount.setText(card.activitiesCompleted + "/" + card.totalActivities);
        
        if(card.color != null){
            String[] color = card.color.split(" ");
            pnColor.setBackground(new Color(Integer.parseInt(color[0]), Integer.parseInt(color[1]), Integer.parseInt(color[2])));
        }
        else
            pnColor.setBackground(new Color(35, 150, 243));
        
        if(lblTitle.getText().length() >= 22){
            lblTitle.setToolTipText(lblTitle.getText());
            lblTitle.setText(lblTitle.getText().substring(0, 22)+"...");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCount = new javax.swing.JLabel();
        pnColor = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();

        lblCount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCount.setText("nickName");

        pnColor.setBackground(new java.awt.Color(33, 150, 243));
        pnColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnColorMouseReleased(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Not Found");
        lblTitle.setToolTipText("");
        lblTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnColorMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnColorLayout = new javax.swing.GroupLayout(pnColor);
        pnColor.setLayout(pnColorLayout);
        pnColorLayout.setHorizontalGroup(
            pnColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnColorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnColorLayout.setVerticalGroup(
            pnColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnColorLayout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(lblCount)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pnColorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnColorMouseReleased
        
    }//GEN-LAST:event_pnColorMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCount;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnColor;
    // End of variables declaration//GEN-END:variables
}
