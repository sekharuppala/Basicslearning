package org.example;


import java.io.IOException;
import java.sql.SQLOutput;
import java.lang.reflect.*;

//class ReflectionDemo {
////    void methdod(){
////        System.out.println("Mehod is overriding");
////    }
////
//}
//
//public class ReflectionDemo {
//    public static void main(String[] args){
//        try{
//            Class c=Class.forName("Simple");
//            System.out.println(c.getName());
//        }catch (Exception e){
//            System.out.println(e);
//        }
//
//
//    }
//}

//class SimpleA{
//    void myMethodA(){
//        System.out.println("Simple A-My method A");
//    }
//    int myMethodB(){
//        return 20;
//
//    }
//}
//
//public class ReflectionDemo {
//    public static void main(String[] args) {
//        Class c= Class.forName(String.valueOf(SimpleA.class));
//        System.out.println(c.getName());
//
//    }
//}


//
//public class ReflectionDemo {
//    public static void main(String[] args) throws IOException{
//
//        try {
//            // ✅ Get Class object using reflection
//            Class<?> c = Class.forName("SimpleA");
//
//            System.out.println("Class Name: " + c.getName());
//
//            // ✅ Get all declared methods
//            Method[] methods = c.getDeclaredMethods();
//            System.out.println("\nMethods in " + c.getSimpleName() + ":");
//            for (Method method : methods) {
//                System.out.println("  - " + method.getName() +
//                        " | Return Type: " + method.getReturnType().getName());
//            }
//
//            // ✅ Create an instance using reflection
//            Object obj = c.getDeclaredConstructor().newInstance();
//
//            // ✅ Invoke myMethodA() using reflection
//            Method methodA = c.getDeclaredMethod("myMethodA");
//            methodA.setAccessible(true); // because it's package-private
//            System.out.println("\nInvoking myMethodA():");
//            methodA.invoke(obj);
//
//            // ✅ Invoke myMethodB() and get return value
//            Method methodB = c.getDeclaredMethod("myMethodB");
//            methodB.setAccessible(true);
//            int result = (int) methodB.invoke(obj);
//            System.out.println("Return value of myMethodB(): " + result);
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}




//class SimpleA {
//    void myMethodA() {
//        System.out.println("Simple A - My method A");
//    }
//
//    int myMethodB() {
//        return 20;
//    }
//}
//
//public class ReflectionDemo {
//    public static void main(String[] args) throws Exception {
//
//        Class<?> c = SimpleA.class;
//
//        System.out.println("Class Name: " + c.getName());

//
//
//        Method[] methods = c.getDeclaredMethods();
//        System.out.println("\nMethods in " + c.getSimpleName() + ":");
//        for (Method method : methods) {
//            System.out.println("  - " + method.getName() +
//                    " | Return Type: " + method.getReturnType().getName());
//        }

//        Object obj = c.getDeclaredConstructor().newInstance();
//
//        Method methodA = c.getDeclaredMethod("myMethodA");
//        methodA.setAccessible(true);
//        System.out.println("\nInvoking myMethodA():");
//        methodA.invoke(obj);

//        Method methodB = c.getDeclaredMethod("myMethodB");
//        methodB.setAccessible(true);
//        int result = (int) methodB.invoke(obj);
//        System.out.println("Return value of myMethodB(): " + result);
//    }
//
//}

//            // ✅ Get all declared methods
//            Method[] methods = c.getDeclaredMethods();
//            System.out.println("\nMethods in " + c.getSimpleName() + ":");
//            for (Method method : methods) {
//                System.out.println("  - " + method.getName() +
//                        " | Return Type: " + method.getReturnType().getName());
//            }
//

class SimpleA {
    void myMethodA() {
        System.out.println("Simple A - My method A");
    }

    int myMethodB() {
        return 20;
    }
}

//class ReflecionDemo{
//    public static void main(String[] args) {
//        Class<?> c=SimpleA.class;
//        System.out.println(c.getName());
//        Method method=
//    }
//}





























