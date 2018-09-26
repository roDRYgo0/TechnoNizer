package jFrame;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaClass.classEvent;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.methodsSQL;
import javaClass.standardization;
import javax.swing.JFrame;
import properties.propiedades;

/**
 * @author Alexg
 */
public class AddEventInfo extends javax.swing.JFrame {

    Properties pr = new propiedades(controller.idioma);

    JFrame event;
    byte[] cover;
    byte[] profil;
    boolean guest;
    int visibility;

    void verificaridioma() {
        pr = new propiedades(controller.idioma);
        addeventlbl.setText(pr.getProperty("addeventlbl"));
        DataGenEventInfo.setText(pr.getProperty("DataGenEventInfo"));
        NameeventlblEventInfo.setText(pr.getProperty("NameeventlblEventInfo"));
        placeeventEventInfo.setText(pr.getProperty("placeeventEventInfo"));
        InvitesnumberEventInfo.setText(pr.getProperty("InvitesnumberEventInfo"));
        SetDatesEventInfo.setText(pr.getProperty("SetDatesEventInfo"));
        DayEventInfo.setText(pr.getProperty("Dayjpedit"));
        MonthEventInfo.setText(pr.getProperty("monthjpedit"));
        YearEventInfo.setText(pr.getProperty("yearjpedit"));
        Day2EventInfo.setText(pr.getProperty("Dayjpedit"));
        Month2EventInfo.setText(pr.getProperty("monthjpedit"));
        Year2EventInfo.setText(pr.getProperty("yearjpedit"));

        cmbMonthStart.removeAllItems();
        cmbMonthEnd.removeAllItems();

        String mesesstart[] = {
            pr.getProperty("firstmonth"),
            pr.getProperty("secondmonth"),
            pr.getProperty("thirdmonth"),
            pr.getProperty("fourmonth"),
            pr.getProperty("fivemonth"),
            pr.getProperty("sixmonth"),
            pr.getProperty("sevenmonth"),
            pr.getProperty("eightmonth"),
            pr.getProperty("ninemonth"),
            pr.getProperty("tenmonth"),
            pr.getProperty("elevenmonth"),
            pr.getProperty("twelvemonth")
        };
        for (int i = 0; i < mesesstart.length; i++) {
            cmbMonthStart.addItem(mesesstart[i]);
        }

        String mesesEnd[] = {
            pr.getProperty("firstmonth"),
            pr.getProperty("secondmonth"),
            pr.getProperty("thirdmonth"),
            pr.getProperty("fourmonth"),
            pr.getProperty("fivemonth"),
            pr.getProperty("sixmonth"),
            pr.getProperty("sevenmonth"),
            pr.getProperty("eightmonth"),
            pr.getProperty("ninemonth"),
            pr.getProperty("tenmonth"),
            pr.getProperty("elevenmonth"),
            pr.getProperty("twelvemonth")
        };
        for (int i = 0; i < mesesEnd.length; i++) {
            cmbMonthEnd.addItem(mesesEnd[i]);
        }

        btnNext1.setText(pr.getProperty("btnNext1EventInfo"));
    }

    public AddEventInfo(JFrame event) {
        initComponents();
        this.event = event;
        guest = false;

        visibility = 1;
        switchVisibility();

        verificaridioma();
        loadImage();

    }

    public AddEventInfo() {
        initComponents();
        guest = false;

        visibility = 1;
        switchVisibility();

        verificaridioma();
        loadImage();
    }

