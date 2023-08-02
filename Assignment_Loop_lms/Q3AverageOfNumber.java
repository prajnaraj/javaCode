package Assignment_Loop_lms;
import java.util.Scanner;
public class Q3AverageOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int sum = 0; 
		for (int i=1; i<=10; i++ ) { 
		    System.out.println("Enter number "+i+"th is = "); 
		    sum = sum + sc.nextInt(); 
		  
		}
		double avg = sum/10;
		System.out.println("sum is "+sum); 
		System.out.println("Avg is : "+avg);
	}

}
