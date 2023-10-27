
public class MyMethods {

	// calculates surface area
	public int surface(int h, int w, int l ) {
		return 2*(l*w)+2*(l*h)+2*(w*h);

	}
	public double avgFaceValue(Die d1, Die d2) {
		return (d1.getFaceValue()+d2.getFaceValue())/2.0;
	}



}
