package ClassObj;

public class Box {

	int length;
	int breadth;
	int height;
	int r;
	
	void area()
	{
		int area= length*breadth;
		System.out.println("Area of rectangle= "+area);

	}
	
	void volumn()
	{
		int volumn=length*breadth*height;
		System.out.println("volumn of rectangle= "+volumn);
	}
	
	void areaOfSqure()
	{
		int areaSqur=2*length;
		System.out.println("Area of square= "+areaSqur);
	}
	
	void areaOfCircle()
	{
		double pi=3.14;
		double areaCir = pi*r*r;
		System.out.println("Area of circle= "+areaCir);
	}

}
