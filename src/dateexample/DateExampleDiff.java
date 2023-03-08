package dateexample;

import java.time.*;
import java.util.*;
/*
In Java, Date, LocalDate, Instant, and Calendar are all classes that represent dates and times,
but they differ in a few key ways:

Date: The Date class represents a date and time in the UTC time zone, with millisecond precision.
 It is a mutable class and its methods are not thread-safe. The Date class has been around since the
 early versions of Java, but it has been largely replaced by the newer date and time API introduced in Java 8.

LocalDate: The LocalDate class represents a date (year, month, and day) without a time zone, with day precision.
 It is an immutable class and its methods are thread-safe.
  It does not represent a specific instant in time,
   but can be combined with a LocalTime or ZoneOffset to create a ZonedDateTime.

Instant: The Instant class represents a specific instant in time,
with nanosecond precision.
 It is an immutable class and its methods are thread-safe.
  It is always in UTC time zone and can be converted to other time zones as needed.

Calendar: The Calendar class represents a date and time in a specific time zone, with millisecond precision. It is a mutable class and its methods are not thread-safe. It provides many methods for manipulating dates and times, but its API is complex and can be error-prone.
 */
public class DateExampleDiff {
    public static void main(String[] args) {
        // Create a Date object representing the current time
        Date date = new Date();

        // Create a LocalDate object representing today's date
        LocalDate localDate = LocalDate.now();

        // Create an Instant object representing the current time
        Instant instant = Instant.now();

        // Create a Calendar object representing the current time in the default time zone
        Calendar calendar = Calendar.getInstance();

        // Print the objects
        System.out.println("Date: " + date);
        System.out.println("LocalDate: " + localDate);
        System.out.println("Instant: " + instant);
        System.out.println("Calendar: " + calendar);
    }
}
