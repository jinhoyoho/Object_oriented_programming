public class Counter
{
   private int value;

   public int getValue()
   {
      return value;
   }

   public void click()
   {
      value = value + 1;
   }

   public void reset()
   {
      value = 0;
   }

   public void undo()
   {
      value = Math.max(value - 1, 0);
   }
}
