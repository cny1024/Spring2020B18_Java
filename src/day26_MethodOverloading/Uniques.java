package day26_MethodOverloading;

public class Uniques {
    public static void main(String[] args) {
        String str = "naci yildirim";
        String resultt = uniques(str);
        System.out.println(resultt);
    }

    public static int Frequency(String str,char ch){
        char[] arr = str.toCharArray();
        int count = 0;

        for (char each : arr) {
            if (each==ch){
                count++;
            }
        }
        return count;
    }
    public static String uniques(String str){
        String result ="";
        for (int i = 0 ; i<str.length();i++) {
            int num = Frequency(str, str.charAt(i));
            if (num == 1) {
                result += str.charAt(i);
            }
        }
        return result;
    }
}
