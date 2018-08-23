package javaClass;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class classSecurityQuestions {
    
    private static int[] id = new int[3];
    private static String[] questions = new String[3];
    private static String[] answers = new String[3];    
    private static String[] allQuestions;
    public static int allNumQuestion;
    public static boolean change = false;
    
    public static int answ = 0;
    
    
    //<editor-fold defaultstate="collapsed" desc="Getter and Setter">
    public static String[] getAllQuestions() {
        return allQuestions;
    }

    public static void setAllQuestions(String[] allQuestions) {
        classSecurityQuestions.allQuestions = allQuestions;
    }
    public static int[] getId() {
        return id;
    }

    public static void setId(int[] id) {
        classSecurityQuestions.id = id;
    }
    public static String[] getQuestions() {
        return questions;
    }

    public static void setQuestions(String[] questions) {
        classSecurityQuestions.questions = questions;
    }

    public static String[] getAswers() {
        return answers;
    }

    public static void setAswers(String[] aswers) {
        classSecurityQuestions.answers = aswers;
    }
//</editor-fold>
    
    
    public static boolean delete(){
        boolean status = false;
        status = methodsSQL.execute("DELETE FROM security WHERE nickname = ?", classUsuario.getNickname());
        if(status){
            questions = new String[3];
            answers = new String[3];
            usersBinnacle.binnacle(19);
        }
        return status;
    }
    
    public static boolean insert(){
        boolean status = true;
        int ids;
        for(int i = 0; i < 3; i++){
            if(status){
                System.out.println("la pregunta"+questions[i]);
                System.out.println("la respusta "+answers[i]);
                ids = methodsSQL.getExecuteInt("SELECT id FROM questionBank WHERE question = ?", questions[i]);
                System.out.println("El id "+ids);
                status = methodsSQL.execute("INSERT INTO security VALUES (?, ?, ?)",answers[i], ids, classUsuario.getNickname());
            }
        }
        if(status)
            usersBinnacle.binnacle(18);
        return status;
    }
    
    public static boolean loadAllQuestions(){
        boolean status = false;
        allNumQuestion = methodsSQL.getExecuteInt("SELECT count(*) FROM questionBank");
        allQuestions = new String[allNumQuestion];
        ResultSet rs = methodsSQL.getExecute("SELECT question FROM questionBank");
        try {
            for(int i = 0; rs.next(); i++){
                allQuestions[i] = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(classSecurityQuestions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
    
    public static boolean select(){
        boolean status = false;
        ResultSet rs = methodsSQL.getExecute("SELECT q.id, q.question, s.answer FROM questionBank q, security s WHERE q.id = s.idQuestion and s.nickname = ?", classUsuario.getNickname());
        try {
            for(int i = 0; rs.next(); i++){
                id[i] = rs.getInt(1);
                questions[i] = rs.getString(2);
                answers[i] = rs.getString(3);
            }
            status = true;
        } catch (SQLException ex) {
            Logger.getLogger(classSecurityQuestions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
}
