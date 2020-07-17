package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("F");


        String str = "B";
        boolean r1 =  list.remove(str);
        System.out.println(r1);
        System.out.println(list);

        boolean r2 = list.remove("A");
        boolean r3 = list.remove("D");
        System.out.println(r2);
        System.out.println(r3);

        list.clear();
        System.out.println(list);
        System.out.println(list.size());

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        int num1 = list2.indexOf(1);//Integer = int Autoboxing
        System.out.println(num1);//  0

        int num2 = list2.indexOf(100);
        System.out.println(num2);// -1


    }
}
