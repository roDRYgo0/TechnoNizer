package jFrame;

import JPanel.*;
import admin.jpEditUserAdmin;
import admin.jpSecurityUser;
import admin.jpSettingsAdmin;
import admin.jpUsers;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.util.Properties;
import javaClass.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import properties.propiedades;

public class admin extends javax.swing.JFrame {

    private boolean internet;
    boolean cambio=true;
    int x, y;
    
    public static JLabel imageUserTop;
    public static JLabel imageUserLeft;
    
    void verificaridioma()
    {
    Properties pr=new propiedades(controller.idioma);
    lblUserPanelAdmins.setText(pr.getProperty("lblUserPanelAdmins"));
    lblConfigurationsPanelAdmins.setText(pr.getProperty("lblConfigurationsPanelAdmins"));
    lblSecurityPanelAdmins.setText(pr.getProperty("lblSecurityPanelAdmins"));
    lblEventsPanelAdmins.setText(pr.getProperty("lblEventsPanelAdmins"));
    lblProjectsPanelAdmins.setText(pr.getProperty("lblProjectsPanelAdmins"));
    DiaryPanelAdmins.setText(pr.getProperty("DiaryPanelAdmins"));
    lblImageUserTop.setText(pr.getProperty("lblImageUserTop"));
    }
    
    public admin() {
        initComponents();
        
        imageUserTop = lblImageUserTop;
        imageUserLeft = lblImageUserLeft;
          classReminder.select();
 
        controller.rootFrame = this;
        this.internet = logIn.internet;
        load();
        verificaridioma();
    }
    
    void load(){        

        
        loadImage();
    }
    
    void loadImage(){
        lblAdmin.setIcon(new controller().changeImage("/imagenes/statistics.png", 24, 24));
        lblImageUserLeft.setIcon(new controller().changeImage("/imagenes/services.png", 97, 97));
        lblImageUserTop.setIcon(new controller().changeImage("/imagenes/services.png", 24, 24));
        lblImageUserTop.setText("Administración");
        
        iconStart.setIcon(new controller().changeImage("/imagenes/home.png", 24, 24));
        iconUser.setIcon(new controller().changeImage("/imagenes/username.png", 24, 24));
        iconSettings.setIcon(new controller().changeImage("/imagenes/setting.png", 24, 24));
        iconSecurity.setIcon(new controller().changeImage("/imagenes/shield.png", 24, 24));
        iconEvents.setIcon(new controller().changeImage("/imagenes/event.png", 24, 24));
        iconProjects.setIcon(new controller().changeImage("/imagenes/project.png", 24, 24));
        iconAgenda.setIcon(new controller().changeImage("/imagenes/agenda.png", 24, 24));


        loadData("settings","", lblSettings);
        
    }

    //<editor-fold defaultstate="collapsed" desc="compiled code">
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupLenguage = new javax.swing.JPopupMenu();
        itemSpanish = new javax.swing.JMenuItem();
        itemEnglish = new javax.swing.JMenuItem();
        popupSettings = new javax.swing.JPopupMenu();
        itemSettings = new javax.swing.JMenuItem();
        topBar = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnMin = new javax.swing.JButton();
        btnMax = new javax.swing.JButton();
        lblLenguage = new javax.swing.JLabel();
        tbtnInternet = new javax.swing.JToggleButton();
        rootpane = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblSettings = new javax.swing.JLabel();
        lblImageUserTop = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        leftPanel = new javax.swing.JPanel();
        pnGeneral = new javax.swing.JPanel();
        iconStart = new javax.swing.JLabel();
        lblGral = new javax.swing.JLabel();
        pnUser = new javax.swing.JPanel();
        iconUser = new javax.swing.JLabel();
        lblUserPanelAdmins = new javax.swing.JLabel();
        pnSettings = new javax.swing.JPanel();
        iconSettings = new javax.swing.JLabel();
        lblConfigurationsPanelAdmins = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        lblImageUserLeft = new javax.swing.JLabel();
        pnEvents = new javax.swing.JPanel();
        iconEvents = new javax.swing.JLabel();
        lblEventsPanelAdmins = new javax.swing.JLabel();
        pnProj = new javax.swing.JPanel();
        iconProjects = new javax.swing.JLabel();
        lblProjectsPanelAdmins = new javax.swing.JLabel();
        pnAgenda = new javax.swing.JPanel();
        iconAgenda = new javax.swing.JLabel();
        DiaryPanelAdmins = new javax.swing.JLabel();
        pnSecurity = new javax.swing.JPanel();
        iconSecurity = new javax.swing.JLabel();
        lblSecurityPanelAdmins = new javax.swing.JLabel();
        lblAlert = new javax.swing.JLabel();
        scrollContainer = new javax.swing.JScrollPane();

