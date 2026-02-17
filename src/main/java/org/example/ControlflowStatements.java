package org.example;

//public class ControlflowStatements {
//    public static void main(String... args) {
//        int a=5;
//        if (a !=10){
//            System.out.println("Integer");
//        }else{
//                System.out.println("Number");
//            }

//    int a = 5;
//    boolean Number = a / 2 == 0;
//    if(!Number)
//
//    {
//        System.out.println("Odd Numbers");

//        if (!(5%2==0)) {
//            System.out.println("Even Numbers");
//        }else{
//            System.out.println("oddnumbers");
//        }


//        if (!(10%2==0)) {
//            System.out.println("Odd Numbers");
//        }
//        else{
//            System.out.println("Even Numbers");
//        }
//    }
//}

//public class ControlflowStatements {
//    public static void main(String[] args) {
/// /        if (true ==((10+5)==5)!=((20+5==25))){
/// /            System.out.println("If Block");
/// /        }else {
/// /            System.out.println("Else Block");
/// /        }


//
//        if (true) if (5 % 2 == 0) {
//            System.out.println("A");
//        }
//        if (11 % 2 == 0) {
//            System.out.println("B");
//        } else if (2 % 2 == 0) {
/// /            System.out.println("c");
//        }
//        if (2 % 2 == 0) {
//

/// /            System.out.println("else");
//            if (3 % 3 == 0) {
//                if (3 % 4 == 0) {
//                    System.out.println("N");
//                } else {
//                    System.out.println("Else");
//                }
//            }
//        }
//    }
//
//}

//
//public class ControlflowStatements {
//    public static void main(String[] args) {
//        int num1 = 1;
//        int num2 = 2;
//        int num3 = 4;
//        int num4 = 0;
//
//        if (num1 == num2) {
//            System.out.println("APPLE");
//        }
//        if (num4 == num3) {
//            System.out.println("Mango");
//
//        } else if (num3 == num4) {
//            System.out.println("Banana");
//        }
//        if (num1 != num2) {
//            if (num3 != num2) {
//                if (num4 == num3) {
//                    System.out.println("N");
//                } else {
//                    System.out.println("Else");
//                }
//            }
//        }
//
//    }
//}


//public class ControlflowStatements {
//    public static void main(String[] args) {
//        String s1 = "sekhar";
//        String s2 = "Nagarjuna";
//        String s3 = "Bhanu";
//        String s4 = "Syam";
//        if (s1 == s2) {
//            System.out.println("A");
//        }
//        if (s3 == s4) {
//            System.out.println("B");
//        } else if (s3 == s2) {
//            System.out.println("B");
//        }
//        if (s2 != s4) {
//            if (s3 != s1) {
//                if (s4 != s1) {
//                    System.out.println("N");
//                } else {
//                    System.out.println("Else");
//                }
//            }
//
//
//        }
//    }
//}
//



/*public class ControlflowStatements {
    public static void main(String ... args){
        float s=10.1f;
        float s1=10.23f;
        float s2=20.15f;
        float s3=11.10f;

        if (s2>=s){
            if (s2<=s1){
                if(s3>=s2){
                    System.out.println("High Level");
                }
            }else {
                System.out.println("Medium Level");
            }

        }else{
            System.out.println("low Level");
        }
    }
}*/

//
//
//public class ControlflowStatements {
//    public static void main(String[] args) {
//
//        int a = 75;
//
//        if (a >= 35) {
//            if (a <= 60) {
//                if (a >= 75) {
//                    System.out.println("Distinction");
//                } else {
//                    System.out.println("First Class");
//                }
//            } else {
//                System.out.println("Second Class");
//            }
//        } else {
//            System.out.println("Fail");
//        }
//    }
//}


//
//public class ControlflowStatements {
//    public static void main(String[] args) {
//        int a = 1700;
//        if (a > 200) {
//            System.out.println("A is smaller");
//        }
//        if (a < 500) {
//            System.out.println("A is bigger");
//        }
//        if (a < 1200) {
//            System.out.println("1200 is bigger");
//        }
//        if (a > 1400) {
//            System.out.println("1400 is smaller than A");
//        }
//    }
//}


//public class ControlflowStatements {
//    public static void main(String ... args) {
//        int a = 32;
//        int a1 = 2;
//        if (a % 2 == 0) {
//            System.out.println("Even Numbers");
//        }
//        if (a1 % 2 != 0) {
//            System.out.println("Odd Numbers");
//        }
//        if (a % 2 == 0) {
//            System.out.println("whole Numbers");
//        }
//    }
//}

//
//public class ControlflowStatements {
//    public static void main(String[] args){
//
//    }
//}

//
//public class ControlflowStatements {
//    public static void main(String[] args){
//        int score=76;
//        if (score<75){
//            System.out.println("Loose");
//        }if (score==75){
//            System.out.println("TIE");
//        } if (score>75){
//            System.out.println("win");
//        }
//    }
//}


/// Start to Practice Switch cases//

