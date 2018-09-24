package javaClass;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class SocketsClient {

    static int numEvents = -1;

    static String rs = "";

    static String hostServer = "localhost";
    static int puert = 4000;

    static DataInputStream in;
    static DataOutputStream out;

    public static String listenClients() {

        try {
            try (Socket sc = new Socket(hostServer, puert)) {
                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());

                out.writeUTF("insert event-dev.rodrig");

                System.out.println(in.readUTF());
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return rs;
    }

    public static String listenEvents() {

        return "";
    }

}
