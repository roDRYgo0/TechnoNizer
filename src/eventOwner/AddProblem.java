package eventOwner;

import java.awt.Color;
import javaClass.classEvent;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.standardization;


public class AddProblem extends javax.swing.JFrame {

    int idEvent;
    int visibility;
    int horary;
    int groupDanger;
    
    public AddProblem(int idEvent){
        initComponents();
        this.idEvent = idEvent;
        visibility = 1;
        groupDanger = 1;
        horary = 0;
        load();
        txtProblem.setLineWrap(true);
        
    }   

    void load(){
        iconPlace.setIcon(new controller().changeImage("/imagenes/place.png", 35, 35));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        groupDang = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        lblEvent = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnNext1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtPlace = new javax.swing.JTextField();
        spPlace = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        iconPlace = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtProblem = new javax.swing.JTextArea();
        rbtnLeve = new javax.swing.JRadioButton();
        rbtnGrave = new javax.swing.JRadioButton();
        rbtnMuyGrave = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(35, 150, 243));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Agregar problema");

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

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Lugar del problema");

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

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Problema");

        iconPlace.setMaximumSize(new java.awt.Dimension(35, 35));
        iconPlace.setMinimumSize(new java.awt.Dimension(35, 35));
        iconPlace.setPreferredSize(new java.awt.Dimension(35, 35));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtProblem.setRows(2);
        txtProblem.setAutoscrolls(false);
        txtProblem.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtProblem.setMaximumSize(new java.awt.Dimension(508, 2147483647));
        txtProblem.setMinimumSize(new java.awt.Dimension(436, 60));
        txtProblem.setPreferredSize(new java.awt.Dimension(436, 60));
        txtProblem.setVerifyInputWhenFocusTarget(false);
        txtProblem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProblemKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtProblem);

        rbtnLeve.setBackground(new java.awt.Color(255, 255, 255));
        groupDang.add(rbtnLeve);
        rbtnLeve.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbtnLeve.setSelected(true);
        rbtnLeve.setText("Leve");
        rbtnLeve.setToolTipText("");
        rbtnLeve.setFocusPainted(false);
        rbtnLeve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnLeveActionPerformed(evt);
            }
        });

        rbtnGrave.setBackground(new java.awt.Color(255, 255, 255));
        groupDang.add(rbtnGrave);
        rbtnGrave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbtnGrave.setText("Grave");
        rbtnGrave.setToolTipText("");
        rbtnGrave.setFocusPainted(false);
        rbtnGrave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnGraveActionPerformed(evt);
            }
        });

        rbtnMuyGrave.setBackground(new java.awt.Color(255, 255, 255));
        groupDang.add(rbtnMuyGrave);
        rbtnMuyGrave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbtnMuyGrave.setText("Muy grave");
        rbtnMuyGrave.setToolTipText("");
        rbtnMuyGrave.setFocusPainted(false);
        rbtnMuyGrave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMuyGraveActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Importancia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(343, 343, 343))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(iconPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spPlace)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(rbtnLeve, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rbtnGrave, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rbtnMuyGrave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(iconPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(spPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnLeve)
                    .addComponent(rbtnGrave)
                    .addComponent(rbtnMuyGrave))
                .addGap(7, 7, 7)
                .addComponent(btnNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
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

    private void txtProblemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProblemKeyReleased

    }//GEN-LAST:event_txtProblemKeyReleased

    private void txtPlaceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlaceKeyTyped
        char c = evt.getKeyChar();
        if(txtPlace.getText().length()<80){
            if(Character.isLetter(c) || Character.isSpaceChar(c) || Character.isDigit(c)){}
            else
            evt.consume();
        }else
        evt.consume();
    }//GEN-LAST:event_txtPlaceKeyTyped

    private void txtPlaceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlaceFocusLost
        spPlace.setBackground(Color.white);
        if(txtPlace.getText().trim().length() < 6 && !txtPlace.getText().trim().isEmpty()){
            standardization.showMessage("cancel", "Lugar invalido", this);
            txtPlace.setText("");
        }
    }//GEN-LAST:event_txtPlaceFocusLost

    private void txtPlaceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlaceFocusGained
        spPlace.setBackground(Color.RED);
    }//GEN-LAST:event_txtPlaceFocusGained

    private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ActionPerformed
        if(!camposVacios()){
            String place = txtPlace.getText();
            String problem = txtProblem.getText();
            String dateTime = standardization.currentDateTimeSQL();
            int id = classEvent.eventosShow.get(idEvent).getId();
            if(classEvent.insertProblem(problem, place, dateTime, groupDanger, 0, classUsuario.getNickname(), id)){
                classEvent.problems.clear();
                classEvent.selectProblems(classEvent.eventosShow.get(idEvent).getId());
                technonizer.TechnoNizer.home.showEventProblemsOwner(idEvent);
                controller.rootFrame = technonizer.TechnoNizer.home;
                standardization.hide(this);
                standardization.showMessage("ok","Problema ingresada");
            }
            else
            standardization.showMessage("cancel","No se logro ingresar", this);
        }else
        standardization.showMessage("warning","Campos vacios", this);
        
           
    }//GEN-LAST:event_btnNext1ActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        controller.rootFrame = technonizer.TechnoNizer.home;
        standardization.hide(this);
    }//GEN-LAST:event_btnNextActionPerformed

    private void rbtnLeveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnLeveActionPerformed
        groupDanger = 1;
    }//GEN-LAST:event_rbtnLeveActionPerformed

    private void rbtnGraveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnGraveActionPerformed
        groupDanger = 2;
    }//GEN-LAST:event_rbtnGraveActionPerformed

    private void rbtnMuyGraveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMuyGraveActionPerformed
        groupDanger = 3;
    }//GEN-LAST:event_rbtnMuyGraveActionPerformed

    boolean camposVacios(){
        if(txtPlace.getText().trim().isEmpty() || txtProblem.getText().trim().isEmpty())
            return true;
        else
            return false;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNext1;
    private javax.swing.ButtonGroup groupDang;
    private javax.swing.JLabel iconPlace;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEvent;
    private javax.swing.JRadioButton rbtnGrave;
    private javax.swing.JRadioButton rbtnLeve;
    private javax.swing.JRadioButton rbtnMuyGrave;
    private javax.swing.JSeparator spPlace;
    private javax.swing.JTextField txtPlace;
    private javax.swing.JTextArea txtProblem;
    // End of variables declaration//GEN-END:variables

}
