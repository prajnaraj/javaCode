package Constrots;

public class DemoTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t1= new Teacher();
		t1.display();
		
		Teacher t2= new Teacher("Efg","Math");
		t2.display();
		
		Teacher t3 = new Teacher("Xyz","Science");
		t3.display();
		
		Teacher t4= new Teacher();
		t4.name="Raj";
		t4.subject="Art";
		t4.display();
		
	}

}
