package allEvent;

import java.awt.Dimension;
import javaClass.classEvent;
import javaClass.event;
import eventAdmin.*;

public class eventAdmin extends javax.swing.JPanel {

    int idEvent;
    
    public eventAdmin(int idEvent) {
        initComponents();
        this.idEvent = idEvent;
        load(classEvent.eventosShow.get(idEvent));
        
    }

    void load(event event){
        lblEventName.setText(event.getEventName());     
        
        loadPrice(event);
        loadStaff(event);
        loadFooter();
    }
    
    void loadPrice(event event){
        pnPrice pP = new pnPrice(event, idEvent);
        int size = (event.getPrices().size() <= 3) ? 1 : (event.getPrices().size() -3) * 50;

        pP.setPreferredSize(new Dimension(530,226+size));
        pnContainer.add(pP);

        pnContainer.revalidate();
        pnContainer.repaint();
    }
    
    void loadStaff(event event){       
        pnStaff pS = new pnStaff(idEvent);
        int size = 0;
        if(event.getStaffs() != null)
            size = (event.getStaffs().size() <= 2) ? 1 : (event.getStaffs().size() -2) * 50;

        pS.setPreferredSize(new Dimension(405,226+size));
        pnContainer.add(pS);

        pnContainer.revalidate();
        pnContainer.repaint();
    }
    
    void loadFooter(){       
        pnFooter pF = new pnFooter();

        pF.setPreferredSize(new Dimension(945, 70));
        pnContainer.add(pF);

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
        jPanel6 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        scrollContainer.setBorder(null);

        pnContainer.setBackground(new java.awt.Color(153, 204, 255));
        javaClass.ModifiedFlowLayout modifiedFlowLayout1 = new javaClass.ModifiedFlowLayout();
        modifiedFlowLayout1.setAlignment(java.awt.FlowLayout.LEFT);
        modifiedFlowLayout1.setHgap(10);
        pnContainer.setLayout(modifiedFlowLayout1);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setMaximumSize(new java.awt.Dimension(945, 131));
        jPanel8.setMinimumSize(new java.awt.Dimension(945, 131));
        jPanel8.setPreferredSize(new java.awt.Dimension(945, 118));

        lblEventName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblEventName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/forgotPassword.png"))); // NOI18N
        lblEventName.setText("not found");

        lblNickname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNickname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNickname.setText("not found");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(lblEventName, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156)
                .addComponent(lblNickname, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(lblEventName, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnContainer.add(jPanel8);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMaximumSize(new java.awt.Dimension(304, 189));
        jPanel6.setMinimumSize(new java.awt.Dimension(304, 189));
        jPanel6.setPreferredSize(new java.awt.Dimension(304, 189));

        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jButton5)
                .addGap(47, 47, 47)
                .addComponent(jButton1)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton1))
                .addGap(72, 72, 72))
        );

        pnContainer.add(jPanel6);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/escritorio.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(631, 189));
        jLabel1.setMinimumSize(new java.awt.Dimension(631, 189));
        jLabel1.setPreferredSize(new java.awt.Dimension(631, 189));
        pnContainer.add(jLabel1);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMaximumSize(new java.awt.Dimension(945, 56));
        jPanel4.setMinimumSize(new java.awt.Dimension(945, 56));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 945, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        pnContainer.add(jPanel4);

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
            .addComponent(scrollContainer)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setPreferredSize(new Dimension(this.getPreferredSize().width, this.getPreferredSize().height+60));
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pnContainer.setPreferredSize(new Dimension(pnContainer.getPreferredSize().width, pnContainer.getPreferredSize().height+30));
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lblEventName;
    private javax.swing.JLabel lblNickname;
    private javax.swing.JPanel pnContainer;
    private javax.swing.JScrollPane scrollContainer;
    // End of variables declaration//GEN-END:variables
}
