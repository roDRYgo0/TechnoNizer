package javaClass;

import java.sql.ResultSet;
import java.sql.SQLException;

public class loadCreateAccount extends Thread {

    public void run(){
        for(int i=0; i < 3; i++){
            controller.member[i] = capturarDatos(i+1);
        }
        controller.genders = capturarGeneros();
        controller.actionCompleted = true;
        System.out.println("hello");
    }
    
    classMembership capturarDatos(int m){
        classMembership member = new classMembership();
        try {
            ResultSet rs = methodsSQL.getExecute("SELECT m.name, m.description, m.condition, m.numberEvents, m.numberAdmins, m.numberModerators, m.numberGuests, m.price FROM memberships m WHERE m.id = ? ", m);
            while(rs.next()){
                member.setName(rs.getString(1));
                member.setDescription(rs.getString(2));
                member.setCondition(rs.getInt(3));
                member.setNumberEvents(rs.getInt(4));
                member.setNumberAdmins(rs.getInt(5));
                member.setNumberModerators(rs.getInt(6));
                member.setNumberGuests(rs.getInt(7));
                member.setPrice(rs.getFloat(8));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return member;
    }
    
    String[] capturarGeneros(){
        String[] genders = new String[2];
        
        ResultSet rs = methodsSQL.getExecute("SELECT gender FROM genders");
        try {
            for(int i = 0; rs.next(); i++){
                genders[i]= rs.getString(1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return genders;
    }
    
}
