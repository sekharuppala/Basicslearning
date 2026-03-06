package org.example;

import java.io.*;
import java.net.*;
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

//public class SampleSocket {
//    public static void main(String[] args) {
//        try {
//            Socket s = new Socket("localhost", 8234);
//            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
//            dos.writeUTF("sekhar");
//            dos.writeUTF("25");
//            dos.writeInt(124);
//            dos.writeDouble(133.22);
//            dos.close();
//            s.close();
//
//        } catch (Exception e) {
//            System.out.println(e);
//
//        }
//    }
//}

//public class SampleSocket {
//    public static void main(String... args) {
//        try {
//
//            Socket s = new Socket("localhost",7123);
//            DataInputStream dis=new DataInputStream(s.getInputStream());
//            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
//            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//            String msg =" "; String msg2="sekhar";
//            while(!msg.equals("stop")){
//                msg.br.readLine();
//                dos.writeUTF(msg);
//                dos.flush();
//                msg2=dos.readUTF();
//                System.out.println(msg2);
//            }
//            dos.close();
//            s.close();
//
//        }catch(Exception e){
//            System.out.println(e);
//        }
//    }
//}

//public class SampleSocket {
//    public static void main(String[] args) throws Exception{
//        Socket s=new Socket("localhost",3333);
//        DataInputStream din=new DataInputStream(s.getInputStream());
//        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//
//        String str="",str2="";
//        while(!str.equals("stop")){
//            str=br.readLine();
//            dout.writeUTF(str);
//            dout.flush();
////            System.out.println("Clent says:"+str);
//            str2=din.readUTF();
//            System.out.println("Server says: "+str2);
//        }
//
//        dout.close();
//        s.close();
//
//    }
//}
























