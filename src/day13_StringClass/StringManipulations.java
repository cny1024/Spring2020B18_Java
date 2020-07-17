package day13_StringClass;

public class StringManipulations {
    public static void main(String[] args) {
        String str = "Cybertek";
        char ch1 = str.charAt(5);
        System.out.println(ch1=='t');

        int totalLenght = str.length();
        System.out.println(totalLenght);
         int maxIndexNum = str.length() -1;
        System.out.println(maxIndexNum);

        str = str.concat(" School");
        System.out.println(str);

        String str2 = "Java";
        System.out.println(str2.concat(" is a programming language"));
        System.out.println(str2);
        str2 = str2.concat(" is a programming language");
        System.out.println(str2);
        int totalLength2 = str2.length();
        System.out.println(totalLength2);
        char ch2 = str2.charAt(24);
        System.out.println(ch2);

        String name1 = "NEAAACII";

        name1 = name1.toLowerCase();
        System.out.println(name1);

        String name2 = "cibi";
        name2= name2.toUpperCase();
        System.out.println(name2);

        String akto = "    Today  is monday"; //sadece bastaki spaceler gitti.
        akto=akto.trim();
        System.out.println(akto);

    }


}
