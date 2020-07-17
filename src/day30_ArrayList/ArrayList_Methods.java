package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(2);
        list1.add(4);

        list1.add(1,1);
        list1.add(3,3);
        System.out.println(list1);

        list1.set(0,10);
        System.out.println(list1);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        int a = 2;// 1,2,3,4
        list2.remove(a);// 1,2,4
        list2.set(0,4);//4,2,4
        System.out.println(list2);//4 2 4

        Integer b = 2;//wrapper ,,,,, 4 2 4
        list2.remove(b);// 4 4
        System.out.println(list2);//4,4


        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(10);
        list4.add(20);
        list4.add(30);

        //first way to remove 20
        list4.remove(1);
        System.out.println(list4);

        //second way to remove 20
        Integer c = 20;
        list4.remove(c);

        System.out.println(list4);






    }
}
