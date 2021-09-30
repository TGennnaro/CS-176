package lab2.prob2;

/**
 * Cat.java: A cat class
 *
 */

public class Cat
{
    // Add instance variables for name, age, breed:
	private String name;
	private int age;
	private String breed;

    // Add a constructor that sets the Cat name, age and breed
    /**
    * constructor #1
    * @param name
    * @param age
    * @param breed
    */
	public Cat(String name, int age, String breed) {
		this.name = name;
		this.age = age;
		this.breed = breed;
	}

    // Add 3 methods to return name, age and breed:/
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getBreed() {
		return this.breed;
	}

    // Add the toString method to return all Cat data as one String:
	public String toString() {
		return "Name: "+this.name+" | Age: "+this.age+" | Breed: "+this.breed;
	}

} // end Cat
