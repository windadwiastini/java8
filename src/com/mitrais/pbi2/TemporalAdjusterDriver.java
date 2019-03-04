package com.mitrais.pbi2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterDriver {
    // Function to check date and time
    // according to our requirement
    public void checkingAdjusters()
    {

        LocalDate date = LocalDate.of(2000,1,1);
        System.out.println("the current date is "+
                date);

        // to get the first day of next month
        LocalDate dayOfNextMonth =
                date.with(TemporalAdjusters.
                        firstDayOfNextMonth());

        System.out.println("firstDayOfNextMonth : " +
                dayOfNextMonth );

        // get the next monday
        LocalDate nextMonday =
                date.with(TemporalAdjusters.
                        next(DayOfWeek.MONDAY));

        System.out.println("next monday from now is "+
                nextMonday);

        // first day of current month
        LocalDate firstDay =
                date.with(TemporalAdjusters.
                        firstDayOfMonth());

        System.out.println("firstDayOfMonth : " +
                firstDay);

        // last day of current month
        LocalDate lastDay =
                date.with(TemporalAdjusters.
                        lastDayOfMonth());

        System.out.println("lastDayOfMonth : " +
                lastDay);
    }
    // Driver code
}
