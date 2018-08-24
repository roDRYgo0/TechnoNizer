package JPanel;


import jFrame.addReminderGral;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javaClass.classReminder;
import javaClass.classUsuario;
import javaClass.controller;
import javaClass.standardization;
import javax.swing.JOptionPane;
import technonizer.TechnoNizer;

public class jpReminder extends javax.swing.JPanel {

     
    
    
     int view;
    
    public jpReminder() {
        initComponents();
        view = 0;
        
        load();
    }

    void load(){
        insertarPaneles(classReminder.reminders.size(), false);
        
        loadImage();
    }
    
    void loadImage(){
        iconSearch.setIcon(new controller().changeImage("/imagenes/search.png", 35, 35));
        iconView.setIcon(new controller().changeImage("/imagenes/viewGrid.png", 50, 50));
    }


    public void insertarPaneles(int paneles, boolean search){
       if(search){
            allReminder allReminder = new allReminder(paneles, search, view);
            allReminder.setLocation(0,0);
            if(view == 0)
                allReminder.setPreferredSize(new Dimension(960, 348+(168*classReminder.getSpaceSearchGrid())));
            else
                allReminder.setPreferredSize(new Dimension(960, 348+(168*classReminder.getSpaceSearchList())));

            scrollReminders.setViewportView(allReminder);
            scrollReminders.revalidate();
            scrollReminders.repaint();
        }else{
            allReminder allReminder = new allReminder(paneles, search, view);
            allReminder.setLocation(0,0);

            if(view == 0)
                allReminder.setPreferredSize(new Dimension(960, 348+(168*classReminder.getSpaceAllGrid())));
            else
                allReminder.setPreferredSize(new Dimension(960, 348+(168*classReminder.getSpaceAllList())));

            scrollReminders.setViewportView(allReminder);
            scrollReminders.revalidate();
            scrollReminders.repaint();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        iconSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        spSearch = new javax.swing.JSeparator();
        iconView = new javax.swing.JLabel();
        scrollReminders = new javax.swing.JScrollPane();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(980, 601));
        setMinimumSize(new java.awt.Dimension(980, 601));
        setPreferredSize(new java.awt.Dimension(980, 601));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agenda");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));
        jPanel1.setPreferredSize(new java.awt.Dimension(190, 120));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1formMouseReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jLabel2.setText("Agregar nuevo recordatorio");

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        jLabel3.setText("+");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Buscador");

        iconSearch.setMaximumSize(new java.awt.Dimension(35, 35));
        iconSearch.setMinimumSize(new java.awt.Dimension(35, 35));
        iconSearch.setPreferredSize(new java.awt.Dimension(35, 35));

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

        spSearch.setForeground(new java.awt.Color(204, 204, 204));

        iconView.setMaximumSize(new java.awt.Dimension(50, 50));
        iconView.setMinimumSize(new java.awt.Dimension(50, 50));
        iconView.setPreferredSize(new java.awt.Dimension(50, 50));
        iconView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                iconViewMouseReleased(evt);
            }
        });

        scrollReminders.setBackground(new java.awt.Color(255, 255, 255));
        scrollReminders.setBorder(null);
        scrollReminders.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollReminders, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(iconView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(iconSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtSearch)
                                            .addComponent(spSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(iconView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(spSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(iconSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollReminders, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1formMouseReleased
        controller.gralReminder = new addReminderGral();
        standardization.show(controller.gralReminder);
        controller.rootFrame = controller.gralReminder;
    }//GEN-LAST:event_jPanel1formMouseReleased

    private void txtSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusGained
        spSearch.setBackground(Color.red);
    }//GEN-LAST:event_txtSearchFocusGained

    private void txtSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusLost
        spSearch.setBackground(Color.white);
    }//GEN-LAST:event_txtSearchFocusLost

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed

    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
      if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE && txtSearch.getText().trim().isEmpty() || evt.getKeyCode() == KeyEvent.VK_DELETE && txtSearch.getText().trim().isEmpty())
            insertarPaneles(classReminder.reminders.size(), false);
        else if(evt.getKeyCode() == KeyEvent.VK_DELETE && txtSearch.getText().length() == 0 || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE && txtSearch.getText().length() == 0)
            insertarPaneles(classReminder.reminders.size(), false);
        else
            search();
    }                                     

    void search(){
        classReminder.remindersSearch.clear();
        for(javaClass.reminder e : classReminder.reminders){
            if(e.getReminder().toLowerCase().contains(txtSearch.getText().toLowerCase())){
                classReminder.remindersSearch.add(e);
            }else{

            }
        }
        insertarPaneles(classReminder.remindersSearch.size(), true);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        char c = evt.getKeyChar();
        if(txtSearch.getText().length()<41){
            if(Character.isLetter(c) || Character.isDigit(c)){}
            else{
                if(c != '.')
                    evt.consume();
            }
        }else
            evt.consume();
    }//GEN-LAST:event_txtSearchKeyTyped

    private void iconViewMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconViewMouseReleased
       if(view == 0){
            view = 1;
            iconView.setIcon(new controller().changeImage("/imagenes/viewList.png", 50, 50));
            if(txtSearch.getText().trim().isEmpty())
                insertarPaneles(classReminder.reminders.size(), false);
            else
                search();
        }else{
            view = 0;
            iconView.setIcon(new controller().changeImage("/imagenes/viewGrid.png", 50, 50));
            if(txtSearch.getText().trim().isEmpty())
                insertarPaneles(classReminder.reminders.size(), false);
            else
                search();
        }
    }//GEN-LAST:event_iconViewMouseReleased
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconSearch;
    private javax.swing.JLabel iconView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JScrollPane scrollReminders;
    private javax.swing.JSeparator spSearch;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
