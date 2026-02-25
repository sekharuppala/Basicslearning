package org.example;


//import java.util.ArrayList;

import java.time.LocalDate;
import java.util.*;
//import java.util.Collections;
//import java.util.List;

/*class Student implements Comparable<Student> {
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student st) {
        if (rollno == st.rollno)
            return 0;
         else if (rollno < st.rollno)
            return -1;
         else
            return 1;


    }

//    @Override
//    public String toString() {
//        return rollno + " " + name + " " + age;
//    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> s = new ArrayList<>();
        s.add(new Student(1, "sekhar", 24));
        s.add(new Student(2, "Nagarjuna", 21));
        s.add(new Student(3, "arjun", 23));
        s.add(new Student(4, "bhanu", 20));
        Collections.sort(s);
        for (Student a : s) {
            System.out.println("Student Rollno "+a.rollno+" age "+a.age);
            System.out.println(a.rollno + " " + a.name + " " + a.age);

        }

    }
}*/


//
//class Employee implements Comparable<Employee> {
//    int id;
//    String name;
//    int DOB;
/// /    String DOB;
/// /    LocalDate DOB;
//
//    Employee(int id, String name, int DOB) {
//        this.id = id;
//        this.name = name;
//        this.DOB = DOB;
//    }
//
//    public int compareTo(Employee e) {
/// /        if(this.DOB.compareTo(e.DOB)==0)
/// /            return 0;
/// /        else if(this.DOB.compareTo(e.DOB)>0)
/// /            return 1;
/// /        else return -1;// Compare String Conditions
//
//
//
//
//        if (DOB == e.DOB)
//            return 0;
//        else if (DOB > e.DOB)
//            return 1;
//        else return -1; // Compare int conditions
//
//    }
//}
//
//
//    public class ComparableExample {
//        public static void main(String[] args) {
//            List<Employee> e = new ArrayList<>();
//            e.add(new Employee(1, "Sekhar", 1999));
//            e.add(new Employee(3, "nag", 2433));
//            e.add(new Employee(0, "bhanu", 23));
//            e.add(new Employee(1, "arref", 2333));
//            Collections.sort(e);

////            Collection<Integer>(e);
//            for (Employee s : e) {
//                System.out.println(s.DOB);
//
//            }
//            System.out.println("_________");
//
//            for(Employee s1:e){
//                System.out.println(s1.id+" " +s1.name+" " +s1.DOB);
//            }
//        }
//    }


//class Student implements Comparable<Student> {
//    int rollno;
//    String name;
//    String Section;
//
//    Student(int rollno, String name, String Section) {
//        this.rollno = rollno;
//        this.name = name;
//        this.Section = Section;
//
//    }
//
//    public int compareTo(Student s) {
//        if(this.Section.compareTo(s.Section)==0)
//            return 0;
//        else if(this.Section.compareTo(s.Section)>1)
//            return 1;
//        else return -1;
//        if(this.name.compareTo(s.name)==0)
//            return 0;
//        else if(this.name.compareTo(s.name)>1)
//            return 1;
//        else return 1;
//        if (rollno == s.rollno)
//            return 0;
//        else if (rollno > s.rollno)
//            return 1;
//        else return -1;
//        return this.name.compareTo(s.name);
//        return this.rollno - s.rollno;
//
//        return this.Section.compareTo(s.Section);
//
//
//    }
//
//
//}
//
//public class ComparableExample {
//    public static void main(String[] args) {
//        List<Student> s = new ArrayList<>();
//        s.add(new Student(1, "Hafeez", "A"));
//        s.add(new Student(4, "Bhanu", "c"));
//        s.add(new Student(32, "Syam", "d"));
//        Collections.sort(s);
//        for (Student e : s) {
//            System.out.println(e.rollno + " " + e.name + " " + e.Section);
//            System.out.println(e.name);
//            System.out.println(e.Section);
//        }
//
//    }
//}

//
//class Employee implements Comparable<Employee> {
//    String name;
//    String bloodgroup;
//    int age;
//    int id;
//
//    Employee(int id, int age, String name, String bloodgroup) {
//        this.id = id;
//        this.age = age;
//        this.name = name;
//        this.bloodgroup = bloodgroup;
//
//    }
//
//    public int compareTo(Employee ee) {
//        return this.bloodgroup.compareTo(ee.bloodgroup);
//        return ee.bloodgroup.compareTo(this.bloodgroup);
//        return ee.name.compareTo(this.name);
//        return this.name.compareTo(ee.name);
//        return this.age - ee.age;
//        return ee.age-this.age;
//
//
//        return this.name.compareTo(ee.name);//String using Descending Order(Big-small)//
//        retrun ee.name.compareTo(this.name); //String using Ascending Order(Small-Big)//
//        return this.age - ee.age;// Integer using Ascending Order(Small - Big)//
//        return ee.age - this.age;// Integer usin Descending Order(Big - Small)//
//    }
//
//}
//
//public class ComparableExample {
//    public static void main(String[] args) {
//        List<Employee> e = new ArrayList<>();
//        e.add(new Employee(2, 21, "sekhar", "A+"));
//        e.add(new Employee(32, 23, "nag", "b+"));
//        e.add(new Employee(12, 324, "banu", "c+"));
//        e.add(new Employee(0,00,"Syam","O+"));
//        Collections.sort(e);
//        for(Employee d:e){
//            System.out.println(d.name+" "+d.bloodgroup);
//            System.out.println(d.bloodgroup);
//            System.out.println(d.name);
//            System.out.println(d.id+" "+d.age+" "+d.name+" "+d.bloodgroup);
//
//
//            System.out.println(d.age);
//            System.out.println(d.name);
//        }
//
//
//    }
//}






