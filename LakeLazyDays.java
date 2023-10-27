import java.util.Scanner;
public class LakeLazyDays {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int temp;
	System.out.println("Enter today's temperature: ");
	temp = scan.nextInt();
	if(temp>95 || temp<20)
		System.out.println("Visit our shops!");
	else if(temp>=80)
		System.out.println("Go swimming!");
	else if(temp>=60 && temp<80)
		System.out.println("Go play some tennis!");
	else if(temp>=40 && temp<60)
		System.out.println("Go play some golf!");
	else if(temp<40)
		System.out.println("Go skiing!");
	scan.close();

	}

}
