package projectAdmin;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javaClass.classProjects;
import javaClass.controller;
import javaClass.standardization;
import javaClass.team;
import javaClass.users;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author rodri
 */
public class addTeam extends javax.swing.JPanel {

    List<users> usuarios;
    List<JMenuItem> items;
    
    int idProject;
    int admin;
    int mod;
    
    public addTeam(int idProject) {
        initComponents();
        this.idProject = idProject;
        admin = 0;
        mod = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupNickname = new javax.swing.JPopupMenu();
        menuItem1 = new javax.swing.JMenuItem();
        menuItem2 = new javax.swing.JMenuItem();
        menuItem3 = new javax.swing.JMenuItem();
        menuItem4 = new javax.swing.JMenuItem();
        menuItem5 = new javax.swing.JMenuItem();
        txtNickname = new javax.swing.JTextField();
        spNickname = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();

        popupNickname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        popupNickname.setBorderPainted(false);

        menuItem1.setText("jMenuItem1");
        popupNickname.add(menuItem1);

        menuItem2.setText("jMenuItem1");
        popupNickname.add(menuItem2);

        menuItem3.setText("jMenuItem1");
        popupNickname.add(menuItem3);

        menuItem4.setText("jMenuItem1");
        popupNickname.add(menuItem4);

        menuItem5.setText("jMenuItem1");
        popupNickname.add(menuItem5);

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(420, 45));
        setMinimumSize(new java.awt.Dimension(420, 45));
        setPreferredSize(new java.awt.Dimension(420, 45));

        txtNickname.setAutoscrolls(false);
        txtNickname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtNickname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNicknameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNicknameFocusLost(evt);
            }
        });
        txtNickname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNicknameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNicknameKeyTyped(evt);
            }
        });

        spNickname.setForeground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Nombre de usuario");

        btnNext.setBackground(new java.awt.Color(33, 150, 243));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Agregar");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 80, Short.MAX_VALUE))
                            .addComponent(spNickname))
                        .addGap(163, 163, 163))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNickname)
                        .addGap(18, 18, 18)))
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(txtNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(spNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNicknameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNicknameFocusGained
        spNickname.setBackground(Color.red);
    }//GEN-LAST:event_txtNicknameFocusGained

    private void txtNicknameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNicknameFocusLost
        spNickname.setBackground(Color.white);
    }//GEN-LAST:event_txtNicknameFocusLost

    private void txtNicknameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNicknameKeyReleased
        popupNickname = new JPopupMenu();
        usuarios = new ArrayList<>();
        items = new ArrayList<>();
        items.clear();
        popupNickname.removeAll();
        boolean st = true;
        for(users u : controller.usuarios){
            if(u.getNickname().contains(txtNickname.getText().trim())){
                if(!u.getNickname().equals(classProjects.projectsShow.get(idProject).getNickname())){
                    if(!classProjects.projectsShow.get(idProject).getMembers().isEmpty())
                    {
                        for(team s : classProjects.projectsShow.get(idProject).getMembers()){
                            if(s.getNicknameGuest().equals(u.getNickname())){
                                st=false;
                                break;
                            }
                        }
                    }
                    if(st){
                        usuarios.add(u);
                        items.add(new JMenuItem(u.getNickname()));
                    }
                    st = true;
                }
            }
        }
        
        if(usuarios.size() < 5){
            for(int i = 0; i< usuarios.size(); i++)
                popupNickname.add(items.get(i));
        }else{
            for(int i = 0; i < 5; i++)
                popupNickname.add(items.get(i));
        }
        popupNickname.show(this,txtNickname.getX(),txtNickname.getY()+30);
        txtNickname.requestFocus();
        
        for(JMenuItem item : items){
            item.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    txtNickname.setText(item.getText());
                }
            });
        }
        
    }//GEN-LAST:event_txtNicknameKeyReleased

    private void txtNicknameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNicknameKeyTyped
        char c = evt.getKeyChar();
        if(c == ' ')
        evt.consume();
    }//GEN-LAST:event_txtNicknameKeyTyped

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        boolean user = false;
        for(users s : controller.usuarios){
            if(txtNickname.getText().equals(s.getNickname()))
                user = true;
        }
        if(user){
            if(!txtNickname.getText().equals(classProjects.projectsShow.get(idProject).getNickname())){
                for(team s : classProjects.projectsShow.get(idProject).getMembers()){
                    if(s.getNicknameGuest().equals(txtNickname.getText())){
                        user = false;
                    }
                }
            }else
                user = false;
        }
        if(user){
            add();
        }else
            standardization.showMessage("warning", "El usuario no se encuentra");
    }//GEN-LAST:event_btnNextActionPerformed

    void add(){
        if(classProjects.insertTeam(idProject, txtNickname.getText())){
            team s = new team();
            s.setNicknameGuest(txtNickname.getText());
            s.setIdProjects(classProjects.projectsShow.get(idProject).getId());

            for(int i = 0; i < classProjects.projectsShow.size(); i++){
                if(classProjects.projectsShow.get(i).getId() == classProjects.projectsShow.get(idProject).getId()){
                    List<team> st = classProjects.projectsShow.get(i).getMembers();
                    st.add(s);
                    classProjects.projectsShow.get(i).setMembers(st);
                }
            }
            technonizer.TechnoNizer.home.showProjectSettings(idProject);

            standardization.showMessage("ok", "Agregado corectamente");
        }else
            standardization.showMessage("cancel", "No se puede agregar");
    }
    
    void setVisible(){
        menuItem1.setVisible(true);
        menuItem2.setVisible(true);
        menuItem3.setVisible(true);
        menuItem4.setVisible(true);
        menuItem5.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem menuItem1;
    private javax.swing.JMenuItem menuItem2;
    private javax.swing.JMenuItem menuItem3;
    private javax.swing.JMenuItem menuItem4;
    private javax.swing.JMenuItem menuItem5;
    private javax.swing.JPopupMenu popupNickname;
    private javax.swing.JSeparator spNickname;
    private javax.swing.JTextField txtNickname;
    // End of variables declaration//GEN-END:variables
}
