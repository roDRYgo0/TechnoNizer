package javaClass;

/** @author rodri */

public class reminder {
    private Integer id; 
    private Integer condition;
    private String reminder;
    private String date;
    private Integer myNumberRemDisp;
    private Integer myNumberRemUse;

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
        condition=-1;
        date=null;
        System.out.println("Adios toda inf reminders");
    
       
    }
}
