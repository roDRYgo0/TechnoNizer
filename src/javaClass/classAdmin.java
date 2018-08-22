package javaClass;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**@author rodri */

public class classAdmin {
    
    public static String nickname;
    
    public static List<user> users = new ArrayList<user>();
    public static List<user> usersSearch = new ArrayList<user>();
    
    static String[] birthdate;
    static String birth;
    
    public static boolean select(){
        boolean status = false;
        user usuario;
        ResultSet rs = methodsSQL.getExecute("SELECT u.nickname, ui.firstName, ui.lastName, ui.birthdate, u.mail, ui.id_gender,"
                + " u.condition, u.idMemberships, u.durationMem, u.imagen, u.keygen, u.checkKeygen, ui.id FROM users u,"
                + " usersInformation ui WHERE u.nickname = ui.nickname");
        
        try {
            while(rs.next()){
                usuario = new user();
                usuario.setNickname(rs.getString(1));
                usuario.setFirstName(rs.getString(2));
                usuario.setLastName(rs.getString(3));
                usuario.setBirthdate(rs.getString(4));
                usuario.setMail(rs.getString(5));
                usuario.setId_gender(rs.getInt(6));
                usuario.setCondition(rs.getInt(7));
                usuario.setIdMemberships(rs.getInt(8));
                usuario.setDurationMem(rs.getInt(9));
                usuario.setImage(rs.getBytes(10));
                usuario.setKeygen(rs.getString(11));
                usuario.setCheckKeygen(rs.getInt(12));
                usuario.setIdUsersInf(rs.getInt(13));
                birth = usuario.getBirthdate();
                birthdate = birth.split("-");
                usuario.setAge(standardization.returnAge(new Date(Integer.parseInt(birthdate[0]), Integer.parseInt(birthdate[1]), Integer.parseInt(birthdate[2])), standardization.currentDateTime()));
                usuario.setGender(methodsSQL.getExecuteString("SELECT gender FROM genders where id = ? ", usuario.getId_gender()));
                usuario.setMembership(methodsSQL.getExecuteString("SELECT m.name FROM memberships m WHERE m.id = ?", usuario.getIdMemberships()));
                if(methodsSQL.exists("SELECT count(*) FROM events WHERE nicknameCreator = ?", usuario.getNickname()))
                    usuario.setMyNumberEventUse(methodsSQL.getExecuteInt("SELECT count(*) FROM events WHERE nicknameCreator = ?", usuario.getNickname()));
                usuario.setMyNumberEventDisp((methodsSQL.getExecuteInt("SELECT m.numberEvents FROM memberships m WHERE m.id = ?", usuario.getIdMemberships()))-usuario.getMyNumberEventUse());
                if(methodsSQL.exists("SELECT count(*) FROM staff s, events e WHERE s.idEvent = e.id and s.nickname = ?", usuario.getNickname()))
                    usuario.setEneventMember( methodsSQL.getExecuteInt("SELECT count(*) FROM staff s, events e WHERE s.idEvent = e.id and s.nickname = ?", usuario.getNickname()));
                usuario.setEneventGuest(696);
                
                classAdmin.users.add(usuario); 
            }
            status = true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(classAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return status;
    }
    
    public static int getSpaceSearchGrid(){
        int row = (usersSearch.size())/2;
        if((usersSearch.size())%2!=0)
            row++;
        if(row <= 2)
            return 0;
        else
            return row - 2;
    }
    
    public static int getSpaceAllGrid(){
        int row = (users.size())/2;
        if((users.size())%2!=0)
            row++;
        if(row <= 2)
            return 0;
        else
            return row - 2;
    }
    
    public static int getSpaceSearchList(){
        int row = (usersSearch.size())/5;
        if((usersSearch.size())%5!=0)
            row++;
        if(row <= 5)
            return 0;
        else
            return row - 15;
    }
    
    public static int getSpaceAllList(){
        int row = (users.size())/5;
        if((users.size())%5!=0)
            row++;
        if(row <= 5)
            return 0;
        else
            return row - 15;
    }
    
}
