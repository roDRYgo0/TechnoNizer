package JPanel.CheckIn;

import jFrame.*;
import java.awt.BorderLayout;
import javaClass.*;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import properties.propiedades;

public class jpCreateData extends javax.swing.JPanel {
    
    void verificaridioma()
    {
            Properties pr = new propiedades (controller.idioma);
            Title.setText(pr.getProperty("Title"));
            NameCreate.setText(pr.getProperty("NameCreate"));
            LastnameCreate.setText(pr.getProperty("LastnameCreate"));
            BornCreate.setText(pr.getProperty("BornCreate"));
            DayCreate.setText(pr.getProperty("DayCreate"));
            MonthCreate.setText(pr.getProperty("MonthCreate"));
            YearCreate.setText(pr.getProperty("YearCreate"));
            GenderCreate.setText(pr.getProperty("GenderCreate"));
            btnBack.setText(pr.getProperty("btnBack"));
            btnNext.setText(pr.getProperty("BtnNext"));
            cmbMes.removeAllItems();
            cmbGender.removeAllItems();
            String meses[]={
            pr.getProperty("firstmonth"),
            pr.getProperty("secondmonth"),
            pr.getProperty("thirdmonth"),
            pr.getProperty("fourmonth"),
            pr.getProperty("fivemonth"),
            pr.getProperty("sixmonth"),
            pr.getProperty("sevenmonth"),
            pr.getProperty("eightmonth"),
            pr.getProperty("ninemonth"),
            pr.getProperty("tenmonth"),
            pr.getProperty("elevenmonth"),
            pr.getProperty("twelvemonth")
            };
            for(int i=0;i<meses.length;i++)
            {
                cmbMes.addItem(meses[i]);
            }
            
            String generos[]={
            pr.getProperty("Feme"),
            pr.getProperty("Mascu")
            };
            
           for(int x=0; x<generos.length;x++)
           {
           cmbGender.addItem(generos[x]);
           }
    }    
    public jpCreateData() {
        initComponents();
       
        iconBirthday.setIcon(new controller().changeImage("/imagenes/birthday.png", 35, 35));
        iconGender.setIcon(new controller().changeImage("/imagenes/gender.png", 35, 35));
        lblAyuda.setIcon(new controller().changeImage("/imagenes/Ayuda.png", 25, 25));
        jButton1.setVisible(false);
        
        loadData();
        cargarComboBox();
        verificaridioma();
        cmbMes.setSelectedIndex(-1);
    }

