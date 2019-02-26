package com.mitrais.pbi2;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDriver {
    public void ZonedTimeAndDate()
    {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter format1 =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedCurrentDate = date.format(format1);

        System.out.println("formatted current Date and"+
                " Time : "+formattedCurrentDate);

        // to get the current zone
        ZonedDateTime currentZone = ZonedDateTime.now();
        System.out.println("the current zone is "+
                currentZone.getZone());

        // getting time zone of specific place
        // we use withZoneSameInstant(): it is
        // used to return a copy of this date-time
        // with a different time-zone,
        // retaining the instant.
    ZoneId tokyo = ZoneId.of("NZ");

        ZonedDateTime tokyoZone =
                currentZone.withZoneSameInstant(tokyo);

        System.out.println("New Zealand time zone is " +
                tokyoZone);

        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formatedDateTime = tokyoZone.format(format);

        System.out.println("Formatted New Zealand timezone is "+
                formatedDateTime);
    }
}
