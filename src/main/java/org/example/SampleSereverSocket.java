package org.example;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.*;
import java.io.IOException;
import java.util.Scanner;

//public class SampleSereverSocket {
//    public static void main(String ... args) {
//        try{
//        ServerSocket ss=new ServerSocket(7123);

/// /        ss.accept();
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

//public class SampleSereverSocket {
//    public static void main(String[] args) {
//        try {
//            ServerSocket ss = new ServerSocket(8234);
//            Socket s = ss.accept();
//            DataInputStream dis=new DataInputStream(s.getInputStream());
//            String name= dis.readUTF();
//            String age=dis.readUTF();
//            int id=dis.readInt();
//            double d=dis.readDouble();
//            System.out.println(name);
//            System.out.println(age);
//            System.out.println(id);
//            System.out.println(d);
//            ss.close();
//            dis.close();
//            s.close();
//
//        } catch (IOException e) {
//            System.out.println(e);
//
//        }
//    }
//}

//public class SampleSereverSocket {
//    public static void main(String[] args) {
//        try {
//            ServerSocket ss=new ServerSocket(7123);
////            Socket s=ss.accept();
//            DataInputStream dis=new DataInputStream(ss.accept().getInputStream());
//            DataOutputStream dos=new DataOutputStream(ss.accept().getOutputStream());
////            Scanner sc=new Scanner(System.in);
//            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//            String msg=" "; String msg2="sekhar";
//            while (!msg.equals("stop")){
//                msg=dis.readUTF();
//                System.out.println(msg);
//                msg2= br.readLine();
//                dos.writeUTF(msg2);
//                System.out.println(msg2);
////                dos.writeUTF(sc.nextLine());
//
//                dos.flush();
//
//            }
//            dos.close();
//            ss.close();
////            sc.close();
//
//        }catch (Exception e){
//            System.out.println(e);
//        }
//    }
//
//}



//public class SampleSereverSocket  {
//    public static void main(String[] args) throws Exception {
//        ServerSocket ss=new ServerSocket(3333);
//        Socket s=ss.accept();
//        DataInputStream dis=new DataInputStream(s.getInputStream());
//        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        String str ="",str2="";
//        while(!str.equals("stop")){
//            str=dis.readUTF();
//            System.out.println("Client Says:"+str);
//            str2= br.readLine();
//            dos.writeUTF(str2);
//            dos.flush();
//        }
//        dis.close();
//        s.close();
//        ss.close();
//    }
//
//}















