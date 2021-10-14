package vehicle;

public class VehicleUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v = new Vehicle(10);
	v.print();
		v.setmaxSpeed(10);
		
		
		
		Car c = new Car(10,100);
	//	c.numGears = 10;
		c.color = "Black";
		c.setmaxSpeed(100);
		c.print();
		

		
		
		

	}

}
