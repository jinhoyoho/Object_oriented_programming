import java.util.Scanner;

public class HybridCarTester {
	public static void main(String args[]) {
		Scanner keyIn = new Scanner(System.in); // 입력
		
		System.out.print("What was the cost of the car? ");
		double cost = keyIn.nextDouble(); // car의 비용 입력
		
		System.out.print("How many miles per year will you drive the car? ");
		double will_drive = keyIn.nextDouble(); // car의 년마다 에측 mile 입력
		
		System.out.print("What is the cost of a gallon of gas? ");
		double cost_of_gas = keyIn.nextDouble();
		
		System.out.print("How many miles per gallon does the car average? ");
		double average_miles = keyIn.nextDouble();
		
		System.out.print("What was the resale value of the car after five years? ");
		double resale_value = keyIn.nextDouble();
		
		HybridCar car = new HybridCar(cost, will_drive, cost_of_gas, average_miles, resale_value);
		
		System.out.print("The total cost of ownership is "+car.getResult());
	}
}
