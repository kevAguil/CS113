import java.util.Scanner;
import java.util.Random;
public class NameApp {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		String firstName, lastName;
		System.out.print("Please enter your first name: ");
		firstName = scan.nextLine();
		System.out.print("Please enter your last name: ");
		lastName = scan.nextLine();
		String username = lastName.substring(0, 1);
		username = username.concat(firstName.substring(0, 3));
		username = username + generator.nextInt(51);
		System.out.print("Recommended Username: " + username);
		scan.close();
	}

}
