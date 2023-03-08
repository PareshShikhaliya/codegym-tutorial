package dateexample;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/*
In Java, LocalDate is a class in the java.time package that represents a date without a time zone.
 It is used to represent a date value such as year, month and day in the ISO calendar system,
  which is the Gregorian calendar system used by most of the world.

The LocalDate class provides methods for working with dates such as adding or subtracting days, months or years,
 finding the difference between dates,
 and checking if a date falls within a certain range.
 It also provides methods for formatting and parsing dates to and from strings.

LocalDate is an immutable class, which means that once a LocalDate object is created,
 its value cannot be changed. Instead, methods that modify a LocalDate object return a new object with the modified value.
 */

public class LocalDate1{
    public static void main(String args[])
    {
        today();
        specificDate();
        nextWeek();
        lastMonth();
        DateTimeFormatter();
       diffMethods();
    }

    private static void diffMethods() {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        LocalDate yesterday = today.minusDays(1);

        boolean isAfter = tomorrow.isAfter(today);
        boolean isBefore = yesterday.isBefore(today);
        boolean isEqual = today.isEqual(today);

        System.out.println(isAfter); // true
        System.out.println(isBefore); // true
        System.out.println(isEqual); // true
    }

    private static void DateTimeFormatter() {
        LocalDate date = LocalDate.of(2023, 3, 15);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = date.format(formatter);
        System.out.println(formattedDate);
    }


    private static void lastMonth() {
        LocalDate today = LocalDate.now();
        LocalDate lastMonth = today.minusMonths(1);
        System.out.println(lastMonth);
    }

    private static void nextWeek() {
        LocalDate today = LocalDate.now();
        LocalDate nextWeek = today.plusDays(7);
        System.out.println(nextWeek);
    }

    private static void specificDate() {
        LocalDate date = LocalDate.of(2023, 3, 15);
        System.out.println(date);
    }

    private static void today() {
        LocalDate today = LocalDate.now();
        System.out.println(today); // output: 2023-03-04
    }
}
