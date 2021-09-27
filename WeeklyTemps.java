package lab2.prob1;

public class WeeklyTemps {
	private double[] weeklyTemps;
	
	public WeeklyTemps() {
		weeklyTemps = new double[] {66.1, 55.2, 4.7, 98.2, 85.3, 101.4,79.5};
	}
	
	public double getMax() {
		double max = weeklyTemps[0];
		for (double temp : weeklyTemps) {
			if (temp > max) {
				max = temp;
			}
		}
		return max;
	}
	
	public double getMin() {
		double min = weeklyTemps[0];
		for (double temp : weeklyTemps) {
			if (temp < min) {
				min = temp;
			}
		}
		return min;
	}
	
	public String getRangeStr() {
		String min = String.format("%.1f", getMin());
		String max = String.format("%.1f", getMax());
		
		return min+" - "+max;
	}
	
	public double getMean() {
		double total = 0;
		for (double temp : weeklyTemps) {
			total += temp;
		}
		return total/weeklyTemps.length;
	}
	
	public int getExtreme() {
		int total = 0;
		for (double temp : weeklyTemps) {
			if (temp <= 5 || temp >= 95) {
				total++;
			}
		}
		return total;
	}
}
