package javaClass;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/** @author rodri */

public class classPersonalE {

    private static Integer id;
    private static String title;
    private static String place;
    private static String Dstart;
    private static String Dend;
    private static String note;
    private static String color;
    private static String nickname;

   
       public static List<eventp> eventos = new ArrayList<eventp>();
    public static List<eventp> eventosShow = new ArrayList<eventp>();
    public static List<eventp> eventosSearch = new ArrayList<eventp>();
 
    public static String getNickname() {
        return nickname;
    }

    public static void setNickname(String nickname) {
        classPersonalE.nickname = nickname;
    }
    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        classPersonalE.id = id;
    }

    public static String getTitle() {
        return title;
    }

    public static void setTitle(String title) {
        classPersonalE.title = title;
    }

    public static String getPlace() {
        return place;
    }

    public static void setPlace(String place) {
        classPersonalE.place = place;
    }

    public static String getDstart() {
        return Dstart;
    }

    public static void setDstart(String Dstart) {
        classPersonalE.Dstart = Dstart;
    }

    public static String getDend() {
        return Dend;
    }

    public static void setDend(String Dend) {
        classPersonalE.Dend = Dend;
    }

    public static String getNote() {
        return note;
    }

    public static void setNote(String note) {
        classPersonalE.note = note;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        classPersonalE.color = color;
    }

    public static List<eventp> getEventos() {
        return eventos;
    }

    public static void setEventos(List<eventp> eventos) {
        classPersonalE.eventos = eventos;
    }

    public static List<eventp> getEventosShow() {
        return eventosShow;
    }

    public static void setEventosShow(List<eventp> eventosShow) {
        classPersonalE.eventosShow = eventosShow;
    }

    public static List<eventp> getEventosSearch() {
        return eventosSearch;
    }

    public static void setEventosSearch(List<eventp> eventosSearch) {
        classPersonalE.eventosSearch = eventosSearch;
    }
    
    
  


    
    public static void restart(){
        eventosSearch = new ArrayList<>();
        eventos = new ArrayList<>();
    }
    
    
    
    public static int spaceEvent(int num){
        int row = (num+1)/4;
        if((num+1)%4!=0)
            row++;
        if(row<=3)
            return 0;
        else
            return row - 3;
    }
    
    public static int spaceAllEvent(int num){
        int row = (num)/4;
        if((num)%4!=0)
            row++;
        if(row<=3)
            return 0;
        else
            return row - 3;
    }
    
    public static boolean select(){
        boolean status = false;
        eventp evento;
        ResultSet rs = methodsSQL.getExecute("SELECT id, title, place, startDateTime, endDateTime, note, color FROM personalEvents  where nickname=?", classUsuario.getNickname());
        
        try {
            while(rs.next()){
                evento = new eventp();
                evento.setId(rs.getInt(1));
                evento.setTitle(rs.getString(2));
                evento.setPlace(rs.getString(3));
                evento.setDstart(rs.getString(4));
                evento.setDend(rs.getString(5));
                evento.setNote(rs.getString(6));
                evento.setColor(rs.getString(7));
                evento.setNickname(classUsuario.getNickname());
                
                eventos.add(evento);//aqui...... tambien ya esta.... d
                //y los voy agregando a una lista...
            }
        } catch (SQLException ex) {
            Logger.getLogger(classPersonalE.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return status;
    }
    
   
   
    
  
    
    
    public static boolean insert(){
        boolean status = false;
        status = methodsSQL.execute("INSERT INTO personalEvents VALUES (?, ?, ?, ?, ?, ?, ?)",
                title, place, Dstart, Dend, note, color, classUsuario.getNickname());
        
        return status;
    }

    
    
   
    
    
    
}
