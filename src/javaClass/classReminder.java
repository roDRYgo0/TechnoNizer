/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaClass;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javaClass.classEvent.eventos;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class classReminder {

    private static Integer id;
    private static String condition;
    private static String reminder;
    private static String datetime; 
    private static Integer repeat;
    private static String nickname;
    
    public static List<event> reminders = new ArrayList<event>();
    public static List<event> remindersSearch = new ArrayList<event>();

    public static void setId(Integer id) {
        classReminder.id = id;
    }

    public static void setCondition(String condition) {
        classReminder.condition = condition;
    }

    public static void setReminder(String reminder) {
        classReminder.reminder = reminder;
    }

    public static void setDatetime(String datetime) {
        classReminder.datetime = datetime;
    }

    public static void setRepeat(Integer repeat) {
        classReminder.repeat = repeat;
    }

    public static void setNickname(String nickname) {
        classReminder.nickname = nickname;
    }

    public static Integer getId() {
        return id;
    }

    public static String getCondition() {
        return condition;
    }

    public static String getReminder() {
        return reminder;
    }

    public static String getDatetime() {
        return datetime;
    }

    public static Integer getRepeat() {
        return repeat;
    }

    public static String getNickname() {
        return nickname;
    }
   
      public static int spaceReminder(int num){
        int row = (num+1)/4;
        if((num+1)%4!=0)
            row++;
        if(row<=3)
            return 0;
        else
            return row - 3;
    }
   
    
    public static boolean insert(){
        boolean status = false;
        status = methodsSQL.execute("INSERT INTO reminders (condition, reminder, alarmDateTime, repeat, nickname) VALUES ( ?, ?, ?, ?, ?)",
                1, reminder, datetime, repeat, classUsuario.getNickname());
        return status;
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
public static DefaultTableModel cargarReminder() {

           
           DefaultTableModel model = methodsSQL.getTableModel("SELECT id, reminder , alarmDateTime , repeat  from reminders", "ID", "Recordatorio", "Fecha", "Repetir en _ horas");
       return model;
   }

public static boolean deleteReminder(){
    boolean status = false;
    status = methodsSQL.execute("DELETE FROM reminders where id=?", id);
    return status;
  
    }

public static boolean updatereminder(){
    boolean status = false;
        status = methodsSQL.execute("UPDATE reminders SET condition=? , reminder=? , alarmDateTime=?, repeat=?, nickname=? where id=?",
                1, reminder, datetime, repeat, "asd", id);
        return status;
    }
}