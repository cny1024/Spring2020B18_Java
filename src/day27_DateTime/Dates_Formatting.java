package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE dd.MMMM.yyyy");

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("EEE MM/dd/yyyy");

        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf) );

        LocalDate date3 = LocalDate.of(2020,10,10);
        System.out.println(date3.format(dtf3) );

        LocalDate date2 = LocalDate.now();
        System.out.println(date2.format(dtf2));
    }
}
