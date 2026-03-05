package org.example;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//public class SampleSereverSocket {
//    public static void main(String ... args) {
//        try{
//        ServerSocket ss=new ServerSocket(7123);
////        ss.accept();
//        DataInputStream dis=new DataInputStream(ss.accept().getInputStream());
//        String msg=dis.readUTF();
//        String name= dis.readUTF();
//        int i=dis.readInt();
//        double d=dis.readDouble();
//        System.out.println(msg);
//        System.out.println(name);
//        System.out.println(i);
//        System.out.println(d);
//
//        ss.close();
//        dis.close();
//        } catch (Exception e){
//            System.out.println(e);
//        }
//
//    }
//}

public class SampleSereverSocket {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8234);
            Socket s = ss.accept();
            DataInputStream dis=new DataInputStream(s.getInputStream());
            String name= dis.readUTF();
            String age=dis.readUTF();
            int id=dis.readInt();
            double d=dis.readDouble();
            System.out.println(name);
            System.out.println(age);
            System.out.println(id);
            System.out.println(d);
            ss.close();
            dis.close();
            s.close();

        } catch (IOException e) {
            System.out.println(e);

        }
    }
}


















