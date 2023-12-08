import java.util.Scanner;

/**
 * The PrimePrinter class prints prime number up to a given upper limits.
 */
public class PrimePrinter{
	/**
	 * main method reads a user input, constructs a Prime Generator object,
	 * and prints the primes
	 * 
	 * @param args the command line arguments (not used)
	 */
	public static void main(String args[])
	{
		PrimeGenerator primegenerator = new PrimeGenerator(); // 객체 생성
		
		Scanner in = new Scanner(System.in); // Scanner 생성
		
		System.out.print("Enter upper limit: ");
		int input_num = in.nextInt();	// 숫자 입력
		
		int prime_num = primegenerator.nextPrime();
		
		while(prime_num <= input_num)
		{
			System.out.print(prime_num + " ");
			prime_num = primegenerator.nextPrime();
		}
	}
}