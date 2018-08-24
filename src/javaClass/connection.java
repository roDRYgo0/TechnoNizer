package javaClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
    
    static Connection contacto = null;
    
    public static Connection getConnection(){

        Connection on = null;
        try{
<<<<<<< HEAD
            String url = "jdbc:sqlserver://db-technonizer.database.windows.net:1433;databaseName=BD_TechnoNizer";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            on = DriverManager.getConnection(url,"technonizer","Masupial.48");
=======
            String url = "jdbc:sqlserver://rodrigo;databaseName=BD_TechnoNizer";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            on = DriverManager.getConnection(url,"technonizerdb","Papaya");
>>>>>>> e9372ca0cd772a258f3a12a03a60bde456d22a30
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
