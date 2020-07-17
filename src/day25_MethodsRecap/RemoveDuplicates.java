package day25_MethodsRecap;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String ABC = "ABABABCCCERTSAGGGRERTLFDFKLDKLFGD";
        String result = RemoveDuplicates(ABC);
        System.out.println(result);


    }

    public static String RemoveDuplicates(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!result.contains("" + ch)) {
                result += ch;
            }
        }
        return result;
    }
}

