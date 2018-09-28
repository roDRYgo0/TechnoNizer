package jFrame;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaClass.classReminder;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.standardization;
import properties.propiedades;

/**
 * @author Alexg
 */
public class addReminderGral extends javax.swing.JFrame {

    byte[] cover;
    byte[] profil;

    void verificaridioma()
    {
    Properties pr=new propiedades(controller.idioma);
    AddReminderGeneralLbl.setText(pr.getProperty("AddReminderGeneralLbl"));
    DataGeneralAddReminder.setText(pr.getProperty("DataGeneralAddReminder"));
    DescriptionReminder.setText(pr.getProperty("DescriptionReminder"));
    DateReminder.setText(pr.getProperty("DateReminder"));
    //day.setText(pr.getProperty("Dayjpedit"));
    //month.setText(pr.getProperty("monthjpedit"));
    //yearR.setText(pr.getProperty("yearjpedit"));
    SaveReminder.setText(pr.getProperty("SaveReminder"));
     cmbMonthEnd.removeAllItems();
            String meses[]={
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
            for(int i=0;i<meses.length;i++)
            {
                cmbMonthEnd.addItem(meses[i]);
                cmbMonthStart.addItem(meses[i]);
            }
    }
    
    public addReminderGral() {
        initComponents();
        verificaridioma();
        loadImage();
    }

    void loadImage() {
        iconStart.setIcon(new controller().changeImage("/imagenes/calendarPlus.png", 35, 35));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        AddReminderGeneralLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnNext1 = new javax.swing.JButton();
        lblEvent = new javax.swing.JLabel();
        DataGeneralAddReminder = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        DateReminder = new javax.swing.JLabel();
        DescriptionReminder = new javax.swing.JLabel();
        spReminder = new javax.swing.JSeparator();
        checkEvent = new javax.swing.JLabel();
        iconStart = new javax.swing.JLabel();
        SaveReminder = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReminder = new javax.swing.JTextArea();
        lblD = new javax.swing.JLabel();
        spDayStart = new javax.swing.JSeparator();
        spYearStart = new javax.swing.JSeparator();
        spYearEnd = new javax.swing.JSeparator();
        txtDayEnd = new javax.swing.JTextField();
        spDayEnd = new javax.swing.JSeparator();
        txtYearEnd = new javax.swing.JTextField();
        Year2EventInfo = new javax.swing.JLabel();
        YearEventInfo = new javax.swing.JLabel();
        txtYearStart = new javax.swing.JTextField();
        txtDayStart = new javax.swing.JTextField();
        DayEventInfo = new javax.swing.JLabel();
        Day2EventInfo = new javax.swing.JLabel();
        Month2EventInfo = new javax.swing.JLabel();
        cmbMonthEnd = new javax.swing.JComboBox<>();
        cmbMonthStart = new javax.swing.JComboBox<>();
        MonthEventInfo = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(428, 540));

        jPanel2.setBackground(new java.awt.Color(35, 150, 243));

        AddReminderGeneralLbl.setForeground(new java.awt.Color(255, 255, 255));
        AddReminderGeneralLbl.setText("Agregar Recordatorio");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Technonizer");

        btnNext1.setBackground(new java.awt.Color(255, 255, 255));
        btnNext1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext1.setForeground(new java.awt.Color(255, 0, 0));
        btnNext1.setText("X");
        btnNext1.setBorderPainted(false);
        btnNext1.setFocusable(false);
        btnNext1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnNext1MouseReleased(evt);
            }
        });
        btnNext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext1ActionPerformed(evt);
            }
        });

        lblEvent.setMaximumSize(new java.awt.Dimension(30, 30));
        lblEvent.setMinimumSize(new java.awt.Dimension(30, 30));
        lblEvent.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddReminderGeneralLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNext1)
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddReminderGeneralLbl)
                .addGap(4, 4, 4))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(btnNext1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        DataGeneralAddReminder.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DataGeneralAddReminder.setText("Datos Generales");

        DateReminder.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DateReminder.setText("Fecha de recordatorio");

        DescriptionReminder.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        DescriptionReminder.setForeground(new java.awt.Color(102, 102, 102));
        DescriptionReminder.setText("Descripción del recordatorio");

        spReminder.setForeground(new java.awt.Color(204, 204, 204));

        checkEvent.setMaximumSize(new java.awt.Dimension(25, 25));
        checkEvent.setMinimumSize(new java.awt.Dimension(25, 25));
        checkEvent.setPreferredSize(new java.awt.Dimension(25, 25));

        iconStart.setMaximumSize(new java.awt.Dimension(35, 35));
        iconStart.setMinimumSize(new java.awt.Dimension(35, 35));
        iconStart.setPreferredSize(new java.awt.Dimension(35, 35));

        SaveReminder.setBackground(new java.awt.Color(0, 153, 255));
        SaveReminder.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SaveReminder.setForeground(new java.awt.Color(255, 255, 255));
        SaveReminder.setText("Guardar");
        SaveReminder.setBorderPainted(false);
        SaveReminder.setFocusable(false);
        SaveReminder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveReminderActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);

        txtReminder.setColumns(20);
        txtReminder.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        txtReminder.setRows(5);
        txtReminder.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(txtReminder);

        lblD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblD.setText("Datos Generales");

        spDayStart.setForeground(new java.awt.Color(204, 204, 204));

        spYearStart.setForeground(new java.awt.Color(204, 204, 204));

        spYearEnd.setForeground(new java.awt.Color(204, 204, 204));

        txtDayEnd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDayEnd.setText("29");
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

        spDayEnd.setForeground(new java.awt.Color(204, 204, 204));

        txtYearEnd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtYearEnd.setText("2018");
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

        YearEventInfo.setText("Año");

        txtYearStart.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtYearStart.setText("2018");
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

        txtDayStart.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDayStart.setText("29");
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

        Day2EventInfo.setText("Día");

        Month2EventInfo.setText("Mes");

        cmbMonthEnd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cmbMonthEnd.setSelectedIndex(8);
        cmbMonthEnd.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        cmbMonthEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMonthEndActionPerformed(evt);
            }
        });

        cmbMonthStart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cmbMonthStart.setSelectedIndex(8);
        cmbMonthStart.setToolTipText("");
        cmbMonthStart.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        cmbMonthStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMonthStartActionPerformed(evt);
            }
        });

        MonthEventInfo.setText("Mes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addComponent(checkEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DateReminder)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
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
                                                    .addComponent(spYearEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(132, 132, 132)
                                .addComponent(iconStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(DescriptionReminder)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(SaveReminder, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73))
                            .addComponent(spReminder)
                            .addComponent(jScrollPane1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DataGeneralAddReminder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblD)
                        .addGap(81, 81, 81))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DataGeneralAddReminder)
                    .addComponent(lblD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DescriptionReminder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(spReminder, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(iconStart, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(93, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DateReminder)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(DayEventInfo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDayStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Day2EventInfo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDayEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1)
                                    .addComponent(spDayEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(spYearEnd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Month2EventInfo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbMonthEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Year2EventInfo)
                                .addGap(12, 12, 12)
                                .addComponent(txtYearEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)))
                        .addGap(1, 1, 1)
                        .addComponent(SaveReminder, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ActionPerformed
       standardization.hide(controller.gralReminder);               
                    technonizer.TechnoNizer.home.pnAgenda1();
                    controller.jpREM.load();
                    controller.rootFrame = technonizer.TechnoNizer.home;      
    }//GEN-LAST:event_btnNext1ActionPerformed

    private void SaveReminderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveReminderActionPerformed
        if (txtReminder.getText().isEmpty() || txtYearEnd.getText().isEmpty() || txtDayEnd.getText().isEmpty()) {
            standardization.showMessage("warning", "Hay campos vacios!", this);
        } else {
            next();
}
            
          
        
    }//GEN-LAST:event_SaveReminderActionPerformed
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

                
                classReminder.setReminder((txtReminder.getText()));
                classReminder.setDatetime((txtDayStart.getText()) + "/" + (cmbMonthStart.getSelectedIndex() + 1)+ "/" +txtYearStart.getText() );
                classReminder.setDatetime1((txtDayEnd.getText()) + "/" + (cmbMonthEnd.getSelectedIndex() + 1)+ "/" +txtYearEnd.getText() );
                classReminder.setNickname(classUsuario.getNickname());
                
                
                if (classReminder.insert()) {
                    classReminder.select();
                    standardization.hide(controller.gralReminder);               
                    technonizer.TechnoNizer.home.pnAgenda1();
                    controller.jpREM.load();
                    controller.rootFrame = technonizer.TechnoNizer.home;
                    standardization.showMessage("ok", "Recordatorio ingresado", technonizer.TechnoNizer.home);
                } else {
                    standardization.showMessage("cancel", "Error ingresado", technonizer.TechnoNizer.home);

                    standardization.hide(controller.gralReminder);
                      
                }
            }
        } catch (ParseException ex) {
            Logger.getLogger(AddEventInfoP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnNext1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNext1MouseReleased
         standardization.hide(controller.gralReminder);
    }//GEN-LAST:event_btnNext1MouseReleased

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

    private void txtYearEndFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtYearEndFocusLost
        spYearEnd.setBackground(Color.white);
    }//GEN-LAST:event_txtYearEndFocusLost

    private void txtYearEndKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYearEndKeyTyped
        char c = evt.getKeyChar();
        if (txtYearEnd.getText().length() > 3 || c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtYearEndKeyTyped

    private void txtYearStartFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtYearStartFocusGained
        spYearStart.setBackground(Color.red);
    }//GEN-LAST:event_txtYearStartFocusGained

    private void txtYearStartFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtYearStartFocusLost
        spYearStart.setBackground(Color.white);
    }//GEN-LAST:event_txtYearStartFocusLost

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

    private void cmbMonthStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMonthStartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMonthStartActionPerformed

    private void cmbMonthEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMonthEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMonthEndActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddReminderGeneralLbl;
    private javax.swing.JLabel DataGeneralAddReminder;
    private javax.swing.JLabel DateReminder;
    private javax.swing.JLabel Day2EventInfo;
    private javax.swing.JLabel DayEventInfo;
    private javax.swing.JLabel DescriptionReminder;
    private javax.swing.JLabel Month2EventInfo;
    private javax.swing.JLabel MonthEventInfo;
    private javax.swing.JButton SaveReminder;
    private javax.swing.JLabel Year2EventInfo;
    private javax.swing.JLabel YearEventInfo;
    private javax.swing.JButton btnNext1;
    private javax.swing.JLabel checkEvent;
    private javax.swing.JComboBox<String> cmbMonthEnd;
    private javax.swing.JComboBox<String> cmbMonthStart;
    private javax.swing.JLabel iconStart;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblD;
    private javax.swing.JLabel lblEvent;
    private javax.swing.JSeparator spDayEnd;
    private javax.swing.JSeparator spDayStart;
    private javax.swing.JSeparator spReminder;
    private javax.swing.JSeparator spYearEnd;
    private javax.swing.JSeparator spYearStart;
    private javax.swing.JTextField txtDayEnd;
    private javax.swing.JTextField txtDayStart;
    private javax.swing.JTextArea txtReminder;
    private javax.swing.JTextField txtYearEnd;
    private javax.swing.JTextField txtYearStart;
    // End of variables declaration//GEN-END:variables

}
