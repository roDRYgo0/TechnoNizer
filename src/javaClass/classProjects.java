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
    
    public static int spaceProject(int num){
        int row = (num+1)/4;
        if((num+1)%4!=0)
            row++;
        if(row<=3)
            return 0;
        else
            return row - 3;
    }
    
    public static boolean insert(){        
        return methodsSQL.execute("insert into projects values (?, ?, ?,1,0, ?)", name, description, standardization.getDateTime(), classUsuario.getNickname());
    }
    
    public static boolean select(){
        boolean status = false;
        Project project;
        projects = new ArrayList<>(); 
        projectsSearch = new ArrayList<>();
        ResultSet rs = methodsSQL.getExecute("SELECT p.id,  p.name, p.description, p.datetime, p.condition, p.teams, p.nickname FROM projects p");
        
        try {
            while(rs.next()){
                project = new Project();
                project.setId(rs.getInt(1));
                project.setName(rs.getString(2));
                project.setDescription(rs.getString(3));
                project.setDatetime(rs.getString(4));
                project.setCondition(rs.getInt(5));
                project.setTeams(rs.getString(6));
                project.setNickname(rs.getString(7));

                projects.add(project);
            }    
        } catch (SQLException ex) {
            Logger.getLogger(classProjects.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
   
    
    
    }






   
    
    
    
    
    
   
    
  
