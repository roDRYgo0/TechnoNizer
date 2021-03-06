package JPanel;

import JPanel.contact.jpContact;
import JPanel.contact.loadContact;
import jFrame.home;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Properties;
import javaClass.classContact;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.methodsSQL;
import javaClass.standardization;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import properties.propiedades;

public final class jpEditUser extends javax.swing.JPanel {

    boolean sw, continueM, continueN;
    boolean result;
    boolean chooseImg;
    char echoChar;
    String[] birthdate;
    String birth;
    byte[] image;
    
    public boolean changeAction;
    
    void verificaridioma()
    {
    Properties pr = new propiedades (controller.idioma);
    EditjpEditUser.setText(pr.getProperty("EditjpEditUser"));
    usernamejpedituser.setText(pr.getProperty("usernamejpedituser"));
    GenderjpEdituser.setText(pr.getProperty("GenderjpEdituser"));
    Namejpedituser.setText(pr.getProperty("Namejpedituser"));
    Lastnamesjpedituser.setText(pr.getProperty("Lastnamesjpedituser"));
    emailjpedituser.setText(pr.getProperty("emailjpedituser"));
    birthdayjpedituser.setText(pr.getProperty("birthdayjpedituser"));
    Dayjpedit.setText(pr.getProperty("Dayjpedit"));
    monthjpedit.setText(pr.getProperty("monthjpedit"));
    yearjpedit.setText(pr.getProperty("yearjpedit"));
    
//cargar combobox
            cmbMes.removeAllItems();
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
    
    LblContactjpedituser.setText(pr.getProperty("LblContactjpedituser"));
    lblenterjpedit.setText(pr.getProperty("lblenterjpedit"));
    jButton1.setText(pr.getProperty("jButton1jpeditbutton"));
    }
    
    public jpEditUser() {
        initComponents();
        
        chooseImg = true;
        changeAction= true;
        continueM = false;
        continueN = false;
        loadPanel(false);
        image = classUsuario.getImage();
        loadImagenes(); 
        verificaridioma();
        cargarComboBox();
        load(); 
       
    }
    
    public void enable(){
        lblImage.setEnabled(true);
        chooseImg = true;
        cmbGender.setEnabled(true);
        txtName.setEnabled(true);
        txtLastName.setEnabled(true);
        txtMail.setEnabled(true);
        txtDia.setEnabled(true);
        cmbMes.setEnabled(true);
        txtAnio.setEnabled(true);
    }
    
    public void disable(){
        lblImage.setEnabled(false);
        chooseImg = false;
        cmbGender.setEnabled(false);
        txtName.setEnabled(false);
        txtLastName.setEnabled(false);
        txtMail.setEnabled(false);
        txtDia.setEnabled(false);
        cmbMes.setEnabled(false);
        txtAnio.setEnabled(false);
    }
    
    public void loadPanel(boolean load){
        if(classUsuario.getCondition()==1){
            controller.jpContDis = new jpContactDisable();
            controller.jpContDis.setLocation(0,0);

            controller.jpContDis.setPreferredSize(new Dimension(492, 355));

            scrollContact.setViewportView(controller.jpContDis);
            scrollContact.revalidate();
            scrollContact.repaint();
        }else{
            if(load){
                loadContact loadC = new loadContact();
                loadC.setLocation(0, 0);
                scrollContact.setViewportView(loadC);
                scrollContact.revalidate();
                scrollContact.repaint();
                new Thread(()->{
                    classContact.select();
                    controller.jpCont = new jpContact();
                    controller.jpCont.setLocation(0,0);

                    controller.jpCont.setPreferredSize(new Dimension(492, 355+(71*classContact.getSpaceContact())));

                    scrollContact.setViewportView(controller.jpCont);
                    scrollContact.revalidate();
                    scrollContact.repaint();
                    checkContact(0);
                }).start();
            }else{
                controller.jpCont = new jpContact();
                controller.jpCont.setLocation(0,0);

                controller.jpCont.setPreferredSize(new Dimension(492, 355+(71*classContact.getSpaceContact())));

                scrollContact.setViewportView(controller.jpCont);
                scrollContact.revalidate();
                scrollContact.repaint();
            }
        }
        changeAction = true;
    }
    
