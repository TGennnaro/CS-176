
public class Medals {

	public static void main(String[] args) {
		final int COUNTRIES = 8;
		final int MEDALS = 3;
		
		String[] countries = {
				"Canada",
				"Italy",
				"Germany",
				"Japan",
				"Kazakhstan",
				"Russia",
				"South Korea",
				"United States"
		};
		int[][] counts = {
				{0, 3, 0},
				{0, 0, 1},
				{0, 0, 1},
				{1, 0, 0},
				{0, 0, 1},
				{3, 1, 1},
				{0, 1, 0},
				{1, 0, 1}
		};
		
		System.out.printf("%-14s %-13s %-13s %-13s %-14s", "Country", "Gold", "Silver", "Bronze", "Total");
		System.out.println();
		
		for (int i = 0; i < COUNTRIES; i++) {
			System.out.printf("%-15s", countries[i]);
			int total = 0;
			for (int j = 0; j < MEDALS; j++) {
				total += counts[i][j];
				System.out.printf("%-14d", counts[i][j]);
			}
			System.out.printf("%-14d", total);
			System.out.println();
		}
		
		System.out.println("---------------------------------------------------------------");
		System.out.printf("%-15s", "Total");
		
		int medalTotal = 0;
		
		for (int i = 0; i < MEDALS; i++) {
			int total = 0;
			for (int j = 0; j < COUNTRIES; j++) {
				total += counts[j][i];
			}
			medalTotal += total;
			System.out.printf("%-14d", total);
		}
		System.out.print(medalTotal);
		
	}

}
