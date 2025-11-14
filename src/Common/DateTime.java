package Common;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTime {

    public static String getCurrentDate() {
        return LocalDate.now().toString();
    }

    public static String getCurrentTime() {
        return LocalTime.now().withNano(0).toString();
    }
}

