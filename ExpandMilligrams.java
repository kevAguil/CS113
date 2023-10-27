
public class ExpandMilligrams {

	public static void main(String[] args) {
		int milligrams = 1050042;
		int kilograms = milligrams / 1000000;
		int grams = (milligrams % 1000000) / 1000;
		int milligramsleftover = (milligrams % 1000000) % 1000;
		System.out.print(milligrams + " milligrams is equivalent to " + kilograms + " kilogram(s), " + grams
				+ " grams and " + milligramsleftover + " milligrams.");

	}

}
