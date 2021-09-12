
public class CashRegister {
	private double purchase;
	private double payment;
	
	public CashRegister() {
		purchase = 0;
		payment = 0;
	}
	
	public void recordPurchase(double amount) {
		purchase += amount;
	}
	
	public void receivePayment(double amount) {
		payment += amount;
	}
	
	public double giveChange() {
		return payment-purchase;
	}
	
	// These functions allow me to access payment and purchase from outside the class.
	public double getPaymentTotal() {
		return payment;
	}
	
	public double getPurchaseTotal() {
		return purchase;
	}
}
