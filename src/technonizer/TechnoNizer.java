package technonizer;

import jFrame.*;

public class TechnoNizer {

    public static logIn log;
    public static home home;
    public static message mess;
    public static load sLoad;    
    public static AddProject aProj;
    public static DeleteProject dProj;
    
    public static void main(String[] args) {
        mess = new message();
        log = new logIn();
        sLoad = new load();
        log.setDefaultCloseOperation(3);
        
        log.setVisible(true);
    }
    
}
