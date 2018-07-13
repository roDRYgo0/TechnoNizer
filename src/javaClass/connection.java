package javaClass;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
    
    static Connection contacto = null;
    
    public static boolean stateConnection(){ 
        boolean state; 
            try { 

                URL ruta=new URL("http://www.google.es"); 
                URLConnection rutaC=ruta.openConnection(); 
                rutaC.connect(); 
                state = true; 
               }catch(IOException e){ 

                state = false; 
            } 
        return state; 
    } 
    
    public static Connection getConnection(){

        Connection on = null;
        try{
            String url = "jdbc:sqlserver://rodrigo:1433;databaseName=BD_TechnoNizer";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            on = DriverManager.getConnection(url,"sa","123");
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
