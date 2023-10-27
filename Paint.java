
//*************************************************************** 
//File: Paint.java 
// 
//Purpose: Determine how much paint is needed to paint the walls 
//of a room given its length, width, and height 
//*************************************************************** 
import java.util.Scanner;

public class Paint {
	public static void main(String[] args) {
		final int COVERAGE = 350; // paint covers 350 sq ft/gal
//declare integers length, width, and height; 
		int length, width, height;
//declare double totalSqFt; 
		double totalSqFt;
//declare double paintNeeded; 
		double paintNeeded;
//declare and initialize Scanner object 
		Scanner scan = new Scanner(System.in);
//Prompt for and read in the length of the room 
		System.out.println("Enter length of room: ");
		length = scan.nextInt();
//Prompt for and read in the width of the room 
		System.out.println("Enter width of room: ");
		width = scan.nextInt();
//Prompt for and read in the height of the room 
		System.out.println("Enter height of room: ");
		height = scan.nextInt();
//Compute the total square feet to be painted--think 
		totalSqFt = 2*(length * width)+ 2*(width*height)+ 2*(height*length);
//about the dimensions of each wall 
//Compute the amount of paint needed 
		paintNeeded = totalSqFt / COVERAGE;
		System.out.println("Paint needed: "+paintNeeded);
//Print the length, width, and height of the room and the 
//number of gallons of paint needed. 
		scan.close();
	}
}