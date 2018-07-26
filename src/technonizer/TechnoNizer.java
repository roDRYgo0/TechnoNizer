package technonizer;

import jFrame.*;

public class TechnoNizer {

    public static logIn log;
    public static home home;
    public static message mess;
    public static load sLoad;    
    public static AddProject aProj;
    
    public static void main(String[] args) {
        log = new logIn();
        mess = new message();
        sLoad = new load();
        aProj = new AddProject();
        log.setDefaultCloseOperation(3);
        
        log.setVisible(true);
    }
    
}
