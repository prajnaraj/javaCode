package oops;

public class Animal {
	int age; String type;
	
	void showDetails()
	{
		System.out.println("age = "+age);
		System.out.println("type = "+type);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		a.showDetails();
	}

}
