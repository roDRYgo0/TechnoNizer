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

    JFrame event;

    
   
   
    
    public AddEventInfoP1(JFrame event) {
        initComponents();
        this.event=event;
        

       
        loadImage(); 

      
    }
    public AddEventInfoP1(int n) {
        initComponents();
        loadImage(); 
    txtEvent.setText(classPersonalE.eventos.get(n).getTitle());
    txtPlace.setText(classPersonalE.eventos.get(n).getPlace());
    txtDayStart.setText(classPersonalE.eventos.get(n).getDstart());
    txtDayEnd.setText(classPersonalE.eventos.get(n).getDend());
    }
    
    void loadImage(){
        iconStart.setIcon(new controller().changeImage("/imagenes/calendarPlus.png", 35, 35));
        iconEnd.setIcon(new controller().changeImage("/imagenes/calendarMinus.png", 35, 35));
        iconPlace.setIcon(new controller().changeImage("/imagenes/place.png", 35, 35));
     
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
        iconStart = new javax.swing.JLabel();
        txtDayStart = new javax.swing.JTextField();
        DayEventInfo = new javax.swing.JLabel();
        iconEnd = new javax.swing.JLabel();
        txtDayEnd = new javax.swing.JTextField();
        Day2EventInfo = new javax.swing.JLabel();
        spDayEnd = new javax.swing.JSeparator();
        btnNext1 = new javax.swing.JButton();
        placeeventEventInfo = new javax.swing.JLabel();
        txtPlace = new javax.swing.JTextField();
        spPlace = new javax.swing.JSeparator();
        iconGuest = new javax.swing.JLabel();
        iconPlace = new javax.swing.JLabel();

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

        DayEventInfo.setText("Fecha Inicio");

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

        Day2EventInfo.setText("Fecha Fin");

        spDayEnd.setForeground(new java.awt.Color(204, 204, 204));

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
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(spDayStart)
                                            .addComponent(txtDayStart, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spDayEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(iconEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Day2EventInfo)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDayEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(NameeventlblEventInfo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(iconGuest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(253, 253, 253)
                                .addComponent(checkEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(iconPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spPlace)
                                    .addComponent(txtPlace, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))))
                        .addGap(0, 50, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                        .addComponent(DayEventInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDayStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iconStart, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(spDayStart, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Day2EventInfo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDayEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(iconEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(spDayEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
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

    private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ActionPerformed
        if(true){
            if(txtEvent.getText().trim().isEmpty() ||
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
            Date dateStart =  sdf.parse(txtDayStart.getText());
            Date dateEnd = sdf.parse(txtDayEnd.getText());
         

                
                classPersonalE.setTitle(txtEvent.getText().trim());
                classPersonalE.setPlace(txtPlace.getText().trim());
                classPersonalE.setNickname(classUsuario.getNickname());
                classPersonalE.setDstart(txtDayStart.getText());
                classPersonalE.setDend(txtDayEnd.getText());
                
                standardization.hide(controller.addEventPer1);
                controller.addEventsP1 = new AddEventDetailsP1();
                standardization.show(controller.addEventsP1);
                controller.rootFrame = controller.addEventsP1;
         
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
    private javax.swing.JLabel NameeventlblEventInfo;
    private javax.swing.JLabel SetDatesEventInfo;
    private javax.swing.JLabel addeventlbl;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNext1;
    private javax.swing.JLabel checkEvent;
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
    private javax.swing.JLabel placeeventEventInfo;
    private javax.swing.JSeparator spDayEnd;
    private javax.swing.JSeparator spDayStart;
    private javax.swing.JSeparator spEvent;
    private javax.swing.JSeparator spPlace;
    private javax.swing.JTextField txtDayEnd;
    private javax.swing.JTextField txtDayStart;
    private javax.swing.JTextField txtEvent;
    private javax.swing.JTextField txtPlace;
    // End of variables declaration//GEN-END:variables

}
