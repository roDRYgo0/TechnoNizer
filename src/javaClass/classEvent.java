package javaClass;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/** @author rodri */

public class classEvent {

    private static Integer id;
    private static String eventName;
    private static String nicknameCreator;
    private static byte[] profilePicture;
    private static byte[] coverPicture;
    private static Integer price;
    private static Integer visibility;
    private static String startDateTime;
    private static String endDateTime;
    private static Integer staff;
    private static Integer condition;
    public static List<classPrice> prices= new ArrayList<classPrice>();
    
    public static List<event> eventos = new ArrayList<event>();
    
    //<editor-fold defaultstate="collapsed" desc="Getter and Setter">
    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        classEvent.id = id;
    }

    public static String getEventName() {
        return eventName;
    }

    public static void setEventName(String eventName) {
        classEvent.eventName = eventName;
    }

    public static String getNicknameCreator() {
        return nicknameCreator;
    }

    public static void setNicknameCreator(String nicknameCreator) {
        classEvent.nicknameCreator = nicknameCreator;
    }

    public static byte[] getProfilePicture() {
        return profilePicture;
    }

    public static void setProfilePicture(byte[] profilePicture) {
        classEvent.profilePicture = profilePicture;
    }

    public static byte[] getCoverPicture() {
        return coverPicture;
    }

    public static void setCoverPicture(byte[] coverPicture) {
        classEvent.coverPicture = coverPicture;
    }

    public static Integer getPrice() {
        return price;
    }

    public static void setPrice(Integer price) {
        classEvent.price = price;
    }

    public static Integer getVisibility() {
        return visibility;
    }

    public static void setVisibility(Integer visibility) {
        classEvent.visibility = visibility;
    }

    public static String getStartDateTime() {
        return startDateTime;
    }

    public static void setStartDateTime(String startDateTime) {
        classEvent.startDateTime = startDateTime;
    }

    public static String getEndDateTime() {
        return endDateTime;
    }

    public static void setEndDateTime(String endDateTime) {
        classEvent.endDateTime = endDateTime;
    }

    public static Integer getStaff() {
        return staff;
    }

    public static void setStaff(Integer staff) {
        classEvent.staff = staff;
    }

    public static Integer getCondition() {
        return condition;
    }

    public static void setCondition(Integer condition) {
        classEvent.condition = condition;
    }
//</editor-fold>
    
    public static int space(){
        if(prices.size()<3)
            return 0;
        else{
            return prices.size()-3;
        }
    }
    
    public static boolean select(){
        boolean status = false;
        event evento;
        ResultSet rs = methodsSQL.getExecute("SELECT e.id, e.eventName, e.profilePicture, e.coverPicture, e.visibility, e.startDateTime, e.endDateTime, e.staff, e.condition, e.nicknameCreator FROM events e WHERE e.nicknameCreator = ? ",
                classUsuario.getNickname());
        
        try {
            while(rs.next()){
                evento = new event();
                evento.setId(rs.getInt(1));
                evento.setEventName(rs.getString(2));
                evento.setProfilePicture(rs.getBytes(3));
                evento.setCoverPicture(rs.getBytes(4));
                evento.setVisibility(rs.getInt(5));
                evento.setStartDateTime(rs.getString(6));
                evento.setEndDateTime(rs.getString(7));
                evento.setStaff(rs.getInt(8));
                evento.setCondition(rs.getInt(9));
                evento.setNicknameCreator(rs.getString(10));
                eventos.add(evento);
            }
        } catch (SQLException ex) {
            Logger.getLogger(classEvent.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return status;
    }
    
    public static boolean insert(){
        boolean status = false;
        System.out.println(profilePicture);
        System.out.println(coverPicture);
        if(profilePicture == null && profilePicture == null){
            status = methodsSQL.execute("INSERT INTO events VALUES (?, ?, "+profilePicture+", "+coverPicture+", ?, ?, ?, ?, ?)",
                    eventName, nicknameCreator, visibility, startDateTime, endDateTime, staff, condition);
            System.out.println("aqui");
        }else if(coverPicture == null){
            status = methodsSQL.execute("INSERT INTO events VALUES (?, ?, ?, "+coverPicture+", ?, ?, ?, ?, ?)",
                    eventName, nicknameCreator, profilePicture, visibility, startDateTime, endDateTime, staff, condition);
        }else if(coverPicture == null ){
            status = methodsSQL.execute("INSERT INTO events VALUES (?, ?, "+profilePicture+", ?, ?, ?, ?, ?, ?)",
                    eventName, nicknameCreator, coverPicture, visibility, startDateTime, endDateTime, staff, condition);
        }else{
            status = methodsSQL.execute("INSERT INTO events VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)",
                    eventName, nicknameCreator, profilePicture, coverPicture, visibility, startDateTime, endDateTime, staff, condition);
        }
        
        if(status && prices.size() > 0){
            id = methodsSQL.getExecuteInt("SELECT id FROM events WHERE eventName = ?", eventName);
            for (classPrice price : prices) {
                status = methodsSQL.execute("INSERT INTO tickets VALUES (?, ?, ?)", price.getName(), price.getPrice(), id);
            }
        }
        
        return status;
    }
    
}
