package admin;

import jFrame.admin;
import java.awt.Color;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.standardization;

public class jpSettingsAdmin extends javax.swing.JPanel {

    String name;
    String description;
    int condition;
    int numberEvents;
    int numberAdmins;
    int numberModerators;
    int numberGuests;
    float price;
    int newMembership;
    admin house;
    
    int membership;
    
    public jpSettingsAdmin(admin house) {
        initComponents();
        this.house = house;
        newMembership = -1;
        name = "";
        description = "";
        condition = -1;
        numberEvents = -2;
        numberAdmins = -2;      
        numberModerators = -2;
        numberGuests = -2;
        price = -1;
        
        membership = 1;
        
        sortFree.setIcon(new controller().changeImage("/imagenes/sortDown.png", 36, 36));
        pnFree.setBackground(new Color(33,150,243));
        seleccionarMembership(membership);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnFree = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnVip = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnPremium = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        sortFree = new javax.swing.JLabel();
        sortVip = new javax.swing.JLabel();
        sortPremium = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnChangeMembership = new javax.swing.JButton();
        txtDescription = new javax.swing.JTextField();
        spDescription = new javax.swing.JSeparator();
        iconDescription = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        iconNumEvents = new javax.swing.JLabel();
        spNumEvents = new javax.swing.JSeparator();
        txtNumEvents = new javax.swing.JTextField();
        txtAdmin = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        iconAdmin = new javax.swing.JLabel();
        spAdmin = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        iconMod = new javax.swing.JLabel();
        txtMod = new javax.swing.JTextField();
        spMod = new javax.swing.JSeparator();
        txtPrice = new javax.swing.JTextField();
        iconPrice = new javax.swing.JLabel();
        spPrice = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(254, 254, 254));
        setMaximumSize(new java.awt.Dimension(980, 601));
        setMinimumSize(new java.awt.Dimension(980, 601));
        setPreferredSize(new java.awt.Dimension(980, 601));
        setRequestFocusEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Configuración");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(420, 603));
        jPanel1.setMinimumSize(new java.awt.Dimension(420, 603));

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

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gratis");

        javax.swing.GroupLayout pnFreeLayout = new javax.swing.GroupLayout(pnFree);
        pnFree.setLayout(pnFreeLayout);
        pnFreeLayout.setHorizontalGroup(
            pnFreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFreeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnFreeLayout.setVerticalGroup(
            pnFreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFreeLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addContainerGap(35, Short.MAX_VALUE))
        );

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

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Vip");

