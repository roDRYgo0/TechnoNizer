package javaClass;

import jFrame.*;
import javax.swing.JFrame;
import technonizer.*;
import static technonizer.TechnoNizer.*;

public class standardization {
    
    controller control = new controller();
    
    public static void showLoad(JFrame over){
        sLoad.setVisible(true);
        sLoad.setLocationRelativeTo(over);
        over.setEnabled(false);
        over.setOpacity(0.85f);
    }
    
    public static void hideLoad(JFrame over){
        over.setVisible(true);
        over.setEnabled(true);
        over.setOpacity(1);
        sLoad.setVisible(false);
    }
    
    public static void showMessage(String Image, String Message, JFrame over){
        if(!Image.equals(""))
            mess.changeImage(Image);
        
        mess.changeMessage(Message);
        mess.setVisible(true);
        mess.setLocationRelativeTo(TechnoNizer.log);
        log.setEnabled(false);
        log.setOpacity(0.85f);
    }
    
    public static void hideMessage(JFrame over){
        log.setEnabled(true);
        log.setOpacity(1);
        over.setVisible(false);
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
    
    public static String getHash(String txt, String hashType) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest
                    .getInstance(hashType);
            byte[] array = md.digest(txt.getBytes());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100)
                        .substring(1, 3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
 
    public static String md5(String txt) {
        return getHash(txt, "MD5");
    }
 
    public static String sha1(String txt) {
        return getHash(txt, "SHA1");
    }
    
}
