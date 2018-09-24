package javaClass;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;


public class classProjects {

    private static Integer id;
    private static String name;
    private static String description;
    private static String datetime; 
    private static Integer condition;
    private static String teams;
    private static String color;
    private static byte[] coverImage;
    private static String nickname;

    public static List<Project> projects = new ArrayList<Project>();
    public static List<Project> projectsShow = new ArrayList<Project>();
    public static List<Project> projectsSearch = new ArrayList<Project>();
    
    //<editor-fold defaultstate="collapsed" desc="Getter y Setter">
    
public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        classProjects.id = id;
    }

    public static byte[] getCoverImage() {
        return coverImage;
    }

    public static void setCoverImage(byte[] coverImage) {
        classProjects.coverImage = coverImage;
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

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        classProjects.color = color;
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
    
    public static void onlyPersonal(boolean personal) {
        if (personal) {
            projectsShow = projects.stream().filter(x -> x.getTeams() == 0).collect(Collectors.toList());
        } else {
            projectsShow = projects.stream().filter(x -> x.getTeams() == 1).collect(Collectors.toList());
        }
    }
    
    public static boolean insert(){        
        return methodsSQL.execute("insert into projects values (?, ?, ?,1,0, ?, ?, null)", name, description, standardization.getDateTime(), classUsuario.getNickname(), color);
    }
    
    public static boolean select(){
        Project project;
        projects = new ArrayList<>(); 
        projectsSearch = new ArrayList<>();
        
        String query = "SELECT * FROM projects";
        if (classUsuario.getCondition() != 3)
            query = "SELECT p.* FROM projects p "
                + "WHERE p.nickname='" + classUsuario.getNickname() + "' OR " +
                "(SELECT 1 FROM teams WHERE teams.idProjects=p.id AND teams.nicknameGuest='" + classUsuario.getNickname() + "') = 1";
            
        ResultSet rs = methodsSQL.getExecute(query);
        
        try {
            while(rs.next()){
                project = new Project();
                project.setId(rs.getInt(1));
                project.setName(rs.getString(2));
                project.setDescription(rs.getString(3));
                project.setDatetime(rs.getString(4));
                project.setCondition(rs.getInt(5));
                project.setTeams(rs.getInt(6));
                project.setNickname(rs.getString(7));
                project.setColor(rs.getString(8));
                project.setCoverImage(rs.getBytes(9));
                if(project.getTeams() == 1) {
                    List<team> members = new ArrayList<>();
                    team s;
                    ResultSet rsS = methodsSQL.getExecute("select s.nicknameGuest, s.permission from teams s where s.idProjects = ?", project.getId());
                    while(rsS.next()){
                        s = new team();
                        s.setNicknameGuest(rsS.getString(1));
                        s.setPermission(rsS.getInt(2));
                        members.add(s);
                    }
                    project.setMembers(members);
                }
                projects.add(project);
            }    
        } catch (SQLException ex) {
            Logger.getLogger(classProjects.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static boolean actualizar(int idProject){
        boolean status = false;
        status = methodsSQL.execute("update projects set name=?, description=? where id = ?", name, description, idProject);
        return status;
    }
    
    public static boolean insertTeam(int idProject, String nickname){
        boolean status = false;
        int project_id = projects.get(idProject).getId();
        for(Project e : projects){
            if(Objects.equals(e.getId(), project_id)){
                if(methodsSQL.execute("INSERT INTO teams VALUES (?, ?, ?) ", nickname, 1, project_id)){
                    e.setTeams(1);
                    team s = new team();
                    s.setIdProjects(projects.get(idProject).getId());
                    s.setNicknameGuest(nickname);
                    s.setPermission(1);
                    status = true;
                }
                if(status)
                    status = methodsSQL.execute("update projects set teams = ? where id = ? ", 1, project_id);
            }
        }
        return status;
    }
    
    public static boolean delete(int idProject){
        boolean status = false;
        status = methodsSQL.execute("delete from teams where idProjects = ?", idProject);
        status = methodsSQL.execute("delete from projects where id = ?", idProject);
        return status;
    }
    
    public static boolean deleteTeam(String nicknameGuest, int idProject){
        boolean status = false;
        status = methodsSQL.execute("delete from teams where nicknameGuest = ? and idProjects = ?", nicknameGuest, idProject);
        return status;
    }
    
    public static boolean updateColor(int idProject, String color){
        boolean status = false;
        status = methodsSQL.execute("update projects set color = ? where id = ?", color, idProject);
        return status;
    }
    
    
    public static boolean updateCover(int idProject, byte[] image){
        boolean status = false;
        status = methodsSQL.execute("update projects set coverImage = ? where id = ?", image, idProject);
        return status;
    }
    
}






   
    
    
    
    
    
   
    
  
