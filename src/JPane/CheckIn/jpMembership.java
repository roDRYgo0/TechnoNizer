package JPane.CheckIn;

import jFrame.*;
import java.awt.BorderLayout;
import java.awt.Color;
import javaClass.*;
import technonizer.*;

public class jpMembership extends javax.swing.JPanel {
    
    String name;
    String description;
    int condition;
    int numberEvents;
    int numberAdmins;
    int numberModerators;
    int numberGuests;
    float price;
    
    public jpMembership() {
        initComponents();
        name = "";
        description = "";
        condition = -1;
        numberEvents = -2;
        numberAdmins = -2;      
        numberModerators = -2;
        numberGuests = -2;
        price = -1;
        sortFree.setIcon(new controller().changeImage("/imagenes/sortDown.png", 36, 36));
        pnFree.setBackground(new Color(33,150,243));
        
        seleccionarMembership(1);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pnFree = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        pnVip = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnPremium = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        sortFree = new javax.swing.JLabel();
        sortVip = new javax.swing.JLabel();
        sortPremium = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        lblEvents = new javax.swing.JLabel();
        lblModer = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(420, 603));
        setMinimumSize(new java.awt.Dimension(420, 603));
        setPreferredSize(new java.awt.Dimension(420, 603));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Selecciona tu membresia");

        pnFree.setBackground(new java.awt.Color(33, 150, 243));
        pnFree.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        pnFree.setMaximumSize(new java.awt.Dimension(100, 100));
        pnFree.setMinimumSize(new java.awt.Dimension(100, 100));
        pnFree.setPreferredSize(new java.awt.Dimension(100, 100));
        pnFree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnFreeMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnFreeMouseReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gratis");

