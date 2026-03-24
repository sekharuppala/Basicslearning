package org.example;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;


//public class LocalDateExample {
//    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println(date);/////Prints date month time IST year
//
//        long mills=date.getTime();
//        System.out.println(mills); /////prints here milliseconds /////
//
//        SimpleDateFormat sdf = new SimpleDateFormat();
//        String formattedDate = sdf.format(date);
//        System.out.println(formattedDate);
//
//
//    } ////// Legacy in date and time /////
//
//}

//
//public class LocalDateExample {
//    public static void main(String[] args) {
//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);
//
//        LocalTime localTime=LocalTime.now();
//        System.out.println(localTime);

//        LocalDateTime localDateTime=LocalDateTime.now();
//        int totalDays = localDateTime.toLocalDate().lengthOfMonth();
//        System.out.print(localDateTime);
//        System.out.println("LocalDateTime now: " + localDateTime);
//        System.out.println("Day: " + localDateTime.getDayOfMonth());
//        System.out.println("DaysOfMonth: "+totalDays);
//        System.out.println("Month: " + localDateTime.getMonth());
//        System.out.println("Year: " + localDateTime.getYear());
//        System.out.println("Hour: " + localDateTime.getHour());
//        System.out.println("Minute: " + localDateTime.getMinute());
//        System.out.println("Second: " + localDateTime.getSecond());


//
//        LocalDateTime localDateTime=LocalDateTime.of(2026,3,3,10,30);
//        System.out.println(localDateTime);
//
//    }
//}

//public class LocalDateExample {
//    public static void main(String[] args) {
//        LocalDate localDate=LocalDate.now();
//        System.out.println("Current Date: "+localDate);////using now() create objects ///
//
//        String s = "2026-03-24";
//        LocalDate localDate1 =LocalDate.parse(s);
//        System.out.println(localDate1);//// using parsing() method create objects///

//        int day=4;
//        int month=3;
//        int year=2026;
//
//        LocalDate localDate=LocalDate.of(year,month,day);
//        System.out.println(localDate);
//
//        int day=4;
//        int year=2026;
//        String month = "March";
//        Month m = Month.valueOf(month.toUpperCase());
//        LocalDate localDate = LocalDate.of(year, m, day);
//        System.out.println(localDate); ////Using directly year day month for the of() Method///



//
//    }
//}



//public class LocalDateExample {
//    public static void main(String[] args) {
//        LocalDate localDate=LocalDate.now();
//        LocalDate yestarday= localDate.minusDays(1);
//        LocalDate tommorow=localDate.plusDays(2);
//        System.out.println("Today:"+localDate);
//        System.out.println("Yestarday:"+yestarday);
//        System.out.println("Tommorow:"+tommorow);
//
//
// } Demonstrate methods of LocalDate class such as now(), minusDays(), plusDays().
//}

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.of(2026,03,24);
        System.out.println(localDate.isLeapYear());
        LocalDate localDate1=LocalDate.of(2024,1,1);
        System.out.println(localDate1.isLeapYear());
    }
}

































































