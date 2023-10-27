// ************************************************************ 
//  Circle.java 
// 
//  Print the area of a circle with two different radii 
// ************************************************************ 
import java.util.Scanner;
public class CirclePractice 
{ 
public static void main(String[] args) 
{ 
final double PI = 3.14159; 
int radius1, radius2; 
double area1, area2;
double circumference1, circumference2;
Scanner scan = new Scanner(System.in);
System.out.println("Please input radius: ");
radius1 = scan.nextInt();
area1 = PI * radius1 * radius1; 
circumference1 = 2 * PI * radius1;
System.out.println("The area of a circle with radius " + radius1 + 
" is " + area1 + " and the circumference is " + circumference1); 
System.out.println("Please input radius: ");
radius2 = scan.nextInt();
area2 = PI * radius2 * radius2; 
circumference2 = 2 * PI * radius2;
System.out.println("The area of a circle with radius " + radius2 + 
" is " + area2 + " and the circumference is " + circumference2); 
scan.close();
} 
} 