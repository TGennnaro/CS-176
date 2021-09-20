public class Main {

	public static void main(String[] args) {
		double[] values = {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
		
		double largest = values[0];
		int negatives = 0;
		
		for (double i : values) {
			System.out.print(i+" ");
			
			if (i > largest) {
				largest = i;
			}
			if (i < 0) {
				negatives++;
			}
		}
		System.out.println();
		System.out.println("The maximum value in the array is "+largest+".");
		System.out.println("There are a total of "+negatives+" negative values in the array.");
	}

}
