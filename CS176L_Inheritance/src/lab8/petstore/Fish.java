/**
 * Fish subclass of Pet
 * @author s1305961
 */

package lab8.petstore;

public class Fish extends Pet {
   // instance vars
   private String type; // "catfish", "goldfish", "shark", etc.
   private String size; // "small", "medium", "large", etc.
   

   /* Complete the code below: */
   
   // constructor (similar to Cat class)
   public Fish(int age, String size, String type, boolean adoptable) {
	   super("Fish", age, adoptable);
	   this.type = type;
	   this.size = size;
   }

   

   // methods (just the toString() method)
   @Override
   public String toString() {
	      return super.toString() + "\n" +
	         "Type: " + this.type + "\n" +
	         "Size: " + this.size;
	}
}
