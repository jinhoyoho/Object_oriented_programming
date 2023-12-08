/**
 * This class represents a Triangle with three coordinates and methods to calculate distance, area, angle.
 */
public class Triangle{
	/** The coordinate of x1. */
	private double x1;
	/** The coordinate of y1. */
	private double y1;
	/** The coordinate of x2. */
	private double x2;
	/** The coordinate of y2. */
	private double y2;
	/** The coordinate of x3. */
	private double x3;
	/** The coordinate of y3. */
	private double y3; // 삼각형 좌표 저장
	
	/** The distance of side1. */
	private double d1;
	/** The distance of side2. */
	private double d2;
	/** The distance of side3. */
	private double d3; // 세 변의 길이 저장
	
	/** The area of triangle. */
	private double area; // 넓이 저장
	
	/** The angle1 of triangle. */
	private double ang1;
	/** The angle2 of triangle. */
	private double ang2;
	/** The angle3 of triangle. */
	private double ang3; // 세 각을 저장
	
	
	/**
	 * Constructs a new Triangle with the given parameters.
	 *
	 * @param newx1 The coordinate of x1
	 * @param newy1 The coordinate of y1
	 * @param newx2 The coordinate of x2
	 * @param newy2 The coordinate of y2
	 * @param newx3 The coordinate of x3
	 * @param newy3 The coordinate of y3
	 */
	public Triangle(double newx1, double newy1, double newx2, double newy2, double newx3, double newy3)
	{
		this.x1 = newx1;
		this.y1 = newy1;
		this.x2 = newx2;
		this.y2 = newy2;
		this.x3 = newx3;
		this.y3 = newy3;
	    
	    calDistance(newx1,newy1,newx2,newy2,newx3,newy3);
	    calArea(newx1,newy1,newx2,newy2,newx3,newy3);
	    calAngle(newx1,newy1,newx2,newy2,newx3,newy3);
	}
	
	
	/**
	 * Calculate the length of each of the three sides of a triangle.
	 * 
	 * @param x1 The coordinate of x1
	 * @param y1 The coordinate of y1
	 * @param x2 The coordinate of x2
	 * @param y2 The coordinate of y2
	 * @param x3 The coordinate of x3
	 * @param y3 The coordinate of y3
	 */
	public void calDistance(double x1, double y1, double x2, double y2, double x3, double y3){
		d1 = Math.round(Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2, 2)) * 100)/100.0;
		d2 = Math.round(Math.sqrt(Math.pow(x2-x3,2)+Math.pow(y2-y3, 2)) * 100)/100.0;
		d3 = Math.round(Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3, 2)) * 100)/100.0;
	}
	
	/**
	 * Calculate the area of a triangle.
	 * 
	 * @param x1 The coordinate of x1
	 * @param y1 The coordinate of y1
	 * @param x2 The coordinate of x2
	 * @param y2 The coordinate of y2
	 * @param x3 The coordinate of x3
	 * @param y3 The coordinate of y3
	 */
	public void calArea(double x1, double y1, double x2, double y2, double x3, double y3) {
		area = Math.round((Math.abs((x1*y2+x2*y3+x3*y1)-(x1*y3+x2*y1+x3*y2)) / 2.0) * 100) / 100.0;
	}
	
	/**
	 * Calculate the angle of a triangle.
	 * 
	 * @param x1 The coordinate of x1
	 * @param y1 The coordinate of y1
	 * @param x2 The coordinate of x2
	 * @param y2 The coordinate of y2
	 * @param x3 The coordinate of x3
	 * @param y3 The coordinate of y3
	 */
	public void calAngle(double x1, double y1, double x2, double y2, double x3, double y3) {
		// cos 제 2법칙으로 cos 계산
		double cos_a = (Math.pow(d1,2) + Math.pow(d2, 2) - Math.pow(d3, 2)) / (2*d1*d2);
		double cos_b = (Math.pow(d2,2) + Math.pow(d3, 2) - Math.pow(d1, 2)) / (2*d2*d3);
		double cos_c = (Math.pow(d3,2) + Math.pow(d1, 2) - Math.pow(d2, 2)) / (2*d3*d1);
		
		// arc cos으로 각도 계산
		ang1 = Math.acos(cos_a);
		ang2 = Math.acos(cos_b);
		ang3 = Math.acos(cos_c);
	}
	
	/**
	 * Print x and y coordinates with index.
	 */
	public void printVertex() {
		String nx1 = String.format("%.2f", x1);
		String nx2 = String.format("%.2f", x2);
		String nx3 = String.format("%.2f", x3);
		String ny1 = String.format("%.2f", y1);
		String ny2 = String.format("%.2f", y2);
		String ny3 = String.format("%.2f", y3);
		
		System.out.println();
		System.out.println("---------------------");
		System.out.println("| index |  x  |  y  |");
		System.out.println("---------------------");
		System.out.println("|   1   | "+nx1+"| "+ ny1+"|");
		System.out.println("---------------------");
		System.out.println("|   2   | "+nx2+"| "+ ny2+"|");
		System.out.println("---------------------");
		System.out.println("|   3   | "+nx3+"| "+ ny3+"|");
	}
	
	
	/**
	 * Print length and angle with index.
	 */
	public void printLengthAngle() {
		String nd1 = String.format("%.2f", d1);
		String nd2 = String.format("%.2f", d2);
		String nd3 = String.format("%.2f", d3);
		String nang1 = String.format("%.2f", ang1);
		String nang2 = String.format("%.2f", ang2);
		String nang3 = String.format("%.2f", ang3);
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("| index | length | angle |");
		System.out.println("--------------------------");
		System.out.println("|   1   |    "+nd1+"|   "+nang1+"|");
		System.out.println("--------------------------");
		System.out.println("|   2   |    "+nd2+"|   "+nang2+"|");
		System.out.println("--------------------------");
		System.out.println("|   3   |    "+nd3+"|   "+nang3+"|");
	}
	
	/**
	 * Print perimeter and area of triangle.
	 */
	public void printPeriArea() {
		String nperi = String.format("%.2f", d1+d2+d3);
		String narea = String.format("%.2f", area);
		
		System.out.println();
		System.out.println("--------------------");
		System.out.println("| perimeter | Area |");
		System.out.println("--------------------");
		System.out.println("|      "+nperi+"|  "+narea+"|");
	}
	
	/**
	 * Returns the x-coordinate of the first point.
	 *
	 * @return The x-coordinate of the first point.
	 */
	public double getx1() {return this.x1;}
	
	/**
	 * Returns the x-coordinate of the second point.
	 *
	 * @return The x-coordinate of the second point.
	 */
	public double getx2() {return this.x2;}
	
	/**
	 * Returns the x-coordinate of the third point.
	 *
	 * @return The x-coordinate of the third point.
	 */
	public double getx3() {return this.x3;}
	
	/**
	 * Returns the y-coordinate of the first point.
	 *
	 * @return The y-coordinate of the first point.
	 */
	public double gety1() {return this.y1;}
	
	/**
	 * Returns the y-coordinate of the second point.
	 *
	 * @return The y-coordinate of the second point.
	 */
	public double gety2() {return this.y2;}
	
	/**
	 * Returns the y-coordinate of the third point.
	 *
	 * @return The y-coordinate of the third point.
	 */
	public double gety3() {return this.y3;}
	
	/**
	 * Returns the distance of the first side.
	 *
	 * @return The distance of the first side.
	 */
	public double getd1() {return this.d1;}
	
	/**
	 * Returns the distance of the second side.
	 *
	 * @return The distance of the second side.
	 */
	public double getd2() {return this.d2;}
	
	/**
	 * Returns the distance of the third side.
	 *
	 * @return The distance of the third side.
	 */
	public double getd3() {return this.d3;}
	
	/**
	 * Returns the area of the triangle.
	 *
	 * @return The area of the triangle.
	 */
	public double getarea() {return this.area;}
	
	/**
	 * Returns the first angle of the triangle.
	 *
	 * @return The first angle of the triangle.
	 */
	public double getang1() {return this.ang1;}
	
	/**
	 * Returns the second angle of the triangle.
	 *
	 * @return The second angle of the triangle.
	 */
	public double getang2() {return this.ang2;}
	
	/**
	 * Returns the third angle of the triangle.
	 *
	 * @return The third angle of the triangle.
	 */
	public double getang3() {return this.ang3;}
	
	
	/**
	* Sets the x-coordinate of the first point.
	* Recalculate distance, width, and angle with changed variables.
	*
	*@param  newx1 New x-coordinate of the first point.
	*/
	public void setx1(double newx1) { 
		this.x1 = newx1;
		calDistance(x1,y1,x2,y2,x3,y3);
	    calArea(x1,y1,x2,y2,x3,y3);
	    calAngle(x1,y1,x2,y2,x3,y3);
	}
	
	/**
	* Sets the x-coordinate of the second point.
	* Recalculate distance, width, and angle with changed variables.
	*
	*@param  newx2 New x-coordinate of the second point.
	*/
	public void setx2(double newx2) { 
		this.x2 = newx2;
		calDistance(x1,y1,x2,y2,x3,y3);
	    calArea(x1,y1,x2,y2,x3,y3);
	    calAngle(x1,y1,x2,y2,x3,y3);
	    }
	
	/**
	* Sets the x-coordinate of the third point.
	* Recalculate distance, width, and angle with changed variables.
	*
	*@param  newx3 New x-coordinate of the third point.
	*/
	public void setx3(double newx3) { this.x3 = newx3;
	calDistance(x1,y1,x2,y2,x3,y3);
    calArea(x1,y1,x2,y2,x3,y3);
    calAngle(x1,y1,x2,y2,x3,y3);}
	
	/**
	* Sets the y-coordinate of the first point.
	* Recalculate distance, width, and angle with changed variables.
	*
	*@param  newy1 New y-coordinate of the first point
	*/
	public void sety1(double newy1) { this.y1 = newy1;
	calDistance(x1,y1,x2,y2,x3,y3);
    calArea(x1,y1,x2,y2,x3,y3);
    calAngle(x1,y1,x2,y2,x3,y3);}
	
	/**
	* Sets the y-coordinate of the second point.
	* Recalculate distance, width, and angle with changed variables.
	*
	*@param  newy2 New y-coordinate of the second point
	*/
	public void sety2(double newy2) { this.y2 = newy2;
	calDistance(x1,y1,x2,y2,x3,y3);
    calArea(x1,y1,x2,y2,x3,y3);
    calAngle(x1,y1,x2,y2,x3,y3);}
	
	/**
	* Sets the y-coordinate of the third point.
	* Recalculate distance, width, and angle with changed variables.
	*
	*@param  newy3 New y-coordinate of the third point
	*/
	public void sety3(double newy3) { this.y3 = newy3;
	calDistance(x1,y1,x2,y2,x3,y3);
    calArea(x1,y1,x2,y2,x3,y3);
    calAngle(x1,y1,x2,y2,x3,y3);}
}