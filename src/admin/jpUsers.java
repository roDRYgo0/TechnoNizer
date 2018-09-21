package admin;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javaClass.classAdmin;
import javaClass.controller;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javaClass.connection;
import javaClass.standardization;
import javaClass.user;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


/**@author rodri */

public class jpUsers extends javax.swing.JPanel {

    int view;
    
    boolean find = false;
    boolean firstName = false;
    boolean lastName = false;
    boolean email = false;
    boolean gender = false;
    boolean birthDate = false;
    
    public jpUsers() {
        initComponents();
        view = 0;
        
        load();
    }

    void load(){
        insertarPaneles(classAdmin.users.size(), false);
        cargarComboBox();
        loadImage();
        actionFilter();
    }
    
    void loadImage(){
        tbnFilter.setIcon(new controller().changeImage("/imagenes/filter.png", 42, 42));
        tbnMail.setIcon(new controller().changeImage("/imagenes/email.png", 40, 40));
        tbnBirthdate.setIcon(new controller().changeImage("/imagenes/birthday.png", 40, 40));
        tbnGender.setIcon(new controller().changeImage("/imagenes/gender.png", 40, 40));
        iconSearch.setIcon(new controller().changeImage("/imagenes/search.png", 35, 35));
        iconView.setIcon(new controller().changeImage("/imagenes/viewList.png", 50, 50));
        iconReport.setIcon(new controller().changeImage("/imagenes/report.png", 50, 50));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollUsers = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        tbnFilter = new javax.swing.JToggleButton();
        pnFilter = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        spName = new javax.swing.JSeparator();
        txtLastName = new javax.swing.JTextField();
        spLastName = new javax.swing.JSeparator();
        tbnFirstName = new javax.swing.JToggleButton();
        tbnLastName = new javax.swing.JToggleButton();
        tbnMail = new javax.swing.JToggleButton();
        txtMail = new javax.swing.JTextField();
        spMail = new javax.swing.JSeparator();
        tbnBirthdate = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        txtDiaStart = new javax.swing.JTextField();
        spDayStart = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        cmbMesStart = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtAnioStart = new javax.swing.JTextField();
        spYearStart = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDiaEnd = new javax.swing.JTextField();
        spDayEnd = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        cmbMesEnd = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtAnioEnd = new javax.swing.JTextField();
        spYearEnd = new javax.swing.JSeparator();
        tbnGender = new javax.swing.JToggleButton();
        cmbGender = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        spSearch = new javax.swing.JSeparator();
        iconSearch = new javax.swing.JLabel();
        iconView = new javax.swing.JLabel();
        iconReport = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(980, 601));
        setMinimumSize(new java.awt.Dimension(980, 601));

        scrollUsers.setBackground(new java.awt.Color(255, 255, 255));
        scrollUsers.setBorder(null);
        scrollUsers.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Inicio");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))))));

