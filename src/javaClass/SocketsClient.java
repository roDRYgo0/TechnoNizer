package javaClass;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SocketsClient {

    public static ServerSocket servidor = null;
    static DataInputStream in;
    static DataOutputStream out;
    static final int puert = 4001;

    //<editor-fold defaultstate="collapsed" desc="Listen server">
    public static void listenServer() {
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
    
//</editor-fold>
    
    public static String hotsAddress(){
        try {
            return InetAddress.getLocalHost().getHostAddress()+" // "+InetAddress.getLocalHost().getHostName();
        } catch (IOException ex) {
            Logger.getLogger(SocketsClient.class.getName()).log(Level.SEVERE, null, ex);
            return "m";
        }
    }
    
    public static void sendServer(String instruction){
        final String hostServer = "192.168.43.159";
        final int puert = 4000;
        
        DataInputStream in;
        DataOutputStream out;
        
        
        try {
            Socket sc = new Socket(hostServer, puert);
            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());
            out.writeUTF(instruction);
            
            System.out.println(received(in.readUTF()));
            
            sc.close();

            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static String received(String instruction){
        switch(instruction){
            case "refresh events":
                if(controller.positionPanel.equals("allEvents")){
                    classEvent.select();
                    technonizer.TechnoNizer.home.showAllEvents(false);
                }
                break;
        }
        return instruction;
    }

}
