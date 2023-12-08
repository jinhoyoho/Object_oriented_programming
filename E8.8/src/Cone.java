
public class Cone {
	public static double coneVolume(double r, double h)
 	{
 		return (1.0/3.0) * Math.PI * Math.pow(r, 2) * h; 
 	}
 	
	public static double coneSurface(double r, double h)
	{
		return Math.PI * r * r + Math.PI * r * Math.sqrt(r * r + h * h);
	}
}
