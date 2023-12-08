public class SodaCan{
	
	private double diameter; // 지름
	private double height; // 높이
	
	public SodaCan(double h, double d) {
		diameter = d;
		height = h; // 지름이랑 높이 저장
	}
	
	public double getVolume() {
		// 부피 반환 함수
		return Math.pow((diameter/2), 2)*height*Math.PI; // 반지름 제곱의 높이
	}
	
	public double getSurfaceArea() {
		// 넓이 반환 함수
		// 밑넓이 2개 + 옆면(지름*높이)
		return Math.pow((diameter/2), 2)*2*Math.PI + Math.PI * diameter * height;
	}
}