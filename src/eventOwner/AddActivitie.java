package eventOwner;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaClass.classEvent;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.standardization;


/** @author Alexg */

public class AddActivitie extends javax.swing.JFrame {

    int idEvent;
    int visibility;
    int horary;
    
    public AddActivitie(int idEvent){
        initComponents();
        this.idEvent = idEvent;
        visibility = 1;
        horary = 0;
        switchVisibility();
        load();
        txtDescription.setLineWrap(true);
        start.setText(standardization.getDateToString(classEvent.eventosShow.get(idEvent).getStartDateTime(), standardization.getDate(classEvent.eventosShow.get(idEvent).getStartDateTime()), false));
        end.setText(standardization.getDateToString(classEvent.eventosShow.get(idEvent).getEndDateTime(), standardization.getDate(classEvent.eventosShow.get(idEvent).getEndDateTime()), false));
    }   

    void load(){
        iconStart.setIcon(new controller().changeImage("/imagenes/date.png", 35, 35));
        iconClock.setIcon(new controller().changeImage("/imagenes/clock.png", 35, 35));
        iconPlace.setIcon(new controller().changeImage("/imagenes/place.png", 35, 35));
        String[] dateEventStart = classEvent.eventosShow.get(idEvent).getStartDateTime().split("-");
        txtDayStart.setText(dateEventStart[2]);
        cmbMonthStart.setSelectedIndex(Integer.parseInt(dateEventStart[1])-1);
        txtYearStart.setText(dateEventStart[0]);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblAddActivitie = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        lblEvent = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtActivitie = new javax.swing.JTextField();
        spEvent = new javax.swing.JSeparator();
        btnNext1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtPlace = new javax.swing.JTextField();
        spPlace = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        iconPlace = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        lblSwitch = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtHour = new javax.swing.JTextField();
        spHour = new javax.swing.JSeparator();
        txtDayStart2 = new javax.swing.JTextField();
        txtMinute = new javax.swing.JTextField();
        spMinute = new javax.swing.JSeparator();
        btnHorary = new javax.swing.JButton();
        iconClock = new javax.swing.JLabel();
        iconStart = new javax.swing.JLabel();
        spDayStart = new javax.swing.JSeparator();
        cmbMonthStart = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtYearStart = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        spYearStart = new javax.swing.JSeparator();
        txtDayStart = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        start = new javax.swing.JLabel();
        end = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(35, 150, 243));

        lblAddActivitie.setForeground(new java.awt.Color(255, 255, 255));
        lblAddActivitie.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddActivitie.setText("Agregar actividad");

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
                        .addComponent(lblAddActivitie, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAddActivitie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Datos Generales");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Establecer fecha y hora");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Actividad");

