package javaClass;

import java.sql.ResultSet;
import java.sql.SQLException;

public class classUsuario {
    
    private static String nickname;
    private static String firstName;
    private static String lastName;
    private static String birthdate;
    private static String mail;
    private static Integer condition;
    private static Integer id_gender;
    private static String password;
    private static Integer idMemberships; 
    private static Integer durationMem;
    private static String code;
    private static byte[] image = null;
    private static String keygen;
    private static Integer checkKeygen;
    private static Integer idUsersInf;

    
    private static String myGender;
    private static String myMembership; 
    private static int myNumEvent;
    private static int myNumberEventDisp;
    private static int myNumberEventUse;

    //<editor-fold defaultstate="collapsed" desc="Getter and Setter">
    public static Integer getCondition() {
        return condition;
    }

    public static void setCondition(Integer condition) {
        classUsuario.condition = condition;
    }
    public static Integer getIdUsersInf() {
        return idUsersInf;
    }

    public static void setIdUsersInf(Integer idUsersInf) {
        classUsuario.idUsersInf = idUsersInf;
    }
    public static Integer getCheckKeygen() {
        return checkKeygen;
    }

    public static void setCheckKeygen(Integer checlKeygen) {
        classUsuario.checkKeygen = checlKeygen;
    }
    public static String getKeygen() {
        return keygen;
    }

    public static void setKeygen(String keygen) {
        classUsuario.keygen = keygen;
    }
    public static int getMyNumberEventUse() {
        return myNumberEventUse;
    }

    public static void setMyNumberEventUse(int myNumberEventUse) {
        classUsuario.myNumberEventUse = myNumberEventUse;
    }
    public static int getMyNumberEventDisp() {
        return myNumberEventDisp;
    }

    public static void setMyNumberEventDisp(int myNumberEventDisp) {
        classUsuario.myNumberEventDisp = myNumberEventDisp;
    }
    public static String getMyGender() {
        return myGender;
    }

    public static void setMyGender(String myGender) {
        classUsuario.myGender = myGender;
    }

    public static String getMyMembership() {
        return myMembership;
    }

    public static void setMyMembership(String myMembership) {
        classUsuario.myMembership = myMembership;
    }

    public static int getMyNumEvent() {
        return myNumEvent;
    }

    public static void setMyNumEvent(int myNumEvent) {
        classUsuario.myNumEvent = myNumEvent;
    }
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
    
    public static void restartUser(){
        nickname = null;
        firstName = null;
        lastName = null;
        birthdate = null;
        mail = null;
        id_gender = null;
        password = null;
        idMemberships = null;
        durationMem = null;
        code = null;
        image = null;
        myGender = null;
        myMembership = null;
        myNumEvent = 0;
        myNumberEventDisp = 0;
        myNumberEventUse = 0;
        keygen=null;
    }
    
    public static boolean select(){
        boolean status = false;
        ResultSet rs = methodsSQL.getExecute("SELECT ui.firstName, ui.lastName, ui.birthdate, u.mail, ui.id_gender,"
                + " u.imagen, u.idMemberships, g.gender, u.durationMem, u.keygen, u.checkKeygen, ui.id, u.condition FROM users u, usersInformation ui, genders g WHERE ui.id_gender = g.id and u.nickname = ui.nickname and u.nickname =  ?", nickname);
        try {
            while(rs.next()){
                firstName = rs.getString(1);
                lastName = rs.getString(2);
                birthdate = rs.getString(3);
                mail = rs.getString(4);
                id_gender = rs.getInt(5);
                image = rs.getBytes(6);
                idMemberships = rs.getInt(7);
                myGender = rs.getString(8);
                durationMem = rs.getInt(9);
                keygen = rs.getString(10);
                checkKeygen = rs.getInt(11);
                idUsersInf = rs.getInt(12);
                condition = rs.getInt(13);
            }
            status = true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            status = false;
        }
        myMembership = controller.member[idMemberships-1].getName();
        myNumEvent = controller.member[idMemberships-1].getNumberEvents();
        if(status){
            rs=methodsSQL.getExecute("SELECT COUNT(*) FROM events WHERE nicknameCreator = ?", nickname);
            try {
                while(rs.next()){
                    myNumberEventUse = rs.getInt(1);
                }
                myNumberEventDisp = myNumEvent-myNumberEventUse;
                status = true;
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                status = false;
            }
        }
        return status;
    }
    
