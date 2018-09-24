package javaClass;

public class CheckList {

    public Integer id;
    public String title;
    public boolean checked;
    public Integer idcard;
    
    public boolean insert(){        
        return methodsSQL.execute("insert into checklist values (?,?,?)", 
            title, checked, idcard);
    }
    
}
