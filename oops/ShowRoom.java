package oops;

public class ShowRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c= new Car(); //calling car class and inherits property of vehicle class
		c.capacity="4 sitter";
		c.model="hyundai";
		c.isRunning(); //calling isRunning method of car 
		c.isStop(); // calling isStop method of Vehicle
		
		Vehicle v = new Vehicle(); //calling vehicle class 
		
		v.color="red"; 
		v.type="4 wheeler";
		v.isRuninng(); // calling isRunning method of Vehicle
		v.isStop(); // calling is Stop method of Vehicle
	}

}
