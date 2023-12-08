import java.util.Arrays;

public class Sequence
{
	private int[] values;
	
	public Sequence(int size)
	{
		values = new int[size];
	}
	
	public void set(int i, int n)
	{
		values[i] = n;
	}
	
	public int get(int i)
	{
		return values[i];
	}
	
	public int size()
	{
		return values.length;
	}
	
	public boolean equals(Sequence other)
	{
		for(int i=0; i<size();i++)
		{
			if (values[i] != other.values[i]) // 같지 않다면
				return false;
		}
		
		return true; // 같으므로
	}
	
}