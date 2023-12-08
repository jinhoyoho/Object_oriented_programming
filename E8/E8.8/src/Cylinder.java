
public class Cylinder {
	public static double cylinderVolume(double r, double h)
	{
		return Math.PI * Math.pow(r, 2) * h;
	}
	
	public static double cylinderSurface(double r, double h)
	{
		return Math.PI * Math.pow(r, 2) * 2 + 2 * Math.PI * r * h;
	}
}
