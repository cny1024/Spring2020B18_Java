package day21_MultiDimensionalArrays;

public class For_each_Loop {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        for (int eachElement : nums){
            System.out.print(eachElement+" ");
        }
        System.out.println();
        String[] students = {"naci","kemal","huseyin"};
        for (String names : students){
            System.out.print(names+" ");

        }
        System.out.println();

        System.out.println("&*&*&*&*&*&*&*&*&*&*&*&*&*&*&*&*&*&*&*&");

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int eachArr : arr){
            if (eachArr<5){
                continue;
            }
            System.out.print(eachArr +" ");
        }

        System.out.println("!@!@!@!@!@!@!@!@!@!@!@!@!@!@");

        String sent = "I love you";
        String words[]=sent.split(" ");
        for (String wordsSent : words){
            System.out.print(wordsSent+", ");
        }
        System.out.println("++++++++++++++++++++++++++++++");
        for (int i=words.length-1;i>=0;i--){
            System.out.println(words[i]);
        }
    }
}
