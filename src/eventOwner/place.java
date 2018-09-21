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
import javaClass.event;
import javaClass.standardization;



public class place extends javax.swing.JPanel {

    private StaticMaps ObjStaticMaps=new StaticMaps();
    
    int idEvent;
    
    public place(int idEvent) {
        initComponents();
        this.idEvent = idEvent;
        load(classEvent.eventosShow.get(idEvent).getPlace());
    }
    
    void load(String direction){
        if(!direction.isEmpty()){
            try {
                this.lblPlace.setText(direction);
                this.lblMap.setText("");
                Image imagenMapa=ObjStaticMaps.getStaticMap(direction,
                        Integer.valueOf(16),new Dimension(473,173),2,StaticMaps.Format.png,
                        StaticMaps.Maptype.roadmap);
                if(imagenMapa!=null){
                    ImageIcon imgIcon=new ImageIcon(imagenMapa);
                    Icon iconImage=(Icon)imgIcon;
                    lblMap.setIcon(iconImage);
                }
            } catch (MalformedURLException ex) {
                Logger.getLogger(place.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(place.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMap = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblPlace = new javax.swing.JTextField();
        spEvent = new javax.swing.JSeparator();
        btnNext1 = new javax.swing.JButton();

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

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Lugar del evento");

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
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(lblPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnNext1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(spEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblPlaceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblPlaceFocusGained
        spEvent.setBackground(Color.red);
    }//GEN-LAST:event_lblPlaceFocusGained

    private void lblPlaceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblPlaceFocusLost
        spEvent.setBackground(Color.white);
        if(lblPlace.getText().trim().length() < 4 && lblPlace.getText().trim().length() > 0){
            standardization.showMessage("cancel", "Lugar invalido");
            lblPlace.setText("");
        }
    }//GEN-LAST:event_lblPlaceFocusLost

    private void lblPlaceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblPlaceKeyTyped
        char c = evt.getKeyChar();
        if(lblPlace.getText().length()<200){
            if(Character.isLetter(c) || Character.isSpaceChar(c) || Character.isDigit(c)){}
            else
            evt.consume();
        }else
        evt.consume();
    }//GEN-LAST:event_lblPlaceKeyTyped

    private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ActionPerformed
        if(!lblPlace.getText().isEmpty() || lblPlace.getText().trim().length() < 4){
            try {
                this.lblMap.setText("");
                Image imagenMapa=ObjStaticMaps.getStaticMap(lblPlace.getText(),
                        Integer.valueOf(16),new Dimension(473,173),2,StaticMaps.Format.png,
                        StaticMaps.Maptype.roadmap);
                if(imagenMapa!=null){
                    ImageIcon imgIcon=new ImageIcon(imagenMapa);
                    Icon iconImage=(Icon)imgIcon;
                    lblMap.setIcon(iconImage);
                    changePlace(lblPlace.getText());
   
                }
            } catch (MalformedURLException ex) {
                Logger.getLogger(place.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(place.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnNext1ActionPerformed

    void changePlace(String place){
        classEvent.eventosShow.get(idEvent).setPlace(place);
        for(event e : classEvent.eventos){
            if(e.getId() == classEvent.eventosShow.get(idEvent).getId()){
                e.setPlace(place);
                if(classEvent.updatePlace(e.getId(), place))
                    standardization.showMessage("ok", "Lugar de evento cambiado");
                else
                    standardization.showMessage("cancel", "No se logro cambiar");
            }
        }
    }
    
    private void lblMapMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMapMouseReleased
        String urlMaps = "http://maps.google.es/?q=13.6878647%20-89.2359979";
    }//GEN-LAST:event_lblMapMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblMap;
    private javax.swing.JTextField lblPlace;
    private javax.swing.JSeparator spEvent;
    // End of variables declaration//GEN-END:variables
}
