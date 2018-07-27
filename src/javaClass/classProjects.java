package javaClass;

import javax.swing.table.DefaultTableModel;

public class classProjects {

    
    private static String name;
    private static String description;
    private static String datetime; 
    private static Integer condition;
    private static String teams;
    private static String nickname;
 private static Integer id;
    
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
    
    public static boolean insert(){
        boolean status = false;
        status = methodsSQL.execute("INSERT INTO projects (name, description, datetime, condition, teams, nickname) VALUES ( ?, ?, ?, ?, ?, ?)",
                name, description, datetime, 1, 0, "asd");
        return status;
    }
public static DefaultTableModel cargarInte() {

           
           DefaultTableModel model = methodsSQL.getTableModel("SELECT id, name , description , datetime  from projects", "ID", "Nombre", "Descripción", "Fecha");
       return model;
   }

public static boolean deleteProj(){
    boolean status = false;
    status = methodsSQL.execute("DELETE FROM projects where id = ?", id);
    return status;
  
    }

public static boolean updateProj(){
    boolean status = false;
        status = methodsSQL.execute("UPDATE projects SET name=? , description=? , datetime=?, condition=?, teams=? where id=?)",
                name, description, datetime, 1, 0, id);
        return status;
    }
}

   
    
    
    
    
    
   
    
  
