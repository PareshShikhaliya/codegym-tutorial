package dateexample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
In Java, LocalDateTime is a class in the java.time package that represents a date-time without a time zone. It is a combination of the LocalDate and LocalTime classes, and can be used to represent a date and time such as "2023-03-05 12:30:00".

The LocalDateTime class provides methods for working with date-times such as adding or subtracting years, months, days, hours, minutes, seconds, or nanoseconds, finding the difference between date-times, and checking if a date-time falls within a certain range. It also provides methods for formatting and parsing date-times to and from strings.

Like LocalDate and LocalTime, LocalDateTime is an immutable class, which means that once a LocalDateTime object is created, its value cannot be changed. Instead, methods that modify a LocalDateTime object return a new object with the modified value.

 */
public class LocalDateTimeExample {
    public static void main(String args[]) {
        currentDateTime();

        specificDataAndTime();

        addSubDataAndTime();

        compateDateAndTime();

        DateTimeFormatter();
    }

    private static void DateTimeFormatter() {
        LocalDateTime dateTime = LocalDateTime.of(2023, 3, 5, 12, 30, 0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println(formattedDateTime); // output: 2023-03-05 12:30:00
    }

    private static void compateDateAndTime() {
        LocalDateTime dateTime = LocalDateTime.of(2023, 3, 5, 12, 30, 0);
        LocalDateTime startDateTime = LocalDateTime.of(2023, 3, 5, 11, 0, 0);
        LocalDateTime endDateTime = LocalDateTime.of(2023, 3, 5, 14, 0, 0);

        boolean isWithinRange = dateTime.isAfter(startDateTime) && dateTime.isBefore(endDateTime);
        System.out.println(isWithinRange);
    }

    private static void addSubDataAndTime() {
        LocalDateTime dateTime = LocalDateTime.of(2023, 3, 5, 12, 30, 0);
        LocalDateTime newDateTime = dateTime.plusYears(1).plusMonths(2).plusDays(3)
                .plusHours(4).plusMinutes(5).plusSeconds(6).plusNanos(7);
        System.out.println(newDateTime); // output: 2024-05-08T16:35:06.000000007


    }

    private static void specificDataAndTime() {
        LocalDateTime dateTime = LocalDateTime.of(2023, 3, 5, 12, 30, 0);
        System.out.println(dateTime); // output: 2023-03-05T12:30:00
    }

    private static void currentDateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);
    }
}
