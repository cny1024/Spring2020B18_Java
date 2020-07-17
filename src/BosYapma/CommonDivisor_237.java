package BosYapma;

public class CommonDivisor_237 {

        public static void main(String[] args) {
            System.out.println(commonDivisor(15, 25)); //5
            System.out.println(commonDivisor(40, 124)); //4
            System.out.println(commonDivisor(120, 60)); //60
            System.out.println(commonDivisor(80, 60)); //20
        }


        public static int commonDivisor(int m, int n){
            //m=10;
           // n=20;
           int obeb=1;
           int min = (m>=n)?n:m; //10

           for (int i = 1; i <= min; i ++){ //10

               if (m%i==0 && n%i==0){
                   obeb=i;
               }
           }

            return obeb;
        }
    }

