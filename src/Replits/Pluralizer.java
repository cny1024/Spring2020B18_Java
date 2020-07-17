package Replits;
import java.util.Scanner;
public class Pluralizer {
}


class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("# in:");
        int amt = inp.nextInt();
        inp.nextLine(); //this line is necessary
        System.out.print("word:");
        String word = inp.nextLine();
        //leave the above unedited, write your code below:
        String result = (word.endsWith("s"))?amt+" "+word+"es":(word.endsWith("mus"))?amt+" "+word.substring(0,word.length()-3)+"mi":(word.endsWith("sh"))?amt+" "+word+"es":(word.endsWith("by"))?amt+" "+word.substring(0,word.length()-2)+"ies":amt+" "+word+"s";
        System.out.println(result);


    }
}