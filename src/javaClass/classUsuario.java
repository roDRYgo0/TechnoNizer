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
    private static Integer condition;
    
    private static String previousFirstName;
    private static String previousLastName;
    private static String previousBirthdate;
    private static String previousMail;
    private static Integer previousId_gender;
    private static Integer previousCondition;
    private static Integer previousIdMemberships; 

    
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

    public static Integer getPreviousIdMemberships() {
        return previousIdMemberships;
    }

    public static void setPreviousIdMemberships(Integer previousIdMemberships) {
        classUsuario.previousIdMemberships = previousIdMemberships;
    }

    
    public static String getPreviousFirstName() {
        return previousFirstName;
    }

    public static void setPreviousFirstName(String previousFirstName) {
        classUsuario.previousFirstName = previousFirstName;
    }

    public static String getPreviousLastName() {
        return previousLastName;
    }

    public static void setPreviousLastName(String previousLastName) {
        classUsuario.previousLastName = previousLastName;
    }

    public static String getPreviousBirthdate() {
        return previousBirthdate;
    }

    public static void setPreviousBirthdate(String previousBirthdate) {
        classUsuario.previousBirthdate = previousBirthdate;
    }

    public static String getPreviousMail() {
        return previousMail;
    }

    public static void setPreviousMail(String previousMail) {
        classUsuario.previousMail = previousMail;
    }

    public static Integer getPreviousId_gender() {
        return previousId_gender;
    }

    public static void setPreviousId_gender(Integer previousId_gender) {
        classUsuario.previousId_gender = previousId_gender;
    }

    public static Integer getPreviousCondition() {
        return previousCondition;
    }

    public static void setPreviousCondition(Integer previousCondition) {
        classUsuario.previousCondition = previousCondition;
    }
    
    
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
        checkKeygen = -1;
        idUsersInf = -1;
        condition = -1;
    }
    
    public static boolean select(boolean search, int user){
        boolean status = false;
        if(search){
            firstName = classAdmin.usersSearch.get(user).getFirstName();
            lastName = classAdmin.usersSearch.get(user).getLastName();
            birthdate = classAdmin.usersSearch.get(user).getBirthdate();
            mail = classAdmin.usersSearch.get(user).getMail();
            id_gender = classAdmin.usersSearch.get(user).getId_gender();
            image = classAdmin.usersSearch.get(user).getImage();
            idMemberships = classAdmin.usersSearch.get(user).getIdMemberships();
            myGender = classAdmin.usersSearch.get(user).getGender();
            durationMem = classAdmin.usersSearch.get(user).getDurationMem();
            keygen = classAdmin.usersSearch.get(user).getKeygen();
            checkKeygen = classAdmin.usersSearch.get(user).getCheckKeygen();
            idUsersInf = classAdmin.usersSearch.get(user).getIdUsersInf();
            condition =classAdmin.usersSearch.get(user).getCondition();
            myMembership = classAdmin.usersSearch.get(user).getMembership();
            myNumEvent =  controller.member[idMemberships-1].getNumberEvents();
            myNumberEventUse = classAdmin.usersSearch.get(user).getMyNumberEventUse();
            myNumberEventDisp = classAdmin.usersSearch.get(user).getMyNumberEventDisp();
            status = classSecurityQuestions.select();
        }else{
            firstName = classAdmin.users.get(user).getFirstName();
            lastName = classAdmin.users.get(user).getLastName();
            birthdate = classAdmin.users.get(user).getBirthdate();
            mail = classAdmin.users.get(user).getMail();
            id_gender = classAdmin.users.get(user).getId_gender();
            image = classAdmin.users.get(user).getImage();
            idMemberships = classAdmin.users.get(user).getIdMemberships();
            myGender = classAdmin.users.get(user).getGender();
            durationMem = classAdmin.users.get(user).getDurationMem();
            keygen = classAdmin.users.get(user).getKeygen();
            checkKeygen = classAdmin.users.get(user).getCheckKeygen();
            idUsersInf = classAdmin.users.get(user).getIdUsersInf();
            condition =classAdmin.users.get(user).getCondition();
            myMembership = classAdmin.users.get(user).getMembership();
            myNumEvent =  controller.member[idMemberships-1].getNumberEvents();
            myNumberEventUse = classAdmin.users.get(user).getMyNumberEventUse();
            myNumberEventDisp = classAdmin.users.get(user).getMyNumberEventDisp();
            status = classSecurityQuestions.select();
        }
        return status;
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
            numEvents();
        }
        if(status)
            status = classSecurityQuestions.select();
        return status;
    }
    
    public static void numEvents(){
        classEvent.select();
        myNumberEventUse = classEvent.eventos.size();
        myNumberEventDisp = myNumEvent-myNumberEventUse;
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
        usersBinnacle.binnacle(10);
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
        usersBinnacle.binnacle(0);
        return status;
    }
    
    //<editor-fold defaultstate="collapsed" desc="previous update">
    
    //    public static boolean updates(){
