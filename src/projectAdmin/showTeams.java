package projectAdmin;

import java.awt.Color;
import java.util.List;
import javaClass.classProjects;
import javaClass.controller;
import javaClass.team;

public class showTeams extends javax.swing.JPanel {

    int idProject;
    int staff;
    
    public showTeams(boolean owner, boolean showDelete, int idProject) {
        initComponents();
        this.idProject = idProject;
        load(owner, showDelete);
            
    }
    
    public showTeams(boolean owner, boolean showDelete, int idProject, int staff) {
        initComponents();
        this.idProject = idProject;
        this.staff = staff;
        load(owner, showDelete);
            
    }
    
    void load(boolean owner, boolean showDelete){
        if(owner){
            btnDelete.setVisible(false);
            txtNickname.setText(classProjects.projectsShow.get(idProject).getNickname());
            iconPos.setIcon(new controller().changeImage("/imagenes/owner.png", 25, 25));
            iconPos.setText("Creador");
        }else{
            if (!showDelete)
                btnDelete.setVisible(false);
            txtNickname.setText(classProjects.projectsShow.get(idProject).getMembers().get(staff).getNicknameGuest());
            iconPos.setIcon(new controller().changeImage("/imagenes/admin.png", 25, 25));
            iconPos.setText("Miembro");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNickname = new javax.swing.JTextField();
        spNickname = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        iconPos = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(420, 45));
        setMinimumSize(new java.awt.Dimension(420, 45));
        setPreferredSize(new java.awt.Dimension(420, 45));

        txtNickname.setAutoscrolls(false);
        txtNickname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtNickname.setFocusable(false);
        txtNickname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNicknameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNicknameFocusLost(evt);
            }
        });
        txtNickname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNicknameKeyTyped(evt);
            }
        });

        spNickname.setForeground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Nombre de usuario");

        iconPos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        iconPos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        iconPos.setText("Administrador");
        iconPos.setMaximumSize(new java.awt.Dimension(35, 35));
        iconPos.setMinimumSize(new java.awt.Dimension(35, 35));
        iconPos.setPreferredSize(new java.awt.Dimension(35, 35));

        btnDelete.setBackground(new java.awt.Color(255, 51, 51));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete.setText("Borrar");
        btnDelete.setBorderPainted(false);
        btnDelete.setFocusable(false);
        btnDelete.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnDelete.setMaximumSize(new java.awt.Dimension(79, 28));
        btnDelete.setMinimumSize(new java.awt.Dimension(79, 28));
        btnDelete.setPreferredSize(new java.awt.Dimension(79, 28));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spNickname)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(txtNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(iconPos, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(spNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNicknameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNicknameFocusGained
        spNickname.setBackground(Color.red);
    }//GEN-LAST:event_txtNicknameFocusGained

    private void txtNicknameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNicknameFocusLost
        spNickname.setBackground(Color.white);
    }//GEN-LAST:event_txtNicknameFocusLost

    private void txtNicknameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNicknameKeyTyped
        char c = evt.getKeyChar();
        if(c == ' ')
        evt.consume();
    }//GEN-LAST:event_txtNicknameKeyTyped

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        team member = classProjects.projectsShow.get(idProject).getMembers().get(staff);
        
        classProjects.deleteTeam(member.getNicknameGuest(), member.getIdProjects());
        for(int i = 0; i < classProjects.projectsShow.size(); i++){
            if(classProjects.projectsShow.get(i).getId() == classProjects.projectsShow.get(idProject).getId()){
                List<team> st = classProjects.projectsShow.get(i).getMembers();
                st.remove(member);
                classProjects.projectsShow.get(i).setMembers(st);
            }
        }
        
        technonizer.TechnoNizer.home.showProjectSettings(idProject);
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel iconPos;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator spNickname;
    private javax.swing.JTextField txtNickname;
    // End of variables declaration//GEN-END:variables
}
