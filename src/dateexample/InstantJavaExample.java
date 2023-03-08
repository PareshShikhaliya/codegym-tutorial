package dateexample;

import java.time.Duration;
import java.time.Instant;
/*
The Date Time API added the Instant class to work with time that is targeted
at processes within computers. Instead of hours, minutes, and seconds, it
operates with seconds,
 milliseconds, and nanoseconds.
 */
public class InstantJavaExample {
    public static void main(String args[])
    {
        Instant now = Instant.now();

        // Add 1 day to the instant
        Instant tomorrow = now.plus(Duration.ofDays(1));

        // Subtract 1 hour from the instant
        Instant anHourAgo = now.minus(Duration.ofHours(1));

        // Print the instants in ISO-8601 format
        System.out.println("Now: " + now);
        System.out.println("Tomorrow: " + tomorrow);
        System.out.println("An hour ago: " + anHourAgo);



        Instant instant = Instant.parse("2023-03-04T12:30:45.123456Z");

        // Print the instant in ISO-8601 format
        System.out.println("Instant: " + instant);


    }
}
