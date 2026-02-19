package org.example;
//import java.util.*;
//public class LinkedListExample {
//    public static void main(String[] args) {
//        LinkedList<String>s=new LinkedList<String>();
//        s.add("Butterscotch");
//        s.addFirst("Choclate");
//        s.addLast("Vennela");
//        s.add(4,"Ismart Sankar");
//        s.remove();
//        System.out.println(s);
//    }
//
//}
import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList();
        list.add("A");
        list.add("B");

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
