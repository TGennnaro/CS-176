import java.util.Scanner;

public class ComboLockDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ComboLock lock = new ComboLock(32, 14, 20);
		
		while (true) {
			System.out.print("Enter number of ticks to turn to the right (0-39), or an invalid number to quit: ");
			int num1 = in.nextInt();
			
			if (num1<0 || num1>39) {break;}
			
			System.out.print("Enter number of ticks to turn to the left (0-39), or an invalid number to quit: ");
			int num2 = in.nextInt();
			
			if (num2<0 || num2>39) {break;}
			
			System.out.print("Enter number of ticks to turn to the right (0-39), or an invalid number to quit: ");
			int num3 = in.nextInt();
			
			if (num3<0 || num3>39) {break;}
			
			lock.turnRight(num1);
			lock.turnLeft(num2);
			lock.turnRight(num3);
			if (lock.open()) {
				System.out.println("The lock has been opened!");
				lock.increment();
				System.out.println("The password has changed.");
			} else {
				System.out.println("The lock has not been opened!");
			}
		}
		
		in.close();
	}

}
