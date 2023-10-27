import java.util.Scanner;
import java.util.Random;
public class CircleTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		Point point1 = new Point(generator.nextInt(25)+1,generator.nextInt(25)+1);
		Point point2 = new Point(0,0);
		System.out.println("Enter a radius: ");
		Circle circle1 = new Circle(point2,scan.nextInt());
		Circle circle2 = new Circle(point1, 10);
		System.out.println("Circle1 Summary: "+ circle1 + "\nCircle2 Summary: "+
		circle2);
		if (circle1.equal(circle2))
			System.out.println("Distace between the 2 centers: "+point1.distance(point2));
		System.out.println("Average area: "+ (circle1.area()+circle2.area())/2);
		scan.close();
	}

}
  