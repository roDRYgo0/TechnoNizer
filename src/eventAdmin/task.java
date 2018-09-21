package eventAdmin;

import javaClass.classEvent;

public class task extends javax.swing.JPanel {

    int idEvent;
    int count;
    Double total, complete;
    Double porc;
    
    public task(int idEvent) {
        initComponents();
        this.idEvent = idEvent;
        complete = 0.0;
        count = 0;
        load();
    }
    
    void load(){
        total = classEvent.tasks.size()*1.0;
        for(int i = 0; i < classEvent.tasks.size(); i++){
            if(classEvent.tasks.get(i).getCondition() == 1)
                complete++;
        }
        for(int i = 0; i < classEvent.tasks.size(); i++){
            if(classEvent.tasks.get(i).getCondition() == 0){
                this.add(new taskMenu(i, idEvent));
                count ++;
                if(count == 8){
                    this.add(new more(idEvent, 2));
                    break;
                }
            }
        }
        
        porc = complete/total;
        porc*=100;
        int b = (int)porc.doubleValue();
        progressBar.setValue(b);
        lblPor.setText(b+"%");
        
        if(b == 100)
            this.add(new more(idEvent, 2));
        
        this.revalidate();
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        progressBar = new javax.swing.JProgressBar();
        lblPor = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(467, 483));
        setMinimumSize(new java.awt.Dimension(467, 483));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(467, 483));
        setLayout(new javaClass.ModifiedFlowLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(448, 59));
        jPanel1.setMinimumSize(new java.awt.Dimension(448, 59));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Lista de tareas");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });

        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1);

        jPanel5.setMaximumSize(new java.awt.Dimension(448, 32));
        jPanel5.setMinimumSize(new java.awt.Dimension(448, 32));
        jPanel5.setPreferredSize(new java.awt.Dimension(448, 25));

        progressBar.setBackground(new java.awt.Color(255, 255, 255));
        progressBar.setForeground(new java.awt.Color(31, 171, 31));
        progressBar.setValue(66);

        lblPor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPor.setText("66%");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPor, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPor)
                    .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel5);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        technonizer.TechnoNizer.home.pnEvent();
    }//GEN-LAST:event_jLabel2MouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblPor;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}
