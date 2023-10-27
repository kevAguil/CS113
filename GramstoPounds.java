import java.util.Scanner;

public class GramstoPounds {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float grams;
		System.out.println("Enter an amount of grams" + " to be converted to pounds:");
		grams = scan.nextFloat();
		double pounds = grams / 453.592;
		System.out.print("Pounds = " + pounds);
		scan.close();
	}

}
