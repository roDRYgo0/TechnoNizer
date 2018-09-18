package projectAdmin;

import java.awt.Color;
import javaClass.Project;
import javaClass.classProjects;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.event;
import javaClass.methodsSQL;
import javaClass.standardization;

public class pnPreferences extends javax.swing.JPanel {

    int idProject;
    
    public pnPreferences(int idProject) {
        initComponents();
        this.idProject = idProject;
        Project project = classProjects.projectsShow.get(idProject);
        txtName.setText(project.getName());
        txtDescription.setText(project.getDescription());
        member();
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
        classProjects.projectsShow.get(idProject).setColor(color);
        for(Project e : classProjects.projectsShow){
            if(e.getId() == classProjects.projectsShow.get(idProject).getId()){
                e.setColor(color);
                if(classProjects.updateColor(e.getId(), color))
                    standardization.showMessage("ok", "Color cambiado");
                else
                    standardization.showMessage("cancel", "No se logro cambiar el color");
            }
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
        jLabel9 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        btnNext = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(470, 450));
        setMinimumSize(new java.awt.Dimension(470, 450));
        setPreferredSize(new java.awt.Dimension(470, 450));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, -1));

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

        add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, -1, -1));

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

        add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Preferencias");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, -1, 30));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 42, 300, 10));

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

        add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, -1, -1));

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

        add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Nombre");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

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

        add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

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

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

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

        add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, -1));

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

        add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, -1, -1));

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

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

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

        add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, -1));

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

        add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

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

        add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, -1, -1));

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

        add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));

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

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Descripción");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        txtName.setAutoscrolls(false);
        txtName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 320, 28));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Color");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 390, 100));

        btnNext.setBackground(new java.awt.Color(33, 150, 243));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Guardar");
        btnNext.setBorderPainted(false);
        btnNext.setFocusable(false);
        btnNext.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnNext.setMaximumSize(new java.awt.Dimension(79, 28));
        btnNext.setMinimumSize(new java.awt.Dimension(79, 28));
        btnNext.setPreferredSize(new java.awt.Dimension(79, 28));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));
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

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        int id_project = classProjects.projectsShow.get(idProject).getId();
        if(methodsSQL.exists("SELECT name FROM projects WHERE name = ? AND id!=?", txtName.getText(), id_project)) {
            standardization.showMessage("cancel","Ya existe este proyecto");
        } else {
            
            classProjects.projectsShow.get(idProject).setName(txtName.getText());
            classProjects.projectsShow.get(idProject).setDescription(txtDescription.getText());
            
            classProjects.setName(txtName.getText());
            classProjects.setDescription(txtDescription.getText());
            classProjects.actualizar(id_project);
            
            standardization.showMessage("ok", "Cambios guardados");
        }
    }//GEN-LAST:event_btnNextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
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
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
