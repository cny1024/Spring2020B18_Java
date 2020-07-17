package day29_Wrapper_ArrayList;

public class ParseMethods {
    public static void main(String[] args) {
        String str = "123";

        int a1 = Integer.parseInt(str);//123
        System.out.println(str);//text 123
        System.out.println(a1);//number 123

        byte b1 = Byte.parseByte(str);
        System.out.println(b1);

        Integer I1 = (int) Byte.parseByte(str);//AutoBoxing

        String str2= "10.5";

        float f1 = Float.parseFloat(str2);
        System.out.println(f1);

        double d1 = Double.parseDouble(str2);
        System.out.println(d1);

        String str3 = "3147483647";
        long l1 = Long.parseLong(str3);
        System.out.println(l1);

        String result1 = "tRuE";//any string other then "true" will return "false"
        boolean r1 = Boolean.parseBoolean(result1);
        System.out.println(r1);
    }
}
