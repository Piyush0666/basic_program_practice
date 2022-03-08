package com.bridgelabz.day7.StreamAPI;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class localDate {
    public static void main(String[] args) {
        localDate obj = new localDate();
        obj.dateAndTimeMethod();
    }

    private void dateAndTimeMethod() {
        LocalDate currentTime = LocalDate.of(2022, Month.JANUARY, 31);//2022-09-13
        System.out.println("this is for LocalDate:: " + currentTime);
        currentTime = currentTime.plusDays(1);
        System.out.println(" when we increase 1 day:: " + currentTime);
        currentTime = currentTime.plusMonths(1);
        System.out.println("when we increase 1 month:: " + currentTime);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd ' hie there 'MMMM yyyy");
        System.out.println(currentTime.format(dateTimeFormatter));//01  hie there March 2022
        //DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MMMM.yyyy");
        //System.out.println(currentTime.format(dateTimeFormatter));//01.March.2022

//        //Time
//        LocalTime currentTime1 = LocalTime.of(14,38);//(hours,minute)//14:38
//        System.out.println("this is for LocalTime:: "+currentTime1);
//        currentTime1 = currentTime1.plusHours(1);
//        System.out.println("after adding 1 hour :: " + currentTime1);
//
//        //Date and Time
//        LocalDateTime localDateTime = LocalDateTime.now();//2022-03-08T12:50:58.971
//        LocalDateTime localDateTime1 = LocalDateTime.of(currentTime,currentTime1);//2022-09-13T14:38
//        System.out.println("this is for localDateTime:: " +localDateTime+" / " +localDateTime1);
//
//        //ZoneDateTime
//        /*for (String zone:ZoneId.getAvailableZoneIds()) {
//            System.out.println("zone::" +zone);
//        }//
//        */
//        ZonedDateTime zonedDateTime= ZonedDateTime.of(localDateTime1,ZoneId.of("Asia/Kolkata"));
//        System.out.println(zonedDateTime);

    }

}
