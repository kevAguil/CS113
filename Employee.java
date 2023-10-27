
public class Employee extends StaffMember implements Payable
{
	protected String socialSecurityNumber;
	protected double payRate;

	public Employee(String eName, String eAddress, String ePhone,
			String socSecNumber, double rate)
	{
		super(eName, eAddress, ePhone);
		socialSecurityNumber = socSecNumber;
		payRate = rate;
	}

	public String toString()
	{
		String result = super.toString();
		result += "\nSocial Security Number: " + socialSecurityNumber;
		return result;
	}
	  
	public int vacation() {
		   int vacation = 10;
		   return vacation;
	}
	
	public double pay()
	{
		return payRate;
	}
}
