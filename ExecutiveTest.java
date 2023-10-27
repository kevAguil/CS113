import java.util.Scanner;
public class ExecutiveTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int invalidBonus = 0;
		double totalPay = 0;
		double awardBonus = 0;
		String eName;
		String eAddress;
		String ePhone;
		String socSecNumber;
		double rate;
		System.out.println("Enter number of executives: ");
		int size= scan.nextInt();
		Executive[] staff = new Executive[size];
		for(int c=0;c<staff.length;c++) {
			System.out.println("Enter name: ");
			eName = scan.nextLine();
			System.out.println("Enter address: ");
			eAddress = scan.nextLine();
			System.out.println("Enter phone number: ");
			ePhone = scan.nextLine();
			System.out.println("Enter SSN ");
			socSecNumber = scan.nextLine();
			System.out.println("Enter pay rate: ");
			rate = scan.nextDouble();
			staff[c]=new Executive(eName, eAddress, ePhone, 
					socSecNumber, rate);
			try {
				System.out.println("Enter awardBonus:");
				awardBonus = scan.nextDouble();
				staff[c].awardBonus(awardBonus);
			}
			catch (BonusTooLowException problem) {
				System.out.println("Bonus cannot be lower than 2000.");
				invalidBonus++;

			}
			totalPay = rate + awardBonus;

		}
		System.out.println("Invalid amount of bonus: "+invalidBonus);
		System.out.println("Validated amount of bonus: "+ (staff.length - invalidBonus));
		System.out.println("Average pay: "+ (totalPay/staff.length));
		scan.close();
	}

}
