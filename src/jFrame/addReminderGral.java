package jFrame;

import java.awt.Color;
import java.util.Date;
import javaClass.classEvent;
import javaClass.classReminder;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.standardization;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Alexg
 */
public class addReminderGral extends javax.swing.JFrame {

    byte[] cover;
    byte[] profil;

    public addReminderGral() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnNext1 = new javax.swing.JButton();
        lblEvent = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtReminder1 = new javax.swing.JTextField();
        spReminder = new javax.swing.JSeparator();
        checkEvent = new javax.swing.JLabel();
        lblCover = new javax.swing.JLabel();
        lblProfil = new javax.swing.JLabel();
        spDayStart = new javax.swing.JSeparator();
        cmbMonthStart = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtYearStart = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        spYearStart = new javax.swing.JSeparator();
        iconStart = new javax.swing.JLabel();
        txtDayStart = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        spDayEnd = new javax.swing.JSeparator();
        btnNext = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(35, 150, 243));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agregar Recordatorio");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Technonizer");

        btnNext1.setBackground(new java.awt.Color(0, 153, 255));
        btnNext1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext1.setForeground(new java.awt.Color(255, 255, 255));
        btnNext1.setText("X");
        btnNext1.setBorderPainted(false);
        btnNext1.setFocusable(false);
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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNext1))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(btnNext1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Datos Generales");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Establecer fechas ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Nombre del evento");

        txtReminder1.setAutoscrolls(false);
        txtReminder1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtReminder1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtReminder1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtReminder1FocusLost(evt);
            }
        });
        txtReminder1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtReminder1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtReminder1KeyTyped(evt);
            }
        });

        spReminder.setForeground(new java.awt.Color(204, 204, 204));

        checkEvent.setMaximumSize(new java.awt.Dimension(25, 25));
        checkEvent.setMinimumSize(new java.awt.Dimension(25, 25));
        checkEvent.setPreferredSize(new java.awt.Dimension(25, 25));

        lblCover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCover.setText("Fondo");

        lblProfil.setBackground(new java.awt.Color(255, 255, 204));
        lblProfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProfil.setText("Perfil");
        lblProfil.setMaximumSize(new java.awt.Dimension(80, 80));
        lblProfil.setMinimumSize(new java.awt.Dimension(80, 80));
        lblProfil.setPreferredSize(new java.awt.Dimension(80, 80));

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

        jLabel10.setText("Día");

        txtHora.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtHora.setText("12");
        txtHora.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel11.setText("Horas");

        spDayEnd.setForeground(new java.awt.Color(204, 204, 204));

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

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Repetición");

        jButton2.setText("jButton2");

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
                        .addComponent(jLabel5)
                        .addContainerGap(302, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(spReminder)
                                        .addComponent(txtReminder1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4))
                                .addComponent(checkEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblProfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(iconStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                    .addComponent(spYearStart, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(spDayEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(118, 118, 118)
                                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(223, 223, 223)
                                .addComponent(jButton2)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCover, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(checkEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(txtReminder1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(spReminder, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblProfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDayStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(iconStart, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(10, 10, 10)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spDayEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ActionPerformed
        standardization.hide(controller.gralEvent);
    }//GEN-LAST:event_btnNext1ActionPerformed

    private void txtReminder1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtReminder1FocusGained
        spReminder.setBackground(Color.red);
    }//GEN-LAST:event_txtReminder1FocusGained

    private void txtReminder1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtReminder1FocusLost
        spReminder.setBackground(Color.white);
    }//GEN-LAST:event_txtReminder1FocusLost

    private void txtReminder1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReminder1KeyPressed

    }//GEN-LAST:event_txtReminder1KeyPressed

    private void txtReminder1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReminder1KeyTyped
        char c = evt.getKeyChar();
        if (txtReminder1.getText().length() < 41) {
            if (Character.isLetter(c) || Character.isSpaceChar(c)) {
            } else {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtReminder1KeyTyped

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

    private void txtYearStartFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtYearStartFocusLost
        spYearStart.setBackground(Color.white);
    }//GEN-LAST:event_txtYearStartFocusLost

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if (txtReminder1.getText().isEmpty() || txtYearStart.getText().isEmpty() || txtDayStart.getText().isEmpty()) {
            standardization.showMessage("warning", "Hay campos vacios!", this);
        } else {
            Date dateStart = new Date(Integer.parseInt(txtYearStart.getText()), (cmbMonthStart.getSelectedIndex() + 1), Integer.parseInt(txtDayStart.getText()));

            if (standardization.validateDate(Integer.parseInt(txtYearStart.getText()), (cmbMonthStart.getSelectedIndex() + 1), Integer.parseInt(txtDayStart.getText()))) {
                standardization.showMessage("warning", "Fechas invalidas", this);
            } else if (standardization.compareDate(dateStart, standardization.currentDateTime()) == -1) {
                standardization.showMessage("warning", "Fechas invalidas", this);
            } else {

                classReminder.setReminder((txtReminder1.getText()));
                classReminder.setDatetime((txtYearStart.getText() + "/" + cmbMonthStart.getSelectedIndex() + 1)+ "/" + txtDayStart.getText() );
                classReminder.setRepeat((Integer.parseInt(txtHora.getText())));

                if (classReminder.insert()) {
                    JOptionPane.showMessageDialog(this, "Recordatorio Guardado");
                    standardization.hide(controller.gralReminder);
                } else {
                    JOptionPane.showMessageDialog(this, "Error al guardar recordatorio");
                    standardization.hide(controller.gralReminder);
                }
}
            }
    }//GEN-LAST:event_btnNextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNext1;
    private javax.swing.JLabel checkEvent;
    private javax.swing.JComboBox<String> cmbMonthStart;
    private javax.swing.JLabel iconStart;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCover;
    private javax.swing.JLabel lblEvent;
    private javax.swing.JLabel lblProfil;
    private javax.swing.JSeparator spDayEnd;
    private javax.swing.JSeparator spDayStart;
    private javax.swing.JSeparator spReminder;
    private javax.swing.JSeparator spYearStart;
    private javax.swing.JTextField txtDayStart;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtReminder1;
    private javax.swing.JTextField txtYearStart;
    // End of variables declaration//GEN-END:variables

}
