package org.example;

import java.util.*;
import java.util.function.BiFunction;

//
//class Logs{
//    static void print(String s){
//    }
//}
//
//public class SampleMethodReference {
//    public static void main(String[] args){
//
//        Logs.print("sekhar");
//        List<String> list=new ArrayList<>();
//        list.add("smart");
//        list.forEach(s -> System.out.println(s));
//        list.add(("Rock"));
//        list.forEach(System.out::println);
//
//
//
//
//
//
//
//    }
//}
//

//
//class Geeks {
//    public static void print(String s) {
//        System.out.println(s);
//    }
//}
//
//public class SampleMethodReference {
//    public static void main(String[] args) {
//        String[] names = {
//
//                "Sekhar", "Nag", "Syam", "Bhanu"
//        };
//        List<String> s = new ArrayList<>();
//        s.add("sekhar");
//        s.add("nag");
//
//        s.forEach(System.out::println);
//        System.out.println("----------------------------");
//        s.forEach(s1 -> System.out.println(s1));
//        s.forEach(Geeks::print);
//
//
//    }///////////////ClassName:: Static MethodName
//}

//
//class mathutil {
//    static void square(int n) {
//        System.out.println(n * n);
//    }
//}
//
//public class SampleMethodReference {
//    public static void main(String[] args) {
//        List<Integer> l = Arrays.asList(2, 3, 5);
//
////        l.forEach(s -> System.out::println(square));
//        l.forEach(mathutil::square);
//
//    }
//}/// // Classname::static MethodName

//
//class Example {
//     void test(int age, String name) {
//        System.out.println(age);
//        System.out.println(name);
//         System.out.println("--------------");
//    }
//}
//
//public class SampleMethodReference {
//    public static void main(String[] args) {
//        Example e = new Example();
//        Map<Integer, String> m = new HashMap<>();
//        m.put(22, "sekhar");
//        m.put(23, "nag");
//        m.forEach(e::test);
//        m.forEach((integer, s) -> System.out.println(s));
//
//
//    }
//}













