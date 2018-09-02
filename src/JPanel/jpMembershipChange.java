package JPanel;

import jFrame.home;
import java.awt.Color;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.standardization;

public class jpMembershipChange extends javax.swing.JPanel {

    String name;
    String description;
    int condition;
    int numberEvents;
    int numberAdmins;
    int numberModerators;
    int numberGuests;
    float price;
    int yourMembership;
    int newMembership;
    home house;
    
    public jpMembershipChange(home house) {
        initComponents();
        this.house = house;
        yourMembership = classUsuario.getIdMemberships();
        newMembership = -1;
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
        loadMyMember();
        seleccionarMembership(yourMembership);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblNameMember = new javax.swing.JLabel();
        lblTypeMember = new javax.swing.JLabel();
        lblDuration = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblNumEvents = new javax.swing.JLabel();
        lblImageEvent = new javax.swing.JLabel();
        btnChangeMembership = new javax.swing.JButton();
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
        txtDescription = new javax.swing.JTextField();
        spDescription = new javax.swing.JSeparator();
        iconDescription = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        iconEvents = new javax.swing.JLabel();
        spNumEvents = new javax.swing.JSeparator();
        txtEvents = new javax.swing.JTextField();
        txtAdmin = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        iconAdmin = new javax.swing.JLabel();
        spAdmin = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        iconModer = new javax.swing.JLabel();
        txtModer = new javax.swing.JTextField();
        spMod = new javax.swing.JSeparator();
        txtPrice = new javax.swing.JTextField();
        iconPrice = new javax.swing.JLabel();
        spPrice = new javax.swing.JSeparator();
        spGuest = new javax.swing.JSeparator();
        txtGuest = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        iconGuest = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 254, 254));
        setPreferredSize(new java.awt.Dimension(980, 601));
        setRequestFocusEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Membresias");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(33, 150, 243));
        jLabel11.setText("Tu membresia");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Tipo de membresia");

        lblNameMember.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNameMember.setText("Not found");

        lblTypeMember.setMaximumSize(new java.awt.Dimension(40, 40));
        lblTypeMember.setMinimumSize(new java.awt.Dimension(40, 40));
        lblTypeMember.setPreferredSize(new java.awt.Dimension(40, 40));

        lblDuration.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblDuration.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDuration.setText("Not found");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Duracion");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Número de eventos disponibles");

        lblNumEvents.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNumEvents.setText("Not found");

        lblImageEvent.setMaximumSize(new java.awt.Dimension(40, 40));
        lblImageEvent.setMinimumSize(new java.awt.Dimension(40, 40));
        lblImageEvent.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(lblImageEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNumEvents))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblTypeMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNameMember, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTypeMember, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblNameMember)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDuration))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImageEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNumEvents)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnChangeMembership.setBackground(new java.awt.Color(255, 0, 0));
        btnChangeMembership.setForeground(new java.awt.Color(254, 254, 254));
        btnChangeMembership.setText("Cambiar");
        btnChangeMembership.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnChangeMembership.setBorderPainted(false);
        btnChangeMembership.setFocusPainted(false);
        btnChangeMembership.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeMembershipActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(420, 603));
        jPanel1.setMinimumSize(new java.awt.Dimension(420, 603));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Configura las membresias");

        pnFree.setBackground(new java.awt.Color(33, 150, 243));
        pnFree.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        pnFree.setMaximumSize(new java.awt.Dimension(100, 100));
        pnFree.setMinimumSize(new java.awt.Dimension(100, 100));
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
        pnPremium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnPremiumMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnPremiumMouseReleased(evt);
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

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(33, 150, 243));
        jLabel6.setText("Descripcion");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(33, 150, 243));
        jLabel10.setText("Precio");

        txtDescription.setEditable(false);
        txtDescription.setBackground(new java.awt.Color(255, 255, 255));
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

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(33, 150, 243));
        jLabel15.setText("Número de eventos");

        iconEvents.setMaximumSize(new java.awt.Dimension(25, 25));
        iconEvents.setMinimumSize(new java.awt.Dimension(25, 25));
        iconEvents.setPreferredSize(new java.awt.Dimension(25, 25));

        spNumEvents.setForeground(new java.awt.Color(204, 204, 204));

        txtEvents.setEditable(false);
        txtEvents.setBackground(new java.awt.Color(255, 255, 255));
        txtEvents.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtEvents.setAutoscrolls(false);
        txtEvents.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtEvents.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEventsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEventsFocusLost(evt);
            }
        });
        txtEvents.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEventsKeyTyped(evt);
            }
        });

        txtAdmin.setEditable(false);
        txtAdmin.setBackground(new java.awt.Color(255, 255, 255));
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

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(33, 150, 243));
        jLabel16.setText("Número de administradores");

        iconAdmin.setMaximumSize(new java.awt.Dimension(25, 25));
        iconAdmin.setMinimumSize(new java.awt.Dimension(25, 25));
        iconAdmin.setPreferredSize(new java.awt.Dimension(25, 25));

        spAdmin.setForeground(new java.awt.Color(204, 204, 204));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(33, 150, 243));
        jLabel17.setText("Número de moderadores");

        iconModer.setMaximumSize(new java.awt.Dimension(25, 25));
        iconModer.setMinimumSize(new java.awt.Dimension(25, 25));
        iconModer.setPreferredSize(new java.awt.Dimension(25, 25));

        txtModer.setEditable(false);
        txtModer.setBackground(new java.awt.Color(255, 255, 255));
        txtModer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtModer.setAutoscrolls(false);
        txtModer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtModer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtModerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtModerFocusLost(evt);
            }
        });
        txtModer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModerKeyTyped(evt);
            }
        });

        spMod.setForeground(new java.awt.Color(204, 204, 204));

        txtPrice.setEditable(false);
        txtPrice.setBackground(new java.awt.Color(255, 255, 255));
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

        spGuest.setForeground(new java.awt.Color(204, 204, 204));

        txtGuest.setEditable(false);
        txtGuest.setBackground(new java.awt.Color(255, 255, 255));
        txtGuest.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(33, 150, 243));
        jLabel18.setText("Número de invitados");

        iconGuest.setMaximumSize(new java.awt.Dimension(25, 25));
        iconGuest.setMinimumSize(new java.awt.Dimension(25, 25));
        iconGuest.setPreferredSize(new java.awt.Dimension(25, 25));

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
                                    .addGap(144, 144, 144)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(iconDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDescription)
                                    .addComponent(spDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(iconAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAdmin)
                                    .addComponent(spAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel15)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(iconEvents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEvents)
                                    .addComponent(spNumEvents, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(iconModer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtModer, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                            .addComponent(spMod))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(iconGuest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtGuest)
                                            .addComponent(spGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 76, Short.MAX_VALUE))))
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
                .addComponent(jLabel15)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconEvents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEvents, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(spNumEvents, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iconAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(spAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iconModer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModer, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(spMod, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iconGuest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(spGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(spPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(iconPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnChangeMembership, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnChangeMembership, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangeMembershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeMembershipActionPerformed
        classUsuario.setPreviousIdMemberships(classUsuario.getIdMemberships());
        classUsuario.setIdMemberships(newMembership);
        if(classUsuario.updateMembership()){
            classUsuario.select();
            standardization.showMessage("ok","Tu membresia fue actualizada");
            house.loadImage();
            house.membershipChange();
        }
            
    }//GEN-LAST:event_btnChangeMembershipActionPerformed

    private void pnFreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnFreeMouseClicked

    }//GEN-LAST:event_pnFreeMouseClicked

    private void pnFreeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnFreeMouseReleased
        seleccionarMembership(1);
    }//GEN-LAST:event_pnFreeMouseReleased

    private void pnVipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnVipMouseClicked

    }//GEN-LAST:event_pnVipMouseClicked

    private void pnVipMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnVipMouseReleased
        seleccionarMembership(2);
    }//GEN-LAST:event_pnVipMouseReleased

    private void pnPremiumMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnPremiumMouseReleased
        seleccionarMembership(3);
    }//GEN-LAST:event_pnPremiumMouseReleased

    private void pnPremiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnPremiumMouseClicked

    }//GEN-LAST:event_pnPremiumMouseClicked

    private void txtDescriptionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescriptionFocusGained
        spDescription.setBackground(Color.red);
    }//GEN-LAST:event_txtDescriptionFocusGained

    private void txtDescriptionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescriptionFocusLost
        spDescription.setBackground(Color.white);
    }//GEN-LAST:event_txtDescriptionFocusLost

    private void txtDescriptionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescriptionKeyTyped

    }//GEN-LAST:event_txtDescriptionKeyTyped

    private void txtEventsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEventsFocusGained
        spNumEvents.setBackground(Color.red);
    }//GEN-LAST:event_txtEventsFocusGained

    private void txtEventsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEventsFocusLost
        spNumEvents.setBackground(Color.white);
    }//GEN-LAST:event_txtEventsFocusLost

    private void txtEventsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEventsKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c))
        evt.consume();
    }//GEN-LAST:event_txtEventsKeyTyped

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

    private void txtModerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtModerFocusGained
        spMod.setBackground(Color.red);
    }//GEN-LAST:event_txtModerFocusGained

    private void txtModerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtModerFocusLost
        spMod.setBackground(Color.white);
    }//GEN-LAST:event_txtModerFocusLost

    private void txtModerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModerKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c))
        evt.consume();
    }//GEN-LAST:event_txtModerKeyTyped

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

    private void txtGuestFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGuestFocusGained
        spGuest.setBackground(Color.red);
    }//GEN-LAST:event_txtGuestFocusGained

    private void txtGuestFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGuestFocusLost
        spGuest.setBackground(Color.white);
    }//GEN-LAST:event_txtGuestFocusLost

    private void txtGuestKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGuestKeyTyped
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || c == '.'){}
        else
        evt.consume();
    }//GEN-LAST:event_txtGuestKeyTyped

    void seleccionarMembership(int m){
        if(classUsuario.getCondition()==1){
            btnChangeMembership.setEnabled(false);
        }else{
            if(yourMembership == m){
                btnChangeMembership.setEnabled(false);
                btnChangeMembership.setBackground(new Color(255,123,123));
            } 
            else{
                btnChangeMembership.setEnabled(true);
                btnChangeMembership.setBackground(new Color(255,0,0));
            }
            
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
        
        txtEvents.setText(numberEvents+"");
        if(numberEvents==-1){
            iconEvents.setIcon(new controller().changeImage("/imagenes/infinity.png", 25, 25));
            txtEvents.setText("Ilimitados");
        }
        else
            iconEvents.setIcon(new controller().changeImage("/imagenes/hashtag.png", 25, 25));
        
        txtAdmin.setText(numberAdmins+"");
        if(numberAdmins==-1){
            iconAdmin.setIcon(new controller().changeImage("/imagenes/infinity.png", 25, 25));
            txtAdmin.setText("Ilimitados");
        }
        else
            iconAdmin.setIcon(new controller().changeImage("/imagenes/hashtag.png", 25, 25));
        
        txtModer.setText(numberModerators+"");
        if(numberModerators==-1){
            iconModer.setIcon(new controller().changeImage("/imagenes/infinity.png", 25, 25));
            txtModer.setText("Ilimitados");
        }
        else
            iconModer.setIcon(new controller().changeImage("/imagenes/hashtag.png", 25, 25));
        
        txtPrice.setText("$"+price);
        if(price==0)
            iconPrice.setIcon(new controller().changeImage("/imagenes/free.png", 49, 49));
        else
            iconPrice.setIcon(new controller().changeImage("/imagenes/dollar.png", 49, 49));
        
        txtGuest.setText(numberGuests+"");
        if(numberGuests==-1){
            txtGuest.setText("Ilimitados");
            iconGuest.setIcon(new controller().changeImage("/imagenes/infinity.png", 25, 25));
        }
        else
            iconGuest.setIcon(new controller().changeImage("/imagenes/hashtag.png", 25, 25));
    }
    
    void limpiar(){
        pnFree.setBackground(new Color(180,225,255));
        pnVip.setBackground(new Color(180,225,255));
        pnPremium.setBackground(new Color(180,225,255));
        sortFree.setIcon(null);
        sortVip.setIcon(null);
        sortPremium.setIcon(null);
    }
    
    
    
    public void loadMyMember(){
        lblNameMember.setText(classUsuario.getMyMembership());
        lblDuration.setText(classUsuario.getDurationMem()+"");
        lblNumEvents.setText(classUsuario.getMyNumEvent()+"");
        switch(lblNameMember.getText()){
            case "Free":
                lblTypeMember.setIcon(new controller().changeImage("/imagenes/free.png", 40, 40));
                break;
            case "Vip":
                lblTypeMember.setIcon(new controller().changeImage("/imagenes/vip.png", 40, 40));
                break;
            case "Premium":
                lblTypeMember.setIcon(new controller().changeImage("/imagenes/premium.png", 40, 40));
                break;
        }

        switch(lblNumEvents.getText()){
            case "-1":
                lblNumEvents.setText("Ilimitados");
                lblImageEvent.setIcon(new controller().changeImage("/imagenes/infinity.png", 40, 40));
                break;
            default:
                lblImageEvent.setIcon(new controller().changeImage("/imagenes/hashtag.png", 40, 40));
                break;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeMembership;
    private javax.swing.JLabel iconAdmin;
    private javax.swing.JLabel iconDescription;
    private javax.swing.JLabel iconEvents;
    private javax.swing.JLabel iconGuest;
    private javax.swing.JLabel iconModer;
    private javax.swing.JLabel iconPrice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblImageEvent;
    private javax.swing.JLabel lblNameMember;
    private javax.swing.JLabel lblNumEvents;
    private javax.swing.JLabel lblTypeMember;
    private javax.swing.JPanel pnFree;
    private javax.swing.JPanel pnPremium;
    private javax.swing.JPanel pnVip;
    private javax.swing.JLabel sortFree;
    private javax.swing.JLabel sortPremium;
    private javax.swing.JLabel sortVip;
    private javax.swing.JSeparator spAdmin;
    private javax.swing.JSeparator spDescription;
    private javax.swing.JSeparator spGuest;
    private javax.swing.JSeparator spMod;
    private javax.swing.JSeparator spNumEvents;
    private javax.swing.JSeparator spPrice;
    private javax.swing.JTextField txtAdmin;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtEvents;
    private javax.swing.JTextField txtGuest;
    private javax.swing.JTextField txtModer;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
