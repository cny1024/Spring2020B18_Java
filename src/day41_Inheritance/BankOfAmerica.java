package day41_Inheritance;

public class BankOfAmerica {

    public static void main(String[] args) {

        BankAccount person1 = new BankAccount("Naci","Yildirim");
        person1.setBalance(100);
        person1.depositing(1200);
        person1.withdrawing(200);
        person1.checkBalance();
        System.out.println(person1.getAccountHolder());
        System.out.println(person1);

    }

}
