import java.util.Scanner;
public class NameAverage {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);	
		float average;
		String student1, student2, student3, student4;
		System.out.print("Enter Student name 1: ");
		student1 = scan.nextLine();
		System.out.print("Enter Student name 2: ");
		student2 = scan.nextLine();
		System.out.print("Enter Student name 3: ");
		student3 = scan.nextLine();
		System.out.print("Enter Student name 4: ");
		student4 = scan.nextLine();
		average = (student1.length() + student2.length() + 
				student3.length() + student4.length())/4;
		System.out.println("Name average length is " + average);
		System.out.print("Initials: " + student1.substring(0, 1)+ student2.substring(0, 1)
		+ student3.substring(0, 1)+ student4.substring(0, 1));
		scan.close();
	}

}
