package day15_ForLoop;

public class ReverseString {
    public static void main(String[] args) {
        String str = "cihaD nacI yildiriM";

        //String reverse1 = "" + str.charAt(3)+ str.charAt(2)+ str.charAt(1)+ str.charAt(0);
        int lastIndexNum = str.length()-1;
        String reverse = "";
        for (int i =lastIndexNum; i>=0;i--){
                //System.out.print(str.charAt(i));
            reverse += str.charAt(i);
        }
        System.out.println(reverse);

    }
}
