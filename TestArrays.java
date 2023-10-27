import java.util.Scanner;
public class TestArrays {

	public static void main(String[] args) {
	int[] numArr= { 2, 7, 8, 3, 4, 10 };
	int target = 5;
	System.out.println(bigEven(numArr, target));
	
	

	}
	public static int[] numberFreq() {
		Scanner scan = new Scanner(System.in);
		int num;
		int[] occurences = new int[51];
		for (int c = 1; c <= 50; c++) {
			System.out.println("Enter an integer: ");
			num = scan.nextInt();
			occurences[num]++;
		}
		scan.close();
		return occurences;
		}

	
	public static int bigEven(int[]numArray, int target) {
		int counter=0;
		for (int x : numArray) {
			if(x > target && x%2==0)
				counter++;	
		}
		return counter;
	}
	
	public static int oddDie(Die[] dice) {
		int counter=0;
		for (Die d: dice) {
			d.roll();
			if(d.getFaceValue()%2!=0)
				counter++;
		}
		return counter;
	}

}