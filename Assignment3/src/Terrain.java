/**
 * Terrain class represents a two-dimensional array of values that give the height of a terrain at different points in a square.
 */
public class Terrain {
	private double[][] heights; // 높이 저장
	
	/**
     * Construct a Terrain class.
     * @param heights two-dimensional array representing the heights of the terrain.
     */
	public Terrain(double[][] heights)
	{
		this.heights = heights;		// 그대로 복사
	}
	
	
	/**
     * Get the minimum height from the terrain.
     * @return minimum height
     */
	public double getMin() {
		double minheight = heights[0][0];	// 가장 처음 값 저장
		
		for (double[] height_row: heights)	// row 한 개씩 검사
		{
			for(double height : height_row)	// 모든 row 검사
			{
				if (minheight > height)	// heights가 더 작을 경우
				{
					minheight = height;
				}
			}
		}
		
		System.out.println("Lowest Height: " + minheight);
		
		return minheight;
	}
	
	
	/**
     * Get the maximum height from the terrain.
     * @return maximum height
     */
	public double getMax() {
		double maxheight = heights[0][0];	// 가장 처음 값 저장
		
		for (double[] height_row: heights)	// row 한 개씩 검사
		{
			for(double height : height_row)	// 모든 row 검사
			{
				if (maxheight < height)	// heights가 더 클 경우
				{
					maxheight = height;
				}
			}
		}
		
		System.out.println("Highest Height: " + maxheight);
		
		return maxheight;
	}
	
	
	/**
     * Print the flood map, showing which of the points in the terrain would be flooded if the water level was the given value.
     * @param waterLevel water level.
     */
	public void printFloodMap(double waterLevel)
	{
		System.out.println("Water Level: "+waterLevel);
		
		for (double[] height_row: heights)	// row 한 개씩 검사
		{
			for(double height : height_row)	// 모든 row 검사
			{
				if (height < waterLevel)	// heights가 더 클 경우
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  "); // 빈칸
				}
			}
			System.out.println();	// 다음줄
		}
	}
}
