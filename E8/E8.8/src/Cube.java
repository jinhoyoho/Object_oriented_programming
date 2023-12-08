
public class Cube {
	public static double cubeVolume(double h)
	{
		return Math.pow(h, 3);	// 정육면체의 부피
	}
	
	public static double cubeSurface(double h)
	{
		return Math.pow(h, 2)*6;	// 정육면체의 면적
	}
}
