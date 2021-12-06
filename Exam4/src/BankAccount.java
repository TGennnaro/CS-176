
/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount
{  
   private double balance;

   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {   
      balance = 0;
   }

   /**
      Sets an initial balance.
      @param amount the initial balance
   */
   public void initialBalance(double amount)
   {   
	if (amount < 0) {
		throw new IllegalArgumentException("Cannot enter negative balance for new account: "+amount);
	}
	balance = amount;
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
	  if (amount < 0) {
		  throw new IllegalArgumentException("Cannot deposit negative amount: "+amount);
	  }
      double newBalance = balance + amount;
      balance = newBalance;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {   
      if (amount < 0) {
    	  throw new IllegalArgumentException("Cannot withdraw this amount: "+amount);
      }
      
      double newBalance = balance - amount;
      
      if (newBalance < 0) {
    	  throw new IllegalArgumentException("Withdrawal exceeds balance: "+amount);
      }	  
      
	  balance = newBalance;
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {   
      return balance;
   }
}
