package javaClass;

import JPanel.CheckIn.jpMembership;
import JPanel.*;
import JPanel.CheckIn.*;
import JPanel.contact.addContact;
import JPanel.contact.jpContact;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import sucurity.jpChangePassword;

public class controller {
    
    public static JPanel rootPane;
    public static jpAccess jpA;
    public static jpPassword jpP;
    public static jpCreateUser jpCU;
    public static jpRecoverPasswordMail jpRP;
    public static jpCreateData jpCD;
    public static jpRecoverPasswordMailCode jpRC;
    public static jpMembership jpM;
    public static jpWelcome jpW;
    public static jpNewPassword jpNP;
    public static jpHome jpH;
    public static jpProjects jpPJ;
    public static jpMembershipChange jpMC;
    public static jpEditUser jpU;
    public static jpEvent jpE;
    public static event jpEv;
    public static addEvent jpAE;
    public static jpSecurity jpSe;
    public static jpReminder jpREM;
    public static jpChangePassword jpCp;
    public static jpConfAuthenticator jpAu;
    public static jpCheckAuthenticator jpCa;
    public static sucurity.jpAuthenticator jpAuthe;
    public static jpAuthenticator jpCheck;
    public static addContact cont;
    public static jpContact jpCont;
    public static classMembership[] member = new classMembership[3];
    public static contactUsers[] contac = new contactUsers[10];
    public static String[] genders = new String[2];
    public static boolean actionCompleted = false;
    
    public static JFrame rootFrame;
    
    
    
    public static void asignar(JPanel panel){
        rootPane = panel;
    }
    
    public  Icon changeImage(String path, int width, int height){
        ImageIcon original = new ImageIcon(getClass().getResource(path));
        Icon icono = new ImageIcon(original.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
        return icono;
    }
    
    public  Icon changeSizeImage(Icon original, int width, int height){
        ImageIcon d = (ImageIcon)original;
        Icon icono = new ImageIcon(d.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
        return icono;
    }
    
    

    
}
