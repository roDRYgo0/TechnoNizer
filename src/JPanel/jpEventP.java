package JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javaClass.classEvent;
import javaClass.classPersonalE;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.eventp;

public final class jpEventP extends javax.swing.JPanel {

    
    
    public jpEventP(boolean start) {
        initComponents();
        insertarPaneles(classUsuario.getMyNumberEventUse(), start);
        txtSearch.requestFocus();
        load();

     
    }
    
    public void load(){
        iconSearch.setIcon(new controller().changeImage("/imagenes/search.png", 35, 35));
        insertarPaneles(classPersonalE.eventos.size(), false);
        
         
    }
   
    public void insertarPaneles(int paneles, boolean search){
        
        pnEvent.removeAll();
        
        if(!search){
            classPersonalE.eventosShow.clear();
            for(eventp e : classPersonalE.eventos){
                if(e.getNickname().equals(classUsuario.getNickname()))
                    classPersonalE.eventosShow.add(e);
            }
            
        }else{
            classPersonalE.eventosShow.clear();
            for(eventp e : classPersonalE.eventosSearch){
                if(e.getNickname().equals(classUsuario.getNickname()))
                    classPersonalE.eventosShow.add(e);
            }
           
        }
        
        for(int i = 0; i < classPersonalE.eventosShow.size(); i++){
            JPanel.showEventP show = new JPanel.showEventP(i);
            show.setSize(190, 120);

            pnEvent.add(show, BorderLayout.CENTER);
            pnEvent.revalidate();
            pnEvent.repaint();
        }
        JPanel.addEventP show = new JPanel.addEventP();
        show.setSize(190, 120);

        pnEvent.add(show, BorderLayout.CENTER);
        pnEvent.revalidate();
        pnEvent.repaint();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEventjpE = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        SearchjpEvent = new javax.swing.JLabel();
        spSearch = new javax.swing.JSeparator();
        iconSearch = new javax.swing.JLabel();
        scrollEvent = new javax.swing.JScrollPane();
        pnEvent = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(99999, 99999));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(980, 601));

        lblEventjpE.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblEventjpE.setForeground(new java.awt.Color(255, 0, 0));
        lblEventjpE.setText("Eventos");
        lblEventjpE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblEventjpEMouseReleased(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtSearch.setAutoscrolls(false);
        txtSearch.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchFocusLost(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        SearchjpEvent.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        SearchjpEvent.setForeground(new java.awt.Color(102, 102, 102));
        SearchjpEvent.setText("Buscador");

        spSearch.setForeground(new java.awt.Color(204, 204, 204));

        iconSearch.setMaximumSize(new java.awt.Dimension(35, 35));
        iconSearch.setMinimumSize(new java.awt.Dimension(35, 35));
        iconSearch.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SearchjpEvent)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearch)
                    .addComponent(spSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SearchjpEvent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(spSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iconSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scrollEvent.setBorder(null);
        scrollEvent.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnEvent.setBackground(new java.awt.Color(255, 255, 255));
        javaClass.ModifiedFlowLayout modifiedFlowLayout1 = new javaClass.ModifiedFlowLayout();
        modifiedFlowLayout1.setHgap(10);
        modifiedFlowLayout1.setVgap(10);
        modifiedFlowLayout1.setAlignment(java.awt.FlowLayout.LEFT);
        pnEvent.setLayout(modifiedFlowLayout1);
        scrollEvent.setViewportView(pnEvent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 952, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEventjpE, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEventjpE, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollEvent)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusGained
        spSearch.setBackground(Color.red);
    }//GEN-LAST:event_txtSearchFocusGained

    private void txtSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusLost
        spSearch.setBackground(Color.white);
    }//GEN-LAST:event_txtSearchFocusLost

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        
    }//GEN-LAST:event_txtSearchKeyPressed
    int num = 0;
    
    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        char c = evt.getKeyChar();
        if(txtSearch.getText().length()<41){
            if(Character.isLetter(c) || Character.isSpaceChar(c) || Character.isDigit(c)){}
            else
            evt.consume();
        }else
            evt.consume();
    }//GEN-LAST:event_txtSearchKeyTyped

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE && txtSearch.getText().trim().isEmpty() || evt.getKeyCode() == KeyEvent.VK_DELETE && txtSearch.getText().trim().isEmpty())
            insertarPaneles(classUsuario.getMyNumberEventUse(), false);
        else{
            
            classPersonalE.eventosSearch.clear();
            for(eventp e:classPersonalE.eventos){
                if(e.getTitle().toLowerCase().contains(txtSearch.getText().toLowerCase())){
                    classPersonalE.eventosSearch.add(e);
                }else{
                }
            }
            insertarPaneles(classEvent.eventosSearch.size(), true);
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void lblEventjpEMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEventjpEMouseReleased
        technonizer.TechnoNizer.home.pnEvent();
    }//GEN-LAST:event_lblEventjpEMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SearchjpEvent;
    private javax.swing.JLabel iconSearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEventjpE;
    private javax.swing.JPanel pnEvent;
    private javax.swing.JScrollPane scrollEvent;
    private javax.swing.JSeparator spSearch;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
