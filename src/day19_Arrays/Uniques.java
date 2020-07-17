package day19_Arrays;

public class Uniques {
    public static void main(String[] args) {
        String str = "cihad naci yildirim";
        String result = "";

        for (int j =0;j<=str.length()-1;j++){

            int count = 0 ;

            for (int i=0;i<=str.length()-1;i++){

                if (str.charAt(i)==str.charAt(j)){
                    count ++;
                }
            }
            if (count==1){
                result+= str.charAt(j);
            }
        }
        System.out.println(result);
    }
}
