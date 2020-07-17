package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_retainAll {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("cihad","naci","at","elma","yildirim","armut","minnos"));
        String[] keep = {"naci","cihad","minnos","yildirim"};
        names.retainAll(Arrays.asList(keep));
        System.out.println(names);

    }
}
