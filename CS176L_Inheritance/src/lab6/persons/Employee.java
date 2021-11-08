package lab6.persons;

public class Employee extends Person {
	private String officeNumber;
	private double salary;
	
	public void setOfficeNumber(String num) {
		this.officeNumber = num;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return super.toString()+"\nOffice Number: "+this.officeNumber+"\nSalary: $"+String.format("%.2f", this.salary);
	}
}
