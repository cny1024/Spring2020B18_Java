package day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Formatting {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a, EEE");
        LocalDateTime time1 = LocalDateTime.of(2015,12,21,12,12);
        System.out.println(time1.format(dtf));
    }
}
