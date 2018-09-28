package javaClass;

import eventOwner.jpEvent;
import eventOwner.showEvent;
import eventOwner.eventAdmin;
import projectAdmin.projectAdmin;
import JPanel.CheckIn.jpMembership;
import JPanel.*;
import JPanel.CheckIn.*;
import JPanel.contact.addContact;
import JPanel.contact.itemContact;
import JPanel.contact.jpContact;
import admin.jpSecurityQuestionsAdmin;
import admin.jpSecurityUser;
import addEvent.addPrice;
import addEvent.price;
import jFrame.AddCardDetails;
import jFrame.AddEventInfo;
import jFrame.AddProjectDetails;
import jFrame.UpdateCardDetails;
import jFrame.addCard;
import jFrame.addProject;
import jFrame.addReminderGral;
import jFrame.addReminderGral1;
import jFrame.updateCard;
import java.awt.Image;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import sucurity.jpChangePassword;
import sucurity.jpSecurityQuestions;

public class controller {
    
    /**
     *Todas las variables estaticas que ocuparemos en el programa
     */
    
    public static String positionPanel;
    
    public static JPanel rootPane;
    public static jpAccess jpA;
    public static jpPassword jpP;
    public static jpCreateUser jpCU;
    public static jpRecoverPasswordMail jpRP;
    public static jpCreateData jpCD;
    public static jpRecoverPasswordMailCode jpRC;
    public static jpMembership jpM;
    public static jpNewPassword jpNP;
    public static jpProjectsMenu jpPM;
    public static jpAgendaMenu jpAGE;
    public static securityAccount secAcc;
    public static jpMembershipChange jpMC;
    public static jpEditUser jpU;
    public static admin.jpUsers jpUs;
    public static jpReminder jpAA;
    public static jpEvent jpE;
     public static jpEventP jpEEP;
    public static showEvent jpEv;
    public static addEvent jpAE;
    public static jpSecurity jpSe;
    public static jpReminder jpREM;
    public static jpEventP jpREMI;
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
    public static eventAdmin jpEvent;
    
    public static addCard addCr;
    public static updateCard updateCr;
    public static AddCardDetails addCrDetails;  
    public static UpdateCardDetails updateCrDetails;  
      
    public static addProject addPj;
    public static AddProjectDetails addPjDetails;
    public static projectAdmin project;
    
    public static admin.userGrid userGrid;
    public static admin.userList userList;
    public static remmindersGridds remmindersGridds;
    public static reminderList reminderList;
    
    public static jpSecurityQuestionsAdmin jpSeQuAdm;
    public static jpSecurityUser jpSeUs;
    
    public static addPrice addP;
    public static price pric;
    
    public static eventAdmin event;
    
    
    
    public static classMembership[] member = new classMembership[3];
    public static contactUsers[] contac = new contactUsers[10];
    public static List<gender> genders;
    public static String[] questions;
    public static String[] answers;
    public static boolean actionCompleted = false;
    
    public static List<users> usuarios;
    
    public static String idioma;
    
    //<editor-fold defaultstate="collapsed" desc="jFrame">
    public static AddEventInfo gralEvent;
    public static jFrame.AddEventInfoP addEventPer;
    public static jFrame.AddEventInfoP1 addEventPer1;

    public static addReminderGral gralReminder;
    public static addReminderGral1 gralReminder1;
    public static jFrame.AddEventDetails addEvents;
    public static jFrame.AyudaLogin AyudaLogin;
    public static jFrame.AddEventDetailsP addEventsP;
     public static jFrame.AddEventDetailsP1 addEventsP1;
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
