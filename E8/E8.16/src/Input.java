import java.util.Scanner;

public class Input
{
   /**
      Reads an integer between a given minimum and the maximum.
      @param in the scanner to read from
      @param prompt the user prompt
      @param error the message to print when the user makes an error.
      @param min the number minimum
      @param max the number maximum
      @return the number that the user has provided
   */
   public static int readInt(Scanner in, String prompt, String error, int min, int max)
   {
	   System.out.println(prompt);
	   int readint = in.nextInt();
	   
	   while (readint < min || readint > max) // 이상한 입력시
	   {
		   System.out.println(error);
		   System.out.println(prompt);
		   readint = in.nextInt();
	   }
	   
	   return readint;
   }
}
