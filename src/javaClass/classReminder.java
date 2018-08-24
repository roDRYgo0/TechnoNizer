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
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javaClass.classAdmin.birth;
import static javaClass.classAdmin.usersSearch;
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
    
    
    public static List<reminder> reminders = new ArrayList<reminder>();
    public static List<reminder> remindersSearch = new ArrayList<reminder>();

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
 public static void restartUser(){
        condition=(String.valueOf(-1));
        reminder=null;
        datetime=null;
        System.out.println("Adios toda inf reminders");
    
       
    }


 public static boolean select(){
        boolean status = false;
        reminder recordatorio;
        ResultSet rs = methodsSQL.getExecute("SELECT re.condition, re.reminder, re.alarmDateTime  FROM reminders re WHERE re.nickname =?", classUsuario.getNickname());
        
        try {
            while(rs.next()){
                recordatorio = new reminder();

                recordatorio.setCondition(rs.getInt(1));
                recordatorio.setReminder(rs.getString(2));
                recordatorio.setDate(rs.getString(3));
   
                
                if(methodsSQL.exists("SELECT count(*) FROM reminders WHERE nickname= ?", classUsuario.getNickname()))
                    recordatorio.setMyNumberRemUse(methodsSQL.getExecuteInt("SELECT count(*) FROM reminders WHERE nickname = ?", classUsuario.getNickname()));
  
                System.out.println("Los recordatorios son "+recordatorio.getMyNumberRemUse());
                reminders.add(recordatorio);
            }
            status = true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(classReminder.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return status;
    }
  public static int getSpaceSearchGrid(){
        int row = (remindersSearch.size())/2;
        if((remindersSearch.size())%2!=0)
            row++;
        if(row <= 2)
            return 0;
        else
            return row - 2;
    }
    
    public static int getSpaceAllGrid(){
        int row = (reminders.size())/2;
        if((reminders.size())%2!=0)
            row++;
        if(row <= 2)
            return 0;
        else
            return row - 2;
    }
    
    public static int getSpaceSearchList(){
        int row = (remindersSearch.size())/5;
        if((remindersSearch.size())%5!=0)
            row++;
        if(row <= 5)
            return 0;
        else
            return row - 15;
    }
    
    public static int getSpaceAllList(){
        int row = (reminders.size())/5;
        if((reminders.size())%5!=0)
            row++;
        if(row <= 5)
            return 0;
        else
            return row - 15;
    }

 }