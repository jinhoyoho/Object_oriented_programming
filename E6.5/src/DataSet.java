public class DataSet
{
	private double sum;
	private double smallestValue;
	private double largestValue;
	private int n;
	
	public DataSet() // 변수 초기화
	{
		sum = 0;
		smallestValue = Double.MAX_VALUE;
		largestValue = 0;
		n = 0;
	}
	
	public void add(double x)
	{
		n+=1; // count 증가
		sum += x; // sum 증가
		
		if (smallestValue > x) // x가 작으면
		{
			smallestValue = x; // 최소값 변경
		}
		
		if (largestValue < x) // x가 크면
		{
			largestValue = x;
		}
	}
	
	public double getSmallest() {
		return smallestValue;
	}
	
	public double getLargest()
	{
		return largestValue;
	}
	
	public double getAverage()
	{
		return sum / getCount();
	}
	
	public double getRange() // 범위
	{
		return largestValue - smallestValue;
	}
	
	public int getCount()
	{
		return n;
	}
	
}