package Day4.core;
import static java.lang.Math.*;
public class Point2D {
	private double x;
	private double y;

	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public String getPointDetails() {
	 return "x = "+this.x+" y = "+y;	
	}

	public double isEqual(Point2D P1) {		
	String result = this.x==P1.x&&this.y==P1.y?"equal points":"diff points";
		System.out.println(result);
		System.out.print("distance = ");
		if(result=="equal points")
		{
			return 0;
		}
		else {
			double distance = sqrt((this.x-P1.x)*(this.x-P1.x)+(this.y-P1.y)*(this.y-P1.y));
					return distance;
		}
	}
}