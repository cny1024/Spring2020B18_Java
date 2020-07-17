package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_removeAll {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,8,3,4,1,3,4,1,8,5,6,7,8,9));
        //remove 1, 3, 5, 8
/*
        Integer a = 1;
        list.remove(a);

        System.out.println(list);//only first 1 removed.
*/
        Integer[] numbers = {1,3,5,8};
        list.removeAll(Arrays.asList(numbers));

        System.out.println(list);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=");


        ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("naci","cihad"));
        System.out.println(list2);
        list2.add("yildirim");
        System.out.println(list2);

        System.out.println("=========================================================");
        // remove all names ahmed
        String[] names = {"Ahmed", "John", "Aaron", "Ahmed", "Daniel", "Ahmed", "Ahmed"};

        ArrayList<String> nameList = new ArrayList<>( Arrays.asList(names) );
        System.out.println(nameList);

        nameList.removeAll(  Arrays.asList("Ahmed")  );

        System.out.println(nameList);


    }
}
