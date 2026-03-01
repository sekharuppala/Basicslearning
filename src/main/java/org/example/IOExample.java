package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOExample {
    public static void main(String[] args) throws IOException {
        FileReader fe=new FileReader("/home/somasekhar/Desktop/Myfile/Textfile.txt");
        int charcode = fe.read();
        char c=(char) charcode;
        System.out.print(c);
        int code;
        while ((code =fe.read())!=-1){
            System.out.print((char) code);
        }
        fe.close();

//        public class IOExample {
//            public static void main(String[] args) {
//                File file = new File("/home/somasekhar/Desktop/Myfile/Textfile.txt");
//
//                if (file.exists()) {
//                    System.out.println("File exists");
//                } else {
//                    System.out.println("File does not exist");
//                }
//            }
//        }
//


    }
}



