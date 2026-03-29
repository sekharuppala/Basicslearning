package org.example;

import java.time.*;
import java.time.format.DateTimeFormatter;

//public class LocalDateTimeExample {
//    public static void main(String[] args) {
//        LocalDateTime localDateTime=LocalDateTime.now();
//        int totaldays=localDateTime.toLocalDate().lengthOfMonth();
//        int totalyear=localDateTime.toLocalDate().lengthOfYear();
//        System.out.println(totalyear);
//        System.out.println(totaldays);
//        System.out.println(localDateTime);
//        System.out.println("Day:"+localDateTime.getDayOfMonth());
//        System.out.println("Week:"+localDateTime.getDayOfWeek());
//        System.out.println("Month:"+localDateTime.getMonth());

/// ///Using time API////
//        System.out.println("Hour:"+localDateTime.getHour());
//        System.out.println("Minute:"+localDateTime.getMinute());
//        System.out.println("Second:"+localDateTime.getSecond());
//        System.out.println("Nano:"+localDateTime.getNano());
//    }
//}

//public class LocalDateTimeExample {
//    public static void main(String[] args) {
//        LocalDate localDate=LocalDate.parse("2026-03-24");
//        System.out.println(localDate);
//
//        LocalDateTime localDateTime=LocalDateTime.parse("2026-03-24t10:30");
//        System.out.println(localDateTime);
//    }/////LocalDateTime using parse method///
//}


//public class LocalDateTimeExample {
//    public static void main(String[] args) {
//        LocalDateTime localDateTime=LocalDateTime.of(2026,3,23,5,30);
//        System.out.println(localDateTime);
//
//        LocalDate localDate=LocalDate.of(2026,03,04);
//        System.out.println(localDate);
//
//        LocalTime localTime= LocalTime.of(6,19,23);
//        System.out.println("Hours:"+localTime);
//
//    } //// LocalDatetime using OF method //////
//}


public class LocalDateTimeExample {
    public static void main(String[] args) {
//        LocalDateTime localDateTime=LocalDateTime.of(2026, Month.MARCH,25,10,30);
//        System.out.println(localDateTime.plusDays(5));////Specific date time Example////

//        LocalDateTime localDateTime = LocalDateTime.of(2024, Month.MARCH, 25, 7, 10);
//        System.out.println("original date&time:" + localDateTime);


        /// /Set specific fields/////

//        LocalDateTime localDateTime1 = localDateTime
//                .withYear(2026)
//                .withMonth(03)
//                .withHour(7)
//                .withMinute(30);
//        System.out.println(localDateTime1);


            /// ///FormattinglocalDatetime Examples////////

//        LocalDateTime localDateTime=LocalDateTime.now();
//        System.out.println("OriginalDate&time: "+localDateTime);
//
//        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
//        String formattedDateTime=localDateTime.format(dateTimeFormatter);
//        System.out.println(formattedDateTime);
//        System.out.println("----------");




         ////formating localdate example////
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);
        DateTimeFormatter dateTimeFormatter1=DateTimeFormatter.ofPattern("E,dd-MM-yyyy");
        String formattedDate = localDate.format(dateTimeFormatter1);
        System.out.println(formattedDate);


//        LocalDate localDate=LocalDate.now();



    }
}





















