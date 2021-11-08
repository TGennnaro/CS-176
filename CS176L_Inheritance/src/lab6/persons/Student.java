package lab6.persons;

public class Student extends Person {
	private int year;
	
	public static final int FRESHMAN = 1;
    public static final int SOPHOMORE = 2;
    public static final int JUNIOR = 3;
    public static final int SENIOR = 4;
    public static final int SUPERSENIOR = 5;

	
	public void setYear(int year) {
		if (year >= 1 && year <= 5) {
			this.year = year;
		} else {
			System.out.println("Cannot set year of student. Year must be between 1 and 5.");
		}
	}
	
	public String toString() {
		return super.toString()+"\nYear: "+this.year;
	}
}