//public class ControlflowStatements {
//    public static void main(String[] args) {
//        int a = 1;
//
//        int b = 10;
//
/// /        System.out.println("B value is :" + b);
//
//        switch (a) {
//            case 0:
//                System.out.println("One");
//                b = 10;
//                break;
//
//            case 1: {
//                System.out.println("Two");
//                System.out.println("Two");
//                System.out.println("Three");
//                if (b == 10) {
//                    b = 100;
//
//                } else if (b > 100) {
//                    b = 200;
//                }
//            }
//            break;
//
//            case 2:
//                System.out.println("Twenty");
//                b = 30;
//                break;
//
//            default:
//                System.out.println("UNKNOWN");
//
//        }
//
//        System.out.println("Sample");
//        System.out.println("B value is :" + b);
//
//    }
//}


/// /        int a = 1;
/// /        int b = 1;
/// /        int c = 1;
/// /        switch (a) {
/// /            case 1:
/// /                if (a > b){
/// /                    System.out.println("A is bigger than B");
/// /        }else if (a < b) {
/// /                System.out.println("A is smaller than B");
/// /            } else if (a == b) {
/// /                System.out.println("A is equal to B");
/// /            } else {
/// /                System.out.println("No Output");
/// /            }
/// /        }
/// /
/// /
//    }
//}

//
//public class ControlflowStatements {
//    public static void main(String... args) {
//        int day = 5;
//
//        switch (day) {
//            case 0: {
//                System.out.println("Monday");
//                break;
//            }
//            case 1: {
//                System.out.println("Tuesday");
//                break;
//            }
//            case 3: {
//                System.out.println("Wednesday");
//                break;
//            }
//            case 4: {
//                System.out.println("Thursday");
//                break;
//            }
//            case 5: {
//                System.out.println("Friday");
//                break;
//            }
//            case 6: {
//                System.out.println("Saturday");
//                break;
//            }
//            case 7: {
//                System.out.println("Sunday");
//                break;
//            }
//            default: {
//                System.out.println("Unknown");
//
//            }
//
//        }
//    }
//}

//public class ControlflowStatements {
//    public static void main(String... args) {
//        float employee = 1.3f;
//        float employee1 = 2.5f;
//        switch (employee1) {
//
//
//
//
//        }
//
//    }
//}

//public class ControlflowStatements {
//    public static void main(String... args) {
//        char ch = 'c';
//        switch (ch) {
//            case 'a': {
//                System.out.println("vowels");
//                break;
//            }
//            case 'b': {
//                System.out.println("consonant");
//                break;
//            }
//            case 'c': {
//                System.out.println("consonant");
//                System.out.println("vowels");
//                break;
//            }
//            case 'd': {
//                System.out.println("Consonant");
//                break;
//            }
//            case 'e': {
//                System.out.println("Vowels");
//                break;
//            }
//            default: {
//                System.out.println("UNKNOWN");
//            }
//
//        }
//    }
//}
//
//public class ControlflowStatements {
//    public static void main(String ... args){
//          int num =10;
//          switch(num){
//              case 10: System.out.println("10");
//              case 20: System.out.println("20");
//              default: System.out.println("Unknown");
//        }
//    }
//}

//public class ControlflowStatements {
//    public static void main(String... args) {
//        String levelstring = "Expert";
//        int level = 0;
//        switch (levelstring) {
//            case "beginner":
//                level = 0;
//                break;
//            case "Intermediate":
//                level = 1;
//                break;
//            case "Expert":
//                level = 2;
//                break;
//
//        }
//        System.out.println("Your level is:"+level);
//    }
//
//}


//public class ControlflowStatements {
//    public static void main(String... args) {
//        long l = 1234L;
//        String name = "sekhar";
//        switch (name) {
//            case "syam":
//                l = 124L;
//                break;
//            case "sekhar":
//                l = 1234L;
//                break;
//
//        }
//        System.out.println("Sekhar roll number : " +l);
//
//    }
//
//}

/*public class ControlflowStatements {
    public static void main(String[] args) {

        double num = 12.4;
//        float f1=12.4f;
        String s = String.valueOf(num);
//        String s=String.valueOf(f1);

        switch (s) {
            case "2.5": {
                System.out.println("Two point five");
                break;
            }
            case "12.4": {
                System.out.println("Three point five");
                break;
            }
            default: {
                System.out.

                        println("Other value");
            }
        }
    }
}*/

//
//import java.util.Scanner;
//
//public class ControlflowStatements {
//    public static void main(String[] args) {
//        System.out.println("Enter only 1 to 3:");
//        String lift = new Scanner(System.in).next();
//        switch (lift) {
//            case "G":
//                System.out.println("You Reached ground floor");
//                break;
//            case "1":
//                System.out.println("You reached first floor");
//                break;
//            case "2":
//                System.out.println("You reached second floor");
//                break;
//            case "3":
//                System.out.println("You reached third floor");
//                break;
//            default:
//                System.out.println("unknown");
//
//                System.out.println("Enter a number (1 to 5");
//
//        }
//    }
//}


















