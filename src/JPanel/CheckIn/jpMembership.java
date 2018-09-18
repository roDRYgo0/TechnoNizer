package JPanel.CheckIn;

import JPanel.jpWelcome;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Properties;
import javaClass.*;
import properties.propiedades;

public class jpMembership extends javax.swing.JPanel {
    
    String name;
    String description;
    int condition;
    int numberEvents;
    int numberAdmins;
    int numberModerators;
    int numberGuests;
    float price;
    
    boolean start;
    
    void verificaridioma()
    {
      Properties pr = new propiedades (controller.idioma);
      TitleMembership.setText(pr.getProperty("TitleMembership"));
      FreeChoose.setText(pr.getProperty("FreeChoose"));
      VIPChoose.setText(pr.getProperty("VIPChoose"));
      PremiumChoose.setText(pr.getProperty("PremiumChoose"));
      DescripcionMembership.setText(pr.getProperty("DescripcionMembership"));
      NumberMembership.setText(pr.getProperty("NumberMembership"));
      AdminsMembership.setText(pr.getProperty("AdminsMembership"));
      NumberModerators.setText(pr.getProperty("NumberModerators"));
      InvitesMembership.setText(pr.getProperty("InvitesMembership"));
      Pricemembership.setText(pr.getProperty("Pricemembership"));
      btnBack.setText(pr.getProperty("btnBackMembership"));
      btnNext.setText(pr.getProperty("btnNextMembership"));
    }
    
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
        start = true;
        sortFree.setIcon(new controller().changeImage("/imagenes/sortDown.png", 36, 36));
        pnFree.setBackground(new Color(33,150,243));
        
