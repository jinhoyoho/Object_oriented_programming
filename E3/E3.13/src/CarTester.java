public class CarTester
{
	public static void main(String args[])
	{
		Car myHybrid = new Car(50); // 50miles per gallon
		myHybrid.addGas(20); // 20gas 추가
		myHybrid.drive(100); // 100마일 주행
		double gasLeft = myHybrid.getGasInTank(); // 남아있는 gas
		
		System.out.print("Gas Left: ");
		System.out.println(gasLeft);
	}
}