public class Executive extends Employee implements Payable
{
   private double bonus;

   public Executive(String eName, String eAddress, String ePhone,
                    String socSecNumber, double rate)
   {
      super(eName, eAddress, ePhone, socSecNumber, rate);
      bonus = 0;  // bonus has yet to be awarded
   }

   public void awardBonus(double execBonus) throws BonusTooLowException
   {
	   BonusTooLowException problem = new BonusTooLowException("Bonus cannot be lower"+
   " than 2,000");
	  if(execBonus < 2000) {
		  bonus = 0;
		  throw problem;		  
	  }
		  
      bonus = execBonus;
   }

   public double pay()
   {
      double payment = super.pay() + bonus;
      bonus = 0;
      return payment;
   }
   
   public int vacation() {
	   int vacation = 30;
	   return vacation;
   }
}
