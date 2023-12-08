import java.util.Scanner;

public class MileageDemo{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double number_of_gallon;
		double fuel_efficiency;
		double price_of_gas;
		
		System.out.print("Enter the number of gallons of gas in the tank:");
		number_of_gallon = in.nextDouble(); // gas 입력
	    System.out.print("Enter the fuel efficiency (miles per gallon):");
	    fuel_efficiency = in.nextDouble(); // 효율 입력
	    System.out.print("Enter the price of gas per gallon (in US $):");
	    price_of_gas = in.nextDouble();
	    
	    System.out.print("To drive 100 miles, it will cost $");
	    System.out.println(Math.round(price_of_gas / fuel_efficiency * 100 * 100)/100.0 + ".");
	 
	    System.out.print("The car can currently drive a maximum of ");
	    System.out.println(number_of_gallon * fuel_efficiency + " miles.");
	}
}