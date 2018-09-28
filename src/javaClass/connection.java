
package javaClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
    
    static Connection contacto = null;
    
    /**
     *
     * @return la conexion con la instancia descrita
     */
    public static Connection getConnection(){

        Connection on = null;
        try{

            String url = "jdbc:sqlserver://192.168.137.1;databaseName=BD_TechnoNizer";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            on = DriverManager.getConnection(url,"technonizerdb","Masupial.48");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
        return on;
    }
    
    /**
     *
     * @return valida si existe una conexion con la base
     */
    public static boolean validateConnection(){
        contacto = getConnection();
        if(contacto == null)
            return false;
        else
            return true;
    }
    
}