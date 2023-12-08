import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RowsOfNumbers
{

    public static void main(String[] args) throws FileNotFoundException
    {
        System.out.println ("This program reads variable-length lines of numbers from a file 'data.txt'");
        System.out.println ("and prints the line along with the average.");
        File infile = new File("data.txt");
        Scanner in = new Scanner(infile);
        int rowNumber = 1;
        while (in.hasNextLine())
        {
        	int count = 0; // 숫자개수
       	    double sum = 0; // 합
            
       	    System.out.printf("Row %d \t", rowNumber);
       	 
       	    String line = in.nextLine();	// 한 줄 입력
       	    
       	    Scanner sub_in = new Scanner(line);
       	   
       	    
       	    while (sub_in.hasNext())
       	    {
       	    	count += 1;
       	    	double num =  Double.parseDouble(sub_in.next());
       	    	System.out.printf("%.1f ", num);
       	    	sum += num;
       	    }


       	    if(count == 0)
       	    {
       	    	System.out.println(" average is 0.0");
       	    }
       	    else
       	    {
       	    	System.out.printf("\t average is %.1f", sum/count);
       	    }
             
             rowNumber += 1;
             
             System.out.println();
        }

    }

}

