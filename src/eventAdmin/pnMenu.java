package eventAdmin;

public class pnMenu extends javax.swing.JPanel {

    int idEvent;
    
    public pnMenu(int idEvent) {
        initComponents();
        this.idEvent = idEvent;
        load();
    }

    void load(){
        this.add(new activities(idEvent));
        this.add(new tasksList(idEvent));
        this.add(new problems(idEvent));
        this.add(new announcements(idEvent));
        this.add(new settings(idEvent));
        this.revalidate();
        this.repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(945, 70));
        setMinimumSize(new java.awt.Dimension(945, 70));
        setPreferredSize(new java.awt.Dimension(945, 70));
        javaClass.ModifiedFlowLayout modifiedFlowLayout1 = new javaClass.ModifiedFlowLayout();
        modifiedFlowLayout1.setHgap(25);
        modifiedFlowLayout1.setVgap(2);
        setLayout(modifiedFlowLayout1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
