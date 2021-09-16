import java.util.Scanner;
public class ValidTriangles {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input = "";
		final String SENTINEL = "-1";
		
		while (!input.equals(SENTINEL)) {
			System.out.print("Enter the three integer edges of a triangle (-1 to quit): ");
			input = in.nextLine();
			
			if (input.equals(SENTINEL)) {in.close(); return;}
			
			String[] stringEdges = input.split(" ");
			
			int[] edges = new int[3];
			
			for (int i=0;i<stringEdges.length;i++) {
				edges[i] = Integer.parseInt(stringEdges[i]);
			}
			
			if (edges[0]+edges[1]>edges[2] && edges[0]+edges[2]>edges[1] && edges[1]+edges[2]>edges[0]) {
				System.out.println("That is a valid triangle.");
				continue;
			}
			System.out.println("That is not a valid triangle.");
		}
		
		in.close();
	}

}
