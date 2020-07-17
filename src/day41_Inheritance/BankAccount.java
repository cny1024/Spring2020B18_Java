package day41_Inheritance;
/*
create costum class called BankAccount for Bank of America' bank accounts:
			public variables:  bankName, firstName, lastName
	 		private variables: accountHolder, accountNumber, balance
	 		encapsulate all the private data
	 				(DO NOT USE SHORTCUT)
	 		create a constructor that can initialize firstName and fullName
	 				(DO NOT USE SHORTCUT)
	 		action:
	 				depositing
	 				withdrawing
	 				availablebalance
	 				toString: returns the full name and balance
 */
public class BankAccount {

    static String bankName = "Bank of America";

    public String firstName;
    public String lastname;

    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount(String firstName, String lastname){
        this.firstName=firstName;
        this.lastname = lastname;
        this.accountHolder = firstName+ " "+lastname; //Line 30*
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder){ // we dont have to set account holder. Because we already did it in line 30
        this.accountHolder=accountHolder;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void depositing(int amount){
        //balance += amount;
        setBalance(balance+amount);
    }
    public void withdrawing(int amount){
        //setBalance(balance-amount);
        balance -= amount;
    }
    public void checkBalance(){
        System.out.println("Available Balance: "+getBalance());
    }

    public String toString(){
        return "Full Name: "+ getAccountHolder()+ ", Balance: $"+ getBalance();
    }
}
