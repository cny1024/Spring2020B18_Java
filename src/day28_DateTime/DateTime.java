package day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime dt =  LocalDateTime.now();
        System.out.println(dt);

        LocalDateTime dt2 = LocalDateTime.of(1994,11,07,11,30,24);
        System.out.println(dt2);



    }
}
