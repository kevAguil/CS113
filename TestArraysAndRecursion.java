
public class TestArraysAndRecursion {

	public static void main(String[] args) {
		// 1.)
		System.out.println("Test 1.)");	
		int[][]arr= new int[3][3];
		initialize(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " " );
			}
			System.out.println();
		}
		System.out.println();
		
		// 2.)

		
		//3.)
		printDigits(23145);
		
		//4.)
		int[] a ={1,3,2,5};
		System.out.println(sumArray(a,4));
		

	}
	public static void initialize(int[][] arr) {
		int negative = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(j== negative)
					arr[i][j]= -1;
				else
					arr[i][j]=i+j;
			}
			negative++;
		}

	}
	public static int[] dieStats(Die[][] dice) {
		int evencounter=0;
		int[]evenarr = new int[dice.length];
		for(int i=0;i<dice.length;i++) {
			for(int j=0;j<dice[i].length;j++) {
				dice[i][j].roll();
				if(dice[i][j].getFaceValue()%2 == 0)
					evencounter++;				
			}
			evenarr[i]= evencounter;
			evencounter=0;
		}
		return evenarr;
	}
	public static void printDigits(int num) {
        int digit = num % 10;
        if (num == 0) 
            return;
        else 
            printDigits(num / 10);        
        System.out.println(digit);		
	}
	public static int sumArray(int[]numArray, int numbersToAdd) {		
		if(0 ==numbersToAdd)
			return 0;
		else
			return numArray[numbersToAdd-1]+ sumArray(numArray,numbersToAdd-1);
						
		
	}
	
	
	
	
	
	
	
	
	

	public static double[] bestInMoths(double[][] famCellBills) {
		double check=0;
		int numOfMonths = famCellBills[0].length;
		double[] bestBill = new double[famCellBills[0].length];
		for (int month=0; month< numOfMonths;month++) {
			for(int member=0; member<famCellBills.length;member++){
				if(check ==0)
					check=famCellBills[member][month];
				else if(famCellBills[member][month]< check)
					check= famCellBills[member][month];
			}
			bestBill[month]=check;
			check=0;
		}
		return bestBill;

	}
}	
	
	
	















