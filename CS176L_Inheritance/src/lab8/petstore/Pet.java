/**
 * Pet superclass from which other pet types are derived.
 * @author s1305961
 */

package lab8.petstore;

public class Pet {
   // instance vars
   private String species;
   private int age; // in weeks
   private boolean adoptable;
   
   // constructor
   public Pet(String species, int age, boolean adoptable) {
      setSpecies(species);
      setAge(age);
      setAdoptable(adoptable);
   }


   // methods  
   /**
    * @return the species
    */
   public String getSpecies() {
      return species;
   }

   /**
    * @param species the species to set
    */
   public void setSpecies(String species) {
      this.species = species;
   }

   /**
    * @param age the age to set
    */
   public void setAge(int age) {
      this.age = age;
   }

   /**
    * @param adoptable the adoptable to set
    */
   public void setAdoptable(boolean adoptable) {
      this.adoptable = adoptable;
   }
   
   /**
    * @return String data of Pet
    */
   public String toString() {
      return "Species: " + species + "\n" +
             "Adoptable: " + adoptable + "\n" +
             "Age: " + age + " weeks";
   }
   
}
