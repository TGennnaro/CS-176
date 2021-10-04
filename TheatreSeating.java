package lab3.prob1;

import java.util.Scanner;

public class TheatreSeating {
	
	private final int ROWS = 9;
	private final int COLUMNS = 10;
	private int[][] seats = new int[ROWS][COLUMNS];
	
	public TheatreSeating() {
		int[][] seatPrices = {
				{30, 40, 50, 50, 50, 50, 50, 50, 40, 30},
				{20, 30, 30, 30, 40, 50, 40, 30, 30, 20},
				{20, 20, 30, 30, 40, 40, 30, 30, 20, 20},
				{10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
				{10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
				{10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
				{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
				{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
				{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
			};
		for (int i=0;i<ROWS;i++) {
			for (int j=0;j<COLUMNS;j++) {
				seats[i][j] = seatPrices[i][j];
			}
		}
	}
	
	public int getRows() {
		return this.ROWS;
	}
	
	public int getColumns() {
		return this.COLUMNS;
	}
	
	public void showSeats() {
		System.out.printf("%-4s%-4s%-4s%-4s%-4s%-4s%-4s%-4s%-4s%-4s%-4s", "", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println();
		for (int i=0;i<ROWS;i++) {
			System.out.print(i+1+"   ");
			for (int j=0;j<COLUMNS;j++) {
				int seat = seats[i][j];
				if (seat == 0) {
					System.out.printf("%-4s", "");
				} else {
					System.out.printf("%-4d", seat);
				}
			}
			System.out.println();
		}
	}
	
	public int getSeatPrice(int row, int column) {
		return seats[row][column];
	}
	
	public boolean isSeatAvailable(int row, int column) {
		return seats[row][column] != 0;
	}
	
	public void prepareSeatLocation(int row, int column) {
		int seatPrice = getSeatPrice(row, column);
		
		if (!this.isSeatAvailable(row, column)) {
			System.out.println("That seat is unavailable.");
			return;
		}
		System.out.println("That seat is available, and you purchased it for: $"+seatPrice);
		purchaseSeat(row, column);
	}
	
	public void purchaseSeat(int row, int column) {
		seats[row][column] = 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		TheatreSeating theatre = new TheatreSeating();
		
		outerloop: // Labeling loop (Found via StackOverflow), used to continue later
		while (true) {
			theatre.showSeats();
			
			System.out.print("Choose seat by location or price? (1 = location, 2 = price, 0 = quit): ");
			int input = in.nextInt();
			
			if (input == 0) {
				System.out.println("Thank you, have a nice day.");
				break;
			}
			
			if (input == 1) {
				System.out.print("Enter row: ");
				int row = in.nextInt()-1;
				
				System.out.print("Enter column: ");
				int column = in.nextInt()-1;
				
				if (row >= theatre.getRows() || row < 0 || column >= theatre.getColumns() || column < 0) {
					System.out.println("Invalid seat input.");
					continue;
				}
				
				theatre.prepareSeatLocation(row, column);
			} else if (input == 2) {
				System.out.print("Enter the price of your seat (Price list: 10, 20, 30, 40, 50): ");
				int price = in.nextInt();
				
				for (int i=0;i<theatre.getRows();i++) {
					for (int j=0;j<theatre.getColumns();j++) {
						if (theatre.getSeatPrice(i, j) == price) {
							System.out.println("You have bought the seat at row "+(i+1)+", column "+(j+1)+" for $"+price);
							theatre.purchaseSeat(i, j);
							continue outerloop; // Continue the loop with label 'outerloop'. Found via StackOverflow
						}
					}
				}
				
				System.out.println("No seat could be found for that price.");
			}
		}
		
		in.close();
	}

}
