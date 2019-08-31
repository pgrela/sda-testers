package com.pgrela.sda.testers.introduction;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CurrentMonth {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate firstDay = today.withDayOfMonth(1);
        System.out.printf("%s %d\n", today.getMonth().name(), today.getYear());
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            System.out.printf("%s\t", dayOfWeek.name().substring(0, 2).toLowerCase());
        }
        System.out.println();
        for (int i = 1; i < firstDay.getDayOfWeek().getValue(); i++) {
            System.out.print("\t");
        }
        LocalDate currentDay = firstDay;
        while (currentDay.getMonth().equals(today.getMonth())) {
            if (currentDay.getDayOfMonth() != 1 && currentDay.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
                System.out.println();
            }
            System.out.print(currentDay.getDayOfMonth() + "\t");
            currentDay = currentDay.plusDays(1);
        }
        System.out.println();
    }
}
