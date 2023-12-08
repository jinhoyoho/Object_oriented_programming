import java.util.Scanner;

public class SodaCanTester{
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the height of sodacan:");
		double height = in.nextDouble(); // 높이 입력
		
		System.out.print("Please enter the diameter of sodacan:");
		double diameter = in.nextDouble(); // 지름 입력
		
		SodaCan soda = new SodaCan(height, diameter); // Sodacan class 생성
		
		System.out.print("Volume: ");
		System.out.println(soda.getVolume());
		System.out.print("Surface Area: ");
		System.out.println(soda.getSurfaceArea());
	}
}