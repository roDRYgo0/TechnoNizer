package javaClass;

/** @author rodri */

public class reminder {
    
    private String nickname;
    private String firstName;
    private Integer condition;
    private String lastName;
    private byte[] image;
    private String reminder;
    private String date;
      private Integer myNumberRemDisp;
    private Integer myNumberRemUse;

    public void setCondition(Integer condition) {
        this.condition = condition;
    }
   
    
    public Integer getCondition() {
        return condition;
    }
    public void setMyNumberRemDisp(Integer myNumberRemDisp) {
        this.myNumberRemDisp = myNumberRemDisp;
    }

    public void setMyNumberRemUse(Integer myNumberRemUse) {
        this.myNumberRemUse = myNumberRemUse;
    }

    public void setIdMemberships(Integer idMemberships) {
        this.idMemberships = idMemberships;
    }
    private Integer idMemberships; 

    public Integer getMyNumberRemDisp() {
        return myNumberRemDisp;
    }

    public Integer getMyNumberRemUse() {
        return myNumberRemUse;
    }

    public Integer getIdMemberships() {
        return idMemberships;
    }
    
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public void setReminder(String reminder) {
        this.reminder = reminder;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
//</editor-fold>

    public String getNickname() {
        return nickname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public byte[] getImage() {
        return image;
    }

    public String getReminder() {
        return reminder;
    }

    public String getDate() {
        return date;
    }
    
}
