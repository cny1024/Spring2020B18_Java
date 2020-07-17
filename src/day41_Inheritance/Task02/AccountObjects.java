package day41_Inheritance.Task02;

public class AccountObjects {
    public static void main(String[] args) {
        CheckingAccount obj1 = new CheckingAccount();
        obj1.accountHolder = "Naci";
        obj1.deposit(2000);
        obj1.withDraw(100);
        obj1.showBalance();
        System.out.println(obj1);

        System.out.println(".=.=.=.=.=.=.=.=.=.=.=.=");

        SavingAccount obj2 = new SavingAccount();
        System.out.println(SavingAccount.interestRate);

        obj2.accountHolder="Cihad";
        obj2.deposit(120000);
        obj2.showBalance();
        System.out.println(obj2);

    }

}
