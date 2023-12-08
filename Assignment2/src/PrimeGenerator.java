/**
 * The PrimeGenerator class generates prime numbers.
 */
public class PrimeGenerator{
	private int curr_num; // 현재 변수
	
	/**
	 * Constructs a PrimeGenerator object.
	 * The current number is initialized to 1.
	 */
	
	public PrimeGenerator()
	{
		curr_num = 1; // 1부터 시작
	}
	
	/**
	 * Generates the next prime number.
	 * 
	 * @return next prime number.
	 */
	public int nextPrime()
	{
		do {
			curr_num += 1; // 1 증가
		}while(!isPrime(curr_num)); // 소수일 때 까지 반복
		
		return curr_num;
	}
	
	/**
	 * Checks if a number is prime.
	 * 
	 * @param num the number to check prime.
	 * @return true if the number is prime, else false.
	 */
	public boolean isPrime(int num)
	{
		for(int i=2; i < num; i++)
		{
			if (num % i == 0)	// 나누어 떨어지는 수가 있다면
				{return false;}	// 소수가 아님
		}
		
		return true;	// 소수
	}
	
	/**
	 * Get the current number.
	 * 
	 * @return the current number
	 */
	public int getCurr_num()
	{
		return curr_num;
	}
}