package day29_Wrapper_ArrayList;

import Resources.Library;

import java.util.ArrayList;

public class List_Practice2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(99);
        list.add(98);
        list.add(101);

     int maxNum = Library.max(list);
        System.out.println(maxNum);
    }
    public static int max(ArrayList<Integer> list){
        int maximum = Integer.MIN_VALUE;//list.get(0);
        for (int i = 0 ; i<list.size();i++){
            if (list.get(i)>maximum){
                maximum = list.get(i);
            }
        }
        return maximum;
    }
}