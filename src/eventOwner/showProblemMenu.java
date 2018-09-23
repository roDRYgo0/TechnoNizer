package eventOwner;

import java.awt.Color;
import javaClass.classEvent;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.standardization;

public class showProblemMenu extends javax.swing.JPanel {

    int idProblem, idEvent;
    
    public showProblemMenu(int idProblem, int idEvent) {
        initComponents();
        this.idProblem = idProblem;
        this.idEvent = idEvent;
        lblProblem.setText(classEvent.evento.getProblems().get(idProblem).getProblem());
        lblNickname.setText(classEvent.evento.getProblems().get(idProblem).getNickname());
        lblSwitch.setText("Sin resolver");
        lblSwitch.setForeground(new Color(255,61,0));
        switch(classEvent.evento.getProblems().get(idProblem).getDanger()){
            case 1:
                iconDanger.setIcon(new controller().changeImage("/imagenes/question.png", 32, 2));
                break;
            case 2:
                iconDanger.setIcon(new controller().changeImage("/imagenes/warning.png", 32, 32));
                break;
            case 3:
                iconDanger.setIcon(new controller().changeImage("/imagenes/alert.png", 32, 32));
                break;
        }
    }

    void resolve(String nickname, int condition){
        if(classEvent.updateProblem(nickname, classEvent.evento.getProblems().get(idProblem).getId(), condition)){
            classEvent.evento.getProblems().clear();
            classEvent.selectProblems(classEvent.eventosShow.get(idEvent).getId());
            technonizer.TechnoNizer.home.showEventOwner(idEvent, true);
            standardization.showMessage("ok", "Problema actualizado");
        }
        else
            standardization.showMessage("cancel", "Problema no actualizado");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblProblem = new javax.swing.JTextArea();
        lblSwitch = new javax.swing.JLabel();
        lblStatus1 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        lblNickname = new javax.swing.JLabel();
        iconDanger = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(925, 42));
        setMinimumSize(new java.awt.Dimension(925, 42));
        setPreferredSize(new java.awt.Dimension(925, 42));

        lblProblem.setColumns(20);
        lblProblem.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblProblem.setRows(5);
        lblProblem.setText("Las reservaciones de la casa son aqui en ");
        lblProblem.setFocusable(false);

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

        lblStatus1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblStatus1.setForeground(new java.awt.Color(102, 102, 102));
        lblStatus1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStatus1.setText("Estado");

        btnNext.setBackground(new java.awt.Color(0, 153, 0));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Resolver");
        btnNext.setBorderPainted(false);
        btnNext.setFocusable(false);
        btnNext.setMaximumSize(new java.awt.Dimension(83, 27));
        btnNext.setMinimumSize(new java.awt.Dimension(83, 27));
        btnNext.setPreferredSize(new java.awt.Dimension(83, 27));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        lblNickname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNickname.setForeground(new java.awt.Color(153, 153, 153));
        lblNickname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNickname.setText("nickname");

        iconDanger.setMaximumSize(new java.awt.Dimension(32, 32));
        iconDanger.setMinimumSize(new java.awt.Dimension(32, 32));
        iconDanger.setPreferredSize(new java.awt.Dimension(32, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProblem, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iconDanger, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconDanger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNickname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblSwitch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblProblem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblSwitchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSwitchMouseReleased

    }//GEN-LAST:event_lblSwitchMouseReleased

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        resolve(classUsuario.getNickname(), 1);
    }//GEN-LAST:event_btnNextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel iconDanger;
    private javax.swing.JLabel lblNickname;
    private javax.swing.JTextArea lblProblem;
    private javax.swing.JLabel lblStatus1;
    private javax.swing.JLabel lblSwitch;
    // End of variables declaration//GEN-END:variables
}
