import java.time.OffsetDateTime;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
private Main test = new Main();

    @org.junit.jupiter.api.Test
    void main() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int year = data.getYear();
        String month = String.valueOf(data.getMonth());
        int day  = data.getDayOfMonth();
        String day_of_week = String.valueOf(data.getDayOfWeek());

        assertEquals(2023, year);
        assertEquals("MARCH", month);
        assertEquals(1, day);
        assertEquals("WEDNESDAY", day_of_week);
    }
}