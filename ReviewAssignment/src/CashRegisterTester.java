import java.util.Scanner;
public class CashRegisterTester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		CashRegister register = new CashRegister();
		
		double input = 0;
		while (input != -1) {
			System.out.print("Enter a purchase amount, or -1 to stop: ");
			
			input = in.nextDouble();
			if (input > 0) { // Make sure they don't input a negative number.
				register.recordPurchase(input);
			}
		}
		
		if (register.getPurchaseTotal() <= 0) { // If the purchase never goes over 0, then there is no payment.
			System.out.println("Purchase total is $0. No payment necessary.");
			in.close();
			return;
		}
		
		boolean needsMore = false; // variable allows us to print one message the first time and another message the rest of the time.
		while (register.getPaymentTotal() < register.getPurchaseTotal()) { // If they have not given sufficient funds to accommodate the purchase...
			if (needsMore) {
				System.out.print("Insufficient payment given. Add more funds: $");
			} else {
				System.out.print("Enter payment: $");
				needsMore = true;
			}
			
			double payment = in.nextDouble();
			register.receivePayment(payment);
		}
		
		System.out.printf("Your change is: $%.2f", register.giveChange());
		
		in.close();
	}

}
