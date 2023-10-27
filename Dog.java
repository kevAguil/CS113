
public class Dog {
	//attributes
	private String dogName;
	private double dogWeight;

	//constructor
	public Dog(){
		dogName = "dog";
		dogWeight = 0;

	}
	//getter
	public double getDogWeight() {
		return dogWeight;
	}
	public String getDogName() {
		return dogName;
	}
	//setter
	public void setDogWeight(double weight) {
		dogWeight = weight;
	}
	public void setDogName(String name) {
		dogName = name;
	}
	public double toKsg() {
		return dogWeight * .453592;
	}
	public String toString() {
		return "The Dog's name is "+dogName+" and it weighs "+dogWeight;
	}
}
