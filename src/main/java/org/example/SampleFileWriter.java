//
//package org.example;
//import java.lang.System;
//import java.io.File;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.util.Arrays;
//import java.util.Objects;
//
//public class SampleFileWriter {
//
//    private static final String NEW_LINE = "\n";
//
//    public static void main(String[] args) throws Exception {
//        String filePath = "Textfile.txt";
//
//        File file = new File(filePath);
//
//        FileWriter fw = new FileWriter(file);
//
//        fw.append("Sample Text");
//        fw.append(NEW_LINE);
//
//        char[] chars = new char[] {'c','a','t'};
//        fw.append(new String(chars));
//
//        fw.append(NEW_LINE);
//
//        fw.write("Hello Sample Write Program");
//
//        fw.append(NEW_LINE);
//
//        fw.write("v2");
//
//        fw.close();
//
//        System.out.println("---------- File Saved ----------");
//        System.out.println("At location: " + file.getAbsolutePath());
//
//
//        for (File f : file.getParentFile().listFiles()) {
//            System.out.println(f.getName());
//
//            if (f.getName().contains("Write")) {
//                FileReader fr = new FileReader(f);
//
//                StringBuilder sb = new StringBuilder();
//
//                int charCode;
//                while ((charCode = fr.read()) != -1) {
//                    sb.append((char) charCode);
//                }
//
//                System.out.println(sb);
//            }
//        }
//
//
//    }
//}
//
