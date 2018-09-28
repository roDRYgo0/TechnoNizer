package javaClass;

/** @author rodri */

public class reminder {
    private Integer id; 
    private Integer condition;
    private String reminder;
    private String date;
    private String date1;
    private String hour;
    private Integer myNumberRemDisp;
    private Integer myNumberRemUse;
    private String nickname;
    private Integer Num;
    
    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }
    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public Integer getNum() {
        return Num;
    }

    public void setNum(Integer Num) {
        this.Num = Num;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    

    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    

    public Integer getCondition() {
        return condition;
    }

    public void setCondition(Integer condition) {
        this.condition = condition;
    }

    public String getReminder() {
        return reminder;
    }

    public void setReminder(String reminder) {
        this.reminder = reminder;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getMyNumberRemDisp() {
        return myNumberRemDisp;
    }

    public void setMyNumberRemDisp(Integer myNumberRemDisp) {
        this.myNumberRemDisp = myNumberRemDisp;
    }

    public Integer getMyNumberRemUse() {
        return myNumberRemUse;
    }

    public void setMyNumberRemUse(Integer myNumberRemUse) {
        this.myNumberRemUse = myNumberRemUse;
    }
    
    private void restartReminder(){
        id=null;
        reminder=null;
        date=null;
        System.out.println("Adios toda inf reminders");
    
       
    }
}
