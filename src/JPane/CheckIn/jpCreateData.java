package JPane.CheckIn;

import static JPane.jpAccess.jpCU;
import jFrame.*;
import java.awt.BorderLayout;
import javaClass.*;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class jpCreateData extends javax.swing.JPanel {

    private JPanel rootPane;
    
    public jpCreateData(JPanel rootPane) {
        initComponents();
        this.rootPane = rootPane;
        
        loadData();
        cargarComboBox();
    }

    //<editor-fold defaultstate="collapsed" desc="compiled code">
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        spName = new javax.swing.JSeparator();
        txtName = new javax.swing.JTextField();
        spLastName = new javax.swing.JSeparator();
        txtLastName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dpDate = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        spDate = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox<>();
        lblImage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(420, 603));
        setMinimumSize(new java.awt.Dimension(420, 603));
        setPreferredSize(new java.awt.Dimension(420, 603));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("¡Háblanos más sobre ti!");

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnBack.setText("Atras");
        btnBack.setBorderPainted(false);
        btnBack.setFocusable(false);
        btnBack.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(0, 153, 255));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Siguiente");
        btnNext.setBorderPainted(false);
        btnNext.setFocusable(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Nombres");

        spName.setForeground(new java.awt.Color(204, 204, 204));

        txtName.setAutoscrolls(false);
        txtName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });

        spLastName.setForeground(new java.awt.Color(204, 204, 204));

        txtLastName.setAutoscrolls(false);
        txtLastName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtLastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLastNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLastNameFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Apellidos");

        dpDate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        dpDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MM-yyyy"))));
        dpDate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dpDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dpDateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dpDateFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Fecha de nacimento");

        spDate.setForeground(new java.awt.Color(204, 204, 204));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Género");

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setText("Not Found");
        lblImage.setMaximumSize(new java.awt.Dimension(150, 150));
        lblImage.setMinimumSize(new java.awt.Dimension(150, 150));
        lblImage.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtLastName)
                                .addComponent(spLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                                .addComponent(spName))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(spDate, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dpDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                                .addGap(34, 34, 34)
                                .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(55, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(spName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(spLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(spDate, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents
    //</editor-fold>
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        jpCU.setSize(420,603);
        jpCU.setLocation(0,0);
        rootPane.removeAll();
        rootPane.add(jpCU,BorderLayout.CENTER);
        rootPane.revalidate();
        rootPane.repaint();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if(logIn.internet && !camposVacios())
        {
            jpMembership jpM = new jpMembership(rootPane);
            
            classUsuario.setFirstName(txtName.getText());
            classUsuario.setLastName(txtLastName.getText());
            classUsuario.setBirthdate(dpDate.getText());
            classUsuario.setId_gender(methodsSQL.getExecuteInt("SELECT id FROM genders WHERE gender = ? ", cmbGender.getSelectedItem().toString()));
            
            jpM.setSize(420,603);
            jpM.setLocation(0,0);
            rootPane.removeAll();
            rootPane.add(jpM,BorderLayout.CENTER);
            rootPane.revalidate();
            rootPane.repaint();
        }
        else if(camposVacios())
            standardization.showMessage("warning", "Se encontraron campos vacios.");
        else
            standardization.showMessage("error", "Error al establecer una conexion de red.");
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained
        spName.setBackground(Color.red);
    }//GEN-LAST:event_txtNameFocusGained

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        spName.setBackground(Color.gray);
    }//GEN-LAST:event_txtNameFocusLost

    private void txtLastNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastNameFocusGained
        spLastName.setBackground(Color.red);
    }//GEN-LAST:event_txtLastNameFocusGained

    private void txtLastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastNameFocusLost
        spLastName.setBackground(Color.gray);
    }//GEN-LAST:event_txtLastNameFocusLost

    private void dpDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dpDateFocusGained
        spDate.setBackground(Color.red);
    }//GEN-LAST:event_dpDateFocusGained

    private void dpDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dpDateFocusLost
        spDate.setBackground(Color.gray);
    }//GEN-LAST:event_dpDateFocusLost
    
    public void loadData()
    {
        ImageIcon original = new ImageIcon(getClass().getResource("/imagenes/user.png"));
        Icon icono = new ImageIcon(original.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        lblImage.setText("");
        lblImage.setIcon(icono);
    }
    
    public void cargarComboBox(){
        try {
            ResultSet rs = methodsSQL.getExecute("SELECT gender FROM genders");
            while(rs.next())
                {
                    cmbGender.addItem(rs.getString(1));
                }
            } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        cmbGender.setSelectedIndex(-1);
    }
    
    public boolean camposVacios(){
        if(standardization.campoVacio(txtName.getText()) || standardization.campoVacio(txtLastName.getText()) ||
                standardization.campoVacio(dpDate.getText())  || 
                cmbGender.getSelectedIndex() == -1 )
            return true;
        else
            return false;
    }

    //<editor-fold defaultstate="collapsed" desc="compiled code">
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNext;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JFormattedTextField dpDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblImage;
    private javax.swing.JSeparator spDate;
    private javax.swing.JSeparator spLastName;
    private javax.swing.JSeparator spName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
