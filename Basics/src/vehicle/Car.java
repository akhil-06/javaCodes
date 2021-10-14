package vehicle;

public class Car extends Vehicle {
	
	int numGears;
	boolean isConvertible;
	
	public Car(int numGears, int maxSpeed) {
	//	super(100);
		super(maxSpeed);
		this.numGears = numGears;
		System.out.println( "car constructor");
	}


	// suppose we change print car to print
	//public void print() {
	public void printCar() {
		super.print();
//		System.out.println(" Car color : " + color);
//		System.out.println("Car speed : " + getmaxSpeed());
		System.out.println(" Car numGears : " + numGears);
		System.out.println(" Car isonvertible : " + isConvertible);
	}

}
