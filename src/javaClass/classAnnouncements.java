/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaClass;

/**
 *
 * @author Lenovo
 */
public class classAnnouncements {
    
     private static Integer id;
    private static String announced;
    private static Integer priority;
    private static String publicGoal;
    private static Integer condition;
    private static String nickname;
    private static Integer idEvent;

    
    //<editor-fold defaultstate="collapsed" desc="Getter y Setter">
    

    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        classAnnouncements.id = id;
    }

    public static String getAnnounced() {
        return announced;
    }

    public static void setAnnounced(String announced) {
        classAnnouncements.announced = announced;
    }

    public static Integer getPriority() {
        return priority;
    }

    public static void setPriority(Integer priority) {
        classAnnouncements.priority = priority;
    }

    public static String getPublicGoal() {
        return publicGoal;
    }

    public static void setPublicGoal(String publicGoal) {
        classAnnouncements.publicGoal = publicGoal;
    }

    public static Integer getCondition() {
        return condition;
    }

    public static void setCondition(Integer condition) {
        classAnnouncements.condition = condition;
    }

    public static String getNickname() {
        return nickname;
    }

    public static void setNickname(String nickname) {
        classAnnouncements.nickname = nickname;
    }

    public static Integer getIdEvent() {
        return idEvent;
    }

    public static void setIdEvent(Integer idEvent) {
        classAnnouncements.idEvent = idEvent;
    }
   //</editor-fold>
}
