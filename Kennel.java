import java.util.Scanner;
public class Kennel {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Dog dog1 = new Dog();
	Dog dog2 = new Dog();
	System.out.println("Enter name of dog 1: ");
	dog1.setDogName(scan.nextLine());
	System.out.println("Enter weight of dog 1: ");
	dog1.setDogWeight(scan.nextDouble());
	System.out.println("Enter name of dog 2: ");
	dog2.setDogName(scan.nextLine());
	System.out.println("Enter weight of dog 2: ");
	dog2.setDogWeight(scan.nextDouble());
	System.out.println("Dog1: "+dog1+" and it's weight in kgs is "+dog1.toKsg()+
			"\nDog2: "+dog2+" and it's weight in kgs is "+dog2.toKsg() );
	scan.close();
	}

}
