package javaClass;

import jFrame.*;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import technonizer.*;
import static technonizer.TechnoNizer.*;

/**
 * 
 * @author rodri
 */

public class standardization {

    controller control = new controller();
    public static byte[] image;
    static Calendar cal= Calendar.getInstance();
    
    public static void setNowDate(JTextField day, JComboBox month, JTextField year){
        day.setText(standardization.currentDateTime().getDate()+"");
        month.setSelectedIndex(standardization.currentDateTime().getMonth()-1);
        year.setText(standardization.currentDateTime().getYear()+"");
    }
    
    
    public static Date currentDateTime(){
        cal= Calendar.getInstance();
        return new Date(cal.get(Calendar.YEAR) , cal.get(Calendar.MONTH)+1, cal.get(Calendar.DATE), cal.get(Calendar.HOUR), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));
    }
    
    public static String getDateTime(){
        cal= Calendar.getInstance();
        return cal.get(Calendar.YEAR) +"-"+ (cal.get(Calendar.MONTH)+1) +"-"+ cal.get(Calendar.DATE) +" "+ cal.get(Calendar.HOUR) +":"+ cal.get(Calendar.MINUTE) +":"+ cal.get(Calendar.SECOND)+"."+cal.get(Calendar.MILLISECOND);
    }
    
    public static void show(JFrame show){
        show.setVisible(true);
        show.setLocationRelativeTo(controller.rootFrame);
        controller.rootFrame.setEnabled(false);
        controller.rootFrame.setOpacity(0.85f);
    }
    
    public static void hide(JFrame show){
        controller.rootFrame.setVisible(true);
        controller.rootFrame.setEnabled(true);
        controller.rootFrame.setOpacity(1);
        show.setVisible(false);
    }
    
    public static int compareDate(Date date, Date compareTo){
        int res= 0;
        int dateDay = date.getDate();
        int day = compareTo.getDate();
        int dateMonth = date.getMonth();
        int month = compareTo.getMonth();
        int dateYear = date.getYear();
        int year = compareTo.getYear();
        if(dateYear < year)
            res = -1;
        else
        {
            if(dateMonth < month)
                res = -1;
            else{
                if(dateDay < day)
                    res=-1;
                else
                    res = 1;
            }
        }
        return res;
    }
    
    public static int returnAge(Date date, Date compareTo){
        int dateDay = date.getDate();
        int day = compareTo.getDate();
        int dateMonth = date.getMonth();
        int month = compareTo.getMonth();
        int dateYear = date.getYear();
        int year = compareTo.getYear();
        
        int age = year - dateYear;
        
        if(month <= dateMonth){
            if(day < dateDay)
                age--;
        }
        
        return age;
    }
    
    public static boolean validateDate(int year, int month, int dayOfMonth){
        try{
            if (year < 1900 || year > cal.get(Calendar.YEAR) - 15)
                throw new IllegalArgumentException("Año inválido.");
            else{
                LocalDate today = LocalDate.of(year, month, dayOfMonth);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                System.out.println(formatter.format(today));
                return true;
            }
            
        }catch(Exception ex){
            System.out.println("Malo");
            return false;
        }
    }
    
    public static String month(int n){
        String month;
        
        if(n<10)
            month = "0"+(n+1);
        else
            month = ""+(n+1);
        return month;
    }
    
    public static Icon checkImage(int status){
        Icon ico=null;
        switch(status){
            case 0:
                ico = (new controller().changeImage("/imagenes/cancel.png", 20, 20));
                break;
            case 1:
                ico = (new controller().changeImage("/imagenes/ok.png", 20, 20));
                break;
            case 2:
                ico = (new controller().changeImage("/imagenes/load.png", 20, 20));
                break;
        }
        
        return ico;
    }
    
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
    
    public static Icon getImgIcon(byte[] bi, int width, int heght){
        Icon imgi = null;
        try {
            BufferedImage image = null;
            InputStream in = new ByteArrayInputStream(bi);
            image = ImageIO.read(in);
            imgi = new ImageIcon(image.getScaledInstance(width, heght, 0));
            
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
    
    
     
      public static void showupdateProject(JFrame over){
        uProj = new UpdateProject();
        uProj.setVisible(true);
        uProj.setLocationRelativeTo(over);
        over.setEnabled(false);
        over.setOpacity(0.85f);
    }
    
   
    public static void showaddReminder(JFrame over, JTable tabla){
        aRem = new AddReminder(tabla);
         aRem.setVisible(true);
        aRem.setLocationRelativeTo(over);
        over.setEnabled(false);
        over.setOpacity(0.85f);
    }
    
    public static void hideaddReminder(JFrame over){
        over.setVisible(true);
        over.setEnabled(true);
        over.setOpacity(1);
        aRem.setVisible(false);
    }
    
    
   
     public static void showdeleteReminder(JFrame over, JTable tabla){
        dRem = new DeleteReminder(tabla);
        dRem.setVisible(true);
        dRem.setLocationRelativeTo(over);
        over.setEnabled(false);
        over.setOpacity(0.85f);
    }
    
    public static void hidedeleteReminder(JFrame over){
        over.setVisible(true);
        over.setEnabled(true);
        over.setOpacity(1);
        dRem.setVisible(false);
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
//    
    public static void showMessage(String Image, String Message){
        if(!Image.equals(""))
            mess.changeImage(Image);
        mess.setFram(null);
        mess.changeMessage(Message);
        mess.setVisible(true);
        mess.setLocationRelativeTo(TechnoNizer.log);
        controller.rootFrame.setEnabled(false);
        controller.rootFrame.setOpacity(0.85f);
    }
    
    public static void hideMessage(){
        controller.rootFrame.setEnabled(true);
        controller.rootFrame.setOpacity(1);
        mess.setVisible(false);
    }
    
    public static void showMessage(String Image, String Message, JFrame frame){
        if(!Image.equals(""))
            mess.changeImage(Image);
        mess.changeMessage(Message);
        mess.setVisible(true);
        mess.setFram(frame);
        mess.setLocationRelativeTo(frame);
        frame.setEnabled(false);
        frame.setOpacity(0.85f);
    }
    
    public static void hideMessage(JFrame frame){
        frame.setEnabled(true);
        frame.setOpacity(1);
        mess.setVisible(false);
    }
//    
    public static void invokeHome(boolean load)
    {
        home = new home(load);
        home.setLocationRelativeTo(null);
        log.setVisible(false);
        home.setVisible(true);
        new Thread(()->{
            usersBinnacle.binnacle(1);
        }).start();
    }
    
    public static void invokeAdmin()
    {
        admin = new admin();
        admin.setLocationRelativeTo(null);
        log.setVisible(false);
        admin.setVisible(true);
        new Thread(()->{
            classAdmin.nickname = classUsuario.getNickname();
            usersBinnacle.binnacle(22);
        }).start();
    }
    
    public static void invokeLogin()
    {
        log = new logIn();
        log.setLocationRelativeTo(null);
        home.setVisible(false);
        log.setVisible(true);
    }
    
    public static void invokeLogin(boolean admi)
    {
        log = new logIn();
        log.setLocationRelativeTo(null);
        admin.setVisible(false);
        log.setVisible(true);
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
    
    
    public static boolean validatePassword(String cadena){
         Pattern pattern = Pattern.compile("(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$");
         Matcher mather = pattern.matcher(cadena);
        return mather.find();
    }
    
    public static boolean validateEmail(String cadena){
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(cadena);
        return mather.find();
    }
    
    public static boolean validateNumber(String cadena){
        Pattern pattern = Pattern.compile("^([0-9])*$");
        Matcher mather = pattern.matcher(cadena);
        return mather.find();
    }
    
    public static boolean validateString(String cadena){
        Pattern pattern = Pattern.compile("|^[a-zA-Z]+(\\s*[a-zA-Z]*)*[a-zA-Z]+$|");
        Matcher mather = pattern.matcher(cadena);
        return mather.find();
    }
    
    public static String convertPassword(char[] pass){
        String password="";
        for(char a : pass)
            password+=Character.toString(a);
        return password;
    }
    
}
