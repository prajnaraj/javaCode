package MethodsExample;

public class MethodDivOvrLD {
	
	static int div(int a, int b)
	{
		int val=a/b;
		return val;
	}
	static double div(double a,double b)
	{
		double division= a/b;
		return division;
	}
	static double div(double a, double b, double c)
	{
		double answer= a/b/c;
		return answer;
	}
	
	static int div(int a, int b, int c)
	{
		int answer= a/b/c;
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(div(4,2));
		System.out.println(div(2.5,2.2));
		System.out.println(div(6,3,1));
		System.out.println(div(6.0,2.0,1.0));
		
		
	}

}
