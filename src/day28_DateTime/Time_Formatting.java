package day28_DateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_Formatting {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("h:mm:ss a");
        LocalTime lt1 = LocalTime.of(16,20,12);
        System.out.println(lt1.format(dtf));

        LocalTime time2 = LocalTime.of(17,20,12);
        System.out.println(time2.format(dtf));

        boolean result1 = lt1.isAfter(time2);
        System.out.println(result1);

    }
}
