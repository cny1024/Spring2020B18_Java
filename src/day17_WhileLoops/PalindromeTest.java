package day17_WhileLoops;

public class PalindromeTest {
    public static void main(String[] args) {
        String str = "naban";

        String reservedStr = "";

        int index = str.length()-1;

        while(index>=0){
            reservedStr += str.charAt(index);
            index--;
        }
        boolean palindrome = reservedStr.equalsIgnoreCase(str);
        System.out.println(palindrome);

    }
}
