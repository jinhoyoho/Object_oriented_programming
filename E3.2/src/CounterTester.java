public class CounterTester
{
	public static void main(String args[])
	{
		Counter tally = new Counter();
		
		tally.click();
		tally.click();
		tally.click();
		tally.click();
		System.out.println(tally.getValue());
		tally.click();
		System.out.println(tally.getValue());
		
		tally.reset();
	}
}