        seleccionarMembership(1);
        verificaridioma();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleMembership = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        progress = new rojerusan.componentes.RSProgressMaterial();
        pnFree = new javax.swing.JPanel();
        FreeChoose = new javax.swing.JLabel();
        pnVip = new javax.swing.JPanel();
        VIPChoose = new javax.swing.JLabel();
        pnPremium = new javax.swing.JPanel();
        PremiumChoose = new javax.swing.JLabel();
        sortFree = new javax.swing.JLabel();
        sortVip = new javax.swing.JLabel();
        sortPremium = new javax.swing.JLabel();
        DescripcionMembership = new javax.swing.JLabel();
        iconDescription = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JTextField();
        spDescription = new javax.swing.JSeparator();
        NumberMembership = new javax.swing.JLabel();
        iconEvents = new javax.swing.JLabel();
        lblEvents = new javax.swing.JTextField();
        spNumEvents = new javax.swing.JSeparator();
        AdminsMembership = new javax.swing.JLabel();
        iconAdmin = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JTextField();
        spAdmin = new javax.swing.JSeparator();
        NumberModerators = new javax.swing.JLabel();
        iconModer = new javax.swing.JLabel();
        lblModer = new javax.swing.JTextField();
        spMod = new javax.swing.JSeparator();
        txtGuest = new javax.swing.JTextField();
        InvitesMembership = new javax.swing.JLabel();
        iconGuest = new javax.swing.JLabel();
        spGuest = new javax.swing.JSeparator();
        Pricemembership = new javax.swing.JLabel();
        lblPrice = new javax.swing.JTextField();
        iconPrice = new javax.swing.JLabel();
        spPrice = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(420, 603));
        setMinimumSize(new java.awt.Dimension(420, 603));
        setPreferredSize(new java.awt.Dimension(420, 603));

        TitleMembership.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TitleMembership.setText("Selecciona tu membresia");

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
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        progress.setForeground(new java.awt.Color(255, 255, 255));
        progress.setAnchoProgress(6);
        progress.setPreferredSize(new java.awt.Dimension(34, 34));

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

        FreeChoose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        FreeChoose.setForeground(new java.awt.Color(255, 255, 255));
        FreeChoose.setText("Gratis");

        javax.swing.GroupLayout pnFreeLayout = new javax.swing.GroupLayout(pnFree);
        pnFree.setLayout(pnFreeLayout);
        pnFreeLayout.setHorizontalGroup(
            pnFreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFreeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FreeChoose)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnFreeLayout.setVerticalGroup(
            pnFreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFreeLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(FreeChoose)
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

        VIPChoose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        VIPChoose.setForeground(new java.awt.Color(255, 255, 255));
        VIPChoose.setText("Vip");

        javax.swing.GroupLayout pnVipLayout = new javax.swing.GroupLayout(pnVip);
        pnVip.setLayout(pnVipLayout);
        pnVipLayout.setHorizontalGroup(
            pnVipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVipLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(VIPChoose)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        pnVipLayout.setVerticalGroup(
            pnVipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVipLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(VIPChoose)
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

        PremiumChoose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PremiumChoose.setForeground(new java.awt.Color(255, 255, 255));
        PremiumChoose.setText("Premium");

        javax.swing.GroupLayout pnPremiumLayout = new javax.swing.GroupLayout(pnPremium);
        pnPremium.setLayout(pnPremiumLayout);
        pnPremiumLayout.setHorizontalGroup(
            pnPremiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPremiumLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PremiumChoose)
                .addContainerGap())
        );
        pnPremiumLayout.setVerticalGroup(
            pnPremiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPremiumLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(PremiumChoose)
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

        DescripcionMembership.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        DescripcionMembership.setForeground(new java.awt.Color(33, 150, 243));
        DescripcionMembership.setText("Descripción");

        iconDescription.setMaximumSize(new java.awt.Dimension(25, 25));
        iconDescription.setMinimumSize(new java.awt.Dimension(25, 25));
        iconDescription.setPreferredSize(new java.awt.Dimension(25, 25));

        lblDescripcion.setEditable(false);
        lblDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        lblDescripcion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDescripcion.setAutoscrolls(false);
        lblDescripcion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lblDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblDescripcionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblDescripcionFocusLost(evt);
            }
        });
        lblDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblDescripcionKeyTyped(evt);
            }
        });

        spDescription.setForeground(new java.awt.Color(204, 204, 204));

        NumberMembership.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        NumberMembership.setForeground(new java.awt.Color(33, 150, 243));
        NumberMembership.setText("Número de eventos");

        iconEvents.setMaximumSize(new java.awt.Dimension(25, 25));
        iconEvents.setMinimumSize(new java.awt.Dimension(25, 25));
        iconEvents.setPreferredSize(new java.awt.Dimension(25, 25));

        lblEvents.setEditable(false);
        lblEvents.setBackground(new java.awt.Color(255, 255, 255));
        lblEvents.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEvents.setAutoscrolls(false);
        lblEvents.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lblEvents.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblEventsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblEventsFocusLost(evt);
            }
        });
        lblEvents.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblEventsKeyTyped(evt);
            }
        });

        spNumEvents.setForeground(new java.awt.Color(204, 204, 204));

        AdminsMembership.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        AdminsMembership.setForeground(new java.awt.Color(33, 150, 243));
        AdminsMembership.setText("Número de administradores");

        iconAdmin.setMaximumSize(new java.awt.Dimension(25, 25));
        iconAdmin.setMinimumSize(new java.awt.Dimension(25, 25));
        iconAdmin.setPreferredSize(new java.awt.Dimension(25, 25));

        lblAdmin.setEditable(false);
        lblAdmin.setBackground(new java.awt.Color(255, 255, 255));
        lblAdmin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAdmin.setAutoscrolls(false);
        lblAdmin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lblAdmin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblAdminFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblAdminFocusLost(evt);
            }
        });
        lblAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblAdminKeyTyped(evt);
            }
        });

        spAdmin.setForeground(new java.awt.Color(204, 204, 204));

        NumberModerators.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        NumberModerators.setForeground(new java.awt.Color(33, 150, 243));
        NumberModerators.setText("Número de moderadores");

        iconModer.setMaximumSize(new java.awt.Dimension(25, 25));
        iconModer.setMinimumSize(new java.awt.Dimension(25, 25));
        iconModer.setPreferredSize(new java.awt.Dimension(25, 25));

        lblModer.setEditable(false);
        lblModer.setBackground(new java.awt.Color(255, 255, 255));
        lblModer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblModer.setAutoscrolls(false);
        lblModer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lblModer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblModerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblModerFocusLost(evt);
            }
        });
        lblModer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblModerKeyTyped(evt);
            }
        });

        spMod.setForeground(new java.awt.Color(204, 204, 204));

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

        InvitesMembership.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        InvitesMembership.setForeground(new java.awt.Color(33, 150, 243));
        InvitesMembership.setText("Número de invitados");

        iconGuest.setMaximumSize(new java.awt.Dimension(25, 25));
        iconGuest.setMinimumSize(new java.awt.Dimension(25, 25));
        iconGuest.setPreferredSize(new java.awt.Dimension(25, 25));

        spGuest.setForeground(new java.awt.Color(204, 204, 204));

        Pricemembership.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Pricemembership.setForeground(new java.awt.Color(33, 150, 243));
        Pricemembership.setText("Precio");

        lblPrice.setEditable(false);
        lblPrice.setBackground(new java.awt.Color(255, 255, 255));
        lblPrice.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPrice.setAutoscrolls(false);
        lblPrice.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lblPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblPriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblPriceFocusLost(evt);
            }
        });
        lblPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblPriceKeyTyped(evt);
            }
        });

        iconPrice.setMaximumSize(new java.awt.Dimension(49, 49));
        iconPrice.setMinimumSize(new java.awt.Dimension(49, 49));
        iconPrice.setPreferredSize(new java.awt.Dimension(49, 49));

        spPrice.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(TitleMembership))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(sortFree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(sortVip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(iconDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblDescripcion)
                                    .addComponent(spDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(AdminsMembership)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(iconAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblAdmin)
                                    .addComponent(spAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(NumberMembership)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(iconEvents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblEvents)
                                    .addComponent(spNumEvents, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NumberModerators)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(iconModer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblModer)
                                            .addComponent(spMod, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(InvitesMembership)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(sortPremium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(iconGuest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtGuest)
                                                .addComponent(spGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(pnFree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(pnVip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(pnPremium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(DescripcionMembership, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Pricemembership)
                                            .addGap(160, 160, 160))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(iconPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(spPrice)
                                                .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(144, 144, 144))))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TitleMembership)
                .addGap(18, 18, 18)
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
                .addComponent(DescripcionMembership)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(spDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NumberMembership)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconEvents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEvents, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(spNumEvents, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdminsMembership)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iconAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(spAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NumberModerators)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iconModer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblModer, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(spMod, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(InvitesMembership)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iconGuest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(spGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(spPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(Pricemembership)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(iconPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if(start)
        {
            start = false;
            btnNext.setEnabled(false);
            progress.setForeground(new Color(33,150,243));
            new Thread(()->{
                if(classUsuario.insert()){
                    standardization.showMessage("ok", "Se registro correctamente."); 
                    controller.jpW = new jpWelcome();

                    controller.jpW.setSize(420,603);
                    controller.jpW.setLocation(0,0);

                    controller.rootPane.removeAll();
                    controller.rootPane.add(controller.jpW,BorderLayout.CENTER);
                    controller.rootPane.revalidate();
                    controller.rootPane.repaint();
                }
                else{
                    standardization.showMessage("error", "Error al insertar datos."); 
                    start = true;
                    btnNext.setEnabled(true);
                    progress.setForeground(new Color(255, 255, 255));
                }
            }).start();

        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        controller.rootPane.removeAll();
        controller.rootPane.add(controller.jpCD,BorderLayout.CENTER);
        controller.rootPane.revalidate();
        controller.rootPane.repaint();
    }//GEN-LAST:event_btnBackActionPerformed

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

    private void pnPremiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnPremiumMouseClicked

    }//GEN-LAST:event_pnPremiumMouseClicked

    private void pnPremiumMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnPremiumMouseReleased
        seleccionarMembership(3);
    }//GEN-LAST:event_pnPremiumMouseReleased

    private void lblDescripcionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblDescripcionFocusGained
        spDescription.setBackground(Color.red);
    }//GEN-LAST:event_lblDescripcionFocusGained

    private void lblDescripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblDescripcionFocusLost
        spDescription.setBackground(Color.white);
    }//GEN-LAST:event_lblDescripcionFocusLost

    private void lblDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblDescripcionKeyTyped

    }//GEN-LAST:event_lblDescripcionKeyTyped

    private void lblEventsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblEventsFocusGained
        spNumEvents.setBackground(Color.red);
    }//GEN-LAST:event_lblEventsFocusGained

    private void lblEventsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblEventsFocusLost
        spNumEvents.setBackground(Color.white);
    }//GEN-LAST:event_lblEventsFocusLost

    private void lblEventsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblEventsKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c))
        evt.consume();
    }//GEN-LAST:event_lblEventsKeyTyped

    private void lblAdminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblAdminFocusGained
        spAdmin.setBackground(Color.red);
    }//GEN-LAST:event_lblAdminFocusGained

    private void lblAdminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblAdminFocusLost
        spAdmin.setBackground(Color.white);
    }//GEN-LAST:event_lblAdminFocusLost

    private void lblAdminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblAdminKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c))
        evt.consume();
    }//GEN-LAST:event_lblAdminKeyTyped

    private void lblModerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblModerFocusGained
        spMod.setBackground(Color.red);
    }//GEN-LAST:event_lblModerFocusGained

    private void lblModerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblModerFocusLost
        spMod.setBackground(Color.white);
    }//GEN-LAST:event_lblModerFocusLost

    private void lblModerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblModerKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c))
        evt.consume();
    }//GEN-LAST:event_lblModerKeyTyped

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

    private void lblPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblPriceFocusGained
        spPrice.setBackground(Color.red);
    }//GEN-LAST:event_lblPriceFocusGained

    private void lblPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblPriceFocusLost
        spPrice.setBackground(Color.white);
    }//GEN-LAST:event_lblPriceFocusLost

    private void lblPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblPriceKeyTyped
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || c == '.'){}
        else
        evt.consume();
    }//GEN-LAST:event_lblPriceKeyTyped
        //</editor-fold>
    
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
        iconDescription.setIcon(new controller().changeImage("/imagenes/description.png", 25, 25));
        
        lblEvents.setText(numberEvents+"");
        if(numberEvents==-1){
            iconEvents.setIcon(new controller().changeImage("/imagenes/infinity.png", 25, 25));
            lblEvents.setText("Ilimitados");
        }
        else
            iconEvents.setIcon(new controller().changeImage("/imagenes/hashtag.png", 25, 25));
        
        lblAdmin.setText(numberAdmins+"");
        if(numberAdmins==-1){
            iconAdmin.setIcon(new controller().changeImage("/imagenes/infinity.png", 25, 25));
            lblAdmin.setText("Ilimitados");
        }
        else
            iconAdmin.setIcon(new controller().changeImage("/imagenes/hashtag.png", 25, 25));
        
        lblModer.setText(numberModerators+"");
        if(numberModerators==-1){
            iconModer.setIcon(new controller().changeImage("/imagenes/infinity.png", 25, 25));
            lblModer.setText("Ilimitados");
        }
        else
            iconModer.setIcon(new controller().changeImage("/imagenes/hashtag.png", 25, 25));
        
        lblPrice.setText("$"+price);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminsMembership;
    private javax.swing.JLabel DescripcionMembership;
    private javax.swing.JLabel FreeChoose;
    private javax.swing.JLabel InvitesMembership;
    private javax.swing.JLabel NumberMembership;
    private javax.swing.JLabel NumberModerators;
    private javax.swing.JLabel PremiumChoose;
    private javax.swing.JLabel Pricemembership;
    private javax.swing.JLabel TitleMembership;
    private javax.swing.JLabel VIPChoose;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel iconAdmin;
    private javax.swing.JLabel iconDescription;
    private javax.swing.JLabel iconEvents;
    private javax.swing.JLabel iconGuest;
    private javax.swing.JLabel iconModer;
    private javax.swing.JLabel iconPrice;
    private javax.swing.JTextField lblAdmin;
    private javax.swing.JTextField lblDescripcion;
    private javax.swing.JTextField lblEvents;
    private javax.swing.JTextField lblModer;
    private javax.swing.JTextField lblPrice;
    private javax.swing.JPanel pnFree;
    private javax.swing.JPanel pnPremium;
    private javax.swing.JPanel pnVip;
    private rojerusan.componentes.RSProgressMaterial progress;
    private javax.swing.JLabel sortFree;
    private javax.swing.JLabel sortPremium;
    private javax.swing.JLabel sortVip;
    private javax.swing.JSeparator spAdmin;
    private javax.swing.JSeparator spDescription;
    private javax.swing.JSeparator spGuest;
    private javax.swing.JSeparator spMod;
    private javax.swing.JSeparator spNumEvents;
    private javax.swing.JSeparator spPrice;
    private javax.swing.JTextField txtGuest;
    // End of variables declaration//GEN-END:variables
}
