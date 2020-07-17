package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Intro {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();

        scores.add(10);//Autoboxing
        scores.add(20);
        scores.add(30);

        System.out.println(scores);

        Integer a1 = scores.get(2);//none
        int a2 =scores.get(2);//unboxing
        double a3 = scores.get(2);//unboxing

        System.out.println(a1+" "+ a2 + " "+a3);
    }


}
