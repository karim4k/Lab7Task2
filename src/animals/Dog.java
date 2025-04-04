package animals;

public class Dog extends Mammal {

    private String breed;

    // Default constructor
    public Dog() {
        super(); // Calls the default constructor of Mammal
        this.breed = "Unknown"; // Default breed
    }

    // Parameterized constructor
    public Dog(String name, int age, double weight, String furColor, String breed) {
        super(name, age, weight, furColor); // Calls the parameterized constructor of Mammal
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating bones.");
    }

    @Override
    public void getVoice() {
        System.out.println("Dog is barking.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Breed: " + breed;
    }
}