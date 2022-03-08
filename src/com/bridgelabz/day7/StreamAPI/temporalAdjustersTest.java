package com.bridgelabz.day7.StreamAPI;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class temporalAdjustersTest
{
    public static void main(String[] args) {
        LocalDateTime todayDate =  LocalDateTime.now();
        System.out.println(todayDate);//2022-03-08 T14:58:00.564
        LocalDateTime lastDayOfYear = todayDate.with(TemporalAdjusters.lastDayOfYear());
        System.out.println(lastDayOfYear);//2022-12-31 T15:05:20.076
        LocalDateTime firstDayOfMonth = todayDate.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(firstDayOfMonth);//2022-03-01 T15:07:16.946
        LocalDateTime nextDayOfWeek = todayDate.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println(nextDayOfWeek);//2022-03-12 T15:11:49.516
        LocalDateTime DayOfWeekFriday = todayDate.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(DayOfWeekFriday);//2022-03-11 T16:12:20.403
        LocalDateTime lastDayOfMonth = todayDate.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(lastDayOfMonth);//2022-03-31 T16:16:26.498

    }
}
