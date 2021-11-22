import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
   Opens a file, removes any blank lines, reopens it, and prints the non-blank lines to the file.
*/
public class BlankLinesRemover
{
   /**
      Removes blank lines from the file given as argument and writes the non-blank lines
      back to the file.
      @param fileName the name of the file to be processed.
   */
	public static void removeLines(String fileName) throws FileNotFoundException
	{
		try {
			File inputFile = new File(fileName);
			PrintWriter outputFile = new PrintWriter(fileName);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File was not found.");
		}
	}
}
