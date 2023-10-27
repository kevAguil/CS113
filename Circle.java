
public class Circle {
	private Point center;
	private int radius;
	
	public Circle(Point newCenter, int newRadius) {
		center = newCenter;
		radius = newRadius;
		
	}
	public Point getCenter() {
		return center;
	}
	public int getRadius() {
		return radius;
	}
	public void setCenter(Point newCenter) {
		center = newCenter;
	}
	public void setRadius(int newRadius) {
		radius = newRadius;
	}
	public boolean equal(Circle circle2r) {
		return radius == circle2r.getRadius();
	}
	public double area() {
		return Math.PI*Math.pow(radius, 2);
	}
	public String toString() {
		return "This Circle has a radius of "+radius+" and a center at "+center+
				" and an area of "+area()+" units squared";
	}
	
	
}
