package lab7.writtenworks;

//Novel.java: Subclass of WrittenWork

public class Novel extends WrittenWork {

 private String genre;
 private int chapters;

 // constructors:
 public Novel(String title, String author, int year, String genre, int chapters) {
     super(title, author, year);
     setGenre( genre );
     setChapters( chapters );
 }

 // accessor methods:
 /** 
     Write the getGenre method.
     @return genre of Novel
 */

	public String getGenre() {
		return genre;
	}

 /**
     Write the getChapters method.
     @return number of Novel chapters
 */

	public int getChapters() {
		return chapters;
	}

 /**
     Write the setGenre method.
     @param Novel's genre
 */

	public void setGenre(String genre) {
		this.genre = genre;
	}

 /**
     Write the setChapters method.
     @param Number of Novel chapters
 */

	public void setChapters(int chapters) {
		this.chapters = chapters;
	}

	@Override
	public String toString() {
		return "Novel [super=["+super.toString()+"], genre=" + genre + ", chapters=" + chapters + "]";
	}

} // end class