        javax.swing.GroupLayout pnVipLayout = new javax.swing.GroupLayout(pnVip);
        pnVip.setLayout(pnVipLayout);
        pnVipLayout.setHorizontalGroup(
            pnVipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVipLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        pnVipLayout.setVerticalGroup(
            pnVipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVipLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pnPremium.setBackground(new java.awt.Color(180, 225, 255));
        pnPremium.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        pnPremium.setMaximumSize(new java.awt.Dimension(100, 100));
        pnPremium.setMinimumSize(new java.awt.Dimension(100, 100));
        pnPremium.setPreferredSize(new java.awt.Dimension(100, 100));
        pnPremium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnPremiumMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnPremiumMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Premium");

        javax.swing.GroupLayout pnPremiumLayout = new javax.swing.GroupLayout(pnPremium);
        pnPremium.setLayout(pnPremiumLayout);
        pnPremiumLayout.setHorizontalGroup(
            pnPremiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPremiumLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        pnPremiumLayout.setVerticalGroup(
            pnPremiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPremiumLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel5)
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

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(33, 150, 243));
        jLabel6.setText("Descripcion");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(33, 150, 243));
        jLabel10.setText("Precio");

        btnChangeMembership.setBackground(new java.awt.Color(255, 0, 0));
        btnChangeMembership.setForeground(new java.awt.Color(254, 254, 254));
        btnChangeMembership.setText("Actualizar");
        btnChangeMembership.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnChangeMembership.setBorderPainted(false);
        btnChangeMembership.setFocusPainted(false);
        btnChangeMembership.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeMembershipActionPerformed(evt);
            }
        });

        txtDescription.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtDescription.setAutoscrolls(false);
        txtDescription.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtDescription.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescriptionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescriptionFocusLost(evt);
            }
        });
        txtDescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescriptionKeyTyped(evt);
            }
        });

        spDescription.setForeground(new java.awt.Color(204, 204, 204));

        iconDescription.setMaximumSize(new java.awt.Dimension(25, 25));
        iconDescription.setMinimumSize(new java.awt.Dimension(25, 25));
        iconDescription.setPreferredSize(new java.awt.Dimension(25, 25));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(33, 150, 243));
        jLabel11.setText("Número de eventos");

        iconNumEvents.setMaximumSize(new java.awt.Dimension(25, 25));
        iconNumEvents.setMinimumSize(new java.awt.Dimension(25, 25));
        iconNumEvents.setPreferredSize(new java.awt.Dimension(25, 25));

        spNumEvents.setForeground(new java.awt.Color(204, 204, 204));

        txtNumEvents.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtNumEvents.setAutoscrolls(false);
        txtNumEvents.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtNumEvents.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNumEventsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumEventsFocusLost(evt);
            }
        });
        txtNumEvents.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumEventsKeyTyped(evt);
            }
        });

        txtAdmin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtAdmin.setAutoscrolls(false);
        txtAdmin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtAdmin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAdminFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAdminFocusLost(evt);
            }
        });
        txtAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAdminKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(33, 150, 243));
        jLabel12.setText("Número de administradores");

        iconAdmin.setMaximumSize(new java.awt.Dimension(25, 25));
        iconAdmin.setMinimumSize(new java.awt.Dimension(25, 25));
        iconAdmin.setPreferredSize(new java.awt.Dimension(25, 25));

        spAdmin.setForeground(new java.awt.Color(204, 204, 204));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(33, 150, 243));
        jLabel13.setText("Número de moderadores");

        iconMod.setMaximumSize(new java.awt.Dimension(25, 25));
        iconMod.setMinimumSize(new java.awt.Dimension(25, 25));
        iconMod.setPreferredSize(new java.awt.Dimension(25, 25));

        txtMod.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtMod.setAutoscrolls(false);
        txtMod.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtMod.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtModFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtModFocusLost(evt);
            }
        });
        txtMod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModKeyTyped(evt);
            }
        });

        spMod.setForeground(new java.awt.Color(204, 204, 204));

        txtPrice.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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

        iconPrice.setMaximumSize(new java.awt.Dimension(49, 49));
        iconPrice.setMinimumSize(new java.awt.Dimension(49, 49));
        iconPrice.setPreferredSize(new java.awt.Dimension(49, 49));

        spPrice.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(sortFree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(sortVip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sortPremium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(pnFree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(pnVip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(pnPremium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(160, 160, 160))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(iconPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(spPrice)
                                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnChangeMembership, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(iconDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDescription)
                                    .addComponent(spDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(iconMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMod)
                                    .addComponent(spMod, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel12)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(iconAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAdmin)
                                    .addComponent(spAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(iconNumEvents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNumEvents)
                                    .addComponent(spNumEvents, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnFree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnVip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnPremium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sortFree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortVip, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortPremium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(spDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconNumEvents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumEvents, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(spNumEvents, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(spAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(spMod, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(iconPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(spPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnChangeMembership, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pnFreeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnFreeMouseReleased
        seleccionarMembership(1);
        membership = 1;
    }//GEN-LAST:event_pnFreeMouseReleased

    private void pnFreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnFreeMouseClicked

    }//GEN-LAST:event_pnFreeMouseClicked

    private void pnVipMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnVipMouseReleased
        seleccionarMembership(2);
        membership = 2;
    }//GEN-LAST:event_pnVipMouseReleased

    private void pnVipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnVipMouseClicked

    }//GEN-LAST:event_pnVipMouseClicked

    private void pnPremiumMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnPremiumMouseReleased
        seleccionarMembership(3);
        membership = 3;
    }//GEN-LAST:event_pnPremiumMouseReleased

    private void pnPremiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnPremiumMouseClicked

    }//GEN-LAST:event_pnPremiumMouseClicked

    private void btnChangeMembershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeMembershipActionPerformed
        classUsuario.setPreviousIdMemberships(classUsuario.getIdMemberships());
        classUsuario.setIdMemberships(newMembership);
        if(classUsuario.updateMembership()){
            classUsuario.select();
            standardization.showMessage("ok","Tu membresia fue actualizada");
            house.settings();
        }
            
    }//GEN-LAST:event_btnChangeMembershipActionPerformed

    private void txtDescriptionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescriptionFocusGained
        spDescription.setBackground(Color.red);
    }//GEN-LAST:event_txtDescriptionFocusGained

    private void txtDescriptionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescriptionFocusLost
        spDescription.setBackground(Color.white);
    }//GEN-LAST:event_txtDescriptionFocusLost

    private void txtDescriptionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescriptionKeyTyped

    }//GEN-LAST:event_txtDescriptionKeyTyped

    private void txtNumEventsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumEventsFocusGained
        spNumEvents.setBackground(Color.red);

    }//GEN-LAST:event_txtNumEventsFocusGained

    private void txtNumEventsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumEventsFocusLost
        spDescription.setBackground(Color.white);
    }//GEN-LAST:event_txtNumEventsFocusLost

    private void txtNumEventsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumEventsKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c))
            evt.consume();
    }//GEN-LAST:event_txtNumEventsKeyTyped

    private void txtAdminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAdminFocusGained
        spAdmin.setBackground(Color.red);
    }//GEN-LAST:event_txtAdminFocusGained

    private void txtAdminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAdminFocusLost
        spAdmin.setBackground(Color.white);
    }//GEN-LAST:event_txtAdminFocusLost

    private void txtAdminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdminKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c))
            evt.consume();
    }//GEN-LAST:event_txtAdminKeyTyped

    private void txtModFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtModFocusGained
        spMod.setBackground(Color.red);
    }//GEN-LAST:event_txtModFocusGained

    private void txtModFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtModFocusLost
        spMod.setBackground(Color.white);
    }//GEN-LAST:event_txtModFocusLost

    private void txtModKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModKeyTyped
       char c = evt.getKeyChar();
        if(!Character.isDigit(c))
            evt.consume();
    }//GEN-LAST:event_txtModKeyTyped

    private void txtPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPriceFocusGained
        spPrice.setBackground(Color.red);
    }//GEN-LAST:event_txtPriceFocusGained

    private void txtPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPriceFocusLost
        spPrice.setBackground(Color.white);
    }//GEN-LAST:event_txtPriceFocusLost

    private void txtPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyTyped
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || c == '.'){}
        else
            evt.consume();
    }//GEN-LAST:event_txtPriceKeyTyped

    void seleccionarMembership(int m){
        if(classUsuario.getCondition()==1){
            btnChangeMembership.setEnabled(false);
        }else{          
            switch(m){
                case 1:
                    limpiar();
                    pnFree.setBackground(new Color(33,150,243));
                    sortFree.setIcon(new controller().changeImage("/imagenes/sortDown.png", 36, 36));
                    capturarDatos(0);
                    newMembership = 1;
                    mostrarDatos();
                    break;
                case 2:
                    limpiar();
                    pnVip.setBackground(new Color(33,150,243));
                    sortVip.setIcon(new controller().changeImage("/imagenes/sortDown.png", 36, 36));
                    capturarDatos(1);
                    newMembership = 2;
                    mostrarDatos();
                    break;
                case 3:
                    limpiar();
                    pnPremium.setBackground(new Color(33,150,243));
                    sortPremium.setIcon(new controller().changeImage("/imagenes/sortDown.png", 36, 36));
                    capturarDatos(2);
                    newMembership = 3;
                    mostrarDatos();
                    break;
            }
        }
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
            case 0:
                classUsuario.setDurationMem(0);
                break;
            case 1:
                classUsuario.setDurationMem(365);
                break;
            case 2:
                classUsuario.setDurationMem(365);
                break;
        }
    }
 
    void mostrarDatos(){
        txtDescription.setText(description);
        iconDescription.setIcon(new controller().changeImage("/imagenes/description.png", 25, 25));
        
        txtNumEvents.setText(numberEvents+"");
        if(numberEvents==-1){
            iconNumEvents.setIcon(new controller().changeImage("/imagenes/infinity.png", 25, 25));
          }
        else
            iconNumEvents.setIcon(new controller().changeImage("/imagenes/hashtag.png", 25, 25));
        
        txtAdmin.setText(numberAdmins+"");
        if(numberAdmins==-1){
            iconAdmin.setIcon(new controller().changeImage("/imagenes/infinity.png", 25, 25));
          }
        else
            iconAdmin.setIcon(new controller().changeImage("/imagenes/hashtag.png", 25, 25));
        
        txtMod.setText(numberModerators+"");
        if(numberModerators==-1){
            iconMod.setIcon(new controller().changeImage("/imagenes/infinity.png", 25, 25));
        }
        else
            iconMod.setIcon(new controller().changeImage("/imagenes/hashtag.png", 25, 25));
        
        txtPrice.setText(""+price);
        if(price==0)
            iconPrice.setIcon(new controller().changeImage("/imagenes/free.png", 49, 49));
        else
            iconPrice.setIcon(new controller().changeImage("/imagenes/dollar.png", 49, 49));
    }
    
    void limpiar(){
        pnFree.setBackground(new Color(180,225,255));
        pnVip.setBackground(new Color(180,225,255));
        pnPremium.setBackground(new Color(180,225,255));
        sortFree.setIcon(null);
        sortVip.setIcon(null);
        sortPremium.setIcon(null);
    }
    
    
    
