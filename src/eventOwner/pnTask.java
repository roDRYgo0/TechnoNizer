package eventOwner;

import java.util.Properties;
import javaClass.classEvent;
import javaClass.controller;
import javaClass.standardization;
import properties.propiedades;

public class pnTask extends javax.swing.JPanel {
 
    Properties pr= new propiedades(controller.idioma);
    void verificaridioma()
    {
    pr= new propiedades(controller.idioma);
    Tasklistlbl.setText(pr.getProperty("Tasklistlbl"));
    lblNickname.setText(pr.getProperty("lblNicknameT"));
    btnNext1.setText(pr.getProperty("btnNext1TaskL"));
    }
    
    int idEvent;
    byte[] image, imageCover;
    Double total, complete;
    Double porc;
    boolean init;
    
    public pnTask(int idEvent) {
        initComponents();
        verificaridioma();
        this.idEvent = idEvent;  
        complete = 0.0;
        total = 0.0;
        init = true;
        scrollContainer.getVerticalScrollBar().setUnitIncrement(16);
        if(classEvent.position == 2)
            btnNext1.setVisible(false);
        load();
    }
    
    void load(){
        classEvent.selectTasks(classEvent.eventosShow.get(idEvent).getId());
        total = classEvent.evento.getTasks().size()*1.0;
        if(classEvent.evento.getTasks().isEmpty())
            pnContainer.add(new Text(pr.getProperty("TaskStatus")));
        else{
            for(int i = 0; i < classEvent.evento.getTasks().size(); i++){
                if(classEvent.evento.getTasks().get(i).getPrice() == 0.0){
                    if(init){
                        pnContainer.add(new Text(pr.getProperty("CostTask")));
                        init = false;
                    }
                    pnContainer.add(new showTask(i, idEvent));
                    if(classEvent.evento.getTasks().get(i).getCondition() == 1)
                        complete++;
                }
            }
            init = true;
            for(int i = 0; i < classEvent.evento.getTasks().size(); i++){
                if(classEvent.evento.getTasks().get(i).getPrice() > 0.0){
                    if(init){
                        pnContainer.add(new Text(pr.getProperty("WithCostoTask")));
                        init = false;
                    }
                    pnContainer.add(new showTask(i, idEvent));
                    if(classEvent.evento.getTasks().get(i).getCondition() == 1)
                        complete++;
                }
            }
        }
        porc = complete/total;
        porc*=100;
        int b = (int)porc.doubleValue();
        System.out.println(b);
        progressBar.setValue(b);
        lblPor.setText(b+"%");
        
        pnContainer.revalidate();
        pnContainer.repaint();
            
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollContainer = new javax.swing.JScrollPane();
        pnContainer = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        Tasklistlbl = new javax.swing.JLabel();
        btnNext1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        progressBar = new javax.swing.JProgressBar();
        lblPor = new javax.swing.JLabel();
        lblNickname = new javax.swing.JLabel();

        scrollContainer.setBorder(null);
        scrollContainer.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollContainer.setToolTipText("");

        pnContainer.setBackground(new java.awt.Color(204, 204, 204));
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

        Tasklistlbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Tasklistlbl.setForeground(new java.awt.Color(255, 0, 0));
        Tasklistlbl.setText("Lista de tareas");

        btnNext1.setBackground(new java.awt.Color(0, 153, 255));
        btnNext1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext1.setForeground(new java.awt.Color(255, 255, 255));
        btnNext1.setText("Agregar");
        btnNext1.setBorderPainted(false);
        btnNext1.setFocusable(false);
        btnNext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext1ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setMaximumSize(new java.awt.Dimension(448, 32));
        jPanel5.setMinimumSize(new java.awt.Dimension(448, 32));
        jPanel5.setPreferredSize(new java.awt.Dimension(448, 39));

        progressBar.setBackground(new java.awt.Color(255, 255, 255));
        progressBar.setForeground(new java.awt.Color(31, 171, 31));
        progressBar.setValue(66);

        lblPor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPor.setText("66%");

        lblNickname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNickname.setForeground(new java.awt.Color(153, 153, 153));
        lblNickname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNickname.setText("Completo");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNickname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lblPor, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(lblNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPor)
                    .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(Tasklistlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(btnNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tasklistlbl)
                            .addComponent(btnNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pnContainer.add(jPanel8);

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

    private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ActionPerformed
        AddTask task = new AddTask(idEvent);
        standardization.show(task);
        controller.rootFrame = task;
    }//GEN-LAST:event_btnNext1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Tasklistlbl;
    private javax.swing.JButton btnNext1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lblNickname;
    private javax.swing.JLabel lblPor;
    private javax.swing.JPanel pnContainer;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JScrollPane scrollContainer;
    // End of variables declaration//GEN-END:variables
}
