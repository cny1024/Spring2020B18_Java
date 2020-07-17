package day25_MethodsRecap;
import Resources.Library;
public class Test {
    public static void main(String[] args) {
        String str = "ANANZAAAAAXDXDXD";
        String result = Library.RemoveDuplicates(str);
        System.out.println(result);

        String str3 = "bahcaduvarindanastimsarmasikgulleredolastim";
        String result1 = Library.FrequencyOfChars(str3);
        System.out.println(result1);

    }
}
