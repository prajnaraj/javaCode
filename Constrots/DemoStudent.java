package Constrots;

public class DemoStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Student s1 = new Student();  // default constructor is called - automatically 

		  s1.printDetails();
		  Student s2 = new Student(12, "Rani"); // default constructor is called 

		  s2.printDetails();
		  
		  Student s3 = new Student(21, "Ravali"); // para constructor 
		  s3.printDetails();
		  s3.math=64;
		  s3.eng=90;
		  s3.sci=100;
		  s3.calMarks();
	}

}
