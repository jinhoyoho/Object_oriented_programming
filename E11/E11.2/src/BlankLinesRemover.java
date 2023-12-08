
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class BlankLinesRemover
{
  public static void removeLines(String fileName)
   {
      ArrayList<String> lines =  new ArrayList<>();
      
      try (Scanner in = new Scanner(new File("lines.txt")))
      {
    	  while(in.hasNextLine())
    	  {
    		  String line = in.nextLine();
    		  if (line.isEmpty())
    			  continue;
    		  lines.add(line.trim());
    	  }
      }
     
      catch (FileNotFoundException e)
      {
         e.printStackTrace();
      }
      try (PrintWriter out = new PrintWriter("lines.txt"))
      {
    	  for (int i=0; i<lines.size(); i++)
    	      {out.println(lines.get(i));}
      }
      catch (FileNotFoundException e)
      {
         e.printStackTrace();
      }
   }
}




