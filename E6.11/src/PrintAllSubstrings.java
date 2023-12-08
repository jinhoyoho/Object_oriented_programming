import java.util.Scanner;

public class PrintAllSubstrings
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = in.next(); // 단어 입력
		
		for (int i = 1; i<word.length()+1; i++)
		{
			for (int j=0; j < word.length()-i+1; j++)
			{
				System.out.println(word.substring(j, j+i));
			}
		}
		int value = 3;
		System.out.printf("%5d", value);
	}
}