package example;

public class OptimizedPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=23;
		boolean flag = true;
		  for(int i=2; i<num/2;i++)
		  {
		   if(num%i==0)  
		   {
		    flag = false;
		    //System.out.println("Not Prime");
		    break;
		   }
		   
		  }
		  if(flag == true)
		  {
		  System.out.println("Prime Number "); 
		  }
		  else
		  {
			  System.out.println("not a prime");
		  }
	}

}
