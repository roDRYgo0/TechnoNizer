package eventAdmin;

import java.awt.Color;
import javaClass.classEvent;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.event;
import javaClass.standardization;

public class pnPreferences extends javax.swing.JPanel {

    int idEvent;
    int visibility;
    
    public pnPreferences(int idEvent) {
        initComponents();
        this.idEvent = idEvent;
        visibility = classEvent.eventosShow.get(idEvent).getVisibility();
        switchVisibility();     
        member();
        invitation();
        
    }
    
    void invitation(){
        switch(classEvent.eventosShow.get(idEvent).getInvitation()){
            case 1:
                rbtnPublico.setSelected(true);
                break;
            case 2:
                rbtnSolicitud.setSelected(true);
                break;
            case 3:
                rbtnInvitacion.setSelected(true);
                break;
        }
    }
    
    void member(){
        switch(classUsuario.getIdMemberships()){
            case 1:
                jPanel4.setBackground(Color.white);
                jPanel5.setBackground(Color.white);
                jPanel6.setBackground(Color.white);
                jPanel7.setBackground(Color.white);
                jPanel15.setBackground(Color.white);
                jPanel11.setBackground(Color.white);
                jPanel12.setBackground(Color.white);
                jPanel13.setBackground(Color.white);
                jPanel14.setBackground(Color.white);
                jPanel18.setBackground(Color.white);
                jPanel19.setBackground(Color.white);
                jPanel20.setBackground(Color.white);
                jPanel21.setBackground(Color.white);
                jPanel22.setBackground(Color.white);
                break;
            case 2:
                jPanel11.setBackground(Color.white);
                jPanel12.setBackground(Color.white);
                jPanel13.setBackground(Color.white);
                jPanel14.setBackground(Color.white);
                jPanel15.setBackground(Color.white);
                jPanel18.setBackground(Color.white);
                jPanel19.setBackground(Color.white);
                jPanel20.setBackground(Color.white);
                jPanel21.setBackground(Color.white);
                jPanel22.setBackground(Color.white);
                break;
                
        }
    }
    
    
    void changeColor(String color){
        classEvent.eventosShow.get(idEvent).setColor(color);
        for(event e : classEvent.eventos){
            if(e.getId() == classEvent.eventosShow.get(idEvent).getId()){
                e.setColor(color);
                if(classEvent.updateColor(e.getId(), color))
                    standardization.showMessage("ok", "Color cambiado");
                else
                    standardization.showMessage("cancel", "No se logro cambiar el color");
            }
        }
    }
    
    void changeInvitation(int invitation){
        classEvent.eventosShow.get(idEvent).setInvitation(invitation);
        for(event e : classEvent.eventos){
            if(e.getId() == classEvent.eventosShow.get(idEvent).getId()){
                e.setInvitation(invitation);
                if(classEvent.updateInvitation(e.getId(), invitation))
                    standardization.showMessage("ok", "Invitación cambiada");
                else
                    standardization.showMessage("cancel", "No se logro cambiar el color");
            }
        }
    }
    
    void changeVisibility(int visibility){
        classEvent.eventosShow.get(idEvent).setVisibility(visibility);
        for(event e : classEvent.eventos){
            if(e.getId() == classEvent.eventosShow.get(idEvent).getId()){
                e.setVisibility(visibility);
                if(classEvent.updateVisibility(e.getId(), visibility))
                    standardization.showMessage("ok", "Visibilidad cambiada");
                else
                    standardization.showMessage("cancel", "No se logro cambiar");
            }
        }
    }
    
