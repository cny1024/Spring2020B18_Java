package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println(max);
        System.out.println(min);

        System.out.println("=-=-=-=-=-=-=-=-=");

        ArrayList<Integer> numbers = new ArrayList<>( Arrays.asList(1,1,2,3,4,4));

        Integer maxNum = Collections.max(numbers);

        numbers.removeAll(Arrays.asList(maxNum));

        int secondMax = Collections.max(numbers);
        System.out.println("second max num is: " +secondMax);

        System.out.println("-=-=-=-=-=-==-=-");

        ArrayList<Integer> numbers1 = new ArrayList<>( Arrays.asList(1,1,2,3,4,4));

        Integer minNum = Collections.min(numbers1);

        numbers1.removeAll( Arrays.asList(minNum) );

        int secondMin = Collections.min(numbers1);

        System.out.println("Second min num is: " +secondMin);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5));

        Collections.swap(list3,4,0);
        System.out.println(list3);

        System.out.println("-=-=-=-=-==-=-");
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1,2,1,2,1));

        Collections.replaceAll(list4,2,0);
        System.out.println(list4);



    }
}
