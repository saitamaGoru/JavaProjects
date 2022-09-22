package wk2session2ex2;

public class Account 
{
	private double balance;
	private String name;
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	//constructor initializes name with parameter name
	public Account(String name, double balance)
	{
		this.name=name;
		this.balance=balance;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
}
