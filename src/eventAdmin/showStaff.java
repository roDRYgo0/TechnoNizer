package eventAdmin;

import java.awt.Color;
import javaClass.classEvent;
import javaClass.controller;
import javaClass.standardization;

public class showStaff extends javax.swing.JPanel {

    int idEvent;
    int staff;
    
    public showStaff(boolean owner, int idEvent) {
        initComponents();
        this.idEvent = idEvent;
        load(owner);
            
    }
    
    public showStaff(boolean owner, int idEvent, int staff) {
        initComponents();
        this.idEvent = idEvent;
        this.staff = staff;
        load(owner);
            
    }
    
    void load(boolean owner){
        if(owner){
            txtNickname.setText(classEvent.eventosShow.get(idEvent).getNicknameCreator());
            iconPos.setIcon(new controller().changeImage("/imagenes/owner.png", 25, 25));
            iconPos.setText("Creador");
            btnAction.setVisible(false);
        }else{
            switch(classEvent.eventosShow.get(idEvent).getStaffs().get(staff).getPosition()){
                case 1:
                    txtNickname.setText(classEvent.eventosShow.get(idEvent).getStaffs().get(staff).getNickname());
                    iconPos.setIcon(new controller().changeImage("/imagenes/admin.png", 25, 25));
                    iconPos.setText("Administrador");
                    break;
                case 2:
                    txtNickname.setText(classEvent.eventosShow.get(idEvent).getStaffs().get(staff).getNickname());
                    iconPos.setIcon(new controller().changeImage("/imagenes/mod.png", 25, 25));
                    iconPos.setText("Moderador");
                    break;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNickname = new javax.swing.JTextField();
        spNickname = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        iconPos = new javax.swing.JLabel();
        btnAction = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(420, 45));
        setMinimumSize(new java.awt.Dimension(420, 45));
        setPreferredSize(new java.awt.Dimension(420, 45));

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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNicknameKeyTyped(evt);
            }
        });

        spNickname.setForeground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Nombre de usuario");

        iconPos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        iconPos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        iconPos.setText("Administrador");
        iconPos.setMaximumSize(new java.awt.Dimension(35, 35));
        iconPos.setMinimumSize(new java.awt.Dimension(35, 35));
        iconPos.setPreferredSize(new java.awt.Dimension(35, 35));

        btnAction.setBackground(new java.awt.Color(255, 0, 0));
        btnAction.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAction.setForeground(new java.awt.Color(255, 255, 255));
        btnAction.setText("Eliminar");
        btnAction.setBorderPainted(false);
        btnAction.setFocusable(false);
        btnAction.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnAction.setMaximumSize(new java.awt.Dimension(79, 28));
        btnAction.setMinimumSize(new java.awt.Dimension(79, 28));
        btnAction.setPreferredSize(new java.awt.Dimension(79, 28));
        btnAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spNickname)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 92, Short.MAX_VALUE))
                            .addComponent(txtNickname))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(iconPos, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, 0)
                        .addComponent(txtNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(iconPos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAction, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0)
                .addComponent(spNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNicknameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNicknameFocusGained
        spNickname.setBackground(Color.red);
    }//GEN-LAST:event_txtNicknameFocusGained

    private void txtNicknameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNicknameFocusLost
        spNickname.setBackground(Color.white);
    }//GEN-LAST:event_txtNicknameFocusLost

    private void txtNicknameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNicknameKeyTyped
        char c = evt.getKeyChar();
        if(c == ' ')
        evt.consume();
    }//GEN-LAST:event_txtNicknameKeyTyped

    private void btnActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionActionPerformed
        if(classEvent.deleteStaff(txtNickname.getText(), classEvent.eventosShow.get(idEvent).getId())){
            standardization.showMessage("ok", "Eliminado correctamente");
            for(int i = 0; i < classEvent.eventos.size(); i++){
                if(classEvent.eventos.get(i).getId() == classEvent.eventosShow.get(idEvent).getId()){
                    classEvent.eventos.get(i).setStaffs(classEvent.selectStaff(classEvent.eventosShow.get(idEvent).getId()));
                    break;
                }
            }
            technonizer.TechnoNizer.home.showEventSettings(idEvent);
        }else{
            standardization.showMessage("cancel", "Imposible eliminar");
        }
    }//GEN-LAST:event_btnActionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAction;
    private javax.swing.JLabel iconPos;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator spNickname;
    private javax.swing.JTextField txtNickname;
    // End of variables declaration//GEN-END:variables
}
