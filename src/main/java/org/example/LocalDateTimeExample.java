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

//        import java.time.LocalDate;
//import java.time.LocalTime;
//import java.time.LocalDateTime;
//import java.time.Duration;
//import java.time.Period;

        class Trip {
            String driverName;
            LocalDate tripDate;
            LocalTime startTime;
            LocalTime endTime;
            LocalDateTime bookingDateTime;

            // Constructor
            Trip(String driverName, LocalDate tripDate, LocalTime startTime, LocalTime endTime) {
                this.driverName = driverName;
                this.tripDate = tripDate;
                this.startTime = startTime;
                this.endTime = endTime;
                this.bookingDateTime = LocalDateTime.now();
            }

            // Calculate trip duration
            void calculateDuration() {
                Duration duration = Duration.between(startTime, endTime);
                System.out.println("Trip Duration: " + duration.toHours() + " hours "
                        + (duration.toMinutes() % 60) + " minutes");
            }

            // Check if trip is today
            void isTodayTrip() {
                if (tripDate.equals(LocalDate.now())) {
                    System.out.println("Trip is scheduled for TODAY");
                } else {
                    System.out.println("Trip is NOT today");
                }
            }

            // Check if trip is in future
            void isFutureTrip() {
                if (tripDate.isAfter(LocalDate.now())) {
                    System.out.println("Trip is in FUTURE");
                } else {
                    System.out.println("Trip is NOT in future");
                }
            }

            // Days remaining for trip
            void daysLeft() {
                Period period = Period.between(LocalDate.now(), tripDate);
                System.out.println("Days left for trip: " + period.getDays());
            }

            // Display full details
            void displayTrip() {
                System.out.println("\n===== Trip Details =====");
                System.out.println("Driver: " + driverName);
                System.out.println("Trip Date: " + tripDate);
                System.out.println("Start Time: " + startTime);
                System.out.println("End Time: " + endTime);
                System.out.println("Booking Time: " + bookingDateTime);
            }
        }


                // Create Trip Object
                Trip trip1 = new Trip(
                        "Ravi",
                        LocalDate.of(2026, 4, 2),
                        LocalTime.of(9, 30),
                        LocalTime.of(14, 45)
                );

                // Display details
                trip1.displayTrip();

                // Perform operations
                trip1.calculateDuration();
                trip1.isTodayTrip();
                trip1.isFutureTrip();
                trip1.daysLeft();
            }
        }

























