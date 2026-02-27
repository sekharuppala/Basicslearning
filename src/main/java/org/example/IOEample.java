package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOEample {
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
    }
}