//        boolean status = false;
//        if(image==null){
//            status = methodsSQL.execute("UPDATE users SET mail = ?  WHERE nickname = ?",
//                    mail, nickname);
//            if(status)
//                status= methodsSQL.execute("Update usersInformation SET firstName = ?, lastName = ?, birthdate = ?, id_gender = ? WHERE nickname  = ?",
//                        firstName, lastName, birthdate, id_gender, nickname);
//        
//        }else{
//            System.out.println("aqui no");
//            status = methodsSQL.execute("UPDATE users SET mail = ?, imagen = ?  WHERE nickname = ?",
//                    mail, image, nickname);
//            if(status)
//                status= methodsSQL.execute("Update usersInformation SET firstName = ?, lastName = ?, birthdate = ?, id_gender = ? WHERE nickname  = ?",
//                        firstName, lastName, birthdate, id_gender, nickname);
//            
//        }
//        System.out.println(methodsSQL.execute("insert into usersBinnacle values ('Actualizacion de toda la información', ?, ?, 2)", standardization.getDateTime(), nickname));
//        return status;
//    }
    
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Update">
    public static boolean updateImage(boolean admin){
        if(admin)
            usersBinnacle.binnacle(23);
        else
            usersBinnacle.binnacle(3);
        return methodsSQL.execute("UPDATE users SET imagen = ? WHERE nickname = ?",image, nickname);
    }
    
    public static boolean updateFirstName(boolean admin){
        if(admin)
            usersBinnacle.binnacle(24);
        else
            usersBinnacle.binnacle(4);
        return methodsSQL.execute("UPDATE usersInformation SET firstName = ? WHERE nickname = ?",firstName, nickname);
    }
    
    public static boolean updateLastName(boolean admin){
        if(admin)
            usersBinnacle.binnacle(25);
        else
            usersBinnacle.binnacle(5);
        return methodsSQL.execute("UPDATE usersInformation SET lastName = ? WHERE nickname = ?",lastName, nickname);
    }
    
    public static boolean updateMail(boolean admin){
        if(admin)
            usersBinnacle.binnacle(26);
        else
            usersBinnacle.binnacle(6);   
        return methodsSQL.execute("UPDATE users SET mail = ? WHERE nickname = ?",mail, nickname);
    }
    
    public static boolean updateBirthdate(boolean admin){
        if(admin)
            usersBinnacle.binnacle(27);
        else
            usersBinnacle.binnacle(7);
        return methodsSQL.execute("UPDATE usersInformation SET birthdate = ? WHERE nickname = ?",birthdate, nickname);
    }
    
    public static boolean updateGender(boolean admin){
        if(admin)
            usersBinnacle.binnacle(28);
        else
            usersBinnacle.binnacle(8);
        return methodsSQL.execute("UPDATE usersInformation SET id_gender = ? WHERE nickname = ?",id_gender, nickname);
    }
    
    public static boolean updateCondition(boolean admin){
        if(admin)
            usersBinnacle.binnacle(29);
        else
            usersBinnacle.binnacle(9);
        return methodsSQL.execute("UPDATE users SET condition = ? WHERE nickname = ?",condition, nickname);
    }
    //</editor-fold>
    
    public static boolean changePassword(boolean admin){
        if(admin)
            usersBinnacle.binnacle(30);
        else
            usersBinnacle.binnacle(11);
        return methodsSQL.execute("UPDATE users SET password = ? WHERE nickname = ?", password, nickname);
    }
    
    public static boolean insertKeygen(boolean admin){
        if(admin)
            usersBinnacle.binnacle(31);
        else
            usersBinnacle.binnacle(12);
        return methodsSQL.execute("UPDATE users SET keygen = ?, checkKeygen = 1 WHERE nickname = ?", keygen, nickname);
    }
    
    public static boolean changeCheckKeygen(int i, boolean admin){
        boolean status;
        if(admin)
            usersBinnacle.binnacle(32);
        else
            usersBinnacle.binnacle(13, i);
        status = methodsSQL.execute("UPDATE users SET checkKeygen = "+i+" WHERE nickname = ?", nickname);
        classUsuario.setCheckKeygen(i);
        return status;
    }
    
    public static boolean deleteKeygen(boolean admin){
        boolean status;
        if(admin)
            usersBinnacle.binnacle(33);
        else
            usersBinnacle.binnacle(14);
        status = methodsSQL.execute("UPDATE users SET checkKeygen = 0, keygen = 'null' WHERE nickname = ?", nickname);
        checkKeygen = 0;
        keygen = "null";
        return status;
    }
    
}
