package lab2.prob2;

import java.util.ArrayList;

/**
 * PetStore.java: Represents a pet store. Currently contains only Cats.
 *
 */

public class PetStore
{
    // Instance variables:

    // Declare an ArrayList of Cats called cats:
	
	private ArrayList<Cat> cats = new ArrayList<Cat>();
    
    private final int MAXCATS = 10;


    // Methods:

    /**
     * Add a Cat object to the cats ArrayList.
     * Make sure that no more than MAXCATS Cats are in the PetStore.
     * @param Cat object to add to cats
     */
    public void addCat(Cat cat){
    	if (cats.size()<MAXCATS) {
    		cats.add(cat);
    	}
    }

    /**
     * List all Cats in the cats ArrayList.
     * Number the Cats starting from 0. List all of a Cat's data on one line.
     */
    public void listCats(){
    	int i = 0;
    	System.out.println("<=====Cats=====>");
    	for (Cat cat : cats) {
    		System.out.println("Cat #"+i+" <-> "+cat);
    		i++;
    	}
    	if (i == 0) { // There are no cats because i never went up.
    		System.out.println("There are no cats to display.");
    	}
    	System.out.println("<==============>");
    	System.out.println();
    }

    /**
     * Remove a Cat from the cats ArrayList by numeric index.
     * @param int index of Cat to remove
     */
    public void removeCat(int index){
    	cats.remove(index);
    }
    
    public void clearCats() {
    	for (int i=cats.size()-1;i>=0;i--) {
    		cats.remove(i);
    	}
    }

    /**
     * Test the PetStore class methods in main() method below:
     */
    public static void main(String [] args) {
        // Construct a PetStore object mystore.
    	PetStore mystore = new PetStore();

        // Construct and add a number of Cat objects to mystore.
    	mystore.addCat(new Cat("Fred", 1, "Black"));
    	mystore.addCat(new Cat("Frank", 3, "Black and White"));
    	mystore.addCat(new Cat("Bubbles", 1, "Gold"));
    	mystore.addCat(new Cat("Jimmy", 2, "Grey"));
    	
        // List the Cats in mystore.
    	mystore.listCats();

        // Try removing a previously-added Cat from mystore, and then list the Cats again.
    	mystore.removeCat(1);

        // Add a total of 10 Cats to mystore.
    	mystore.listCats();
    	
        // Try to add a 11th Cat to mystore, and note what happens.
    	mystore.addCat(new Cat("Fred", 1, "Black"));
    	mystore.addCat(new Cat("Bubbles", 1, "Gold"));
    	mystore.addCat(new Cat("Bubbles", 1, "Gold"));
    	mystore.addCat(new Cat("Jimmy", 2, "Grey"));
    	mystore.addCat(new Cat("Fred", 1, "Black"));
    	mystore.addCat(new Cat("Frank", 3, "Black and White"));
    	mystore.addCat(new Cat("Bubbles", 1, "Gold"));
    	mystore.addCat(new Cat("Kitty", 5, "Gold"));
    	
        // List the Cats in mystore.
    	mystore.listCats();

        // Clear all the Cats from mystore.
    	mystore.clearCats();

        // List the Cats in mystore.
    	mystore.listCats();

    } // end main()

} // end PetStore 
