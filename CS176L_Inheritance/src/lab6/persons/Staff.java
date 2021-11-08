package lab6.persons;

public class Staff extends Employee {
	private String title;
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString() {
		return super.toString()+"\nTitle: "+this.title;
	}
}
