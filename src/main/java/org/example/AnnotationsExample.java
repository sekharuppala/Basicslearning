package org.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.annotation.*;
//
//enum MyAnnotationType{
//    TA,TB,TC,TD,NONE
//}
//
//class A{
//    @myAnnotation("Sample A"){
//        void text(){
//            System.out.println("My Annotation Text");
//        }
//    }
//        }
//
//public class AnnotationsExample{
//    public Static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
//        Object o =new A();
//        Class<?> c=o.getClass();
//        for(Method m:c.getDeclaredMethods()){
//            if(m.isAnnotationPresent(MyAnnotation.class()){
//                MyAnnotation ma=m.getAnnotation(myAnnotation.class);
//                String t1=ma.text();
//                System.out.println(t1);
//                System.out.println(ma.textA());
//                m.invoke(o);
//            }
//        }
//
//    }
//}



//
//
//@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.METHOD)
//@interface MyAnnotation {
//    String text() default "";
//    String textA() default "";
//}
//
//enum MyAnnotationType {
//    TA, TB, TC, TD, NONE
//}
//
//class A {
//    @MyAnnotation(text = "Sample A", textA = "Sample TextA")
//    public void text() {
//        System.out.println("My Annotation Text");
//    }
//}
//
//public class AnnotationsExample {
//    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
//        Object o = new A();
//        Class<?> c = o.getClass();
//        for (Method m : c.getDeclaredMethods()) {
//            if (m.isAnnotationPresent(MyAnnotation.class)) {
//                MyAnnotation ma = m.getAnnotation(MyAnnotation.class);
//                String t1 = ma.text();
//                System.out.println(t1);
//                System.out.println(ma.textA());
//                m.invoke(o);
//            }
//        }
//    }
//}
