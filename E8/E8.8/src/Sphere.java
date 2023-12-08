
public class Sphere {
	public static double sphereVolume(double r)
	{
		return (4.0/3.0) * Math.PI * Math.pow(r, 3); 
	}
	
	public static double sphereSurface(double r)
	{
		return 4.0 * Math.PI * Math.pow(r, 2);
	}
}
