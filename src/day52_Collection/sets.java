package day52_Collection;

import java.util.*;

public class sets {


    public static void main(String[] args) {

        ArrayList<String> namess = new ArrayList<>();

        namess.addAll(Arrays.asList("ahmet","ahmet","zareen","nuri","zafer","mehmet"));

        System.out.println(namess);



        Set<String> names = new TreeSet<>();

        names.addAll(Arrays.asList("ahmet","ahmet","zareen","nuri","zafer","mehmet"));




        System.out.println(names);

        Set<Integer> numbers = new HashSet<>();
        numbers.add(623);
        numbers.add(233);
        numbers.add(143);
        numbers.add(551);
        numbers.add(112);
        numbers.add(222);
        numbers.add(132);
        numbers.add(442);
        numbers.add(256);
        numbers.add(256);
        System.out.println(numbers);

        String[] arr = {"A", "A", "C", "B", "A"}; // ACB
        LinkedHashSet<String> set1 = new LinkedHashSet<>(Arrays.asList(arr)); // [A,C, B]

        System.out.println(set1);

        //  System.out.println( set1.get(1) );

        System.out.println("=========================================");
        Set<Integer> number = new TreeSet<>();
        numbers.addAll( Arrays.asList(10,9,10, 9, 8, 7, 8, 7, 6, 5, 6));

        System.out.println(numbers);

        System.out.println("==========================");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(null);

        System.out.println(hashSet);

        TreeSet<String> treeset = new TreeSet<>();
        treeset.add(null);

        System.out.println(treeset);



    }

}