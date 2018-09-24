package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {

    static int numEvents = 0;
    static ServerSocket servidor = null;
    static DataInputStream in;
    static DataOutputStream out;
    static final int puert = 4000;

    public static InetAddress inetAddresClient;
    public static int portClient;
    
    public static void main(String[] args) {
        try {
            servidor = new ServerSocket(puert);
            while (true) {
                Socket sc = servidor.accept();
                
                Thread t = new ThreadServerHandler(sc);
                t.start();
            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    static class ThreadServerHandler extends Thread {
        
        Socket sc;
        
        private ThreadServerHandler(Socket sc) {
            this.sc = sc;
        }

        public void run() {
            try {
                

                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());
                
                String[] listen = in.readUTF().split("-");
                System.out.println(in.readUTF());

                inetAddresClient = sc.getInetAddress();
                portClient = sc.getPort();
                
                out.writeUTF("buena mogro");

                sc.close();

            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
