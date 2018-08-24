package javaClass;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class classProjects {

    private static Integer id;
    private static String name;
    private static String description;
    private static String datetime; 
    private static Integer condition;
    private static String teams;
    private static String nickname;
 
    
     public static List<Project> projects = new ArrayList<Project>();
    public static List<Project> projectsSearch = new ArrayList<Project>();
    
    
    //<editor-fold defaultstate="collapsed" desc="Getter y Setter">
    
public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        classProjects.id = id;
    }
   
   
   

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
    
    public static boolean select(){
        boolean status = false;
        Project project;
        ResultSet rs = methodsSQL.getExecute("SELECT p.name, p.description, p.datetime, p.condition, p.teams, p.nickname FROM projects p");
        
        try {
            while(rs.next()){
                project = new Project();
                project.setName(rs.getString(1));
                project.setDescription(rs.getString(2));
                project.setDatetime(rs.getString(3));
                project.setCondition(rs.getInt(4));
                project.setTeams(rs.getString(5));
                project.setNickname(rs.getString(6));
                
                
                
                projects.add(project);
            }    
        } catch (SQLException ex) {
            Logger.getLogger(classProjects.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
   
    
    
    }






   
    
    
    
    
    
   
    
  
