package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {

        Character[] chars = {'A','A','B','C','D','D'};

        ArrayList<Character> charList = new ArrayList<>(Arrays.asList(chars));
        ArrayList<Character> result = new ArrayList<>();
        System.out.println(charList);

        for (int i = 0; i < charList.size();i++) {
            int count = Collections.frequency(charList,charList.get(i));
            if (count==1){
                result.add(charList.get(i));
            }
        }
        System.out.println(result);

    }
}
