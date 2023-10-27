
public class TestDie {

	public static void main(String[] args) {
		//create 2 dice
		Die die1 = new Die();
		Die die2 = new Die(3);
		System.out.println(die1 +", "+die2);
		//roll them
		die1.roll();
		die2.setFaceValue(5);
		//print face value if possible
		System.out.print(die1 +", "+die2);
		System.out.println("");
		Die die3 = new Die();
		int count = 0;
		for (int num=1; num <= 100; num++) {
			die3.roll();
		   if (die3.getFaceValue() == 3)
		      count++;
		}
		System.out.println(count);

	}

}
