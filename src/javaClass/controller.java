package javaClass;

import JPanel.CheckIn.jpMembership;
import JPanel.*;
import JPanel.CheckIn.*;
import JPanel.contact.addContact;
import JPanel.contact.itemContact;
import JPanel.contact.jpContact;
import admin.jpSecurityQuestionsAdmin;
import admin.jpSecurityUser;
import event.addPrice;
import event.allPrice;
import event.price;
import jFrame.addEventGral;
import jFrame.addProject;
import jFrame.addReminderGral;
import java.awt.Image;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import sucurity.jpChangePassword;
import sucurity.jpSecurityQuestions;

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
    public static jpProjectsMenu jpPM;
    public static securityAccount secAcc;
    public static jpMembershipChange jpMC;
    public static jpEditUser jpU;
    public static admin.jpUsers jpUs;
    public static jpReminder jpAA;
    public static jpEvent jpE;
    public static showEvent jpEv;
    public static addEvent jpAE;
    public static jpSecurity jpSe;
    public static jpReminder jpREM;
    public static jpChangePassword jpCp;
    public static checkAccount checkAc;
    public static jpContactDisable jpContDis;
    public static jpDisable jpDis;
    public static jpConfAuthenticator jpAu;
    public static jpCheckAuthenticator jpCa;
    public static sucurity.jpAuthenticator jpAuthe;
    public static jpAuthenticator jpCheck;
    public static addContact cont;
    public static itemContact itemCont;
    public static jpContact jpCont;
    public static jpSecurityQuestions jpSeQue;
    
    public static allEvents allE;
  
    public static addProject addPj;
    
    public static admin.userGrid userGrid;
    public static admin.userList userList;
    public static reminderGrid reminderGrid;
    public static reminderList reminderList;
    
    public static jpSecurityQuestionsAdmin jpSeQuAdm;
    public static jpSecurityUser jpSeUs;
    
    public static addPrice addP;
    public static price pric;
    public static allPrice allP;
    
    public static classMembership[] member = new classMembership[3];
    public static contactUsers[] contac = new contactUsers[10];
    public static List<gender> genders;
    public static String[] questions;
    public static String[] answers;
    public static boolean actionCompleted = false;
    
    //<editor-fold defaultstate="collapsed" desc="jFrame">
    public static addEventGral gralEvent;
    public static addReminderGral gralReminder;
    public static jFrame.addEvent addEvents;
//</editor-fold>
    
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