    public void checkContact(int status){
        switch(status){
            case 0:
                checkContact.setIcon(null);
                break;
            case 1:
                checkContact.setIcon(standardization.checkImage(1));
                break;
            case 2:
                checkContact.setIcon(standardization.checkImage(2));
                break;
        }
    }
    
    void load(){
        birth = classUsuario.getBirthdate();
        birthdate = birth.split("-");
        lblNickname.setText(classUsuario.getNickname());
        txtName.setText(classUsuario.getFirstName());
        txtLastName.setText(classUsuario.getLastName());
        txtMail.setText(classUsuario.getMail());
        txtDia.setText(birthdate[2]);
        cmbMes.setSelectedIndex(Integer.parseInt(birthdate[1])-1);
        txtAnio.setText(birthdate[0]);
        cargarComboBox();
        if(classUsuario.getImage()==null)
            lblImage.setIcon(new controller().changeImage("/imagenes/user.png", 130, 130));
        else
            lblImage.setIcon(new controller().changeSizeImage(standardization.getImgIcon(classUsuario.getImage()), 130, 130));
        if(classUsuario.getCondition()==1){
            disable();
            txtMail.setEnabled(true);
        }
    }
    
    void loadImagenes(){
        iconUsername.setIcon(new controller().changeImage("/imagenes/username.png", 35, 35));
        iconEmail.setIcon(new controller().changeImage("/imagenes/email.png", 35, 35));
        iconBirthday.setIcon(new controller().changeImage("/imagenes/birthday.png", 35, 35));
        iconGender.setIcon(new controller().changeImage("/imagenes/gender.png", 35, 35));
        lblPassword.setIcon(new controller().changeImage("/imagenes/password.png", 35, 35));
        loadEye();
    }
    
    void cargarComboBox(){
        cmbGender.removeAllItems();
        for(int i = 0; i<controller.genders.size(); i++){
            cmbGender.addItem(controller.genders.get(i).getGender());
        }
        cmbGender.setSelectedIndex(classUsuario.getId_gender());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EditjpEditUser = new javax.swing.JLabel();
        birthdayjpedituser = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        GenderjpEdituser = new javax.swing.JLabel();
        usernamejpedituser = new javax.swing.JLabel();
        lblNickname = new javax.swing.JLabel();
        Namejpedituser = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        Lastnamesjpedituser = new javax.swing.JLabel();
        emailjpedituser = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        spName = new javax.swing.JSeparator();
        txtLastName = new javax.swing.JTextField();
        spLastName = new javax.swing.JSeparator();
        txtMail = new javax.swing.JTextField();
        spMail = new javax.swing.JSeparator();
        checkEmail = new javax.swing.JLabel();
        cmbMes = new javax.swing.JComboBox<>();
        monthjpedit = new javax.swing.JLabel();
        txtAnio = new javax.swing.JTextField();
        yearjpedit = new javax.swing.JLabel();
        spYear = new javax.swing.JSeparator();
        iconBirthday = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        Dayjpedit = new javax.swing.JLabel();
        spDay = new javax.swing.JSeparator();
        cmbGender = new javax.swing.JComboBox<>();
        iconGender = new javax.swing.JLabel();
        iconEmail = new javax.swing.JLabel();
        iconUsername = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        lblenterjpedit = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblEye = new javax.swing.JLabel();
        spPassword = new javax.swing.JSeparator();
        LblContactjpedituser = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        checkUpdate = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        scrollContact = new javax.swing.JScrollPane();
        checkContact = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(980, 601));

        EditjpEditUser.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        EditjpEditUser.setForeground(new java.awt.Color(255, 0, 0));
        EditjpEditUser.setText("Editar perfil");

        birthdayjpedituser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        birthdayjpedituser.setForeground(new java.awt.Color(102, 102, 102));
        birthdayjpedituser.setText("Fecha de nacimiento");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        GenderjpEdituser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        GenderjpEdituser.setForeground(new java.awt.Color(102, 102, 102));
        GenderjpEdituser.setText("Género");

