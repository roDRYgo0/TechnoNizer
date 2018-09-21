package jFrame;

import event.allPrice;
import event.lockedPrices;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Properties;
import javaClass.classEvent;
import javaClass.classPersonalE;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.event;
import javaClass.eventp;
import javaClass.standardization;
import properties.propiedades;

/**
 * 
 * @author rodri
 */

public class AddEventDetailsP extends javax.swing.JFrame {

    
    
    public AddEventDetailsP() {
        initComponents();
      
        member(); 
        load();
        icon1.setIcon(new controller().changeImage("/imagenes/ok.png", 30, 30));
        classPersonalE.setColor("35 150 243");
        
   
    }
    public void load(){
       
    }
    
    void member(){
        switch(classUsuario.getIdMemberships()){
            case 1:
                jPanel4.setBackground(Color.white);
                jPanel5.setBackground(Color.white);
                jPanel6.setBackground(Color.white);
                jPanel7.setBackground(Color.white);
                jPanel8.setBackground(Color.white);
                jPanel9.setBackground(Color.white);
                jPanel10.setBackground(Color.white);
                jPanel11.setBackground(Color.white);
                jPanel12.setBackground(Color.white);
                jPanel18.setBackground(Color.white);
                jPanel19.setBackground(Color.white);
                jPanel20.setBackground(Color.white);
                jPanel21.setBackground(Color.white);
                jPanel22.setBackground(Color.white);
                break;
            case 2:
                jPanel8.setBackground(Color.white);
                jPanel9.setBackground(Color.white);
                jPanel10.setBackground(Color.white);
                jPanel11.setBackground(Color.white);
                jPanel12.setBackground(Color.white);
                jPanel18.setBackground(Color.white);
                jPanel19.setBackground(Color.white);
                jPanel20.setBackground(Color.white);
                jPanel21.setBackground(Color.white);
                jPanel22.setBackground(Color.white);
                break;
                
        }
    }
    
    public void disable(){
        icon1.setIcon(null);
        icon2.setIcon(null);
        icon3.setIcon(null);
        icon4.setIcon(null);
        icon5.setIcon(null);
        icon6.setIcon(null);
        icon7.setIcon(null);
        icon8.setIcon(null);
        icon9.setIcon(null);
        icon10.setIcon(null);
        icon11.setIcon(null);
        icon12.setIcon(null);
        icon13.setIcon(null);
        icon14.setIcon(null);
        icon15.setIcon(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel13 = new javax.swing.JPanel();
        iconGreen10 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        iconGreen11 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        iconGreen12 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        iconGreen13 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        iconGreen14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        addEventDetaillbl1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        lblEvent = new javax.swing.JLabel();
        priceslblEventDetail = new javax.swing.JLabel();
        visibilityeventdetail = new javax.swing.JLabel();
        lblVisibility = new javax.swing.JLabel();
        lblSwitch = new javax.swing.JLabel();
        btnNext1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        icon1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        icon2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        icon3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        icon4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        icon5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        icon6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        icon7 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        icon8 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        icon9 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        icon10 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        icon11 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        icon12 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        icon13 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        icon14 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        icon15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel23 = new javax.swing.JPanel();

        jPanel13.setBackground(new java.awt.Color(0, 153, 0));

        iconGreen10.setMaximumSize(new java.awt.Dimension(30, 30));
        iconGreen10.setMinimumSize(new java.awt.Dimension(30, 30));
        iconGreen10.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(iconGreen10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconGreen10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel14.setBackground(new java.awt.Color(0, 153, 0));

        iconGreen11.setMaximumSize(new java.awt.Dimension(30, 30));
        iconGreen11.setMinimumSize(new java.awt.Dimension(30, 30));
        iconGreen11.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(iconGreen11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconGreen11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel15.setBackground(new java.awt.Color(0, 153, 0));

        iconGreen12.setMaximumSize(new java.awt.Dimension(30, 30));
        iconGreen12.setMinimumSize(new java.awt.Dimension(30, 30));
        iconGreen12.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(iconGreen12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconGreen12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel16.setBackground(new java.awt.Color(0, 153, 0));

        iconGreen13.setMaximumSize(new java.awt.Dimension(30, 30));
        iconGreen13.setMinimumSize(new java.awt.Dimension(30, 30));
        iconGreen13.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(iconGreen13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconGreen13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel17.setBackground(new java.awt.Color(0, 153, 0));

        iconGreen14.setMaximumSize(new java.awt.Dimension(30, 30));
        iconGreen14.setMinimumSize(new java.awt.Dimension(30, 30));
        iconGreen14.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(iconGreen14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconGreen14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(405, 585));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(35, 150, 243));

        addEventDetaillbl1.setForeground(new java.awt.Color(255, 255, 255));
        addEventDetaillbl1.setText("Agregar Evento");

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
                        .addComponent(addEventDetaillbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(addEventDetaillbl1))
                .addContainerGap())
        );

        priceslblEventDetail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        priceslblEventDetail.setText("Descripción");

        visibilityeventdetail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        visibilityeventdetail.setText("Visibilidad");

        lblVisibility.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblVisibility.setText("Visible");

        lblSwitch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSwitchMouseReleased(evt);
            }
        });

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

