package javaClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
    
    static Connection contacto = null;
    
    public static Connection getConnection(){

        Connection on = null;
        try{
            String url = "jdbc:sqlserver://DESKTOP-GFICF12;databaseName=BD_TechnoNizer";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            on = DriverManager.getConnection(url,"technonizerdb","Masupial.48");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
        return on;
    }
    
    public static boolean validateConnection(){
        contacto = getConnection();
        if(contacto == null)
            return false;
        else
            return true;
    }
    
}
