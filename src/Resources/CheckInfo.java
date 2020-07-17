package Resources;


import day39_AccessModifiers.PersonalInfo;

public class CheckInfo {
    public static void main(String[] args) {
        System.out.println("Name " + PersonalInfo.name); //public static
        System.out.println("Gender " + PersonalInfo.gender);//public static

        //System.out.println("Age " + PersonalInfo.grade);//static

        //System.out.println("SSN "+PersonalInfo.SSN); //Private
    }
}
