import java.util.Scanner;

public class MaxOfThree{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please Enter three numbers: ");
		
		double num1 = in.nextDouble();
		double num2 = in.nextDouble();
		double num3 = in.nextDouble();
		
		double maxvalue;
		
		if ((num1 > num2) && (num1 > num3)) {
			maxvalue = num1;
		}
		else if ((num2 > num3) && (num2 > num1)) {
			maxvalue = num2;
		}
		else {
			maxvalue = num3;
		}
		
		System.out.println("The largest number is "+ maxvalue + "."); // 가장 큰 수 출력
	}
}