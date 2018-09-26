package javaClass;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CheckList {

    public Integer id;
    public String title;
    public boolean checked;
    public Integer idcard;
    
    public static CheckList[] consultar(int idcard) {
        ArrayList<CheckList> result = new ArrayList<>();
        try {
            ResultSet rs = methodsSQL.getExecute("SELECT * FROM checklist WHERE idcard=?", idcard);
            while(rs.next()) {
                CheckList cl = new CheckList();
                cl.id = rs.getInt(1);
                cl.title = rs.getString(2);
                cl.checked = rs.getBoolean(3);
                cl.idcard = idcard;
                result.add(cl);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return result.toArray(new CheckList[0]);
    }
    
    public boolean insert(){        
        return methodsSQL.execute("insert into checklist values (?,?,?)", 
            title, checked, idcard);
    }
    
    public boolean update(){        
        return methodsSQL.execute("UPDATE checklist SET title=?,checked=? WHERE id=?", 
            title, checked, id);
    }
    
    public boolean delete(){        
        return methodsSQL.execute("DELETE FROM checklist WHERE id=?", id);
    }
    
}
