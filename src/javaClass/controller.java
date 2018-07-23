package javaClass;

import JPane.CheckIn.jpCreateData;
import JPane.CheckIn.jpCreateUser;
import JPane.CheckIn.*;
import JPane.jpAccess;
import JPane.jpPassword;
import JPane.jpRecoverPasswordMail;
import JPane.jpRecoverPasswordMailCode;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class controller {
    
    public static JPanel rootPane;
    public static jpAccess jpA;
    public static jpPassword jpP;
    public static jpCreateUser jpCU;
    public static jpRecoverPasswordMail jpRP;
    public static jpCreateData jpCD;
    public static jpRecoverPasswordMailCode jpRC;
    public static jpMembership jpM;
    public static classMembership[] member = new classMembership[3];
    public static String[] genders = new String[2];
    public static boolean actionCompleted = false;
    
    
    
    public static void asignar(JPanel panel){
        rootPane = panel;
    }
    
    public  Icon changeImage(String path, int width, int height){
        ImageIcon original = new ImageIcon(getClass().getResource(path));
        Icon icono = new ImageIcon(original.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
        return icono;
    }

    
}
