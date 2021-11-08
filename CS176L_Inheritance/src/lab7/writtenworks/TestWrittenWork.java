package lab7.writtenworks;

public class TestWrittenWork {

	public static void main(String[] args) {
		Novel n1 = new Novel("My Novel", "Tyler Gennaro", 2021, "Adventure", 18);
		ShortStory s1 = new ShortStory("My Short Story", "Tyler Gennaro", 2020, "Horror", 4, true);
		System.out.println(n1);
		System.out.println(s1);
	}

}
