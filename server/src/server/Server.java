package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {

    static int numEvents = 0;
    
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
                
                String[] listen = in.readUTF().split("-");
                System.out.println(in.readUTF());
                
                out.writeUTF(listenOut(listen[0]));
                
                sc.close();
                
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static String listenOut(String listenIn){
        String rs = "";
        switch(listenIn){
            case "insert event":
                rs = "update event";
                numEvents++;
                break;
            case "numEvent":
                rs = numEvents+"";
                break;
            default:
                break;
        }
        return rs;
    }
    
}
