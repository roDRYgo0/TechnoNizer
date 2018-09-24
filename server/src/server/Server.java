package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {

    static int numEvents = 0;
    static ServerSocket servidor = null;
    static DataInputStream in;
    static DataOutputStream out;
    static final int puert = 4000;

    public static List<Socket> clientes = new ArrayList<>();

    public static void main(String[] args) {
        show s = new show();
        s.setVisible(true);

        try {
            servidor = new ServerSocket(puert);
            while (true) {
                Socket sc = servidor.accept();


                if (clientes.isEmpty()) {
                    clientes.add(sc);
                    Thread t = new ThreadServerHandler(sc);
                    t.start();
                } else {
                    for (int i = 0; i< clientes.size() ; i++) {
                        if (!clientes.get(i).getLocalAddress().equals(sc.getLocalAddress())) {
                            clientes.add(sc);
                            Thread t = new ThreadServerHandler(sc);
                            t.start();
                        } else {
                            clientes.remove(i);
                            clientes.add(sc);
                            Thread t = new ThreadServerHandler(sc);
                            t.start();
                        }
                    }
                }

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
                SocketAddress s = sc.getRemoteSocketAddress();
                
                out.writeUTF(process(in.readUTF()));

            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static String process(String instruction){
        String[] orden = instruction.split(":");
        String result= "";
        System.out.println(instruction);
        switch(orden[0]){
            case "connection from": 
                result = "Established connection with the server";
                break;
        }
        return result;
    }
    
    public static void sendClient(String hostServer, int puert, int soc) {

        DataInputStream in;
        DataOutputStream out;

        try {
            Socket sc = new Socket(hostServer, puert);
            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());
            out.writeUTF("mensajeador pegro6");

            System.out.println(in.readUTF());

            sc.close();

        } catch (IOException ex) {
            System.out.println("sin conexion");
            clientes.remove(soc);
        }
    }

}
