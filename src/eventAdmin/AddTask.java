package eventAdmin;

import java.awt.Color;
import javaClass.classEvent;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.standardization;

public class AddTask extends javax.swing.JFrame {

    int idEvent;
    int visibility;
    int status;
    
    public AddTask(int idEvent){
        initComponents();
        this.idEvent = idEvent;
        visibility = 1;
        status = 0;
        switchVisibility();
        switchStatus();
        load();       
    }   

    void load(){
        iconPrice.setIcon(new controller().changeImage("/imagenes/dollar.png", 35, 35));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTask = new javax.swing.JTextField();
        spEvent = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        spPlace = new javax.swing.JSeparator();
        iconPrice = new javax.swing.JLabel();
        lblSwitchS = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblSwitchV = new javax.swing.JLabel();
        lblVisibility = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(35, 150, 243));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Agregar tarea");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Technonizer");

        btnExit.setBackground(new java.awt.Color(0, 153, 255));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("X");
        btnExit.setBorderPainted(false);
        btnExit.setFocusable(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(btnExit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Datos Generales");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Tarea");

        txtTask.setAutoscrolls(false);
        txtTask.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtTask.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTaskFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTaskFocusLost(evt);
            }
        });
        txtTask.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTaskKeyTyped(evt);
            }
        });

        spEvent.setForeground(new java.awt.Color(204, 204, 204));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Costo");

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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriceKeyTyped(evt);
            }
        });

        spPlace.setForeground(new java.awt.Color(204, 204, 204));

        iconPrice.setMaximumSize(new java.awt.Dimension(35, 35));
        iconPrice.setMinimumSize(new java.awt.Dimension(35, 35));
        iconPrice.setPreferredSize(new java.awt.Dimension(35, 35));

        lblSwitchS.setMaximumSize(new java.awt.Dimension(30, 30));
        lblSwitchS.setMinimumSize(new java.awt.Dimension(30, 30));
        lblSwitchS.setPreferredSize(new java.awt.Dimension(30, 30));
        lblSwitchS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSwitchSMouseReleased(evt);
            }
        });

        lblStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStatus.setText("Activo");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Estado");

        lblSwitchV.setMaximumSize(new java.awt.Dimension(30, 30));
        lblSwitchV.setMinimumSize(new java.awt.Dimension(30, 30));
        lblSwitchV.setPreferredSize(new java.awt.Dimension(30, 30));
        lblSwitchV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSwitchVMouseReleased(evt);
            }
        });

        lblVisibility.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblVisibility.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblVisibility.setText("Activo");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Visibilidad");

        btnNext.setBackground(new java.awt.Color(0, 153, 255));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Agregar");
        btnNext.setBorderPainted(false);
        btnNext.setFocusable(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("(Opcional)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17)
                                    .addComponent(lblVisibility, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSwitchV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15)
                                    .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSwitchS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(spEvent)
                                .addComponent(txtTask, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(0, 77, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(iconPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrice)
                            .addComponent(spPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addGap(13, 13, 13)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTask, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(spEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSwitchS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSwitchV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblVisibility, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(9, 9, 9)
                        .addComponent(iconPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(spPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(12, 12, 12)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSwitchSMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSwitchSMouseReleased
        if(status == 0){
            status = 1;
            switchStatus();
        }else{
            status = 0;
            switchStatus();
        }
    }//GEN-LAST:event_lblSwitchSMouseReleased

    private void txtPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyTyped
        char c = evt.getKeyChar();
            if(c < '0' || c >'9'){
                if(c == '.'){}
                else
                    evt.consume();
        }
    }//GEN-LAST:event_txtPriceKeyTyped

    private void txtPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPriceFocusLost
        spPlace.setBackground(Color.white);
    }//GEN-LAST:event_txtPriceFocusLost

    private void txtPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPriceFocusGained
        spPlace.setBackground(Color.RED);
    }//GEN-LAST:event_txtPriceFocusGained

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if(txtTask.getText().trim().isEmpty())
            standardization.showMessage("warning", "Campos vacios");
        else{
            if(classEvent.inserttask(txtTask.getText().trim(), status, visibility, 
                    (txtPrice.getText().trim().isEmpty()) ? null : Double.parseDouble(txtPrice.getText().trim()), 
                    classEvent.eventosShow.get(idEvent).getId(), classUsuario.getNickname())){
                new Thread(()->{
                    technonizer.TechnoNizer.home.showLoad();
                    technonizer.TechnoNizer.home.showEventTask(idEvent);
                    standardization.showMessage("ok", "Exito al ingresar");
                }).start();
            }
            else
                standardization.showMessage("cancel", "No se logro ingresar");
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtTaskKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTaskKeyTyped
        char c = evt.getKeyChar();
        if(txtTask.getText().length()<41){
            if(Character.isLetter(c) || Character.isSpaceChar(c) || Character.isDigit(c)){}
            else
            evt.consume();
        }else
        evt.consume();
    }//GEN-LAST:event_txtTaskKeyTyped

    private void txtTaskFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTaskFocusLost
        spEvent.setBackground(Color.white);
        if(txtTask.getText().trim().length() < 4 && txtTask.getText().trim().length() > 0){
            standardization.showMessage("cancel", "Evento invalido");
            txtTask.setText("");
        }
    }//GEN-LAST:event_txtTaskFocusLost

    private void txtTaskFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTaskFocusGained
        spEvent.setBackground(Color.red);
    }//GEN-LAST:event_txtTaskFocusGained

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        controller.rootFrame = technonizer.TechnoNizer.home;
        standardization.hide(this);
    }//GEN-LAST:event_btnExitActionPerformed

    private void lblSwitchVMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSwitchVMouseReleased
        if(visibility == 0){
            visibility = 1;
            switchVisibility();
        }else{
            visibility = 0;
            switchVisibility();
        }
    }//GEN-LAST:event_lblSwitchVMouseReleased

    void switchVisibility(){
        switch(visibility){
            case 0:
                lblVisibility.setText("Invisible");
                lblVisibility.setForeground(new Color(255,61,0));
                lblSwitchV.setIcon(new controller().changeImage("/imagenes/toggleOff.png", 30, 30));
                break;
            case 1:
                lblVisibility.setText("Visible");
                lblVisibility.setForeground(new Color(139, 195, 74));
                lblSwitchV.setIcon(new controller().changeImage("/imagenes/toggleOn.png", 30, 30));
                break;
        }
    }
    
    void switchStatus(){
        switch(status){
            case 0:
                lblStatus.setText("No");
                lblStatus.setForeground(new Color(255,61,0));
                lblSwitchS.setIcon(new controller().changeImage("/imagenes/toggleOff.png", 30, 30));
                break;
            case 1:
                lblStatus.setText("Si");
                lblStatus.setForeground(new Color(139, 195, 74));
                lblSwitchS.setIcon(new controller().changeImage("/imagenes/toggleOn.png", 30, 30));
                break;
        }
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel iconPrice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblSwitchS;
    private javax.swing.JLabel lblSwitchV;
    private javax.swing.JLabel lblVisibility;
    private javax.swing.JSeparator spEvent;
    private javax.swing.JSeparator spPlace;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtTask;
    // End of variables declaration//GEN-END:variables

}
