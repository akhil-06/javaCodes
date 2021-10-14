package vehicle;

public class Vehicle {
	protected String color;
	private int maxsSpeed;
	
	public Vehicle(int maxSpeed) {
		this.maxsSpeed = maxSpeed;
		System.out.println("Vehicle constructor");
		
	}
	
	public int getmaxSpeed() {
		return maxsSpeed;
	}
	
	public void setmaxSpeed(int maxSpeed) {
		this.maxsSpeed = maxSpeed;
	}


	public void print() {
		System.out.println(" Vehicle color : " + color);
		System.out.println(" Vehicle speed : " + maxsSpeed);

	}
}
