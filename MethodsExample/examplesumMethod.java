package MethodsExample;

public class examplesumMethod {
	
	
	 // add 2 numbers
	 static void sum(int a, int b)//passing integer
	 {
	  int sum= a+b; //addition
	  System.out.println("Sum of a = "+a+" and b = "+b+ " sum = "+sum);//printing addition of two numbers
	  
	 }
	 //multiplication of two numbers by passing two integer in method
	static void mul(int a, int b )
	{
		int mul=a*b;
		  System.out.println("multiplication of a = "+a+" and b = "+b+ " mul = "+mul);
	}
	//Subtraction of two numbers by passing two integer in method
	static void sub(int a, int b)
	{
		int sub=a-b;
		System.out.println("Subtraction of a = "+a+" and b = "+b+ " sub = "+sub);
	}
	
	static void div(double a, double b)
	{
		double div=a/b;
		System.out.println("div of a = "+a+" and b = "+b+ " div = "+div);
	}
	
	static int add(int a,int b)
	{
		int answer= a+b;
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 sum(10, 20); // 30 // calling sum method
		  sum(20, 30); // 50 // calling sum method
		  sum(35, 10); // 45// calling sum method
		  sum(45,2); // calling sum method
		  mul(10,20);// calling multiplication  method
		  sub(50,30);// calling subtraction method
		  div(25,5);
		  int val= add(10,20);
		  System.out.println(val);
	}
	
	}


