package car;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double car1Price = 15000;
		double car2Price = 30000;
		double pricePerGallon = 4;
		double milesDriven = 50000;
		double mpg1 = 10;
		double mpg2 = 50;
		
		
		double gasCost1 = (milesDriven / mpg1) * pricePerGallon;
		double totalCost1 = car1Price + gasCost1;
		
		double gasCost2 = (milesDriven / mpg2) * pricePerGallon;
		double totalCost2 = car2Price + gasCost2;
		
		if (totalCost1 < totalCost2){
			System.out.println("Car 1 is the better deal " + totalCost1);
		}
		else{
			System.out.println("Car 2 is the better deal " + totalCost2);
		}

	}

}
