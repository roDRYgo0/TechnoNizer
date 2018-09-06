package allEvent;

import java.awt.Color;
import javaClass.classEvent;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.event;

/**
 * 
 * @author rodri
 */

public class eventAdmin extends javax.swing.JPanel {


    public eventAdmin(int e, boolean search) {
        initComponents();
        load(e, search);
    }
    
    int y = 0;
    int count;
    
    void load(int e, boolean search){
        if(!search){
            for(event ev : classEvent.eventos){
                if(ev.getNicknameCreator().equals(classUsuario.getNickname()) ){
                    if(count == e){
                        loadEvent(ev);
                    }
                    count++;
                }
            }
        }else{
            for(event ev : classEvent.eventosSearch){
                if(ev.getNicknameCreator().equals(classUsuario.getNickname()) ){
                    if(count == e){
                        loadEvent(ev);
                    }
                    count++;
                }
            }
        }
    }
    
    void loadImage(){
        iconAvailable.setIcon(new controller().changeImage("/imagenes/hashtag.png", 25, 25));
        iconGuest.setIcon(new controller().changeImage("/imagenes/hashtag.png", 25, 25));
    }
    
    void loadEvent(event ev){
        lblEventName.setText(ev.getEventName());
        lblCreatorNickName.setText(ev.getNicknameCreator());
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblEventName = new javax.swing.JLabel();
        Creador = new javax.swing.JLabel();
        lblCreatorNickName = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        spAvailable = new javax.swing.JSeparator();
        lblAvailable = new javax.swing.JLabel();
        iconAvailable = new javax.swing.JLabel();
        txtAvailable = new javax.swing.JTextField();
        spGuest = new javax.swing.JSeparator();
        txtGuest = new javax.swing.JTextField();
        lblGuest = new javax.swing.JLabel();
        iconGuest = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnTickets = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(980, 32767));
        setMinimumSize(new java.awt.Dimension(980, 0));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/escritorio.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(603, 244));
        jLabel3.setMinimumSize(new java.awt.Dimension(603, 244));
        jLabel3.setPreferredSize(new java.awt.Dimension(603, 244));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblEventName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblEventName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/forgotPassword.png"))); // NOI18N
        lblEventName.setText("Exposicion de autos pasados de año");

        Creador.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        Creador.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Creador.setText("Creador ");

        lblCreatorNickName.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblCreatorNickName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCreatorNickName.setText("dev.rodrig");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEventName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCreatorNickName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Creador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblEventName))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCreatorNickName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Creador, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        spAvailable.setForeground(new java.awt.Color(204, 204, 204));

        lblAvailable.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblAvailable.setForeground(new java.awt.Color(33, 150, 243));
        lblAvailable.setText("Entradas disponibles");

        iconAvailable.setMaximumSize(new java.awt.Dimension(25, 25));
        iconAvailable.setMinimumSize(new java.awt.Dimension(25, 25));
        iconAvailable.setPreferredSize(new java.awt.Dimension(25, 25));

        txtAvailable.setEditable(false);
        txtAvailable.setBackground(new java.awt.Color(255, 255, 255));
        txtAvailable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtAvailable.setForeground(new java.awt.Color(0, 204, 0));
        txtAvailable.setAutoscrolls(false);
        txtAvailable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtAvailable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAvailableFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAvailableFocusLost(evt);
            }
        });
        txtAvailable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAvailableKeyTyped(evt);
            }
        });

        spGuest.setForeground(new java.awt.Color(204, 204, 204));

        txtGuest.setEditable(false);
        txtGuest.setBackground(new java.awt.Color(255, 255, 255));
        txtGuest.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtGuest.setForeground(new java.awt.Color(204, 0, 0));
        txtGuest.setAutoscrolls(false);
        txtGuest.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtGuest.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtGuestFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtGuestFocusLost(evt);
            }
        });
        txtGuest.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGuestKeyTyped(evt);
            }
        });

        lblGuest.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblGuest.setForeground(new java.awt.Color(33, 150, 243));
        lblGuest.setText("Invitados");

        iconGuest.setMaximumSize(new java.awt.Dimension(25, 25));
        iconGuest.setMinimumSize(new java.awt.Dimension(25, 25));
        iconGuest.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAvailable)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(iconAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAvailable, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(spAvailable))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGuest)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(iconGuest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtGuest)
                            .addComponent(spGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblGuest)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iconGuest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(spGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblAvailable)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iconAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(spAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 936, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Entradas");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(293, 293, 293))
        );

        pnTickets.setBackground(new java.awt.Color(255, 0, 0));
        pnTickets.setMaximumSize(new java.awt.Dimension(500, 276));
        pnTickets.setMinimumSize(new java.awt.Dimension(500, 276));
        pnTickets.setLayout(new javaClass.ModifiedFlowLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(pnTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(299, 299, 299)
                .addComponent(pnTickets, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAvailableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAvailableFocusGained
        spAvailable.setBackground(Color.red);
    }//GEN-LAST:event_txtAvailableFocusGained

    private void txtAvailableFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAvailableFocusLost
        spAvailable.setBackground(Color.white);
    }//GEN-LAST:event_txtAvailableFocusLost

    private void txtAvailableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAvailableKeyTyped

    }//GEN-LAST:event_txtAvailableKeyTyped

    private void txtGuestFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGuestFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGuestFocusGained

    private void txtGuestFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGuestFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGuestFocusLost

    private void txtGuestKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGuestKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGuestKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Creador;
    private javax.swing.JLabel iconAvailable;
    private javax.swing.JLabel iconGuest;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAvailable;
    private javax.swing.JLabel lblCreatorNickName;
    private javax.swing.JLabel lblEventName;
    private javax.swing.JLabel lblGuest;
    private javax.swing.JPanel pnTickets;
    private javax.swing.JSeparator spAvailable;
    private javax.swing.JSeparator spGuest;
    private javax.swing.JTextField txtAvailable;
    private javax.swing.JTextField txtGuest;
    // End of variables declaration//GEN-END:variables
}
