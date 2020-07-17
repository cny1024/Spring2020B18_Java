package day26_MethodOverloading;
/*
write a return method called frequency that accepts two parameters: string str and char ch,
		the method returns the frequency of the ch from the str as an int
			Ex:
				frequency("AAA", 'A') ==>  3
				frequency("ABAB", 'B') ==> 2
			Note: MUST use Arrays and for each loop
 */
public class Frequency {
    public static void main(String[] args) {


        String str = "AAABBCCC";
        char ch = 'A';
        int result = frequency(str,ch);
        System.out.println(result);

        String str2 = "Cihad Naci Yildirim";
        char ch2 = 'i';
        int result2 = frequency(str2,ch2);
        System.out.println(result2);



    }
    public static int frequency(String str,char ch){
        char[] arr = str.toCharArray();
        int count = 0;

        for (char each : arr) {
            if (each==ch){
                count++;
            }
        }
        return count;
    }
}