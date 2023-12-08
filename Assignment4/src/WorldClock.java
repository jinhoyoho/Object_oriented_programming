/**
 * The WorldClock class represents a clock that provides the current time in a different time zone.
 * It extends the Clock class and overrides the getHours method.
 */
public class WorldClock extends Clock{
	private int offset;
	
	/**
	 * Constructs a new WorldClock instance with a specified offset.
	 * The offset represents the difference in hours from the local time zone.
	 *
	 * @param offset An integer representing the time zone offset.
	 */
	public WorldClock(int offset)
	{
		super();
		this.offset = offset;	// offset 설정
		System.out.println("World Clock Offset: " + this.offset);
	}
	
	/**
	 * Returns the current hour in the time zone specified by the offset.
	 * The returned hour is a string and is calculated by adding the offset to the current local hour.
	 * If the calculated hour is less than 0 or greater than 23, it is adjusted by adding or subtracting 24.
	 *
	 * @return A string representing the current hour in the specified time zone.
	 */
	@Override
	public String getHours()
	{
		int hour = Integer.parseInt(super.getHours()) + offset;	// String을 int로 변환
		
		if (hour < 0) // hour가 음수면
		{
			hour += 24;	// 24시간 더하기
		}
		else if (hour > 23)	// 23보다 크면
		{
			hour -= 24; // 24시간 빼기
		}
		
		return String.valueOf(hour);	// 시간을 String으로 바꾸어서 반환
	}
}
