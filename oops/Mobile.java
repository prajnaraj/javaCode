package oops;

public class Mobile extends Device{
	 
	 int backUpTime;
	 String type;
	 
	 void restart()
	 {
	  System.out.println("Restart");
	  
	 }
	 void call()
	 {
	  System.out.println("calling");
	 }
	 // overriding 
	 void start() // declaration
	 {
	  System.out.println("mobile started"); // implementation
	 }
}