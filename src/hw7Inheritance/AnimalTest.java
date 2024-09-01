package hw7Inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		// Create objects of each class
        Animal animal = new Animal();
        Mammal mammal = new Mammal();
        Reptile reptile = new Reptile();
        Birds birds = new Birds();
        Dog dog = new Dog();
        Snake snake = new Snake();
        Robin robin = new Robin();
        BullDog bullDog = new BullDog();
        Cobra cobra = new Cobra();
        
     // Call their own methods
        animal.animalInfo();
        mammal.mammalInfo();
        reptile.reptileInfo();
        birds.birdsInfo();
        dog.dogInfo();
        snake.snakeInfo();
        robin.robinInfo();
        bullDog.bullDogInfo();
        cobra.cobraInfo();
        
        // Demonstrate inheritance and call parent methods
        bullDog.animalInfo();
        bullDog.mammalInfo();
        bullDog.dogInfo();
        bullDog.bullDogInfo();

        cobra.animalInfo();
        cobra.reptileInfo();
        cobra.snakeInfo();
        cobra.cobraInfo();

        robin.animalInfo();
        robin.birdsInfo();
        robin.robinInfo();

	}

}
