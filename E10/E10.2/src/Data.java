public class Data
{
   /**
      Computes the average of the measures of the given objects.
      @param objects an array of Measurable objects
      @return the average of the measures
   */
   public static double average(Measurable[] objects)
   {
	   double sum = 0;
	   for (Measurable obj:objects)
	   {
		   sum = sum + obj.getMeasure();
	   }
	   if (objects.length > 0) { return sum / objects.length;}
	   else {return 0;}
   }

   /**
      Computes the maximum of the measures of the given objects.
      @param objects an array of Measurable objects
      @return the maximum of the measures, null if array is empty
   */
   public static Measurable max(Measurable[] objects)
   {
	   Measurable first = objects[0];
	   double highSore = 0;
	   
	   for (Measurable obj : objects)
	   {
		   Quiz person = (Quiz) obj;
		   if (highSore < person.getMeasure())
		   {
			   first = obj;
			   highSore = person.getMeasure();
		   }
	   }
	   return first;
   }
}