    //<editor-fold defaultstate="collapsed" desc="compiled code">
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        cmbGender = new javax.swing.JComboBox<>();
        lblImage = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        spName = new javax.swing.JSeparator();
        txtLastName = new javax.swing.JTextField();
        spLastName = new javax.swing.JSeparator();
        NameCreate = new javax.swing.JLabel();
        LastnameCreate = new javax.swing.JLabel();
        BornCreate = new javax.swing.JLabel();
        GenderCreate = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        DayCreate = new javax.swing.JLabel();
        spDay = new javax.swing.JSeparator();
        cmbMes = new javax.swing.JComboBox<>();
        MonthCreate = new javax.swing.JLabel();
        txtAnio = new javax.swing.JTextField();
        YearCreate = new javax.swing.JLabel();
        spYear = new javax.swing.JSeparator();
        iconBirthday = new javax.swing.JLabel();
        iconGender = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblAyuda = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(420, 603));
        setMinimumSize(new java.awt.Dimension(420, 603));
        setPreferredSize(new java.awt.Dimension(420, 603));

        Title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Title.setText("¡Háblanos más sobre ti!");

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnBack.setText("Atras");
        btnBack.setBorderPainted(false);
        btnBack.setFocusable(false);
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

        cmbGender.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setText("Not Found");
        lblImage.setMaximumSize(new java.awt.Dimension(150, 150));
        lblImage.setMinimumSize(new java.awt.Dimension(150, 150));
        lblImage.setPreferredSize(new java.awt.Dimension(150, 150));
        lblImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblImageMouseReleased(evt);
            }
        });

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
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        spName.setForeground(new java.awt.Color(204, 204, 204));

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
        txtLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLastNameKeyTyped(evt);
            }
        });

        spLastName.setForeground(new java.awt.Color(204, 204, 204));

        NameCreate.setText("Nombres");

        LastnameCreate.setText("Apellidos");

        BornCreate.setText("Fecha de nacimiento");

        GenderCreate.setText("Género");

        txtDia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDia.setText("12");
        txtDia.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtDia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDiaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDiaFocusLost(evt);
            }
        });
        txtDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiaKeyTyped(evt);
            }
        });

        DayCreate.setText("Día");

        spDay.setForeground(new java.awt.Color(204, 204, 204));

        cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cmbMes.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        MonthCreate.setText("Mes");

        txtAnio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAnio.setText("2000");
        txtAnio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtAnio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAnioFocusGained(evt);
            }
        });
        txtAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnioKeyTyped(evt);
            }
        });

        YearCreate.setText("Año");

        spYear.setForeground(new java.awt.Color(204, 204, 204));

        iconBirthday.setMaximumSize(new java.awt.Dimension(35, 35));
        iconBirthday.setMinimumSize(new java.awt.Dimension(35, 35));
        iconBirthday.setPreferredSize(new java.awt.Dimension(35, 35));

        iconGender.setMaximumSize(new java.awt.Dimension(35, 35));
        iconGender.setMinimumSize(new java.awt.Dimension(35, 35));
        iconGender.setPreferredSize(new java.awt.Dimension(35, 35));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblAyuda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAyuda.setMaximumSize(new java.awt.Dimension(25, 25));
        lblAyuda.setMinimumSize(new java.awt.Dimension(25, 25));
        lblAyuda.setPreferredSize(new java.awt.Dimension(25, 25));
        lblAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblAyudaMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(GenderCreate)
                                    .addComponent(iconBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DayCreate)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(spDay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MonthCreate)
                                    .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAnio)
                                    .addComponent(YearCreate)
                                    .addComponent(spYear, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(iconGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)))))
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtLastName)
                                .addComponent(spLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtName)
                                .addComponent(spName, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BornCreate)
                            .addComponent(LastnameCreate)
                            .addComponent(NameCreate)
                            .addComponent(Title))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(lblAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(Title))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NameCreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(spName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LastnameCreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(spLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BornCreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(DayCreate)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(iconBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(1, 1, 1)
                                    .addComponent(spDay, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(YearCreate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10))
                                    .addComponent(spYear, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MonthCreate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(GenderCreate)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(iconGender, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents
    //</editor-fold>
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        controller.jpCU.setSize(420,603);
        controller.jpCU.setLocation(0,0);
        controller.rootPane.removeAll();
        controller.rootPane.add(controller.jpCU,BorderLayout.CENTER);
        controller.rootPane.revalidate();
        controller.rootPane.repaint();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if(logIn.internet && !camposVacios() && standardization.validateDate(Integer.parseInt(txtAnio.getText()), (cmbMes.getSelectedIndex()+1), Integer.parseInt(txtDia.getText())))
        {
            controller.jpM = new jpMembership();
            System.out.println(classUsuario.getImage());
            classUsuario.setFirstName(txtName.getText().trim());
            classUsuario.setLastName(txtLastName.getText().trim());
            classUsuario.setBirthdate(txtAnio.getText()+"-"+(cmbMes.getSelectedIndex()+1)+"-"+txtDia.getText());            
            classUsuario.setId_gender(cmbGender.getSelectedIndex());
            
            controller.jpM.setSize(420,603);
            controller.jpM.setLocation(0,0);
            controller.rootPane.removeAll();
            controller.rootPane.add(controller.jpM,BorderLayout.CENTER);
            controller.rootPane.revalidate();
            controller.rootPane.repaint();
        }
        else if(camposVacios())
            standardization.showMessage("warning", "Se encontraron campos vacios.");
        else if(!standardization.validateDate(Integer.parseInt(txtAnio.getText()), (cmbMes.getSelectedIndex()+1), Integer.parseInt(txtDia.getText())))
            standardization.showMessage("Error","Fecha invalida");
        else
            standardization.showMessage("error", "Error al establecer una conexion de red.");
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained
        spName.setBackground(Color.red);
    }//GEN-LAST:event_txtNameFocusGained

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        spName.setBackground(Color.white);
    }//GEN-LAST:event_txtNameFocusLost

    private void txtLastNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastNameFocusGained
        spLastName.setBackground(Color.red);
    }//GEN-LAST:event_txtLastNameFocusGained

    private void txtLastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastNameFocusLost
        spLastName.setBackground(Color.white);
    }//GEN-LAST:event_txtLastNameFocusLost

    private void txtDiaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiaFocusGained
        spDay.setBackground(Color.red);
    }//GEN-LAST:event_txtDiaFocusGained

    private void txtDiaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiaFocusLost
        spDay.setBackground(Color.white);
        if(Integer.parseInt(txtDia.getText())>31){
            standardization.showMessage("error", "Numero de dias invalido");
            txtDia.setText("");
        }
    }//GEN-LAST:event_txtDiaFocusLost

    private void txtAnioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAnioFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnioFocusGained

    private void lblImageMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImageMouseReleased
        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fil = new FileNameExtensionFilter("JPG, PNG & GIF","jpg","png","gif");
        j.setFileFilter(fil);
        
        int s = j.showOpenDialog(this);
        if(s == JFileChooser.APPROVE_OPTION){
            String path = j.getSelectedFile().getAbsolutePath();
            File ruta = new File(path);
            try{
                byte[] icono = new byte[(int) ruta.length()];
                InputStream input = new FileInputStream(ruta);
                input.read(icono);
                classUsuario.setImage(icono);
                System.out.println(icono);
                lblImage.setIcon(standardization.getImgIcon(icono));
            }catch(IOException ex){
                classUsuario.setImage(null);
            }
        }
    }//GEN-LAST:event_lblImageMouseReleased

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        char c = evt.getKeyChar();
        if(txtName.getText().length()<41){
            if(Character.isLetter(c) || Character.isSpaceChar(c)){}
            else
                evt.consume();
        }else
            evt.consume();
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtLastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameKeyTyped
        char c = evt.getKeyChar();
        if(txtName.getText().length()<41){
            if(Character.isLetter(c) || Character.isSpaceChar(c)){}
            else
                evt.consume();
        }else
            evt.consume();
    }//GEN-LAST:event_txtLastNameKeyTyped

    private void txtDiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiaKeyTyped
        char c = evt.getKeyChar();
        if(txtDia.getText().length()>1 || c < '0' || c >'9')
            evt.consume();
    }//GEN-LAST:event_txtDiaKeyTyped

    private void txtAnioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnioKeyTyped
        char c = evt.getKeyChar();
        if(txtAnio.getText().length()>3 || c < '0' || c >'9')
            evt.consume();
    }//GEN-LAST:event_txtAnioKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lblAyudaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAyudaMouseReleased
        controller.AyudaLogin = new Ayuda("Para poder registrarse debes ser mayor de 15 años");
        standardization.show(controller.AyudaLogin);
    }//GEN-LAST:event_lblAyudaMouseReleased

    
    public void loadData()
    {
        classUsuario.setImage(null);
        lblImage.setIcon(new controller().changeImage("/imagenes/user.png", 150, 150));
        ImageIcon original = new ImageIcon(getClass().getResource("/imagenes/user.png"));
        Icon icono = new ImageIcon(original.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        lblImage.setText("");
        lblImage.setIcon(icono);
    }
    
    public void cargarComboBox(){
        for(int i = 0; i<controller.genders.size(); i++)
            cmbGender.addItem(controller.genders.get(i).getGender());
        cmbGender.setSelectedIndex(-1);
    }
    
    public boolean camposVacios(){
        if(standardization.campoVacio(txtName.getText().trim()) || standardization.campoVacio(txtLastName.getText().trim()) ||
                standardization.campoVacio(txtDia.getText())  || standardization.campoVacio(txtAnio.getText())  ||
                cmbGender.getSelectedIndex() == -1 || cmbMes.getSelectedIndex() == -1 )
            return true;
        else
            return false;
    }

    //<editor-fold defaultstate="collapsed" desc="compiled code">
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BornCreate;
    private javax.swing.JLabel DayCreate;
    private javax.swing.JLabel GenderCreate;
    private javax.swing.JLabel LastnameCreate;
    private javax.swing.JLabel MonthCreate;
    private javax.swing.JLabel NameCreate;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel YearCreate;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNext;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JComboBox<String> cmbMes;
    private javax.swing.JLabel iconBirthday;
    private javax.swing.JLabel iconGender;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblAyuda;
    private javax.swing.JLabel lblImage;
    private javax.swing.JSeparator spDay;
    private javax.swing.JSeparator spLastName;
    private javax.swing.JSeparator spName;
    private javax.swing.JSeparator spYear;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
