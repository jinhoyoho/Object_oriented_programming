import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class FileHello{
	public static void main(String[] args) {
		try(Scanner in = new Scanner(new File("hello.txt")))
		{
			if(in.hasNextLine()) {
				String message = in.nextLine();
				System.out.println(message);
			}else {
				System.out.println("File is empty or no more lines");
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try (PrintWriter out = new PrintWriter("hello.txt")){
			out.println("Hello, World!");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}