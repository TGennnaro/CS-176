import java.util.ArrayList;
import java.util.Scanner;

public class ColorSearch {
	
	private static ArrayList<String> Colors = new ArrayList<String>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (true) {
			System.out.print("Enter a color name, or 'Q' to quit: ");
			String input = in.nextLine();
			
			if (input.toLowerCase().equals("q"))
				break;
			
			Colors.add(input);
		}
		
		while (true) {
			System.out.print("Enter a color to search for, or 'Q' to quit: ");
			String input = in.nextLine();
			
			if (input.toLowerCase().equals("q"))
				break;
			
			SearchColor(input);
		}
		
		in.close();
	}
	
	public static void SearchColor(String color) {
		int searches = 0;
		for (String col : Colors) {
			searches++;
			if (col.toLowerCase().equals(color.toLowerCase())){
				System.out.println("The color "+color+" was found after "+searches+" search"+(searches!=1 ? "es" : ""));
				return;
			}
		}
		System.out.println("The color "+color+" was not found after "+searches+" search"+(searches!=1 ? "es" : ""));
	}

}
