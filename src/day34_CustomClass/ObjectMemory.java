package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ObjectMemory {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10,20,30,40));
        ArrayList<Integer> list2 = list1;

        list1.remove(2);
        System.out.println(list2);

        String s1= "naci";
        String s2 = s1;
        s1= s1.toUpperCase();
        System.out.println(s1);
        System.out.println(s2);

    }
}
