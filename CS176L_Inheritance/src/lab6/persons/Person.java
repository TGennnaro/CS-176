package lab6.persons;

public class Person {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.getClass()+"\nName: "+this.name;
	}
}
