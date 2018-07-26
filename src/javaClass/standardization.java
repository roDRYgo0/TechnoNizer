package javaClass;

import jFrame.*;
import java.util.Properties;
import java.util.UUID;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JFrame;
import technonizer.*;
import static technonizer.TechnoNizer.*;

public class standardization {

   
    
    controller control = new controller();
    
    public static void showaddProject(JFrame over){
        aProj.setVisible(true);
        aProj.setLocationRelativeTo(over);
        over.setEnabled(false);
        over.setOpacity(0.85f);
    }
    
    public static void hideaddProject(JFrame over){
        over.setVisible(true);
        over.setEnabled(true);
        over.setOpacity(1);
        aProj.setVisible(false);
    }
    
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
    
    public static void invokeHome(boolean load)
    {
        home = new home(load);
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
    
    public static String generatedCode(){
        String[] codigos = UUID.randomUUID().toString().split("-");
        return codigos[0];
    }
    
    public static void enviarConGMail(String destinatario, String asunto, String cuerpo) {
        String remitente = "technonizer@technonizer.com";
        String clave = "Masupial.48";
        String destinatari = destinatario;

        Properties props = System.getProperties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.user", remitente);
        props.put("mail.smtp.clave", clave); 
        props.put("mail.smtp.auth", "true");   
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.port", "587"); 

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(remitente));
            message.addRecipients(Message.RecipientType.TO, destinatari); 
            message.setSubject(asunto);
            message.setText(cuerpo);
            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.gmail.com", remitente, clave);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        }
        catch (MessagingException me) {
            me.printStackTrace();
        }
    }
}
