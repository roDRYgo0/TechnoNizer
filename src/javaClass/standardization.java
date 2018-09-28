package javaClass;

import JPanel.jpAccess;
import jFrame.*;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
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
import static technonizer.TechnoNizer.*;

/**
 *
 * @author rodri
 */
public class standardization {

    

    controller control = new controller();
    public static byte[] image;
    private static StaticMaps ObjStaticMaps = new StaticMaps();
    static Calendar cal = Calendar.getInstance();
    private final String URLRoot = "http://maps.googleapis.com/maps/api/staticmap";

    /**
     *
     * @param day TextField donde se muestra el día
     * @param month ComboBox donde se mostrara el mes
     * @param year  TextFiel donde se mostrara el año
     * 
     * Este metodo retornará la fecha actual en los conponentes ya dichos
     */
    public static void setNowDate(JTextField day, JComboBox month, JTextField year) {
        day.setText(currentDateTime().getDate() + "");
        month.setSelectedIndex(currentDateTime().getMonth());
        year.setText(currentDateTime().getYear() + "");
    }

    /**
     *
     * @return fecha y hora actual del servidor en formato de Date
     */
    public static Date currentDateTime() {
        cal = Calendar.getInstance();
        return new Date(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE), cal.get(Calendar.HOUR), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));
    }

    /**
     *
     * @param place cadena de texto del un lugar
     * @return una imagen del lugar ingresado
     */
    public static Icon getImageMap(String place) {
        Icon iconImage = null;
        try {
            Image imagenMapa = ObjStaticMaps.getStaticMap(place,
                    Integer.valueOf(16), new Dimension(473, 173), 2, StaticMaps.Format.png,
                    StaticMaps.Maptype.roadmap);
            if (imagenMapa != null) {
                ImageIcon imgIcon = new ImageIcon(imagenMapa);
                iconImage = (Icon) imgIcon;
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(standardization.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(standardization.class.getName()).log(Level.SEVERE, null, ex);
        }
        return iconImage;
    }

    /**
     *
     * @return fecha y hora actual del servidor en formato de cadena
     */
    public static String currentDateTimeString() {
        cal = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String[] dateTime = df.format(cal.getTime()).split(" ");
        String[] time = dateTime[1].split(":");
        String rs = dateTime[0] + " " + ((Integer.parseInt(time[0]) > 10) ? (Integer.parseInt(time[0]) - 12) + ":" : time[0] + ":") + time[1] + ":" + time[2] + " " + ((Integer.parseInt(time[0]) > 10) ? "PM" : "AM");
        return rs;
    }

    /**
     *
     * @return fecha y hora actual para ser ingresada en sql server
     */
    public static String currentDateTimeSQL() {
        cal = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
        String[] dateTime = df.format(cal.getTime()).split(" ");
        String[] time = dateTime[1].split(":");
        String rs = dateTime[0] + " " + ((Integer.parseInt(time[0]) > 10) ? (Integer.parseInt(time[0]) - 12) + ":" : time[0] + ":") + time[1] + ":" + time[2] + " " + ((Integer.parseInt(time[0]) > 10) ? "PM" : "AM");
        return rs;
    }

    /**
     *
     * @return fecha actual del sistema en formato de Date
     */
    public static Date currentDate() {
        Date date1 = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            cal = Calendar.getInstance();
            date1 = sdf.parse(cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.DATE));
        } catch (ParseException ex) {
            Logger.getLogger(standardization.class.getName()).log(Level.SEVERE, null, ex);
        }
        return date1;
    }

    /**
     *
     * @return fecha y hora actual del servidor en un formato de String
     */
    public static String getDateTime() {
        cal = Calendar.getInstance();
        return cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH)) + "-" + cal.get(Calendar.DATE) + " " + cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + "." + cal.get(Calendar.MILLISECOND);
    }

    /**
     *
     * @param show frame que se desea mostrar
     * 
     * este metodo sirve para mostrar un panel y desvanecer con una 
     * transparencia donde se muestra
     */
    public static void show(JFrame show) {
        show.setVisible(true);
        show.setLocationRelativeTo(controller.rootFrame);
        controller.rootFrame.setEnabled(false);
        controller.rootFrame.setOpacity(0.85f);
    }

    /**
     *
     * @param show frame que se desea ocultar
     * para ocultar un frame y mostrar el que se habia 
     * desvanecido
     */
    public static void hide(JFrame show) {
        controller.rootFrame.setVisible(true);
        controller.rootFrame.setEnabled(true);
        controller.rootFrame.setOpacity(1);
        show.setVisible(false);
    }

    /**
     *
     * @param dateEnd fecha de fin
     * @param dateStart fecha de inicio
     * @param dateCurrent fecha actual
     * @return la validacion de las fechas
     */
    public static int compareDate(Date dateEnd, Date dateStart, Date dateCurrent) {
        int res = 0;
        if (dateCurrent.before(dateStart)) {
            if (dateEnd.before(dateStart)) {
                res = -1;
            }
        } else {
            res = -1;
        }
        return res;
    }

    /**
     *
     * @param dateMenor fecha mayor
     * @param dateMayor fecha menor
     * @return 1un entero dependiendo si las fechas estan correctas
     */
    public static int compareDateBefore(Date dateMenor, Date dateMayor) {
        int res;
        if (dateMenor.before(dateMayor) || dateMenor.equals(dateMayor)) {
            res = -1;
        } else {
            res = 1;
        }
        return res;
    }

    /**
     *
     * @param dateMenor fecha mayor
     * @param dateMayor fecha menor
     * @return 1un entero dependiendo si las fechas estan correctas
     */
    public static int compareDateAfer(Date dateMenor, Date dateMayor) {
        int res;
        if (dateMenor.after(dateMayor) || dateMenor.equals(dateMayor)) {
            res = -1;
        } else {
            res = 1;
        }
        return res;
    }

    /**
     *
     * @param date fecha de nacimiento
     * @param compareTo fecha actual
     * @return edad segun su fecha
     */
    public static int returnAge(Date date, Date compareTo) {
        int dateDay = date.getDate();
        int day = compareTo.getDate();
        int dateMonth = date.getMonth();
        int month = compareTo.getMonth();
        int dateYear = date.getYear();
        int year = compareTo.getYear();

        int age = year - dateYear;

        if (month <= dateMonth) {
            if (day < dateDay) {
                age--;
            }
        }

        return age;
    }

    /**
     *
     * @param year año
     * @param month mes
     * @param dayOfMonth dia del mes
     * @param birthdate fecha de nacimiento
     * @return si la fecha es correcta
     */
    public static boolean validateDate(int year, int month, int dayOfMonth, boolean birthdate) {
        try {
            if (birthdate) {
                if (year < 1900 || year > cal.get(Calendar.YEAR) - 15) {
                    throw new IllegalArgumentException("Año inválido.");
                } else {
                    LocalDate today = LocalDate.of(year, month, dayOfMonth);
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    return true;
                }
            } else {
                LocalDate today = LocalDate.of(year, month, dayOfMonth);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                return true;
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    /**
     *
     * @param year año
     * @param month mes
     * @param dayOfMonth dia
     * @return si la fecha es correcta
     */
    public static boolean validateDate(int year, int month, int dayOfMonth) {
        try {
            if (year < 1900 || year > cal.get(Calendar.YEAR) - 15) {
                throw new IllegalArgumentException("Año inválido.");
            } else {
                LocalDate today = LocalDate.of(year, month, dayOfMonth);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                return true;
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    /**
     *
     * @param n numero del mes
     * @return si el mes es menor que 10, entonces le agrega un 0
     * para que el string sea de tamaño 2
     */
    public static String month(int n) {
        String month;

        if (n < 10) {
            month = "0" + (n + 1);
        } else {
            month = "" + (n + 1);
        }
        return month;
    }

    /**
     *
     * @param status estado
     * @return la imagen segun el estado
     */
    public static Icon checkImage(int status) {
        Icon ico = null;
        switch (status) {
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

    /**
     *
     * @return una imagen de usuario por defecto
     */
    public byte[] defaultImage() {
        ImageIcon original = new ImageIcon(getClass().getResource("/imagenes/user.png"));
        image = getImgBytes(original.getImage());
        classUsuario.setImage(image);
        return image;
    }

    //<editor-fold defaultstate="collapsed" desc="convert">
    public byte[] getImgBytes(Image image) {
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

    /**
     *
     * @param icon imagen
     * @return un mapa de bytes a partir de una imagen
     */
    public static byte[] getByte(Icon icon) {
        byte[] bytes = null;
        System.out.println(icon);
        BufferedImage img = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = img.createGraphics();
        icon.paintIcon(null, g2d, 0, 0);
        g2d.dispose();

        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            ImageOutputStream ios = ImageIO.createImageOutputStream(baos);
            try {
                ImageIO.write(img, "png", ios);
                // Set a flag to indicate that the write was successful
            } finally {
                ios.close();
            }
            bytes = baos.toByteArray();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return bytes;
    }

    /**
     *
     * @param bi mapa de bytes
     * @return una imagen segun un mapa de bytes
     */
    public static Icon getImgIcon(byte[] bi) {
        Icon imgi = null;
        try {
            BufferedImage image = null;
            InputStream in = new ByteArrayInputStream(bi);
            image = ImageIO.read(in);
            imgi = new ImageIcon(image);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return imgi;
    }

    /**
     *
     * @param bi mapa de bytes
     * @param width ancho
     * @param heght largo
     * @return una megen con un tamaño
     */
    public static Icon getImgIcon(byte[] bi, int width, int heght) {
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

    /**
     *
     * @param width ancho
     * @param height largo
     * @return retorna una imagen por defecto segun un tamaño
     */
    public Icon defaultIcon(int width, int height) {
        ImageIcon original = new ImageIcon(getClass().getResource("/imagenes/user.png"));
        Icon icono = new ImageIcon(original.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
        return icono;
    }

    /**
     *
     * @param over sobre que se mostrara
     */
    public static void showupdateProject(JFrame over) {
        uProj = new UpdateProject();
        uProj.setVisible(true);
        uProj.setLocationRelativeTo(over);
        over.setEnabled(false);
        over.setOpacity(0.85f);
    }

    /**
     *
     * @param over sobre que se mostrara
     */
    
    public static void showdeleteReminder(JFrame over, JTable tabla) {
        dRem = new DeleteReminder(tabla);
        dRem.setVisible(true);
        dRem.setLocationRelativeTo(over);
        over.setEnabled(false);
        over.setOpacity(0.85f);
    }

    /**
     *
     * @param over que se ocultara
     */
    public static void hidedeleteReminder(JFrame over) {
        over.setVisible(true);
        over.setEnabled(true);
        over.setOpacity(1);
        dRem.setVisible(false);
    }

    /**
     *
     * @param over muestra una pantalla de carga sobre un frame
     */
    public static void showLoad(JFrame over) {
        sLoad.setVisible(true);
        sLoad.setLocationRelativeTo(over);
        over.setEnabled(false);
        over.setOpacity(0.85f);
    }

    /**
     *
     * @param over oculota la pantalla de carga
     */
    public static void hideLoad(JFrame over) {
        over.setVisible(true);
        over.setEnabled(true);
        over.setOpacity(1);
        sLoad.setVisible(false);
    }

    /**
     *
     * @param Image cadena del nombre de la imagen en el mensaje
     * @param Message mensaje a mostrar
     */
    public static void showMessage(String Image, String Message) {
        if (!Image.equals("")) {
            mess.changeImage(Image);
        }
        mess.setFram(null);
        mess.changeMessage(Message);
        mess.setVisible(true);
        mess.setLocationRelativeTo(controller.rootFrame);
        controller.rootFrame.setFocusable(false);
        controller.rootFrame.setOpacity(0.85f);
    }

    /**
     *
     * ocultar mensaje
     * 
     */
    public static void hideMessage() {
        controller.rootFrame.setEnabled(true);
        controller.rootFrame.setOpacity(1);
        mess.setVisible(false);
    }

   /**
     *
     * @param Image cadena del nombre de la imagen en el mensaje
     * @param Message mensaje a mostrar
     * @param frame sobre que se mostrara el mensaje
     */
    public static void showMessage(String Image, String Message, JFrame frame) {
        if (!Image.equals("")) {
            mess.changeImage(Image);
        }
        mess.changeMessage(Message);
        mess.setVisible(true);
        mess.setFram(frame);
        mess.setLocationRelativeTo(frame);
        frame.setEnabled(false);
        frame.setOpacity(0.85f);
    }

    /**
     *
     * @param frame que frame se mostrara
     */
    public static void hideMessage(JFrame frame) {
        frame.setEnabled(true);
        frame.setOpacity(1);
        mess.setVisible(false);
    }
//    

    /**
     *
     * @param load si se ejecutan los selects
     * @param hom que se ocultara
     * 
     * muestra el frame home
     */
    public static void invokeHome(boolean load, JFrame hom) {
        home = new home(load);
        home.setLocationRelativeTo(null);
        hom.setVisible(false);
        home.setVisible(true);
        new Thread(() -> {
            usersBinnacle.binnacle(1);
        }).start();
    }

    /**
     *se muestra el frame admin
     */
    public static void invokeAdmin() {
        admin = new admin();
        admin.setLocationRelativeTo(null);
        log.setVisible(false);
        admin.setVisible(true);
        new Thread(() -> {
            classAdmin.nickname = classUsuario.getNickname();
            usersBinnacle.binnacle(22);
        }).start();
    }

    /**
     *se muestra el frame login ocultando home
     */
    public static void invokeLogin() {
        log = new logIn();
        log.setLocationRelativeTo(null);
        home.setVisible(false);
        log.setVisible(true);
    }
    
    /**
     *
     * @param admi
     * se muestra el frame login ocultando admin
     */
    public static void invokeLogin(boolean admi) {
        log = new logIn();
        log.setLocationRelativeTo(null);
        admin.setVisible(false);
        log.setVisible(true);
    }

    public static void invokeLogin(boolean admi, JFrame login) {
        log = new logIn();
        log.setLocationRelativeTo(null);
        if (admi) {
            admin.setVisible(false);
        } else {
            login.setVisible(false);
        }

        log.setVisible(true);
    }

    /**
     *
     * @param text
     * @return si el campo esta vacio
     */
    public static boolean campoVacio(String text) {
        text = text.replaceAll(" ", "");
        if (text.isEmpty() || text.length() == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @param txt cadena a encriptar
     * @param hashType metodo de encriptacion
     * @return cadena encriptada
     */
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

    /**
     *
     * @return un codigo de caractes random
     */
    public static String generatedCode() {
        String[] codigos = UUID.randomUUID().toString().split("-");
        return codigos[0];
    }

    /**
     *
     * @param destinatario
     * @param asunto
     * @param cuerpo
     * 
     * enviar correo con gmail
     */
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
        } catch (MessagingException me) {
            me.printStackTrace();
        }
    }

    /**
     *
     * @param cadena
     * @return
     * 
     * validar contraseña minimo 8 caracteres, una mayuscula, un numero
     * y un caracter
     */
    public static boolean validatePassword(String cadena) {
        Pattern pattern = Pattern.compile("(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$");
        Matcher mather = pattern.matcher(cadena);
        return mather.find();
    }

    public static boolean validateEmail(String cadena) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(cadena);
        return mather.find();
    }

    public static boolean validateNumber(String cadena) {
        Pattern pattern = Pattern.compile("^([0-9])*$");
        Matcher mather = pattern.matcher(cadena);
        return mather.find();
    }

    public static boolean validateString(String cadena) {
        Pattern pattern = Pattern.compile("|^[a-zA-Z]+(\\s*[a-zA-Z]*)*[a-zA-Z]+$|");
        Matcher mather = pattern.matcher(cadena);
        return mather.find();
    }

    public static String convertPassword(char[] pass) {
        String password = "";
        for (char a : pass) {
            password += Character.toString(a);
        }
        return password;
    }

    public static int numberDays(Date fecha1, Date fecha2) {
        long startTime = fecha1.getTime();
        long endTime = fecha2.getTime();
        long diffTime = endTime - startTime;
        return (int) TimeUnit.DAYS.convert(diffTime, TimeUnit.MILLISECONDS);
    }

    public static Date getDate(String date) {
        Date date1 = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //Para declarar valores en nuevos objetos date, usa el mismo formato date que usaste al crear las fechas 
        try {
            date1 = sdf.parse(date);
        } catch (ParseException ex) {
            Logger.getLogger(standardization.class.getName()).log(Level.SEVERE, null, ex);
        }

        return date1;
    }

    public static void goToURL(String URL) {
        if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {

                try {
                    java.net.URI uri = new java.net.URI(URL);
                    desktop.browse(uri);
                } catch (URISyntaxException | IOException ex) {
                    Logger.getLogger(standardization.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }

    public static String getDateToString(String date, Date d, boolean clock) {
        String[] days = date.split("-");
        String dat = "";

        switch (d.getDay()) {
            case 0:
                dat += "Domingo, ";
                break;
            case 1:
                dat += "Lunes, ";
                break;
            case 2:
                dat += "Martes, ";
                break;
            case 3:
                dat += "Miércoles, ";
                break;
            case 4:
                dat += "Jueves, ";
                break;
            case 5:
                dat += "Viernes, ";
                break;
            case 6:
                dat += "Sábado, ";
                break;

        }
        dat += d.getDate() + " ";
        switch (days[1]) {
            case "01":
                dat += "de enero";
                break;
            case "02":
                dat += "de febrero";
                break;
            case "03":
                dat += "de marzo";
                break;
            case "04":
                dat += "de abril";
                break;
            case "05":
                dat += "de mayo";
                break;
            case "06":
                dat += "de junio";
                break;
            case "07":
                dat += "de julio";
                break;
            case "08":
                dat += "de agosto";
                break;
            case "09":
                dat += "de septiembre";
                break;
            case "1":
                dat += "de enero";
                break;
            case "2":
                dat += "de febrero";
                break;
            case "3":
                dat += "de marzo";
                break;
            case "4":
                dat += "de abril";
                break;
            case "5":
                dat += "de mayo";
                break;
            case "6":
                dat += "de junio";
                break;
            case "7":
                dat += "de julio";
                break;
            case "8":
                dat += "de agosto";
                break;
            case "9":
                dat += "de septiembre";
                break;
            case "10":
                dat += "de octubre";
                break;
            case "11":
                dat += "de noviembre";
                break;
            case "12":
                dat += "de diciembre";
                break;
        }
        dat += " de " + days[0];

        if (clock) {
//            String[] t = days[2].split(" ");
//            String[] time = t[1] 
//            dat+=time[1];
        }

        return dat;
    }

    public static String getTime(String time) {
        String[] Time = time.split(":");
        if (Integer.parseInt(Time[0]) > 12) {
            return (Integer.parseInt(Time[0]) - 12) + ":" + Time[1] + " PM";
        } else {
            return Time[0] + ":" + Time[1] + " AM";
        }
    }

}
