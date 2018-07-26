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
public class classProjects {

    
    private static String name;
    private static String description;
    private static String datetime; //Está bien como string?
    private static Integer condition;
    private static String teams;
    private static String nickname;
   
    //<editor-fold defaultstate="collapsed" desc="Getter y Setter">
    

   

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        classProjects.name = name;
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        classProjects.description = description;
    }

    public static String getDatetime() {
        return datetime;
    }

    public static void setDatetime(String datetime) {
        classProjects.datetime = datetime;
    }

     public static Integer getCondition() {
        return condition;
    }

    public static void setCondition(Integer condition) {
        classProjects.condition = condition;
    }

    public static String getTeams() {
        return teams;
    }

    public static void setTeams(String teams) {
        classProjects.teams = teams;
    }

    public static String getNickname() {
        return nickname;
    }

    public static void setNickname(String nickname) {
        classProjects.nickname = nickname;
    }
    //</editor-fold>
    
    public static boolean insert(){
        boolean status = false;
        status = methodsSQL.execute("INSERT INTO projects (name, description, datetime, condition, teams, nickname) VALUES ( ?, ?, ?, ?, ?, ?)",
                name, description, datetime, 1, 0, "asd");
        return status;
    }
public static DefaultTableModel cargarInte() {

           
           DefaultTableModel model = methodsSQL.getTableModel("SELECT name , description , datetime  from projects", "Nombre", "Descripción", "Fecha");
       return model;
   }

   
    
}
    
    
    
    
    
   
    
  
