package MethodsExample;

public class MethodOverlodSum {
	// overloading

			 static int sum(int a, int b)
			 {
			  int ans = a+b;
			  return ans;
			  
			 }
			 // overloading

			 static double sum(double d1, double d2)
			 {
			  double ans = d1+d2;
			  return ans;
			 }
			 // overloading

			 static int sum(int a, int b, int c)
			 {
			  int ans = a+b+c;
			  return ans;
			  

	
		 }
		 public static void main(String[] args) {
		  // TODO Auto-generated method stub

		  System.out.println(sum(10, 20));
		  System.out.println(sum(10.22, 20.13));
		  System.out.println(sum(30, 20));
		 // int a = sum(10, 20, 10);
		 //System.out.println(a);
		  System.out.println(sum(34,10,10));
		  
		 }

		
	}


