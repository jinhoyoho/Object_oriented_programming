import java.util.Scanner;
/**
 * The TerrainTester class is a class that tests the functionality of the Terrain class.
 * It reads a 10x10 array of height values from the user, constructs a Terrain object with these heights,
 * and prints a series of flood maps for water levels ranging from the minimum to the maximum height in ten steps.
 */
public class TerrainTester {
	/**
	 * main method reads a user input, constructs a Terrain object,
	 * and divide into 10 steps using the maximum minimum value
	 * 
	 * @param args the command line arguments (not used)
	 */
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		double[][] heights = new double[10][10];	// 입력을 저장할 array
		
		System.out.print("Enter height values:");
		
		for (int i=0; i<10; i++) {
			for(int j=0; j<10; j++)
			{
				heights[i][j] = in.nextDouble();	// 높이 입력
			}
		}
		
		Terrain terrain = new Terrain(heights);		// 객체 생성
		
		double minheight = terrain.getMin();
		double maxheight = terrain.getMax();
		double increment = (maxheight - minheight) / 9.0;	// 10 단계로 나누기
		
		for (int i=0; i < 10; i++)	// 10번 진행
		{
			terrain.printFloodMap(minheight + increment * i);	// waterlevel 설정
		}
	}
}
