package technonizer;

import jFrame.*;

public class TechnoNizer {

    public static logIn log;
    public static home home;
    public static message mess;
    
    public static void main(String[] args) {
        log = new logIn();
        mess = new message();
        log.setDefaultCloseOperation(3);
        
        log.setVisible(true);
    }
    
}
