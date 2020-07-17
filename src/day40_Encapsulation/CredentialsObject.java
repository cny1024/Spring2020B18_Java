package day40_Encapsulation;

public class CredentialsObject {

    public static void main(String[] args) {

        Credentials facebook = new Credentials();

        facebook.setUserName("cny1024");
        facebook.setPassWord("cny1024!1!");

        System.out.println(facebook.getUserName());// before set null, after set cny1024
        System.out.println(facebook.getPassWord());//before set null, after set cny1024!1!


    }

}