        tbnFilter.setBackground(new java.awt.Color(255, 255, 255));
        tbnFilter.setText("Filtrar");
        tbnFilter.setBorder(null);
        tbnFilter.setFocusPainted(false);
        tbnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnFilterActionPerformed(evt);
            }
        });

        pnFilter.setBackground(new java.awt.Color(255, 255, 255));

        txtName.setAutoscrolls(false);
        txtName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        spName.setForeground(new java.awt.Color(204, 204, 204));

        txtLastName.setAutoscrolls(false);
        txtLastName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtLastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLastNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLastNameFocusLost(evt);
            }
        });
        txtLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLastNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLastNameKeyTyped(evt);
            }
        });

        spLastName.setForeground(new java.awt.Color(204, 204, 204));

        tbnFirstName.setBackground(new java.awt.Color(255, 255, 255));
        tbnFirstName.setText("Nombres");
        tbnFirstName.setBorder(null);
        tbnFirstName.setFocusPainted(false);
        tbnFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnFirstNameActionPerformed(evt);
            }
        });

        tbnLastName.setBackground(new java.awt.Color(255, 255, 255));
        tbnLastName.setText("Apellidos");
        tbnLastName.setBorder(null);
        tbnLastName.setFocusPainted(false);
        tbnLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnLastNameActionPerformed(evt);
            }
        });

        tbnMail.setBackground(new java.awt.Color(255, 255, 255));
        tbnMail.setText("Correo");
        tbnMail.setBorder(null);
        tbnMail.setFocusPainted(false);
        tbnMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnMailActionPerformed(evt);
            }
        });

        txtMail.setAutoscrolls(false);
        txtMail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtMail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMailFocusLost(evt);
            }
        });
        txtMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMailKeyTyped(evt);
            }
        });

        spMail.setForeground(new java.awt.Color(204, 204, 204));

        tbnBirthdate.setBackground(new java.awt.Color(255, 255, 255));
        tbnBirthdate.setText("Cumpleaños");
        tbnBirthdate.setBorder(null);
        tbnBirthdate.setFocusPainted(false);
        tbnBirthdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnBirthdateActionPerformed(evt);
            }
        });

        jLabel5.setText("Día");

        txtDiaStart.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDiaStart.setText("12");
        txtDiaStart.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtDiaStart.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDiaStartFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDiaStartFocusLost(evt);
            }
        });
        txtDiaStart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiaStartKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiaStartKeyTyped(evt);
            }
        });

        spDayStart.setForeground(new java.awt.Color(204, 204, 204));

        jLabel6.setText("Mes");

        cmbMesStart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cmbMesStart.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        cmbMesStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMesStartActionPerformed(evt);
            }
        });

        jLabel8.setText("Año");

        txtAnioStart.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAnioStart.setText("2000");
        txtAnioStart.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtAnioStart.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAnioStartFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAnioStartFocusLost(evt);
            }
        });
        txtAnioStart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnioStartKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnioStartKeyTyped(evt);
            }
        });

        spYearStart.setForeground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel2.setText("hasta");

        jLabel7.setText("Día");

        txtDiaEnd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDiaEnd.setText("12");
        txtDiaEnd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtDiaEnd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDiaEndFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDiaEndFocusLost(evt);
            }
        });
        txtDiaEnd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiaEndKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiaEndKeyTyped(evt);
            }
        });

        spDayEnd.setForeground(new java.awt.Color(204, 204, 204));

        jLabel9.setText("Mes");

        cmbMesEnd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cmbMesEnd.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        cmbMesEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMesEndActionPerformed(evt);
            }
        });

        jLabel10.setText("Año");

        txtAnioEnd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAnioEnd.setText("2000");
        txtAnioEnd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtAnioEnd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAnioEndFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAnioEndFocusLost(evt);
            }
        });
        txtAnioEnd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnioEndKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnioEndKeyTyped(evt);
            }
        });

        spYearEnd.setForeground(new java.awt.Color(204, 204, 204));

        tbnGender.setBackground(new java.awt.Color(255, 255, 255));
        tbnGender.setText("Género");
        tbnGender.setBorder(null);
        tbnGender.setFocusPainted(false);
        tbnGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnGenderActionPerformed(evt);
            }
        });

        cmbGender.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbGender.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbGenderItemStateChanged(evt);
            }
        });
        cmbGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnFilterLayout = new javax.swing.GroupLayout(pnFilter);
        pnFilter.setLayout(pnFilterLayout);
        pnFilterLayout.setHorizontalGroup(
            pnFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFilterLayout.createSequentialGroup()
                .addGroup(pnFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFilterLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(pnFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnFilterLayout.createSequentialGroup()
                                .addComponent(tbnFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName)
                                    .addComponent(spName, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnFilterLayout.createSequentialGroup()
                                .addComponent(tbnLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLastName)
                                    .addComponent(spLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(29, 29, 29)
                        .addGroup(pnFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tbnMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tbnGender, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMail, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(spMail)
                            .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnFilterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tbnBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(pnFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(pnFilterLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(pnFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spDayStart, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDiaStart, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(cmbMesStart, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAnioStart)
                            .addComponent(jLabel8)
                            .addComponent(spYearStart, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(pnFilterLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(pnFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spDayEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDiaEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(cmbMesEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAnioEnd)
                            .addComponent(jLabel10)
                            .addComponent(spYearEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        pnFilterLayout.setVerticalGroup(
            pnFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFilterLayout.createSequentialGroup()
                .addGroup(pnFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFilterLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(pnFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tbnFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnFilterLayout.createSequentialGroup()
                                .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(spMail, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnFilterLayout.createSequentialGroup()
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(spName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFilterLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(tbnMail, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnFilterLayout.createSequentialGroup()
                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(spLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tbnLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tbnGender, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbnBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnFilterLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDiaStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(spDayStart, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(spYearStart, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(pnFilterLayout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtAnioEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(10, 10, 10))
                                        .addComponent(spYearEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnFilterLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDiaEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(spDayEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(pnFilterLayout.createSequentialGroup()
                                    .addGroup(pnFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(pnFilterLayout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(pnFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtAnioStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2)))
                                        .addGroup(pnFilterLayout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cmbMesEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(10, 10, 10))))
                        .addGroup(pnFilterLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmbMesStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10))))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tbnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(pnFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtSearch.setAutoscrolls(false);
        txtSearch.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchFocusLost(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Buscar por nombre de usuario");

        spSearch.setForeground(new java.awt.Color(204, 204, 204));

        iconSearch.setMaximumSize(new java.awt.Dimension(35, 35));
        iconSearch.setMinimumSize(new java.awt.Dimension(35, 35));
        iconSearch.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearch)
                    .addComponent(spSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(spSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iconSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        iconView.setMaximumSize(new java.awt.Dimension(50, 50));
        iconView.setMinimumSize(new java.awt.Dimension(50, 50));
        iconView.setPreferredSize(new java.awt.Dimension(50, 50));
        iconView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                iconViewMouseReleased(evt);
            }
        });

        iconReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/report.png"))); // NOI18N
        iconReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                iconReportMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel1)
                                        .addGap(53, 53, 53)
                                        .addComponent(iconView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(iconReport, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addComponent(scrollUsers, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(iconView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconReport, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusGained
        spSearch.setBackground(Color.red);
    }//GEN-LAST:event_txtSearchFocusGained

    private void txtSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusLost
        spSearch.setBackground(Color.white);
    }//GEN-LAST:event_txtSearchFocusLost

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed

    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE && txtSearch.getText().trim().isEmpty() || evt.getKeyCode() == KeyEvent.VK_DELETE && txtSearch.getText().trim().isEmpty()){
            find = false;
            if(anySearch() > 0){
                search(1);
                search(anySearch());
            }
            else
                insertarPaneles(classAdmin.users.size(), false);
        }
        else if(evt.getKeyCode() == KeyEvent.VK_DELETE && txtSearch.getText().length() == 0 || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE && txtSearch.getText().length() == 0){
            find = false;
            if(anySearch() > 0){
                search(1);
                search(anySearch());
            }
            else
                insertarPaneles(classAdmin.users.size(), false);
        }
        else{
            find = false;
            search(1);
            find = true;
            search(anySearch());
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    int anySearch(){
        int t = 0;
        if(find)
            t++;
        if(firstName)
            t++;
        if(lastName)
            t++;
        if(email)
            t++;
        if(gender)
            t++;
        if(birthDate)
            t++;
        return t;
    }
    
    void search(int anySearch){
        
        if(find){   
            List<user> d = (anySearch <= 1) ? classAdmin.users:classAdmin.usersSearch;
            if(anySearch <= 1)
                classAdmin.usersSearch.clear();
            else if(anySearch >= 2){
                List <user> usersSearchAdd = new <user> ArrayList(classAdmin.usersSearch);
                classAdmin.usersSearch.clear();
                d= usersSearchAdd;
            }
            for(javaClass.user e : d){
                if(e.getNickname().toLowerCase().contains(txtSearch.getText().toLowerCase())){
                    classAdmin.usersSearch.add(e);
                }
            }
        }
        
        if(firstName){
            List<user> d = (anySearch <= 1) ? classAdmin.users:classAdmin.usersSearch;
            if(anySearch <= 1)
                classAdmin.usersSearch.clear();
            else if(anySearch >= 2){
                List <user> usersSearchAdd = new <user> ArrayList(classAdmin.usersSearch);
                classAdmin.usersSearch.clear();
                d= usersSearchAdd;
            }
            for(javaClass.user e : d){
                if(e.getFirstName().toLowerCase().contains(txtName.getText().toLowerCase()))
                    classAdmin.usersSearch.add(e);
            }
        }
        
        if(lastName){
            List<user> d = (anySearch <= 1) ? classAdmin.users:classAdmin.usersSearch;
            if(anySearch <= 1)
                classAdmin.usersSearch.clear();
            else if(anySearch >= 2){
                List <user> usersSearchAdd = new <user> ArrayList(classAdmin.usersSearch);
                classAdmin.usersSearch.clear();
                d= usersSearchAdd;
            }
            for(javaClass.user e : d){
                if(e.getLastName().toLowerCase().contains(txtLastName.getText().toLowerCase()))
                    classAdmin.usersSearch.add(e);
     
            }
        }
        
        if(email){
            List<user> d = (anySearch <= 1) ? classAdmin.users:classAdmin.usersSearch;
            if(anySearch <= 1)
                classAdmin.usersSearch.clear();
            else if(anySearch >= 2){
                List <user> usersSearchAdd = new <user> ArrayList(classAdmin.usersSearch);
                classAdmin.usersSearch.clear();
                d= usersSearchAdd;
            }
            for(javaClass.user e : d){
                if(e.getMail().toLowerCase().contains(txtMail.getText().toLowerCase()))
                    classAdmin.usersSearch.add(e);
            }
        }
        
        if(gender){
            List<user> d = (anySearch <= 1) ? classAdmin.users:classAdmin.usersSearch;
            if(anySearch <= 1)
                classAdmin.usersSearch.clear();
            else if(anySearch >= 2){
                List <user> usersSearchAdd = new <user> ArrayList(classAdmin.usersSearch);
                classAdmin.usersSearch.clear();
                d= usersSearchAdd;
            }
            for(javaClass.user e : d){
                if(e.getGender().equals(cmbGender.getSelectedItem()))
                    classAdmin.usersSearch.add(e);
            }
        }
        
        if(birthDate){
            List<user> d = (anySearch == 1) ? classAdmin.users:classAdmin.usersSearch;
            if(anySearch > 0)
                classAdmin.usersSearch.clear();
            for(javaClass.user e : d){
                String[]date = e.getBirthdate().split("-");
                Date myDate = new Date(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
                Date startDate = new Date(Integer.parseInt(txtAnioStart.getText()),cmbMesStart.getSelectedIndex()+1 , Integer.parseInt(txtDiaStart.getText()));
                Date endDate = new Date(Integer.parseInt(txtAnioEnd.getText()),cmbMesEnd.getSelectedIndex()+1 , Integer.parseInt(txtDiaEnd.getText()));
                if(myDate.compareTo(endDate) == -1 || myDate.compareTo(endDate) == 0){
                    if(startDate.compareTo(myDate) == -1 || startDate.compareTo(myDate) == 0)
                        classAdmin.usersSearch.add(e);
                }
            }
        }
        if(anySearch == 0)
            insertarPaneles(classAdmin.users.size(), false);
        else
            insertarPaneles(classAdmin.usersSearch.size(), true);
    }
    
    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        char c = evt.getKeyChar();
        if(txtSearch.getText().length()<41){
            if(Character.isLetter(c) || Character.isDigit(c)){}
            else{
                if(c != '.')
                    evt.consume();
            }
        }else
            evt.consume();
    }//GEN-LAST:event_txtSearchKeyTyped

    private void iconViewMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconViewMouseReleased
        if(view == 0){
            view = 1;
            iconView.setIcon(new controller().changeImage("/imagenes/viewGrid.png", 50, 50));
            if(txtSearch.getText().trim().isEmpty())
                insertarPaneles(classAdmin.users.size(), false);
            else
                search(anySearch());
        }else{
            view = 0;
            iconView.setIcon(new controller().changeImage("/imagenes/viewList.png", 50, 50));
            if(txtSearch.getText().trim().isEmpty())
                insertarPaneles(classAdmin.users.size(), false);
            else
                search(anySearch());
        }
    }//GEN-LAST:event_iconViewMouseReleased

    private void iconReportMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconReportMouseReleased
       String path="";
        try{
            File file = new File("usuarios.jasper");
            Map parametros = new HashMap();

            InputStream reportStream = new FileInputStream("usuarios.jrxml");
            JasperReport jr=(JasperReport)JRLoader.loadObject(file);
            Connection cn= connection.getConnection();
            JasperPrint print =JasperFillManager.fillReport(jr,parametros,cn);
            JasperViewer view = new JasperViewer(print);
            view.setTitle("Reporte");
            view.setVisible(true);
            
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_iconReportMouseReleased

    private void tbnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnFilterActionPerformed
        actionFilter();
        search(anySearch());
    }//GEN-LAST:event_tbnFilterActionPerformed

    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained
        spName.setBackground(Color.red);
    }//GEN-LAST:event_txtNameFocusGained

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        spName.setBackground(Color.white);
    }//GEN-LAST:event_txtNameFocusLost

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        char c = evt.getKeyChar();
        if(txtName.getText().length()<41){
            if(Character.isLetter(c) || Character.isSpaceChar(c)){}
            else
                evt.consume();
        }else
            evt.consume();
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtLastNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastNameFocusGained
        spLastName.setBackground(Color.red);
    }//GEN-LAST:event_txtLastNameFocusGained

    private void txtLastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastNameFocusLost
        spLastName.setBackground(Color.white);
    }//GEN-LAST:event_txtLastNameFocusLost

    private void txtLastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameKeyTyped
        char c = evt.getKeyChar();
        if(txtLastName.getText().length()<41){
            if(Character.isLetter(c) || Character.isSpaceChar(c)){}
            else
                evt.consume();
        }else
            evt.consume();
    }//GEN-LAST:event_txtLastNameKeyTyped

    private void txtMailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMailFocusGained
        spMail.setBackground(Color.red);
    }//GEN-LAST:event_txtMailFocusGained

    private void txtMailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMailFocusLost
        spMail.setBackground(Color.white);
    }//GEN-LAST:event_txtMailFocusLost

    private void txtMailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMailKeyTyped
        char c = evt.getKeyChar();
        if(c == ' ')
            evt.consume();
    }//GEN-LAST:event_txtMailKeyTyped

    private void txtDiaStartFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiaStartFocusGained
        spDayStart.setForeground(Color.red);
    }//GEN-LAST:event_txtDiaStartFocusGained

    private void txtDiaStartFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiaStartFocusLost
        spDayStart.setForeground(Color.white);
        if(Integer.parseInt(txtDiaStart.getText())>31){
            standardization.showMessage("error", "Numero de dias invalido");
            txtDiaStart.setText("");
        }
    }//GEN-LAST:event_txtDiaStartFocusLost

    private void txtDiaStartKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiaStartKeyTyped
        char c = evt.getKeyChar();
        if(txtDiaStart.getText().length()>1 || c < '0' || c >'9')
        evt.consume();
    }//GEN-LAST:event_txtDiaStartKeyTyped

    private void txtAnioStartFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAnioStartFocusGained
        spYearStart.setBackground(Color.red);
    }//GEN-LAST:event_txtAnioStartFocusGained

    private void txtAnioStartKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnioStartKeyTyped
        char c = evt.getKeyChar();
        if(txtAnioStart.getText().length()>3 || c < '0' || c >'9')
        evt.consume();
    }//GEN-LAST:event_txtAnioStartKeyTyped

    private void txtDiaEndFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiaEndFocusGained
        spDayEnd.setBackground(Color.red);
    }//GEN-LAST:event_txtDiaEndFocusGained

    private void txtDiaEndFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiaEndFocusLost
        spDayEnd.setBackground(Color.white);
        if(Integer.parseInt(txtDiaEnd.getText())>31){
            standardization.showMessage("error", "Numero de dias invalido");
            txtDiaEnd.setText("");
        }
    }//GEN-LAST:event_txtDiaEndFocusLost

    private void txtDiaEndKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiaEndKeyTyped
        char c = evt.getKeyChar();
        if(txtDiaStart.getText().length()>1 || c < '0' || c >'9')
        evt.consume();
    }//GEN-LAST:event_txtDiaEndKeyTyped

    private void txtAnioEndFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAnioEndFocusGained
        spYearEnd.setBackground(Color.red);
    }//GEN-LAST:event_txtAnioEndFocusGained

    private void txtAnioEndKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnioEndKeyTyped
        char c = evt.getKeyChar();
        if(txtAnioStart.getText().length()>3 || c < '0' || c >'9')
        evt.consume();
    }//GEN-LAST:event_txtAnioEndKeyTyped

    private void txtAnioStartFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAnioStartFocusLost
        spYearStart.setBackground(Color.white);
    }//GEN-LAST:event_txtAnioStartFocusLost

    private void txtAnioEndFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAnioEndFocusLost
        spYearEnd.setBackground(Color.white);
    }//GEN-LAST:event_txtAnioEndFocusLost

    private void tbnFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnFirstNameActionPerformed
        firstName = false;
        search(anySearch());
        filter();
    }//GEN-LAST:event_tbnFirstNameActionPerformed

    private void tbnGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnGenderActionPerformed
        gender = false;
        search(1);
        search(anySearch());
        filter();
    }//GEN-LAST:event_tbnGenderActionPerformed

    private void tbnBirthdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnBirthdateActionPerformed
        birthDate = false;
        search(1);
        search(anySearch());
        filter();
    }//GEN-LAST:event_tbnBirthdateActionPerformed

    private void tbnMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnMailActionPerformed
        email = false;
        search(anySearch());
        filter();
    }//GEN-LAST:event_tbnMailActionPerformed

    private void tbnLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnLastNameActionPerformed
        lastName = false;
        search(anySearch());
        filter();
    }//GEN-LAST:event_tbnLastNameActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        if(tbnFirstName.isSelected()){
            if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE && txtName.getText().trim().isEmpty() || evt.getKeyCode() == KeyEvent.VK_DELETE && txtName.getText().trim().isEmpty()){
                firstName = false;
                if(anySearch() > 0){
                    search(1);
                    search(anySearch());
                }
                else
                    insertarPaneles(classAdmin.users.size(), false);
            }
            else if(evt.getKeyCode() == KeyEvent.VK_DELETE && txtName.getText().length() == 0 || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE && txtName.getText().length() == 0){
                firstName = false;
                if(anySearch() > 0){
                    search(1);
                    search(anySearch());
            }
                else
                    insertarPaneles(classAdmin.users.size(), false);
            }
            else{
                firstName = false;
                search(1);
                firstName = true;
                search(anySearch());
            }
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtLastNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameKeyReleased
        if(tbnLastName.isSelected()){
            if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE && txtLastName.getText().trim().isEmpty() || evt.getKeyCode() == KeyEvent.VK_DELETE && txtLastName.getText().trim().isEmpty()){
                lastName = false;
                if(anySearch() > 0)
                {
                    search(1);
                    search(anySearch());
                }
                else
                    insertarPaneles(classAdmin.users.size(), false);
            }
            else if(evt.getKeyCode() == KeyEvent.VK_DELETE && txtLastName.getText().length() == 0 || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE && txtLastName.getText().length() == 0){
                lastName = false;
                if(anySearch() > 0){
                    search(1);
                    search(anySearch());
                }
                else
                    insertarPaneles(classAdmin.users.size(), false);
            }
            else{
                lastName = false;
                search(1);
                lastName = true;
                search(anySearch());
            }
        }
    }//GEN-LAST:event_txtLastNameKeyReleased

    private void txtMailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMailKeyReleased
        if(tbnMail.isSelected()){
            if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE && txtMail.getText().trim().isEmpty() || evt.getKeyCode() == KeyEvent.VK_DELETE && txtMail.getText().trim().isEmpty()){
                email = false;
                if(anySearch() > 0)
                {
                    search(1);
                    search(anySearch());
                }
                else
                    insertarPaneles(classAdmin.users.size(), false);
            }
            else if(evt.getKeyCode() == KeyEvent.VK_DELETE && txtMail.getText().length() == 0 || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE && txtMail.getText().length() == 0){
                email = false;
                if(anySearch() > 0){
                    search(1);
                    search(anySearch());
                }
                else
                    insertarPaneles(classAdmin.users.size(), false);
            }
            else{
                email = false;
                search(1);
                email = true;
                search(anySearch());
            }
        }
    }//GEN-LAST:event_txtMailKeyReleased

    private void cmbGenderItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbGenderItemStateChanged
    }//GEN-LAST:event_cmbGenderItemStateChanged

    private void cmbGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGenderActionPerformed
        if(tbnGender.isSelected()){
            if(cmbGender.getSelectedIndex() == -1){
                gender = false;
                if(anySearch() > 0)
                {
                    search(1);
                    search(anySearch());
                }
                else
                    insertarPaneles(classAdmin.users.size(), false);
            }
            else{
                gender = false;
                search(1);
                gender = true;
                search(anySearch());
            }
        }
    }//GEN-LAST:event_cmbGenderActionPerformed

    private void txtDiaStartKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiaStartKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaStartKeyReleased

    private void cmbMesStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMesStartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMesStartActionPerformed

    private void txtAnioStartKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnioStartKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnioStartKeyReleased

    private void txtDiaEndKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiaEndKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaEndKeyReleased

    private void cmbMesEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMesEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMesEndActionPerformed

    private void txtAnioEndKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnioEndKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnioEndKeyReleased

    void actionFilter(){
        if(tbnFilter.isSelected()){
            enable();
        }else{
            disable();
        }
    }
    
    public void disable(){
        tbnFirstName.setSelected(false);
        tbnLastName.setSelected(false);
        tbnMail.setSelected(false);
        tbnGender.setSelected(false);
        tbnBirthdate.setSelected(false);
        
        tbnFirstName.setEnabled(false);
        tbnLastName.setEnabled(false);
        tbnMail.setEnabled(false);
        tbnGender.setEnabled(false);
        tbnBirthdate.setEnabled(false);
        
        firstName = false;
        lastName = false;
        email = false;
        gender = false;
        birthDate = false;
        
        filter();
    }
    
    public void enable(){
        tbnFirstName.setEnabled(true);
        tbnLastName.setEnabled(true);
        tbnMail.setEnabled(true);
        tbnGender.setEnabled(true);
        tbnBirthdate.setEnabled(true);
        
        filter();
    }
    
    public void filter(){
        if(tbnFirstName.isSelected())
            txtName.setEnabled(true);
        else{
            txtName.setEnabled(false);
            txtName.setBackground(Color.white);
            txtName.setText("");
        }
        
        if(tbnLastName.isSelected())
            txtLastName.setEnabled(true);
        else{
            txtLastName.setEnabled(false);
            txtLastName.setBackground(Color.white);
            txtLastName.setText("");
        }
        
        if(tbnMail.isSelected())
            txtMail.setEnabled(true);
        else{
            txtMail.setEnabled(false);
            txtMail.setBackground(Color.white);
            txtMail.setText("");
        }
        
        if(tbnGender.isSelected())
            cmbGender.setEnabled(true);
        else{
            cmbGender.setEnabled(false);
            cmbGender.setSelectedIndex(-1);
        }
        
        if(tbnBirthdate.isSelected()){
            standardization.setNowDate(txtDiaStart, cmbMesStart, txtAnioStart);
            standardization.setNowDate(txtDiaEnd, cmbMesEnd, txtAnioEnd);
            txtDiaStart.setEnabled(true);
            txtDiaEnd.setEnabled(true);
            txtAnioStart.setEnabled(true);
            txtAnioEnd.setEnabled(true);
            cmbMesStart.setEnabled(true);
            cmbMesEnd.setEnabled(true);
        }            
        else{
            txtDiaStart.setEnabled(false);
            txtDiaEnd.setEnabled(false);
            txtAnioStart.setEnabled(false);
            txtAnioEnd.setEnabled(false);
            txtDiaStart.setBackground(Color.white);
            txtDiaEnd.setBackground(Color.white);
            txtAnioStart.setBackground(Color.white);
            txtAnioEnd.setBackground(Color.white);
            cmbMesStart.setEnabled(false);
            cmbMesEnd.setEnabled(false);
            txtDiaStart.setText("");
            txtDiaEnd.setText("");
            txtAnioStart.setText("");
            txtAnioEnd.setText("");
            cmbMesStart.setSelectedIndex(-1);
            cmbMesEnd.setSelectedIndex(-1);
        }
    }
    
    public void insertarPaneles(int paneles, boolean search){
        if(search){
            allUsers allUsers = new allUsers(paneles, search, view);
            allUsers.setLocation(0,0);
            if(view == 0)
                allUsers.setPreferredSize(new Dimension(960, 348+(168*classAdmin.getSpaceSearchGrid())));
            else
                allUsers.setPreferredSize(new Dimension(960, 348+(168*classAdmin.getSpaceSearchList())));

            scrollUsers.setViewportView(allUsers);
            scrollUsers.revalidate();
            scrollUsers.repaint();
        }else{
            allUsers allUsers = new allUsers(paneles, search, view);
            allUsers.setLocation(0,0);

            if(view == 0)
                allUsers.setPreferredSize(new Dimension(960, 348+(168*classAdmin.getSpaceAllGrid())));
            else
                allUsers.setPreferredSize(new Dimension(960, 348+(168*classAdmin.getSpaceAllList())));

            scrollUsers.setViewportView(allUsers);
            scrollUsers.revalidate();
            scrollUsers.repaint();
        }

    }
    
    public void cargarComboBox(){
        for(int i = 0; i<controller.genders.size(); i++)
            cmbGender.addItem(controller.genders.get(i).getGender());
        cmbGender.setSelectedIndex(-1);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JComboBox<String> cmbMesEnd;
    private javax.swing.JComboBox<String> cmbMesStart;
    private javax.swing.JLabel iconReport;
    private javax.swing.JLabel iconSearch;
    private javax.swing.JLabel iconView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel pnFilter;
    private javax.swing.JScrollPane scrollUsers;
    private javax.swing.JSeparator spDayEnd;
    private javax.swing.JSeparator spDayStart;
    private javax.swing.JSeparator spLastName;
    private javax.swing.JSeparator spMail;
    private javax.swing.JSeparator spName;
    private javax.swing.JSeparator spSearch;
    private javax.swing.JSeparator spYearEnd;
    private javax.swing.JSeparator spYearStart;
    private javax.swing.JToggleButton tbnBirthdate;
    private javax.swing.JToggleButton tbnFilter;
    private javax.swing.JToggleButton tbnFirstName;
    private javax.swing.JToggleButton tbnGender;
    private javax.swing.JToggleButton tbnLastName;
    private javax.swing.JToggleButton tbnMail;
    private javax.swing.JTextField txtAnioEnd;
    private javax.swing.JTextField txtAnioStart;
    private javax.swing.JTextField txtDiaEnd;
    private javax.swing.JTextField txtDiaStart;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
