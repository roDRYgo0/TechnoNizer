package javaClass;

import java.net.Socket;
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

    public static int position;
    
    private static Integer id;
    private static String eventName;
    private static String nicknameCreator;
    private static byte[] profilePicture;
    private static byte[] coverPicture;
    private static byte[] mapImage;
    private static Integer price;
    private static Integer visibility;
    private static Integer invitation;
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
    
    
    public static infEvent evento;

    //<editor-fold defaultstate="collapsed" desc="Getter and Setter">
    public static byte[] getMapImage() {
        return mapImage;
    }

    public static void setMapImage(byte[] mapImage) {
        classEvent.mapImage = mapImage;
    }
    public static Integer getInvitation() {
        return invitation;
    }

    public static void setInvitation(Integer invitation) {
        classEvent.invitation = invitation;
    }
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
        eventos.clear();
        ResultSet rs = methodsSQL.getExecute("SELECT e.id, e.eventName, e.visibility, e.startDateTime, e.endDateTime, e.staff, e.condition, e.nicknameCreator, e.place, e.quantityTicket, e.color, e.invitation FROM events e");
        
        try {
            while(rs.next()){
                evento = new event();
                evento.setId(rs.getInt(1));
                evento.setEventName(rs.getString(2));
                evento.setVisibility(rs.getInt(3));
                evento.setStartDateTime(rs.getString(4));
                evento.setEndDateTime(rs.getString(5));
                evento.setStaff(rs.getInt(6));
                evento.setCondition(rs.getInt(7));
                evento.setNicknameCreator(rs.getString(8));
                evento.setPlace(rs.getString(9));
                evento.setQuantityTicket(rs.getInt(10));
                evento.setColor(rs.getString(11));
                evento.setInvitation(rs.getInt(12));
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
                
                List<guest> guest = new ArrayList<>();
                guest g;
                ResultSet rsG = methodsSQL.getExecute("select id, idTickets, nickname, datetime from guest where idEvent = ?", evento.getId());
                while(rsG.next()){
                    g = new guest();
                    g.setId(rsG.getInt(1));
                    g.setIdEvent(evento.getId());
                    g.setIdTickets(rsG.getInt(2));
                    g.setNickname(rsG.getString(3));
                    g.setDateTime(rsG.getString(4));
                    guest.add(g);
                }
                
                evento.setGuests(guest);
                List<classPrice> pric = new ArrayList<>();
                classPrice p;
                ResultSet rsP = methodsSQL.getExecute("SELECT nameTicket, quantityTicket, priceTicket, id FROM tickets WHERE idEvent = ?", evento.getId());
                while(rsP.next()){
                    p = new classPrice();
                    p.setName(rsP.getString(1));
                    p.setCount(rsP.getInt(2));
                    p.setPrice(rsP.getDouble(3));
                    p.setId(rsP.getInt(4));
                    pric.add(p);
                }

                Collections.sort(pric, new Comparator<classPrice>(){
                    @Override
                    public int compare(classPrice o1, classPrice o2) {
                        return (o2.getPrice() > o1.getPrice())?-1:(o2.getPrice() < o1.getPrice())?1:0;
                    }
                });
                evento.setPrices(pric);
                eventos.add(evento);
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
    
    public static boolean deleteStaff(String nickname, int idEvent){
        boolean status = false;
        status = methodsSQL.execute("delete from staff where nickname = ? and idEvent = ?", nickname, idEvent);
        return status;
    }
    
    public static boolean deletePrice(String nickname, int idEvent){
        boolean status = false;
        status = methodsSQL.execute("delete from staff where nickname = ? and idEvent = ?", nickname, idEvent);
        return status;
    }
    
    public static List<staff> selectStaff(int idEvent){
        List<staff> status = new ArrayList<>();
        staff s;
        ResultSet rs = methodsSQL.getExecute("select nickname, position from staff where idEvent = ?", idEvent);
        try {
            while(rs.next()){
                s = new staff();
                s.setIdEvent(idEvent);
                s.setNickname(rs.getString(1));
                s.setPosition(rs.getInt(2));
                status.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(classEvent.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    
    public static boolean selectActivity(int idEvent){
        boolean status = false;
        List<activity> activiti = new ArrayList<>();
        activity ac;
        ResultSet rs = methodsSQL.getExecute("select a.dateTime, a.activity, a.place, a.condition, a.description, a.nickname, a.id from activities a where a.idEvent = ?", idEvent);
        
        try {
            while(rs.next()){
                ac = new activity();
                ac.setDateTime(rs.getString(1));
                ac.setActivity(rs.getString(2));
                ac.setPlace(rs.getString(3));
                ac.setCondition(rs.getInt(4));
                ac.setDescription(rs.getString(5));
                ac.setNickname(rs.getString(6));
                ac.setId(rs.getInt(7));
                String[] dateTime = ac.getDateTime().split(" ");
                ac.setDate(dateTime[0]);
                ac.setTime(dateTime[1]);
                activiti.add(ac);
            }
            evento.setActivities(activiti);
            status = true;
        } catch (SQLException ex) {
            Logger.getLogger(classEvent.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return status;
    }
    
    public static boolean updateAnnouncement(int condition, int id){
        return methodsSQL.execute("update announcements set condition = ? where id = ?", condition, id);
    }
    
    public static boolean deleteAnnouncement(int idAnnouncement){
        return methodsSQL.execute("delete from announcements where id = ?", idAnnouncement);
    }
    
    public static boolean insertAnnouncement(String announced, int priority, int publicGoal, int condition, String nickname, int idEvent){
        boolean status = false;
        status = methodsSQL.execute("insert into announcements values(?, ?, ?, ?, ?, ?)", announced, priority, publicGoal, condition, nickname, idEvent);
        return status;
    }
    
    public static boolean selectAnnouncement(int idEvent){
        boolean status = false;
        List<announcement> announc = new ArrayList<>();
        announcement announ;
        ResultSet rs = methodsSQL.getExecute("select id, announced, priority, publicGoal, condition, nickname from announcements where idEvent = ?", idEvent);
        
        try {
            while(rs.next()){
                announ = new announcement();
                announ.setId(rs.getInt(1));
                announ.setAnnouncement(rs.getString(2));
                announ.setPriority(rs.getInt(3));
                announ.setPublicGoal(rs.getInt(4));
                announ.setCondition(rs.getInt(5));
                announ.setNickname(rs.getString(6));
                announc.add(announ);
            }
            evento.setAnnouncements(announc);
            status = true;
        } catch (SQLException ex) {
            Logger.getLogger(classEvent.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return status;
    }
    
    public static boolean updateColor(int idEvent, String color){
        boolean status = false;
        status = methodsSQL.execute("update events set color = ? where id = ?", color, idEvent);
        return status;
    }
    
    public static boolean updateVisibility(int idEvent, int visibility){
        boolean status = false;
        status = methodsSQL.execute("update events set visibility = ? where id = ?", visibility, idEvent);
        return status;
    }
    
    public static boolean updatePlace(int idEvent, String place){
        boolean status = false;
        status = methodsSQL.execute("update events set place = ? where id = ?", place, idEvent);
        return status;
    }
    
    public static boolean updateProfile(int idEvent, byte[] image){
        boolean status = false;
        status = methodsSQL.execute("update events set profilePicture = ? where id = ?", image, idEvent);
        return status;
    }
    
    public static boolean updateCover(int idEvent, byte[] image){
        boolean status = false;
        status = methodsSQL.execute("update events set coverPicture = ? where id = ?", image, idEvent);
        return status;
    }
    
    public static boolean updateInvitation(int idEvent, int invitation){
        boolean status = false;
        status = methodsSQL.execute("update events set invitation = ? where id = ?", invitation, idEvent);
        return status;
    }
    
    
    public static boolean insertActivitie(String dateTime, String activity, String place, int condition, String description, int idEvent, String nickname){
        boolean status = false;
        status = methodsSQL.execute("insert into activities values(?, ?, ?, ?, ?, ?, ?)", dateTime, activity, place, condition, description, idEvent, nickname);
        return status;
    }
    
    public static boolean insertProblem(String problem, String place, String dateTime, int danger, int condition, String nickname, int idEvent){
        boolean status = false;
        status = methodsSQL.execute("insert into problems values(?, ?, ?, ?, ?, ?, "+null+", ?)", problem, place, dateTime, danger, condition, nickname, idEvent);
        return status;
    }
    
    public static boolean insert(){
        boolean status = false;
        if(mapImage == null)
            status = methodsSQL.execute("INSERT INTO events VALUES (?, ?, "+null+", "+null+", ?, ?, ?, ?, ?, ?, ?, ?, 1, "+null+")",
                eventName, nicknameCreator, visibility, startDateTime, endDateTime, staff, condition, quantityTicket, place, color);
        else
            status = methodsSQL.execute("INSERT INTO events VALUES (?, ?, "+null+", "+null+", ?, ?, ?, ?, ?, ?, ?, ?, 1, ?)",
                eventName, nicknameCreator, visibility, startDateTime, endDateTime, staff, condition, quantityTicket, place, color, mapImage);

        
        if(status){
            if(status && prices.isEmpty()){
                prices.add(0, new classPrice("Gratis", 0.0, quantityTicket));
            }
            id = methodsSQL.getExecuteInt("SELECT id FROM events WHERE eventName = ? and nicknameCreator = ?", 
                    eventName, classUsuario.getNickname());
            for (classPrice pric : prices) {
                status = methodsSQL.execute("INSERT INTO tickets VALUES (?, ?, ?, ?)", pric.getName(), pric.getCount(), 
                        pric.getPrice(), id);
            }
        } 
        
        return status;
    }

    public static boolean updateStatus(int cond, int id) {
        boolean status = false;
        status = methodsSQL.execute(" update activities set  condition = ? where id = ?", cond, id);
        return status;
    }

    public static boolean deleteAct(int id) {
        boolean status = false;
        status = methodsSQL.execute("delete from activities where id = ?", id);
        return status;
    }
    
    public static boolean inserttask(String task, int condition, int visibility, Double price, int idEvent, String nickname){
        boolean status = false;
        status = methodsSQL.execute("insert into tasks values(?, ?, ?, ?, ?, ?)", task, condition, visibility, price, idEvent, nickname);
        return status;
    }

    public static boolean updateTask(int id, int stat){
        boolean status = false;
        status = methodsSQL.execute("update tasks set condition = ? where id = ?", stat, id);
        return status;
    }
    
    public static boolean deleteTask(int id){
        boolean status = false;
        status = methodsSQL.execute("delete from tasks where id = ?", id);
        return status;
    }
    
    public static int selectGuestTickets(int idTickets){
        int num = 0;
        ResultSet rs = methodsSQL.getExecute("select count(id) from guest where idTickets = ?", idTickets);
        
        try {
            while(rs.next())
                num+=rs.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(classEvent.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return num;
    }
    
    public static boolean selectTasks(int idEvent){
        boolean status = false;
        List<Task> task = new ArrayList<>();
        Task ta;
        ResultSet rs = methodsSQL.getExecute("select id, task, condition, visible, price, nickname from tasks where idEvent = ?", idEvent);
        
        try {
            while(rs.next()){
                ta = new Task();
                ta.setId(rs.getInt(1));
                ta.setTask(rs.getString(2));
                ta.setCondition(rs.getInt(3));
                ta.setVisibility(rs.getInt(4));
                ta.setPrice(rs.getDouble(5));
                ta.setNickname(rs.getString(6));
                task.add(ta);
            }
            evento.setTasks(task);
            status = true;
        } catch (SQLException ex) {
            Logger.getLogger(classEvent.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return status;
    }
    
    public static boolean updateProblem(String nickname, int idProblem, int condition){
        boolean status = false;
        status = methodsSQL.execute("update problems set responsable  = ?, condition = ? where id = ?", nickname, condition, idProblem);
        return status;        
    }
    
    public static boolean deleteProblem(int idProblem){
        boolean status = false;
        status = methodsSQL.execute("delete from problems where id = ?", idProblem);
        return status;        
    }
    
    public static boolean insertGuest(int idEvent, int idTicket, String nickname, String datetime){
        return methodsSQL.execute("insert into guest values(?, ?, ?, ?)", idEvent, idTicket, nickname, datetime);
    }
    
    public static boolean deleteGuest(int id){
        return methodsSQL.execute("delete from guest where id = ?", id);
    }
    
    public static boolean selectProblems(int idEvent){
        boolean status = false;
        List<problem> problem = new ArrayList<>();
        problem pro;
        ResultSet rs = methodsSQL.getExecute("select id, problem, place, dateTime, danger, condition, nickname, responsable from problems where idEvent = ?", idEvent);
        
        try {
            while(rs.next()){
                pro = new problem();
                pro.setId(rs.getInt(1));
                pro.setProblem(rs.getString(2));
                pro.setPlace(rs.getString(3));
                pro.setDateTime(rs.getString(4));
                pro.setDanger(rs.getInt(5));
                pro.setCondition(rs.getInt(6));
                pro.setNickname(rs.getString(7));
                pro.setResponsable(rs.getString(8));
                problem.add(pro);
            }
            evento.setProblems(problem);
            status = true;
        } catch (SQLException ex) {
            Logger.getLogger(classEvent.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return status;
    }
    
}
