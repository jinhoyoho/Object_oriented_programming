public class Counter
{
	private int value;
	private int max;
	
	public void setLimit(int maximum)
	{
		max = maximum; // 최대값 저장
		value = Math.min(value, max); // 최소값 반환
	}
	
	public int getValue()
	{
		return value;
	}
	
	public void click()
	{
		value = value+1; // click하면 1증가
		setLimit(3); //최대값 3으로 설정
	}
	
	public void reset()
	{
		value = 0; // 초기화
	}
}