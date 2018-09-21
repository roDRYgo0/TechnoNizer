package jFrame;

import java.awt.Color;
import java.util.Properties;
import javaClass.classProjects;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.methodsSQL;
import javaClass.standardization;
import properties.propiedades;

/**
 * 
 * @author rodri
 */

public class addProject extends javax.swing.JFrame {

    void verificaridioma()
    {
    Properties pr = new propiedades(controller.idioma);
    addprojectlbl.setText(pr.getProperty("addprojectlbl"));
    Datageneraladdproject.setText(pr.getProperty("Datageneraladdproject"));
    Nameprojectlbl.setText(pr.getProperty("Nameprojectlbl"));
    descriptionproject.setText(pr.getProperty("descriptionproject"));
    btnNext1Project.setText(pr.getProperty("btnNext1Project"));
    }
    byte[] cover;

    public addProject() {
        initComponents();
        verificaridioma();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        addprojectlbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        lblEvent = new javax.swing.JLabel();
        Datageneraladdproject = new javax.swing.JLabel();
        Nameprojectlbl = new javax.swing.JLabel();
        txtProject = new javax.swing.JTextField();
        spProject = new javax.swing.JSeparator();
        btnNext1Project = new javax.swing.JButton();
        descriptionproject = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(35, 150, 243));

        addprojectlbl.setForeground(new java.awt.Color(255, 255, 255));
        addprojectlbl.setText("Agregar proyecto");

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
                        .addComponent(addprojectlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(addprojectlbl))
                .addContainerGap())
        );

        Datageneraladdproject.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Datageneraladdproject.setText("Datos Generales");

        Nameprojectlbl.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Nameprojectlbl.setForeground(new java.awt.Color(102, 102, 102));
        Nameprojectlbl.setText("Nombre del proyecto");

        txtProject.setAutoscrolls(false);
        txtProject.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtProject.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtProjectFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProjectFocusLost(evt);
            }
        });
        txtProject.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProjectKeyTyped(evt);
            }
        });

        spProject.setForeground(new java.awt.Color(204, 204, 204));

        btnNext1Project.setBackground(new java.awt.Color(0, 153, 255));
        btnNext1Project.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext1Project.setForeground(new java.awt.Color(255, 255, 255));
        btnNext1Project.setText("Siguiente");
        btnNext1Project.setBorderPainted(false);
        btnNext1Project.setFocusable(false);
        btnNext1Project.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext1ProjectActionPerformed(evt);
            }
        });

        descriptionproject.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        descriptionproject.setForeground(new java.awt.Color(102, 102, 102));
        descriptionproject.setText("Descripción del proyecto");

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Datageneraladdproject)
                        .addContainerGap(302, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(271, 271, 271)
                                .addComponent(btnNext1Project, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(spProject)
                                .addComponent(txtProject, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Nameprojectlbl)
                            .addComponent(descriptionproject))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(Datageneraladdproject)
                .addGap(18, 18, 18)
                .addComponent(Nameprojectlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProject, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(spProject, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(descriptionproject)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(btnNext1Project, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        controller.rootFrame = technonizer.TechnoNizer.home;
        standardization.hide(controller.addPj);
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtProjectFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProjectFocusGained
        spProject.setBackground(Color.red);
    }//GEN-LAST:event_txtProjectFocusGained

    private void txtProjectFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProjectFocusLost
        spProject.setBackground(Color.white);
    }//GEN-LAST:event_txtProjectFocusLost

    private void txtProjectKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProjectKeyTyped
        char c = evt.getKeyChar();
        if(txtProject.getText().length()<41){
            if(Character.isLetter(c) || Character.isSpaceChar(c) || Character.isDigit(c)){}
            else
                evt.consume();
        }else
            evt.consume();
    }//GEN-LAST:event_txtProjectKeyTyped

    private void btnNext1ProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ProjectActionPerformed
        if(standardization.campoVacio(txtProject.getText()))
        {
            standardization.showMessage("warning","Hay campos vacios!",this);
        }else 
        {
            classProjects.setName(txtProject.getText());
            classProjects.setDescription(txtDescription.getText());
            classProjects.setCoverImage(cover);

            if(methodsSQL.exists("SELECT name FROM projects WHERE name = ?", txtProject.getText()))
                standardization.showMessage("cancel","Ya existe este proyecto",this);
            else{
                standardization.hide(controller.addPj);
                controller.addPjDetails = new AddProjectDetails();
                standardization.show(controller.addPjDetails);
                controller.rootFrame = controller.addPjDetails;
            }
        }
    }//GEN-LAST:event_btnNext1ProjectActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Datageneraladdproject;
    private javax.swing.JLabel Nameprojectlbl;
    private javax.swing.JLabel addprojectlbl;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNext1Project;
    private javax.swing.JLabel descriptionproject;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEvent;
    private javax.swing.JSeparator spProject;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtProject;
    // End of variables declaration//GEN-END:variables

}
