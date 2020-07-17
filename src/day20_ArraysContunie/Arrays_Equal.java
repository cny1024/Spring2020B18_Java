package day20_ArraysContunie;
import java.util.Scanner;
class Main {



    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
    String s = inp.next();
    person(s) ;
}

public static void person(String info)
        {

        String[]words = info.split(",");

        System.out.println("person name: "+words[0]+" last name: "+words[1]+" age: "+words[2]);


        }//end person

        }