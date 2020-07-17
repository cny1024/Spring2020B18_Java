package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expressions {
    public static void main(String[] args) {
        Predicate<Integer> oddNumber = x -> x%2!=0;

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.removeIf(oddNumber);

        System.out.println( list);

        System.out.println("================================");

        Predicate<Integer> less5 = Y -> Y<5;
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list1.removeIf(less5);
        System.out.println(list1);

        System.out.println("=========================================");

        Predicate<String> startsWithM = s -> s.startsWith("M");

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Cihad","Naci","Yildirim","Metin","Murtaza","Muhtar"));
        list2.removeIf(startsWithM);
        System.out.println(list2);

        System.out.println("=========================");

        Predicate<String> startsWithMorA = each -> each.startsWith("M") || each.startsWith("A");

        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("Mihad","Aaci","Yildirim","Metin","Murtaza","Muhtar"));
        list3.removeIf(startsWithMorA);
        System.out.println(list3);

        System.out.println("==================================");

        Predicate<Character> digits = c -> Character.isDigit(c);//c >= 48 && c <= 57

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('A','2','?','B'));
        chars.removeIf(digits);
        System.out.println(chars);

        System.out.println("===============================");

        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list4.removeIf(g -> g > 5);

        System.out.println( list4 );



    }
}
