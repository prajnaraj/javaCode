package SimpleCode;

import java.util.Scanner;

public class Program5Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age:");
		int age = sc.nextInt();
		if (age>=18)
		{
			System.out.println("Eligible Age for VoterID");
		}
		else
		{
			System.out.println("Not Eligible for VoterID");
		}
	}

}
