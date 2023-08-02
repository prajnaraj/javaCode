package Constrots;

public class Student {

	// properties // variable // attributes
	 int age;  // instance variables
	 String name;
	 int math;
	 int sci;
	 int eng;
	 int total;

	 Student()  // default constructor
	 {
	  age =0;
	  name ="Test";
	 }
	 Student(int age1, String name1) // para constructor
	 {
	  age =age1;
	  name= name1;
	 }
	 // overloading - methods can have same name but diff para or count of para
	 // method
	 void printDetails()
	 {
	  System.out.println(name);
	  System.out.println(age);
	  
	 }
	 void calMarks()
	 {
		 int sum=math+sci+eng;
		 total=(sum*100)/300;
		 System.out.println("marks="+total);
	 }
}


