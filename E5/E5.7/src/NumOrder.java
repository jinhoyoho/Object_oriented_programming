import java.util.Scanner;

public class NumOrder{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
	
		double num1 = in.nextDouble();
		double num2 = in.nextDouble();
		double num3 = in.nextDouble();
		
		if ((num1 > num2) && (num2>num3) )
		{
			System.out.println("Decreasing!");
		}
		else if ((num1<num2) && (num2 < num3))
		{
			System.out.println("Increasing!");
		}
		else
		{
			System.out.println("Neither!");
		}
	}
}