package day33_CustomClass;

import java.util.ArrayList;

/*
4. write a program that can extract the sepecial characters, digits and alphebets from a string and stores them into seperate ArrayLists of Character:
			ex:
				str = "ABCD123$%#@&456EFG!";
				list1: {$, %, #, @, &, !}
				list2: {A, B, C, D, E, F, G}
				list3: {1, 2, 3, 4, 5, 6}
 */
public class ExtractChars {
    public static void main(String[] args) {

        String str = "ABCD123%&@#%6455EFG!";

        char[] arr = str.toCharArray();

        ArrayList<Character> letters = new ArrayList<>(); //isLetter
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> specialChars = new ArrayList<>();

        for (char each : arr){
            if (Character.isLetter(each)){
                letters.add(each);
            }
            if (Character.isDigit(each)){
                digits.add(each);
            }
            if (!Character.isLetterOrDigit(each)){
                specialChars.add(each);
            }

        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChars);

    }
}
