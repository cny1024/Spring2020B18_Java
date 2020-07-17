package InterviewPractice;

import java.util.Arrays;

public class SameLetters {

    public static boolean sameLetters(String a, String b){

        char[] x = a.toCharArray();
        char[] y = b.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        String new1 = "";
        String new2 = "";

        for (char each : x){
            new1 += each;
        }
        for (char each2 : y){
            new2 += each2;
        }

        return new1.equalsIgnoreCase(new2);


    }


}
