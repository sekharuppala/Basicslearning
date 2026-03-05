package org.example;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


//public class SampleSocket {
//    public static void main(String[] args) {
//        try {
//            Socket s = new Socket("localhost", 7123);
//            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
//            dos.writeUTF("HELLO WORLD!");
//            dos.writeUTF("1244");

/// /            dos.writeDouble(21.32);
//            dos.write(121213);
//            dos.writeDouble(21.32);
//            dos.flush();
//            dos.close();
//            s.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//    }
//}

public class SampleSocket {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 8234);
            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
            dos.writeUTF("sekhar");
            dos.writeUTF("25");
            dos.writeInt(124);
            dos.writeDouble(133.22);
            dos.close();
            s.close();

        } catch (Exception e) {
            System.out.println(e);

        }
    }
}
