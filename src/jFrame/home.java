package jFrame;

import JPanel.*;
import java.awt.Color;
import java.awt.Image;
import javaClass.*;
import static javaClass.controller.jpH;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class home extends javax.swing.JFrame {

    private boolean internet;
    boolean cambio=true;
    int x, y;
    
    public home(boolean load) {
        initComponents();
        classUsuario.updateSelect();
        classUsuario.loadAllMember();
        controller.rootFrame = this;
        this.internet = logIn.internet;
        load(load);
    }
    
    void load(boolean load){        
        jpH = new jpHome(true, this);
        jpH.setLocation(0,0);

        scrollContainer.setViewportView(jpH);
        scrollContainer.revalidate();
        scrollContainer.repaint();

        
        loadImage();
    }
    
    void loadImage(){
        lblStart.setIcon(new controller().changeImage("/imagenes/home.png", 24, 24));
        lblUser.setIcon(new controller().changeImage("/imagenes/username.png", 24, 24));
//        if(classUsuario.getImage()==null)
//            lblImageUser.setIcon(new controller().changeImage("/imagenes/user.png", 97, 97));
//        else
//            lblImageUser.setIcon(new controller().changeSizeImage(standardization.getImgIcon(classUsuario.getImage()), 97, 97));
        lblMembership.setIcon(new controller().changeImage("/imagenes/membership.png", 24, 24));
        lblEvent.setIcon(new controller().changeImage("/imagenes/event.png", 24, 24));
        lblProject.setIcon(new controller().changeImage("/imagenes/project.png", 24, 24));
        lblAgenda.setIcon(new controller().changeImage("/imagenes/agenda.png", 24, 24));

        lblUsers.setText(classUsuario.getNickname());
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
        lblUsers = new javax.swing.JLabel();
        leftPanel = new javax.swing.JPanel();
        pnGeneral = new javax.swing.JPanel();
        lblStart = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnUser = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnMem = new javax.swing.JPanel();
        lblMembership = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        lblImageUser = new javax.swing.JLabel();
        pnEve = new javax.swing.JPanel();
        lblEvent = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pnProj = new javax.swing.JPanel();
        lblProject = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnAgenda = new javax.swing.JPanel();
        lblAgenda = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
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
        setMaximumSize(new java.awt.Dimension(1150, 680));
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
        btnExit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
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
        btnMin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
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
        btnMax.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
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

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
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

        lblUsers.setForeground(new java.awt.Color(255, 255, 255));
        lblUsers.setText("Not found");
        lblUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUsersMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 811, Short.MAX_VALUE)
                .addComponent(lblUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(lblSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        leftPanel.setBackground(new java.awt.Color(42, 42, 42));

        pnGeneral.setBackground(new java.awt.Color(34, 34, 34));
        pnGeneral.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pnGeneralFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pnGeneralFocusLost(evt);
            }
        });
        pnGeneral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnGeneralMouseReleased(evt);
            }
        });

        lblStart.setMaximumSize(new java.awt.Dimension(28, 28));
        lblStart.setMinimumSize(new java.awt.Dimension(28, 28));
        lblStart.setPreferredSize(new java.awt.Dimension(28, 28));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("General");

        javax.swing.GroupLayout pnGeneralLayout = new javax.swing.GroupLayout(pnGeneral);
        pnGeneral.setLayout(pnGeneralLayout);
        pnGeneralLayout.setHorizontalGroup(
            pnGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGeneralLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnGeneralLayout.setVerticalGroup(
            pnGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnUser.setBackground(new java.awt.Color(34, 34, 34));
        pnUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pnUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pnUserFocusLost(evt);
            }
        });
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
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
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
        pnMem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pnMemFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pnMemFocusLost(evt);
            }
        });
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
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
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
                .addComponent(lblImageUser, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImageUser, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnEve.setBackground(new java.awt.Color(34, 34, 34));
        pnEve.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pnEveFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pnEveFocusLost(evt);
            }
        });
        pnEve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnEveMouseReleased(evt);
            }
        });

        lblEvent.setMaximumSize(new java.awt.Dimension(28, 28));
        lblEvent.setMinimumSize(new java.awt.Dimension(28, 28));
        lblEvent.setPreferredSize(new java.awt.Dimension(28, 28));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Eventos");

        javax.swing.GroupLayout pnEveLayout = new javax.swing.GroupLayout(pnEve);
        pnEve.setLayout(pnEveLayout);
        pnEveLayout.setHorizontalGroup(
            pnEveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEveLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnEveLayout.setVerticalGroup(
            pnEveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnEveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnEveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnProj.setBackground(new java.awt.Color(34, 34, 34));
        pnProj.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pnProjFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pnProjFocusLost(evt);
            }
        });
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
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
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
        pnAgenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pnAgendaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pnAgendaFocusLost(evt);
            }
        });
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
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
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

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnMem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnEve, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnProj, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnAgenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pnProj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pnAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        scrollContainer.setBackground(new java.awt.Color(255, 51, 255));
        scrollContainer.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollContainer.setMaximumSize(new java.awt.Dimension(456000, 456000));
        scrollContainer.setMinimumSize(new java.awt.Dimension(0, 0));
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

    private void lblUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsersMouseClicked
        controller.jpU = new jpEditUser(lblImageUser);
        controller.jpU.setLocation(0,0);

        scrollContainer.setViewportView(controller.jpU);
        scrollContainer.revalidate();
        scrollContainer.repaint();
    }//GEN-LAST:event_lblUsersMouseClicked

    private void pnUserMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnUserMouseReleased
        showEditUser();
    }//GEN-LAST:event_pnUserMouseReleased

    public void showEditUser(){
        controller.jpU = new jpEditUser(lblImageUser);
        controller.jpU.setLocation(0,0);

        scrollContainer.setViewportView(controller.jpU);
        scrollContainer.revalidate();
        scrollContainer.repaint();
    }
    
    public void membershipChange(){
        controller.jpMC = new jpMembershipChange(this);
        controller.jpMC.setLocation(0,0);

        scrollContainer.setViewportView(controller.jpMC);
        scrollContainer.revalidate();
        scrollContainer.repaint();
    }
    
    private void pnGeneralMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnGeneralMouseReleased
        jpH = new jpHome(true, this);
        jpH.setLocation(0,0);

        scrollContainer.setViewportView(jpH);
        scrollContainer.revalidate();
        scrollContainer.repaint();
    }//GEN-LAST:event_pnGeneralMouseReleased

    private void pnProjMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnProjMouseReleased
        controller.jpPJ = new jpProjects();
        controller.jpPJ.setLocation(0,0);

        scrollContainer.setViewportView(controller.jpPJ);
        scrollContainer.revalidate();
        scrollContainer.repaint();
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

    //<editor-fold defaultstate="collapsed" desc="fail">
        
    private void pnGeneralFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnGeneralFocusGained
        pnGeneral.setBackground(new Color(54,54,54));
    }//GEN-LAST:event_pnGeneralFocusGained

    private void pnGeneralFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnGeneralFocusLost
        pnGeneral.setBackground(new Color(34,34,34));
    }//GEN-LAST:event_pnGeneralFocusLost

    private void pnUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnUserFocusGained
        pnUser.setBackground(new Color(54,54,54));
    }//GEN-LAST:event_pnUserFocusGained

    private void pnUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnUserFocusLost
        pnUser.setBackground(new Color(34,34,34));
    }//GEN-LAST:event_pnUserFocusLost

    private void pnMemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnMemFocusGained
        pnMem.setBackground(new Color(54,54,54));
    }//GEN-LAST:event_pnMemFocusGained

    private void pnMemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnMemFocusLost
        pnMem.setBackground(new Color(34,34,34));
    }//GEN-LAST:event_pnMemFocusLost

    private void pnEveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnEveFocusGained
        pnEve.setBackground(new Color(54,54,54));
    }//GEN-LAST:event_pnEveFocusGained

    private void pnEveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnEveFocusLost
        pnEve.setBackground(new Color(34,34,34));
    }//GEN-LAST:event_pnEveFocusLost

    private void pnProjFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnProjFocusGained
        pnProj.setBackground(new Color(54,54,54));
    }//GEN-LAST:event_pnProjFocusGained

    private void pnProjFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnProjFocusLost
        pnProj.setBackground(new Color(34,34,34));
    }//GEN-LAST:event_pnProjFocusLost

    private void pnAgendaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnAgendaFocusGained
        pnAgenda.setBackground(new Color(54,54,54));
    }//GEN-LAST:event_pnAgendaFocusGained

    private void pnAgendaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnAgendaFocusLost
        pnAgenda.setBackground(new Color(34,34,34));
    }//GEN-LAST:event_pnAgendaFocusLost

    private void pnEveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnEveMouseReleased
        controller.jpE = new jpEvent();
        controller.jpE.setLocation(0,0);

        scrollContainer.setViewportView(controller.jpE);
        scrollContainer.revalidate();
        scrollContainer.repaint();
    }//GEN-LAST:event_pnEveMouseReleased

    private void pnAgendaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnAgendaMouseReleased
        controller.jpREM = new jpReminder();
        controller.jpREM.setLocation(0,0);

        scrollContainer.setViewportView(controller.jpREM);
        scrollContainer.revalidate();
        scrollContainer.repaint();
    }//GEN-LAST:event_pnAgendaMouseReleased
    //</editor-fold>
    
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
    private javax.swing.JMenuItem itemEnglish;
    private javax.swing.JMenuItem itemSettings;
    private javax.swing.JMenuItem itemSpanish;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAgenda;
    private javax.swing.JLabel lblEvent;
    private javax.swing.JLabel lblImageUser;
    private javax.swing.JLabel lblLenguage;
    private javax.swing.JLabel lblMembership;
    private javax.swing.JLabel lblProject;
    private javax.swing.JLabel lblSettings;
    private javax.swing.JLabel lblStart;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUsers;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel pnAgenda;
    private javax.swing.JPanel pnEve;
    private javax.swing.JPanel pnGeneral;
    private javax.swing.JPanel pnMem;
    private javax.swing.JPanel pnProj;
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
