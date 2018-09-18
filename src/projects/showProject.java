package projects;

import java.awt.Color;
import javaClass.Project;
import javaClass.classProjects;

public class showProject extends javax.swing.JPanel {

    int proyecto;
    
    public showProject(int event, boolean search) {
        initComponents();
        proyecto = event;
        load(event, search);
    }

    void load(int e, boolean search){
        
        Project project;
        if (!search)
            project = classProjects.projectsShow.get(e);
        else
            project = classProjects.projectsSearch.get(e);
        
        lblProjectName.setText(project.getName());
        lblNickname.setText(project.getNickname());
        
         if(project.getColor() != null){
            String[] color = project.getColor().split(" ");
            pnColor.setBackground(new Color(Integer.parseInt(color[0]), Integer.parseInt(color[1]), Integer.parseInt(color[2])));
        }
        else
            pnColor.setBackground(new Color(35, 150, 243));
        
        if(lblProjectName.getText().length() >= 22){
            lblProjectName.setToolTipText(lblProjectName.getText());
            lblProjectName.setText(lblProjectName.getText().substring(0, 22)+"...");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNickname = new javax.swing.JLabel();
        pnColor = new javax.swing.JPanel();
        lblProjectName = new javax.swing.JLabel();

        lblNickname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNickname.setText("nickName");

        pnColor.setBackground(new java.awt.Color(33, 150, 243));
        pnColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnColorMouseReleased(evt);
            }
        });

        lblProjectName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblProjectName.setForeground(new java.awt.Color(255, 255, 255));
        lblProjectName.setText("Not Found");
        lblProjectName.setToolTipText("");
        lblProjectName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnColorMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnColorLayout = new javax.swing.GroupLayout(pnColor);
        pnColor.setLayout(pnColorLayout);
        pnColorLayout.setHorizontalGroup(
            pnColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnColorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProjectName, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnColorLayout.setVerticalGroup(
            pnColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnColorLayout.createSequentialGroup()
                .addComponent(lblProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNickname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(lblNickname)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pnColorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnColorMouseReleased
        technonizer.TechnoNizer.home.showProject(proyecto);
    }//GEN-LAST:event_pnColorMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblNickname;
    private javax.swing.JLabel lblProjectName;
    private javax.swing.JPanel pnColor;
    // End of variables declaration//GEN-END:variables
}
