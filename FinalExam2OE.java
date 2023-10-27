
public class FinalExam2OE {

	public static void main(String[] args) {
		int [] a={2, 4, 6, 8, 10}; 
		System.out.println(recProd(a,3)); 


	}
		
	public static int recProd(int[]array, int count) {
		if(count <= 1)
			return array[count-1];
		else
			return recProd(array,count-1) * array[count-1];
	}

}

