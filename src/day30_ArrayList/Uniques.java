package day30_ArrayList;

import java.util.ArrayList;

/*
write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
    		ex: list==> {1,1,2,3,3,4,5}
    			uniques ==> {2,4,5}
 */
public class Uniques {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(6);


        ArrayList<Integer> uniques = new ArrayList<>();
        for (int i = 0;i<list.size();i++){

            int count = 0;

            for (Integer each : list){

                if (each == list.get(i)){
                    count++;
                }

            }
            if (count == 1){
                uniques.add(list.get(i));

            }
        }
        System.out.println(uniques);

    }
}