        jPanel3.setBackground(new java.awt.Color(35, 150, 243));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel3MouseReleased(evt);
            }
        });

        icon1.setMaximumSize(new java.awt.Dimension(30, 30));
        icon1.setMinimumSize(new java.awt.Dimension(30, 30));
        icon1.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(icon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 0));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel4MouseReleased(evt);
            }
        });

        icon2.setMaximumSize(new java.awt.Dimension(30, 30));
        icon2.setMinimumSize(new java.awt.Dimension(30, 30));
        icon2.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(icon2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel5.setBackground(new java.awt.Color(239, 110, 239));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel5MouseReleased(evt);
            }
        });

        icon3.setMaximumSize(new java.awt.Dimension(30, 30));
        icon3.setMinimumSize(new java.awt.Dimension(30, 30));
        icon3.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(icon3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel6.setBackground(new java.awt.Color(24, 78, 186));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel6MouseReleased(evt);
            }
        });

        icon4.setMaximumSize(new java.awt.Dimension(30, 30));
        icon4.setMinimumSize(new java.awt.Dimension(30, 30));
        icon4.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(icon4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel7.setBackground(new java.awt.Color(166, 166, 29));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel7MouseReleased(evt);
            }
        });

        icon5.setMaximumSize(new java.awt.Dimension(30, 30));
        icon5.setMinimumSize(new java.awt.Dimension(30, 30));
        icon5.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(icon5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel8.setBackground(new java.awt.Color(204, 0, 0));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel8MouseReleased(evt);
            }
        });

        icon6.setMaximumSize(new java.awt.Dimension(30, 30));
        icon6.setMinimumSize(new java.awt.Dimension(30, 30));
        icon6.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(icon6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel9.setBackground(new java.awt.Color(179, 19, 179));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel9MouseReleased(evt);
            }
        });

        icon7.setMaximumSize(new java.awt.Dimension(30, 30));
        icon7.setMinimumSize(new java.awt.Dimension(30, 30));
        icon7.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(icon7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel10.setBackground(new java.awt.Color(217, 99, 23));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel10MouseReleased(evt);
            }
        });

        icon8.setMaximumSize(new java.awt.Dimension(30, 30));
        icon8.setMinimumSize(new java.awt.Dimension(30, 30));
        icon8.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(icon8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel11.setBackground(new java.awt.Color(102, 102, 102));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel11MouseReleased(evt);
            }
        });

        icon9.setMaximumSize(new java.awt.Dimension(30, 30));
        icon9.setMinimumSize(new java.awt.Dimension(30, 30));
        icon9.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(icon9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel12.setBackground(new java.awt.Color(102, 0, 255));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel12MouseReleased(evt);
            }
        });

        icon10.setMaximumSize(new java.awt.Dimension(30, 30));
        icon10.setMinimumSize(new java.awt.Dimension(30, 30));
        icon10.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(icon10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel18.setBackground(new java.awt.Color(153, 0, 51));
        jPanel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel18MouseReleased(evt);
            }
        });

        icon11.setMaximumSize(new java.awt.Dimension(30, 30));
        icon11.setMinimumSize(new java.awt.Dimension(30, 30));
        icon11.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(icon11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel19.setBackground(new java.awt.Color(129, 61, 0));
        jPanel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel19MouseReleased(evt);
            }
        });

        icon12.setMaximumSize(new java.awt.Dimension(30, 30));
        icon12.setMinimumSize(new java.awt.Dimension(30, 30));
        icon12.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(icon12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel20.setBackground(new java.awt.Color(102, 102, 255));
        jPanel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel20MouseReleased(evt);
            }
        });

        icon13.setMaximumSize(new java.awt.Dimension(30, 30));
        icon13.setMinimumSize(new java.awt.Dimension(30, 30));
        icon13.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(icon13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel21.setBackground(new java.awt.Color(0, 204, 204));
        jPanel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel21MouseReleased(evt);
            }
        });

        icon14.setMaximumSize(new java.awt.Dimension(30, 30));
        icon14.setMinimumSize(new java.awt.Dimension(30, 30));
        icon14.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(icon14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel22.setBackground(new java.awt.Color(0, 102, 0));
        jPanel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel22MouseReleased(evt);
            }
        });

        icon15.setMaximumSize(new java.awt.Dimension(30, 30));
        icon15.setMinimumSize(new java.awt.Dimension(30, 30));
        icon15.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(icon15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Color");

        jScrollPane1.setBorder(null);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(visibilityeventdetail)
                            .addComponent(lblVisibility, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7))
                            .addComponent(priceslblEventDetail))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(priceslblEventDetail)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(visibilityeventdetail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblVisibility)
                        .addGap(11, 11, 11))
                    .addComponent(lblSwitch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        controller.rootFrame = technonizer.TechnoNizer.home;
        standardization.hide(controller.addEvents);
    }//GEN-LAST:event_btnNextActionPerformed

    private void lblSwitchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSwitchMouseReleased
       
    }//GEN-LAST:event_lblSwitchMouseReleased

    private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ActionPerformed

        classPersonalE.setNote(jTextArea1.getText().trim());
        standardization.hide(controller.addEventsP);
        if(classPersonalE.insert()){
            
            
            //eventp evento = new eventp();
           classPersonalE.select();
                    standardization.hide(controller.addEventsP);               
                    technonizer.TechnoNizer.home.showYourEvents(false);
                    controller.jpREMI.load();
                    controller.rootFrame = technonizer.TechnoNizer.home;
            standardization.showMessage("ok", "Exito al crear evento", technonizer.TechnoNizer.home);
        }
        else
            standardization.showMessage("cancel", "No se pudo crear el evento", technonizer.TechnoNizer.home);

    }//GEN-LAST:event_btnNext1ActionPerformed

    private void jPanel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseReleased
        disable();
        icon1.setIcon(new controller().changeImage("/imagenes/ok.png", 30, 30));
        classPersonalE.setColor("35 150 243");
    }//GEN-LAST:event_jPanel3MouseReleased

    private void jPanel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseReleased
        if(classUsuario.getIdMemberships() == 2 || classUsuario.getIdMemberships() == 3){
            disable();
            icon2.setIcon(new controller().changeImage("/imagenes/ok.png", 30, 30));
            classPersonalE.setColor("0 153 0");
        }
    }//GEN-LAST:event_jPanel4MouseReleased

    private void jPanel5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseReleased
        if(classUsuario.getIdMemberships() == 2 || classUsuario.getIdMemberships() == 3){   
            disable();
            icon3.setIcon(new controller().changeImage("/imagenes/ok.png", 30, 30));
            classPersonalE.setColor("239 110 239");
        }
    }//GEN-LAST:event_jPanel5MouseReleased

    private void jPanel6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseReleased
        if(classUsuario.getIdMemberships() == 2 || classUsuario.getIdMemberships() == 3){   
            disable();
            icon4.setIcon(new controller().changeImage("/imagenes/ok.png", 30, 30));
            classPersonalE.setColor("24 78 186");
        }
    }//GEN-LAST:event_jPanel6MouseReleased

    private void jPanel7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseReleased
        if(classUsuario.getIdMemberships() == 2 || classUsuario.getIdMemberships() == 3){   
            disable();
            icon5.setIcon(new controller().changeImage("/imagenes/ok.png", 30, 30));
            classPersonalE.setColor("166 166 29");
        }
    }//GEN-LAST:event_jPanel7MouseReleased

    private void jPanel8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseReleased
        if(classUsuario.getIdMemberships() == 3){   
            disable();
            icon6.setIcon(new controller().changeImage("/imagenes/ok.png", 30, 30));
            classPersonalE.setColor("204 0 0");
        }
    }//GEN-LAST:event_jPanel8MouseReleased

    private void jPanel9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseReleased
        if(classUsuario.getIdMemberships() == 3){   
            disable();
            icon7.setIcon(new controller().changeImage("/imagenes/ok.png", 30, 30));
            classPersonalE.setColor("179 19 179");
        }
    }//GEN-LAST:event_jPanel9MouseReleased

    private void jPanel10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseReleased
        if(classUsuario.getIdMemberships() == 3){   
            disable();
            icon8.setIcon(new controller().changeImage("/imagenes/ok.png", 30, 30));
            classPersonalE.setColor("217 99 23");
        }
    }//GEN-LAST:event_jPanel10MouseReleased

    private void jPanel11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseReleased
        if(classUsuario.getIdMemberships() == 3){   
            disable();
            icon9.setIcon(new controller().changeImage("/imagenes/ok.png", 30, 30));
            classPersonalE.setColor("102 102 102");
        }
    }//GEN-LAST:event_jPanel11MouseReleased

    private void jPanel12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseReleased
        if(classUsuario.getIdMemberships() == 3){   
            disable();
            icon10.setIcon(new controller().changeImage("/imagenes/ok.png", 30, 30));
            classPersonalE.setColor("102 0 255");
        }
    }//GEN-LAST:event_jPanel12MouseReleased

    private void jPanel18MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseReleased
        if(classUsuario.getIdMemberships() == 3){   
            disable();
            icon11.setIcon(new controller().changeImage("/imagenes/ok.png", 30, 30));
            classPersonalE.setColor("153 0 51");
        }
    }//GEN-LAST:event_jPanel18MouseReleased

    private void jPanel19MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MouseReleased
        if(classUsuario.getIdMemberships() == 3){   
            disable();
            icon12.setIcon(new controller().changeImage("/imagenes/ok.png", 30, 30));
            classPersonalE.setColor("129 61 0");
        }
    }//GEN-LAST:event_jPanel19MouseReleased

    private void jPanel20MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel20MouseReleased
        if(classUsuario.getIdMemberships() == 3){   
            disable();
            icon13.setIcon(new controller().changeImage("/imagenes/ok.png", 30, 30));
            classPersonalE.setColor("102 102 255");
        }
    }//GEN-LAST:event_jPanel20MouseReleased

    private void jPanel21MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseReleased
        if(classUsuario.getIdMemberships() == 3){   
            disable();
            icon14.setIcon(new controller().changeImage("/imagenes/ok.png", 30, 30));
            classPersonalE.setColor("0 204 204");
        }
    }//GEN-LAST:event_jPanel21MouseReleased

    private void jPanel22MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseReleased
        if(classUsuario.getIdMemberships() == 3){   
            disable();
            icon15.setIcon(new controller().changeImage("/imagenes/ok.png", 30, 30));
            classPersonalE.setColor("0 102 0");
        }
    }//GEN-LAST:event_jPanel22MouseReleased

    
    
    //<editor-fold defaultstate="collapsed" desc="comment">
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addEventDetaillbl1;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNext1;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon10;
    private javax.swing.JLabel icon11;
    private javax.swing.JLabel icon12;
    private javax.swing.JLabel icon13;
    private javax.swing.JLabel icon14;
    private javax.swing.JLabel icon15;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon4;
    private javax.swing.JLabel icon5;
    private javax.swing.JLabel icon6;
    private javax.swing.JLabel icon7;
    private javax.swing.JLabel icon8;
    private javax.swing.JLabel icon9;
    private javax.swing.JLabel iconGreen10;
    private javax.swing.JLabel iconGreen11;
    private javax.swing.JLabel iconGreen12;
    private javax.swing.JLabel iconGreen13;
    private javax.swing.JLabel iconGreen14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblEvent;
    private javax.swing.JLabel lblSwitch;
    private javax.swing.JLabel lblVisibility;
    private javax.swing.JLabel priceslblEventDetail;
    private javax.swing.JLabel visibilityeventdetail;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
}
