package practice;

public class Car02 {
	private double fuelCost;
	private double fuelAmount;
	
	public Car02(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}
	
	public void move(int distance) {
		System.out.println(distance+ "走ります");
		this.fuelAmount -= (distance / fuelCost);
	}
	
	public double getFuelAmount() {
		
		return this.fuelAmount;
	}
	

	
}
