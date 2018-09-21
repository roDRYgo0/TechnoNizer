package eventOwner;

import java.awt.Dimension;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javaClass.classEvent;
import javaClass.controller;
import javaClass.event;
import javaClass.standardization;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class pnSettings extends javax.swing.JPanel {

    int idEvent;
    byte[] image, imageCover;
    
    public pnSettings(int idEvent) {
        initComponents();
        this.idEvent = idEvent;  
        scrollContainer.getVerticalScrollBar().setUnitIncrement(16);
        
        load(classEvent.eventosShow.get(idEvent));
        check();
    }
    
    void check(){
        if(classEvent.position == 1)
            pnContainer.remove(pnImage);
    }

    void load(event event){
        
        if(event.getProfilePicture() != null)
            iconProfile.setIcon(new controller().changeSizeImage(standardization.getImgIcon(event.getProfilePicture()), 180, 180));
        if(event.getCoverPicture()!= null)
            iconCover.setIcon(standardization.getImgIcon(event.getCoverPicture()));
        
        if(classEvent.position != 1)
            pnContainer.add(new preferences(idEvent));
        staff pS = new staff(idEvent);
        int size = 0;
        if(event.getStaffs() != null)
            size = (event.getStaffs().size() <= 1) ? 1 : (event.getStaffs().size() -1) * 50;

        pS.setPreferredSize(new Dimension(465,226+size));
        pnContainer.add(pS);
        if(classEvent.position != 1)
            pnContainer.add(new place(idEvent));
        if(classEvent.position != 1)
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
        pnImage = new javax.swing.JPanel();
        iconProfile = new javax.swing.JLabel();
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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)))
                .addContainerGap(537, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pnContainer.add(jPanel8);

        pnImage.setBackground(new java.awt.Color(255, 255, 255));
        pnImage.setMaximumSize(new java.awt.Dimension(945, 280));
        pnImage.setMinimumSize(new java.awt.Dimension(945, 280));
        pnImage.setPreferredSize(new java.awt.Dimension(945, 280));

        iconProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/profile.png"))); // NOI18N
        iconProfile.setMaximumSize(new java.awt.Dimension(243, 189));
        iconProfile.setMinimumSize(new java.awt.Dimension(243, 189));
        iconProfile.setPreferredSize(new java.awt.Dimension(243, 189));
        iconProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                iconProfileMouseReleased(evt);
            }
        });

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

        javax.swing.GroupLayout pnImageLayout = new javax.swing.GroupLayout(pnImage);
        pnImage.setLayout(pnImageLayout);
        pnImageLayout.setHorizontalGroup(
            pnImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnImageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnImageLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconCover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        pnImageLayout.setVerticalGroup(
            pnImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnImageLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(pnImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconCover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        pnContainer.add(pnImage);

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
        technonizer.TechnoNizer.home.showEventOwner(idEvent, true);
    }//GEN-LAST:event_jPanel8MouseReleased

    private void iconProfileMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconProfileMouseReleased
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
                changeProfile();
                iconProfile.setIcon(new controller().changeSizeImage(standardization.getImgIcon(icono), 180, 180));
            }catch(IOException ex){
                image = null;
            }
        }
        
    }//GEN-LAST:event_iconProfileMouseReleased

    void changeProfile(){
        classEvent.eventosShow.get(idEvent).setProfilePicture(image);
        for(event e : classEvent.eventos){
            if(e.getId() == classEvent.eventosShow.get(idEvent).getId()){
                e.setProfilePicture(image);
                if(classEvent.updateProfile(e.getId(), image))
                    standardization.showMessage("ok", "Imagen cambiada");
                else
                    standardization.showMessage("cancel", "No se logro cambiar");
            }
        }
    }
    
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

    void changeCover(){
        classEvent.eventosShow.get(idEvent).setCoverPicture(imageCover);
        for(event e : classEvent.eventos){
            if(e.getId() == classEvent.eventosShow.get(idEvent).getId()){
                e.setCoverPicture(imageCover);
                if(classEvent.updateCover(e.getId(), imageCover))
                    standardization.showMessage("ok", "Imagen cambiada");
                else
                    standardization.showMessage("cancel", "No se logro cambiar");
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconCover;
    private javax.swing.JLabel iconProfile;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel pnContainer;
    private javax.swing.JPanel pnImage;
    private javax.swing.JScrollPane scrollContainer;
    // End of variables declaration//GEN-END:variables
}
