package eventOwner;

import java.util.Properties;
import javaClass.classEvent;
import javaClass.controller;
import javaClass.standardization;
import properties.propiedades;

public class pnProblem extends javax.swing.JPanel {

    void verificaridioma()
    {
    Properties pr= new propiedades(controller.idioma);
    Problemlbl1.setText(pr.getProperty("Problemlbl1"));
    btnNext1.setText(pr.getProperty("btnNext1Problems"));
    }
    
    
    int idEvent;
    boolean stat;
    
    public pnProblem(int idEvent) {
        initComponents();
        this.idEvent = idEvent;  
        stat = true;
        scrollContainer.getVerticalScrollBar().setUnitIncrement(16);
         verificaridioma();
        load();
    }
    
    void load(){
        classEvent.selectProblems(classEvent.eventosShow.get(idEvent).getId());
        
        for(int i = 3; i >=1 ; i--){
            for(int a = 0; a < classEvent.evento.getProblems().size(); a++){
                if(classEvent.evento.getProblems().get(a).getDanger() == i){
                    if(stat){
                        pnContainer.add(new level(i));
                        pnContainer.add(new showProblem(a, idEvent));
                        stat = false;
                    }else
                        pnContainer.add(new showProblem(a, idEvent));
                }
            }
            stat = true;
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollContainer = new javax.swing.JScrollPane();
        pnContainer = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        Problemlbl1 = new javax.swing.JLabel();
        btnNext1 = new javax.swing.JButton();

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

        Problemlbl1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Problemlbl1.setForeground(new java.awt.Color(255, 0, 0));
        Problemlbl1.setText("Problemas");

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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(Problemlbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 652, Short.MAX_VALUE)
                .addComponent(btnNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Problemlbl1)
                    .addComponent(btnNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        AddProblem problem = new AddProblem(idEvent);
        standardization.show(problem);
        controller.rootFrame = problem;
        technonizer.TechnoNizer.home.colorEvent();
    }//GEN-LAST:event_btnNext1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Problemlbl1;
    private javax.swing.JButton btnNext1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel pnContainer;
    private javax.swing.JScrollPane scrollContainer;
    // End of variables declaration//GEN-END:variables
}
