package javaClass;

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

    //<editor-fold defaultstate="collapsed" desc="Getter and Setter">
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
    
    public static boolean insert(){
        boolean status = false;
        status = methodsSQL.execute("INSERT INTO users (nickname, mail, password, condition, durationMem, idMemberships) VALUES ( ?, ?, ?, ?, ?, ?)",
                nickname, mail, password, 1, durationMem, idMemberships);
        if(status)
            status= methodsSQL.execute("INSERT INTO usersInformation VALUES (?, ?, ? ,?, ?)",
                    firstName, lastName, birthdate, id_gender, nickname);
        return status;
    }
    
}
