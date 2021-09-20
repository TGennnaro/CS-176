import java.util.Random;

public class MagicEightBall1 {
	private String[] answers;
	
	public MagicEightBall1() {
		answers = new String[20];
		
		answers[0] = "It is certain";
		answers[1] = "It is decidedly so";
		answers[2] = "Without a doubt";
		answers[3] = "Yes definitely";
		answers[4] = "You may rely on it";
		answers[5] = "As I see it yes";
		answers[6] = "Most likely";
		answers[7] = "Outlook good";
		answers[8] = "Yes";
		answers[9] = "Signs point to yes";
		answers[10] = "Reply hazy try again";
		answers[11] = "Ask again later";
		answers[12] = "Better not tell you now";
		answers[13] = "Cannot predict now";
		answers[14] = "Concentrate and ask again";
		answers[15] = "Don't count on it";
		answers[16] = "My reply is no";
		answers[17] = "My sources say no";
		answers[18] = "Outlook not so good";
		answers[19] = "Very doubtful";
	}
	
	public String getAnswer() {
		Random generator = new Random();
		return answers[generator.nextInt(answers.length)];
	}
}
