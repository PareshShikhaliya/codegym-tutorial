package dateexample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.TimeZone;

public class First {
    public static void main(String args[]) throws ParseException {
        currentDate();

        //specificDate();

       // simpleDateFormat();

        //compareDate();

       // currentTimeMillis();


       // currentDateTime();
        //SimpleDateFormat2();

       // parse();


        setTimeZone();

    }

    private static void setTimeZone() {
        Date currentDate = new Date();
        System.out.println(currentDate);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        String formattedDate = formatter.format(currentDate);
        System.out.println(formattedDate);
    }

    private static void parse() throws ParseException {
        String dateString = "02/14/2009";
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date parsedDate = formatter.parse(dateString);
        System.out.println("Parsed date: " + parsedDate); // Output: Parsed date: Sat Feb 14 00:00:00 UTC 2009
    }

    private static void SimpleDateFormat2() {
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = formatter.format(currentDate);
        System.out.println("Formatted date: " + formattedDate); // Output: Formatted date: 04/03/2023
    }

    private static void currentDateTime() {
        // Get the current date and time
        /*Note that the java.util.Date class is considered deprecated
         and replaced by the java.time package in Java 8 and later. Here's an example using the java.time.LocalDateTime class:
        
         */
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime); // prints something like "2023-03-04T13:50:15.529557"
    }

    private static void currentTimeMillis() {
        // Get the current time in milliseconds since Jan 1, 1970
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis); // prints something like "1646460615296"
    }

    private static void compareDate() {
        Date date1 = new Date();
        Date date2 = new Date(121, 2, 4, 14, 30, 0);

        System.out.println("date1 ="+date1);
        System.out.println("date2 ="+date2);

        if (date1.compareTo(date2) < 0) {
            System.out.println("date1 is before date2");
        } else if (date1.compareTo(date2) > 0) {
            System.out.println("date1 is after date2");
        } else {
            System.out.println("date1 and date2 are equal");
        }
    }

    private static void currentDate() {
        Date currentDate = new Date();
        int day = currentDate.getDay();
        System.out.println("day=="+day);
        System.out.println("currentDate=="+currentDate);
    }



    private static void specificDate() {
        Date specificDate = new Date(121, 2, 4, 14, 30, 0);
        System.out.println("specificDate=="+specificDate);
    }

    private static void simpleDateFormat() {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = dateFormat.format(currentDate);
        System.out.println(formattedDate);
    }
}
