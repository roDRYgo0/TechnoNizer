package allEvent;

import java.awt.Color;
import java.awt.Font;
import javaClass.classEvent;
import javaClass.event;
import javaClass.standardization;

public class showEvent extends javax.swing.JPanel {

    public showEvent(int event) {
        initComponents();
        
        load(event);
    }

    void load(int e){
        
        loadEvent(classEvent.eventosShow.get(e));
        
        if(lblEventName.getText().length() >= 22){
            lblEventName.setToolTipText(lblEventName.getText());
            lblEventName.setText(lblEventName.getText().substring(0, 22)+"...");       
        }
    }
    
    void loadEvent(event ev){
        if(ev.getColor() != null){
            String[] color = ev.getColor().split(" ");
            pnColor.setBackground(new Color(Integer.parseInt(color[0]), Integer.parseInt(color[1]), Integer.parseInt(color[2])));
        }
        else
            pnColor.setBackground(new Color(35, 150, 243));
        lblEventName.setText(ev.getEventName());

        lblNickname.setText(ev.getNicknameCreator());
        if(!ev.getPrices().isEmpty()){
            if(ev.getPrices().get(0).getPrice() == 0){
                lblPrice.setText("Gratis");
                lblPrice.setForeground(new Color(65,152,38));
            }
            else
                lblPrice.setText("$"+ev.getPrices().get(0).getPrice());
        }     
        else
            lblPrice.setText("Vacio");
        if(ev.getQuantityTicket() == -1)
            lblNumGuest.setText("Ilimitadas");
        else
            lblNumGuest.setText(ev.getQuantityTicket()+"");
        
        if(standardization.currentDate().compareTo(standardization.getDate(ev.getStartDateTime())) == 0){
            lblDays.setText("Hoy");
            lblDays.setForeground(Color.red);
            Font f= new Font("Arial", Font.BOLD, 11);
            lblDays.setFont(f);
        }                            
        else{
            if(standardization.numberDays(standardization.currentDate(), standardization.getDate(ev.getStartDateTime())) < 0)
                lblDays.setText("Hace "+(-1*standardization.numberDays(standardization.currentDate(), standardization.getDate(ev.getStartDateTime())))+" días");
            else
                lblDays.setText(standardization.numberDays(standardization.currentDate(), standardization.getDate(ev.getStartDateTime()))+" días");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        lblEventName1 = new javax.swing.JLabel();
        lblNickname = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblNumGuest = new javax.swing.JLabel();
        lblDays = new javax.swing.JLabel();
        pnColor = new javax.swing.JPanel();
        lblEventName = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        setMaximumSize(new java.awt.Dimension(190, 120));
        setMinimumSize(new java.awt.Dimension(190, 120));
        setPreferredSize(new java.awt.Dimension(190, 120));

        lblEventName1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblEventName1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEventName1.setText("Entradas");
        lblEventName1.setToolTipText("");

        lblNickname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNickname.setText("nickName");

        lblPrice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(255, 153, 0));
        lblPrice.setText("$0.00");

        lblNumGuest.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNumGuest.setForeground(new java.awt.Color(51, 51, 255));
        lblNumGuest.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNumGuest.setText("Not found");
        lblNumGuest.setToolTipText("Entradas");

        lblDays.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblDays.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDays.setText("3 dias");
        lblDays.setMaximumSize(new java.awt.Dimension(29, 16));
        lblDays.setMinimumSize(new java.awt.Dimension(29, 16));
        lblDays.setPreferredSize(new java.awt.Dimension(29, 16));

        pnColor.setBackground(new java.awt.Color(33, 150, 243));

        lblEventName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblEventName.setForeground(new java.awt.Color(255, 255, 255));
        lblEventName.setText("Not Found");
        lblEventName.setToolTipText("");

        javax.swing.GroupLayout pnColorLayout = new javax.swing.GroupLayout(pnColor);
        pnColor.setLayout(pnColorLayout);
        pnColorLayout.setHorizontalGroup(
            pnColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnColorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEventName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnColorLayout.setVerticalGroup(
            pnColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEventName, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNickname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEventName1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(lblNumGuest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDays, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEventName1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblNumGuest))
                    .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(lblNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(3, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblDays;
    private javax.swing.JLabel lblEventName;
    private javax.swing.JLabel lblEventName1;
    private javax.swing.JLabel lblNickname;
    private javax.swing.JLabel lblNumGuest;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JPanel pnColor;
    // End of variables declaration//GEN-END:variables
}