        popupLenguage.setBorderPainted(false);
        popupLenguage.setFocusable(false);
        popupLenguage.setPreferredSize(new java.awt.Dimension(120, 50));

        itemSpanish.setText("Español");
        itemSpanish.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        popupLenguage.add(itemSpanish);

        itemEnglish.setText("Ingles");
        itemEnglish.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        popupLenguage.add(itemEnglish);

        itemSettings.setText("Cerrar sesión");
        itemSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                itemSettingsMouseReleased(evt);
            }
        });
        popupSettings.add(itemSettings);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1150, 680));
        setUndecorated(true);

        topBar.setBackground(new java.awt.Color(255, 255, 255));
        topBar.setMaximumSize(new java.awt.Dimension(420, 30));
        topBar.setMinimumSize(new java.awt.Dimension(420, 30));
        topBar.setRequestFocusEnabled(false);
        topBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                topBarMouseDragged(evt);
            }
        });
        topBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topBarMousePressed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setText("X");
        btnExit.setAlignmentY(0.0F);
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setFocusable(false);
        btnExit.setMaximumSize(new java.awt.Dimension(30, 30));
        btnExit.setMinimumSize(new java.awt.Dimension(30, 30));
        btnExit.setPreferredSize(new java.awt.Dimension(30, 30));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnMin.setBackground(new java.awt.Color(255, 255, 255));
        btnMin.setText("-");
        btnMin.setAlignmentY(0.0F);
        btnMin.setBorder(null);
        btnMin.setBorderPainted(false);
        btnMin.setFocusable(false);
        btnMin.setMaximumSize(new java.awt.Dimension(30, 30));
        btnMin.setMinimumSize(new java.awt.Dimension(30, 30));
        btnMin.setPreferredSize(new java.awt.Dimension(30, 30));
        btnMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinActionPerformed(evt);
            }
        });

        btnMax.setBackground(new java.awt.Color(255, 255, 255));
        btnMax.setText("⬜");
        btnMax.setAlignmentY(0.0F);
        btnMax.setBorder(null);
        btnMax.setBorderPainted(false);
        btnMax.setFocusable(false);
        btnMax.setMaximumSize(new java.awt.Dimension(30, 30));
        btnMax.setMinimumSize(new java.awt.Dimension(30, 30));
        btnMax.setPreferredSize(new java.awt.Dimension(30, 30));
        btnMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaxActionPerformed(evt);
            }
        });

        lblLenguage.setBackground(new java.awt.Color(255, 255, 255));
        lblLenguage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/globe.png"))); // NOI18N
        lblLenguage.setAlignmentY(0.0F);
        lblLenguage.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lblLenguage.setMaximumSize(new java.awt.Dimension(30, 30));
        lblLenguage.setMinimumSize(new java.awt.Dimension(30, 30));
        lblLenguage.setOpaque(true);
        lblLenguage.setPreferredSize(new java.awt.Dimension(30, 30));
        lblLenguage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLenguageMouseClicked(evt);
            }
        });

        tbtnInternet.setBackground(new java.awt.Color(255, 255, 255));
        tbtnInternet.setText("Internet");
        tbtnInternet.setBorderPainted(false);
        tbtnInternet.setEnabled(false);
        tbtnInternet.setFocusPainted(false);
        tbtnInternet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnInternetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topBarLayout = new javax.swing.GroupLayout(topBar);
        topBar.setLayout(topBarLayout);
        topBarLayout.setHorizontalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topBarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tbtnInternet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLenguage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        topBarLayout.setVerticalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbtnInternet, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblLenguage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        rootpane.setBackground(new java.awt.Color(0, 153, 0));

        jPanel2.setBackground(new java.awt.Color(153, 102, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(1150, 46));
        jPanel2.setMinimumSize(new java.awt.Dimension(1150, 46));
        jPanel2.setPreferredSize(new java.awt.Dimension(1150, 46));
        jPanel2.setRequestFocusEnabled(false);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TechnoNizer");

        lblSettings.setText("settings");
        lblSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSettingsMouseReleased(evt);
            }
        });

        lblImageUserTop.setForeground(new java.awt.Color(255, 255, 255));
        lblImageUserTop.setText("Not found");
        lblImageUserTop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImageUserTopMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblImageUserTopMouseReleased(evt);
            }
        });

        lblAdmin.setMaximumSize(new java.awt.Dimension(28, 28));
        lblAdmin.setMinimumSize(new java.awt.Dimension(28, 28));
        lblAdmin.setPreferredSize(new java.awt.Dimension(28, 28));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 759, Short.MAX_VALUE)
                .addComponent(lblImageUserTop, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImageUserTop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        leftPanel.setBackground(new java.awt.Color(42, 42, 42));

        pnGeneral.setBackground(new java.awt.Color(52, 52, 52));
        pnGeneral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnGeneralMouseReleased(evt);
            }
        });

        iconStart.setMaximumSize(new java.awt.Dimension(28, 28));
        iconStart.setMinimumSize(new java.awt.Dimension(28, 28));
        iconStart.setPreferredSize(new java.awt.Dimension(28, 28));

        lblGral.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblGral.setForeground(new java.awt.Color(255, 255, 255));
        lblGral.setText("General");

        javax.swing.GroupLayout pnGeneralLayout = new javax.swing.GroupLayout(pnGeneral);
        pnGeneral.setLayout(pnGeneralLayout);
        pnGeneralLayout.setHorizontalGroup(
            pnGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGeneralLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(iconStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnGeneralLayout.setVerticalGroup(
            pnGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblGral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnUser.setBackground(new java.awt.Color(34, 34, 34));
        pnUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnUserMouseReleased(evt);
            }
        });

        iconUser.setMaximumSize(new java.awt.Dimension(28, 28));
        iconUser.setMinimumSize(new java.awt.Dimension(28, 28));
        iconUser.setPreferredSize(new java.awt.Dimension(28, 28));

        lblUserPanelAdmins.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUserPanelAdmins.setForeground(new java.awt.Color(255, 255, 255));
        lblUserPanelAdmins.setText("Usuarios");

        javax.swing.GroupLayout pnUserLayout = new javax.swing.GroupLayout(pnUser);
        pnUser.setLayout(pnUserLayout);
        pnUserLayout.setHorizontalGroup(
            pnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUserLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(iconUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUserPanelAdmins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnUserLayout.setVerticalGroup(
            pnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUserPanelAdmins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnSettings.setBackground(new java.awt.Color(34, 34, 34));
        pnSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnSettingsMouseReleased(evt);
            }
        });

        iconSettings.setMaximumSize(new java.awt.Dimension(28, 28));
        iconSettings.setMinimumSize(new java.awt.Dimension(28, 28));
        iconSettings.setPreferredSize(new java.awt.Dimension(28, 28));

        lblConfigurationsPanelAdmins.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblConfigurationsPanelAdmins.setForeground(new java.awt.Color(255, 255, 255));
        lblConfigurationsPanelAdmins.setText("Configuraciones");

        javax.swing.GroupLayout pnSettingsLayout = new javax.swing.GroupLayout(pnSettings);
        pnSettings.setLayout(pnSettingsLayout);
        pnSettingsLayout.setHorizontalGroup(
            pnSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSettingsLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(iconSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblConfigurationsPanelAdmins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnSettingsLayout.setVerticalGroup(
            pnSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblConfigurationsPanelAdmins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        jPanel6.setBackground(new java.awt.Color(34, 34, 34));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblImageUserLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImageUserLeft, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnEvents.setBackground(new java.awt.Color(34, 34, 34));
        pnEvents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnEventsMouseReleased(evt);
            }
        });

        iconEvents.setMaximumSize(new java.awt.Dimension(28, 28));
        iconEvents.setMinimumSize(new java.awt.Dimension(28, 28));
        iconEvents.setPreferredSize(new java.awt.Dimension(28, 28));

        lblEventsPanelAdmins.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEventsPanelAdmins.setForeground(new java.awt.Color(255, 255, 255));
        lblEventsPanelAdmins.setText("Eventos");

        javax.swing.GroupLayout pnEventsLayout = new javax.swing.GroupLayout(pnEvents);
        pnEvents.setLayout(pnEventsLayout);
        pnEventsLayout.setHorizontalGroup(
            pnEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEventsLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(iconEvents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEventsPanelAdmins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnEventsLayout.setVerticalGroup(
            pnEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnEventsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconEvents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEventsPanelAdmins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnProj.setBackground(new java.awt.Color(34, 34, 34));
        pnProj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnProjMouseReleased(evt);
            }
        });

        iconProjects.setMaximumSize(new java.awt.Dimension(28, 28));
        iconProjects.setMinimumSize(new java.awt.Dimension(28, 28));
        iconProjects.setPreferredSize(new java.awt.Dimension(28, 28));

        lblProjectsPanelAdmins.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblProjectsPanelAdmins.setForeground(new java.awt.Color(255, 255, 255));
        lblProjectsPanelAdmins.setText("Proyectos");

        javax.swing.GroupLayout pnProjLayout = new javax.swing.GroupLayout(pnProj);
        pnProj.setLayout(pnProjLayout);
        pnProjLayout.setHorizontalGroup(
            pnProjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProjLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(iconProjects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProjectsPanelAdmins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnProjLayout.setVerticalGroup(
            pnProjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProjLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnProjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProjectsPanelAdmins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnAgenda.setBackground(new java.awt.Color(34, 34, 34));
        pnAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnAgendaMouseReleased(evt);
            }
        });

        iconAgenda.setMaximumSize(new java.awt.Dimension(28, 28));
        iconAgenda.setMinimumSize(new java.awt.Dimension(28, 28));
        iconAgenda.setPreferredSize(new java.awt.Dimension(28, 28));

        DiaryPanelAdmins.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DiaryPanelAdmins.setForeground(new java.awt.Color(255, 255, 255));
        DiaryPanelAdmins.setText("Agenda");

        javax.swing.GroupLayout pnAgendaLayout = new javax.swing.GroupLayout(pnAgenda);
        pnAgenda.setLayout(pnAgendaLayout);
        pnAgendaLayout.setHorizontalGroup(
            pnAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAgendaLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(iconAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DiaryPanelAdmins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnAgendaLayout.setVerticalGroup(
            pnAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnAgendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DiaryPanelAdmins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnSecurity.setBackground(new java.awt.Color(34, 34, 34));
        pnSecurity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnSecurityMouseReleased(evt);
            }
        });

        iconSecurity.setMaximumSize(new java.awt.Dimension(28, 28));
        iconSecurity.setMinimumSize(new java.awt.Dimension(28, 28));
        iconSecurity.setPreferredSize(new java.awt.Dimension(28, 28));

        lblSecurityPanelAdmins.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSecurityPanelAdmins.setForeground(new java.awt.Color(255, 255, 255));
        lblSecurityPanelAdmins.setText("Seguridad");

        lblAlert.setMaximumSize(new java.awt.Dimension(28, 28));
        lblAlert.setMinimumSize(new java.awt.Dimension(28, 28));
        lblAlert.setPreferredSize(new java.awt.Dimension(28, 28));

        javax.swing.GroupLayout pnSecurityLayout = new javax.swing.GroupLayout(pnSecurity);
        pnSecurity.setLayout(pnSecurityLayout);
        pnSecurityLayout.setHorizontalGroup(
            pnSecurityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSecurityLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(iconSecurity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSecurityPanelAdmins, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAlert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnSecurityLayout.setVerticalGroup(
            pnSecurityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnSecurityLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnSecurityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconSecurity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSecurityPanelAdmins, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAlert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnEvents, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnProj, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnAgenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(pnSecurity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pnUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pnSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pnSecurity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(pnEvents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pnProj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pnAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        scrollContainer.setBackground(new java.awt.Color(255, 51, 255));
        scrollContainer.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollContainer.setMaximumSize(new java.awt.Dimension(456000, 456000));
        scrollContainer.setMinimumSize(new java.awt.Dimension(0, 0));
        scrollContainer.setPreferredSize(new java.awt.Dimension(1, 1));
        scrollContainer.setWheelScrollingEnabled(false);

        javax.swing.GroupLayout rootpaneLayout = new javax.swing.GroupLayout(rootpane);
        rootpane.setLayout(rootpaneLayout);
        rootpaneLayout.setHorizontalGroup(
            rootpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(rootpaneLayout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scrollContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rootpaneLayout.setVerticalGroup(
            rootpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootpaneLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(rootpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rootpane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rootpane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //</editor-fold>
    
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinActionPerformed

    private void btnMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaxActionPerformed

    }//GEN-LAST:event_btnMaxActionPerformed

    private void lblLenguageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLenguageMouseClicked
        popupLenguage.show(this,lblLenguage.getX()-30,lblLenguage.getY()+28);
    }//GEN-LAST:event_lblLenguageMouseClicked

    private void tbtnInternetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnInternetActionPerformed
        
        if(tbtnInternet.isSelected())
            internet=false;
        else
            internet=true;
    }//GEN-LAST:event_tbtnInternetActionPerformed

    private void topBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topBarMouseDragged
        this.setLocation(this.getLocation().x+evt.getX()-x,this.getLocation().y+evt.getY()-y);
    }//GEN-LAST:event_topBarMouseDragged

    private void topBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topBarMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_topBarMousePressed

    private void lblImageUserTopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImageUserTopMouseClicked
        
    }//GEN-LAST:event_lblImageUserTopMouseClicked

    private void pnUserMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnUserMouseReleased
        showUsers();
        cambio = false;
    }//GEN-LAST:event_pnUserMouseReleased

    public void showUsers(){
        if(cambio){
            loading();
            new Thread(()->{
                disable();
                pnUser.setBackground(new Color(52, 52, 52));
                classUsuario.restartUser();
                classContact.reset();

                classAdmin.select();
                classAdmin.selectLog();

                controller.jpUs = new jpUsers();
                controller.jpUs.setPreferredSize(new Dimension(980,601));
                controller.jpUs.setLocation(0,0);

                scrollContainer.setViewportView(controller.jpUs);
                scrollContainer.revalidate();
                scrollContainer.repaint();
                cambio = true;
           }) .start();
        }
    }
    
    public void showUser(int user, boolean search){

        jpEditUserAdmin editUser = new jpEditUserAdmin(user, search);
        editUser.setPreferredSize(new Dimension(980,601));
        editUser.setLocation(0,0);

        scrollContainer.setViewportView(editUser);
        scrollContainer.revalidate();
        scrollContainer.repaint();
    }
    
    public void loading(){

        jpLoad load = new jpLoad();
        load.setPreferredSize(new Dimension(980,601));
        load.setLocation(0,0);

        scrollContainer.setViewportView(load);
        scrollContainer.revalidate();
        scrollContainer.repaint();
    }
    
    public void jpSeUs(){

        controller.jpSeUs = new jpSecurityUser();
        controller.jpSeUs.setPreferredSize(new Dimension(980,601));
        controller.jpSeUs.setLocation(0,0);

        scrollContainer.setViewportView(controller.jpSeUs);
        scrollContainer.revalidate();
        scrollContainer.repaint();
    }
    
    public void settings(){
        disable();
        pnSettings.setBackground(new Color(52, 52, 52));
        jpSettingsAdmin jpSe = new jpSettingsAdmin(this);
        jpSe.setLocation(0,0);

        scrollContainer.setViewportView(jpSe);
        scrollContainer.revalidate();
        scrollContainer.repaint();
    }
    
    private void pnGeneralMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnGeneralMouseReleased
        
    }//GEN-LAST:event_pnGeneralMouseReleased

    private void pnProjMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnProjMouseReleased
        if(classUsuario.getCondition()==1){
            disable();
            controller.jpDis = new jpDisable();
            controller.jpDis.setLocation(0,0);

            scrollContainer.setViewportView(controller.jpDis);
            scrollContainer.revalidate();
            scrollContainer.repaint();
        }else{
            disable();
            pnProj.setBackground(new Color(52, 52, 52));
            controller.jpPM = new jpProjectsMenu();
            controller.jpPM.setLocation(0,0);

            scrollContainer.setViewportView(controller.jpPM);
            scrollContainer.revalidate();
            scrollContainer.repaint();
        }
    }//GEN-LAST:event_pnProjMouseReleased

    private void pnSettingsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnSettingsMouseReleased
        settings();
    }//GEN-LAST:event_pnSettingsMouseReleased

    private void lblSettingsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSettingsMouseReleased
        popupSettings.show(this,lblSettings.getX()-45,lblSettings.getY()+70);
    }//GEN-LAST:event_lblSettingsMouseReleased

    private void itemSettingsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemSettingsMouseReleased
        standardization.invokeLogin(true);
    }//GEN-LAST:event_itemSettingsMouseReleased

    private void pnEventsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnEventsMouseReleased
        if(classUsuario.getCondition()==1){
            disable();
            controller.jpDis = new jpDisable();
            controller.jpDis.setLocation(0,0);

            scrollContainer.setViewportView(controller.jpDis);
            scrollContainer.revalidate();
            scrollContainer.repaint();
        }else{
            disable();
            pnEvents.setBackground(new Color(52, 52, 52));
            pnEvent(true);
        }
    }//GEN-LAST:event_pnEventsMouseReleased

    private void pnAgendaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnAgendaMouseReleased
         
        if(classUsuario.getCondition()==1){
            disable();
            controller.jpDis = new jpDisable();
            controller.jpDis.setLocation(0,0);

            scrollContainer.setViewportView(controller.jpDis);
            scrollContainer.revalidate();
            scrollContainer.repaint();
        }else{
            disable();
            pnAgenda.setBackground(new Color(52, 52, 52));
            controller.jpAGE = new jpAgendaMenu();
            controller.jpAGE.setLocation(0,0);

            scrollContainer.setViewportView(controller.jpAGE);
            scrollContainer.revalidate();
            scrollContainer.repaint();
        }
        
    }//GEN-LAST:event_pnAgendaMouseReleased

    private void pnSecurityMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnSecurityMouseReleased
