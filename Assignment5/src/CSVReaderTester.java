import java.io.FileNotFoundException;
/**
 * The CSVReaderTester class is a class that tests the functionality of the CSVReader class.
 * It reads a CSV(Comma Separated Values) File and print the results.
 */
public class CSVReaderTester {
	/**
     * The main method that runs the test.
     *
     * @param args Command line arguments. Not used in this program.
     */
    public static void main(String[] args) {
        CSVReader reader = new CSVReader();
        try {
            reader.readFile("att2021.csv");
            System.out.println("Number of rows: " + reader.numberOfRows());
            System.out.println("Expected: 214");
            System.out.println();
            
            System.out.println("Number of fields in one row: " + reader.numberOfFields(0));
            System.out.println("Expected: 7");
            System.out.println();
            
            System.out.println("Row 10, Col 1: " + reader.field(9, 0));
            System.out.println("Expected: 3/12/2020");
            System.out.println();
            
            System.out.println("Row 10, Col 2: " + reader.field(9, 1));
            System.out.println("Expected: 24.87");
            System.out.println();
            
            System.out.println("Row 10, Col 3: " + reader.field(9, 2));
            System.out.println("Expected: 24.95");
            System.out.println();
            
            System.out.println("Row 10, Col 4: " + reader.field(9, 3));
            System.out.println("Expected: 24.87");
            System.out.println();
            
            System.out.println("Row 10, Col 5: " + reader.field(9, 4));
            System.out.println("Expected: 24.95");
            System.out.println();
            
            System.out.println("Row 10, Col 6: " + reader.field(9, 5));
            System.out.println("Expected: 217500");
            System.out.println();
            
            System.out.println("Row 10, Col 7: " + reader.field(9, 6));
            System.out.println("Expected: average:\"22.64\"");
            System.out.println();
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
