package day17_WhileLoops;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "Java is bad, Java is terrible, Java is suck";
        int count=0;

        while(str.contains("a")){
            count++;
            str = str.replaceFirst("a","");
        }
        System.out.println(count);




    }
}
