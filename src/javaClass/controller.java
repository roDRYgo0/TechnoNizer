package javaClass;

import JPanel.CheckIn.jpMembership;
import JPanel.*;
import JPanel.CheckIn.*;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
    public static addEvent jp;
    public static jpReminder jpREM;
    public static classMembership[] member = new classMembership[3];
    public static String[] genders = new String[2];
    public static boolean actionCompletedes = false;
    
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
