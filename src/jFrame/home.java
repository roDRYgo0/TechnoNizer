package jFrame;

import eventAdmin.eventAdmin;
import JPanel.*;
import eventAdmin.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import javaClass.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import projects.jpProjects;

public class home extends javax.swing.JFrame {

    private boolean internet;
    boolean cambio=true;
    int x, y;
    
    public static JLabel imageUserTop;
    public static JLabel imageUserLeft;
    
    public home(boolean load) {
        initComponents();
        
        new Thread(()->{
            classContact.select();
            classReminder.select();

        }).start();
        
        imageUserTop = lblImageUserTop;
        imageUserLeft = lblImageUserLeft;
        
        if(load){
            System.out.println("listo");
        }
        else
            classUsuario.select();
        controller.rootFrame = this;
        this.internet = logIn.internet;
        load();
    }
    
    void load(){        
        
        if(classUsuario.getCondition()==1)
            lblAlert.setIcon(new controller().changeImage("/imagenes/alert.png", 28, 28));
        
        jpHome jpH = new jpHome(true, this);
        jpH.setLocation(0,0);

        scrollContainer.add(jpH, BorderLayout.CENTER);
        scrollContainer.revalidate();
        scrollContainer.repaint();

        
        loadImage();
    }
    
    public void loadImage(){
        lblStart.setIcon(new controller().changeImage("/imagenes/home.png", 24, 24));
        lblUser.setIcon(new controller().changeImage("/imagenes/username.png", 24, 24));
        if(classUsuario.getImage()==null)
            lblImageUserLeft.setIcon(new controller().changeImage("/imagenes/user.png", 97, 97));
        else
            lblImageUserLeft.setIcon(new controller().changeSizeImage(standardization.getImgIcon(classUsuario.getImage()), 97, 97));
        lblMembership.setIcon(new controller().changeImage("/imagenes/membership.png", 24, 24));
        lblSecurity.setIcon(new controller().changeImage("/imagenes/shield.png", 24, 24));
        lblEvent.setIcon(new controller().changeImage("/imagenes/event.png", 24, 24));
        lblProject.setIcon(new controller().changeImage("/imagenes/project.png", 24, 24));
        lblAgenda.setIcon(new controller().changeImage("/imagenes/agenda.png", 24, 24));
        if(classUsuario.getCondition()==1){
            lblImageUserTop.setIcon(new controller().changeImage("/imagenes/alert.png", 24, 24));
            lblImageUserTop.setText("Activa tu cuenta");
            pnEvents.setBackground(new Color(64, 64, 64));
            pnProj.setBackground(new Color(64, 64, 64));
            pnAgenda.setBackground(new Color(64, 64, 64));
        }else{
            if(classUsuario.getImage()==null)
                lblImageUserTop.setIcon(new controller().changeImage("/imagenes/user.png", 24, 24));
            else
                lblImageUserTop.setIcon(new controller().changeSizeImage(standardization.getImgIcon(classUsuario.getImage()), 24, 24));
            lblImageUserTop.setText(classUsuario.getNickname());
        }
        loadData("settings","", lblSettings);
        switch(classUsuario.getIdMemberships()){
            case 1:
                iconMem.setIcon(new controller().changeImage("/imagenes/free.png", 26, 26));
                break;
            case 2:
                iconMem.setIcon(new controller().changeImage("/imagenes/vip.png", 26, 26));
                break;
            case 3:
                iconMem.setIcon(new controller().changeImage("/imagenes/premium.png", 26, 26));
                break;
        }
        
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
        tbtnInternet = new javax.swing.JToggleButton();
        lblLenguage = new javax.swing.JLabel();
        btnMin = new javax.swing.JButton();
        btnMax = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        rootpane = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblSettings = new javax.swing.JLabel();
        lblImageUserTop = new javax.swing.JLabel();
        iconMem = new javax.swing.JLabel();
        leftPanel = new javax.swing.JPanel();
        pnGeneral = new javax.swing.JPanel();
        lblStart = new javax.swing.JLabel();
        lblGral = new javax.swing.JLabel();
        pnUser = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnMem = new javax.swing.JPanel();
        lblMembership = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        lblImageUserLeft = new javax.swing.JLabel();
        pnEvents = new javax.swing.JPanel();
        lblEvent = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pnProj = new javax.swing.JPanel();
        lblProject = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnAgenda = new javax.swing.JPanel();
        lblAgenda = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnSecurity = new javax.swing.JPanel();
        lblSecurity = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblAlert = new javax.swing.JLabel();
        scrollContainer = new javax.swing.JPanel();

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
        topBar.setPreferredSize(new java.awt.Dimension(420, 30));
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

        lblLenguage.setBackground(new java.awt.Color(255, 255, 255));
        lblLenguage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblLenguageMouseReleased(evt);
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

        javax.swing.GroupLayout topBarLayout = new javax.swing.GroupLayout(topBar);
        topBar.setLayout(topBarLayout);
        topBarLayout.setHorizontalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topBarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tbtnInternet)
                .addGap(0, 0, 0)
                .addComponent(lblLenguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        topBarLayout.setVerticalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBarLayout.createSequentialGroup()
                .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topBarLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(tbtnInternet))
                    .addGroup(topBarLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblLenguage, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(topBarLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnMin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(topBarLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMax, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(2, 2, 2))
        );

        rootpane.setBackground(new java.awt.Color(0, 153, 0));

        jPanel2.setBackground(new java.awt.Color(33, 150, 243));
        jPanel2.setMaximumSize(new java.awt.Dimension(1150, 46));
        jPanel2.setMinimumSize(new java.awt.Dimension(1150, 46));
        jPanel2.setPreferredSize(new java.awt.Dimension(1150, 46));
        jPanel2.setRequestFocusEnabled(false);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TechnoNizer");
        jLabel2.setMaximumSize(new java.awt.Dimension(110, 46));
        jLabel2.setMinimumSize(new java.awt.Dimension(110, 46));
        jLabel2.setPreferredSize(new java.awt.Dimension(110, 46));

        lblSettings.setText("settings");
        lblSettings.setMaximumSize(new java.awt.Dimension(83, 14));
        lblSettings.setMinimumSize(new java.awt.Dimension(83, 14));
        lblSettings.setPreferredSize(new java.awt.Dimension(83, 14));
        lblSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSettingsMouseReleased(evt);
            }
        });

        lblImageUserTop.setForeground(new java.awt.Color(255, 255, 255));
        lblImageUserTop.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblImageUserTop.setText("Not found");
        lblImageUserTop.setMaximumSize(new java.awt.Dimension(141, 46));
        lblImageUserTop.setMinimumSize(new java.awt.Dimension(141, 46));
        lblImageUserTop.setPreferredSize(new java.awt.Dimension(141, 46));
        lblImageUserTop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImageUserTopMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblImageUserTopMouseReleased(evt);
            }
        });

        iconMem.setMaximumSize(new java.awt.Dimension(50, 46));
        iconMem.setMinimumSize(new java.awt.Dimension(50, 46));
        iconMem.setPreferredSize(new java.awt.Dimension(50, 46));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(744, 744, 744)
                .addComponent(lblImageUserTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(iconMem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lblSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblImageUserTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(iconMem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        leftPanel.setBackground(new java.awt.Color(42, 42, 42));

        pnGeneral.setBackground(new java.awt.Color(52, 52, 52));
        pnGeneral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnGeneralMouseReleased(evt);
            }
        });

        lblStart.setMaximumSize(new java.awt.Dimension(28, 28));
        lblStart.setMinimumSize(new java.awt.Dimension(28, 28));
        lblStart.setPreferredSize(new java.awt.Dimension(28, 28));

        lblGral.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblGral.setForeground(new java.awt.Color(255, 255, 255));
        lblGral.setText("General");

        javax.swing.GroupLayout pnGeneralLayout = new javax.swing.GroupLayout(pnGeneral);
        pnGeneral.setLayout(pnGeneralLayout);
        pnGeneralLayout.setHorizontalGroup(
            pnGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGeneralLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnGeneralLayout.setVerticalGroup(
            pnGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblGral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnUser.setBackground(new java.awt.Color(34, 34, 34));
        pnUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnUserMouseReleased(evt);
            }
        });

        lblUser.setMaximumSize(new java.awt.Dimension(28, 28));
        lblUser.setMinimumSize(new java.awt.Dimension(28, 28));
        lblUser.setPreferredSize(new java.awt.Dimension(28, 28));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuario");

        javax.swing.GroupLayout pnUserLayout = new javax.swing.GroupLayout(pnUser);
        pnUser.setLayout(pnUserLayout);
        pnUserLayout.setHorizontalGroup(
            pnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUserLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnUserLayout.setVerticalGroup(
            pnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnMem.setBackground(new java.awt.Color(34, 34, 34));
        pnMem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnMemMouseReleased(evt);
            }
        });

        lblMembership.setMaximumSize(new java.awt.Dimension(28, 28));
        lblMembership.setMinimumSize(new java.awt.Dimension(28, 28));
        lblMembership.setPreferredSize(new java.awt.Dimension(28, 28));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Membresia");

        javax.swing.GroupLayout pnMemLayout = new javax.swing.GroupLayout(pnMem);
        pnMem.setLayout(pnMemLayout);
        pnMemLayout.setHorizontalGroup(
            pnMemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMemLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblMembership, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnMemLayout.setVerticalGroup(
            pnMemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnMemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMembership, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        lblEvent.setMaximumSize(new java.awt.Dimension(28, 28));
        lblEvent.setMinimumSize(new java.awt.Dimension(28, 28));
        lblEvent.setPreferredSize(new java.awt.Dimension(28, 28));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Eventos");

        javax.swing.GroupLayout pnEventsLayout = new javax.swing.GroupLayout(pnEvents);
        pnEvents.setLayout(pnEventsLayout);
        pnEventsLayout.setHorizontalGroup(
            pnEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEventsLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnEventsLayout.setVerticalGroup(
            pnEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnEventsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnProj.setBackground(new java.awt.Color(34, 34, 34));
        pnProj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnProjMouseReleased(evt);
            }
        });

        lblProject.setMaximumSize(new java.awt.Dimension(28, 28));
        lblProject.setMinimumSize(new java.awt.Dimension(28, 28));
        lblProject.setPreferredSize(new java.awt.Dimension(28, 28));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Proyectos");

        javax.swing.GroupLayout pnProjLayout = new javax.swing.GroupLayout(pnProj);
        pnProj.setLayout(pnProjLayout);
        pnProjLayout.setHorizontalGroup(
            pnProjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProjLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnProjLayout.setVerticalGroup(
            pnProjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProjLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnProjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnAgenda.setBackground(new java.awt.Color(34, 34, 34));
        pnAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnAgendaMouseReleased(evt);
            }
        });

        lblAgenda.setMaximumSize(new java.awt.Dimension(28, 28));
        lblAgenda.setMinimumSize(new java.awt.Dimension(28, 28));
        lblAgenda.setPreferredSize(new java.awt.Dimension(28, 28));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Agenda");

        javax.swing.GroupLayout pnAgendaLayout = new javax.swing.GroupLayout(pnAgenda);
        pnAgenda.setLayout(pnAgendaLayout);
        pnAgendaLayout.setHorizontalGroup(
            pnAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAgendaLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnAgendaLayout.setVerticalGroup(
            pnAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnAgendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnSecurity.setBackground(new java.awt.Color(34, 34, 34));
        pnSecurity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnSecurityMouseReleased(evt);
            }
        });

        lblSecurity.setMaximumSize(new java.awt.Dimension(28, 28));
        lblSecurity.setMinimumSize(new java.awt.Dimension(28, 28));
        lblSecurity.setPreferredSize(new java.awt.Dimension(28, 28));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Seguridad");

        lblAlert.setMaximumSize(new java.awt.Dimension(28, 28));
        lblAlert.setMinimumSize(new java.awt.Dimension(28, 28));
        lblAlert.setPreferredSize(new java.awt.Dimension(28, 28));

        javax.swing.GroupLayout pnSecurityLayout = new javax.swing.GroupLayout(pnSecurity);
        pnSecurity.setLayout(pnSecurityLayout);
        pnSecurityLayout.setHorizontalGroup(
            pnSecurityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSecurityLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblSecurity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAlert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnSecurityLayout.setVerticalGroup(
            pnSecurityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnSecurityLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnSecurityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSecurity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAlert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnMem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(pnMem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        javax.swing.GroupLayout scrollContainerLayout = new javax.swing.GroupLayout(scrollContainer);
        scrollContainer.setLayout(scrollContainerLayout);
        scrollContainerLayout.setHorizontalGroup(
            scrollContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        scrollContainerLayout.setVerticalGroup(
            scrollContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout rootpaneLayout = new javax.swing.GroupLayout(rootpane);
        rootpane.setLayout(rootpaneLayout);
        rootpaneLayout.setHorizontalGroup(
            rootpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(rootpaneLayout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scrollContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        rootpaneLayout.setVerticalGroup(
            rootpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootpaneLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(rootpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(rootpaneLayout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(scrollContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topBar, javax.swing.GroupLayout.DEFAULT_SIZE, 1150, Short.MAX_VALUE)
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
        showEditUser();
    }//GEN-LAST:event_pnUserMouseReleased

    public void showEditUser(){
        disable();
        pnUser.setBackground(new Color(52, 52, 52));
        controller.jpU = new jpEditUser();
        controller.jpU.setPreferredSize(new Dimension(980,601));
        controller.jpU.setLocation(0,0);

        scrollContainer.add(controller.jpU, BorderLayout.CENTER);
        scrollContainer.revalidate();
        scrollContainer.repaint();
    }
    
    public void showAllEvents(boolean search){
        disable();
        pnEvents.setBackground(new Color(52, 52, 52));
        allEvent.jpEvent event = new allEvent.jpEvent(search);
        event.setPreferredSize(new Dimension(980,601));
        event.setLocation(0,0);

        scrollContainer.add(event, BorderLayout.CENTER);
        scrollContainer.revalidate();
        scrollContainer.repaint();
    }
    
    public void showYourEvents(boolean search){
        disable();
        pnEvents.setBackground(new Color(52, 52, 52));
        controller.jpE = new jpEvent(search);
        controller.jpE.setPreferredSize(new Dimension(980,601));
        controller.jpE.setLocation(0,0);

        scrollContainer.add(controller.jpE, BorderLayout.CENTER);
        scrollContainer.revalidate();
        scrollContainer.repaint();
    }
    
    public void showYourEvents(){
        disable();
        pnEvents.setBackground(new Color(52, 52, 52));
 
        scrollContainer.add(controller.jpE, BorderLayout.CENTER);
        scrollContainer.revalidate();
        scrollContainer.repaint();
    }
    
    public void membershipChange(){
        disable();
        pnMem.setBackground(new Color(52, 52, 52));
        controller.jpMC = new jpMembershipChange(this);
        controller.jpMC.setLocation(0,0);

        scrollContainer.add(controller.jpMC, BorderLayout.CENTER);
        scrollContainer.revalidate();
        scrollContainer.repaint();
    }
    
    public void showEventSettings(int e){
        disable();
        pnEvents.setBackground(new Color(52, 52, 52));
        pnSettings setting = new pnSettings(e);
        setting.setLocation(0,0);
        
        scrollContainer.add(setting, BorderLayout.CENTER);
        scrollContainer.revalidate();
        scrollContainer.repaint();
    }
    public void showEvent(int e){
        disable();
        pnEvents.setBackground(new Color(52, 52, 52));
        controller.event = new eventAdmin(e);
        controller.event.setLocation(0,0);

        scrollContainer.add(controller.event, BorderLayout.CENTER);
        scrollContainer.revalidate();
        scrollContainer.repaint();
    }
    
    public void showEvent(){
        disable();
        pnEvents.setBackground(new Color(52, 52, 52));
        controller.event.setLocation(0,0);

        scrollContainer.add(controller.event, BorderLayout.CENTER);
        scrollContainer.revalidate();
        scrollContainer.repaint();
    }
    
    private void pnGeneralMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnGeneralMouseReleased
        disable();
        pnGeneral.setBackground(new Color(52, 52, 52));
        jpHome jpH = new jpHome(true, this);
        jpH.setLocation(0,0);

        scrollContainer.add(jpH, BorderLayout.CENTER);
        scrollContainer.revalidate();
        scrollContainer.repaint();
    }//GEN-LAST:event_pnGeneralMouseReleased

    private void pnProjMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnProjMouseReleased
        pnProjects();
    }//GEN-LAST:event_pnProjMouseReleased

    private void pnMemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnMemMouseReleased
        membershipChange();
    }//GEN-LAST:event_pnMemMouseReleased

    private void lblSettingsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSettingsMouseReleased
        popupSettings.show(this,lblSettings.getX()-45,lblSettings.getY()+70);
    }//GEN-LAST:event_lblSettingsMouseReleased

    private void itemSettingsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemSettingsMouseReleased
        standardization.invokeLogin();
    }//GEN-LAST:event_itemSettingsMouseReleased

    private void pnEventsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnEventsMouseReleased
        pnEvent();
    }//GEN-LAST:event_pnEventsMouseReleased

    
    private void pnAgendaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnAgendaMouseReleased
 
        pnAgenda();      
    }//GEN-LAST:event_pnAgendaMouseReleased
    
    public void pnAgenda(){
        if(classUsuario.getCondition()==1){
            disable();
       
            controller.jpDis = new jpDisable();
            controller.jpDis.setLocation(0,0);

            scrollContainer.add(controller.jpDis, BorderLayout.CENTER);
            scrollContainer.revalidate();
            scrollContainer.repaint();
        }else{
            disable();
            pnAgenda.setBackground(new Color(52, 52, 52));
            classContact.reset();

            controller.jpAA = new jpReminder();
            controller.jpAA.setPreferredSize(new Dimension(980,601));
            controller.jpAA.setLocation(0,0);

            scrollContainer.add(controller.jpAA, BorderLayout.CENTER);
            scrollContainer.revalidate();
            scrollContainer.repaint();
    }
    }
    
    private void pnSecurityMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnSecurityMouseReleased
        pnSecurity();
    }//GEN-LAST:event_pnSecurityMouseReleased

    private void lblImageUserTopMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImageUserTopMouseReleased
        if(classUsuario.getCondition()==1){
            pnSecurity();
        }else
            showEditUser();
    }//GEN-LAST:event_lblImageUserTopMouseReleased

    private void lblLenguageMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLenguageMouseReleased
        popupLenguage.show(this,lblLenguage.getX()-30,lblLenguage.getY()+28);
    }//GEN-LAST:event_lblLenguageMouseReleased
    //</editor-fold>
    
    public void disable (){
        pnGeneral.setBackground(new Color(34, 34, 34));
        pnUser.setBackground(new Color(34, 34, 34));
        pnMem.setBackground(new Color(34, 34, 34));
        pnSecurity.setBackground(new Color(34, 34, 34));
        if(classUsuario.getCondition()!=1)
        {
            pnEvents.setBackground(new Color(34, 34, 34));
            pnProj.setBackground(new Color(34, 34, 34));
            pnAgenda.setBackground(new Color(34, 34, 34));
        }
    }
    
    public void pnEvent(){
        if(classUsuario.getCondition()==1){
            disable();
            controller.jpDis = new jpDisable();
            controller.jpDis.setLocation(0,0);

            scrollContainer.add(controller.jpDis, BorderLayout.CENTER);
            scrollContainer.revalidate();
            scrollContainer.repaint();
        }else{
            disable();
            
            pnEvents.setBackground(new Color(52, 52, 52));
            MenuEvent eve = new MenuEvent();
            eve.setLocation(0,0);

            scrollContainer.add(eve, BorderLayout.CENTER);
            scrollContainer.revalidate();
            scrollContainer.repaint();
        }
    }
    
    public void pnProjects(){
        if(classUsuario.getCondition()==1){
            disable();
            controller.jpDis = new jpDisable();
            controller.jpDis.setLocation(0,0);

            scrollContainer.add(controller.jpDis, BorderLayout.CENTER);
            scrollContainer.revalidate();
            scrollContainer.repaint();
        }else{
            disable();
            pnProj.setBackground(new Color(52, 52, 52));
            controller.jpPM= new jpProjectsMenu();
            controller.jpPM.setLocation(0,0);

            scrollContainer.add(controller.jpPM, BorderLayout.CENTER);
            scrollContainer.revalidate();
            scrollContainer.repaint();
        }
    }
    
    public void pnSecurity(){
        disable();
        pnSecurity.setBackground(new Color(52, 52, 52));
        controller.jpSe = new jpSecurity();
        controller.jpSe.setLocation(0, 0);
        
        scrollContainer.add(controller.jpSe, BorderLayout.CENTER);
        scrollContainer.revalidate();
        scrollContainer.repaint();
    }
    
    public void showYourProjects(boolean search){
        disable();
        pnEvents.setBackground(new Color(52, 52, 52));
        jpProjects jpP = new jpProjects(search);
        jpP.setPreferredSize(new Dimension(980,601));
        jpP.setLocation(0,0);

        scrollContainer.add(jpP, BorderLayout.CENTER);
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
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMax;
    private javax.swing.JButton btnMin;
    private javax.swing.JLabel iconMem;
    private javax.swing.JMenuItem itemEnglish;
    private javax.swing.JMenuItem itemSettings;
    private javax.swing.JMenuItem itemSpanish;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAgenda;
    private javax.swing.JLabel lblAlert;
    private javax.swing.JLabel lblEvent;
    private javax.swing.JLabel lblGral;
    private javax.swing.JLabel lblImageUserLeft;
    private javax.swing.JLabel lblImageUserTop;
    private javax.swing.JLabel lblLenguage;
    private javax.swing.JLabel lblMembership;
    private javax.swing.JLabel lblProject;
    private javax.swing.JLabel lblSecurity;
    private javax.swing.JLabel lblSettings;
    private javax.swing.JLabel lblStart;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel pnAgenda;
    private javax.swing.JPanel pnEvents;
    private javax.swing.JPanel pnGeneral;
    private javax.swing.JPanel pnMem;
    private javax.swing.JPanel pnProj;
    private javax.swing.JPanel pnSecurity;
    private javax.swing.JPanel pnUser;
    private javax.swing.JPopupMenu popupLenguage;
    private javax.swing.JPopupMenu popupSettings;
    private javax.swing.JPanel rootpane;
    private javax.swing.JPanel scrollContainer;
    private javax.swing.JToggleButton tbtnInternet;
    private javax.swing.JPanel topBar;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
