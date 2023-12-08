public class Employee{
	private String name;
	private double salary;
	
	public Employee(String employeeName, double currentSalary)
	{
		name = employeeName;	// 이름
		salary = currentSalary;	// 봉급
	}
	
	public String getName() 
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void raiseSalary(double byPercent)
	{
		salary *= (1+0.01*byPercent); // 퍼센트로 입력
	}

}
