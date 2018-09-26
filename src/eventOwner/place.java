package eventOwner;

import java.awt.Dimension;
import java.awt.Image;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaClass.StaticMaps;
import javaClass.classEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.util.Properties;
import javaClass.controller;
import javaClass.event;
import javaClass.standardization;
import properties.propiedades;

public class place extends javax.swing.JPanel {

    Properties pr;

    void verificaridioma() {
        pr = new propiedades(controller.idioma);
        lblplace.setText(pr.getProperty("lblPlace"));
        lblMap.setText(pr.getProperty("lblMap"));
        btnNext1.setText(pr.getProperty("btnNext1Map"));
    }

    private StaticMaps ObjStaticMaps = new StaticMaps();

    int idEvent;
    int visibility;

    public place(int idEvent) {
        initComponents();
        verificaridioma();
        this.idEvent = idEvent;
        if (classEvent.evento.getMapImage() == null) {
            visibility = 0;
        } else {
            visibility = 1;
        }
        switchVisibility();
        load(classEvent.eventosShow.get(idEvent).getPlace());

    }

    void load(String direction) {
        iconGoogleMaps.setIcon(new controller().changeImage("/imagenes/googleMaps.png", 35, 35));
        if (!direction.isEmpty()) {
            if (classEvent.evento.getMapImage() != null) {
                lblMap.setIcon(standardization.getImgIcon(classEvent.evento.getMapImage()));
            }
            lblPlace.setText(direction);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMap = new javax.swing.JLabel();
        lblplace = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblPlace = new javax.swing.JTextField();
        spEvent = new javax.swing.JSeparator();
        btnNext1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        iconGoogleMaps = new javax.swing.JLabel();
        lblSwitch = new javax.swing.JLabel();
        InvitesnumberEventInfo1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(945, 439));
        setMinimumSize(new java.awt.Dimension(945, 439));
        setPreferredSize(new java.awt.Dimension(945, 439));

        lblMap.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMap.setText("No se puede mostrar el mapa");
        lblMap.setMaximumSize(new java.awt.Dimension(945, 343));
        lblMap.setMinimumSize(new java.awt.Dimension(945, 343));
        lblMap.setPreferredSize(new java.awt.Dimension(945, 343));
        lblMap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblMapMouseReleased(evt);
            }
        });

        lblplace.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblplace.setForeground(new java.awt.Color(153, 153, 153));
        lblplace.setText("Lugar del evento");

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));

        lblPlace.setAutoscrolls(false);
        lblPlace.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lblPlace.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblPlaceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblPlaceFocusLost(evt);
            }
        });
        lblPlace.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblPlaceKeyTyped(evt);
            }
        });

        spEvent.setForeground(new java.awt.Color(204, 204, 204));

        btnNext1.setBackground(new java.awt.Color(0, 153, 255));
        btnNext1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext1.setForeground(new java.awt.Color(255, 255, 255));
        btnNext1.setText("Buscar");
        btnNext1.setBorderPainted(false);
        btnNext1.setFocusable(false);
        btnNext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStatus.setText("Activo");

        iconGoogleMaps.setMaximumSize(new java.awt.Dimension(35, 35));
        iconGoogleMaps.setMinimumSize(new java.awt.Dimension(35, 35));
        iconGoogleMaps.setPreferredSize(new java.awt.Dimension(35, 35));

        lblSwitch.setMaximumSize(new java.awt.Dimension(30, 30));
        lblSwitch.setMinimumSize(new java.awt.Dimension(30, 30));
        lblSwitch.setPreferredSize(new java.awt.Dimension(30, 30));
        lblSwitch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSwitchMouseReleased(evt);
            }
        });

        InvitesnumberEventInfo1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        InvitesnumberEventInfo1.setForeground(new java.awt.Color(102, 102, 102));
        InvitesnumberEventInfo1.setText("Google maps");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(iconGoogleMaps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(InvitesnumberEventInfo1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(InvitesnumberEventInfo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblSwitch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iconGoogleMaps, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblplace))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblPlace, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                                    .addComponent(spEvent))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblplace)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(lblPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnNext1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(spEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblMap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblPlaceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblPlaceFocusGained
        spEvent.setBackground(Color.red);
    }//GEN-LAST:event_lblPlaceFocusGained

    private void lblPlaceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblPlaceFocusLost
        spEvent.setBackground(Color.white);
        if (lblPlace.getText().trim().length() < 4 && lblPlace.getText().trim().length() > 0) {
            standardization.showMessage("cancel", "Lugar invalido");
            lblPlace.setText("");
        }
    }//GEN-LAST:event_lblPlaceFocusLost

    private void lblPlaceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblPlaceKeyTyped
        char c = evt.getKeyChar();
        if (lblPlace.getText().length() < 200) {
            if (Character.isLetter(c) || Character.isSpaceChar(c) || Character.isDigit(c)) {
            } else {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_lblPlaceKeyTyped

    private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ActionPerformed
        if (!lblPlace.getText().trim().isEmpty() || lblPlace.getText().trim().length() < 4) {
            try {
                if (visibility == 1) {
                    this.lblMap.setText("");
                    Image imagenMapa = ObjStaticMaps.getStaticMap(lblPlace.getText(),
                            Integer.valueOf(16), new Dimension(473, 173), 2, StaticMaps.Format.png,
                            StaticMaps.Maptype.roadmap);
                    if (imagenMapa != null) {
                        ImageIcon imgIcon = new ImageIcon(imagenMapa);
                        Icon iconImage = (Icon) imgIcon;
                        classEvent.evento.setMapImage(standardization.getByte(standardization.getImageMap(lblPlace.getText().trim())));
                        lblMap.setIcon(iconImage);
                    }
                }
                changePlace(lblPlace.getText().trim());
            } catch (MalformedURLException ex) {
                Logger.getLogger(place.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(place.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnNext1ActionPerformed

    void changePlace(String place) {
        classEvent.eventosShow.get(idEvent).setPlace(place);
        for (event e : classEvent.eventos) {
            if (e.getId() == classEvent.eventosShow.get(idEvent).getId()) {
                e.setPlace(place);
                if (classEvent.updatePlace(e.getId(), place, classEvent.evento.getMapImage(), visibility)) {
                    standardization.showMessage("ok", "Lugar de evento cambiado");
                } else {
                    standardization.showMessage("cancel", "No se logro cambiar");
                }
            }
        }
    }

    private void lblMapMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMapMouseReleased
        String urlMaps = "http://maps.google.es/?q=13.6878647%20-89.2359979";
    }//GEN-LAST:event_lblMapMouseReleased

    private void lblSwitchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSwitchMouseReleased
        if (visibility == 0) {
            visibility = 1;
            switchVisibility();
        } else {
            visibility = 0;
            deleteImage();
            switchVisibility();
        }
    }//GEN-LAST:event_lblSwitchMouseReleased

    void deleteImage() {
        for (event e : classEvent.eventos) {
            if (e.getId() == classEvent.eventosShow.get(idEvent).getId()) {
                e.setMapImage(null);
                if (classEvent.deleteMapImage(e.getId())) {
                    standardization.showMessage("ok", "Lugar de evento eliminado");
                    lblMap.setText(pr.getProperty("lblMap"));
                    lblMap.setIcon(null);
                } else {
                    standardization.showMessage("cancel", "No se logro eliminar");
                }
            }
        }
    }

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
    private javax.swing.JLabel InvitesnumberEventInfo1;
    private javax.swing.JButton btnNext1;
    private javax.swing.JLabel iconGoogleMaps;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblMap;
    private javax.swing.JTextField lblPlace;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblSwitch;
    private javax.swing.JLabel lblplace;
    private javax.swing.JSeparator spEvent;
    // End of variables declaration//GEN-END:variables
}
