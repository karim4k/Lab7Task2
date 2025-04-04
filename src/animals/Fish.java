package animals;

public class Fish extends Animal {

    private String waterType; // Type of water the fish lives in (e.g., freshwater, saltwater)

    // Default constructor
    public Fish() {
        super(); // Calls the default constructor of Animal
        this.waterType = "Unknown"; // Default value
    }

    // Parameterized constructor
    public Fish(String name, int age, double weight, String waterType) {
        super(name, age, weight); // Calls the parameterized constructor of Animal
        this.waterType = waterType;
    }

    // Overriding abstract methods from Animal
    @Override
    public void eat() {
        System.out.println("Fish is eating underwater.");
    }

    @Override
    public void getVoice() {
        System.out.println("Fish makes bubble sounds.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Water type: " + waterType;
    }
}
