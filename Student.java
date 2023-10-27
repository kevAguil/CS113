
public class Student {
	
	private String name;
	private GPA studentGPA;
	
	public Student(String name, GPA gpa) {
		this.name = name;
		studentGPA = gpa;
	}
	public GPA getGPA() { return studentGPA; }

	public void setName(String name) { this.name=name; }
	
	public boolean honorRoll(GPA gpaRequired) {
		if(studentGPA.compareTo(gpaRequired) == 1 || studentGPA.compareTo(gpaRequired) == 0)
			return true;
		else
			return false;
	}
	public String toString() {
		return ""+name+": GPA - "+studentGPA;
	}

}




