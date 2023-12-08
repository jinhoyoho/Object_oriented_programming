import java.util.Arrays;
import java.util.Random;

public class SortedSequence
{
   /**
      Makes an array with n random values between 0-99.
      @param n the number of tosses to simulate
      @return an array with n random die tosses in it
   */
   public int[] generateRandom(int n)
   {
	   Random Generator = new Random();
	   int[] data = new int[20]; // 20개의 배열 생성
	   
	   for (int i=0; i<20; i++)
	   {
		   data[i] = Generator.nextInt(100); // 0부터 99까지
	   }
	   
	   return data;
   }
	
   /**
    * Prints an array.
    * @param values the array to print
    */
   
	public void printArray(int[] values)
	{
		 for(int i=0; i<20; i++)
		 {
			 System.out.print(values[i] + " ");
		 }
		 
		 System.out.println();
	}
	
	public static void main(String[] args)
	{
	   SortedSequence util = new SortedSequence();
	
	   int[] values = util.generateRandom(20);
	   
	   util.printArray(values);
	   
	   Arrays.sort(values);
	   
	   util.printArray(values);
	 }
}
