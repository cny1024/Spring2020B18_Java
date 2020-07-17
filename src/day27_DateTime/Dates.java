package day27_DateTime;
import java.time.LocalDate;
public class Dates {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(1994,11,8);
        System.out.println(date1);
        LocalDate birthDay = LocalDate.of(1994,11,7);
        System.out.println("My birthday is: " +birthDay);
        boolean result = date1.isAfter(birthDay);
        System.out.println(result);
        boolean result1 = date1.isBefore(birthDay);
        System.out.println(result1);
        boolean result2 = date1.isEqual(birthDay);
        System.out.println(result2);
        boolean result3 = birthDay.isLeapYear();
        System.out.println(result3);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        LocalDate now = LocalDate.now();
        System.out.println("Today is: "+now);

        String str = now.toString();
        System.out.println(str.replaceFirst("-"," "));

    }
}
