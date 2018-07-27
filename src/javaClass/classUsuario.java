package javaClass;

import java.sql.ResultSet;
import java.sql.SQLException;

public class classUsuario {
    
    private static String nickname;
    private static String firstName;
    private static String lastName;
    private static String birthdate;
    private static String mail;
    private static Integer id_gender;
    private static String password;
    private static Integer idMemberships; 
    private static Integer durationMem;
    private static String code;
    private static byte[] image;


    //<editor-fold defaultstate="collapsed" desc="Getter and Setter">
    public static byte[] getImage() {
        return image;
    }

    public static void setImage(byte[] foto) {
        classUsuario.image = foto;
    }
    public static String getCode() {
        return code;
    }

    public static void setCode(String code) {
        classUsuario.code = code;
    }
    
    public static Integer getDurationMem() {
        return durationMem;
    }

    public static void setDurationMem(Integer durationMem) {
        classUsuario.durationMem = durationMem;
    }
    
    public static Integer getIdMemberships() {
        return idMemberships;
    }

    public static void setIdMemberships(Integer idMemberships) {
        classUsuario.idMemberships = idMemberships;
    }
    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        classUsuario.password = password;
    }
    
    public static String getNickname() {
        return nickname;
    }

    public static void setNickname(String aNickname) {
        nickname = aNickname;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String aFirstName) {
        firstName = aFirstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String aLastName) {
        lastName = aLastName;
    }

    public static String getBirthdate() {
        return birthdate;
    }

    public static void setBirthdate(String aBirthdate) {
        birthdate = aBirthdate;
    }

    public static String getMail() {
        return mail;
    }

    public static void setMail(String aMail) {
        mail = aMail;
    }

    public static Integer getId_gender() {
        return id_gender;
    }

    public static void setId_gender(Integer aId_gender) {
        id_gender = aId_gender;
    }
//</editor-fold>
    
    public static boolean updateMembership(){
        return  methodsSQL.execute("UPDATE users SET idMemberships = ? WHERE nickname = ?", idMemberships, nickname);
    }
    
    public static boolean select(){
        boolean status = false;
        ResultSet rs = methodsSQL.getExecute("SELECT ui.firstName, ui.lastName, ui.birthdate, u.mail, ui.id_gender, u.imagen, u.idMemberships FROM users u, usersInformation ui WHERE u.nickname = ui.nickname and u.nickname =  ?", nickname);
        try {
            while(rs.next()){
                firstName = rs.getString(1);
                lastName = rs.getString(2);
                birthdate = rs.getString(3);
                mail = rs.getString(4);
                id_gender = rs.getInt(5);
                image = rs.getBytes(6);
                idMemberships = rs.getInt(7);
            }
            status = true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return status;
    }
    
    public static boolean insert(){
        boolean status = false;
        if(image==null){
            System.out.println("aqui");
            status = methodsSQL.execute("INSERT INTO users (nickname, mail, password, condition, durationMem, idMemberships) VALUES ( ?, ?, ?, ?, ?, ?)",
                    nickname, mail, password, 1, durationMem, idMemberships);
            if(status)
                status= methodsSQL.execute("INSERT INTO usersInformation VALUES (?, ?, ? ,?, ?)",
                        firstName, lastName, birthdate, id_gender, nickname);
        
        }else{
            System.out.println("aqui no");
            status = methodsSQL.execute("INSERT INTO users (nickname, mail, password, condition, imagen, durationMem, idMemberships) VALUES ( ?, ?, ?, ?, ?, ?, ?)",
                    nickname, mail, password, 1, image, durationMem, idMemberships);
            if(status)
                status= methodsSQL.execute("INSERT INTO usersInformation VALUES (?, ?, ? ,?, ?)",
                        firstName, lastName, birthdate, id_gender, nickname);
            
        }
        return status;
    }
    
    public static boolean update(){
        boolean status = false;
        if(image==null){
            status = methodsSQL.execute("UPDATE users SET mail = ?  WHERE nickname = ?",
                    mail, nickname);
            if(status)
                status= methodsSQL.execute("Update usersInformation SET firstName = ?, lastName = ?, birthdate = ?, id_gender = ? WHERE nickname  = ?",
                        firstName, lastName, birthdate, id_gender, nickname);
        
        }else{
            System.out.println("aqui no");
            status = methodsSQL.execute("UPDATE users SET mail = ?, imagen = ?  WHERE nickname = ?",
                    mail, image, nickname);
            if(status)
                status= methodsSQL.execute("Update usersInformation SET firstName = ?, lastName = ?, birthdate = ?, id_gender = ? WHERE nickname  = ?",
                        firstName, lastName, birthdate, id_gender, nickname);
            
        }
        return status;
    }
    
    public static boolean changePassword(){
        boolean status = false;
        status = methodsSQL.execute("UPDATE users SET password = ? WHERE nickname = ?", password, nickname);
        return status;
    }
    
}
