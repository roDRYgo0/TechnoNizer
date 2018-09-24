package javaClass;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SocketsClient {

    static ServerSocket servidor = null;
    static DataInputStream in;
    static DataOutputStream out;
    static final int puert = 4001;

    public static void listenClients() {
        try {
            servidor = new ServerSocket(puert);
            while (true) {
                Socket sc = servidor.accept();
                Thread t = new ThreadServerHandler(sc);
                t.start();
            }
        } catch (IOException ex) {
            Logger.getLogger(SocketsClient.class.getName()).log(Level.SEVERE, null, ex);
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
                SocketAddress s = sc.getRemoteSocketAddress();
                System.out.println(in.readUTF());
                
                out.writeUTF("Gracias Servidor");

                sc.close();

            } catch (IOException ex) {
                Logger.getLogger(SocketsClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
