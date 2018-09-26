package jFrame;

import cards.CheckListItem;
import java.awt.Color;
import javaClass.Card;
import javaClass.CheckList;
import javaClass.classCards;
import javaClass.controller;
import javaClass.methodsSQL;
import javaClass.standardization;

/**
 * 
 * @author rodri
 */

public class updateCard extends javax.swing.JFrame {

    Card card;
    CheckList[] currentChecks;
    
    void verificaridioma()
    {
//        Properties pr = new propiedades(controller.idioma);
//        addprojectlbl.setText(pr.getProperty("addprojectlbl"));
//        Datageneraladdproject.setText(pr.getProperty("Datageneraladdproject"));
//        Nameprojectlbl.setText(pr.getProperty("Nameprojectlbl"));
//        descriptionproject.setText(pr.getProperty("descriptionproject"));
//        btnNext1Project.setText(pr.getProperty("btnNext1Project"));
    }
    
    public updateCard(int idcard) {
        initComponents();
        
        card = classCards.cards.get(idcard);
        txtTitle.setText(card.title);
        txtDescription.setText(card.description);
        
        currentChecks = CheckList.consultar(card.id);
        for(CheckList check : currentChecks) {
            CheckListItem item = new CheckListItem();
            item.setCheckList(check);
            item.onDeleting = () -> {
                checkList.remove(item);
                checkList.revalidate();
                checkList.repaint();
            };
            checkList.add(item);
        }
        
        checkList.revalidate();
        checkList.repaint();
        
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
        txtTitle = new javax.swing.JTextField();
        spProject = new javax.swing.JSeparator();
        btnNext1Project = new javax.swing.JButton();
        descriptionproject = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        descriptionproject1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        checkList = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(35, 150, 243));

        addprojectlbl.setForeground(new java.awt.Color(255, 255, 255));
        addprojectlbl.setText("Actualizar tarjeta");

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 405, -1));

        Datageneraladdproject.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Datageneraladdproject.setText("Datos Generales");
        jPanel1.add(Datageneraladdproject, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        Nameprojectlbl.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Nameprojectlbl.setForeground(new java.awt.Color(102, 102, 102));
        Nameprojectlbl.setText("Título de la tarjeta");
        jPanel1.add(Nameprojectlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        txtTitle.setAutoscrolls(false);
        txtTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtTitle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTitleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTitleFocusLost(evt);
            }
        });
        txtTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTitleKeyTyped(evt);
            }
        });
        jPanel1.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 249, 28));

        spProject.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(spProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 249, 10));

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
        jPanel1.add(btnNext1Project, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, 110, 48));

        descriptionproject.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        descriptionproject.setForeground(new java.awt.Color(102, 102, 102));
        descriptionproject.setText("Descripción");
        jPanel1.add(descriptionproject, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 380, -1));

        descriptionproject1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        descriptionproject1.setForeground(new java.awt.Color(102, 102, 102));
        descriptionproject1.setText("Actividades");
        jPanel1.add(descriptionproject1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        checkList.setBackground(new java.awt.Color(255, 255, 255));
        checkList.setMaximumSize(new java.awt.Dimension(380, 0));
        checkList.setMinimumSize(new java.awt.Dimension(380, 0));
        checkList.setLayout(new javax.swing.BoxLayout(checkList, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane2.setViewportView(checkList);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 380, 120));

        btnAdd.setBackground(new java.awt.Color(97, 189, 79));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Añadir item");
        btnAdd.setBorderPainted(false);
        btnAdd.setFocusable(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 100, 30));

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Borrar");
        btnDelete.setToolTipText("");
        btnDelete.setBorderPainted(false);
        btnDelete.setFocusable(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 110, 48));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        standardization.hide(controller.updateCr);
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtTitleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTitleFocusGained
        spProject.setBackground(Color.red);
    }//GEN-LAST:event_txtTitleFocusGained

    private void txtTitleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTitleFocusLost
        spProject.setBackground(Color.white);
    }//GEN-LAST:event_txtTitleFocusLost

    private void txtTitleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTitleKeyTyped
        char c = evt.getKeyChar();
        if(txtTitle.getText().length()<41){
            if(Character.isLetter(c) || Character.isSpaceChar(c) || Character.isDigit(c)){}
            else
                evt.consume();
        }else
            evt.consume();
    }//GEN-LAST:event_txtTitleKeyTyped

    private void btnNext1ProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ProjectActionPerformed
        if(standardization.campoVacio(txtTitle.getText()))
        {
            standardization.showMessage("warning","Hay campos vacios!",this);
        }else 
        {
            if(methodsSQL.exists("SELECT title FROM cards WHERE title = ? AND id!=?", txtTitle.getText(), card.id))
                standardization.showMessage("cancel","Ya existe esta tarjeta",this);
            else{
                CheckList[] items = new CheckList[checkList.getComponentCount()];
                
                for (int i = 0; i < checkList.getComponentCount(); i++) {
                    CheckList item = ((CheckListItem)checkList.getComponent(i)).getCheckList();
                    if (item.title.trim().isEmpty()) {
                        standardization.showMessage("warning","Hay campos vacios!",this);
                        return;
                    }
                    items[i] = item;
                }
                
                card.title = txtTitle.getText();
                card.description = txtDescription.getText();
                
                standardization.hide(controller.updateCr);
                controller.updateCrDetails = new UpdateCardDetails(card, items, currentChecks);
                standardization.show(controller.updateCrDetails);
                controller.rootFrame = controller.updateCrDetails;
            }
        }
    }//GEN-LAST:event_btnNext1ProjectActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        CheckListItem item = new CheckListItem();
        item.setCheckList(new CheckList());
        item.onDeleting = () -> {
            checkList.remove(item);
            checkList.revalidate();
            checkList.repaint();
        };
        checkList.add(item);
        checkList.revalidate();
        checkList.repaint();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        card.delete();
        standardization.hide(controller.updateCr);
        classCards.select();
        technonizer.TechnoNizer.home.showYourCards();
    }//GEN-LAST:event_btnDeleteActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Datageneraladdproject;
    private javax.swing.JLabel Nameprojectlbl;
    private javax.swing.JLabel addprojectlbl;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNext1Project;
    private javax.swing.JPanel checkList;
    private javax.swing.JLabel descriptionproject;
    private javax.swing.JLabel descriptionproject1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEvent;
    private javax.swing.JSeparator spProject;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables

}
