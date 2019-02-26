package com.mitrais.pbi2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterDriver {
    // Function to check date and time
    // according to our requirement
    public void checkingAdjusters()
    {

        LocalDate date = LocalDate.of(1996,4,17);
        System.out.println("the current date is "+
                date);

        // to get the first day of next month
        LocalDate dayOfNextMonth =
                date.with(TemporalAdjusters.
                        firstDayOfNextMonth());

        System.out.println("firstDayOfNextMonth : " +
                dayOfNextMonth );

        // get the next saturday
        LocalDate nextSaturday =
                date.with(TemporalAdjusters.
                        next(DayOfWeek.SATURDAY));

        System.out.println("next saturday from now is "+
                nextSaturday);

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
