//Dean Fitzgerald Bank Account

public class BankAccount {

	// fields include name, accNum, balance
	// constructors include two parameters to initialize the name and account number
	// and three parameters to initialize the field
	
	private String name;
	private int accNum;
	private double balance;
	
	public BankAccount()
	{
		String name = "Dean";
		int accNum = 1;
		int balance = 0;
	}
	private double balance(deposit,withdrawl)
	{
		double deposit;
		double withdrawl;
		balance = balance + deposit;
		balance = balance - withdrawl;
		
	}
	private double getBalance()
	{
		return balance;
	}
	private String toString()
	{
		return "Account Name: " + name + " Account Number:" + accNum + " Balance: " + balance;
		
	}
}