    void loadImage() {
        iconStart.setIcon(new controller().changeImage("/imagenes/calendarPlus.png", 35, 35));
        iconGoogleMaps.setIcon(new controller().changeImage("/imagenes/googleMaps.png", 35, 35));
        iconEnd.setIcon(new controller().changeImage("/imagenes/calendarMinus.png", 35, 35));
        iconGuest.setIcon(new controller().changeImage("/imagenes/hashtag.png", 35, 35));
        iconPlace.setIcon(new controller().changeImage("/imagenes/place.png", 35, 35));
        txtDayStart.setText((standardization.currentDateTime().getDate() + 1) + "");
        txtDayEnd.setText((standardization.currentDateTime().getDate() + 1) + "");
        cmbMonthStart.setSelectedIndex(standardization.currentDateTime().getMonth());
        cmbMonthEnd.setSelectedIndex(standardization.currentDateTime().getMonth());
        txtYearStart.setText(standardization.currentDateTime().getYear() + "");
        txtYearEnd.setText(standardization.currentDateTime().getYear() + "");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        addeventlbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        lblEvent = new javax.swing.JLabel();
        DataGenEventInfo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        SetDatesEventInfo = new javax.swing.JLabel();
        NameeventlblEventInfo = new javax.swing.JLabel();
        txtEvent = new javax.swing.JTextField();
        spEvent = new javax.swing.JSeparator();
        spDayStart = new javax.swing.JSeparator();
        cmbMonthStart = new javax.swing.JComboBox<>();
        MonthEventInfo = new javax.swing.JLabel();
        txtYearStart = new javax.swing.JTextField();
        YearEventInfo = new javax.swing.JLabel();
        spYearStart = new javax.swing.JSeparator();
        iconStart = new javax.swing.JLabel();
        txtDayStart = new javax.swing.JTextField();
        DayEventInfo = new javax.swing.JLabel();
        iconEnd = new javax.swing.JLabel();
        txtDayEnd = new javax.swing.JTextField();
        Day2EventInfo = new javax.swing.JLabel();
        spDayEnd = new javax.swing.JSeparator();
        Month2EventInfo = new javax.swing.JLabel();
        cmbMonthEnd = new javax.swing.JComboBox<>();
        txtYearEnd = new javax.swing.JTextField();
        Year2EventInfo = new javax.swing.JLabel();
        spYearEnd = new javax.swing.JSeparator();
        btnNext1 = new javax.swing.JButton();
        placeeventEventInfo = new javax.swing.JLabel();
        txtPlace = new javax.swing.JTextField();
        spPlace = new javax.swing.JSeparator();
        InvitesnumberEventInfo = new javax.swing.JLabel();
        txtGuest = new javax.swing.JTextField();
        spNumber = new javax.swing.JSeparator();
        iconGuest = new javax.swing.JLabel();
        iconPlace = new javax.swing.JLabel();
        InvitesnumberEventInfo1 = new javax.swing.JLabel();
        iconGoogleMaps = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblSwitch = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(35, 150, 243));

        addeventlbl.setForeground(new java.awt.Color(255, 255, 255));
        addeventlbl.setText("Agregar Evento");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Technonizer");

