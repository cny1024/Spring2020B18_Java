package day05_Unary_ShorthandOperators;

public class PostPre_Practice {
    public static void main(String[] args) {
        int a = 50;
        a = --a + a++ + a-- + a++;
        System.out.println(a);


    }
}
