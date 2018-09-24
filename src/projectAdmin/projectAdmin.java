package projectAdmin;

import eventOwner.footer;
import java.awt.Dimension;
import javaClass.Project;
import javaClass.classCards;
import javaClass.classProjects;
import javaClass.classUsuario;
import javaClass.standardization;

public class projectAdmin extends javax.swing.JPanel {

    int indexProject, idProject;
    
    public projectAdmin(int indexProject) {
        initComponents();
        this.indexProject = indexProject;
        scrollContainer.getVerticalScrollBar().setUnitIncrement(16);
        load(classProjects.projectsShow.get(indexProject));
    }
    
    void load(Project project){
        
        this.idProject = project.getId();
        lblEventName.setText(project.getName());     
        lblNickname.setText(project.getNickname());

        if(project.getCoverImage()!= null)
            iconCover.setIcon(standardization.getImgIcon(project.getCoverImage()));

        lblDescription.setText(project.getDescription());
        lblDays.setText(standardization.getDateToString(project.getDatetime(), standardization.getDate(project.getDatetime()), false));
        
        if (classUsuario.getCondition() == 3 || project.getNickname().equals(classUsuario.getNickname()))
            loadMenu();
        
        loadStaff(project);
        loadFooter();
    }
    
    void loadMenu(){
        pnContainer.add(new pnMenu(indexProject));
        pnContainer.revalidate();
        pnContainer.repaint();
    }

    void loadStaff(Project project){     
        pnTeams pS = new pnTeams(indexProject);
        int size = 0;
        if(project.getMembers()!= null)
            size = (project.getMembers().size() <= 1) ? 1 : (project.getMembers().size() -1) * 50;

        pS.setPreferredSize(new Dimension(465,226 + size));
        pnContainer.add(pS);

        pnContainer.revalidate();
        pnContainer.repaint();
    }
    
    void loadFooter(){       
        pnContainer.add(new footer());

        pnContainer.revalidate();
        pnContainer.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollContainer = new javax.swing.JScrollPane();
        pnContainer = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lblEventName = new javax.swing.JLabel();
        lblNickname = new javax.swing.JLabel();
        lblDays = new javax.swing.JLabel();
        iconCover = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblDescription = new javax.swing.JLabel();
        btnCards = new javax.swing.JButton();

        scrollContainer.setBorder(null);

        pnContainer.setBackground(new java.awt.Color(170, 218, 255));
        javaClass.ModifiedFlowLayout modifiedFlowLayout1 = new javaClass.ModifiedFlowLayout();
        modifiedFlowLayout1.setAlignment(java.awt.FlowLayout.LEFT);
        modifiedFlowLayout1.setHgap(10);
        pnContainer.setLayout(modifiedFlowLayout1);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setMaximumSize(new java.awt.Dimension(945, 131));
        jPanel8.setMinimumSize(new java.awt.Dimension(945, 131));
        jPanel8.setPreferredSize(new java.awt.Dimension(945, 118));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel8MouseReleased(evt);
            }
        });

        lblEventName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblEventName.setText("not found");

        lblNickname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNickname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNickname.setText("not found");

        lblDays.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDays.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDays.setText("not found");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEventName, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNickname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDays, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(lblEventName, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDays, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pnContainer.add(jPanel8);

        iconCover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconCover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/escritorio.jpg"))); // NOI18N
        iconCover.setMaximumSize(new java.awt.Dimension(631, 189));
        iconCover.setMinimumSize(new java.awt.Dimension(631, 189));
        iconCover.setPreferredSize(new java.awt.Dimension(945, 189));
        pnContainer.add(iconCover);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMaximumSize(new java.awt.Dimension(304, 189));
        jPanel6.setMinimumSize(new java.awt.Dimension(304, 189));
        jPanel6.setPreferredSize(new java.awt.Dimension(945, 100));
        jPanel6.setRequestFocusEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Descripción");
        jLabel7.setMaximumSize(new java.awt.Dimension(51, 20));
        jLabel7.setMinimumSize(new java.awt.Dimension(51, 20));
        jLabel7.setPreferredSize(new java.awt.Dimension(51, 20));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));

        lblDescription.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDescription.setText("Not found");
        lblDescription.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnCards.setBackground(new java.awt.Color(97, 189, 79));
        btnCards.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnCards.setForeground(new java.awt.Color(255, 255, 255));
        btnCards.setText("Tarjetas");
        btnCards.setBorderPainted(false);
        btnCards.setFocusable(false);
        btnCards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCardsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCards, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCards, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnContainer.add(jPanel6);

        scrollContainer.setViewportView(pnContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrollContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseReleased
        technonizer.TechnoNizer.home.showYourProjects(false);
    }//GEN-LAST:event_jPanel8MouseReleased

    private void btnCardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCardsActionPerformed
        classCards.idproject = idProject;
        technonizer.TechnoNizer.home.showYourCards();
    }//GEN-LAST:event_btnCardsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCards;
    private javax.swing.JLabel iconCover;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblDays;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblEventName;
    private javax.swing.JLabel lblNickname;
    private javax.swing.JPanel pnContainer;
    private javax.swing.JScrollPane scrollContainer;
    // End of variables declaration//GEN-END:variables
}
