package org.example;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

//public class LocalTimeExample {
//    public static void main(String[] args) {
//        LocalTime localTime=LocalTime.now();
//        System.out.println(localTime);
//        LocalTime localTime1=LocalTime.MIDNIGHT;
//        System.out.println(localTime1);
//
//        System.out.println("------------");
//
//
//        LocalTime start = LocalTime.MIN;
//        LocalTime end = LocalTime.MAX;
//
////        LocalTime now = LocalTime.now();
//
////        if (now.isAfter(start) && now.isBefore(end)) {
////            System.out.println("System is active today");
////        }
//
////        LocalTime now = LocalTime.now();
////
////        if (now.equals(LocalTime.NOON)) {
////            System.out.println("Lunch time!");
////        }
//    }
//}



//public class LocalTimeExample {
//    public static void main(String[] args) {
//
//        LocalTime localTime = LocalTime.now();
//        System.out.println(localTime);/////localtime example:now()
//
//        LocalTime localTime1=LocalTime.of(13,30,21,21);
//        System.out.println(localTime1);/////example of localtime:of()
//
//       try {
//           LocalTime localTime2 = LocalTime.parse("15:30:42");
//
//           System.out.println(localTime2);
//       } catch (Exception e) {
//           System.out.println(e);
//       }//////example of localtime:parse()
//
//    }
//}

//public class LocalTimeExample {
//    public static void main(String[] args) {
//       LocalTime localTime=LocalTime.now();
//        System.out.println(localTime);
//        LocalTime localTime1=localTime.minusHours(3);
//        LocalTime localTime2=localTime1.minusMinutes(47);
//        LocalTime localTime3=localTime2.minusSeconds(21);
//        System.out.println(localTime3);
//    }//////Localtime MinusHours() & MinusMinutes////
//}

//public class LocalTimeExample {
//    public static void main(String[] args) {
//        LocalTime localTime=LocalTime.now();
//        System.out.println(localTime);
//        System.out.println("-------");
//        LocalTime localTime1=localTime.plusHours(2);
//        System.out.println(localTime1);
//        System.out.println("-------");
//        LocalTime localTime2=localTime1.plusMinutes(30);
//        System.out.println(localTime2);
//    }////Example :plusHours() and plusMinutes()
//}

//public class LocalTimeExample {
//    public static void main(String[] args) {
//        LocalTime localTime=LocalTime.now();
//        int localTime2=localTime.getHour();
//        int localTime3=localTime.getMinute();
//        System.out.println(localTime2);
//        System.out.println("LocalTimeMins:"+localTime3);
//
//    }
//}
//
//public class LocalTimeExample {
//    public static void main(String[] args){
//        ZoneId zone1=ZoneId.of("Asia/Kolkata");
//        ZoneId zone2=ZoneId.of("Asia/Tokyo");
//
//        LocalTime localTime=LocalTime.now(zone1);
//        System.out.println("India time:"+localTime);
//
//        LocalTime localTime1=LocalTime.now(zone2);
//        System.out.println("Japan Time:"+localTime1);
//
//        long hrs=ChronoUnit.HOURS.between(localTime,localTime1);
//        System.out.println("HRS between Two Zones:"+hrs);
//
//        long mins=ChronoUnit.MINUTES.between(localTime,localTime1);
//        System.out.println("Mins between Two Zones:"+mins);
//
//
//    }//////Zoneid using chronounit between two zones//////
//}













