        javax.swing.GroupLayout pnFreeLayout = new javax.swing.GroupLayout(pnFree);
        pnFree.setLayout(pnFreeLayout);
        pnFreeLayout.setHorizontalGroup(
            pnFreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFreeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnFreeLayout.setVerticalGroup(
            pnFreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFreeLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        btnNext.setBackground(new java.awt.Color(0, 153, 255));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Siguiente");
        btnNext.setBorderPainted(false);
        btnNext.setFocusable(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnBack.setText("Atras");
        btnBack.setBorderPainted(false);
        btnBack.setFocusable(false);
        btnBack.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        pnVip.setBackground(new java.awt.Color(180, 225, 255));
        pnVip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        pnVip.setMaximumSize(new java.awt.Dimension(100, 100));
        pnVip.setMinimumSize(new java.awt.Dimension(100, 100));
        pnVip.setPreferredSize(new java.awt.Dimension(100, 100));
        pnVip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnVipMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnVipMouseReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Vip");

        javax.swing.GroupLayout pnVipLayout = new javax.swing.GroupLayout(pnVip);
        pnVip.setLayout(pnVipLayout);
        pnVipLayout.setHorizontalGroup(
            pnVipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVipLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        pnVipLayout.setVerticalGroup(
            pnVipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVipLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pnPremium.setBackground(new java.awt.Color(180, 225, 255));
        pnPremium.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        pnPremium.setMaximumSize(new java.awt.Dimension(100, 100));
        pnPremium.setMinimumSize(new java.awt.Dimension(100, 100));
        pnPremium.setPreferredSize(new java.awt.Dimension(100, 100));
        pnPremium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnPremiumMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnPremiumMouseReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Premium");

        javax.swing.GroupLayout pnPremiumLayout = new javax.swing.GroupLayout(pnPremium);
        pnPremium.setLayout(pnPremiumLayout);
        pnPremiumLayout.setHorizontalGroup(
            pnPremiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPremiumLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        pnPremiumLayout.setVerticalGroup(
            pnPremiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPremiumLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        sortFree.setMaximumSize(new java.awt.Dimension(36, 36));
        sortFree.setMinimumSize(new java.awt.Dimension(36, 36));
        sortFree.setPreferredSize(new java.awt.Dimension(36, 36));

        sortVip.setMaximumSize(new java.awt.Dimension(36, 36));
        sortVip.setMinimumSize(new java.awt.Dimension(36, 36));
        sortVip.setPreferredSize(new java.awt.Dimension(36, 36));

        sortPremium.setMaximumSize(new java.awt.Dimension(36, 36));
        sortPremium.setMinimumSize(new java.awt.Dimension(36, 36));
        sortPremium.setPreferredSize(new java.awt.Dimension(36, 36));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(33, 150, 243));
        jLabel5.setText("Descripcion");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(33, 150, 243));
        jLabel6.setText("Número de eventos");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(33, 150, 243));
        jLabel7.setText("Número de administradores");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(33, 150, 243));
        jLabel8.setText("Número de moderadores");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(33, 150, 243));
        jLabel9.setText("Precio");

        lblDescripcion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDescripcion.setMaximumSize(new java.awt.Dimension(25, 25));
        lblDescripcion.setMinimumSize(new java.awt.Dimension(25, 25));
        lblDescripcion.setPreferredSize(new java.awt.Dimension(25, 25));

        lblAdmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAdmin.setMaximumSize(new java.awt.Dimension(30, 30));
        lblAdmin.setMinimumSize(new java.awt.Dimension(30, 30));
        lblAdmin.setPreferredSize(new java.awt.Dimension(30, 30));

        lblEvents.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEvents.setMaximumSize(new java.awt.Dimension(25, 25));
        lblEvents.setMinimumSize(new java.awt.Dimension(25, 25));
        lblEvents.setPreferredSize(new java.awt.Dimension(25, 25));

        lblModer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblModer.setMaximumSize(new java.awt.Dimension(30, 30));
        lblModer.setMinimumSize(new java.awt.Dimension(30, 30));
        lblModer.setPreferredSize(new java.awt.Dimension(30, 30));

        lblPrice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPrice.setText("e");
        lblPrice.setMaximumSize(new java.awt.Dimension(30, 30));
        lblPrice.setMinimumSize(new java.awt.Dimension(30, 30));
        lblPrice.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(sortFree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(sortVip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sortPremium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(pnFree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pnVip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pnPremium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescripcion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEvents, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAdmin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblModer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(48, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnFree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnVip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnPremium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sortFree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortVip, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortPremium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEvents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(11, 11, 11)
                .addComponent(lblAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblModer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if(logIn.internet)
        {
            if(classUsuario.insert())
                standardization.showMessage("ok", "Se inserto correctamente.", TechnoNizer.log); 
            else
                standardization.showMessage("error", "Error al insertar datos.", TechnoNizer.log); 
        }
        else
            standardization.showMessage("error", "Error al establecer una conexion de red.", TechnoNizer.log);
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        controller.jpCU.setSize(420,603);
        controller.jpCU.setLocation(0,0);
        controller.rootPane.removeAll();
        controller.rootPane.add(controller.jpCU,BorderLayout.CENTER);
        controller.rootPane.revalidate();
        controller.rootPane.repaint();
    }//GEN-LAST:event_btnBackActionPerformed
    
    //<editor-fold defaultstate="collapsed" desc="click">
    private void pnFreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnFreeMouseClicked
    }//GEN-LAST:event_pnFreeMouseClicked

    private void pnVipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnVipMouseClicked
    }//GEN-LAST:event_pnVipMouseClicked

    private void pnPremiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnPremiumMouseClicked
    }//GEN-LAST:event_pnPremiumMouseClicked
    //</editor-fold>
    
    private void pnPremiumMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnPremiumMouseReleased
        seleccionarMembership(3);
    }//GEN-LAST:event_pnPremiumMouseReleased

    private void pnVipMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnVipMouseReleased
        seleccionarMembership(2);
    }//GEN-LAST:event_pnVipMouseReleased

    private void pnFreeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnFreeMouseReleased
        seleccionarMembership(1);
    }//GEN-LAST:event_pnFreeMouseReleased

