
import java.lang.Math;

class Point2D {
	private float x;
	private float y;
	Point2D(float x,float y) {
		this.x=x;
		this.y=y;
	}
	public float getX() {
		return this.x;
	}
	public float getY() {
		return this.y;
	}
	public String show() {
		return ("X: " + x + "Y: " + y);
	}
	public boolean isEqual(Point2D p) {
		if((this.x == p.getX()) && (this.y == p.getY()))
			return true;
		else
			return false;
	}
	public double calculateDistance(Point2D p) {
		return Math.sqrt(Math.pow((p.getX() - this.getX()), 2.0) + Math.pow((p.getY() - this.getY()), 2));
	}
}
	