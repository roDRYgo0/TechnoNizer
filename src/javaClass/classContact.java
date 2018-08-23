package javaClass;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class classContact {
    
    private static String[] contactType;
    private static Integer id;
    private static String contact;
    private static Integer condition;
    private static Integer numContact;
    private static Integer idContactType;


    //<editor-fold defaultstate="collapsed" desc="Getter and Setter">
    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        classContact.id = id;
    }
    public static Integer getIdContactType() {
        return idContactType;
    }

    public static void setIdContactType(Integer idContactType) {
        classContact.idContactType = idContactType;
    }
    public static Integer getNumContact() {
        return numContact;
    }

    public static void setNumContact(Integer numContact) {
        classContact.numContact = numContact;
    }
    public static String[] getContactType() {
        return contactType;
    }

    public static void setContactType(String[] contactType) {
        classContact.contactType = contactType;
    }

    public static String getContact() {
        return contact;
    }

    public static void setContact(String contact) {
        classContact.contact = contact;
    }

    public static Integer getCondition() {
        return condition;
    }

    public static void setCondition(Integer condition) {
        classContact.condition = condition;
    }
    //</editor-fold>
    
    public static void reset(){
        id = -1;
        contact = "";
        condition = -1;
        numContact = -1;
        idContactType = -1;
        controller.contac = new contactUsers[3];
    }
    
    public static int getSpaceContact(){
        int numberContact = numContact + 1;
        int space = 0;
        if(numberContact>5){
            return numberContact - 5;
        }
        return space;
    }
    
    public static boolean insert(){
        boolean status;
        status = methodsSQL.execute("INSERT INTO contactUsers VALUES(?, ?, ?, 1)", contact, idContactType, classUsuario.getIdUsersInf());
        if(status)
            usersBinnacle.binnacle(20);
        return status;
    }
    
    public static boolean delete(int d){
        boolean status;
        status = methodsSQL.execute("DELETE FROM contactUsers WHERE id = ?", id);
        if(status)
            usersBinnacle.binnacle(21, d);
        return status;
    }
    
    public static boolean select(){
        boolean status;
        
        ResultSet rs=methodsSQL.getExecute("SELECT COUNT(*) FROM contactUsers WHERE idUsersInf = ?", classUsuario.getIdUsersInf());
        try {
            while(rs.next()){
                numContact = rs.getInt(1);
            }
            status = true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            status = false;
        }
        if(numContact>0){
            controller.contac = new contactUsers[numContact];
            rs = methodsSQL.getExecute("SELECT id FROM contactUsers WHERE idUsersInf = ?", classUsuario.getIdUsersInf());
            try {
                for(int i = 0; rs.next(); i++){
                  controller.contac[i] = loadContact(rs.getInt(1));  
                }
            } catch (SQLException ex) {
                Logger.getLogger(classContact.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return status;
    }
    
    static contactUsers loadContact(int m){
        contactUsers cont = new contactUsers();
        ResultSet rs = methodsSQL.getExecute("SELECT contact, idContactType FROM contactUsers WHERE idUsersInf = ? and id = ?", classUsuario.getIdUsersInf(), m);
        try {
            while(rs.next()){
                cont.setId(m);
                System.out.println(rs.getString(1));
                cont.setContact(rs.getString(1));
                cont.setIdContactType(rs.getInt(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(classContact.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cont;
    }   
    
    public static boolean existContact(){
        boolean status = false;
        status = methodsSQL.exists("SELECT contact FROM contactUsers WHERE idUsersInf = ?", classUsuario.getIdUsersInf());
        return status;
    }
    
    public static boolean loadCopntactType(){
        boolean status = false;
        String[] type = new String[2];
        ResultSet rs = methodsSQL.getExecute("SELECT type FROM contactType ct");
        try {
            for(int t = 0; rs.next(); t++)
                type[t]=rs.getString(1);
            status=true;
            contactType=type;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(classContact.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
    
}
