package dateexample;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeExample {
    public static void main(String args[])
    {
        currentTime();
        specificTime();
        addSubTime();

        compateTime();

        formatTime();
    }

    private static void formatTime() {
        LocalTime time = LocalTime.of(13, 30, 0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = time.format(formatter);
        System.out.println(formattedTime); // output: 13:30:00
    }

    private static void compateTime() {
        LocalTime time = LocalTime.of(13, 30, 0);
        LocalTime start = LocalTime.of(12, 0, 0);
        LocalTime end = LocalTime.of(14, 0, 0);

        boolean isWithinRange = time.isAfter(start) && time.isBefore(end);
        System.out.println(isWithinRange); // output: true
    }

    private static void addSubTime() {
        LocalTime time = LocalTime.of(13, 30, 0);
        LocalTime newTime = time.plusHours(2);
        System.out.println(newTime); // output: 15:30:00

        LocalTime newTime2 = time.minusMinutes(15);
        System.out.println(newTime2); // output: 13:15:00

        LocalTime newTime3 = time.plusSeconds(30);
        System.out.println(newTime3); // output: 13:30:30

        LocalTime newTime4 = time.minusNanos(500000);
        System.out.println(newTime4); // output: 13:29:59.999500000
    }

    private static void specificTime() {
        LocalTime time = LocalTime.of(13, 30, 10);
        System.out.println(time);
    }

    private static void currentTime() {
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
    }
}
