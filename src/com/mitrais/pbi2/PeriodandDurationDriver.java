package com.mitrais.pbi2;

import java.time.*;

public class PeriodandDurationDriver {
    public void checkingPeriod()
    {
        LocalDate date1 = LocalDate.now();

        LocalDate date2 =
                LocalDate.of(1996, Month.APRIL, 17);

        System.out.println("Date 1: " + date1);
        System.out.println("Date 2: " + date2);
        Period gap = Period.between(date2, date1);
        System.out.println("gap between dates "+
                "is a period of "+gap);

    }

    // Function to check duration
    public void checkingDuration()
    {
        LocalDateTime date2 =
                LocalDateTime.of(1996, Month.APRIL, 17,0,0);
        LocalDateTime time1 = LocalDateTime.now();
        System.out.println("the current time is " +
                time1);


        // adding five hours to the current
        // time and storing it in time2
       Duration gap=Duration.between(date2,time1) ;

        System.out.println(gap.toString());
    }

    // Driver code
}
