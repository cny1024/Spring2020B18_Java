package day54_Maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Map_SetEntries {

    public static void main(String[] args) {

        LinkedHashMap<String, String> fb = new LinkedHashMap<>();
        fb.put("cny1024","cny1024!1!");
        fb.put("cihabas94","cny1024!1!");
        fb.put("cny1024","123456");
        fb.put("Username1","123456");

        System.out.println(fb);//{cny1024=123456, cihabas94=cny1024!1!, Username1=123456}

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        for (String eachKey : fb.keySet()){
            System.out.println(eachKey);/* cny1024
                                           cihabas94
                                           Username1*/
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        for (String eachValue : fb.values() ){
            System.out.println(eachValue);/* 123456
                                             cny1024!1!
                                             123456*/
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        List<String> passwords = new ArrayList<>(fb.values());
        System.out.println(passwords);//[123456, cny1024!1!, 123456]

        List<String> keys = new ArrayList<>(fb.keySet());
        System.out.println(keys);//[cny1024, cihabas94, Username1]

        System.out.println("====================================================");







    }

}
