public class Car 
{
    private double gas;
    private double efficiency;
    
    public Car(double anEfficiency)
    {
    	efficiency = anEfficiency; // gallon 당 몇 마일 가는지 입력
    	// gas는 자동으로 0으로
    }
    
    public void addGas(double amount)
    {
    	gas += amount; // gas 추가
    }
    
    public void drive(double distance)
    {
    	gas -= (distance / efficiency); // miles/gallon 
    }
    
    public double getGasInTank()
    {
    	return gas; // gas 반환
    }
}
