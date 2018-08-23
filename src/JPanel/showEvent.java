package JPanel;

import javaClass.classEvent;

public class showEvent extends javax.swing.JPanel {

    public showEvent(int event, boolean search) {
        initComponents();
        
        load(event, search);
    }

    void load(int e, boolean search){
        if(search){
            lblEventName.setText(classEvent.eventos.get(e).getEventName());
            lblNickname.setText(classEvent.eventos.get(e).getNicknameCreator());
        }else{
            lblEventName.setText(classEvent.eventosSearch.get(e).getEventName());
            lblNickname.setText(classEvent.eventosSearch.get(e).getNicknameCreator());
        }
        
        if(lblEventName.getText().length() >= 22){
            lblEventName.setToolTipText(lblEventName.getText());
            lblEventName.setText(lblEventName.getText().substring(0, 22)+"...");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEventName = new javax.swing.JLabel();
        lblNickname = new javax.swing.JLabel();

        lblEventName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblEventName.setText("Not Found");
        lblEventName.setToolTipText("");

        lblNickname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNickname.setText("nickName");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNickname, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(lblEventName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(lblEventName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNickname)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblEventName;
    private javax.swing.JLabel lblNickname;
    // End of variables declaration//GEN-END:variables
}