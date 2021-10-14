package vehicle_temp;

import vehicle.Vehicle;

public class truck extends Vehicle {
	
	int maxLoadingCapacity;
	
	public void print() {
		
		System.out.println("truck capacity : " + maxLoadingCapacity);
		System.out.println("truck color : " + color);
		
		System.out.println("truck speed :" + getmaxSpeed());
	}
	
	

}
