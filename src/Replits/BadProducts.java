package Replits;

public class BadProducts {
    public static boolean badP(int[] products,int limit)
    {
        int count = 0;
        for (int each : products){
            if (each == 0){
                count++;
            }
        }
        if (count < limit){
            return true;
        }
        else {
            return false;
        }

    }
}