//        pnSecurity();
    }//GEN-LAST:event_pnSecurityMouseReleased

    private void lblImageUserTopMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImageUserTopMouseReleased
        if(classUsuario.getCondition()==1){
            pnSecurity();
        }else
            showUsers();
    }//GEN-LAST:event_lblImageUserTopMouseReleased
    //</editor-fold>
    
    public void disable (){
        pnGeneral.setBackground(new Color(34, 34, 34));
        pnUser.setBackground(new Color(34, 34, 34));
        pnSettings.setBackground(new Color(34, 34, 34));
        pnSecurity.setBackground(new Color(34, 34, 34));
        if(classUsuario.getCondition()!=1)
        {
            pnEvents.setBackground(new Color(34, 34, 34));
            pnProj.setBackground(new Color(34, 34, 34));
            pnAgenda.setBackground(new Color(34, 34, 34));
        }
    }
    
    public void pnEvent(boolean start){
        controller.jpE = new jpEvent(start);
        controller.jpE.setLocation(0,0);

        int x = controller.jpE.getPreferredSize().width;
        int y = controller.jpE.getPreferredSize().height;

        controller.jpE.setPreferredSize(new Dimension(x, y));

        scrollContainer.setViewportView(controller.jpE);
        scrollContainer.revalidate();
        scrollContainer.repaint();
    }
    
    public void pnSecurity(){
        disable();
        pnSecurity.setBackground(new Color(52, 52, 52));
        controller.jpSe = new jpSecurity();
        controller.jpSe.setLocation(0, 0);
        
        scrollContainer.setViewportView(controller.jpSe);
        scrollContainer.revalidate();
        scrollContainer.repaint();
    }
    
    public void loadData(String image, String text, JLabel label)
    {
        ImageIcon original = new ImageIcon(getClass().getResource("/imagenes/"+image+".png"));
        Icon icono = new ImageIcon(original.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        label.setText(text);
        label.setIcon(icono);
    }

    //<editor-fold defaultstate="collapsed" desc="compiled code">
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DiaryPanelAdmins;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMax;
    private javax.swing.JButton btnMin;
    private javax.swing.JLabel iconAgenda;
    private javax.swing.JLabel iconEvents;
    private javax.swing.JLabel iconProjects;
    private javax.swing.JLabel iconSecurity;
    private javax.swing.JLabel iconSettings;
    private javax.swing.JLabel iconStart;
    private javax.swing.JLabel iconUser;
    private javax.swing.JMenuItem itemEnglish;
    private javax.swing.JMenuItem itemSettings;
    private javax.swing.JMenuItem itemSpanish;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblAlert;
    private javax.swing.JLabel lblConfigurationsPanelAdmins;
    private javax.swing.JLabel lblEventsPanelAdmins;
    private javax.swing.JLabel lblGral;
    private javax.swing.JLabel lblImageUserLeft;
    private javax.swing.JLabel lblImageUserTop;
    private javax.swing.JLabel lblLenguage;
    private javax.swing.JLabel lblProjectsPanelAdmins;
    private javax.swing.JLabel lblSecurityPanelAdmins;
    private javax.swing.JLabel lblSettings;
    private javax.swing.JLabel lblUserPanelAdmins;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel pnAgenda;
    private javax.swing.JPanel pnEvents;
    private javax.swing.JPanel pnGeneral;
    private javax.swing.JPanel pnProj;
    private javax.swing.JPanel pnSecurity;
    private javax.swing.JPanel pnSettings;
    private javax.swing.JPanel pnUser;
    private javax.swing.JPopupMenu popupLenguage;
    private javax.swing.JPopupMenu popupSettings;
    private javax.swing.JPanel rootpane;
    private javax.swing.JScrollPane scrollContainer;
    private javax.swing.JToggleButton tbtnInternet;
    private javax.swing.JPanel topBar;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
