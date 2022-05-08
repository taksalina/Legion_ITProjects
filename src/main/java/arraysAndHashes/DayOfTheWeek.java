package arraysAndHashes;

import java.util.ArrayList;

public class DayOfTheWeek {
    // Assignment 1.
    //Create a method with an array list of days of the week from Sunday to Saturday. The method can receive a number and return/print the day of the week.
    //example:
    //public String getDay(int day){
    //}
    //for example, if 2 will be provided, the method should return "Monday"
    public String  daysOfTheWeek(Integer dayNumber) {
        ArrayList<String> days = new ArrayList<String>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        if (dayNumber == null) {
            throw new NullPointerException();
        }
        else if (dayNumber < 1) {
            return "The number should be equal or larger than 1";
        } else if (dayNumber > 7) {
            return "The number should be equal or smaller than 7";
        } else {
            return days.get(dayNumber - 1);
        }
    }


}

