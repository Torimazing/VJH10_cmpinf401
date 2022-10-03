// Bank class
public class Bank {
     public static void main(String[] args) {
        double balance = 10;
        double targetBalance = 20;
        int year = 0;
        InterestCalculator ic = new InterestCalculator();
	
		while (balance < targetBalance) {
			year++;
			balance += ic.calculateInterest(balance);
		}
		
		System.out.println("You will accumulate " + targetBalance + " after " + 
					year + " years.");
	     }

}