    void seleccionarMembership(int m){
        switch(m){
            case 1:
                limpiar();
                pnFree.setBackground(new Color(33,150,243));
                sortFree.setIcon(new controller().changeImage("/imagenes/sortDown.png", 36, 36));
                capturarDatos(0);
                classUsuario.setIdMemberships(1);
                mostrarDatos();
                break;
            case 2:
                limpiar();
                pnVip.setBackground(new Color(33,150,243));
                sortVip.setIcon(new controller().changeImage("/imagenes/sortDown.png", 36, 36));
                capturarDatos(1);
                classUsuario.setIdMemberships(2);
                mostrarDatos();
                break;
            case 3:
                limpiar();
                pnPremium.setBackground(new Color(33,150,243));
                sortPremium.setIcon(new controller().changeImage("/imagenes/sortDown.png", 36, 36));
                capturarDatos(2);
                classUsuario.setIdMemberships(3);
                mostrarDatos();
                break;
        }
        System.out.println(name+" "+description+" "+condition+" "+numberEvents+" "+numberAdmins+" "+numberGuests+" "+price);
    }
    
    void capturarDatos(int m){
        name = controller.member[m].getName();
        description = controller.member[m].getDescription();
        condition = controller.member[m].getCondition();
        numberEvents = controller.member[m].getNumberEvents();
        numberAdmins = controller.member[m].getNumberAdmins();
        numberModerators = controller.member[m].getNumberModerators();
        numberGuests = controller.member[m].getNumberGuests();
        price = controller.member[m].getPrice();
        switch(m){
            case 1:
                classUsuario.setDurationMem(0);
                break;
            case 2:
                classUsuario.setDurationMem(365);
                break;
            case 3:
                classUsuario.setDurationMem(365);
                break;
        }
    }
 
    void mostrarDatos(){
        lblDescripcion.setText(description);
        lblDescripcion.setIcon(new controller().changeImage("/imagenes/description.png", 25, 25));
        
        lblEvents.setText(numberEvents+"");
        if(numberEvents==-1){
            lblEvents.setIcon(new controller().changeImage("/imagenes/infinity.png", 25, 25));
            lblEvents.setText("Ilimitados");
        }
        else
            lblEvents.setIcon(new controller().changeImage("/imagenes/hashtag.png", 25, 25));
        
        lblAdmin.setText(numberAdmins+"");
        if(numberAdmins==-1){
            lblAdmin.setIcon(new controller().changeImage("/imagenes/infinity.png", 25, 25));
            lblAdmin.setText("Ilimitados");
        }
        else
            lblAdmin.setIcon(new controller().changeImage("/imagenes/hashtag.png", 25, 25));
        
        lblModer.setText(numberModerators+"");
        if(numberModerators==-1){
            lblModer.setIcon(new controller().changeImage("/imagenes/infinity.png", 25, 25));
            lblModer.setText("Ilimitados");
        }
        else
            lblModer.setIcon(new controller().changeImage("/imagenes/hashtag.png", 25, 25));
        
        lblPrice.setText("$"+price);
        if(price==0)
            lblPrice.setIcon(new controller().changeImage("/imagenes/free.png", 49, 49));
        else
            lblPrice.setIcon(new controller().changeImage("/imagenes/dollar.png", 49, 49));
    }
    
    void limpiar(){
        pnFree.setBackground(new Color(180,225,255));
        pnVip.setBackground(new Color(180,225,255));
        pnPremium.setBackground(new Color(180,225,255));
        sortFree.setIcon(null);
        sortVip.setIcon(null);
        sortPremium.setIcon(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblEvents;
    private javax.swing.JLabel lblModer;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JPanel pnFree;
    private javax.swing.JPanel pnPremium;
    private javax.swing.JPanel pnVip;
    private javax.swing.JLabel sortFree;
    private javax.swing.JLabel sortPremium;
    private javax.swing.JLabel sortVip;
    // End of variables declaration//GEN-END:variables
}
