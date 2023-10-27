
public class Line extends Figure {
	
	private Point a, b;
	
	public Line(Point a, Point b) {
		super("Line");
		this.a=a;
		this.b=b;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name=n;
	}
	
	public void setPointA(Point a) {
		this.a=a;
	}
	
	public void setPointB(Point b) {
		this.b=b;
	}
	
	public Point getPointA() {
		return a;
	}
	
	public Point getPointB() {
		return b;
	}
	
	public boolean equals(Line other) {
		return a.distance(b) == other.getPointA().distance(other.getPointB());
	}
	
	public double perimeter() {
		return a.distance(b);
	}
	
	public String toString() {
		return "Line "+a+" "+b;
	}
}
