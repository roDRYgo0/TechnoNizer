package eventOwner;

import java.awt.Color;
import java.util.Objects;
import javaClass.classEvent;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.event;
import javaClass.standardization;

/**
 * @author Alexg
 */
public class buyTicket extends javax.swing.JFrame {

    int idPrice;
    int idEvent;
    Double price;

    public buyTicket(int idPrice, int idEvent) {
        initComponents();
        this.idPrice = idPrice;
        this.idEvent = idEvent;
        load();

    }

    void load() {
        txtNamePrice.setText(classEvent.eventosShow.get(idEvent).getPrices().get(idPrice).getName());
        price = classEvent.eventosShow.get(idEvent).getPrices().get(idPrice).getPrice();
        txtPrice.setText("$" + price);
        if (classEvent.eventosShow.get(idEvent).getPrices().get(idPrice).getCount() == -1) {
            txtAvailable.setText("Ilimitados");
        } else {
            txtAvailable.setText(available() + "");
        }
    }

    int available() {
        int available = 0;
        available = classEvent.eventosShow.get(idEvent).getPrices().get(idPrice).getCount() - classEvent.selectGuestTickets(classEvent.eventosShow.get(idEvent).getPrices().get(idPrice).getId());
        return available;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        groupGoal = new javax.swing.ButtonGroup();
        txtCount = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        lblEvent = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        btnNext1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtNamePrice = new javax.swing.JLabel();
        ShowPricelbl4 = new javax.swing.JLabel();
        txtAvailable = new javax.swing.JTextField();
        spCount1 = new javax.swing.JSeparator();
        ShowPricelbl2 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        spPrice = new javax.swing.JSeparator();
        ShowPricelbl3 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        spPrice1 = new javax.swing.JSeparator();
        CountTickets = new javax.swing.JLabel();
        spCount = new javax.swing.JSeparator();
        txtCount1 = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        txtCount.setAutoscrolls(false);
        txtCount.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtCount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCountFocusLost(evt);
            }
        });
        txtCount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCountKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCountKeyTyped(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(35, 150, 243));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Agregar anuncio");

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
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Datos Generales");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Compra");

        btnNext1.setBackground(new java.awt.Color(0, 153, 255));
        btnNext1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext1.setForeground(new java.awt.Color(255, 255, 255));
        btnNext1.setText("Comprar");
        btnNext1.setBorderPainted(false);
        btnNext1.setFocusable(false);
        btnNext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Ticket");

        txtNamePrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNamePrice.setText("Visible");

        ShowPricelbl4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ShowPricelbl4.setForeground(new java.awt.Color(102, 102, 102));
        ShowPricelbl4.setText("Disponibles");

        txtAvailable.setForeground(new java.awt.Color(0, 153, 0));
        txtAvailable.setText("ilimitados");
        txtAvailable.setAutoscrolls(false);
        txtAvailable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtAvailable.setFocusable(false);
        txtAvailable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAvailableFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAvailableFocusLost(evt);
            }
        });
        txtAvailable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAvailableKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAvailableKeyTyped(evt);
            }
        });

        spCount1.setForeground(new java.awt.Color(204, 204, 204));

        ShowPricelbl2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ShowPricelbl2.setForeground(new java.awt.Color(102, 102, 102));
        ShowPricelbl2.setText("Precio");

        txtPrice.setAutoscrolls(false);
        txtPrice.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtPrice.setFocusable(false);
        txtPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPriceFocusLost(evt);
            }
        });
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPriceKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriceKeyTyped(evt);
            }
        });

        spPrice.setForeground(new java.awt.Color(204, 204, 204));

        ShowPricelbl3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowPricelbl3.setForeground(new java.awt.Color(102, 102, 102));
        ShowPricelbl3.setText("Total");

        txtTotal.setText("$0.0");
        txtTotal.setAutoscrolls(false);
        txtTotal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtTotal.setFocusable(false);
        txtTotal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTotalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTotalFocusLost(evt);
            }
        });
        txtTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTotalKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalKeyTyped(evt);
            }
        });

        spPrice1.setForeground(new java.awt.Color(204, 204, 204));

        CountTickets.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        CountTickets.setForeground(new java.awt.Color(102, 102, 102));
        CountTickets.setText("Cantidad");

        spCount.setForeground(new java.awt.Color(204, 204, 204));

        txtCount1.setAutoscrolls(false);
        txtCount1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtCount1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCount1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCount1FocusLost(evt);
            }
        });
        txtCount1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCount1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCount1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCount1KeyTyped(evt);
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
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCount1)
                                    .addComponent(spCount)
                                    .addComponent(CountTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ShowPricelbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal)
                                    .addComponent(spPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(31, 419, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ShowPricelbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ShowPricelbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAvailable)
                            .addComponent(spCount1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNamePrice))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(ShowPricelbl2)
                            .addGap(0, 0, 0)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(spPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(ShowPricelbl4)
                            .addGap(0, 0, 0)
                            .addComponent(txtAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(spCount1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel9)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CountTickets)
                                .addGap(0, 0, 0)
                                .addComponent(txtCount1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(spCount, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ShowPricelbl3)
                                .addGap(0, 0, 0)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(spPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ActionPerformed
        boolean status = true;
        if (!txtCount1.getText().trim().isEmpty()) {
            if (txtAvailable.getText().equals("Ilimitados") || txtAvailable.getText().equals("Unlimited")) {
                for (int i = 0; i < Integer.parseInt(txtCount1.getText()); i++) {
                    if (status) {
                        status = classEvent.insertGuest(classEvent.eventosShow.get(idEvent).getId(), classEvent.eventosShow.get(idEvent).getPrices().get(idPrice).getId(),
                                classUsuario.getNickname(), standardization.currentDateTimeSQL());
                    } else {
                        standardization.showMessage("cancel", "Error en la compra", this);
                        break;
                    }
                }
                if (status) {
                    for (int e = 0; e < classEvent.eventos.size(); e++) {
                        if (Objects.equals(classEvent.eventos.get(e).getId(), classEvent.eventosShow.get(idEvent).getId())) {
                            System.out.println("compra");
                            classEvent.eventos.get(e).setGuests(classEvent.selectGuests(classEvent.eventosShow.get(idEvent).getId()));
                            classEvent.eventosShow.get(idEvent).setGuests(classEvent.selectGuests(classEvent.eventosShow.get(idEvent).getId()));
                        }
                    }
                    controller.rootFrame = technonizer.TechnoNizer.home;
                    standardization.hide(this);
                    standardization.showMessage("ok", "Exito en la compra");
                }
            } else if (Integer.parseInt(txtCount1.getText()) > Integer.parseInt(txtAvailable.getText())) {
                standardization.showMessage("cancel", "Tickets insufucientes", this);
            } else {
                for (int i = 0; i < Integer.parseInt(txtCount1.getText()); i++) {
                    if (status) {
                        status = classEvent.insertGuest(classEvent.eventosShow.get(idEvent).getId(), classEvent.eventosShow.get(idEvent).getPrices().get(idPrice).getId(),
                                classUsuario.getNickname(), standardization.currentDateTimeSQL());
                    } else {
                        standardization.showMessage("cancel", "Error en la compra", this);
                        break;
                    }
                }
                if (status) {
                    for (int e = 0; e < classEvent.eventos.size(); e++) {
                        if (Objects.equals(classEvent.eventos.get(e).getId(), classEvent.eventosShow.get(idEvent).getId())) {
                            System.out.println("compra");
                            classEvent.eventos.get(e).setGuests(classEvent.selectGuests(classEvent.eventosShow.get(idEvent).getId()));
                            classEvent.eventosShow.get(idEvent).setGuests(classEvent.selectGuests(classEvent.eventosShow.get(idEvent).getId()));
                        }
                    }
                    controller.rootFrame = technonizer.TechnoNizer.home;
                    standardization.hide(this);
                    standardization.showMessage("ok", "Exito en la compra");
                }
            }
            technonizer.TechnoNizer.home.evento.updateGain();
        }else{
            standardization.showMessage("ok", "Campos vacios");
        }
    }//GEN-LAST:event_btnNext1ActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        controller.rootFrame = technonizer.TechnoNizer.home;
        standardization.hide(this);
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtAvailableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAvailableFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvailableFocusGained

    private void txtAvailableFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAvailableFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvailableFocusLost

    private void txtAvailableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAvailableKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvailableKeyPressed

    private void txtAvailableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAvailableKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvailableKeyTyped

    private void txtPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPriceFocusGained
        spPrice.setBackground(Color.red);
    }//GEN-LAST:event_txtPriceFocusGained

    private void txtPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPriceFocusLost
        spPrice.setBackground(Color.white);
    }//GEN-LAST:event_txtPriceFocusLost

    private void txtPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceKeyPressed

    private void txtPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceKeyTyped

    private void txtCountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCountFocusGained
        spCount.setBackground(Color.red);
    }//GEN-LAST:event_txtCountFocusGained

    private void txtCountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCountFocusLost
        spCount.setBackground(Color.white);
    }//GEN-LAST:event_txtCountFocusLost

    private void txtCountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCountKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountKeyPressed

    private void txtCountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCountKeyTyped
        char c = evt.getKeyChar();
        if (txtCount.getText().length() >= 5) {
            evt.consume();
        } else if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtCountKeyTyped

    private void txtTotalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotalFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalFocusGained

    private void txtTotalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotalFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalFocusLost

    private void txtTotalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalKeyPressed

    private void txtTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalKeyTyped

    private void txtCount1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCount1FocusGained
        spCount.setBackground(Color.red);
    }//GEN-LAST:event_txtCount1FocusGained

    private void txtCount1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCount1FocusLost
        spCount.setBackground(Color.white);
    }//GEN-LAST:event_txtCount1FocusLost

    private void txtCount1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCount1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCount1KeyPressed

    private void txtCount1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCount1KeyTyped
        char c = evt.getKeyChar();
        if (txtCount.getText().length() >= 5) {
            evt.consume();
        } else if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtCount1KeyTyped

    private void txtCount1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCount1KeyReleased
        if (!txtCount1.getText().trim().isEmpty()) {
            if (Double.parseDouble(txtCount1.getText().trim()) > 10) {
                standardization.showMessage("warning", "Maximo de entradas por orden 10", this);
                txtTotal.setText("$0.0");
                txtCount1.setText("");
            } else {
                txtTotal.setText("$" + Double.parseDouble(txtCount1.getText()) * price);
            }
        } else {
            txtTotal.setText("$0.0");
        }
    }//GEN-LAST:event_txtCount1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CountTickets;
    private javax.swing.JLabel ShowPricelbl2;
    private javax.swing.JLabel ShowPricelbl3;
    private javax.swing.JLabel ShowPricelbl4;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNext1;
    private javax.swing.ButtonGroup groupGoal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblEvent;
    private javax.swing.JSeparator spCount;
    private javax.swing.JSeparator spCount1;
    private javax.swing.JSeparator spPrice;
    private javax.swing.JSeparator spPrice1;
    private javax.swing.JTextField txtAvailable;
    private javax.swing.JTextField txtCount;
    private javax.swing.JTextField txtCount1;
    private javax.swing.JLabel txtNamePrice;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

}
