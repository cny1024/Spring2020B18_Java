package BosYapma;

//import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        String str = "Helloxxx";
            //        01234567
        int count = 0 ;
        for (int i =0; i <= str.length()-3 ; i++){
            if (str.charAt(i)==str.charAt(i+1) && str.charAt(i)== str.charAt(i+2)){ //xxx
                count++;                                                            //012
            }
        }
        System.out.println(count);
    }
}

