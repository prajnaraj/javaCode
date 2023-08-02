package oops;

public class AreaCircle {

	final double pi= 3.14;
	int r;
	
	void area(int r)
	{
		double a= pi*r*r;
		System.out.println("Area: "+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaCircle ac =new AreaCircle();
		ac.area(8);
	}

}
