package lab4.fraction;

public class FractionTester {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(2,5);
		Fraction f2 = new Fraction(3,5);
		Fraction f3 = new Fraction();
		
		System.out.println(f3.subtract(f1,  f2).toString());
	}

}