        usernamejpedituser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usernamejpedituser.setForeground(new java.awt.Color(102, 102, 102));
        usernamejpedituser.setText("Nombre de usuario");

        lblNickname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNickname.setText("Not found");

        Namejpedituser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Namejpedituser.setForeground(new java.awt.Color(102, 102, 102));
        Namejpedituser.setText("Nombres");

        lblImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblImageMouseReleased(evt);
            }
        });

        Lastnamesjpedituser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Lastnamesjpedituser.setForeground(new java.awt.Color(102, 102, 102));
        Lastnamesjpedituser.setText("Apellidos");

        emailjpedituser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        emailjpedituser.setForeground(new java.awt.Color(102, 102, 102));
        emailjpedituser.setText("Email");

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
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
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

        txtMail.setAutoscrolls(false);
        txtMail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtMail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMailFocusLost(evt);
            }
        });
        txtMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMailKeyTyped(evt);
            }
        });

        spMail.setForeground(new java.awt.Color(204, 204, 204));

        checkEmail.setMaximumSize(new java.awt.Dimension(25, 25));
        checkEmail.setMinimumSize(new java.awt.Dimension(25, 25));
        checkEmail.setPreferredSize(new java.awt.Dimension(25, 25));

        cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cmbMes.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        monthjpedit.setText("Mes");

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

        yearjpedit.setText("Año");

        spYear.setForeground(new java.awt.Color(204, 204, 204));

        iconBirthday.setMaximumSize(new java.awt.Dimension(35, 35));
        iconBirthday.setMinimumSize(new java.awt.Dimension(35, 35));
        iconBirthday.setPreferredSize(new java.awt.Dimension(35, 35));

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

        Dayjpedit.setText("Día");

        spDay.setForeground(new java.awt.Color(204, 204, 204));

        cmbGender.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        iconGender.setMaximumSize(new java.awt.Dimension(35, 35));
        iconGender.setMinimumSize(new java.awt.Dimension(35, 35));
        iconGender.setPreferredSize(new java.awt.Dimension(35, 35));

        iconEmail.setMaximumSize(new java.awt.Dimension(35, 35));
        iconEmail.setMinimumSize(new java.awt.Dimension(35, 35));
        iconEmail.setPreferredSize(new java.awt.Dimension(35, 35));

        iconUsername.setMaximumSize(new java.awt.Dimension(35, 35));
        iconUsername.setMinimumSize(new java.awt.Dimension(35, 35));
        iconUsername.setPreferredSize(new java.awt.Dimension(35, 35));

        jButton1.setBackground(new java.awt.Color(33, 150, 243));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        lblenterjpedit.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblenterjpedit.setForeground(new java.awt.Color(102, 102, 102));
        lblenterjpedit.setText("Ingrese la contraseña para continuar");

        lblPassword.setMaximumSize(new java.awt.Dimension(35, 35));
        lblPassword.setMinimumSize(new java.awt.Dimension(35, 35));
        lblPassword.setPreferredSize(new java.awt.Dimension(35, 35));

        lblEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eye.png"))); // NOI18N
        lblEye.setMaximumSize(new java.awt.Dimension(20, 20));
        lblEye.setMinimumSize(new java.awt.Dimension(20, 20));
        lblEye.setPreferredSize(new java.awt.Dimension(20, 20));
        lblEye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEyeMouseClicked(evt);
            }
        });

        spPassword.setForeground(new java.awt.Color(204, 204, 204));

        LblContactjpedituser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblContactjpedituser.setForeground(new java.awt.Color(255, 0, 0));
        LblContactjpedituser.setText("Contactos");

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));

        checkUpdate.setMaximumSize(new java.awt.Dimension(25, 25));
        checkUpdate.setMinimumSize(new java.awt.Dimension(25, 25));
        checkUpdate.setPreferredSize(new java.awt.Dimension(25, 25));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        scrollContact.setBackground(new java.awt.Color(255, 255, 255));
        scrollContact.setBorder(null);
        scrollContact.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollContact.setMaximumSize(new java.awt.Dimension(494, 354));
        scrollContact.setMinimumSize(new java.awt.Dimension(494, 354));
        scrollContact.setPreferredSize(new java.awt.Dimension(494, 354));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollContact, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollContact, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addContainerGap())
        );

        checkContact.setMaximumSize(new java.awt.Dimension(25, 25));
        checkContact.setMinimumSize(new java.awt.Dimension(25, 25));
        checkContact.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(iconBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Dayjpedit)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spDay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(monthjpedit)
                    .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAnio)
                    .addComponent(yearjpedit)
                    .addComponent(spYear, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblenterjpedit, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(spPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(lblEye, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(EditjpEditUser))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Namejpedituser, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtName)
                                        .addComponent(spName, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(usernamejpedituser))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(iconUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(lblNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(GenderjpEdituser, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(iconGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtLastName)
                                        .addComponent(spLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(emailjpedituser, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(iconEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(spMail)
                                            .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, 0)
                                        .addComponent(checkEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(birthdayjpedituser)
                                    .addComponent(Lastnamesjpedituser, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LblContactjpedituser)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(EditjpEditUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(usernamejpedituser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(iconUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNickname))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(GenderjpEdituser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(iconGender, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Namejpedituser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(spName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lastnamesjpedituser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(spLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailjpedituser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addComponent(spMail, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(iconEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(birthdayjpedituser))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblContactjpedituser)
                            .addComponent(checkContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Dayjpedit)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(iconBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(1, 1, 1)
                                    .addComponent(spDay, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(spYear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(monthjpedit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(yearjpedit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblenterjpedit)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblEye, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 0, 0)
                                            .addComponent(spPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained
        spName.setBackground(Color.red);
    }//GEN-LAST:event_txtNameFocusGained

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        spName.setBackground(Color.white);
    }//GEN-LAST:event_txtNameFocusLost

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        char c = evt.getKeyChar();
        if(txtName.getText().length()<41){
            if(Character.isLetter(c) || Character.isSpaceChar(c)){}
            else
                evt.consume();
        }else
            evt.consume();
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtLastNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastNameFocusGained
        spLastName.setBackground(Color.red);
    }//GEN-LAST:event_txtLastNameFocusGained

    private void txtLastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastNameFocusLost
        spLastName.setBackground(Color.white);
    }//GEN-LAST:event_txtLastNameFocusLost

    private void txtLastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameKeyTyped
        char c = evt.getKeyChar();
        if(txtName.getText().length()<41){
            if(Character.isLetter(c) || Character.isSpaceChar(c)){}
            else
                evt.consume();
        }else
            evt.consume();
    }//GEN-LAST:event_txtLastNameKeyTyped

    private void txtMailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMailFocusGained
        spMail.setBackground(Color.red);
    }//GEN-LAST:event_txtMailFocusGained

    private void txtMailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMailFocusLost
        spMail.setBackground(Color.white);
        spMail.setBackground(Color.white);
        if(!standardization.campoVacio(txtMail.getText()))
        {
            checkEmail.setIcon(new controller().changeImage("/imagenes/load.png", 20, 20));
            if(standardization.validateEmail(txtMail.getText())){
                new Thread(()->{
                    if(methodsSQL.exists("SELECT * FROM users WHERE mail = ? ", txtMail.getText()))
                {
                    checkEmail.setIcon(new controller().changeImage("/imagenes/cancel.png", 20, 20));
                    continueM = false;
                }
                else{
                    checkEmail.setIcon(new controller().changeImage("/imagenes/ok.png", 20, 20));
                    continueM = true;
                } 
                }).start();
            }else{
                checkEmail.setIcon(new controller().changeImage("/imagenes/cancel.png", 20, 20));
                continueM = false;
            }
        }else
            checkEmail.setIcon(null);
    }//GEN-LAST:event_txtMailFocusLost

    private void txtMailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMailKeyTyped
        char c = evt.getKeyChar();
        if(c == ' ')
        evt.consume();
    }//GEN-LAST:event_txtMailKeyTyped

    private void txtAnioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAnioFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnioFocusGained

    private void txtAnioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnioKeyTyped
        char c = evt.getKeyChar();
        if(txtAnio.getText().length()>3 || c < '0' || c >'9')
        evt.consume();
    }//GEN-LAST:event_txtAnioKeyTyped

    private void txtDiaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiaFocusGained
        spDay.setBackground(Color.red);
    }//GEN-LAST:event_txtDiaFocusGained

    private void txtDiaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiaFocusLost
        spDay.setBackground(Color.white);
    }//GEN-LAST:event_txtDiaFocusLost

    private void txtDiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiaKeyTyped
        char c = evt.getKeyChar();
        if(txtDia.getText().length()>1 || c < '0' || c >'9')
        evt.consume();
    }//GEN-LAST:event_txtDiaKeyTyped

    private void lblImageMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImageMouseReleased
        if(chooseImg){
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
                    image = icono;
                    lblImage.setIcon(new controller().changeSizeImage(standardization.getImgIcon(icono), 130, 130));
                }catch(IOException ex){
                    image = null;
                }
            }
        }
    }//GEN-LAST:event_lblImageMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        disable();
        if(!camposVacios() && standardization.validateDate(Integer.parseInt(txtAnio.getText()), (cmbMes.getSelectedIndex()+1), Integer.parseInt(txtDia.getText()))){
            result = true;
            String pass = standardization.sha1(standardization.md5(standardization.convertPassword(txtPassword.getPassword())));
             if(pass.equals(classUsuario.getPassword())){
                 
                 checkUpdate.setIcon(standardization.checkImage(2));
                 
                 new Thread(()->{
                     while(result){
                        if(!txtName.getText().trim().equals(classUsuario.getFirstName())){
                            classUsuario.setPreviousFirstName(classUsuario.getFirstName());
                            classUsuario.setFirstName(txtName.getText().trim());
                            result = classUsuario.updateFirstName(false);
                            if(result==false)break;
                        }
                        if(!txtLastName.getText().trim().equals(classUsuario.getLastName())){
                            classUsuario.setPreviousLastName(classUsuario.getLastName());
                            classUsuario.setLastName(txtLastName.getText().trim());
                            result = classUsuario.updateLastName(false);
                            if(result==false)break;
                        }
                        if(!txtMail.getText().trim().equals(classUsuario.getMail())){
                            classUsuario.setPreviousMail(classUsuario.getMail());
                            classUsuario.setMail(txtMail.getText().trim());
                            result = classUsuario.updateMail(false);
                            if(result==false)break;
                        }
                        if(cmbGender.getSelectedIndex()!=classUsuario.getId_gender()){
                            classUsuario.setPreviousId_gender(classUsuario.getId_gender());
                            classUsuario.setId_gender(cmbGender.getSelectedIndex());
                            result = classUsuario.updateGender(false);
                            if(result==false)break;
                        }
                        
                        if(!(txtAnio.getText()+"-"+standardization.month(cmbMes.getSelectedIndex())+"-"+txtDia.getText()).equals(classUsuario.getBirthdate())){
                            classUsuario.setPreviousBirthdate(classUsuario.getBirthdate());
                            classUsuario.setBirthdate(txtAnio.getText()+"-"+standardization.month(cmbMes.getSelectedIndex())+"-"+txtDia.getText());
                            result = classUsuario.updateBirthdate(false);
                            if(result==false)break;
                        }
                        if(!Arrays.equals(image, classUsuario.getImage())){
                            classUsuario.setImage(image);
                            result = classUsuario.updateImage(false);
                            if(result==false)break;
                        }
                        break;
                     }
                     if(result){
                        checkUpdate.setIcon(standardization.checkImage(1));
                        classUsuario.select();
                        standardization.showMessage("ok", "Exito al actualizar.");
                        enable();
                        home.imageUserLeft.setIcon(new controller().changeSizeImage(standardization.getImgIcon(classUsuario.getImage()), 97, 97));
                        home.imageUserTop.setIcon(new controller().changeSizeImage(standardization.getImgIcon(classUsuario.getImage()), 24, 24));
                        load();
                        checkUpdate.setIcon(null);
                        txtPassword.setText("");
                        loadImagenes();
                     }
                     else{
                         standardization.showMessage("error", "No se logro actualizar.");
                         enable();
                     }
                 }).start();                            
            }else{
                standardization.showMessage("error", "La contraseña no coinsiden.");
                enable();
            }
                
        }else if(!standardization.validateDate(Integer.parseInt(txtAnio.getText()), (cmbMes.getSelectedIndex()+1), Integer.parseInt(txtDia.getText()))){
            standardization.showMessage("error", "Fecha invalida.");
            enable();
        }
        else{
            standardization.showMessage("warning", "Campos vacios.");
            enable();
        }
        if(classUsuario.getCondition()==1){
            disable();
            txtMail.setEnabled(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        spPassword.setBackground(Color.red);
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        spPassword.setBackground(Color.gray);
    }//GEN-LAST:event_txtPasswordFocusLost

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void lblEyeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEyeMouseClicked
        if (!sw) {
            txtPassword.setEchoChar((char)0);
            sw = !sw;
            changeEye(sw);
        } else {
            txtPassword.setEchoChar(echoChar);
            sw = !sw;
            changeEye(sw);
        }
    }//GEN-LAST:event_lblEyeMouseClicked

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed


    boolean camposVacios(){
        if(standardization.campoVacio(txtName.getText()) || standardization.campoVacio(txtLastName.getText()) ||
                standardization.campoVacio(txtDia.getText())  || standardization.campoVacio(txtAnio.getText())  ||
                cmbGender.getSelectedIndex() == -1 || cmbMes.getSelectedIndex() == -1 || standardization.campoVacio(txtMail.getText()))
            return true;
        else
            return false;
    }
    
    //<editor-fold defaultstate="collapsed" desc="compiled code eye">
        
    void loadEye()
    {
        echoChar = txtPassword.getEchoChar();
        ImageIcon original = new ImageIcon(getClass().getResource("/imagenes/eye.png"));
        Icon icono = new ImageIcon(original.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
        lblEye.setIcon(icono);
    }
    
    void changeEye(boolean e){
        if(e)
        {
            ImageIcon original = new ImageIcon(getClass().getResource("/imagenes/eye_.png"));
            Icon icono = new ImageIcon(original.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
            lblEye.setIcon(icono);
        }
        else
        {
            ImageIcon original = new ImageIcon(getClass().getResource("/imagenes/eye.png"));
            Icon icono = new ImageIcon(original.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
            lblEye.setIcon(icono);
        }
    }
    //</editor-fold>
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dayjpedit;
    private javax.swing.JLabel EditjpEditUser;
    private javax.swing.JLabel GenderjpEdituser;
    private javax.swing.JLabel Lastnamesjpedituser;
    private javax.swing.JLabel LblContactjpedituser;
    private javax.swing.JLabel Namejpedituser;
    private javax.swing.JLabel birthdayjpedituser;
    private javax.swing.JLabel checkContact;
    private javax.swing.JLabel checkEmail;
    private javax.swing.JLabel checkUpdate;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JComboBox<String> cmbMes;
    private javax.swing.JLabel emailjpedituser;
    private javax.swing.JLabel iconBirthday;
    private javax.swing.JLabel iconEmail;
    private javax.swing.JLabel iconGender;
    private javax.swing.JLabel iconUsername;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblEye;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblNickname;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblenterjpedit;
    private javax.swing.JLabel monthjpedit;
    private javax.swing.JScrollPane scrollContact;
    private javax.swing.JSeparator spDay;
    private javax.swing.JSeparator spLastName;
    private javax.swing.JSeparator spMail;
    private javax.swing.JSeparator spName;
    private javax.swing.JSeparator spPassword;
    private javax.swing.JSeparator spYear;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JLabel usernamejpedituser;
    private javax.swing.JLabel yearjpedit;
    // End of variables declaration//GEN-END:variables
}