    public static boolean selectAlter(){
        boolean status = true;
        myMembership = controller.member[idMemberships-1].getName();
        myNumEvent = controller.member[idMemberships-1].getNumberEvents();
        ResultSet rs;
        
        if(status){
            rs=methodsSQL.getExecute("SELECT g.gender FROM genders g, usersInformation u WHERE u.id_gender = g.id and u.nickname = ?",nickname);
            try {
                while(rs.next())
                    myGender = rs.getString(1);
                status = true;
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                status = false;
            }
        }
        if(status){
            rs=methodsSQL.getExecute("SELECT COUNT(*) FROM events WHERE nicknameCreator = ?", nickname);
            try {
                while(rs.next()){
                    myNumberEventUse = rs.getInt(1);
                }
                myNumberEventDisp = myNumEvent-myNumberEventUse;
                status = true;
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                status = false;
            }
        }
        return status;
    }
    
    public static boolean selectKeygen(){
        boolean status = false;
        ResultSet rs=methodsSQL.getExecute("SELECT keygen, checkKeygen FROM users WHERE nickname = ?", nickname);
        try {
            while(rs.next()){
                keygen = rs.getString(1);
                checkKeygen = rs.getInt(2);
            }
            System.out.println(keygen);
            System.out.println(checkKeygen);
            status = true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            status = false;
        }
        return status;
    }

    //<editor-fold defaultstate="collapsed" desc="Load final">
    public static void loadAllFinal(){
        for(int i=0; i < 3; i++){
            controller.member[i] = asignarDatos(i+1);
        }
        controller.genders = capturarGeneros();
    }
    
    static String[] capturarGeneros(){
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
    
    static classMembership asignarDatos(int m){
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
    //</editor-fold>
    
    public static boolean updateMembership(){
        return  methodsSQL.execute("UPDATE users SET idMemberships = ?, durationMem = ? WHERE nickname = ?", idMemberships, durationMem, nickname);
    }
 
    public static boolean insert(){
        boolean status = false;
        System.out.println(nickname);
        System.out.println(mail);
        System.out.println(password);
        System.out.println(image);
        System.out.println(durationMem);
        System.out.println(idMemberships);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(birthdate);
        System.out.println(id_gender);
        if(image == null){
            status = methodsSQL.execute("INSERT INTO users (nickname, mail, password, condition, imagen, durationMem, idMemberships, checkKeygen, keygen) VALUES ( ?, ?, ?, ?, "+image+", ?, ?, 0, 'null')",
                    nickname, mail, password, 1, durationMem, idMemberships);
            if(status)
                status= methodsSQL.execute("INSERT INTO usersInformation VALUES (?, ?, ? ,?, ?)",
                        firstName, lastName, birthdate, id_gender, nickname);
        }else{
            status = methodsSQL.execute("INSERT INTO users (nickname, mail, password, condition, imagen, durationMem, idMemberships, checkKeygen, keygen) VALUES ( ?, ?, ?, ?, ?, ?, ?, 0, 'null')",
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

    //<editor-fold defaultstate="collapsed" desc="Update">
    public static boolean updateImage(){
        return methodsSQL.execute("UPDATE users SET imagen = ? WHERE nickname = ?",image, nickname);
    }
    
    public static boolean updateFirstName(){
        return methodsSQL.execute("UPDATE usersInformation SET firstName = ? WHERE nickname = ?",firstName, nickname);
    }
    
    public static boolean updateLastName(){
        return methodsSQL.execute("UPDATE usersInformation SET lastName = ? WHERE nickname = ?",lastName, nickname);
    }
    
    public static boolean updateMail(){
        return methodsSQL.execute("UPDATE users SET mail = ? WHERE nickname = ?",mail, nickname);
    }
    
    public static boolean updateBirthdate(){
        return methodsSQL.execute("UPDATE usersInformation SET birthdate = ? WHERE nickname = ?",birthdate, nickname);
    }
    
    public static boolean updateGender(){
        return methodsSQL.execute("UPDATE usersInformation SET id_gender = ? WHERE nickname = ?",id_gender, nickname);
    }
    
    public static boolean updateCondition(){
        return methodsSQL.execute("UPDATE users SET condition = ? WHERE nickname = ?",condition, nickname);
    }
    //</editor-fold>
    
    public static boolean changePassword(){
        boolean status = false;
        status = methodsSQL.execute("UPDATE users SET password = ? WHERE nickname = ?", password, nickname);
        return status;
    }
    
    public static boolean insertKeygen(){
        boolean status = false;
        status = methodsSQL.execute("UPDATE users SET keygen = ?, checkKeygen = 1 WHERE nickname = ?", keygen, nickname);
        return status;
    }
    
    public static boolean changeCheckKeygen(int i){
        boolean status = false;
        status = methodsSQL.execute("UPDATE users SET checkKeygen = "+i+" WHERE nickname = ?", nickname);
        classUsuario.setCheckKeygen(i);
        return status;
    }
    
    public static boolean deleteKeygen(){
        boolean status = false;
        status = methodsSQL.execute("UPDATE users SET checkKeygen = 0, keygen = 'null' WHERE nickname = ?", nickname);
        checkKeygen = 0;
        keygen = "null";
        return status;
    }
    
}
