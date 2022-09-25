package practice;

public class Chapter09_2 {

	public static void main(String[] args) {
		// 燃費（Km/L）
        double fuelCost = 12.5;
        // 残量（L）
        double fuelAmount = 55.0;

        Car02 car = new Car02(fuelCost, fuelAmount);

        car.move(20);
        System.out.println("残量は、" + car.getFuelAmount() + "です");
	}

}
