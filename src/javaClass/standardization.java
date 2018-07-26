package javaClass;

import jFrame.*;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.UUID;
import javax.imageio.ImageIO;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import technonizer.*;
import static technonizer.TechnoNizer.*;

public class standardization {
    
    controller control = new controller();
    public static byte[] image;
    
    
    public byte[] defaultImage(){
        ImageIcon original = new ImageIcon(getClass().getResource("/imagenes/user.png"));
        image =  getImgBytes(original.getImage());
        classUsuario.setImage(image);
        return image;
    }
    
    //<editor-fold defaultstate="collapsed" desc="convert">
    public byte [] getImgBytes(Image image) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(getBufferedImage(image), "JPEG", baos);
        } catch (IOException ex) {
        }
        return baos.toByteArray();
    }
     
    private BufferedImage getBufferedImage(Image image) {
        int width = image.getWidth(null);
        int height = image.getHeight(null);
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        return bi;
    }
//</editor-fold>
    
    public static Icon getImgIcon(byte[] bi){
        Icon imgi = null;
        try {
            BufferedImage image = null;
            InputStream in = new ByteArrayInputStream(bi);
            image = ImageIO.read(in);
            imgi = new ImageIcon(image.getScaledInstance(150, 150, 0));
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return imgi;
    }
    
    public  Icon defaultIcon(int width, int height){
        ImageIcon original = new ImageIcon(getClass().getResource("/imagenes/user.png"));
        Icon icono = new ImageIcon(original.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
        return icono;
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
        over.setEnabled(false);
        over.setOpacity(0.85f);
    }
    
    public static void hideMessage(JFrame so, JFrame over){
        over.setEnabled(true);
        over.setOpacity(1);
        so.setVisible(false);
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
