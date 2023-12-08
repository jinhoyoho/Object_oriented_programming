/**
 * This class represents a HybridCar with various properties and methods to calculate costs.
 */
public class HybridCar{	
	/** The cost of the car. */
	private double cost; 

	/** The predicted distance that the car will drive per year. */
	private double will_drive;

	/** The estimated gas price. */
	private double cost_of_gas;

	/** The efficiency in miles per gallon. */
	private double average_miles;

	/** The estimated resale value after 5 years. */
	private double resale_value;
	
	/** The result value after 5 years*/
	private double result; // 5년동안 총 유지 비용
	
	
	/**
	 * Constructs a new HybridCar with the given parameters.
	 *
	 * @param cost The cost of a new car
	 * @param will_drive The estimated miles driven per year
	 * @param cost_of_gas  The estimated gas price
	 * @param average_miles  The efficiency in miles per gallon
	 * @param resale_value  The estimated resale value after 5 years
	 */
	public HybridCar(double cost, double will_drive, double cost_of_gas, double average_miles, double resale_value) 
	{
		// 생성자
		this.cost = cost;	// 차량 비용
		this.will_drive = will_drive;	// 예측 거리
		this.cost_of_gas = cost_of_gas;	// gallon당 gas의 비용
		this.average_miles = average_miles;	// 차의 평균 gallon당 miles
		this.resale_value = resale_value;	// 중고가격
	}
	
	
	/**
     * Calculates and returns the total costs including purchase price,
     * gas costs for 5 years and deducts the resale value.
     *
     * @return result The total costs after 5 years. 
     */
	public double getResult() 
	{
		// 구입 비용 + 5년동안 달린 거리 / gallon당 miles * gallon당 gas 비용 + 중고 비용
		// 5년동안 달린 거리 / gallon당 miles 를 하면 5년동안 몇 gallon을 사용했는지 알 수 있다.
		// 5년동안 사용한 총 gallon을 gallon당 gas의 비용을 곱하면 gas의 총 비용을 알 수 있다.
		result = cost + (will_drive*5) / average_miles * cost_of_gas - resale_value;
		return result;
	}
	
	
	/** Returns the initial purchase price of the car. 
	 * @return cost The cost of a new car
	 * */	
	public double getCost() { return this.cost; }
	
	/** Returns the projected annual mileage for the car. 
	 * @return will_drive The estimated miles driven per year
	 * */	
	public double getWillDrive() { return this.will_drive; }
	
	/** Returns the current price of gas (per gallon). 
	 * @return cost_of_gas The estimated gas price
	 * */	
	public double getCostOfGas() { return this.cost_of_gas; }
	
	/** Returns fuel efficiency rating for vehicle (miles per gallon). 
	 * return average_miles The efficiency in miles per gallon
	 * */	
	public double getAverageMiles() { return this.average_miles; }
	
	/** Returns projected value of vehicle after five years of ownership. 
	 * @return resale_value The estimated resale value after 5 years
	 * */	
	public double getResaleValue() { return this.resale_value; }

	
	/**
	* Sets a new purchase price for vehicle
	*
	*@param  newCost New purchase price for vehicle
	*/
	public void setCost(double newCost) { this.cost = newCost;}
	
	
	/**
	* Sets a new projected annual mileage for vehicle
	*
	*@param newWillDrive New projected annual mileage for vehicle
	**/
	public void setWillDrive(double newWillDrive) {this.will_drive=newWillDrive;}

		
	/**
	* Sets a current price of gas (per gallon)
	*
	*@param newGasPrice Current price of gas (per gallon)
	*/
	public void setCostOfGas(double newGasPrice){this.cost_of_gas=newGasPrice;}

	
	/**
	* Sets fuel efficiency rating for vehicle (miles per gallon)
	*
	*@param avgMileage Fuel efficiency rating for vehicle (miles per gallon)
	*/
	public void setAverageMileage(double avgMileage){this.average_miles=avgMileage;}

	/**
	* Sets projected value of vehicle after five years of ownership
	*
	*@param newresaleValue Projected value of vehicle after five years of ownership
	*/
	public void setResaleValue(double newresaleValue){this.resale_value=newresaleValue;}
}