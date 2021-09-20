import java.util.Random;

public class MagicEightBall2 {
	private String[] answers;
	
	public MagicEightBall2() {
		answers = new String[] {
			"It is certain",
			"It is decidedly so",
			"Without a doubt",
			"Yes definitely",
			"You may rely on it",
			"As I see it yes",
			"Most likely",
			"Outlook good",
			"Yes",
			"Signs point to yes",
			"Reply hazy try again",
			"Ask again later",
			"Better not tell you now",
			"Cannot predict now",
			"Concentrate and ask again",
			"Don't count on it",
			"My reply is no",
			"My sources say no",
			"Outlook not so good",
			"Very doubtful"
		};
	}
	
	public String getAnswer() {
		Random generator = new Random();
		return answers[generator.nextInt(answers.length)];
	}
	
	public void listAnswers() {
		System.out.println("All possible answers:");
		for (String item : answers) {
			System.out.println(item);
		}
	}
}
