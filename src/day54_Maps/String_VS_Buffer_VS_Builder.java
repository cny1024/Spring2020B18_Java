package day54_Maps;

public class String_VS_Buffer_VS_Builder {

    public static void main(String[] args) {

        String str1 = "Cybertek";
        str1.concat(" School");  // "Cybertek School"

        System.out.println(str1);   // Cybertek

        System.out.println("===============================================");

        StringBuilder builder = new StringBuilder("Cybertek");
        builder.append(" School");

        System.out.println(builder);  // Cybertek School

        System.out.println("================================================");
        StringBuffer buffer = new StringBuffer("Cybertek");
        buffer.append(" School");

        System.out.println(buffer);// Cybertek School

        System.out.println("============================================");

        String word = "ABCD";


        StringBuilder sb = new StringBuilder(word);
        sb.reverse();

        System.out.println(sb);//DCBA

        word = sb.toString();

        System.out.println(word);//DCBA






    }


}