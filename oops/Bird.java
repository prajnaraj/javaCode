package oops;
public class Bird extends Animal {
	 
	 String color;
	 int mark;
	 int a;
	 int s;
	 
	 Bird()
	 {
	  color = "Black";
	 }
	 Bird(String color)
	 {
	  this.color = color;
	 }
	 Bird(String color, int age, String type)
	 {
	  this.color = color;
	  super.age = age;
	  super.type= type;
	  }
	 
	 void showDetails()
	 {
	  super.showDetails();
	  System.out.println("Color = "+color);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b1 = new Bird(); 
		b1.showDetails();//
		  Bird b2 = new Bird("Blue", 10, "abc");
		  b2.showDetails();
	}
}
