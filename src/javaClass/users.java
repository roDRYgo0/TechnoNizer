package javaClass;

public class users {
    private String nickname;
    private String firstName;
    private String lastName;
    private Integer idMemberships; 

    //<editor-fold defaultstate="collapsed" desc="Getter and Setter">
        public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getIdMemberships() {
        return idMemberships;
    }

    public void setIdMemberships(Integer idMemberships) {
        this.idMemberships = idMemberships;
    }
    
    //</editor-fold>
}
