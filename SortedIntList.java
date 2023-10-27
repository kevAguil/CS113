
public class SortedIntList extends IntList {

	public SortedIntList(int size) {
		super(size);

	}

	public void add(int value) {
		int temp;
		if (numElements == list.length) 
			System.out.println("Can't add, list is full"); 
		else
		{ 
			list[numElements] = value; 
			numElements++; 
		}	
		if(numElements !=0) {
			if(list[numElements]< list[numElements-1]) {
				temp=list[numElements-1];
				list[numElements-1]=list[numElements];
				list[numElements]=temp;
			}

		}

	}

}
