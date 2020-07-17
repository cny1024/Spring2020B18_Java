package day41_Inheritance.Task02;
/*
Task02:
	create a class called BankAccount
			variables:  accountNumber, accountHolder, Balance
			methods: deposit, showBalance, toString
 */
public class BankAccount {

    public long accoutNumber;
    public String accountHolder;
    public double balance;

    public void deposit(int amount){
        balance += amount;
    }
    public void showBalance(){
        System.out.println("Available balance: $"+ balance);
    }
    public String toString(){
        return "Name: "+accountHolder + ", Balance: $"+balance;
    }


}
