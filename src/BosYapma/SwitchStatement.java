package BosYapma;

public class SwitchStatement {
    public static void main(String[] args) {
        int age;
        age = 25;

        switch (age){
            case 1 :
                System.out.println(" you can crawl");
                break;
            case 2 :
                System.out.println("you can talk");
                break;
            case 3 :
                System.out.println("you can get in trouble");
                break;
            default:
                System.out.println("you are older then 3");
                break;
        }
    }

}
