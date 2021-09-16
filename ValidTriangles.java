import java.util.Scanner;
public class ValidTriangles {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input = "";
		final String SENTINEL = "-1";
		
		while (!input.equals(SENTINEL)) {
			System.out.print("Enter the three integer edges of a triangle (-1 to quit): ");
			input = in.nextLine();
			
			if (input.substring(0,1).equals(" ")) { // Make sure the first character is not a space. Throws an error.
				System.out.println("Invalid edge format.");
				continue;
			}
			
			if (input.equals(SENTINEL)) {in.close(); return;}
			
			String[] stringEdges = input.split(" ");
			
			if (stringEdges.length != 3) { // Make sure exactly 3 edges are input.
				System.out.println("Invalid edge input.");
				continue;
			}
			
			int[] edges = new int[3];
			
			for (int i=0;i<stringEdges.length;i++) {
				edges[i] = Integer.parseInt(stringEdges[i]);
			}
			
			if (edges[0]+edges[1]>edges[2] && edges[0]+edges[2]>edges[1] && edges[1]+edges[2]>edges[0]) { // Check 1+2>3, 1+3>2, and 2+3>1.
				System.out.println("That is a valid triangle.");
				continue;
			}
			System.out.println("That is not a valid triangle.");
		}
		
		in.close();
	}

}
