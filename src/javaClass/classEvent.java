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

public class classEvent {

    private static Integer id;
    private static String eventName;
    private static String nicknameCreator;
    private static byte[] profilePicture;
    private static byte[] coverPicture;
    private static Integer price;
    private static Integer visibility;
    private static String startDateTime;
    private static String endDateTime;
    private static Integer staff;
    private static String place;
    private static String color;
    private static Integer quantityTicket;
    private static Integer condition;
    public static List<classPrice> prices= new ArrayList<classPrice>();

    
    public static List<event> eventos = new ArrayList<event>();
    public static List<event> eventosShow = new ArrayList<event>();
    public static List<event> eventosSearch = new ArrayList<event>();



    
    //<editor-fold defaultstate="collapsed" desc="Getter and Setter">
    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        classEvent.color = color;
    }
    public static List<classPrice> getPrices() {
        return prices;
    }

    public static void setPrices(List<classPrice> prices) {
        classEvent.prices = prices;
    }
    public static Integer getQuantityTicket() {
        return quantityTicket;
    }

    public static void setQuantityTicket(Integer quantityTicket) {
        classEvent.quantityTicket = quantityTicket;
    }
    public static String getPlace() {
        return place;
    }

    public static void setPlace(String place) {
        classEvent.place = place;
    }
    
    
    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        classEvent.id = id;
    }

    public static String getEventName() {
        return eventName;
    }

    public static void setEventName(String eventName) {
        classEvent.eventName = eventName;
    }

    public static String getNicknameCreator() {
        return nicknameCreator;
    }

    public static void setNicknameCreator(String nicknameCreator) {
        classEvent.nicknameCreator = nicknameCreator;
    }

    public static byte[] getProfilePicture() {
        return profilePicture;
    }

    public static void setProfilePicture(byte[] profilePicture) {
        classEvent.profilePicture = profilePicture;
    }

    public static byte[] getCoverPicture() {
        return coverPicture;
    }

    public static void setCoverPicture(byte[] coverPicture) {
        classEvent.coverPicture = coverPicture;
    }

    public static Integer getPrice() {
        return price;
    }

    public static void setPrice(Integer price) {
        classEvent.price = price;
    }

    public static Integer getVisibility() {
        return visibility;
    }

    public static void setVisibility(Integer visibility) {
        classEvent.visibility = visibility;
    }

    public static String getStartDateTime() {
        return startDateTime;
    }

    public static void setStartDateTime(String startDateTime) {
        classEvent.startDateTime = startDateTime;
    }

    public static String getEndDateTime() {
        return endDateTime;
    }

    public static void setEndDateTime(String endDateTime) {
        classEvent.endDateTime = endDateTime;
    }

    public static Integer getStaff() {
        return staff;
    }

    public static void setStaff(Integer staff) {
        classEvent.staff = staff;
    }

    public static Integer getCondition() {
        return condition;
    }

    public static void setCondition(Integer condition) {
        classEvent.condition = condition;
    }
//</editor-fold>
    
    public static void restart(){
        prices= new ArrayList<>();
        eventosSearch = new ArrayList<>();
        eventos = new ArrayList<>();
    }
    
    public static int spacePrice(){
        if(prices.size()<3)
            return 0;
        else{
            return prices.size()-3;
        }
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
        event evento;
        ResultSet rs = methodsSQL.getExecute("SELECT e.id, e.eventName, e.profilePicture, e.coverPicture, e.visibility, e.startDateTime, e.endDateTime, e.staff, e.condition, e.nicknameCreator, e.place, e.quantityTicket, e.color FROM events e");
        
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
                evento.setPlace(rs.getString(11));
                evento.setQuantityTicket(rs.getInt(12));
                evento.setColor(rs.getString(13));
                System.out.println(evento.getStaff()+" que graro");
                if(evento.getStaff() == 1){
                    List<staff> staffs = new ArrayList<>();
                    staff s;
                    ResultSet rsS = methodsSQL.getExecute("select s.nickname, s.position from staff s where s.idEvent = ?", evento.getId());
                    while(rsS.next()){
                        s = new staff();
                        s.setNickname(rsS.getString(1));
                        s.setPosition(rsS.getInt(2));
                        staffs.add(s);
                    }
                    evento.setStaffs(staffs);
                }
                
                List<classPrice> price = new ArrayList<>();
                classPrice p;
                ResultSet rsP = methodsSQL.getExecute("SELECT nameTicket, quantityTicket, priceTicket FROM tickets WHERE idEvent = ?", evento.getId());
                while(rsP.next()){
                    p = new classPrice();
                    p.setName(rsP.getString(1));
                    p.setCount(rsP.getInt(2));
                    p.setPrice(rsP.getDouble(3));
                    price.add(p);
                }

                Collections.sort(price, new Comparator<classPrice>(){
                    @Override
                    public int compare(classPrice o1, classPrice o2) {
                        return (o2.getPrice() > o1.getPrice())?-1:(o2.getPrice() < o1.getPrice())?1:0;
                    }
                });
                evento.setPrices(price);
                eventos.add(evento);//aqui...... tambien ya esta.... d
                //y los voy agregando a una lista...
            }
        } catch (SQLException ex) {
            Logger.getLogger(classEvent.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return status;
    }
    
    public static boolean insetStaff(int idEvent, int pos, String nickname){
        boolean status = false;
        for(event e : eventos){
            if(Objects.equals(e.getId(), eventosShow.get(idEvent).getId())){
                if(methodsSQL.execute("INSERT INTO staff VALUES (?, ?, ?) ", pos, nickname, eventosShow.get(idEvent).getId())){
                    e.setStaff(1);
                    staff s = new staff();
                    s.setIdEvent(eventosShow.get(idEvent).getId());
                    s.setNickname(nickname);
                    s.setPosition(pos);
                    status = true;
                }
                if(status)
                    status = methodsSQL.execute("update events set staff = ? where id = ? ", 1, eventosShow.get(idEvent).getId());
            }
        }
        return status;
    }
    
    public static boolean insert(){
        boolean status = false;
        status = methodsSQL.execute("INSERT INTO events VALUES (?, ?, "+null+", "+null+", ?, ?, ?, ?, ?, ?, ?, ?)",
                eventName, nicknameCreator, visibility, startDateTime, endDateTime, staff, condition, quantityTicket, place, color);

        
        if(status){
            if(status && prices.isEmpty()){
                prices.add(0, new classPrice("Gratis", 0.0, quantityTicket));
            }
            id = methodsSQL.getExecuteInt("SELECT id FROM events WHERE eventName = ? and nicknameCreator = ?", eventName, classUsuario.getNickname());
            for (classPrice pric : prices) {
                status = methodsSQL.execute("INSERT INTO tickets VALUES (?, ?, ?, ?)", pric.getName(), pric.getCount(), pric.getPrice(), id);
            }
        } 
        
        return status;
    }
    
}
