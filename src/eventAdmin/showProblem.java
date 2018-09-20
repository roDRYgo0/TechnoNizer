package eventAdmin;

import java.awt.Color;
import javaClass.classEvent;
import javaClass.controller;
import javaClass.standardization;

public class showProblem extends javax.swing.JPanel {

    int idEvent, idProblem;
    int condition;
    
    public showProblem(int idProblem, int idEvent) {
        initComponents();
        this.idEvent = idEvent;
        this.idProblem = idProblem;
        
        load();
    }
    
    void load(){
        lblProblem.setText(classEvent.problems.get(idProblem).getProblem());
        lblNickname.setText(classEvent.problems.get(idProblem).getNickname());
        iconPlace.setIcon(new controller().changeImage("/imagenes/place.png", 24, 24));
        iconDate.setIcon(new controller().changeImage("/imagenes/date.png", 24, 24));
        lblPlace.setText(classEvent.problems.get(idProblem).getPlace());
        condition = classEvent.problems.get(idProblem).getCondition();
        switchCondition();
        
        lblDateTime.setText(standardization.getDateToString(classEvent.problems.get(idProblem).getDateTime(), standardization.getDate(classEvent.problems.get(idProblem).getDateTime()), false));
    }
    
    void switchCondition(){
        switch(condition){
            case 0:
                lblSwitch.setText("Sin resolver");
                lblSwitch.setForeground(new Color(255,61,0));
                
                break;
            case 1:
                lblSwitch.setText("Resuelto por");
                lblSwitch.setForeground(new Color(139, 195, 74));
                lblResponsable.setText(classEvent.problems.get(idProblem).getResponsable());
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblProblem = new javax.swing.JTextArea();
        lblPlace = new javax.swing.JLabel();
        lblDateTime = new javax.swing.JLabel();
        lblSwitch = new javax.swing.JLabel();
        lblNickname = new javax.swing.JLabel();
        lblStatus1 = new javax.swing.JLabel();
        lblResponsable = new javax.swing.JLabel();
        btnNext1 = new javax.swing.JButton();
        iconDate = new javax.swing.JLabel();
        iconPlace = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(945, 88));
        setMinimumSize(new java.awt.Dimension(945, 88));
        setPreferredSize(new java.awt.Dimension(945, 88));

        lblProblem.setColumns(20);
        lblProblem.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblProblem.setRows(5);
        lblProblem.setText("Las reservaciones de la casa son aqui en ");
        lblProblem.setFocusable(false);

        lblPlace.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPlace.setText("Sala de conferencias 2");

        lblDateTime.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblDateTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDateTime.setText("8:00 AM");

        lblSwitch.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSwitch.setText("Sin resolver");
        lblSwitch.setMaximumSize(new java.awt.Dimension(30, 30));
        lblSwitch.setMinimumSize(new java.awt.Dimension(30, 30));
        lblSwitch.setPreferredSize(new java.awt.Dimension(30, 30));
        lblSwitch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSwitchMouseReleased(evt);
            }
        });

        lblNickname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNickname.setForeground(new java.awt.Color(153, 153, 153));
        lblNickname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNickname.setText("nickname");

        lblStatus1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblStatus1.setForeground(new java.awt.Color(102, 102, 102));
        lblStatus1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStatus1.setText("Estado");

        lblResponsable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblResponsable.setForeground(new java.awt.Color(153, 153, 153));
        lblResponsable.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnNext1.setBackground(new java.awt.Color(0, 153, 0));
        btnNext1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext1.setForeground(new java.awt.Color(255, 255, 255));
        btnNext1.setText("Resolver");
        btnNext1.setBorderPainted(false);
        btnNext1.setFocusable(false);
        btnNext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext1ActionPerformed(evt);
            }
        });

        iconDate.setMaximumSize(new java.awt.Dimension(28, 28));
        iconDate.setMinimumSize(new java.awt.Dimension(28, 28));
        iconDate.setPreferredSize(new java.awt.Dimension(28, 28));

        iconPlace.setMaximumSize(new java.awt.Dimension(24, 24));
        iconPlace.setMinimumSize(new java.awt.Dimension(24, 24));
        iconPlace.setPreferredSize(new java.awt.Dimension(24, 24));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProblem, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPlace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iconPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 32, Short.MAX_VALUE)
                        .addComponent(lblDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iconDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProblem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNickname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(iconDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDateTime, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(iconPlace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPlace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblSwitch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblSwitchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSwitchMouseReleased

    }//GEN-LAST:event_lblSwitchMouseReleased

    private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ActionPerformed
//        if(classEvent.deleteAct(classEvent.activities.get(idActivity).getId())){
//            classEvent.activities.clear();
//            classEvent.selectActivity(classEvent.eventosShow.get(idEvent).getId());
//            technonizer.TechnoNizer.home.showEventActivities(idEvent);
//            standardization.showMessage("ok", "Eliminado correctamente");
//        }
//        else
//        standardization.showMessage("cancel", "No se logro eliminar");
    }//GEN-LAST:event_btnNext1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext1;
    private javax.swing.JLabel iconDate;
    private javax.swing.JLabel iconPlace;
    private javax.swing.JLabel lblDateTime;
    private javax.swing.JLabel lblNickname;
    private javax.swing.JLabel lblPlace;
    private javax.swing.JTextArea lblProblem;
    private javax.swing.JLabel lblResponsable;
    private javax.swing.JLabel lblStatus1;
    private javax.swing.JLabel lblSwitch;
    // End of variables declaration//GEN-END:variables
}
