
public class Person implements Measurable{
	public double tall;
	public String name;
	
	public Person(String name, double tall)
	{
		this.tall = tall;
		this.name = name;
	}
	
	public double getMeasure()
	{
		return tall;
	}
	
	public int compareTo(Object otherObject)
	{
		Person other = (Person) otherObject;
		
		if (tall < other.tall) { return -1;}
		if (tall > other.tall) {return 1;}
		return 0;
	}
	
	public String getName()
	{
		return name;
	}
}
