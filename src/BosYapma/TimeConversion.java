package BosYapma;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) { //2:55:00PM

        String[] arr =s.split(":");   //arr[0]=2 arr[1]=55 arr[2]=00PM

        String time ="";
        for (int i = 1 ; i<arr.length; i++){
            time += ":"+arr[i];   //  :55:00PM
        }
        int hour = Integer.parseInt(arr[0]);//2


        if (time.endsWith("AM")){

            if (hour==12){
                time = time.substring(0,time.length()-2);
                System.out.println("00" + time);
            }else {
                time = time.substring(0,time.length()-2);
                System.out.println(arr[0] + time);
            }
        }else if (time.endsWith("PM")){
            if (hour==12){
                time = time.substring(0,time.length()-2);
                System.out.println(hour + time);
            }else {
                hour+=12;
                time = time.substring(0,time.length()-2);
                System.out.println(hour + time);
            }

        }









    }
}
