/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventAdmin;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javaClass.classEvent;
import javaClass.controller;
import javaClass.event;
import javaClass.standardization;
import javaClass.users;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author rodri
 */
public class addStaff extends javax.swing.JPanel {

    List<users> usuarios;
    List<JMenuItem> items;
    
    int idEvent;
    
    public addStaff(int idEvent) {
        initComponents();
        this.idEvent = idEvent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupNickname = new javax.swing.JPopupMenu();
        menuItem1 = new javax.swing.JMenuItem();
        menuItem2 = new javax.swing.JMenuItem();
        menuItem3 = new javax.swing.JMenuItem();
        menuItem4 = new javax.swing.JMenuItem();
        menuItem5 = new javax.swing.JMenuItem();
        txtNickname = new javax.swing.JTextField();
        spNickname = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbPos = new javax.swing.JComboBox<>();
        btnNext = new javax.swing.JButton();

        menuItem1.setText("jMenuItem1");
        popupNickname.add(menuItem1);

        menuItem2.setText("jMenuItem1");
        popupNickname.add(menuItem2);

        menuItem3.setText("jMenuItem1");
        popupNickname.add(menuItem3);

        menuItem4.setText("jMenuItem1");
        popupNickname.add(menuItem4);

        menuItem5.setText("jMenuItem1");
        popupNickname.add(menuItem5);

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(370, 45));
        setMinimumSize(new java.awt.Dimension(370, 45));

        txtNickname.setAutoscrolls(false);
        txtNickname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtNickname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNicknameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNicknameFocusLost(evt);
            }
        });
        txtNickname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNicknameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNicknameKeyTyped(evt);
            }
        });

        spNickname.setForeground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Nombre de usuario");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Cargo");

        cmbPos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Moderador" }));

        btnNext.setBackground(new java.awt.Color(33, 150, 243));
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spNickname, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(txtNickname))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbPos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(cmbPos)))))
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

    private void txtNicknameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNicknameKeyReleased
        popupNickname = new JPopupMenu();
        usuarios = new ArrayList<>();
        items = new ArrayList<>();
        items.clear();
        popupNickname.removeAll();
        
        for(users u : controller.usuarios){
            if(u.getNickname().contains(txtNickname.getText().trim())){
                usuarios.add(u);
                items.add(new JMenuItem(u.getNickname()));
            }
        }
        
        if(usuarios.size() < 5){
            for(int i = 0; i< usuarios.size(); i++)
                popupNickname.add(items.get(i));
        }else{
            for(int i = 0; i < 5; i++)
                popupNickname.add(items.get(i));
        }
        popupNickname.show(this,txtNickname.getX(),txtNickname.getY()+30);
        txtNickname.requestFocus();
        
        for(JMenuItem item : items){
            item.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    txtNickname.setText(item.getText());
                }
            });
        }
        
    }//GEN-LAST:event_txtNicknameKeyReleased

    private void txtNicknameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNicknameKeyTyped
        char c = evt.getKeyChar();
        if(c == ' ')
        evt.consume();
    }//GEN-LAST:event_txtNicknameKeyTyped

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        boolean user = false;
        for(users s : controller.usuarios){
            if(txtNickname.getText().equals(s.getNickname()))
                user = true;
        }
        if(user){
            if(classEvent.insetStaff(idEvent, cmbPos.getSelectedIndex()+1, txtNickname.getText())){
                for(int e = 0; e < classEvent.eventosShow.size(); e ++){
                    if(classEvent.eventosShow.get(e).getId() == idEvent)
                        technonizer.TechnoNizer.home.showEvent(e);
                }
                standardization.showMessage("ok", "Agregado corectamente");
            }else
                standardization.showMessage("cancel", "No se puede agregar");
        }else
            standardization.showMessage("warning", "El usuario no se encuentra");
    }//GEN-LAST:event_btnNextActionPerformed

    void setVisible(){
        menuItem1.setVisible(true);
        menuItem2.setVisible(true);
        menuItem3.setVisible(true);
        menuItem4.setVisible(true);
        menuItem5.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JComboBox<String> cmbPos;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem menuItem1;
    private javax.swing.JMenuItem menuItem2;
    private javax.swing.JMenuItem menuItem3;
    private javax.swing.JMenuItem menuItem4;
    private javax.swing.JMenuItem menuItem5;
    private javax.swing.JPopupMenu popupNickname;
    private javax.swing.JSeparator spNickname;
    private javax.swing.JTextField txtNickname;
    // End of variables declaration//GEN-END:variables
}
