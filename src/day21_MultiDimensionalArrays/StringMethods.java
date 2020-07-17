package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Java";

        char[] ch = name.toCharArray();

        System.out.println(ch[0]);
        for (int i =0;i<name.length();i++){
            System.out.print(ch[i]+" ");
        }

        System.out.println("-=-=-=-");

        String str = "I love Java";

        String[] arr = str.split(" ");

        System.out.println(Arrays.toString(arr));

        System.out.println("-=-=-=-=-=-=-=");


        String sentence = "Today is great day";//day great is today
        String[] words=sentence.split(" ");
        System.out.println(Arrays.toString(words));//Today, is, great, day
        String result = "";
        for (int i = words.length-1; i >= 0 ;i--){
            String eachWords = words[i];
            result += eachWords +" ";
        }
        System.out.println(result);

        System.out.println("#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$");
        String abc = "ABCD";
        String[] arr2 = abc.split("");
        System.out.println(Arrays.toString(arr2));//[A, B, C, D]

    }
}
