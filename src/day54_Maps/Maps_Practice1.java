package day54_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;


public class Maps_Practice1 {

    public static void main(String[] args) {

        LinkedHashMap<String, LocalDate> classMates = new LinkedHashMap<>();
        classMates.put("Zeynep Ece", LocalDate.of(2019,5, 3));
        classMates.put("Salih", LocalDate.of(1962,8, 1));
        classMates.put("Kezban", LocalDate.of(1966,8, 7));
        classMates.put("Ozlem", LocalDate.of(1986,10, 28));
        classMates.put("Gurbet", LocalDate.of(1988,9, 6));
        classMates.put("Naci", LocalDate.of(1994,11, 7));
        classMates.put("Cihad", LocalDate.of(1994,11, 7));
        classMates.put("Naci", LocalDate.of(1453,11, 7));

        System.out.println(classMates);//{Zeynep Ece=2019-05-03, Salih=1962-08-01, Kezban=1966-08-07, Ozlem=1986-10-28, Gurbet=1988-09-06, Naci=1453-11-07, Cihad=1994-11-07}
        classMates.remove("Naci");
        System.out.println(classMates);//{Zeynep Ece=2019-05-03, Salih=1962-08-01, Kezban=1966-08-07, Ozlem=1986-10-28, Gurbet=1988-09-06, Cihad=1994-11-07}

        System.out.println(classMates.get("Zeynep Ece"));//2019-05-03

        System.out.println(classMates.size());//6

        System.out.println(classMates.containsKey("Minnos"));//false

        System.out.println(classMates.containsValue(LocalDate.of(2019,5,3)));//true

        classMates.clear();
        System.out.println(classMates);//{}

        System.out.println("==========================================================");

        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();
        students.put("Minnos",100);
        students.put("Zeynep",100);
        students.put("Cihad",50);
        students.put("Naci",60);

        LinkedHashMap<String,Integer> badStudents = new LinkedHashMap<>();
        LinkedHashMap<String,Integer> goodStudents = new LinkedHashMap<>();

        for (String eachKey : students.keySet()){
            int eachValue = students.get(eachKey);
            if (eachValue<90){
                //System.out.println(eachKey);//Cihad
                                            //Naci
                badStudents.put(eachKey,eachValue);
            }else {
                goodStudents.put(eachKey,eachValue);
        }
        }
        System.out.println(badStudents);//cihad naci

        System.out.println(goodStudents);// minnos zeynep




    }

}
