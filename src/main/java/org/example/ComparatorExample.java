package org.example;
import java.util.*;


//
//
//class Student{
//    int age;
//    String name;
//    String section;
//
//
//    Student(int age,String name, String section){
//        this.age=age;
//        this.name=name;
//        this.section=section;
//    }
//}
//
//class StudentComparator implements Comparator<Student>{
//    public int compare(Student s1,Student s2){
////        return s1.name.compareTo(s2.name);
////        return s2.name.compareTo(s1.name);
////        return s1.age - s2.age;
//        return s2.age- s1.age;
//    }
//
//
//
//}
//
//public class ComparatorExample {
//    public static void main(String[] args) {
//        List<Student> sc=new ArrayList<>();
//        sc.add(new Student(1,"sekhar","A"));
//        sc.add(new Student(234,"sd","s"));
//        sc.add(new Student(12,"de","o"));
//        Collections.sort(sc, new StudentComparator());
//        for (Student t:sc){
////            System.out.println(t.name);
////            System.out.println(t.age);
//            System.out.println(t.age+" "+t.name+" "+t.section);
//            System.out.println("--------");
//
//        }
//
//
//    }
//}

class Student{
    int id;
    String name;
    String department;
    int cgpa;
    int age;
    Student(int  id, String department, int cgpa,int age){
        this.id=id;

    }
}

