    void switchVisibility(){
        switch(visibility){
            case 0:
                lblVisibility.setText("Invisible");
                lblVisibility.setForeground(new Color(255,61,0));
                lblSwitch.setIcon(new controller().changeImage("/imagenes/toggleOff.png", 60, 60));
                break;
            case 1:
                lblVisibility.setText("Visible");
                lblVisibility.setForeground(new Color(139, 195, 74));
                lblSwitch.setIcon(new controller().changeImage("/imagenes/toggleOn.png", 60, 60));
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

        groupInvitation = new javax.swing.ButtonGroup();
        jPanel6 = new javax.swing.JPanel();
        icon4 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        icon12 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        icon9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel22 = new javax.swing.JPanel();
        icon15 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        icon5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        icon6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        icon2 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        icon13 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        icon10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        icon3 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        icon7 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        icon11 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        icon14 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        icon8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        icon1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblVisibility = new javax.swing.JLabel();
        lblSwitch = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rbtnPublico = new javax.swing.JRadioButton();
        rbtnSolicitud = new javax.swing.JRadioButton();
        rbtnInvitacion = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(470, 400));
        setMinimumSize(new java.awt.Dimension(470, 400));
        setPreferredSize(new java.awt.Dimension(470, 400));

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

        jPanel13.setBackground(new java.awt.Color(102, 102, 102));
        jPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel13MouseReleased(evt);
            }
        });

        icon9.setMaximumSize(new java.awt.Dimension(30, 30));
        icon9.setMinimumSize(new java.awt.Dimension(30, 30));
        icon9.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(icon9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Preferencias");

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));

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

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Color");

        jPanel15.setBackground(new java.awt.Color(204, 0, 0));
        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel15MouseReleased(evt);
            }
        });

        icon6.setMaximumSize(new java.awt.Dimension(30, 30));
        icon6.setMinimumSize(new java.awt.Dimension(30, 30));
        icon6.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(icon6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jPanel14.setBackground(new java.awt.Color(102, 0, 255));
        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel14MouseReleased(evt);
            }
        });

        icon10.setMaximumSize(new java.awt.Dimension(30, 30));
        icon10.setMinimumSize(new java.awt.Dimension(30, 30));
        icon10.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(icon10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jPanel11.setBackground(new java.awt.Color(179, 19, 179));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel11MouseReleased(evt);
            }
        });

        icon7.setMaximumSize(new java.awt.Dimension(30, 30));
        icon7.setMinimumSize(new java.awt.Dimension(30, 30));
        icon7.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(icon7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jPanel12.setBackground(new java.awt.Color(217, 99, 23));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel12MouseReleased(evt);
            }
        });

        icon8.setMaximumSize(new java.awt.Dimension(30, 30));
        icon8.setMinimumSize(new java.awt.Dimension(30, 30));
        icon8.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(icon8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Visibilidad");

        lblVisibility.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblVisibility.setText("Visible");

        lblSwitch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSwitchMouseReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Tipo de assistencia");

        rbtnPublico.setBackground(new java.awt.Color(255, 255, 255));
        groupInvitation.add(rbtnPublico);
        rbtnPublico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbtnPublico.setText("Público");
        rbtnPublico.setToolTipText("");
        rbtnPublico.setFocusPainted(false);
        rbtnPublico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnPublicoActionPerformed(evt);
            }
        });

        rbtnSolicitud.setBackground(new java.awt.Color(255, 255, 255));
        groupInvitation.add(rbtnSolicitud);
        rbtnSolicitud.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbtnSolicitud.setText("Solicitud");
        rbtnSolicitud.setToolTipText("");
        rbtnSolicitud.setFocusPainted(false);
        rbtnSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSolicitudActionPerformed(evt);
            }
        });

        rbtnInvitacion.setBackground(new java.awt.Color(255, 255, 255));
        groupInvitation.add(rbtnInvitacion);
        rbtnInvitacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbtnInvitacion.setText("Por invitación");
        rbtnInvitacion.setToolTipText("");
        rbtnInvitacion.setFocusPainted(false);
        rbtnInvitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnInvitacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtnPublico, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnInvitacion))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(lblVisibility, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblVisibility)
                        .addGap(11, 11, 11))
                    .addComponent(lblSwitch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnPublico)
                    .addComponent(rbtnSolicitud)
                    .addComponent(rbtnInvitacion))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseReleased
        if(classUsuario.getIdMemberships() == 2 || classUsuario.getIdMemberships() == 3){
            disable();
            icon4.setIcon(new controller().changeImage("/imagenes/ok.png", 30, 30));
            changeColor("24 78 186");
        }
    }//GEN-LAST:event_jPanel6MouseReleased

    private void jPanel19MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MouseReleased
        if(classUsuario.getIdMemberships() == 3){
            disable();
            icon12.setIcon(new controller().changeImage("/imagenes/ok.png", 30, 30));
            changeColor("129 61 0");
        }
    }//GEN-LAST:event_jPanel19MouseReleased

    private void jPanel13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseReleased
        if(classUsuario.getIdMemberships() == 3){
            disable();
            icon9.setIcon(new controller().changeImage("/imagenes/ok.png", 30, 30));
            changeColor("102 102 102");
        }
    }//GEN-LAST:event_jPanel13MouseReleased

    private void jPanel22MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseReleased
        if(classUsuario.getIdMemberships() == 3){
            disable();
            icon15.setIcon(new controller().changeImage("/imagenes/ok.png", 30, 30));
            changeColor("0 102 0");
        }
    }//GEN-LAST:event_jPanel22MouseReleased

    private void jPanel7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseReleased
        if(classUsuario.getIdMemberships() == 2 || classUsuario.getIdMemberships() == 3){
            disable();
            icon5.setIcon(new controller().changeImage("/imagenes/ok.png", 30, 30));
            changeColor("166 166 29");
        }
    }//GEN-LAST:event_jPanel7MouseReleased

    private void jPanel15MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseReleased
        if(classUsuario.getIdMemberships() == 3){
            disable();
            icon6.setIcon(new controller().changeImage("/imagenes/ok.png", 30, 30));
            changeColor("204 0 0");
        }

    }//GEN-LAST:event_jPanel15MouseReleased

    private void jPanel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseReleased
        if(classUsuario.getIdMemberships() == 2 || classUsuario.getIdMemberships() == 3){
            disable();
            icon2.setIcon(new controller().changeImage("/imagenes/ok.png", 30, 30));
            changeColor("0 153 0");
        }
    }//GEN-LAST:event_jPanel4MouseReleased

    private void jPanel20MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel20MouseReleased
        if(classUsuario.getIdMemberships() == 3){
            disable();
            icon13.setIcon(new controller().changeImage("/imagenes/ok.png", 30, 30));
            changeColor("102 102 255");
        }
    }//GEN-LAST:event_jPanel20MouseReleased

    private void jPanel14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseReleased
        if(classUsuario.getIdMemberships() == 3){
            disable();
            icon10.setIcon(new controller().changeImage("/imagenes/ok.png", 30, 30));
            changeColor("102 0 255");
        }
    }//GEN-LAST:event_jPanel14MouseReleased

    private void jPanel5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseReleased
        if(classUsuario.getIdMemberships() == 2 || classUsuario.getIdMemberships() == 3){
            disable();
            icon3.setIcon(new controller().changeImage("/imagenes/ok.png", 30, 30));
            changeColor("239 110 239");
        }
    }//GEN-LAST:event_jPanel5MouseReleased

    private void jPanel11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseReleased
        if(classUsuario.getIdMemberships() == 3){
            disable();
            icon7.setIcon(new controller().changeImage("/imagenes/ok.png", 30, 30));
            changeColor("179 19 179");
        }
    }//GEN-LAST:event_jPanel11MouseReleased

    private void jPanel18MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseReleased
        if(classUsuario.getIdMemberships() == 3){
            disable();
            icon11.setIcon(new controller().changeImage("/imagenes/ok.png", 30, 30));
            changeColor("153 0 51");
        }
    }//GEN-LAST:event_jPanel18MouseReleased

    private void jPanel21MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseReleased
        if(classUsuario.getIdMemberships() == 3){
            disable();
            icon14.setIcon(new controller().changeImage("/imagenes/ok.png", 30, 30));
            changeColor("0 204 204");
        }
    }//GEN-LAST:event_jPanel21MouseReleased

    private void jPanel12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseReleased
        if(classUsuario.getIdMemberships() == 3){
            disable();
            icon8.setIcon(new controller().changeImage("/imagenes/ok.png", 30, 30));
            changeColor("217 99 23");
        }
    }//GEN-LAST:event_jPanel12MouseReleased

    private void jPanel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseReleased
        disable();
        icon1.setIcon(new controller().changeImage("/imagenes/ok.png", 30, 30));
        changeColor("35 150 243");
    }//GEN-LAST:event_jPanel3MouseReleased

    private void lblSwitchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSwitchMouseReleased
        if(visibility == 0){
            visibility = 1;
            changeVisibility(visibility);
            switchVisibility();
        }else{
            visibility = 0;
            changeVisibility(visibility);
            switchVisibility();
        }
    }//GEN-LAST:event_lblSwitchMouseReleased

    private void rbtnPublicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnPublicoActionPerformed
        changeInvitation(1);
    }//GEN-LAST:event_rbtnPublicoActionPerformed

    private void rbtnSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSolicitudActionPerformed
        changeInvitation(2);
    }//GEN-LAST:event_rbtnSolicitudActionPerformed

    private void rbtnInvitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnInvitacionActionPerformed
        changeInvitation(3);
    }//GEN-LAST:event_rbtnInvitacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup groupInvitation;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblSwitch;
    private javax.swing.JLabel lblVisibility;
    private javax.swing.JRadioButton rbtnInvitacion;
    private javax.swing.JRadioButton rbtnPublico;
    private javax.swing.JRadioButton rbtnSolicitud;
    // End of variables declaration//GEN-END:variables
}
