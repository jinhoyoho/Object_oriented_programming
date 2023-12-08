/**
 * The Clock class represents a clock that provides the current time.
 */
public class Clock {
	private String hour;
	private String minute;
	private String currentTime;

	/**
	 * Construct a Clock object. The current time is set to the system's current time.
	 */
	public Clock()
	{
		currentTime = java.time.LocalTime.now().toString();
		String time[] = currentTime.split(":");
		// 한 자리 수 일 경우 0을 없애주기 위해서 문자 -> 숫자 -> 문자로 받음
		// ex: 6분인 경우 06으로 나오게 됨. 위 방법을 사용하면 6으로 나옴
		hour = String.valueOf(Integer.parseInt(time[0]));
		minute = String.valueOf(Integer.parseInt(time[1]));		
	}
	
	/**
	 * Returns the current hour as a string.
	 *
	 * @return A string representing the current hour.
	 */
	public String getHours()
	{
		return hour;
	}
	
	/**
	 * Returns the current minute as a string.
	 *
	 * @return A string representing the current minute.
	 */
	public String getMinute()
	{
		return minute;
	}
	
	/**
	 * Returns the current time as a string in the format "hour:minute".
	 *
	 * @return A string representing the current time.
	 */
	public String getTime()
	{
		return getHours() + ":" + getMinute();
	}
}
