package eventOwner;

import java.awt.Dimension;
import java.awt.Image;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaClass.StaticMaps;
import javaClass.classEvent;
import javaClass.controller;
import javaClass.standardization;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import properties.propiedades;


public class placeMenu extends javax.swing.JPanel {

    void verificaridioma()
    {
        Properties pr=new propiedades(controller.idioma);
        lblplace1.setText(pr.getProperty("lblplace1"));
        lblMap.setText(pr.getProperty("lblMap"));
    }
    
    private StaticMaps ObjStaticMaps=new StaticMaps();
    
    public placeMenu(int idEvent, boolean googleMap) {
        initComponents();

        load(classEvent.eventosShow.get(idEvent).getPlace());
        verificaridioma();
    }
    
    void load(String direction){
        if(!direction.isEmpty()){
            if(classEvent.evento.getMapImage()!= null)
                lblMap.setIcon(standardization.getImgIcon(classEvent.evento.getMapImage()));
            else
                this.setPreferredSize(new Dimension(945,80));
            lblPlace.setText(direction);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMap = new javax.swing.JLabel();
        lblplace1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblPlace = new javax.swing.JLabel();

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

        lblplace1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblplace1.setForeground(new java.awt.Color(153, 153, 153));
        lblplace1.setText("Lugar del evento");

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));

        lblPlace.setText("Instituto Técnico Ricaldone");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblplace1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblplace1)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lblPlace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblMap;
    private javax.swing.JLabel lblPlace;
    private javax.swing.JLabel lblplace1;
    // End of variables declaration//GEN-END:variables
}
