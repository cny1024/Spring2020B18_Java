package day32_Predicate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/*
write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
			list: {"A", "B", "B", "C", "D", "D"};
			output: ["A", "C"]
 */
public class Duplicates {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("H", "B","A","A", "H", "C", "D","C","I","M","I","M"));
        System.out.println(list);
        ArrayList<String> duplicated = new ArrayList<>();
        for (int i =  0 ; i < list.size();i++) {
            int count = 0;
            for (String each : list) {
                if (each==list.get(i)){
                    count++;
                }
            }
            if (count>1 && !duplicated.contains(list.get(i))){
                duplicated.add(list.get(i));
            }

        }
        System.out.println(duplicated);


    }
}
