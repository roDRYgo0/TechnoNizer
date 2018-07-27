package JPanel;

import javaClass.classReminder;
import javaClass.standardization;
import javax.swing.JOptionPane;
import technonizer.TechnoNizer;

public class jpReminder extends javax.swing.JPanel {

    /**
     * Creates new form jpProjects
     */
    public jpReminder() {
        initComponents();
        tbReminder.setModel(classReminder.cargarReminder());
        txtId1.setVisible(false);
        labelId.setVisible(false);
        ButDelete.setVisible(false);
        jBInsertar1.setVisible(false);
        jBInsertar.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        txtReminder1.setVisible(false);
        txtFecha1.setVisible(false);
        txtHora1.setVisible(false);
        
   
    }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbReminder = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtReminder1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFecha1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtHora1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jBInsertar = new javax.swing.JButton();
        txtId1 = new javax.swing.JTextField();
        labelId = new javax.swing.JLabel();
        jBInsertar1 = new javax.swing.JButton();
        ButDelete = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(980, 601));
        setMinimumSize(new java.awt.Dimension(980, 601));
        setPreferredSize(new java.awt.Dimension(980, 601));

        btnAgregar.setBackground(new java.awt.Color(255, 0, 0));
        btnAgregar.setText("AGREGAR RECORDATORIO");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tbReminder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbReminder);

        jLabel2.setText("Recordatorio:");

        jLabel3.setText("Fecha de Recordatorio: ");

        jLabel4.setText("Repetir dentro de ");

        txtHora1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHora1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHora1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHora1KeyTyped(evt);
            }
        });

        jLabel5.setText("horas");

        jBInsertar.setText("Modificar");
        jBInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInsertarActionPerformed(evt);
            }
        });

        labelId.setText("Id:");

        jBInsertar1.setText("Guardar");
        jBInsertar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInsertar1ActionPerformed(evt);
            }
        });

        ButDelete.setText("ELIMINAR RECORDATORIO");
        ButDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelId, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBInsertar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtReminder1)
                                .addComponent(txtFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtHora1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addComponent(jBInsertar1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtId1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButDelete)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelId)
                            .addComponent(ButDelete))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtReminder1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtHora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBInsertar1)
                            .addComponent(jBInsertar))
                        .addContainerGap())))
        );

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setText("ELIMINAR RECORDATORIO");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(255, 51, 51));
        btnActualizar.setText("ACTUALIZAR RECORDATORIO");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agenda");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 364, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
      jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        ButDelete.setVisible(false);
        txtReminder1.setVisible(true);
        txtFecha1.setVisible(true);
        txtHora1.setVisible(true);
        jBInsertar1.setVisible(true);
        jBInsertar.setVisible(false);
        txtId1.setVisible(false);
        labelId.setVisible(false);
        ButDelete.setVisible(false);
        
        
        
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       txtId1.setVisible(true);
        labelId.setVisible(true);
        ButDelete.setVisible(true);
        
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        txtReminder1.setVisible(false);
        txtFecha1.setVisible(false);
        txtHora1.setVisible(false);
        jBInsertar1.setVisible(false);
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
      txtId1.setVisible(true);
      ButDelete.setVisible(false);
        labelId.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        txtReminder1.setVisible(true);
        txtFecha1.setVisible(true);
        txtHora1.setVisible(true);            
        jBInsertar.setVisible(true);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jBInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInsertarActionPerformed

        if(txtFecha1.getText().isEmpty() || txtReminder1.getText().isEmpty()|| txtHora1.getText().isEmpty() || txtId1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Campos vacios");
        } else{
            classReminder.setId((Integer.parseInt(txtId1.getText())));
            classReminder.setReminder((txtReminder1.getText()));
            classReminder.setDatetime((txtFecha1.getText()));
            classReminder.setRepeat((Integer.parseInt(txtHora1.getText())));

            if(classReminder.updatereminder()){
                JOptionPane.showMessageDialog(this, "Recordatorio actualizado");
                txtId1.setVisible(false);
        labelId.setVisible(false);
        ButDelete.setVisible(false);
                 jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        txtReminder1.setVisible(false);
        txtFecha1.setVisible(false);
        txtHora1.setVisible(false);
        jBInsertar.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(this, "Error al actualizar recordatorio");
            }

        }
        tbReminder.setModel(classReminder.cargarReminder());
    }//GEN-LAST:event_jBInsertarActionPerformed

    private void txtHora1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHora1KeyTyped
        char c=evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtHora1KeyTyped

    private void txtHora1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHora1KeyReleased

    }//GEN-LAST:event_txtHora1KeyReleased

    private void txtHora1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHora1KeyPressed
        // TODO add your handling code here:zzz
    }//GEN-LAST:event_txtHora1KeyPressed

    private void jBInsertar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInsertar1ActionPerformed

        if(txtFecha1.getText().isEmpty() || txtReminder1.getText().isEmpty()|| txtHora1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Campos vacios");
        } else{

            classReminder.setReminder((txtReminder1.getText()));
            classReminder.setDatetime((txtFecha1.getText()));
            classReminder.setRepeat((Integer.parseInt(txtHora1.getText())));

            if(classReminder.insert()){
                JOptionPane.showMessageDialog(this, "Recordatorio Guardado");
                 jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        txtReminder1.setVisible(false);
        txtFecha1.setVisible(false);
        txtHora1.setVisible(false);
        jBInsertar1.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(this, "Error al guardar recordatorio");
            }

        }

        tbReminder.setModel(classReminder.cargarReminder());
    }//GEN-LAST:event_jBInsertar1ActionPerformed

    private void ButDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButDeleteActionPerformed

        if(txtId1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Campos vacios");
        } else{

            classReminder.setId((Integer.parseInt(txtId1.getText())));

            int eliminar = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar?","Atención", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (eliminar==0){
                if(classReminder.deleteReminder()){
                    standardization.showMessage("ok", "Datos Eliminados");
                    labelId.setVisible(false);
                    txtId1.setVisible(false);
                    ButDelete.setVisible(false);
                }else{
                    standardization.showMessage("warning", "Error al eliminar los datos");
                    labelId.setVisible(false);
                    ButDelete.setVisible(false);
                }
            }

        }

        tbReminder.setModel(classReminder.cargarReminder());
    }//GEN-LAST:event_ButDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButDelete;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton jBInsertar;
    private javax.swing.JButton jBInsertar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelId;
    private javax.swing.JTable tbReminder;
    private javax.swing.JTextField txtFecha1;
    private javax.swing.JTextField txtHora1;
    private javax.swing.JTextField txtId1;
    private javax.swing.JTextField txtReminder1;
    // End of variables declaration//GEN-END:variables
}
