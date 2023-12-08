/**
 * The WorldClockDemo class demonstrates the usage of the Clock and WorldClock classes.
 * It creates an instance of each class and prints the current time for each clock.
 * For the WorldClock instance, the time is adjusted based on the specified offset.
 */
public class WorldClockDemo {
	
	/**
	 * The main method of the WorldClockDemo class.
	 * It creates a Clock instance and prints the current time.
	 * Then it creates a WorldClock instance with an offset of -14 and prints the adjusted time.
	 *
	 * @param argv An array of String arguments. Not used in this method.
	 */
	public static void main(String[] argv)
	{
		Clock c = new Clock();
		
		System.out.println("Base Time in Current Time-Zone");
		
		System.out.println("Hours: " + c.getHours());
		System.out.println("Minutes: " + c.getMinute());
		System.out.println("Time: " + c.getTime());
		System.out.println();
		
		WorldClock wc = new WorldClock(-14);
		System.out.println("Hours: " + wc.getHours());
		System.out.println("Minutes: " + wc.getMinute());
		System.out.println("Time: " + wc.getTime());
		System.out.println();
	}
}
