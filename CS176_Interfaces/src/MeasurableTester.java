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
	  System.out.println("Expected: 1000");
	  System.out.println("Max balance: "+maxBal);
	  System.out.println("Expected: 1500");
	  
	  System.out.println();
	  
      Measurable[] countries = new Measurable[3];
      countries[0] = new Country("Uruguay", 176220);
      countries[1] = new Country("Thailand", 513120);
      countries[2] = new Country("Belgium", 30510);
      double avgCountry = Data.average(countries);
      double maxCountry = Data.max(countries);
      System.out.println("Average area: "+avgCountry);
      System.out.println("Expected: 239950");
      System.out.println("Maximum area: " + maxCountry);
      System.out.println("Expected: 513120");
      
      System.out.println();
      
      Measurable[] quizzes = new Measurable[5];
      quizzes[0] = new Quiz(95);
      quizzes[1] = new Quiz(80);
      quizzes[2] = new Quiz(90);
      quizzes[3] = new Quiz(50);
      quizzes[4] = new Quiz(75);
      System.out.println("Average quiz score: "+Data.average(quizzes));
      System.out.println("Expected: 78");
      System.out.println("Maximum quiz score: "+Data.max(quizzes));
      System.out.println("Expected: 95");
   }
}
