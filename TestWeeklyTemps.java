package lab2.prob1;

public class TestWeeklyTemps {

	public static void main(String[] args) {
		WeeklyTemps lastWeek = new WeeklyTemps();
		
		System.out.println("Weekly temperature data (degrees F):");
		System.out.printf("Mean: %.1f", lastWeek.getMean());
		System.out.println();
		System.out.println("Range: "+lastWeek.getRangeStr());
		System.out.println("Extreme Temperature Days: "+lastWeek.getExtreme());
	}

}
