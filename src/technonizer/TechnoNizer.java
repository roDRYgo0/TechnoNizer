package technonizer;

import jFrame.*;
import java.util.Arrays;
import javaClass.classContact;
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
            System.out.println("Carga de constantes");
        }).start();
        new Thread(()->{
            classContact.loadCopntactType();
            classContact.select();
            System.out.println(Arrays.toString(classContact.getContactType()));
            System.out.println(classContact.existContact());
        }).start();
        mess = new message();
        log = new logIn();
        sLoad = new load();
        log.setDefaultCloseOperation(3);
        
        log.setVisible(true);
    }
    
}
