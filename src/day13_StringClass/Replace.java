package day13_StringClass;

public class Replace {
    public static void main(String[] args) {
        String str = "I like C# Programming";
                str = str.replace("C#", "Java");
        System.out.println(str);

        System.out.println("-=-=-=-=-=-=-=-=-");

        String akto = "covid 18";
        akto = akto.replace("8", "9");
        System.out.println(akto);


        String r2 = "Tomorrow is Monday, Tomorrow is Tuesday";
        r2 = r2.replaceFirst("Tomorrow", "Today");

        System.out.println(r2);
    }

}