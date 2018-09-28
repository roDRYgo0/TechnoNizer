package jFrame;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaClass.classEvent;
import javaClass.classPersonalE;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.methodsSQL;
import javaClass.standardization;
import javax.swing.JFrame;
import properties.propiedades;

/** @author Alexg */

public class AddEventInfoP1 extends javax.swing.JFrame {

    Properties pr=new propiedades(controller.idioma);
    
    //JFrame event;
    int reminder;
     

    
    
    void verificaridioma()
    {
    addeventlbl.setText(pr.getProperty("addeventlbl"));
    DataGenEventInfo.setText(pr.getProperty("DataGenEventInfo1"));
    NameeventlblEventInfo.setText(pr.getProperty("NameeventlblEventInfo2"));
    placeeventEventInfo.setText(pr.getProperty("placeeventEventInfo3"));
    SetDatesEventInfo.setText(pr.getProperty("SetDatesEventInfo4"));
    btnNext1.setText(pr.getProperty("btnNext1EventInfo5"));
            
            cmbMonthEnd.removeAllItems();
            cmbMonthStart.removeAllItems();
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
                cmbMonthStart.addItem(meses[i]);
                cmbMonthEnd.addItem(meses[i]);
            }
            DayEventInfo.setText(pr.getProperty("DayCreate"));
            MonthEventInfo.setText(pr.getProperty("MonthCreate"));
            YearEventInfo.setText(pr.getProperty("YearCreate"));
            Day2EventInfo.setText(pr.getProperty("DayCreate"));
            Month2EventInfo.setText(pr.getProperty("MonthCreate"));
            Year2EventInfo.setText(pr.getProperty("YearCreate"));
            
            
    }
    
    public AddEventInfoP1( int n ) {
        initComponents();
        //this.event=event;
        verificaridioma();
        loadImage(); 
        reminder=n;
        lblId.setText(classPersonalE.eventos.get(n).getId().toString());
     
    }
    public AddEventInfoP1() {
        initComponents();
        verificaridioma();
        loadImage(); 
        

    }
    
    void loadImage(){
        iconStart.setIcon(new controller().changeImage("/imagenes/calendarPlus.png", 35, 35));
        iconEnd.setIcon(new controller().changeImage("/imagenes/calendarMinus.png", 35, 35));
        iconPlace.setIcon(new controller().changeImage("/imagenes/place.png", 35, 35));
        txtDayStart.setText((standardization.currentDateTime().getDate()+1)+"");
        txtDayEnd.setText((standardization.currentDateTime().getDate()+1)+"");
        cmbMonthStart.setSelectedIndex(standardization.currentDateTime().getMonth());
        cmbMonthEnd.setSelectedIndex(standardization.currentDateTime().getMonth());
        txtYearStart.setText(standardization.currentDateTime().getYear()+"");
        txtYearEnd.setText(standardization.currentDateTime().getYear()+"");
        
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
        checkEvent = new javax.swing.JLabel();
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
        iconGuest = new javax.swing.JLabel();
        iconPlace = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();

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

        checkEvent.setMaximumSize(new java.awt.Dimension(25, 25));
        checkEvent.setMinimumSize(new java.awt.Dimension(25, 25));
        checkEvent.setPreferredSize(new java.awt.Dimension(25, 25));

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

        iconGuest.setMaximumSize(new java.awt.Dimension(35, 35));
        iconGuest.setMinimumSize(new java.awt.Dimension(35, 35));
        iconGuest.setPreferredSize(new java.awt.Dimension(35, 35));

        iconPlace.setMaximumSize(new java.awt.Dimension(35, 35));
        iconPlace.setMinimumSize(new java.awt.Dimension(35, 35));
        iconPlace.setPreferredSize(new java.awt.Dimension(35, 35));

        lblId.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(placeeventEventInfo)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(spEvent)
                        .addComponent(txtEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(spYearEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(NameeventlblEventInfo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(iconGuest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(253, 253, 253)
                        .addComponent(checkEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(DataGenEventInfo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                            .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(iconPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(spPlace)
                                .addComponent(txtPlace, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)))))
                .addGap(0, 50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(DataGenEventInfo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(iconGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SetDatesEventInfo)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(YearEventInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtYearStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
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
                        .addComponent(spYearStart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(18, 18, 18)
                        .addComponent(btnNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
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
        standardization.hide(controller.addEventPer1);
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtEventFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEventFocusGained
        spEvent.setBackground(Color.red);
    }//GEN-LAST:event_txtEventFocusGained

    private void txtEventFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEventFocusLost
        spEvent.setBackground(Color.white);
        if(txtEvent.getText().trim().length() < 4 && txtEvent.getText().trim().length() > 0){
            standardization.showMessage("cancel", "Evento invalido", this);
            txtEvent.setText("");
        } 
    }//GEN-LAST:event_txtEventFocusLost

    private void txtEventKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEventKeyTyped
        char c = evt.getKeyChar();
        if(txtEvent.getText().length()<41){
            if(Character.isLetter(c) || Character.isSpaceChar(c) || Character.isDigit(c)){}
            else
                evt.consume();
        }else
            evt.consume();
    }//GEN-LAST:event_txtEventKeyTyped

    private void txtYearStartFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtYearStartFocusGained
        spYearStart.setBackground(Color.red);
    }//GEN-LAST:event_txtYearStartFocusGained

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

    private void txtDayEndFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDayEndFocusGained
        spDayEnd.setBackground(Color.red);
    }//GEN-LAST:event_txtDayEndFocusGained

    private void txtDayEndFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDayEndFocusLost
        spDayEnd.setBackground(Color.white);
    }//GEN-LAST:event_txtDayEndFocusLost

    private void txtDayEndKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDayEndKeyTyped
        char c = evt.getKeyChar();
        if(txtDayEnd.getText().length()>1 || c < '0' || c >'9')
            evt.consume();
    }//GEN-LAST:event_txtDayEndKeyTyped

    private void txtYearEndFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtYearEndFocusGained
        spYearEnd.setBackground(Color.red);
    }//GEN-LAST:event_txtYearEndFocusGained

    private void txtYearEndKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYearEndKeyTyped
        char c = evt.getKeyChar();
        if(txtYearEnd.getText().length()>3 || c < '0' || c >'9')
        evt.consume();
    }//GEN-LAST:event_txtYearEndKeyTyped

    private void txtYearStartFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtYearStartFocusLost
        spYearStart.setBackground(Color.white);
    }//GEN-LAST:event_txtYearStartFocusLost

    private void txtYearEndFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtYearEndFocusLost
        spYearEnd.setBackground(Color.white);
    }//GEN-LAST:event_txtYearEndFocusLost

    private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ActionPerformed
        if(true){
            if(txtEvent.getText().trim().isEmpty() || txtYearStart.getText().trim().isEmpty() || txtYearEnd.getText().trim().isEmpty() ||
                txtDayStart.getText().trim().isEmpty() || txtDayEnd.getText().trim().isEmpty() ||
                txtPlace.getText().trim().isEmpty() || txtPlace.getText().trim().length() < 4 )
            {
                standardization.showMessage("warning","Hay campos vacios!",this);            
            }else if(methodsSQL.exists("SELECT title FROM personalEvents WHERE title = ? and nickname = ?", txtEvent.getText(),
                    classUsuario.getNickname())){
                standardization.showMessage("warning","Ya hay un evento con ese nombre",this);
            } else{
            next();
            }
           
        }
    }//GEN-LAST:event_btnNext1ActionPerformed

    void next(){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date dateStart =  sdf.parse(Integer.parseInt(txtYearStart.getText())+"-"+ (cmbMonthStart.getSelectedIndex()+1)+"-"+ Integer.parseInt(txtDayStart.getText()));
            Date dateEnd = sdf.parse(Integer.parseInt(txtYearEnd.getText())+"-"+ (cmbMonthEnd.getSelectedIndex()+1)+"-"+ Integer.parseInt(txtDayEnd.getText()));
            
            if(standardization.validateDate(Integer.parseInt(txtYearStart.getText()), (cmbMonthStart.getSelectedIndex()+1), Integer.parseInt(txtDayStart.getText()))&&
                    standardization.validateDate(Integer.parseInt(txtYearEnd.getText()), (cmbMonthEnd.getSelectedIndex()+1), Integer.parseInt(txtDayEnd.getText())
                    ))
                standardization.showMessage("warning","Fechas invalidas",this);
            else if(standardization.compareDate(dateEnd, dateStart, standardization.currentDate()) < 0)
            {
                standardization.showMessage("warning","Fechas invalidas",this);
            }
            else{
                
                classPersonalE.setTitle(txtEvent.getText().trim());
                classPersonalE.setPlace(txtPlace.getText().trim());
                classPersonalE.setNickname(classUsuario.getNickname());
                classPersonalE.setDstart(Integer.parseInt(txtYearStart.getText())+"-"+ (cmbMonthStart.getSelectedIndex()+1)+"-"+ Integer.parseInt(txtDayStart.getText()));
                classPersonalE.setDend(Integer.parseInt(txtYearEnd.getText())+"-"+ (cmbMonthEnd.getSelectedIndex()+1)+"-"+ Integer.parseInt(txtDayEnd.getText()));
                
                standardization.hide(controller.addEventPer);
                controller.addEventsP = new AddEventDetailsP();
                standardization.show(controller.addEventsP);
                controller.rootFrame = controller.addEventsP;
            }
        } catch (ParseException ex) {
            Logger.getLogger(AddEventInfoP1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void txtPlaceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlaceFocusGained
        spPlace.setBackground(Color.RED);
        
    }//GEN-LAST:event_txtPlaceFocusGained
    private void txtPlaceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlaceFocusLost
        spPlace.setBackground(Color.white);
        if(txtPlace.getText().trim().length() < 4 && !txtPlace.getText().trim().isEmpty()){
            standardization.showMessage("cancel", "Dirección invalida", this);
            txtPlace.setText("");
        }            
    }//GEN-LAST:event_txtPlaceFocusLost

    private void txtPlaceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlaceKeyTyped
        char c = evt.getKeyChar();
        if(txtPlace.getText().length()<80){
            if(Character.isLetter(c) || Character.isSpaceChar(c) || Character.isDigit(c)){}
            else
                evt.consume();
        }else
            evt.consume();
    }//GEN-LAST:event_txtPlaceKeyTyped

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DataGenEventInfo;
    private javax.swing.JLabel Day2EventInfo;
    private javax.swing.JLabel DayEventInfo;
    private javax.swing.JLabel Month2EventInfo;
    private javax.swing.JLabel MonthEventInfo;
    private javax.swing.JLabel NameeventlblEventInfo;
    private javax.swing.JLabel SetDatesEventInfo;
    private javax.swing.JLabel Year2EventInfo;
    private javax.swing.JLabel YearEventInfo;
    private javax.swing.JLabel addeventlbl;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNext1;
    private javax.swing.JLabel checkEvent;
    private javax.swing.JComboBox<String> cmbMonthEnd;
    private javax.swing.JComboBox<String> cmbMonthStart;
    private javax.swing.JLabel iconEnd;
    private javax.swing.JLabel iconGuest;
    private javax.swing.JLabel iconPlace;
    private javax.swing.JLabel iconStart;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblEvent;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel placeeventEventInfo;
    private javax.swing.JSeparator spDayEnd;
    private javax.swing.JSeparator spDayStart;
    private javax.swing.JSeparator spEvent;
    private javax.swing.JSeparator spPlace;
    private javax.swing.JSeparator spYearEnd;
    private javax.swing.JSeparator spYearStart;
    private javax.swing.JTextField txtDayEnd;
    private javax.swing.JTextField txtDayStart;
    private javax.swing.JTextField txtEvent;
    private javax.swing.JTextField txtPlace;
    private javax.swing.JTextField txtYearEnd;
    private javax.swing.JTextField txtYearStart;
    // End of variables declaration//GEN-END:variables

}
