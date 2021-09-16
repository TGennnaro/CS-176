import java.util.Scanner;

public class CashRegisterTester
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CashRegister register = new CashRegister();
        
        double input = 0;
        final int SENTINEL = -1;
        
        while (input != SENTINEL){
            System.out.println("Total Purchase Total: "+register.getPurchaseTotal());
            System.out.print("Enter purchase amount, or "+SENTINEL+" to stop: ");
            
            input = in.nextDouble();
            
            if (input == SENTINEL){continue;}
            
            register.recordPurchase(input);
        }
        
        System.out.print("Enter your payment: ");
        double payment = in.nextDouble();
        register.receivePayment(payment);
        
        while (register.getPaymentTotal() < register.getPurchaseTotal()){
            System.out.println("Insufficient funds. Have $"+register.getPaymentTotal()+"... Need $"+register.getPurchaseTotal());
            
            System.out.print("Enter additional funds: ");
            payment = in.nextDouble();
            register.receivePayment(payment);
        }
        
        System.out.println("Your change is: $"+register.giveChange());
        
        in.close();
    }
}
