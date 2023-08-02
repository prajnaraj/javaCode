package Constrots;

public class Teacher {

	String name;
	String subject;
	
	Teacher()
	{
		name="abc";
		subject="english";

	}
	Teacher(String name1,String subject1)
	{
		name=name1;
		subject=subject1;
	}
	void display()
	{
		System.out.println(name);
		System.out.println(subject);
	}

}
