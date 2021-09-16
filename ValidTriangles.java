import java.util.Scanner;
public class ValidTriangles {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (true) {
			System.out.print("Enter the three integer edges of a triangle (-1 to quit): ");
			int edge1 = in.nextInt();
			
			if (edge1 == -1) {in.close(); break;}
			
			int edge2 = in.nextInt();
			int edge3 = in.nextInt();
			
			if (edge1 == 0 || edge2 == 0 || edge3 == 0) {
				System.out.println("Invalid edge inputs.");
				continue;
			}
			
			if (edge1+edge2>edge3 && edge1+edge3>edge2 && edge2+edge3>edge1) {
				System.out.println("That is a valid triangle.");
				continue;
			}
			System.out.println("That is not a valid triangle.");
		}
	}

}
