package projects;

import javaClass.classProjects;

public class showProject extends javax.swing.JPanel {

    public showProject(int event, boolean search) {
        initComponents();
        
        load(event, search);
    }

    void load(int e, boolean search){
        if(!search){
            lblProjectName.setText(classProjects.projects.get(e).getName());
            lblNickname.setText(classProjects.projects.get(e).getNickname());
        }else{
            lblProjectName.setText(classProjects.projectsSearch.get(e).getName());
            lblNickname.setText(classProjects.projectsSearch.get(e).getNickname());
        }
        
        if(lblProjectName.getText().length() >= 22){
            lblProjectName.setToolTipText(lblProjectName.getText());
            lblProjectName.setText(lblProjectName.getText().substring(0, 22)+"...");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblProjectName = new javax.swing.JLabel();
        lblNickname = new javax.swing.JLabel();

        lblProjectName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblProjectName.setText("Not Found");
        lblProjectName.setToolTipText("");

        lblNickname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNickname.setText("nickName");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNickname, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(lblProjectName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(lblProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNickname)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblNickname;
    private javax.swing.JLabel lblProjectName;
    // End of variables declaration//GEN-END:variables
}
