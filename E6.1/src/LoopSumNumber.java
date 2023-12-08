import java.util.Scanner;

public class LoopSumNumber{
	public static void main(String args[]) 
	{	
		int even_sum = 0;
		
		for(int x=0; x<=100; x += 2)
		{
				even_sum += x; // 짝수 더하기
		}
		
		System.out.println("The even sum is " + even_sum);
		System.out.println();
		
		int square_sum = 0;
		
		for(int x=0; x<=100; x++)
		{
			square_sum += x*x;
		}
		
		System.out.println("The square num is " + square_sum);
		System.out.println();
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a: ");
		int a = in.nextInt();
		System.out.print("Enter b: ");
		int b = in.nextInt();
		
		int odd_sum = 0;
		
		for(int x = a; x<=b; x++)
		{
			if(x%2 == 1) 
			{
				odd_sum += x;
			}
		}
		
		System.out.println("The odd sum is " + odd_sum);
		System.out.println();
		
		System.out.print("Enter an integer number: ");
		int digit = in.nextInt();
		int odd_digit = 0;
		
		while(digit>0)
		{
			if ((digit%10) % 2 == 1) // 홀수라면
			{
				odd_digit += (digit%10);
			}
			digit /= 10;
		}
		
		System.out.println("The odd digit sum is " + odd_digit);
	}
}