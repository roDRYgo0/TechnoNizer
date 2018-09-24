package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {

    public static String res = "si";
    
    public static void main(String[] args) {
        
        ServerSocket servidor = null;
        Socket sc = null;
        DataInputStream in;
        DataOutputStream out;
        
        final int puert = 4000;
        
        try {
            servidor = new ServerSocket(puert);
            while(true){
                sc = servidor.accept();
                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());
                
                
                System.out.println();
                
                out.writeUTF(res);
                if("pues".equals(in.readUTF()))
                    res="no";
                sc.close();
                
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
