package projectAdmin;

import eventAdmin.footer;
import java.awt.Dimension;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javaClass.Project;
import javaClass.classProjects;
import javaClass.controller;
import javaClass.standardization;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class pnProjSettings extends javax.swing.JPanel {

    int idProject;
    byte[] imageCover;
    
    public pnProjSettings(int idProject) {
        initComponents();
        this.idProject = idProject;  
        scrollContainer.getVerticalScrollBar().setUnitIncrement(16);
        
        load(classProjects.projectsShow.get(idProject));
        
    }

    void load(Project project){
        
        if(project.getCoverImage()!= null)
            iconCover.setIcon(standardization.getImgIcon(project.getCoverImage()));
        
        pnContainer.add(new pnPreferences(idProject));
        pnTeam pS = new pnTeam(idProject);
        int size = 0;
        if(project.getMembers() != null)
            size = (project.getMembers().size() <= 1) ? 1 : (project.getMembers().size() -1) * 50;

        pS.setPreferredSize(new Dimension(465,226+size));
        pnContainer.add(pS);
        
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
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnDelete5 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        iconCover = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        scrollContainer.setBorder(null);
        scrollContainer.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollContainer.setToolTipText("");

        pnContainer.setBackground(new java.awt.Color(153, 204, 255));
        javaClass.ModifiedFlowLayout modifiedFlowLayout1 = new javaClass.ModifiedFlowLayout();
        modifiedFlowLayout1.setAlignment(java.awt.FlowLayout.LEFT);
        modifiedFlowLayout1.setHgap(10);
        modifiedFlowLayout1.setAlignOnBaseline(true);
        pnContainer.setLayout(modifiedFlowLayout1);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setMaximumSize(new java.awt.Dimension(945, 90));
        jPanel8.setMinimumSize(new java.awt.Dimension(945, 90));
        jPanel8.setPreferredSize(new java.awt.Dimension(945, 90));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel8MouseReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Configuraciones");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        btnDelete5.setBackground(new java.awt.Color(255, 51, 51));
        btnDelete5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete5.setText("Borrar proyecto");
        btnDelete5.setBorderPainted(false);
        btnDelete5.setFocusable(false);
        btnDelete5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnDelete5.setMaximumSize(new java.awt.Dimension(79, 28));
        btnDelete5.setMinimumSize(new java.awt.Dimension(79, 28));
        btnDelete5.setPreferredSize(new java.awt.Dimension(79, 28));
        btnDelete5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(537, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnDelete5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(2, Short.MAX_VALUE))
        );

        pnContainer.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setMaximumSize(new java.awt.Dimension(945, 280));
        jPanel9.setMinimumSize(new java.awt.Dimension(945, 280));
        jPanel9.setPreferredSize(new java.awt.Dimension(945, 280));

        iconCover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconCover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/escritorio.jpg"))); // NOI18N
        iconCover.setToolTipText("");
        iconCover.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        iconCover.setMaximumSize(new java.awt.Dimension(631, 189));
        iconCover.setMinimumSize(new java.awt.Dimension(631, 189));
        iconCover.setPreferredSize(new java.awt.Dimension(631, 189));
        iconCover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                iconCoverMouseReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Cambiar imagenes");

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconCover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addContainerGap(294, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(iconCover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pnContainer.add(jPanel9);

        scrollContainer.setViewportView(pnContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrollContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseReleased
        technonizer.TechnoNizer.home.showProject();
    }//GEN-LAST:event_jPanel8MouseReleased

    private void iconCoverMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconCoverMouseReleased
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
                imageCover = icono;
                changeCover();
                iconCover.setIcon(standardization.getImgIcon(icono));
            }catch(IOException ex){
                imageCover = null;
            }
        }
    }//GEN-LAST:event_iconCoverMouseReleased

    private void btnDelete5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete5ActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "¿Estás seguro que deseas borrar el proyecto?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (result == 0) {
            classProjects.delete(classProjects.projectsShow.get(idProject).getId());
            standardization.showMessage("ok", "Proyecto borrado");
            classProjects.select();
            technonizer.TechnoNizer.home.showYourProjects(false);
            controller.rootFrame = technonizer.TechnoNizer.home;
        }
    }//GEN-LAST:event_btnDelete5ActionPerformed

    void changeCover(){
        classProjects.projectsShow.get(idProject).setCoverImage(imageCover);
        for(Project e : classProjects.projectsShow){
            if(e.getId() == classProjects.projectsShow.get(idProject).getId()){
                e.setCoverImage(imageCover);
                if(classProjects.updateCover(e.getId(), imageCover))
                    standardization.showMessage("ok", "Imagen cambiada");
                else
                    standardization.showMessage("cancel", "No se logro cambiar");
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnDelete2;
    private javax.swing.JButton btnDelete3;
    private javax.swing.JButton btnDelete4;
    private javax.swing.JButton btnDelete5;
    private javax.swing.JLabel iconCover;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel pnContainer;
    private javax.swing.JScrollPane scrollContainer;
    // End of variables declaration//GEN-END:variables
}
