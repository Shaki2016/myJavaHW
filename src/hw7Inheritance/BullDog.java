package hw7Inheritance;

public class BullDog extends Dog {

	// Example of Single Inheritance
	// Class Mammal inherits from Animal, hence it's an example of Single
	// Inheritance

	// Example of Multilevel Inheritance
	// Class BullDog extends Dog, Dog extends Mammal, and Mammal extends Animal
	// This forms a chain of inheritance, which is Multilevel Inheritance

	// Example of Hierarchical Inheritance
	// Class Mammal, Reptile, and Birds all inherit from Animal, which shows
	// Hierarchical Inheritance

	// BullDog -> Dog -> Mammal -> Animal (Multilevel Inheritance)

	// BullDog is the child class, and Dog is its parent class

	public void bullDogInfo() {

		System.out.println("This method is from BullDog Class");
	}

}
