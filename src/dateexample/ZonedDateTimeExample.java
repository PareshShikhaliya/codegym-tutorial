package dateexample;

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        // Create a ZonedDateTime for March 4, 2023 at 12:30:00 PM in New York
        ZonedDateTime nyDateTime = ZonedDateTime.of(2023, 3, 4, 12, 30, 0, 0, ZoneId.of("America/New_York"));

        // Print the ZonedDateTime in ISO-8601 format
        System.out.println("New York date/time: " + nyDateTime);

        // Create a ZonedDateTime for the same date/time in Los Angeles
        ZonedDateTime laDateTime = nyDateTime.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));

        // Print the Los Angeles date/time in ISO-8601 format
        System.out.println("Los Angeles date/time: " + laDateTime);
    }
}
