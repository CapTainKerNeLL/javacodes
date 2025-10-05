package Assignment3;

import java.util.Date;
import java.util.Calendar;

public class DateCalendarExample {
    public static void main(String[] args) {
        // Using Date class
        Date currentDate = new Date();
        System.out.println("Current Date and Time (Date class): " + currentDate);

        // Using Calendar class
        Calendar calendar = Calendar.getInstance();
        System.out.println("Current Date (Calendar): " + calendar.getTime());
        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1)); // Months are 0-based
        System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hour: " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute: " + calendar.get(Calendar.MINUTE));
        System.out.println("Second: " + calendar.get(Calendar.SECOND));
    }
}

