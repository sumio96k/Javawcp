package practice;

public class Car {
	//燃費(km/L)12.5km/L
	private double fuelCost;
	//残量(L)55.0L
	private double fuelAmount;
	
	public Car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}
	
	public void move(int distance) {
		System.out.println(distance + "km 走ります");
		this.fuelAmount -= (distance / fuelCost);
	}
	
	public double getFuelAmount() {
		return this.fuelAmount;
	}
}