        txtActivitie.setAutoscrolls(false);
        txtActivitie.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtActivitie.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtActivitieFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtActivitieFocusLost(evt);
            }
        });
        txtActivitie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtActivitieKeyTyped(evt);
            }
        });

        spEvent.setForeground(new java.awt.Color(204, 204, 204));

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

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Lugar de la actividad");

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

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Descripción");

        iconPlace.setMaximumSize(new java.awt.Dimension(35, 35));
        iconPlace.setMinimumSize(new java.awt.Dimension(35, 35));
        iconPlace.setPreferredSize(new java.awt.Dimension(35, 35));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtDescription.setRows(2);
        txtDescription.setAutoscrolls(false);
        txtDescription.setMaximumSize(new java.awt.Dimension(508, 2147483647));
        txtDescription.setMinimumSize(new java.awt.Dimension(436, 60));
        txtDescription.setPreferredSize(new java.awt.Dimension(436, 60));
        txtDescription.setVerifyInputWhenFocusTarget(false);
        txtDescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescriptionKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtDescription);

        lblSwitch.setMaximumSize(new java.awt.Dimension(30, 30));
        lblSwitch.setMinimumSize(new java.awt.Dimension(30, 30));
        lblSwitch.setPreferredSize(new java.awt.Dimension(30, 30));
        lblSwitch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSwitchMouseReleased(evt);
            }
        });

        lblStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStatus.setText("Activo");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Estado");

        txtHour.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtHour.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHour.setText("8");
        txtHour.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtHour.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHourFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHourFocusLost(evt);
            }
        });
        txtHour.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHourKeyTyped(evt);
            }
        });

        spHour.setForeground(new java.awt.Color(204, 204, 204));

        txtDayStart2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDayStart2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDayStart2.setText(":");
        txtDayStart2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtDayStart2.setFocusable(false);

        txtMinute.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtMinute.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMinute.setText("00");
        txtMinute.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtMinute.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMinuteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMinuteFocusLost(evt);
            }
        });
        txtMinute.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMinuteKeyTyped(evt);
            }
        });

        spMinute.setForeground(new java.awt.Color(204, 204, 204));

        btnHorary.setBackground(new java.awt.Color(255, 255, 255));
        btnHorary.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnHorary.setForeground(new java.awt.Color(51, 51, 51));
        btnHorary.setText("AM");
        btnHorary.setBorderPainted(false);
        btnHorary.setFocusable(false);
        btnHorary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoraryActionPerformed(evt);
            }
        });

        iconClock.setMaximumSize(new java.awt.Dimension(35, 35));
        iconClock.setMinimumSize(new java.awt.Dimension(35, 35));
        iconClock.setPreferredSize(new java.awt.Dimension(35, 35));

        iconStart.setMaximumSize(new java.awt.Dimension(35, 35));
        iconStart.setMinimumSize(new java.awt.Dimension(35, 35));
        iconStart.setPreferredSize(new java.awt.Dimension(35, 35));

        spDayStart.setForeground(new java.awt.Color(204, 204, 204));

        cmbMonthStart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cmbMonthStart.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        jLabel6.setText("Mes");

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

        jLabel8.setText("Año");

        spYearStart.setForeground(new java.awt.Color(204, 204, 204));

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

        jLabel10.setText("Día");

        start.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        start.setText("start");

        end.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        end.setText("start");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Fecha del evento");

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
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(iconPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPlace)
                            .addComponent(spPlace)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(spEvent)
                                .addComponent(txtActivitie, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(iconStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(iconClock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtHour)
                                    .addComponent(spHour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addComponent(txtDayStart2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMinute)
                                    .addComponent(spMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addComponent(btnHorary))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(spDayStart, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDayStart, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(cmbMonthStart, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtYearStart)
                                    .addComponent(jLabel8)
                                    .addComponent(spYearStart, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(125, 125, 125)))
                        .addGap(55, 68, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(end, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel14))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtActivitie, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSwitch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0)
                .addComponent(spEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel7)
                        .addGap(9, 9, 9)
                        .addComponent(iconPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(spPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDayStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(spDayStart, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtYearStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(10, 10, 10))
                                        .addComponent(spYearStart, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmbMonthStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDayStart2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1)
                                        .addComponent(spHour, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnHorary)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(spMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(iconClock, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(start)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(end)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
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

    private void lblSwitchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSwitchMouseReleased
        if(visibility == 0){
            visibility = 1;
            switchVisibility();
        }else{
            visibility = 0;
            switchVisibility();
        }
    }//GEN-LAST:event_lblSwitchMouseReleased

    private void txtPlaceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlaceKeyTyped
        char c = evt.getKeyChar();
        if(txtPlace.getText().length()<41){
            if(Character.isLetter(c) || Character.isSpaceChar(c) || Character.isDigit(c)){}
            else
            evt.consume();
        }else
        evt.consume();
    }//GEN-LAST:event_txtPlaceKeyTyped

    private void txtPlaceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlaceFocusLost
        spPlace.setBackground(Color.white);
        if(txtPlace.getText().trim().length() < 4 && !txtPlace.getText().trim().isEmpty()){
            standardization.showMessage("cancel", "Dirección invalida", this);
            txtPlace.setText("");
        }
    }//GEN-LAST:event_txtPlaceFocusLost

    private void txtPlaceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlaceFocusGained
        spPlace.setBackground(Color.RED);
    }//GEN-LAST:event_txtPlaceFocusGained

    private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ActionPerformed
        if(standardization.validateDate(Integer.parseInt(txtYearStart.getText()), (cmbMonthStart.getSelectedIndex()+1),
                Integer.parseInt(txtDayStart.getText()), false)){
            try {
                String[] dateEventStart = classEvent.eventosShow.get(idEvent).getStartDateTime().split("-");
                String[] dateEventEnd = classEvent.eventosShow.get(idEvent).getEndDateTime().split("-");
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date dateActivity =  sdf.parse(Integer.parseInt(txtYearStart.getText())+"-"+ (cmbMonthStart.getSelectedIndex()+1)+"-"+ Integer.parseInt(txtDayStart.getText()));
                Date dateStart = sdf.parse(Integer.parseInt(dateEventStart[0])+"-"+ (dateEventStart[1])+"-"+ Integer.parseInt(dateEventStart[2]));
                Date dateEnd = sdf.parse(Integer.parseInt(dateEventEnd[0])+"-"+ (dateEventEnd[1])+"-"+ Integer.parseInt(dateEventEnd[2]));
                
                if(standardization.compareDateBefore(dateStart, dateActivity) == 1){
                    standardization.showMessage("warning","Fecha antes del evento", this);
                    
                }else{

                    if(standardization.compareDateAfer(dateEnd, dateActivity) == -1){
                        if(!camposVacios()){
                            String dateTime = txtYearStart.getText()+( ((cmbMonthStart.getSelectedIndex()+1)<10)?"0"+(cmbMonthStart.getSelectedIndex()+1):(cmbMonthStart.getSelectedIndex()+1) )+txtDayStart.getText()
                                    +" "
                                    +txtHour.getText()+":"+txtMinute.getText()+":00 "+((horary == 0)?"AM":"PM");;
                            
                            String activity = txtActivitie.getText();
                            String place = txtPlace.getText();
                            String description = txtDescription.getText();
                            int id = classEvent.eventosShow.get(idEvent).getId();
                            if(classEvent.insertActivitie(dateTime, activity, place, visibility, description, id, classUsuario.getNickname())){
                                classEvent.selectActivity(classEvent.eventosShow.get(idEvent).getId());
                                technonizer.TechnoNizer.home.showEventActivitiesOwner(idEvent);
                                controller.rootFrame = technonizer.TechnoNizer.home;
                                standardization.hide(this);
                                standardization.showMessage("ok","Actividad ingresada", this);
                            }
                            else
                                standardization.showMessage("cancel","No se logro ingresar", this);
                        }else
                            standardization.showMessage("warning","Campos vacios", this);
                    }else{
                        standardization.showMessage("warning","Fecha después del evento", this);
                    }
                }
            } catch (ParseException ex) {
                Logger.getLogger(AddActivitie.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            standardization.showMessage("warning","Fechas invalidas",this);
        }
    }//GEN-LAST:event_btnNext1ActionPerformed

    private void txtActivitieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtActivitieKeyTyped
        char c = evt.getKeyChar();
        if(txtActivitie.getText().length()<41){
            if(Character.isLetter(c) || Character.isSpaceChar(c) || Character.isDigit(c)){}
            else
            evt.consume();
        }else
        evt.consume();
    }//GEN-LAST:event_txtActivitieKeyTyped

    private void txtActivitieFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtActivitieFocusLost
        spEvent.setBackground(Color.white);
        if(txtActivitie.getText().trim().length() < 4 && txtActivitie.getText().trim().length() > 0){
            standardization.showMessage("cancel", "Evento invalido");
            txtActivitie.setText("");
        }
    }//GEN-LAST:event_txtActivitieFocusLost

    private void txtActivitieFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtActivitieFocusGained
        spEvent.setBackground(Color.red);
    }//GEN-LAST:event_txtActivitieFocusGained

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        controller.rootFrame = technonizer.TechnoNizer.home;
        standardization.hide(this);
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtHourFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHourFocusGained
        spHour.setBackground(Color.red);
    }//GEN-LAST:event_txtHourFocusGained

    private void txtHourFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHourFocusLost
        spHour.setBackground(Color.white);
        spHour.setBackground(Color.white);
        if(Integer.parseInt(txtMinute.getText())>12)
            txtHour.setText("");
    }//GEN-LAST:event_txtHourFocusLost

    private void txtHourKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHourKeyTyped
        char c = evt.getKeyChar();
        if(txtHour.getText().length()>1 || c < '0' || c >'9')
            evt.consume();
    }//GEN-LAST:event_txtHourKeyTyped

    private void txtMinuteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMinuteFocusGained
        spMinute.setBackground(Color.red);
    }//GEN-LAST:event_txtMinuteFocusGained

    private void txtMinuteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMinuteFocusLost
        spHour.setBackground(Color.white);
        if(Integer.parseInt(txtMinute.getText())>59)
            txtMinute.setText("");
    }//GEN-LAST:event_txtMinuteFocusLost

    private void txtMinuteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMinuteKeyTyped
        char c = evt.getKeyChar();
        if(txtMinute.getText().length()>1 || c < '0' || c >'9')
            evt.consume();
    }//GEN-LAST:event_txtMinuteKeyTyped

    private void btnHoraryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoraryActionPerformed
        if(horary == 0){
            horary = 1;
            btnHorary.setText("PM");
        }else{
            horary = 0;
            btnHorary.setText("AM");
        }
    }//GEN-LAST:event_btnHoraryActionPerformed

    private void txtDescriptionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescriptionKeyReleased
        
    }//GEN-LAST:event_txtDescriptionKeyReleased

    private void txtYearStartFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtYearStartFocusGained
        spYearStart.setBackground(Color.red);
    }//GEN-LAST:event_txtYearStartFocusGained

    private void txtYearStartFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtYearStartFocusLost
        spYearStart.setBackground(Color.white);
    }//GEN-LAST:event_txtYearStartFocusLost

    private void txtYearStartKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYearStartKeyTyped
        char c = evt.getKeyChar();
        if(txtYearStart.getText().length()>3 || c < '0' || c >'9')
        evt.consume();
    }//GEN-LAST:event_txtYearStartKeyTyped

    private void txtDayStartFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDayStartFocusGained
        spDayStart.setBackground(Color.red);
    }//GEN-LAST:event_txtDayStartFocusGained

    private void txtDayStartFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDayStartFocusLost
        spDayStart.setBackground(Color.white);
    }//GEN-LAST:event_txtDayStartFocusLost

    private void txtDayStartKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDayStartKeyTyped
        char c = evt.getKeyChar();
        if(txtDayStart.getText().length()>1 || c < '0' || c >'9')
        evt.consume();
    }//GEN-LAST:event_txtDayStartKeyTyped

    boolean camposVacios(){
        if(txtActivitie.getText().trim().isEmpty() || txtPlace.getText().trim().isEmpty() || txtDescription.getText().trim().isEmpty()
                || txtDayStart.getText().trim().isEmpty() || txtYearStart.getText().trim().isEmpty() || txtHour.getText().trim().isEmpty()
                || txtMinute.getText().trim().isEmpty() || Integer.parseInt(txtHour.getText())>12 || Integer.parseInt(txtHour.getText()) == 0
                || Integer.parseInt(txtMinute.getText()) > 59)
            return true;
        else
            return false;
    }
    
    void switchVisibility(){
        switch(visibility){
            case 0:
                lblStatus.setText("Inactivo");
                lblStatus.setForeground(new Color(255,61,0));
                lblSwitch.setIcon(new controller().changeImage("/imagenes/toggleOff.png", 30, 30));
                break;
            case 1:
                lblStatus.setText("Activo");
                lblStatus.setForeground(new Color(139, 195, 74));
                lblSwitch.setIcon(new controller().changeImage("/imagenes/toggleOn.png", 30, 30));
                break;
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHorary;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNext1;
    private javax.swing.JComboBox<String> cmbMonthStart;
    private javax.swing.JLabel end;
    private javax.swing.JLabel iconClock;
    private javax.swing.JLabel iconPlace;
    private javax.swing.JLabel iconStart;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAddActivitie;
    private javax.swing.JLabel lblEvent;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblSwitch;
    private javax.swing.JSeparator spDayStart;
    private javax.swing.JSeparator spEvent;
    private javax.swing.JSeparator spHour;
    private javax.swing.JSeparator spMinute;
    private javax.swing.JSeparator spPlace;
    private javax.swing.JSeparator spYearStart;
    private javax.swing.JLabel start;
    private javax.swing.JTextField txtActivitie;
    private javax.swing.JTextField txtDayStart;
    private javax.swing.JTextField txtDayStart2;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtHour;
    private javax.swing.JTextField txtMinute;
    private javax.swing.JTextField txtPlace;
    private javax.swing.JTextField txtYearStart;
    // End of variables declaration//GEN-END:variables

}
