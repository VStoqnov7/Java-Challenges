package DateToDay;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Result {

    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);

        DayOfWeek dayOfWeek = date.getDayOfWeek();

        return dayOfWeek.toString();
    }

}