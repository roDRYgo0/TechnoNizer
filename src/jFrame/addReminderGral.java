package jFrame;

import java.awt.Color;
import java.util.Date;
import java.util.Properties;
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
    day.setText(pr.getProperty("Dayjpedit"));
    month.setText(pr.getProperty("monthjpedit"));
    yearR.setText(pr.getProperty("yearjpedit"));
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
        spDayStart = new javax.swing.JSeparator();
        spYearStart = new javax.swing.JSeparator();
        iconStart = new javax.swing.JLabel();
        SaveReminder = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReminder = new javax.swing.JTextArea();
        txtYearEnd = new javax.swing.JTextField();
        cmbMonthEnd = new javax.swing.JComboBox<>();
        txtDayEnd = new javax.swing.JTextField();
        day = new javax.swing.JLabel();
        month = new javax.swing.JLabel();
        yearR = new javax.swing.JLabel();

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

        spDayStart.setForeground(new java.awt.Color(204, 204, 204));

        spYearStart.setForeground(new java.awt.Color(204, 204, 204));

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

        cmbMonthEnd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cmbMonthEnd.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        txtDayEnd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDayEnd.setText("24");
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

        day.setText("Día");

        month.setText("Mes");

        yearR.setText("Año");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DataGeneralAddReminder)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addComponent(checkEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DateReminder)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addComponent(txtDayEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(day))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(month)
                                                    .addComponent(cmbMonthEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(spDayStart, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtYearEnd)
                                            .addComponent(yearR)
                                            .addComponent(spYearStart, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(139, 139, 139)
                                .addComponent(iconStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(DescriptionReminder)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(SaveReminder, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73))
                            .addComponent(spReminder)
                            .addComponent(jScrollPane1))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(DataGeneralAddReminder)
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DateReminder)
                                .addGap(69, 69, 69))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(month)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbMonthEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(day)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDayEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(yearR)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtYearEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(1, 1, 1)))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spDayStart, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spYearStart, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
       standardization.hide(controller.gralReminder1);               
                    technonizer.TechnoNizer.home.pnAgenda1();
                    controller.jpREM.load();
                    controller.rootFrame = technonizer.TechnoNizer.home;      
    }//GEN-LAST:event_btnNext1ActionPerformed

    private void SaveReminderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveReminderActionPerformed
        if (txtReminder.getText().isEmpty() || txtYearEnd.getText().isEmpty() || txtDayEnd.getText().isEmpty()) {
            standardization.showMessage("warning", "Hay campos vacios!", this);
        } else {
            Date dateEnd = new Date(Integer.parseInt(txtYearEnd.getText()), (cmbMonthEnd.getSelectedIndex()+1), Integer.parseInt(txtDayEnd.getText()));

            if (standardization.validateDate(Integer.parseInt(txtYearEnd.getText()), (cmbMonthEnd.getSelectedIndex() + 1), Integer.parseInt(txtDayEnd.getText()))) {
                standardization.showMessage("warning", "Fechas invalidas", this);
            } else if (standardization.compareDateBefore(dateEnd, standardization.currentDateTime()) == -1) {
                standardization.showMessage("warning", "Fechas invalidas", this);
            } else {

                classReminder.setReminder((txtReminder.getText()));
                classReminder.setDatetime((txtDayEnd.getText()) + "/" + (cmbMonthEnd.getSelectedIndex() + 1)+ "/" +txtYearEnd.getText() );
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
            }
    }//GEN-LAST:event_SaveReminderActionPerformed

    private void txtYearEndFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtYearEndFocusGained
        spYearStart.setBackground(Color.red);
    }//GEN-LAST:event_txtYearEndFocusGained

    private void txtYearEndFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtYearEndFocusLost
        spYearStart.setBackground(Color.white);
    }//GEN-LAST:event_txtYearEndFocusLost

    private void txtYearEndKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYearEndKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearEndKeyTyped

    private void txtDayEndFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDayEndFocusGained

    }//GEN-LAST:event_txtDayEndFocusGained

    private void txtDayEndFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDayEndFocusLost
      
    }//GEN-LAST:event_txtDayEndFocusLost

    private void txtDayEndKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDayEndKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDayEndKeyTyped

    private void btnNext1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNext1MouseReleased
         standardization.hide(controller.gralReminder);
    }//GEN-LAST:event_btnNext1MouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddReminderGeneralLbl;
    private javax.swing.JLabel DataGeneralAddReminder;
    private javax.swing.JLabel DateReminder;
    private javax.swing.JLabel DescriptionReminder;
    private javax.swing.JButton SaveReminder;
    private javax.swing.JButton btnNext1;
    private javax.swing.JLabel checkEvent;
    private javax.swing.JComboBox<String> cmbMonthEnd;
    private javax.swing.JLabel day;
    private javax.swing.JLabel iconStart;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblEvent;
    private javax.swing.JLabel month;
    private javax.swing.JSeparator spDayStart;
    private javax.swing.JSeparator spReminder;
    private javax.swing.JSeparator spYearStart;
    private javax.swing.JTextField txtDayEnd;
    private javax.swing.JTextArea txtReminder;
    private javax.swing.JTextField txtYearEnd;
    private javax.swing.JLabel yearR;
    // End of variables declaration//GEN-END:variables

}
