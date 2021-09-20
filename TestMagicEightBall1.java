import java.util.Scanner;

public class TestMagicEightBall1 {

	public static void main(String[] args) {
		MagicEightBall1 ball = new MagicEightBall1();
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("Enter a yes/no question (or 'exit' to stop): ");
			String question = in.nextLine();
			if (question.toLowerCase().equals("exit")) {
				break;
			}
			System.out.println("The answer is: "+ball.getAnswer());
			System.out.println();
		}
		in.close();
	}

}
