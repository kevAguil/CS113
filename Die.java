
public class Die {
	//attributes
	private int faceValue;
	
	
	//operations
	//default constructor
	public Die() {
		roll();
	}
	
	//non-default constructor
	public Die(int face) {
		faceValue = face;
	}
	
	//roll method
	public void roll() {
		faceValue = (int)(Math.random()*6)+1;
	}
	
	//getter
	public int getFaceValue() {
		return faceValue;
	}
	//setter
	public void setFaceValue(int face) {
		faceValue = face;
	}
	
	//automatic 
	public String toString() {
		return ""+faceValue;
	}
	
	//equals method
	public boolean equals(Die other) {
		if(faceValue==other.getFaceValue())
			return true;
		else
			return false;
	}
	
	//compareTo

	

}
