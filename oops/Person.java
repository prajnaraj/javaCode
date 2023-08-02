package oops;

public class Person extends Human{

	String name;
	
	Person(int age, String type, String name) {
		super(age, type);
		//super.age=age;
		//super.type=type;
		this.name=name;
		// TODO Auto-generated constructor stub
	}
	void display()
	{
		super.display();
		super.age= 25;
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person(15,"Asian","Baby");
		p.display();
	}

}
