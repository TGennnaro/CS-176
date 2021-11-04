/**
   This program demonstrates the measurable Country class.
*/
public class MeasurableTester
{
   public static void main(String[] args)
   {
	  Measurable[] accounts = new Measurable[3];
	  accounts[0] = new BankAccount(1000);
	  accounts[1] = new BankAccount(1500);
	  accounts[2] = new BankAccount(500);
	  double avgBal = Data.average(accounts);
	  double maxBal = Data.max(accounts);
	  System.out.println("Average balance: "+avgBal);
	  System.out.println("Max balance: "+maxBal);
	  
      Measurable[] countries = new Measurable[3];
      countries[0] = new Country("Uruguay", 176220);
      countries[1] = new Country("Thailand", 513120);
      countries[2] = new Country("Belgium", 30510);

      double maxCountry = Data.max(countries);
      System.out.println("Maximum area: " + maxCountry);
      System.out.println("Expected: 513120");
   }
}
