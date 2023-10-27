
public class Course {
	
	private StudentFE[]stdList;
	private int[] stats;
	
	public Course(int size) {
		stdList= new StudentFE[size];
		stats = new int[10];
		for(int i=0; i<size;i++) {
			stdList[i]=new StudentFE((int)(Math.random()*100+1));
			if(stdList[i].getFinalScore()>90)
				stats[stdList[i].getFinalScore()-91]++;
					
		}
	}

}
