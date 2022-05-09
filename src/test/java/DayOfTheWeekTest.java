import arraysAndHashes.DayOfTheWeek;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


public class DayOfTheWeekTest {
    static Stream<Arguments> getExpectedDay() {
        return Stream.of(
                Arguments.of(1, "Sunday"),
                Arguments.of(2, "Monday"),
                Arguments.of(3, "Tuesday"),
                Arguments.of(4, "Wednesday"),
                Arguments.of(5, "Thursday"),
                Arguments.of(6, "Friday"),
                Arguments.of(7, "Saturday")
        );
    }

    @ParameterizedTest
    @MethodSource("getExpectedDay")
    public void getDay(int actualDay, String expectedDay) {
        DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();
        assertEquals(expectedDay,dayOfTheWeek.daysOfTheWeek(actualDay));
    }


    @Test
    public void getDaySunday() {
        DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();
        String day = dayOfTheWeek.daysOfTheWeek(1);
        assertNotNull(day, "The number should not be null");
        assertEquals("Sunday", day, "Error: Wrong number entered. Days do not match");

    }

    @Test
    public void getDayMonday() {
        DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();
        String day = dayOfTheWeek.daysOfTheWeek(2);
        assertNotNull(day, "The number should not be null");
        assertEquals("Monday", day, "Error: Wrong number entered. Days do not match'");
        // assertTrue("Monday" == day, "Error: Wrong number entered. Days do not match'");
    }

    @Test
    public void getDayTuesday() {
        DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();
        String day = dayOfTheWeek.daysOfTheWeek(3);
        assertNotNull(day, "The number should not be null");
        assertEquals("Tuesday", day, "Error: Wrong number entered. Days do not match'");
        // assertTrue("Tuesday" == day, "Error: Wrong number entered. Days do not match'");
    }

    @Test
    public void getDayWednesday() {
        DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();
        String day = dayOfTheWeek.daysOfTheWeek(4);
        assertNotNull(day, "The number should not be null");
        assertEquals("Wednesday", day, "Error: Wrong number entered. Days do not match'");
        // assertTrue("Wednesday" == day, "Error: Wrong number entered. Days do not match'");
    }

    @Test
    public void getDayThursday() {
        DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();
        String day = dayOfTheWeek.daysOfTheWeek(5);
        assertNotNull(day, "The number should not be null");
        assertEquals("Thursday", day, "Error: Wrong number entered. Days do not match'");
        // assertTrue("Thursday" == day, "Error: Wrong number entered. Days do not match'");
    }

    @Test
    public void getDayFriday() {
        DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();
        String day = dayOfTheWeek.daysOfTheWeek(6);
        assertNotNull(day, "The number should not be null");
        assertEquals("Friday", day, "Error: Wrong number entered. Days do not match'");
        // assertTrue("Friday" == day, "Error: Wrong number entered. Days do not match'");
    }

    @Test
    public void getDaySaturday() {
        DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();
        String day = dayOfTheWeek.daysOfTheWeek(7);
        assertNotNull(day, "The number should not be null");
        assertEquals("Saturday", day, "Error: Wrong number entered. Days do not match'");
        // assertTrue("Saturday" == day, "Error: Wrong number entered. Days do not match'");
    }

    // I also don't understand my mistakes in next two methods...
    @ParameterizedTest
    @DisplayName("Run test with negative numbers")
    @ValueSource(ints = {-0, -1, -2, -3, -4, -5, -6, -7, -123455678, Integer.MIN_VALUE})
    public void getDayNegativeNumbers(int i) {
        DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();
        assertEquals(i, dayOfTheWeek.daysOfTheWeek(i));

    }

    @ParameterizedTest
    @DisplayName("Run test with larger numbers")
    @ValueSource(ints = {8, 15, 3, 1000, Integer.MAX_VALUE})
    public void getDayLargerNumbers(int i) {
        DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();
        assertEquals(i, dayOfTheWeek.daysOfTheWeek(i));


    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7})
    public void getDay(int i) {
        DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();
        assertTrue(i > 0 & i <= 7);
    }

    @Test
    @DisplayName("NullPointerExceptionTest")
    public void getDay() {
        DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();
        assertThrows(NullPointerException.class, () -> dayOfTheWeek.daysOfTheWeek(null));

    }

}
