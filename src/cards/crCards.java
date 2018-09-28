package cards;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.util.Properties;
import javaClass.Card;
import javaClass.classCards;
import javaClass.controller;
import properties.propiedades;

public class crCards extends javax.swing.JPanel {

    void verificaridioma(){
        Properties pr= new propiedades(controller.idioma);
        titlejpProjects.setText(pr.getProperty("TitleCards"));
        SearchjpProject.setText(pr.getProperty("SearchjpProject"));
    }
    
    int paneles;

    public crCards() {
        initComponents();
        classCards.select();
        insertarPaneles(classCards.cards.size(), false);
        verificaridioma();
        load();
    }
    
    void load(){
        iconSearch.setIcon(new controller().changeImage("/imagenes/search.png", 35, 35));
    }
    
    public void insertarPaneles(int paneles, boolean search){
        allCards allP = new allCards(paneles, search);
        allP.setLocation(0,0);

        allP.setPreferredSize(new Dimension(960, 488+(155 * classCards.spaceCard(paneles))));
        
        scrollProjects.setViewportView(allP);
        scrollProjects.revalidate();
        scrollProjects.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlejpProjects = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        SearchjpProject = new javax.swing.JLabel();
        spSearch = new javax.swing.JSeparator();
        iconSearch = new javax.swing.JLabel();
        scrollProjects = new javax.swing.JScrollPane();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(99999, 99999));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(980, 601));

        titlejpProjects.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titlejpProjects.setForeground(new java.awt.Color(255, 0, 0));
        titlejpProjects.setText("Tarjetas");
        titlejpProjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                titlejpProjectsMouseReleased(evt);
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

        SearchjpProject.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        SearchjpProject.setForeground(new java.awt.Color(102, 102, 102));
        SearchjpProject.setText("Buscador");

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
                .addComponent(SearchjpProject)
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
                .addComponent(SearchjpProject)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(spSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iconSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scrollProjects.setBorder(null);
        scrollProjects.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titlejpProjects, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollProjects))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titlejpProjects, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollProjects, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
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
            insertarPaneles(classCards.cards.size(), false);
        else if(evt.getKeyCode() == KeyEvent.VK_DELETE && txtSearch.getText().length() == 1 || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE && txtSearch.getText().length() == 1)
            insertarPaneles(classCards.cards.size(), false);
        else{
            classCards.cardsSearch.clear();
            for(Card e: classCards.cards){
                if(e.title.toLowerCase().contains(txtSearch.getText().toLowerCase())){
                    classCards.cardsSearch.add(e);
                }else{
                }
            }
            insertarPaneles(classCards.cardsSearch.size(), true);
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void titlejpProjectsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlejpProjectsMouseReleased
        technonizer.TechnoNizer.home.pnProjects();
    }//GEN-LAST:event_titlejpProjectsMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SearchjpProject;
    private javax.swing.JLabel iconSearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JScrollPane scrollProjects;
    private javax.swing.JSeparator spSearch;
    private javax.swing.JLabel titlejpProjects;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
