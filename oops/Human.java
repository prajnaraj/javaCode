package oops;

public class Human {

	int age;
	String type;
	Human(int age,String type)
	{
		this.age=age;
		this.type=type;
	}
	void display()
	{
		System.out.println("Age: "+age);
		System.out.println("Type: "+type);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h = new Human(25,"Asian");
		h.display();
	}

}
