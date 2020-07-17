package day14_StringClass;

public class StringManipulations3 {
    public static void main(String[] args) {
        String str1 = "CYBERTEK";
        String str2 = "cybertek";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        String s1 = "NACI YILDIRIM";
        boolean s2 = s1.contains("NACI");
        System.out.println(s2);

        String webAdress = "www.amazon.com ";

        if(webAdress.startsWith("www.")){
            System.out.println("Valid Website");
        }

        String s4 = "naci yildirim";
        System.out.println(s4.endsWith("m"));
        System.out.println(s4.endsWith("yildirim"));





    }
}
