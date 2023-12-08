
public class Instructor extends Person{
	private float salary;
	
	public Instructor(String name, int birthYear, float salary)
	{
		super(name, birthYear);
		this.salary = salary;
	}
	
	public String toString()
	{
		return "Instructor[super=" + super.toString() + ",salary=" + salary + "]" ; 
	}
}
