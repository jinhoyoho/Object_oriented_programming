import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * CSVReader is a class that reads CSV (Comma Separated Values) files and provides methods to access the data.
 */
public class CSVReader {
    List<String[]> datas;	// data를 저장할 list

    /**
     * Reads a CSV file.
     *
     * @param fileName The name of the file to read.
     * @throws FileNotFoundException if the file does not exist.
     */
    public void readFile(String fileName) throws FileNotFoundException{
        datas = new ArrayList<>();	// 새로 할당
        
        try (Scanner in = new Scanner(new File(fileName)))
        {
           
            while (in.hasNextLine()) 
            {
            	String line = in.nextLine(); // 한 줄 입력
                String[] field = line.split(",");
                datas.add(field);
            }
        }
    }

    
    /**
     * Returns the number of rows in the CSV file.
     *
     * @return The number of rows.
     */
    public int numberOfRows() {
        return datas.size();
    }

    
    /**
     * Returns the number of fields in a given row.
     *
     * @param row The row index.
     * @return The number of fields in the row.
     */
    public int numberOfFields(int row) {
        return datas.get(row).length;
    }

    
    /**
     * Returns the field at a given row and column.
     *
     * @param row The row index.
     * @param column The column index.
     * @return The field at the given row and column.
     */
    public String field(int row, int column) {
    	String line = datas.get(row)[column];
    	if (line.charAt(0) == '"') // 첫 글자가 큰 따옴표인 경우
    	{
    		line = line.substring(1, line.length()-1); // 앞 뒤 글자 제거
    	}
    	
        return line;
    }
}
