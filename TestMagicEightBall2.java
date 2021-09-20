import java.util.Scanner;

public class TestMagicEightBall2 {

	public static void main(String[] args) {
		MagicEightBall2 ball = new MagicEightBall2();
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("Enter a yes/no question ('exit' to stop, 'list' to list possible answers): ");
			String question = in.nextLine();
			if (question.toLowerCase().equals("exit")) {
				break;
			}
			if (question.toLowerCase().equals("list")) {
				ball.listAnswers();
				continue;
			}
			System.out.println("The answer is: "+ball.getAnswer());
			System.out.println();
		}
		in.close();
	}

}
