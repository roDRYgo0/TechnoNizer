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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        lblEvents = new javax.swing.JLabel();
        lblModer = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
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

        setBackground(new java.awt.Color(254, 254, 254));
        setPreferredSize(new java.awt.Dimension(980, 601));
        setRequestFocusEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Membresias");

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

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(33, 150, 243));
        jLabel7.setText("Número de eventos");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(33, 150, 243));
        jLabel8.setText("Número de administradores");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(33, 150, 243));
        jLabel9.setText("Número de moderadores");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(33, 150, 243));
        jLabel10.setText("Precio");

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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(sortFree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(sortVip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sortPremium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(pnFree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pnVip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pnPremium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescripcion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEvents, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAdmin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblModer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEvents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(11, 11, 11)
                .addComponent(lblAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblModer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
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
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnChangeMembership, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pnFreeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnFreeMouseReleased
        seleccionarMembership(1);
    }//GEN-LAST:event_pnFreeMouseReleased

    private void pnFreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnFreeMouseClicked

    }//GEN-LAST:event_pnFreeMouseClicked

    private void pnVipMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnVipMouseReleased
        seleccionarMembership(2);
    }//GEN-LAST:event_pnVipMouseReleased

    private void pnVipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnVipMouseClicked

    }//GEN-LAST:event_pnVipMouseClicked

    private void pnPremiumMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnPremiumMouseReleased
        seleccionarMembership(3);
    }//GEN-LAST:event_pnPremiumMouseReleased

    private void pnPremiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnPremiumMouseClicked

    }//GEN-LAST:event_pnPremiumMouseClicked

    private void btnChangeMembershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeMembershipActionPerformed
        classUsuario.setPreviousIdMemberships(classUsuario.getIdMemberships());
        classUsuario.setIdMemberships(newMembership);
        if(classUsuario.updateMembership()){
            classUsuario.select();
            standardization.showMessage("ok","Tu membresia fue actualizada");
            house.membershipChange();
        }
            
    }//GEN-LAST:event_btnChangeMembershipActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblEvents;
    private javax.swing.JLabel lblImageEvent;
    private javax.swing.JLabel lblModer;
    private javax.swing.JLabel lblNameMember;
    private javax.swing.JLabel lblNumEvents;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblTypeMember;
    private javax.swing.JPanel pnFree;
    private javax.swing.JPanel pnPremium;
    private javax.swing.JPanel pnVip;
    private javax.swing.JLabel sortFree;
    private javax.swing.JLabel sortPremium;
    private javax.swing.JLabel sortVip;
    // End of variables declaration//GEN-END:variables
}
