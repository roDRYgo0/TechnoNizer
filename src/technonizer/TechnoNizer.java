package technonizer;

import jFrame.*;
import javaClass.classContact;
import javaClass.classSecurityQuestions;
import javaClass.classUsuario;

public class TechnoNizer {

    public static logIn log;
    public static home home;
    public static message mess;
    public static load sLoad;    
    public static AddProject aProj;
    public static AddReminder aRem;
    public static DeleteProject dProj;
    public static UpdateProject uProj;
    public static DeleteReminder dRem;
    
    public static void main(String[] args) {
        new Thread(()->{
            classUsuario.loadAllFinal();
            classSecurityQuestions.loadAllQuestions();
            classContact.loadCopntactType();
            System.out.println("Carga de constantes");
        }).start();
        
        mess = new message();
        log = new logIn();
        sLoad = new load();
        log.setDefaultCloseOperation(3);
        
        log.setVisible(true);
    }
    
}
