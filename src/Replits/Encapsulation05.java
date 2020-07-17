package Replits;

public class Encapsulation05 {

    public static int quantity= 250;
    public static double total = 15658.92;
    String number = quantity+""+(int)total*100;

    public void setNumber(String number){
        this.number=number;
    }
    public String getNumber(){
        return number;
    }

}