        btnNext.setBackground(new java.awt.Color(0, 153, 255));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("X");
        btnNext.setBorderPainted(false);
        btnNext.setFocusable(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        lblEvent.setMaximumSize(new java.awt.Dimension(30, 30));
        lblEvent.setMinimumSize(new java.awt.Dimension(30, 30));
        lblEvent.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addeventlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNext))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(btnNext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addeventlbl))
                .addContainerGap())
        );

        DataGenEventInfo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DataGenEventInfo.setText("Datos Generales");

        SetDatesEventInfo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SetDatesEventInfo.setText("Establecer fechas ");

        NameeventlblEventInfo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        NameeventlblEventInfo.setForeground(new java.awt.Color(102, 102, 102));
        NameeventlblEventInfo.setText("Nombre del evento");

        txtEvent.setAutoscrolls(false);
        txtEvent.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtEvent.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEventFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEventFocusLost(evt);
            }
        });
        txtEvent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEventKeyTyped(evt);
            }
        });

        spEvent.setForeground(new java.awt.Color(204, 204, 204));

        spDayStart.setForeground(new java.awt.Color(204, 204, 204));

        cmbMonthStart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cmbMonthStart.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        MonthEventInfo.setText("Mes");

        txtYearStart.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtYearStart.setText("2000");
        txtYearStart.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtYearStart.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtYearStartFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtYearStartFocusLost(evt);
            }
        });
        txtYearStart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtYearStartKeyTyped(evt);
            }
        });

        YearEventInfo.setText("Año");

        spYearStart.setForeground(new java.awt.Color(204, 204, 204));

        iconStart.setMaximumSize(new java.awt.Dimension(35, 35));
        iconStart.setMinimumSize(new java.awt.Dimension(35, 35));
        iconStart.setPreferredSize(new java.awt.Dimension(35, 35));

        txtDayStart.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDayStart.setText("12");
        txtDayStart.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtDayStart.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDayStartFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDayStartFocusLost(evt);
            }
        });
        txtDayStart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDayStartKeyTyped(evt);
            }
        });

        DayEventInfo.setText("Día");

        iconEnd.setMaximumSize(new java.awt.Dimension(35, 35));
        iconEnd.setMinimumSize(new java.awt.Dimension(35, 35));
        iconEnd.setPreferredSize(new java.awt.Dimension(35, 35));

        txtDayEnd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDayEnd.setText("12");
        txtDayEnd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtDayEnd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDayEndFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDayEndFocusLost(evt);
            }
        });
        txtDayEnd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDayEndKeyTyped(evt);
            }
        });

        Day2EventInfo.setText("Día");

        spDayEnd.setForeground(new java.awt.Color(204, 204, 204));

        Month2EventInfo.setText("Mes");

        cmbMonthEnd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cmbMonthEnd.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        txtYearEnd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtYearEnd.setText("2000");
        txtYearEnd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtYearEnd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtYearEndFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtYearEndFocusLost(evt);
            }
        });
        txtYearEnd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtYearEndKeyTyped(evt);
            }
        });

        Year2EventInfo.setText("Año");

        spYearEnd.setForeground(new java.awt.Color(204, 204, 204));

        btnNext1.setBackground(new java.awt.Color(0, 153, 255));
        btnNext1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext1.setForeground(new java.awt.Color(255, 255, 255));
        btnNext1.setText("Siguiente");
        btnNext1.setBorderPainted(false);
        btnNext1.setFocusable(false);
        btnNext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext1ActionPerformed(evt);
            }
        });

        placeeventEventInfo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        placeeventEventInfo.setForeground(new java.awt.Color(102, 102, 102));
        placeeventEventInfo.setText("Lugar del evento");

        txtPlace.setAutoscrolls(false);
        txtPlace.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtPlace.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPlaceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPlaceFocusLost(evt);
            }
        });
        txtPlace.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlaceKeyTyped(evt);
            }
        });

        spPlace.setForeground(new java.awt.Color(204, 204, 204));

        InvitesnumberEventInfo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        InvitesnumberEventInfo.setForeground(new java.awt.Color(102, 102, 102));
        InvitesnumberEventInfo.setText("Numero de invitados");

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
        txtGuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuestActionPerformed(evt);
            }
        });
        txtGuest.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGuestKeyTyped(evt);
            }
        });

        spNumber.setForeground(new java.awt.Color(204, 204, 204));

        iconGuest.setMaximumSize(new java.awt.Dimension(35, 35));
        iconGuest.setMinimumSize(new java.awt.Dimension(35, 35));
        iconGuest.setPreferredSize(new java.awt.Dimension(35, 35));

        iconPlace.setMaximumSize(new java.awt.Dimension(35, 35));
        iconPlace.setMinimumSize(new java.awt.Dimension(35, 35));
        iconPlace.setPreferredSize(new java.awt.Dimension(35, 35));

        InvitesnumberEventInfo1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        InvitesnumberEventInfo1.setForeground(new java.awt.Color(102, 102, 102));
        InvitesnumberEventInfo1.setText("Google maps");

        iconGoogleMaps.setMaximumSize(new java.awt.Dimension(35, 35));
        iconGoogleMaps.setMinimumSize(new java.awt.Dimension(35, 35));
        iconGoogleMaps.setPreferredSize(new java.awt.Dimension(35, 35));

        lblStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStatus.setText("Activo");

        lblSwitch.setMaximumSize(new java.awt.Dimension(30, 30));
        lblSwitch.setMinimumSize(new java.awt.Dimension(30, 30));
        lblSwitch.setPreferredSize(new java.awt.Dimension(30, 30));
        lblSwitch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSwitchMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DataGenEventInfo)
                            .addComponent(placeeventEventInfo)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(spEvent)
                                .addComponent(txtEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SetDatesEventInfo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(iconStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DayEventInfo)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(spDayStart, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDayStart, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MonthEventInfo)
                                    .addComponent(cmbMonthStart, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtYearStart)
                                    .addComponent(YearEventInfo)
                                    .addComponent(spYearStart, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(iconEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDayEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spDayEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(Day2EventInfo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Month2EventInfo)
                                    .addComponent(cmbMonthEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtYearEnd)
                                    .addComponent(Year2EventInfo)
                                    .addComponent(spYearEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NameeventlblEventInfo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(iconGuest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtGuest, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                    .addComponent(spNumber))
                                .addGap(18, 18, 18)
                                .addComponent(iconGoogleMaps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(iconPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spPlace)
                                    .addComponent(txtPlace, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(InvitesnumberEventInfo)
                                .addGap(94, 94, 94)
                                .addComponent(InvitesnumberEventInfo1)))
                        .addGap(0, 17, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(DataGenEventInfo)
                .addGap(13, 13, 13)
                .addComponent(NameeventlblEventInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(spEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(placeeventEventInfo)
                        .addGap(9, 9, 9)
                        .addComponent(iconPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(spPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InvitesnumberEventInfo)
                    .addComponent(InvitesnumberEventInfo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(iconGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(spNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblSwitch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SetDatesEventInfo)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(DayEventInfo)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtDayStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(iconStart, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(1, 1, 1)
                                    .addComponent(spDayStart, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(YearEventInfo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtYearStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10))
                                    .addComponent(spYearStart, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(MonthEventInfo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbMonthStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(Day2EventInfo)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtDayEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(iconEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(1, 1, 1)
                                            .addComponent(spDayEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(spYearEnd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Month2EventInfo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbMonthEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)))
                                .addGap(52, 52, 52))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Year2EventInfo)
                                .addGap(12, 12, 12)
                                .addComponent(txtYearEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(btnNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(iconGoogleMaps, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        controller.rootFrame = technonizer.TechnoNizer.home;
        standardization.hide(controller.gralEvent);
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtEventFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEventFocusGained
        spEvent.setBackground(Color.red);
    }//GEN-LAST:event_txtEventFocusGained

    private void txtEventFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEventFocusLost
        spEvent.setBackground(Color.white);
        if (txtEvent.getText().trim().length() < 4 && txtEvent.getText().trim().length() > 0) {
            standardization.showMessage("cancel", "Evento invalido", this);
            txtEvent.setText("");
        }
    }//GEN-LAST:event_txtEventFocusLost

    private void txtEventKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEventKeyTyped
        char c = evt.getKeyChar();
        if (txtEvent.getText().length() < 41) {
            if (Character.isLetter(c) || Character.isSpaceChar(c) || Character.isDigit(c)) {
            } else {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtEventKeyTyped

    private void txtYearStartFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtYearStartFocusGained
        spYearStart.setBackground(Color.red);
    }//GEN-LAST:event_txtYearStartFocusGained

    private void txtYearStartKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYearStartKeyTyped
        char c = evt.getKeyChar();
        if (txtYearStart.getText().length() > 3 || c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtYearStartKeyTyped

    private void txtDayStartFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDayStartFocusGained
        spDayStart.setBackground(Color.red);
    }//GEN-LAST:event_txtDayStartFocusGained

    private void txtDayStartFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDayStartFocusLost
        spDayStart.setBackground(Color.white);
    }//GEN-LAST:event_txtDayStartFocusLost

    private void txtDayStartKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDayStartKeyTyped
        char c = evt.getKeyChar();
        if (txtDayStart.getText().length() > 1 || c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtDayStartKeyTyped

    private void txtDayEndFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDayEndFocusGained
        spDayEnd.setBackground(Color.red);
    }//GEN-LAST:event_txtDayEndFocusGained

    private void txtDayEndFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDayEndFocusLost
        spDayEnd.setBackground(Color.white);
    }//GEN-LAST:event_txtDayEndFocusLost

    private void txtDayEndKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDayEndKeyTyped
        char c = evt.getKeyChar();
        if (txtDayEnd.getText().length() > 1 || c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtDayEndKeyTyped

    private void txtYearEndFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtYearEndFocusGained
        spYearEnd.setBackground(Color.red);
    }//GEN-LAST:event_txtYearEndFocusGained

    private void txtYearEndKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYearEndKeyTyped
        char c = evt.getKeyChar();
        if (txtYearEnd.getText().length() > 3 || c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtYearEndKeyTyped

    private void txtYearStartFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtYearStartFocusLost
        spYearStart.setBackground(Color.white);
    }//GEN-LAST:event_txtYearStartFocusLost

    private void txtYearEndFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtYearEndFocusLost
        spYearEnd.setBackground(Color.white);
    }//GEN-LAST:event_txtYearEndFocusLost

    private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ActionPerformed
        if (true) {
            if (txtEvent.getText().trim().isEmpty() || txtYearStart.getText().trim().isEmpty() || txtYearEnd.getText().trim().isEmpty()
                    || txtDayStart.getText().trim().isEmpty() || txtDayEnd.getText().trim().isEmpty() || txtGuest.getText().trim().isEmpty()
                    || txtPlace.getText().trim().isEmpty() || txtPlace.getText().trim().length() < 4) {
                standardization.showMessage("warning", "Hay campos vacios!", this);
            } else if (methodsSQL.exists("SELECT eventName FROM events WHERE eventName = ? and nicknameCreator = ?", txtEvent.getText(),
                    classUsuario.getNickname())) {
                standardization.showMessage("warning", "Ya hay un evento con ese nombre", this);
            } else {
                if (controller.member[classUsuario.getIdMemberships() - 1].getNumberGuests() == -1) {
                    next();
                } else if (Integer.parseInt(txtGuest.getText()) > controller.member[classUsuario.getIdMemberships() - 1].getNumberGuests()) {
                    standardization.showMessage("warning", "Sobrepasas el limite de invitados", this);
                } else {
                    next();
                }
            }
        }
    }//GEN-LAST:event_btnNext1ActionPerformed

    void next() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date dateStart = sdf.parse(Integer.parseInt(txtYearStart.getText()) + "-" + (cmbMonthStart.getSelectedIndex() + 1) + "-" + Integer.parseInt(txtDayStart.getText()));
            Date dateEnd = sdf.parse(Integer.parseInt(txtYearEnd.getText()) + "-" + (cmbMonthEnd.getSelectedIndex() + 1) + "-" + Integer.parseInt(txtDayEnd.getText()));

            if (standardization.validateDate(Integer.parseInt(txtYearStart.getText()), (cmbMonthStart.getSelectedIndex() + 1), Integer.parseInt(txtDayStart.getText()))
                    && standardization.validateDate(Integer.parseInt(txtYearEnd.getText()), (cmbMonthEnd.getSelectedIndex() + 1), Integer.parseInt(txtDayEnd.getText())
                    )) {
                standardization.showMessage("warning", "Fechas invalidas", this);
            } else if (standardization.compareDate(dateEnd, dateStart, standardization.currentDate()) < 0) {
                standardization.showMessage("warning", "Fechas invalidas", this);
            } else {

                classEvent.setEventName(txtEvent.getText().trim());
                classEvent.setNicknameCreator(classUsuario.getNickname());
                if (txtGuest.getText().trim().length() >= 10) {
                    classEvent.setQuantityTicket(-1);
                } else {
                    classEvent.setQuantityTicket(Integer.parseInt(txtGuest.getText().trim()));
                }
                classEvent.setPlace(txtPlace.getText().trim());
                classEvent.setProfilePicture(profil);
                classEvent.setCoverPicture(cover);
                new Thread(() -> {
                    if (visibility == 1) {
                        classEvent.setMapImage(standardization.getByte(standardization.getImageMap(txtPlace.getText().trim())));
                    } else {
                        classEvent.setMapImage(null);
                    }
                }).start();
                classEvent.setStartDateTime(txtYearStart.getText() + "-" + (cmbMonthStart.getSelectedIndex() + 1) + "-" + txtDayStart.getText());
                classEvent.setEndDateTime(txtYearEnd.getText() + "-" + (cmbMonthEnd.getSelectedIndex() + 1) + "-" + txtDayEnd.getText());

                standardization.hide(controller.gralEvent);
                controller.addEvents = new AddEventDetails();
                standardization.show(controller.addEvents);
                controller.rootFrame = controller.addEvents;
            }
        } catch (ParseException ex) {
            Logger.getLogger(AddEventInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void txtPlaceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlaceFocusGained
        spPlace.setBackground(Color.RED);

    }//GEN-LAST:event_txtPlaceFocusGained
    private void txtPlaceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlaceFocusLost
        spPlace.setBackground(Color.white);
        if (txtPlace.getText().trim().length() < 4 && !txtPlace.getText().trim().isEmpty()) {
            standardization.showMessage("cancel", "Dirección invalida", this);
            txtPlace.setText("");
        }
    }//GEN-LAST:event_txtPlaceFocusLost

    private void txtPlaceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlaceKeyTyped
        char c = evt.getKeyChar();
        if (txtPlace.getText().length() < 41) {
            if (Character.isLetter(c) || Character.isSpaceChar(c) || Character.isDigit(c)) {
            } else {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtPlaceKeyTyped

    private void txtGuestFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGuestFocusGained
        spNumber.setBackground(Color.red);
    }//GEN-LAST:event_txtGuestFocusGained

    private void txtGuestFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGuestFocusLost
        spNumber.setBackground(Color.white);
        if (controller.member[classUsuario.getIdMemberships() - 1].getNumberGuests() != -1) {
            if (txtGuest.getText().trim().length() > 0) {
                if (Integer.parseInt(txtGuest.getText()) > controller.member[classUsuario.getIdMemberships() - 1].getNumberGuests()) {
                    standardization.showMessage("cancel", "Has sobrepasas el límite de invitados", this);
                    txtGuest.setText("");
                }
            }
        }
    }//GEN-LAST:event_txtGuestFocusLost

    private void txtGuestKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGuestKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtGuestKeyTyped

    private void txtGuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGuestActionPerformed

    private void lblSwitchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSwitchMouseReleased
        if (visibility == 0) {
            visibility = 1;
            switchVisibility();
        } else {
            visibility = 0;
            switchVisibility();
        }
    }//GEN-LAST:event_lblSwitchMouseReleased

    void switchVisibility() {
        switch (visibility) {
            case 0:
                lblStatus.setText(pr.getProperty("InActive"));
                lblStatus.setForeground(new Color(255, 61, 0));
                lblSwitch.setIcon(new controller().changeImage("/imagenes/toggleOff.png", 30, 30));
                break;
            case 1:
                lblStatus.setText(pr.getProperty("Active"));
                lblStatus.setForeground(new Color(139, 195, 74));
                lblSwitch.setIcon(new controller().changeImage("/imagenes/toggleOn.png", 30, 30));
                break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DataGenEventInfo;
    private javax.swing.JLabel Day2EventInfo;
    private javax.swing.JLabel DayEventInfo;
    private javax.swing.JLabel InvitesnumberEventInfo;
    private javax.swing.JLabel InvitesnumberEventInfo1;
    private javax.swing.JLabel Month2EventInfo;
    private javax.swing.JLabel MonthEventInfo;
    private javax.swing.JLabel NameeventlblEventInfo;
    private javax.swing.JLabel SetDatesEventInfo;
    private javax.swing.JLabel Year2EventInfo;
    private javax.swing.JLabel YearEventInfo;
    private javax.swing.JLabel addeventlbl;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNext1;
    private javax.swing.JComboBox<String> cmbMonthEnd;
    private javax.swing.JComboBox<String> cmbMonthStart;
    private javax.swing.JLabel iconEnd;
    private javax.swing.JLabel iconGoogleMaps;
    private javax.swing.JLabel iconGuest;
    private javax.swing.JLabel iconPlace;
    private javax.swing.JLabel iconStart;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblEvent;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblSwitch;
    private javax.swing.JLabel placeeventEventInfo;
    private javax.swing.JSeparator spDayEnd;
    private javax.swing.JSeparator spDayStart;
    private javax.swing.JSeparator spEvent;
    private javax.swing.JSeparator spNumber;
    private javax.swing.JSeparator spPlace;
    private javax.swing.JSeparator spYearEnd;
    private javax.swing.JSeparator spYearStart;
    private javax.swing.JTextField txtDayEnd;
    private javax.swing.JTextField txtDayStart;
    private javax.swing.JTextField txtEvent;
    private javax.swing.JTextField txtGuest;
    private javax.swing.JTextField txtPlace;
    private javax.swing.JTextField txtYearEnd;
    private javax.swing.JTextField txtYearStart;
    // End of variables declaration//GEN-END:variables

}
