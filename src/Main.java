import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int year = data.getYear();
        String month = String.valueOf(data.getMonth());
        int day  = data.getDayOfMonth();
        String day_of_week = String.valueOf(data.getDayOfWeek());

        System.out.println("year = " + year);
        System.out.println("month = " + month);
        System.out.println("day = " + day);
        System.out.println("day_of_week = " + day_of_week);
        
    }
}