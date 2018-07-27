/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaClass;

import java.sql.Statement;
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
   
    
   
    
    public static boolean insert(){
        boolean status = false;
        status = methodsSQL.execute("INSERT INTO reminders (condition, reminder, alarmDateTime, repeat, nickname) VALUES ( ?, ?, ?, ?, ?)",
                1, reminder, datetime, repeat, "asd");
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
        status = methodsSQL.execute("UPDATE reminders SET condition=? , reminder=? , alarmDateTime=?, repeat=?, nickname=? where id=?)",
                1, reminder, datetime, repeat, "asd", id);
        return status;
    }
}