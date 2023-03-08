package dateexample;

import java.util.Calendar;
import java.util.TimeZone;

/*
In Java, Calendar is an abstract class in the java.util package that represents a calendar, which is used to manipulate dates and times.
 It provides methods for working with dates, times, time zones, and fields such as year, month, day, hour, minute, and second.

The Calendar class is a bit more flexible than the Date class,
 as it allows you to perform more complex operations such as adding or subtracting days, weeks, months, or years from a date, setting a specific date or time zone, and retrieving specific fields of a date such as the month or year.

However, the Calendar class has some limitations and drawbacks. For example, it is not thread-safe, which means that you may need to use synchronization if you are working with multiple threads. Also, its API can be a bit cumbersome to use and some of its methods are deprecated in newer versions of Java.
 */
public class CalendarExample {
    public static void main(String args[]) {
        //currentDateTime();

        //specificDateAndTime();

        //addSubDateAndTime();

        mutipleMethods();

       // setTimeZone();

    }

    private static void setTimeZone() {
        Calendar dateTime = Calendar.getInstance();
        TimeZone timeZone = TimeZone.getTimeZone("America/New_York");
        dateTime.setTimeZone(timeZone);
        System.out.println(dateTime.getTimeZone().getID()); // output: America/New_York
    }

    private static void mutipleMethods() {
        Calendar dateTime = Calendar.getInstance();
        dateTime.set(2023, Calendar.MARCH, 5, 12, 30, 0);
        int year = dateTime.get(Calendar.YEAR);
        int month = dateTime.get(Calendar.MONTH) + 1; // month is zero-based, so add 1
        int day = dateTime.get(Calendar.DAY_OF_MONTH);
        int hour = dateTime.get(Calendar.HOUR_OF_DAY);
        int minute = dateTime.get(Calendar.MINUTE);
        int second = dateTime.get(Calendar.SECOND);
        System.out.printf("%d-%02d-%02d %02d:%02d:%02d", year, month, day, hour, minute, second); // output: 2023-03-05 12:30:00
    }

    private static void addSubDateAndTime() {
        Calendar dateTime = Calendar.getInstance();
        dateTime.set(2023, Calendar.MARCH, 5, 12, 30, 0);
        dateTime.add(Calendar.YEAR, 1);
        dateTime.add(Calendar.MONTH, 2);
        dateTime.add(Calendar.DAY_OF_MONTH, 3);
        dateTime.add(Calendar.HOUR_OF_DAY, 4);
        dateTime.add(Calendar.MINUTE, 5);
        dateTime.add(Calendar.SECOND, 6);
        System.out.println(dateTime.getTime());
    }

    private static void specificDateAndTime() {
        Calendar dateTime = Calendar.getInstance();
        dateTime.set(2023, Calendar.MARCH, 5, 12, 30, 0);
        System.out.println(dateTime.getTime());
    }

    private static void currentDateTime() {
        Calendar currentDateTime = Calendar.getInstance();
        System.out.println(currentDateTime.getTime());
    }
}

