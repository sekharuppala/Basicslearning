package org.example;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Supplier;

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
//    }   ///////Object Reference:: instanceMethodName
//}

//
//class Printer{
//    void print(String s){
//        System.out.println(s);
//        System.out.println("------------");
//    }
//}
//
//public class SampleMethodReference {
//    public static void main(String[] args) {
//        Printer p=new Printer();
//        List<String> l=Arrays.asList("23","1237","738");
//        l.forEach(p::print);
//        l.forEach(n -> System.out.println(n));
//    } ///////////////Object Reference::InstanceMethod
//}


//public class SampleMethodReference {
//    public static void main(String[] args) {
//        List<String> l=Arrays.asList("sekhar","Nag","Syam","Bhanu");
//        l.stream()
//                .map(String::toUpperCase)
//                .forEach(System.out::println);
//    } /////////ClassName::instanceMethod//////////
//}    /////// Note: method reference works only one parameter
//
//public class SampleMethodReference {
//    public static void main(String[] args) {
//        Map<String,Integer> m= new HashMap<>();
//        m.put("sekhar",25);
//        m.put("NAG",25);
//        m.put("Syam",25);
////        m.foEach(System.out.println(m));
//        m.forEach((key, value) -> System.out.println(key + " = " + value));
//    }
//}



//class Student{
//    Student(){
//        System.out.println("Student Object is Created");
//    }
//}
//public class SampleMethodReference {
//    public static void main(String ... args){
//        Student s=new Student();
//
//    }
//}

//
//class Sekhar{
//    int age=21;
//    String name="pandu";
//    Sekhar(){
////
//        System.out.println("Student object is created");
//        System.out.println(name);
//        System.out.println(age);
//    }
//
//
//}
//public class SampleMethodReference {
//    public static void main(String[] args) {
//        Supplier<Sekhar> supplier= Sekhar::new;
////        Supplier<Sekhar> supplier= () -> new Sekhar();
//        supplier.get();
//
//    }  ////Class Name :: new/////
//}




















