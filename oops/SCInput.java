package oops;
import java.util.Scanner;
public class SCInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		String userName = sc.nextLine();
		System.out.println("Hello "+userName);
		System.out.println("enter age: ");
		int age = sc.nextInt();
		System.out.println("Age is : "+age);
		
		if(age>18) {
			System.out.println("Allowed to Vote");
		}
		else
		{
			System.out.println("Not allowed to vote");
		}
		sc.close();
	}

}
