package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
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
                    for (int i = 0; i < clientes.size(); i++) {
                        if (!clientes.get(i).getInetAddress().equals(sc.getInetAddress())) {
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
                String instruction = process(in.readUTF());
                out.writeUTF(instruction);

            } catch (IOException ex) {
                //EOFException 
            }
        }
    }

    public static String process(String instruction) {
        String[] orden = instruction.split(":");
        String result = "";
        System.out.println(instruction);
        switch (orden[0]) {
            case "connection from":
                result = "Established connection with the server";
                break;
            default:
                for (int i = 0; i < Server.clientes.size(); i++) {
                    if (Server.clientes.get(i) != null) {
                        System.out.println(Server.clientes.get(i).getInetAddress());
                        Server.sendClient(Server.clientes.get(i).getInetAddress().getHostAddress(), 4001, i);
                    }
                }
                break;
        }
        return result;
    }
    
    public static String message(String instruction){
        String[] orden = instruction.split(":");
        String result = "";
        System.out.println(instruction+" hey");
        switch (orden[0]) {
            case "insert event":
                return "refresh events";
            default:
                return "morro";
        }
    }

    public static void sendClient(String hostServer, int puert, int soc) {

        DataInputStream in;
        DataOutputStream out;
        System.out.println("socket");
        try {
            Socket sc = new Socket(hostServer, puert);
            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            
            out.writeUTF(message(in.readUTF()));

            sc.close();

        } catch (IOException ex) {
            System.out.println("sin conexion");
            clientes.remove(soc);
        }
    }

}
