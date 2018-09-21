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
    private static String hour;

    
    
    
    public static List<reminder> reminders = new ArrayList<reminder>();
    public static List<reminder> remindersSearch = new ArrayList<reminder>();
    
public static String getHour() {
        return hour;
    }

    public static void setHour(String hour) {
        classReminder.hour = hour;
    }
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
   
    public static void restart(){
        remindersSearch = new ArrayList<>();
        reminders = new ArrayList<>();
    }
      
      
    public static boolean insert(){
        boolean status = false;
        
        status = methodsSQL.execute("INSERT INTO reminders (condition, reminder, alarmDateTime, hour, nickname) VALUES ( ?, ?, ?, ?, ?)",
                1, reminder, datetime, hour, classUsuario.getNickname());
        return status;
    }
    public static boolean update(){
        boolean status = false;
        
        status = methodsSQL.execute("UPDATE reminders SET condition=?, reminder=?, alarmDateTime=?, nickname=? where id=?",
                1, reminder, datetime, classUsuario.getNickname(), id);
        return status;
    }
    
public static DefaultTableModel cargarReminder() {

           
           DefaultTableModel model = methodsSQL.getTableModel("SELECT id, reminder , alarmDateTime   from reminders", "ID", "Recordatorio", "Fecha");
       return model;
   }

public static boolean deleteReminder(){
    boolean status = false;
    status = methodsSQL.execute("DELETE FROM reminders where id=?", id);
    return status;
  
    }


 public static void restartUser(){
        id=null;
        condition=(String.valueOf(-1));
        reminder=null;
        datetime=null;
        System.out.println("Adios toda inf reminders");
    
       
    }


 public static boolean select(){
        boolean status = false;
        reminder recordatorio;
        ResultSet rs = methodsSQL.getExecute("SELECT re.id, re.condition, re.reminder, re.alarmDateTime  FROM reminders re WHERE re.nickname =? order by alarmDateTime", classUsuario.getNickname());
        restart();
        try {
            while(rs.next()){
                recordatorio = new reminder();
                recordatorio.setId(rs.getInt(1));
                recordatorio.setCondition(rs.getInt(2));
                recordatorio.setReminder(rs.getString(3));
                recordatorio.setDate(rs.getString(4));
  
                System.out.println("Los recordatorios son "+recordatorio.getMyNumberRemUse());
                reminders.add(recordatorio);
            status = true;
                if(methodsSQL.exists("SELECT count(*) FROM reminders WHERE nickname= ?", classUsuario.getNickname()))
                    recordatorio.setMyNumberRemUse(methodsSQL.getExecuteInt("SELECT count(*) FROM reminders WHERE nickname = ?", classUsuario.getNickname()));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(classReminder.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return status;
    }
 public static boolean selectn(){
        boolean status = false;
        reminder recordatorio;
        restart();

                recordatorio = new reminder();
                recordatorio.setNum(methodsSQL.getExecuteInt("SELECT count(*) FROM reminders WHERE nickname = ?", classUsuario.getNickname()));
       
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