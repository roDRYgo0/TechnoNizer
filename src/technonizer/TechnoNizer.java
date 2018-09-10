package technonizer;

import jFrame.*;
import javaClass.classContact;
import javaClass.classSecurityQuestions;
import javaClass.classUsuario;

public class TechnoNizer {

    public static logIn log;
    public static home home;
    public static admin admin;
    public static message mess;
    public static load sLoad;    

    public static AddReminder aRem;
    public static UpdateProject uProj;
    public static DeleteReminder dRem;
    
    public static void main(String[] args) {
        new Thread(()->{
            classUsuario.loadAllFinal();
            classContact.loadCopntactType();
            System.out.println("Carga de constantes");
            classSecurityQuestions.loadAllQuestions();
            System.out.println("Carga de preguntas");
            classUsuario.selectAllUser();
            System.out.println("Usuarios cargados");
        }).start();
        
        mess = new message();
        log = new logIn();
        sLoad = new load();
        log.setDefaultCloseOperation(3);
        
        log.setVisible(true);
    }
    
}
