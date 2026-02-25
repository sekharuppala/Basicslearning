package org.example;

//public class WhileLoops {
//    public static void main(String[] args){
//       int i=3;
//       while(i > 5){
//           System.out.println(i);
//           i++;
//           System.out.println("DONE");
//
//       }
//        System.out.println("DONE");
//    }
//
//}

//public class WhileLoops {
//    public static void main(String[] args){
//        int i=1;
//        while(i<=100){
//            System.out.println(i);
//            if(i!=100) {
//            }else i++;
//            System.out.println(i);
//
//        }
//    }
//}

//public class WhileLoops {
//    public static void main(String... args) {
//        int number = 5;
//        int factorial = 1;
//        int i = 1;
//        while (i <= number) {
//            factorial *= i;
//            i++;
//
//        }
//        System.out.println("Factorial of " + number + " is: " + factorial);
//
//    }
//}

/*public class WhileLoops {
    public static void main(String... args) {
        int a=60;
        while (a<65){
            System.out.println("Value of  "+a);
            a++;
        }
        System.out.println("DONE");

        }
    }*/


//public class WhileLoops {
//    public static void main(String... args) {
//        int a = 30;
//        while (a < 35) {
//            System.out.println(a);
//            if (a == 35) {
//                System.out.println("a value " + a);
//                break;
//            }
//            else a++;
//
//
//        }
//        System.out.println("COMPLETED");
//
//    }
//}

//
//public class WhileLoops {
//    public static void main (String ... args){
//        String name ="sekhar";
//        while(name=="sekhar"){
//            if (name!="raju"){
//                System.out.println("Person name is " +name);
//                break;
//            }
//
//        }
//        System.out.println("completed");
//    }
//}


//import java.util.Scanner;
//
//public class WhileLoops {
//    public static void main(String... args) {
//        System.out.println("Enter Username:");
//        String userName = new Scanner(System.in).nextLine();
//        System.out.println("Enter Password:");
//        String password = new Scanner(System.in).nextLine();
//
//        while (userName == "sekhar") {
//            if (userName == "sekhar") {
//                if (password == "12345") {
//                    System.out.println("Login accepted");
//                    System.out.println("Correct password");
//                    break;
//                } else {
//                    System.out.println("Login Error");
//                }
//            }
//            if(userName!="sekhar"){
//                if(password!="12345"){
//                    System.out.println("Password Error");
//                }
//
//            }
/// /            System.out.println("Give the correct username");
//        }
//        System.out.println("Give the correct username");
//    }
//}


/*import java.util.Scanner;

public class WhileLoops {
    public static void main(String... args) {
        System.out.println("Enter Username:");
        String userName = new Scanner(System.in).nextLine();
        System.out.println("Enter Password:");
        String password = new Scanner(System.in).next();

            switch (userName) {
                case "sekhar":
//                    System.out.println("Login Succesfully");
                    break;
                case "12233":
//                    System.out.println("Error");
                    break;
                case "@##$$%%%&*((*^_+(!":
//                    System.out.println("Error");
                    break;
                case " ":
//                    System.out.println("Error");
                    break;
                default:
//                    System.out.println("Error");

            }
            switch (password){
                case "1234":
                    System.out.println("invalid");
                    break;

//                case "1234":
//                    System.out.println("Invalid credentials");
//                    break;

                case "hghaha":
                    System.out.println("Invalid Credentials");
                    break;
                case "13334":
                    System.out.println("Invalid Credentials");
                    break;
                case " ":
                    System.out.println("Invalid Credentials");
                    break;
                default:
                    System.out.println("Invalid Credentials");
            }


        }
    }*/


//import java.util.Scanner;

//public class WhileLoops {
//    public static void main(String... args) {
//        System.out.println("Enter Username:");
//        String userName = new Scanner(System.in).nextLine();
//        System.out.println("Enter Password:");
//        String password = new Scanner(System.in).next();
//
//            if (!userName.equals("sekhar") && password.equals("1234")) {
//                System.out.println("Invalid Credentials");
//
//            } else if (userName.equals("sekhar") && !password.equals("1234")) {
//                System.out.println("Invalid Credentials");
//
//            } else if (userName.equals("sekhar") && password.equals("1234")) {
//                System.out.println("Login sUcessfully");
//
//            } else if (!userName.equals("sekhar") && !password.equals("1234")) {
//                System.out.println("Invalid Credantials");
//
//
//            }
//
//        }
//    }


//import java.util.Scanner;
//
//public class WhileLoops {
//    public static void main(String... args) {
//        System.out.println("Enter UserName:");
//        String userName = new Scanner(System.in).nextLine();
//        System.out.println("Enter Password");
//        String password = new Scanner(System.in).nextLine();

import java.util.Scanner;

/// /        String letter = new Scanner(System.in).nextLine();
//
//
//
//        }
//
//        }



import java.util.Scanner;
//public class WhileLoops {
//    public static void main(String... args) {
//        System.out.println("Enter Username:");
//        String userName = new Scanner(System.in).nextLine();
//        System.out.println("Enter Password:");
//        String password = new Scanner(System.in).next();
//
//        boolean exit =false;
//
//        while(true && !exit){
//            boolean valid = false;
//
//            switch(userName){
//                case "sekhar":
//                    valid = true;
//                       break;
//                case "jadsjhj566#$%":
//                    System.out.println("Invalid");
//                    break;
//                case "ASHSHS":
//                    System.out.println("Invalid");
//                    break;
//                case"123424":
//                    System.out.println("Invalid");
//                    break;
//                case "!@##$%%^":
//                    System.out.println("Invalid");
//                    break;
//            }
//
//
//            switch (password){
//                case"1234":
//                    break;
//                default:
//                    valid = false;
//                    break;
//
//            }
//
//
//            if (valid) {
//                System.out.println("login succesfull");
//                break;
//            } else System.out.println("Invalid username or password");
//
//            System.out.println("Enter Letter");
//            String letter =new Scanner(System.in).nextLine();
//            switch (letter){
//                case "q":
//                    System.out.println("stop");
//                    exit=true;
//                    break;
//                case "Q":
//                    System.out.println("stop");
//                    exit=true;
//                    break;
//
//
//
//            }
//
//        }
//
//
//    }
//
//}


//class WhileLoops {
//    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 5};
//        int[] b = new int[10];
//        int index = 0;
//
//        while (index<a.length) {
//            if (index < a.length) {
//                b[index] = a[index];
//                index++;
//            } else break;
//
//        }
//        System.out.println();
//
//    }
//}


//public class WhileLoops {
//    public static void main(String... args) {
//        int[] a = new int[2];
//        System.out.println("Enter a number seperating with space to addition:");
//        String numbers = new Scanner(System.in).nextLine();
//        String inputs[] = numbers.split(" ");
//        a = new int[inputs.length];
//
//        int sum = 0;
//        for (int i = 0; i < a.length; i++) {
//            a[i] = Integer.parseInt(inputs[i]);
//            sum = sum + a[i];
//
//        }
//        System.out.println("Sum is  " + sum);
//
//    }
//}


//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class FileReaderExample {
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(
//                new FileReader("/home/somasekhar/Desktop/Myfile/Textfile.txt"));
//
//        List<String> names = new ArrayList<>();
//        String line;
//
//
//        while ((line = br.readLine()) != null) {
//            names.add(line);
//        }
//
//        br.close();
//
//        Collections.sort(names);
//
//        for (String name : names) {
//            System.out.println(name);
//        }
//    }








