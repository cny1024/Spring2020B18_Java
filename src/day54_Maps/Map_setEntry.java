package day54_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_setEntry {

    public static void main(String[] args) {

        LinkedHashMap<String, String> countries = new LinkedHashMap<>();
        countries.put("Grecee", "Atina");
        countries.put("Syria", "Sam");
        countries.put("Ukrain", "Kiev");
        countries.put("Germany", "Berlin");

        String input = "Germany";

        for (Map.Entry<String, String> each : countries.entrySet()) {
            //System.out.println(each.getKey()+"'s capital is "+each.getValue());
            String countryName = each.getKey();
            String cityName = each.getValue();

            if(input.equalsIgnoreCase(countryName)){
                System.out.println(cityName);
            }
        }

    }

}
