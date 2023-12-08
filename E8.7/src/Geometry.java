
public class Geometry {
	public static double cubeVolume(double h)
	{
		return Math.pow(h, 3);	// 정육면체의 부피
	}
	
	public static double cubeSurface(double h)
	{
		return Math.pow(h, 2)*6;	// 정육면체의 면적
	}
	
	public static double sphereVolume(double r)
	{
		return (4.0/3.0) * Math.PI * Math.pow(r, 3); 
	}
	
	public static double sphereSurface(double r)
	{
		return 4.0 * Math.PI * Math.pow(r, 2);
	}
	
	public static double cylinderVolume(double r, double h)
	{
		return Math.PI * Math.pow(r, 2) * h;
	}
	
	public static double cylinderSurface(double r, double h)
	{
		return Math.PI * Math.pow(r, 2) * 2 + 2 * Math.PI * r * h;
	}
	
 	public static double coneVolume(double r, double h)
 	{
 		return (1.0/3.0) * Math.PI * Math.pow(r, 2) * h; 
 	}
 	
	public static double coneSurface(double r, double h)
	{
		return Math.PI * r * r + Math.PI * r * Math.sqrt(r * r + h * h);
	}
}
