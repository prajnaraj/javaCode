package oops;

public class CurrentAccount {
	private int Salary;
	final int ACCNo = 123243;
	String name;
	
	public void setBalance(int salary)
	{
		this.Salary = salary;
		
		
	}
public int getBalance()
	
	{
		return Salary;
	}
public String display(String name)
	{
		System.out.println("Name:"+name);
		System.out.println("ACCNo: "+ACCNo);
		return name;
	}

}
