import java.util.Scanner;

public class SequenceOfValues
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		DataSet data = new DataSet();
		
		System.out.println("Enter a set of floating-point values. Enter anything other than a number to indicate the end of the series:");
		
		while(in.hasNextDouble())
		{
			double input = in.nextDouble();
			data.add(input);
		}
		
		System.out.println("The average of the values is: " + data.getAverage());
		System.out.println("The smallest value is " + data.getSmallest());
		System.out.println("The largest value is " + data.getLargest());
		System.out.println("The range is " + data.getRange());
	}
}