package javaClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Card {

    public Integer id;
    public String title;
    public String description;
    public String color;
    public Integer idproject;
    
    public Integer totalActivities;
    public Integer activitiesCompleted;
    
    public int insert(){       
        try(Connection con = connection.getConnection();
            PreparedStatement cmd = con.prepareStatement("INSERT INTO cards VALUES (?,?,?,?)", Statement.RETURN_GENERATED_KEYS)) {
                
            cmd.setString(1, title);
            cmd.setString(2, description);
            cmd.setString(3, color);
            cmd.setInt(4, classCards.idproject);
            
            cmd.execute();
            ResultSet rs = cmd.getGeneratedKeys();
            if (rs.next())
                return rs.getInt(1);
            
        } catch(Exception ex) {
            System.out.println(ex);
        }
        return 0;
    }
    
}