//    public void loadMyMember(){
//        lblNameMember.setText(classUsuario.getMyMembership());
//        lblDuration.setText(classUsuario.getDurationMem()+"");
//        lblNumEvents.setText(classUsuario.getMyNumEvent()+"");
//        switch(lblNameMember.getText()){
//            case "Free":
//                lblTypeMember.setIcon(new controller().changeImage("/imagenes/free.png", 40, 40));
//                break;
//            case "Vip":
//                lblTypeMember.setIcon(new controller().changeImage("/imagenes/vip.png", 40, 40));
//                break;
//            case "Premium":
//                lblTypeMember.setIcon(new controller().changeImage("/imagenes/premium.png", 40, 40));
//                break;
//        }
//
//        switch(lblNumEvents.getText()){
//            case "-1":
//                lblNumEvents.setText("Ilimitados");
//                lblImageEvent.setIcon(new controller().changeImage("/imagenes/infinity.png", 40, 40));
//                break;
//            default:
//                lblImageEvent.setIcon(new controller().changeImage("/imagenes/hashtag.png", 40, 40));
//                break;
//        }
//    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeMembership;
    private javax.swing.JLabel iconAdmin;
    private javax.swing.JLabel iconDescription;
    private javax.swing.JLabel iconMod;
    private javax.swing.JLabel iconNumEvents;
    private javax.swing.JLabel iconPrice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel pnFree;
    private javax.swing.JPanel pnPremium;
    private javax.swing.JPanel pnVip;
    private javax.swing.JLabel sortFree;
    private javax.swing.JLabel sortPremium;
    private javax.swing.JLabel sortVip;
    private javax.swing.JSeparator spAdmin;
    private javax.swing.JSeparator spDescription;
    private javax.swing.JSeparator spMod;
    private javax.swing.JSeparator spNumEvents;
    private javax.swing.JSeparator spPrice;
    private javax.swing.JTextField txtAdmin;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtMod;
    private javax.swing.JTextField txtNumEvents;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}