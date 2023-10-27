import java.util.Scanner;

public class ExecutiveTest2 {

	public static void main(String[] args) throws BonusTooLowException {
		Scanner scan = new Scanner(System.in);
		String eName;
		String eAddress;
		String ePhone;
		String socSecNumber;
		double rate;
		double awardBonus;
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
			System.out.println("Enter awardBonus:");
			awardBonus = scan.nextDouble();
			staff[c].awardBonus(awardBonus);
		}
		scan.close();

	}

}
