package day13_StringClass;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.*;

public class SubString {
    public static void main(String[] args) {
        String akto = "Cybertek School is the best";
                     //0123456789
        String schoolName = akto.substring(0,8);
        System.out.println(schoolName);

        String akto1 = "Yasin AKTAS";
        String lastName = akto1.substring(6, 11);
        System.out.println(lastName);
        String firsName = akto1.substring(0, 5);
        System.out.println(firsName);


        String fullName= "Naci YILDIRIM";
                  //      123456789
        String fname = fullName.substring(0, 4+1);
        String lName = fullName.substring(5,13);
        System.out.println(fname);
        System.out.println(lName);

        String gmail = lName.concat("_").concat(fname).concat("@gmail.com");
        System.out.println(gmail);
        System.out.println("=-=-=-=-=-=-=-=-=-=-");


        String asd = "wesley sneijder";
        String Fasd=asd.substring(0,6);
        System.out.println(Fasd);
        String Lasd = asd.substring(7, 14+1);
        System.out.println(Lasd);





    }
}
