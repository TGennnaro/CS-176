/**
   A class to test the BankAccount class.
*/
public class BankAccountTester
{
   public static void main(String[] args)
   {
	   
		BankAccount harrysChecking = new BankAccount();
		final double badBal = -500;
		final double goodBal = 500;
		final double badDeposit = -100;
		final double goodDeposit = 100;
		final double badWithdraw = -200;
		final double goodWithdraw = 200;
		final double exceedsBalance = 1000;
		
		/**
		 * 	Note:
		 * 	I included extra prints under the BankAccount methods that I know will
		 * 	throw exceptions just to show that the code does not run after
		 * 	the exception is thrown.
		 * 	The extra println's have a * next to them
		 */
		
		/**
		 * Initial balance block
		 */
		  
		try {
			harrysChecking.initialBalance(badBal);
			System.out.println("Successful new account: "+badBal); // *
		} catch (IllegalArgumentException e) {
			System.out.println(e.getLocalizedMessage());
		}
		  
		try {
			harrysChecking.initialBalance(goodBal);
			System.out.println("Successful new account: "+goodBal);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		/**
		 * Deposit block
		 */
		  
		try {
			harrysChecking.deposit(badDeposit);
			System.out.println("Successful deposit: "+badDeposit); // *
		} catch (IllegalArgumentException e) {
			System.out.println(e.getLocalizedMessage());
		}

		try {
			harrysChecking.deposit(goodDeposit);
			System.out.println("Successful deposit: "+goodDeposit);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		/**
		 * Withdraw block
		 */
		
		try {
			harrysChecking.withdraw(badWithdraw);
			System.out.println("Successful withdrawal: "+badWithdraw); // *
		} catch (IllegalArgumentException e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		try {
			harrysChecking.withdraw(goodWithdraw);
			System.out.println("Successful withdrawal: "+goodWithdraw);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		try {
			harrysChecking.withdraw(exceedsBalance);
			System.out.println("Successful withdrawal: "+exceedsBalance); // *
		} catch (IllegalArgumentException e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		/**
		 * The rest of the code
		 */
		
		// Did not surround this in try/catch because the method does not throw any exceptions.
		System.out.println("Account balance is: "+harrysChecking.getBalance());
   }
}