import java.util.Scanner;
public class TestMethods {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	MyMethods test = new MyMethods();
	Die die1 = new Die();
	Die die2 = new Die();
	int width,height,length;
	System.out.println("Enter width: ");
	width = scan.nextInt();
	System.out.println("Enter height: ");
	height = scan.nextInt();
	System.out.println("Enter length: ");
	length = scan.nextInt();
	System.out.println("Surface Area: "+ test.surface(height, width, length));
	System.out.println("Die1: "+die1+"\nDie2: "+die2+"\nAverage of the 2 dice is: "
			+test.avgFaceValue(die1, die2));
	scan.close();

	}

}
