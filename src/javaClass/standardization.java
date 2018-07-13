package javaClass;

import jFrame.*;
import javax.swing.JFrame;
import technonizer.*;
import static technonizer.TechnoNizer.*;

public class standardization {
    
    public static void showMessage(String Image, String Message){
        if(!Image.equals(""))
            mess.changeImage(Image);
        
        mess.changeMessage(Message);
        mess.setVisible(true);
        mess.setLocationRelativeTo(TechnoNizer.log);
        log.setEnabled(false);
        log.setOpacity(0.75f);
    }
    
    public static void hideMessage(JFrame frame){
        log.setEnabled(true);
        log.setOpacity(1);
        frame.setVisible(false);
    }
    
    public static void invokeHome()
    {
        home = new home();
        home.setLocationRelativeTo(null);
        log.setVisible(false);
        home.setVisible(true);
    }
    
    public static boolean campoVacio(String text){
        text=text.replaceAll(" ", "");
        if(text.isEmpty() || text.length() == 0)
            return true;
        else
            return false;
    }
    
}
